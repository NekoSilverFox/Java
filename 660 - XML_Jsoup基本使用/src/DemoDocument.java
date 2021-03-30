import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/30 19:19
 * @Author : NekoSilverfox
 * @FileName: DemoDocument
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */

public class DemoDocument {
    public static void main(String[] args) throws IOException {
//        String path = DemoDocument.class.getClassLoader().getResource("students.xml").getPath();
        String path = "660 - XML_Jsoup基本使用\\students.xml";

        // 获取Document对象
        Document document = Jsoup.parse(new File(path), "utf-8");

        // 获取元素对象
        Elements elements = document.getElementsByTag("student");
        System.out.println(elements);

        System.out.println("------------------------------------------");

        // 通过属性名获取名为id的元素对象们
        Elements elements1 = document.getElementsByAttribute("id");
        System.out.println(elements1);

        System.out.println("------------------------------------------");

        // 通过元素对象+属性名获取
        Elements elements2 = document.getElementsByAttributeValue("number", "STU0001");
        System.out.println(elements2);

        System.out.println("------------------------------------------");

        // 直接通过属性值获取元素，得到的是 Element 没有S
        Element elementById = document.getElementById("NekoSilverfox");
        System.out.println(elementById);

    }
}
