import java.io.File;
import java.util.Locale;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/27 17:59
 * @Author : NekoSilverfox
 * @FileName: DemoFileSearch
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */

public class DemoFileSearch {
    public static void main(String[] args) {
        // 搜索以java为结尾的文件
        File path = new File("C:\\Users\\mi\\Desktop\\Programma\\Java");
        search(path, ".java");
    }

    public static void search(File path, String end_str) {
        File[] files = path.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                search(f, end_str);
            } else {
                if (f.getName().toLowerCase(Locale.ROOT).endsWith(end_str)) {
                    System.out.println(f.getName());
                }
            }
        }
    }
}
