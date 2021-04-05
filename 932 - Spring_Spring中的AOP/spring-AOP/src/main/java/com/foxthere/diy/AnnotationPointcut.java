/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/5 23:32
 * @Author : NekoSilverfox
 * @FileName: AnnotationPointcut
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
package com.foxthere.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

// 方式三：注解来实现AOP
@Aspect  // 标注这个类是一个切面
public class AnnotationPointcut {
    @Before("execution(* com.foxthere.service.UserServiceImpl.*(..))")  // 注解的内容是切入点
    public void before() {
        System.out.println("================== 【注解】方法执行前 ==================");
    }

    @After("execution(* com.foxthere.service.UserServiceImpl.*(..))")  // 注解的内容是切入点
    public void after() {
        System.out.println("================== 【注解】方法执行后 ==================");
    }

    // 在环绕增强中，我们可以给定一个参数，代表我们要获取处理切入的点
    @Around("execution(* com.foxthere.service.UserServiceImpl.*(..))")  // 注解的内容是切入点
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("================== 【注解】环绕前 ==================");

        // 获得签名
        Signature signature = joinPoint.getSignature();
        System.out.println("signature: " + signature);

        // 执行方法
        Object proceed = joinPoint.proceed();
        System.out.println("proceed: " + proceed);

        System.out.println("================== 【注解】环绕后 ==================");
    }
}

