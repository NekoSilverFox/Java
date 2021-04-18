/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/18 14:14
 * @Author : NekoSilverfox
 * @FileName: Main
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
package com.foxthere.Commod;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        ShowCmd cmd = context.getBean("cmd", ShowCmd.class);
        cmd.showCmd();
    }
}
