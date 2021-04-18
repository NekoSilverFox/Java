/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/18 13:50
 * @Author : NekoSilverfox
 * @FileName: LinuxCondition
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
package com.foxthere.Commod;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Locale;

public class LinuxCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        String property = conditionContext.getEnvironment().getProperty("os.name");
        return property.toLowerCase(Locale.ROOT).contains("linux");

    }
}
