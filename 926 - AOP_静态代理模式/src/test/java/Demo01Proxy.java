import com.foxthere.demo01.Master;
import com.foxthere.demo01.Proxy;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/5 13:57
 * @Author : NekoSilverfox
 * @FileName: Demo01Proxy
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */

public class Demo01Proxy {
    public static void main(String[] args) {
        Master master = new Master();
        Proxy proxy = new Proxy(master);

        proxy.Rent();
    }
}
