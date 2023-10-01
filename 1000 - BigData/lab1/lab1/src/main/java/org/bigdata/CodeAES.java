/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2023/9/20 15:13
 * @Author : NekoSilverfox
 * @FileName: CodeAES
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
package org.bigdata;

import java.security.Key;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import static org.bigdata.Config.AES_KAY;

public class CodeAES {
    /**
     * обфускирования данных с помощью AES
     *
     * @param value
     * @return
     * @throws Exception
     */
    static String obfuscate(String value) throws Exception {
        Key aesKey = new SecretKeySpec(AES_KAY.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, aesKey);

        byte[] encrypted = cipher.doFinal(value.getBytes());
        String result = Base64.getEncoder().withoutPadding().encodeToString(encrypted);  // 翻译为 base64

        return result;
    }

    /**
     * де-обфускирования данных
     *
     * @param value
     * @return
     * @throws Exception
     */
    static String deobfuscate(String value) throws Exception {
        Key aesKey = new SecretKeySpec(AES_KAY.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, aesKey);
        return new String(cipher.doFinal(Base64.getDecoder().decode(value)));
    }
}
