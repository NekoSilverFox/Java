import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.foxthere.Ship;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/10 15:02
 * @Author : NekoSilverfox
 * @FileName: DemoJsonReader
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */

public class DemoJsonReader {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("661 - Json_利用Jackson将ArrayList序列化和反序列化\\ships.json");

        int len = 0;
        char[] chars = new char[1024];
        StringBuffer stringBuffer = new StringBuffer();
        while ((len = fileReader.read(chars)) != -1) {
            stringBuffer.append(new String(chars, 0, len));
        }

        System.out.println("读取到的字符串：" + stringBuffer.toString());

        ObjectMapper mapper = new ObjectMapper();
        ArrayList<Ship> shipArrayList = mapper.readValue(stringBuffer.toString(), new TypeReference<ArrayList<Ship>>() {
        });

        for (Ship ship : shipArrayList) {
            System.out.println(ship);
        }
    }
}
