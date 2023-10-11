/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2023/9/20 15:13
 * @Author : NekoSilverfox
 * @FileName: Encrypt
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
package org.bigdata;

import org.jetbrains.annotations.NotNull;

public class Encrypt {
    public static String obfuscate(@NotNull String s) {
        StringBuilder result = new StringBuilder(10);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int index = Config.SOURCE.indexOf(c);
            result.append(Config.TARGET.charAt(index));
        }
        return result.toString();
    }

    public static String unobfuscate(@NotNull String s) {
        StringBuilder result = new StringBuilder(10);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int index = Config.TARGET.indexOf(c);
            result.append(Config.SOURCE.charAt(index));
        }
        return result.toString();
    }

}
