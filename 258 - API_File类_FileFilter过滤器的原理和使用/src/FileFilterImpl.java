import java.io.File;
import java.io.FileFilter;
import java.util.Locale;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/27 18:39
 * @Author : NekoSilverfox
 * @FileName: FileFilterImpl
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
/*
    创建过滤器FileFilter的实现类,重写过滤方法accept,定义过滤规则
 */
public class FileFilterImpl implements FileFilter {
    /*
        过滤的规则:
        在accept方法中,判断File对象是否是以.java结尾
        是就返回true
        不是就返回false
    */
    @Override
    public boolean accept(File pathname) {
        // 如果pathname是一个文件夹,返回true,继续遍历这个文件夹
        if (pathname.isDirectory()) {
            return true;
        }
        return pathname.getName().toLowerCase(Locale.ROOT).endsWith(".java");
    }
}
