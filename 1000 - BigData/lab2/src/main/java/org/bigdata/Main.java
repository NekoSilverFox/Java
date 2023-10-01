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

package org.digdata;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

import java.io.FileInputStream;
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

        X509Certificate certificate = (X509Certificate) certFactory.generateCertificate(new FileInputStream(certificatePath));

        /*  */
    }
}