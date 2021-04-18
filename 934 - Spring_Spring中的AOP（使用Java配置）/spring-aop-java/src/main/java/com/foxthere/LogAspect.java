/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/18 18:46
 * @Author : NekoSilverfox
 * @FileName: LogAspect
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
package com.foxthere;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect  // 定义这是一个切面
public class LogAspect {
    /**
     * 前置通知，在目标方法执行前执行
     * @param joinPoint
     */
    @Before(value = "@annotation(Action)")
    public void before(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        System.out.println(name + "方法开始执行了。。。");
    }

    /**
     * 后置通知，在目标方法执行后执行
     * @param joinPoint
     */
    @After(value = "@annotation(Action)")
    public void after(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        System.out.println(name + "方法开始结束了。。。");
    }

    /**
     * 返回通知，可以在该方法中获得目标方法的返回值
     * 只有返回值才有返回通知，并且要和下面的参数类型匹配
     * 如果使用 Object 接受，则收到 null
     * @param joinPoint
     * @param r 函数的返回值
     */
    @AfterReturning(value = "@annotation(Action)", returning = "r")
    public void returning(JoinPoint joinPoint, Integer r) {
        String name = joinPoint.getSignature().getName();
        System.out.println(name + " 返回通知：" + r);
    }

    /**
     * 异常通知，当目标方法抛出异常时触发该通知
     * @param joinPoint
     * @param e 异常参数，和方法分参数名一一对应，注意异常的类型
     */
    @AfterThrowing(value = "@annotation(Action)", throwing = "e")
    public void afterThrowing(JoinPoint joinPoint, Exception e) {
        String name = joinPoint.getSignature().getName();
        System.out.println(name + " 触发了异常。。" + e.getMessage());
    }


    /**
     * 环绕通知，环绕通知是上面四种通知的集大成者，环绕通知的核心类似于反射中方法执行
     * @param proceedingJoinPoint
     * @return
     */
    @Around("@annotation(Action)")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("====================================== 环绕通知");

        // 有点类似于 method.invoke，我们可以在这个方法前后添加日志，相当于前置、后置通知
        Object proceed = proceedingJoinPoint.proceed();
        return proceed;

    }


}
