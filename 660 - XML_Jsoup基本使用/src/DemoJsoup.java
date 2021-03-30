import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/30 13:43
 * @Author : NekoSilverfox
 * @FileName: DemoJsoup
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */

public class DemoJsoup {
    public static void main(String[] args) throws IOException {
        // 获取Documents对象，根据xml获取
        // 获取students.xml的path
//        String path = DemoJsoup.class.getClassLoader().getResource("660 - XML_Jsoup基本使用\\students.xml").getPath();
        String path = "660 - XML_Jsoup基本使用\\students.xml";

        // 解析xml文档，加载进内存，获取dom树 --> Document
        // Document：文本对象。代表内存中的dom树
        // Jsoup：工具类，可以解析html或者xml文档，返回Document
        //                        parse 解析html或者xml文档，返回Document
        //                        parse (String html) 解析HTML或xml字符串
        //                        parse (URL url, int timeoutMillis) 通过网络路径获取指定 HTML 或xml的文档对象
        Document document = Jsoup.parse(new File(path), "utf-8");

        // 获取元素对象 Element，Elements本质是一个ArrayList<org.jsoup.nodes.Element>
        Elements elements = document.getElementsByTag("name");

        System.out.println(elements.size());  // 2

        // Element：元素对象；获取第一个name的Element对象
        Element element = elements.get(0);  // 其实就是从ArrayList中获取

        // 获取数据
        String name = element.text();
        System.out.println(name);  // 冰糖雪狸

        // 获取Elements中的第二个name
        System.out.println(elements.get(1).text());  // RedFox
    }
}
