import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.foxthere.Person;

import java.io.File;
import java.io.FileWriter;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/8 20:51
 * @Author : NekoSilverfox
 * @FileName: Demo01Jackson
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */

public class Demo01Jackson {
    public static void main(String[] args) throws Exception {
        // 1. 创建Person对象
        Person person = new Person("冰糖雪狸", 17, "M");

        // 2. 创建Jackson的核心对象 ObjectMapper
        ObjectMapper objectMapper = new ObjectMapper();

        /** 转换
         * 转换方法：
         *     writeValue(参数1，obj):
         *         参数1：
         *             File：将obj对象转换为JSON字符串，并保存到指定的文件中
         *             Writer：将obj对象转换为JSON字符串，并将json数据填充到字符输出流中
         *             OutputStream：将obj对象转换为JSON字符串，并将json数据填充到字节输出流中
         *     writeValueAsString(obj):将对象转为json字符串
         */
        String str_json = objectMapper.writeValueAsString(person);  // 返回被写入的字符串
        System.out.println(str_json);  // {"name":"冰糖雪狸","age":17,"sex":"M"}

        // writeValue，将数据写到文件
//        objectMapper.writeValue(new File("950 - Json_Jackson的简单使用\\info.json"), person);

        // writeValue.将数据关联到Writer中
        objectMapper.writeValue(new FileWriter("950 - Json_Jackson的简单使用\\info.json"), person);
    }
}
