import com.foxthere.Master;
import com.foxthere.Proxy;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/5 13:57
 * @Author : NekoSilverfox
 * @FileName: DemoProxy
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */

public class DemoProxy {
    public static void main(String[] args) {
        Master master = new Master();
        Proxy proxy = new Proxy(master);

        proxy.Rent();
    }
}
