import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.foxthere.Person;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/8 21:49
 * @Author : NekoSilverfox
 * @FileName: Demo02ReadJackson
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */

public class Demo02ReadJackson {
    public static void main(String[] args) throws IOException, NoSuchFieldException {
        // 这里是从问价流中读取，所以先创建一个文件的读取对象
        FileReader fileReader = new FileReader("660 - Json_Jackson的简单使用\\info.json");

        int len = 0;
        StringBuilder readMap = new StringBuilder(); // 使用 StringBuilder 保存读取的字符串
        while ((len = fileReader.read()) != -1) {
            readMap.append((char) len);
        }
        System.out.println(readMap);
        System.out.println("======================================");

        // 2. 创建ObjectMapper对象
        ObjectMapper mapper = new ObjectMapper();

        // 3.转换为Java对象为存Person对象的Map（Map比较麻烦，其他类型直接传.class就好，Person.class）
        // 【重点】如果是自定义类型，必须使用 Object 接受然后再进行强转！！！！！
        HashMap<Integer, Object> personHashMap = mapper.readValue(readMap.toString(), new TypeReference<HashMap<Integer, Object>>() {});
//        HashMap<Integer, Object> personHashMap = mapper.convertValue(readMap.toString(), new TypeReference<HashMap<Integer, Object>>() {});  ERROR

        // 遍历 HaspMap
        Set<Integer> set = personHashMap.keySet();
        for (Integer key : set) {
            Object value =  personHashMap.get(key);

            // 【重点】 一个鬼操作，转过去再转回来就好了。可想而知，效率应该很低 :(
            String tmp = mapper.writeValueAsString(value);
            Person person = mapper.readValue(tmp, Person.class);

//            System.out.println(value.getClass());
            System.out.println(key + "=" + person);
        }


    }
}
