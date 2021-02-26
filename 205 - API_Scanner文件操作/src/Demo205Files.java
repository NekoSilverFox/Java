// 205 - API_Scanner文件操作

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class Demo205Files {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        // 写入文件，构造一个PrintWriter对象
        PrintWriter fileOut = new PrintWriter("myFile.txt", String.valueOf(StandardCharsets.UTF_8));

        fileOut.println("123");
        fileOut.println(321);;

    }
}
