/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/30 23:20
 * @Author : NekoSilverfox
 * @FileName: DemoElement
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/**
 *Element对象功能
 */
public class DemoElement {
    public static void main(String[] args) throws IOException {
        // 1.获取student.xml的path
        String path = "660 - XML_Jsoup基本使用\\students.xml";

        //2.获取Document对象
        Document document = Jsoup.parse(new File(path), "UTF-8");

        /*
        Element：元素对象
				1. 获取子元素对象
					* getElementById​(String id)：根据id属性值获取唯一的element对象
					* getElementsByTag​(String tagName)：根据标签名称获取元素对象集合
					* getElementsByAttribute​(String key)：根据属性名称获取元素对象集合
					* getElementsByAttributeValue​(String key, String value)：根据对应的属性名和属性值获取元素对象集合

				2. 获取属性值
					* String attr(String key)：根据属性名称获取属性值
				3. 获取文本内容
					* String text():获取所有字标签的纯文本内容
					* String html():获取标签体的所有内容(包括子标签的标签和文本内容)
         */
        // 通过Document对象获取name标签，获取所有的name标签，可以获取到两个
        Elements elements = document.getElementsByTag("name");
        System.out.println(elements.size());  // 2

        System.out.println("----------------");

        // 通过Element对象获取子标签对象
        Element ele_student = document.getElementsByTag("student").get(0);
        Elements eles_name = ele_student.getElementsByTag("name");
        System.out.println(ele_student);
        System.out.println(eles_name);
        System.out.println(eles_name.size());  // 1

        System.out.println("----------------");

        // 获取student对象的属性值
        String number = ele_student.attr("number");
        System.out.println(number);  // STU0001

        System.out.println("----------------");

        // 获取文本内容
        String text = eles_name.text();
        String html = eles_name.html();
        System.out.println(text);
        System.out.println(html);
    }
}
