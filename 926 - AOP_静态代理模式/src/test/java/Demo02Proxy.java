import com.foxthere.demo02.UserServiceImpl;
import com.foxthere.demo02.UserServiceProxy;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/5 14:24
 * @Author : NekoSilverfox
 * @FileName: Demo02Proxy
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */

public class Demo02Proxy {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        UserServiceProxy userServiceProxy = new UserServiceProxy(userService);

        userServiceProxy.add();
        userServiceProxy.delete();
        userServiceProxy.update();
        userServiceProxy.query();
    }
}
