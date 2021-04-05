import com.foxthere.ProxyInvocationHandler;
import com.foxthere.UserService;
import com.foxthere.UserServiceImpl;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/5 16:41
 * @Author : NekoSilverfox
 * @FileName: Demo03ProxyInvocationHandler
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */

public class Demo03ProxyInvocationHandler {
    public static void main(String[] args) {
        // 真实角色
        UserServiceImpl userService = new UserServiceImpl();

        // 代理角色（不存在）
        ProxyInvocationHandler invocationHandler = new ProxyInvocationHandler();

        // 设置要代理对象
        invocationHandler.setTarget(userService);

        // 动态生成代理类
        UserService proxy = (UserService) invocationHandler.getProxy();

        proxy.add();
    }
}
