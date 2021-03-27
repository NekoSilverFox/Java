import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Locale;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/27 20:32
 * @Author : NekoSilverfox
 * @FileName: DemoFileFilterLambda
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */

public class DemoFileFilterLambda {
    public static void main(String[] args) {
        File path = new File("C:\\Users\\mi\\Desktop\\Programma\\Java");
        foreachFiles(path);
    }

    public static void foreachFiles(File path) {
//        File[] files = path.listFiles(new FileFilter() {  // 使用匿名内部类
//            @Override
//            public boolean accept(File pathname) {
//                return pathname.isDirectory() || pathname.getName().toLowerCase(Locale.ROOT).endsWith(".java");
//            }
//        });  // 【注意】传递过滤器对象，如果过滤器返回true才会把path写入到数组中
        File[] files = path.listFiles((pathname -> pathname.isDirectory() || pathname.getName().toLowerCase(Locale.ROOT).endsWith(".java")));


//        File[] files = path.listFiles(new FilenameFilter() {  // 使用FilenameFilter的内名内部类
//            @Override
//            public boolean accept(File dir, String name) {
//                return new File(dir, name).isDirectory() || name.toLowerCase(Locale.ROOT).endsWith(".java");
//            }
//        });

        // 使用Lambda
//        File[] files = path.listFiles((File dir, String name)->{
//            return new File(dir, name).isDirectory() || name.toLowerCase(Locale.ROOT).endsWith(".java");
//        });

        // 使用优化的Lambda
//        File[] files = path.listFiles((File dir, String name)->new File(dir, name).isDirectory() || name.toLowerCase(Locale.ROOT).endsWith(".java"));

        for (File f : files) {
            if (f.isDirectory()) {
                foreachFiles(f);
            } else {
                System.out.println(f.getName());
            }
        }
    }
}
