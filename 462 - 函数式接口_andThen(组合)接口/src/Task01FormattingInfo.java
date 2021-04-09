import java.util.function.Consumer;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/10 0:14
 * @Author : NekoSilverfox
 * @FileName: Task01FormattingInfo
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
/*
    下面的字符串数组当中存有多条信息，请按照格式“ 姓名：XX。性别：XX。”的格式将信息打印出来。要求将打印姓
    名的动作作为第一个Consumer 接口的Lambda实例，将打印性别的动作作为第二个Consumer 接口的Lambda实
    例，将两个Consumer 接口按照顺序“拼接”到一起。
 */
public class Task01FormattingInfo {

    public static void method(String[] str, Consumer<String> con1, Consumer<String> con2) {
        for (String info : str) {
            con1.andThen(con2).accept(info);
        }
    }

    public static void main(String[] args) {
        String[] array = { "迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男" };

        method(array,
                s -> System.out.print  ("姓名：" + s.split(",")[0] + "。"),
                s -> System.out.println("性别：" + s.split(",")[1] + "。")
        );
    }
}
