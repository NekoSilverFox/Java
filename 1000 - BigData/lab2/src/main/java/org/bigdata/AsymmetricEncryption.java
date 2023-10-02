/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2023/10/1 20:51
 * @Author : NekoSilverfox
 * @FileName: AsymmetricEncryption
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
package org.bigdata;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.PrivateKey;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cert.jcajce.JcaCertStore;
import org.bouncycastle.cms.CMSAlgorithm;
import org.bouncycastle.cms.CMSEnvelopedData;
import org.bouncycastle.cms.CMSEnvelopedDataGenerator;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.cms.CMSProcessableByteArray;
import org.bouncycastle.cms.CMSSignedData;
import org.bouncycastle.cms.CMSSignedDataGenerator;
import org.bouncycastle.cms.CMSTypedData;
import org.bouncycastle.cms.KeyTransRecipientInformation;
import org.bouncycastle.cms.RecipientInformation;
import org.bouncycastle.cms.SignerInformation;
import org.bouncycastle.cms.SignerInformationStore;
import org.bouncycastle.cms.jcajce.JcaSignerInfoGeneratorBuilder;
import org.bouncycastle.cms.jcajce.JcaSimpleSignerInfoVerifierBuilder;
import org.bouncycastle.cms.jcajce.JceCMSContentEncryptorBuilder;
import org.bouncycastle.cms.jcajce.JceKeyTransEnvelopedRecipient;
import org.bouncycastle.cms.jcajce.JceKeyTransRecipient;
import org.bouncycastle.cms.jcajce.JceKeyTransRecipientInfoGenerator;
import org.bouncycastle.operator.ContentSigner;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.operator.OutputEncryptor;
import org.bouncycastle.operator.jcajce.JcaContentSignerBuilder;
import org.bouncycastle.operator.jcajce.JcaDigestCalculatorProviderBuilder;
import org.bouncycastle.util.Store;

/**
 * асимметричное шифрование
 */
public class AsymmetricEncryption {

    /**
     * реализовать функцию encryptData(), используя сертификат шифрования
     * @param data
     * @param encryptionCertificate
     * @return
     * @throws CertificateEncodingException
     * @throws CMSException
     * @throws IOException
     */
    public static byte[] encryptData(final byte[] data, X509Certificate encryptionCertificate)
            throws CertificateEncodingException, CMSException, IOException {
        byte[] encryptedData = null;
        if (null != data && null != encryptionCertificate) {
            CMSEnvelopedDataGenerator cmsEnvelopedDataGenerator = new CMSEnvelopedDataGenerator();
            JceKeyTransRecipientInfoGenerator jceKey = new JceKeyTransRecipientInfoGenerator(encryptionCertificate);
            cmsEnvelopedDataGenerator.addRecipientInfoGenerator(jceKey);

            /* добавили в него генератор информации о получателях */
            CMSTypedData msg = new CMSProcessableByteArray(data);

            /* OutputEncryptor инкапсулирует зашифрованное сообщение */
            OutputEncryptor encryptor = new JceCMSContentEncryptorBuilder(CMSAlgorithm.AES128_CBC).setProvider("BC").build();
            CMSEnvelopedData cmsEnvelopedData = cmsEnvelopedDataGenerator.generate(msg, encryptor);

            /* закодированное представление данных возвращается как байтовый массив */
            encryptedData = cmsEnvelopedData.getEncoded();
        }
        return encryptedData;
    }

    /**
     * дешифрованный плотный текст
     * @param encryptedData
     * @param decryptionKey
     * @return
     * @throws CMSException
     */
    public static byte[] decryptData(final byte[] encryptedData, final PrivateKey decryptionKey) throws CMSException {
        byte[] decryptedData = null;
        if (null != encryptedData && null != decryptionKey) {
            CMSEnvelopedData envelopedData = new CMSEnvelopedData(encryptedData);

            /* извлекли всех предполагаемых получателей сообщения с помощью метода getRecipients() */
            Collection<RecipientInformation> recip = envelopedData.getRecipientInfos().getRecipients();
            KeyTransRecipientInformation recipientInfo = (KeyTransRecipientInformation) recip.iterator().next();

            /* связанный с **закрытым** ключом получателя */
            JceKeyTransRecipient recipient = new JceKeyTransEnvelopedRecipient(decryptionKey);

            decryptedData = recipientInfo.getContent(recipient);
        }
        return decryptedData;
    }

    /**
     * подписать секретное сообщение с помощью цифрового сертификата
     * @param data
     * @param signingCertificate
     * @param signingKey
     * @return объекта подписанных данных CMS, который содержит подпись CMS.
     * @throws CertificateEncodingException
     * @throws OperatorCreationException
     * @throws CMSException
     * @throws IOException
     */
    public static byte[] signData(byte[] data, final X509Certificate signingCertificate, final PrivateKey signingKey)
            throws CertificateEncodingException, OperatorCreationException, CMSException, IOException {
        /* встроили входные данные в CMSTypedData */
        byte[] signedMessage = null;
        List<X509Certificate> certList = new ArrayList<X509Certificate>();
        CMSTypedData cmsData = new CMSProcessableByteArray(data);
        certList.add(signingCertificate);
        Store certs = new JcaCertStore(certList);

        /* использовали SHA256withRSA в качестве алгоритма подписи и наш ключ для создания нового объекта ContentSigner */
        CMSSignedDataGenerator cmsGenerator = new CMSSignedDataGenerator();
        ContentSigner contentSigner = new JcaContentSignerBuilder("SHA256withRSA").build(signingKey);
        cmsGenerator.addSignerInfoGenerator(new JcaSignerInfoGeneratorBuilder(new JcaDigestCalculatorProviderBuilder().setProvider("BC").build()).build(contentSigner, signingCertificate));
        cmsGenerator.addCertificates(certs);
        CMSSignedData cms = cmsGenerator.generate(cmsData, true);

        /* generate() для создания объекта подписанных данных CMS, который также содержит подпись CMS */
        signedMessage = cms.getEncoded();
        return signedMessage;
    }

    /**
     * верифицировать
     * @param signedData
     * @return
     * @throws CMSException
     * @throws IOException
     * @throws OperatorCreationException
     * @throws CertificateException
     */
    public static boolean verifSignData(final byte[] signedData)
            throws CMSException, IOException, OperatorCreationException, CertificateException {
        ByteArrayInputStream inputStream = new ByteArrayInputStream(signedData);
        ASN1InputStream asnInputStream = new ASN1InputStream(inputStream);

        /* создали объект CMSSignedData на основе нашего байтового массива подписанных данных */
        CMSSignedData s = new CMSSignedData(ContentInfo.getInstance(asnInputStream.readObject()));
        asnInputStream.close();
        inputStream.close();

        Store certs = s.getCertificates();
        SignerInformationStore signers = s.getSignerInfos();
        Collection<SignerInformation> c = signers.getSigners();
        SignerInformation signer = c.iterator().next();
        Collection<X509CertificateHolder> certCollection = certs.getMatches(signer.getSID());
        Iterator<X509CertificateHolder> certIt = certCollection.iterator();
        X509CertificateHolder certHolder = certIt.next();
        boolean verifResult = signer.verify(new JcaSimpleSignerInfoVerifierBuilder().build(certHolder));
        if (!verifResult) {
            return false;
        }
        return true;
    }


}
