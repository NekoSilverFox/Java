import com.foxthere.Master;
import com.foxthere.ProxyInvocationHandler;
import com.foxthere.Rent;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/5 15:27
 * @Author : NekoSilverfox
 * @FileName: DemoProxy
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
// 928 - AOP_动态代理模式
public class DemoProxy {
    public static void main(String[] args) {
        // 真实角色
        Master master = new Master();

        // 代理角色
        ProxyInvocationHandler invocationHandler = new ProxyInvocationHandler();

        // 通过代理程序处理角色来处理我们要调用的接口对象
        invocationHandler.setRent(master);

        // 得到代理对象
        Rent proxy = (Rent) invocationHandler.getProxy();  // 这里的 Proxy 就是动态生成的，我们并没有去写他
        proxy.rent();
    }
}
