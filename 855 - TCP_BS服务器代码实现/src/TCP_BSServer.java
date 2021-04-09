import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/9 17:34
 * @Author : NekoSilverfox
 * @FileName: TCP_BSServer
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
// 855 - TCP_BS服务器代码实现

public class TCP_BSServer {
    public static void main(String[] args) throws IOException {
        // 创建一个服务器 ServerSocket, 和系统要指定的端口号
        ServerSocket serverSocket = new ServerSocket(8080);

        // 使用accept方法获取到请求的客户端对象(浏览器)
        Socket accept = serverSocket.accept();

        // 使用Socket对象中的方法getInputStream,获取到网络字节输入流InputStream对象
        InputStream acceptInputStream = accept.getInputStream();

        // 使用网络字节输入流InputStream对象中的方法read读取客户端的请求信息
        // 浏览器访问：http://127.0.0.1:8080/fileForTest/web/index.html
/*        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = acceptInputStream.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }*/
        // 把is网络字节输入流对象,转换为字符缓冲输入流
        BufferedReader bufferedInputStream = new BufferedReader(new InputStreamReader(acceptInputStream));

        // 把客户端请求信息的第一行读取出来 GET /11_Net/web/index.html HTTP/1.1
        String line = bufferedInputStream.readLine();

        // 把读取的信息进行切割,只要中间部分 /11_Net/web/index.html
        String[] split = line.split(" ");
        String htmlPath = split[1].substring(1);

        // 创建一个本地字节输入流,构造方法中绑定要读取的html路径
        FileInputStream fileInputStream = new FileInputStream(htmlPath);

        // 使用Socket中的方法getOutputStream获取网络字节输出流 OutputStream 对象
        OutputStream outputStream = accept.getOutputStream();

        // 写入HTTP协议响应头,固定写法
        outputStream.write("HTTP/1.1 200 OK\r\n".getBytes());
        outputStream.write("Content-Type:text/html\r\n".getBytes());
        // 必须要写入空行,否则浏览器不解析
        outputStream.write("\r\n".getBytes());

        // 一读一写复制文件,把服务读取的html文件回写到客户端
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fileInputStream.read(bytes)) != -1) {
            outputStream.write(bytes, 0, len);
        }

        // 释放资源
        fileInputStream.close();
        outputStream.close();
        serverSocket.close();
    }
}
