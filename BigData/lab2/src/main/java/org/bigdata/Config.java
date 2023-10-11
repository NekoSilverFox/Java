/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2023/10/1 19:48
 * @Author : NekoSilverfox
 * @FileName: Config
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
package org.bigdata;

public class Config {
    /* цифровой сертификат, который использует международный стандарт инфраструктуры открытых ключей X.509 */
    public static final String PATH_CER = "resource/public.cer";

    /* защищенное паролем хранилище ключей PKCS12, которое содержит закрытый клю */
    public static final String PATH_PRIV_KEY = "resource/private.p12";

    public static final char[] PWD_P12 = "password".toCharArray();
    public static final char[] PWD_KEY = "password".toCharArray();
}
