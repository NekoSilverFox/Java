import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.foxthere.Person;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

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
        jsonMap();
    }

    public static void test01() throws Exception{
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

    public static void test02() throws JsonProcessingException {
        // 1. 创建Person对象
        Person person = new Person("冰糖雪狸", 17, "M");
        person.setBirthday(new Date());

        // 2. 创建Jackson的核心对象 ObjectMapper
        ObjectMapper objectMapper = new ObjectMapper();
        String str_person = objectMapper.writeValueAsString(person);
        System.out.println(str_person);

    }

    public static void jsonArrayList() throws JsonProcessingException {
        // 1. 创建Person对象
        Person person1 = new Person("冰糖雪狸1", 17, "M");
        Person person2 = new Person("冰糖雪狸2", 17, "M");
        Person person3 = new Person("冰糖雪狸3", 17, "M");
        person1.setBirthday(new Date());
        person2.setBirthday(new Date());
        person3.setBirthday(new Date());

        ArrayList<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);

        // 2. 创建Jackson的核心对象 ObjectMapper
        ObjectMapper objectMapper = new ObjectMapper();
        String str_person = objectMapper.writeValueAsString(people);
        System.out.println(str_person);

    }

    public static void jsonMap() throws JsonProcessingException {
        Person person1 = new Person("冰糖雪狸1", 17, "M");
        Person person2 = new Person("冰糖雪狸2", 17, "M");
        Person person3 = new Person("冰糖雪狸3", 17, "M");
        person1.setBirthday(new Date());
        person2.setBirthday(new Date());
        person3.setBirthday(new Date());

        // 1. 创建Map对象
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, person1);
        map.put(2, person2);
        map.put(3, person3);


        // 2. 创建Jackson的核心对象 ObjectMapper
        ObjectMapper objectMapper = new ObjectMapper();
        String str_map = objectMapper.writeValueAsString(map);
        System.out.println(str_map);

    }
}
