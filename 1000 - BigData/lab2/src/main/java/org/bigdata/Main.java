/**
 * -*- coding: utf-8 -*-
 * lab2 - BouncyCastle
 * @Time : 2023/10/1 19:08
 * @Author : NekoSilverfox
 * @FileName: Main
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */

package org.bigdata;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

import java.io.FileInputStream;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.Security;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

public class Main {
    public static void main(String[] args) throws Exception {
        /* установить для свойства crypto.policy значение unlimited */
        Security.setProperty("crypto.policy", "unlimited");
        int maxKeySize = javax.crypto.Cipher.getMaxAllowedKeyLength("AES");
        System.out.println("Max Key Size for AES : " + maxKeySize);

        /* загружены сертификат и закрытый ключ */
        Security.addProvider(new BouncyCastleProvider());
        CertificateFactory certFactory = CertificateFactory.getInstance("X.509", "BC");
        X509Certificate certificate = (X509Certificate) certFactory.generateCertificate(new FileInputStream(Config.PATH_CER));
        KeyStore keystore = KeyStore.getInstance("PKCS12");
        keystore.load(new FileInputStream(Config.PATH_PRIV_KEY), Config.PWD_P12);
        PrivateKey privateKey = (PrivateKey) keystore.getKey("baeldung", Config.PWD_KEY);

        /* Шифрование */
        String secretMessage = "Hello from lab2 test msg";
        System.out.println("Original Message : " + secretMessage);

        byte[] stringToEncrypt = secretMessage.getBytes();
        byte[] encryptedData = AsymmetricEncryption.encryptData(stringToEncrypt, certificate);
        System.out.println("\nEncrypted Message : ");
        System.out.println(new String(encryptedData));

        /* дешифрование */
        byte[] rawData = AsymmetricEncryption.decryptData(encryptedData, privateKey);
        String decryptedMessage = new String(rawData);
        System.out.println("\nDecrypted Message : " + decryptedMessage);

        //Верификация
        System.out.print("\n====================================\nVerification check : ");
        byte[] signedData = AsymmetricEncryption.signData(rawData, certificate, privateKey);
        Boolean check = AsymmetricEncryption.verifSignData(signedData);
        if (check)
            System.out.println("Successful");
        else
            System.out.println("Failed");
    }
}