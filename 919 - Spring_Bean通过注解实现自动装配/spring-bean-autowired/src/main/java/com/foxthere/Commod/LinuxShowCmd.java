/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/18 13:49
 * @Author : NekoSilverfox
 * @FileName: LinuxShowCmd
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
package com.foxthere.Commod;

public class LinuxShowCmd implements ShowCmd{
    @Override
    public void showCmd() {
        System.out.println("Linux-ls");
    }
}
