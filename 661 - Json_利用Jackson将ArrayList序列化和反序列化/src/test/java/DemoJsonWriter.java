import com.fasterxml.jackson.databind.ObjectMapper;
import com.foxthere.Ship;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/10 14:58
 * @Author : NekoSilverfox
 * @FileName: DemoJsonWriter
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */

public class DemoJsonWriter {
    public static void main(String[] args) throws IOException {
        Ship s1 = new Ship("China Post", 1200);
        Ship s2 = new Ship("Russia Post", 1200);

        ArrayList<Ship> shipArrayList = new ArrayList<>();
        shipArrayList.add(s1);
        shipArrayList.add(s2);

        ObjectMapper mapper = new ObjectMapper();

        mapper.writeValue(new FileWriter("661 - Json_利用Jackson将ArrayList序列化和反序列化\\ships.json"), shipArrayList);
    }
}
