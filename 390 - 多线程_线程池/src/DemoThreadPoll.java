import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/26 15:49
 * @Author : NekoSilverfox
 * @FileName: DemoThreadPoll
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 * <p>
 * 390 - 多线程_线程池
 */

/*
    线程池:JDK1.5之后提供的
    java.util.concurrent.Executors:线程池的工厂类,用来生成线程池
    Executors类中的静态方法:
        static ExecutorService newFixedThreadPool(int nThreads) 创建一个可重用固定线程数的线程池
        参数:
            int nThreads:创建线程池中包含的线程数量
        返回值:
            ExecutorService接口,返回的是ExecutorService接口的实现类对象,我们可以使用ExecutorService接口接收(面向接口编程)
    java.util.concurrent.ExecutorService:线程池接口
        用来从线程池中获取线程,调用start方法,执行线程任务
            submit(Runnable task) 提交一个 Runnable 任务用于执行
        关闭/销毁线程池的方法
            void shutdown()
    线程池的使用步骤:
        1.使用线程池的工厂类Executors里边提供的静态方法newFixedThreadPool生产一个指定线程数量的线程池
        2.创建一个类,实现Runnable接口,重写run方法,设置线程任务
        3.调用ExecutorService中的方法submit,传递线程任务(实现类),开启线程,执行run方法
        4.调用ExecutorService中的方法shutdown销毁线程池(不建议执行)
 */
public class DemoThreadPoll {
    public static void main(String[] args) {
        //【重点】 1.使用线程池的工厂类Executors里边提供的静态方法newFixedThreadPool生产一个指定线程数量的线程池
        /**
         * 线程池不允许使用Executors去创建，而是通过ThreadPoolExecutor的方式，这样的处理方式让写的同学更加明确线程池的运行规则，规避资源耗尽的风险。 说明：Executors返回的线程池对象的弊端如下：
         * 1）FixedThreadPool和SingleThreadPool:
         *   允许的请求队列长度为Integer.MAX_VALUE，可能会堆积大量的请求，从而导致OOM。
         * 2）CachedThreadPool:
         *   允许的创建线程数量为Integer.MAX_VALUE，可能会创建大量的线程，从而导致OOM。
         */
        ExecutorService es = Executors.newFixedThreadPool(2);

        // 3.调用ExecutorService中的方法submit,传递线程任务(实现类),开启线程,执行run方法
        es.submit(new RunnableImpl());  // pool-1-thread-2 线程正在执行 ==> 创建了一个新的线程执行
        //【重点】线程池会一直开启,使用完了线程,会自动把线程归还给线程池,线程可以继续使用
        es.submit(new RunnableImpl());  // pool-1-thread-1 线程正在执行 ==> 创建了一个新的线程执行
        es.submit(new RunnableImpl());  // pool-1-thread-1 线程正在执行 ==> 创建了一个新的线程执行

        // 4.调用ExecutorService中的方法shutdown销毁线程池(不建议执行)
        es.shutdown();

        es.submit(new RunnableImpl());  // 抛异常,线程池都没有了,就不能获取线程了
    }
}
