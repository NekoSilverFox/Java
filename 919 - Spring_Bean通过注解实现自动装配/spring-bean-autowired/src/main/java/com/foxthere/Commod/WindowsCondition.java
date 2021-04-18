/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/18 13:53
 * @Author : NekoSilverfox
 * @FileName: WindowsCondition
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
package com.foxthere.Commod;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Locale;

public class WindowsCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        String property = conditionContext.getEnvironment().getProperty("os.name");
        return property.toLowerCase(Locale.ROOT).contains("win");

    }
}
