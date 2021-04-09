import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/9 15:43
 * @Author : NekoSilverfox
 * @FileName: TCPFileServer
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
/*
    文件上传案例服务器端:读取客户端上传的文件,保存到服务器的硬盘,给客户端回写"上传成功"

    明确:
        数据源:客户端上传的文件
        目的地:服务器的硬盘 d:\\upload\\1.jpg

    实现步骤:
        1.创建一个服务器ServerSocket对象,和系统要指定的端口号
        2.使用ServerSocket对象中的方法accept,获取到请求的客户端Socket对象
        3.使用Socket对象中的方法getInputStream,获取到网络字节输入流InputStream对象
        4.判断d:\\upload文件夹是否存在,不存在则创建
        5.创建一个本地字节输出流FileOutputStream对象,构造方法中绑定要输出的目的地
        6.使用网络字节输入流InputStream对象中的方法read,读取客户端上传的文件
        7.使用本地字节输出流FileOutputStream对象中的方法write,把读取到的文件保存到服务器的硬盘上
        8.使用Socket对象中的方法getOutputStream,获取到网络字节输出流OutputStream对象
        9.使用网络字节输出流OutputStream对象中的方法write,给客户端回写"上传成功"
        10.释放资源(FileOutputStream,Socket,ServerSocket)
 */
public class TCPFileServer {
    public static void main(String[] args) throws IOException {

        // 1.创建一个服务器ServerSocket对象,和系统要指定的端口号
        ServerSocket serverSocket = new ServerSocket(8080);

        // 2.使用ServerSocket对象中的方法accept,获取到请求的客户端Socket对象
        Socket accept = serverSocket.accept();

        // 3.使用Socket对象中的方法getInputStream,获取到网络字节输入流InputStream对象
        InputStream acceptInputStream = accept.getInputStream();

        // 4.判断d:\\upload文件夹是否存在,不存在则创建
        File file = new File("852 - TCP_文件上传到服务器的代码实现\\ServerDisk");
        if (!file.exists()) {
            file.mkdirs();
        }

        // 5.创建一个本地字节输出流FileOutputStream对象,构造方法中绑定要输出的目的地
        FileOutputStream fileOutputStream = new FileOutputStream(file + "\\silverfox.gif");

        // 6.使用网络字节输入流InputStream对象中的方法read,读取客户端上传的文件
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = acceptInputStream.read(bytes)) != -1) {
            // 7.使用本地字节输出流FileOutputStream对象中的方法write,把读取到的文件保存到服务器的硬盘上
            fileOutputStream.write(bytes, 0, len);
        }

        // 8.使用Socket对象中的方法getOutputStream,获取到网络字节输出流OutputStream对象
        // 9.使用网络字节输出流OutputStream对象中的方法write,给客户端回写"上传成功"
        accept.getOutputStream().write("文件写入完成！".getBytes(StandardCharsets.UTF_8));

        // 10.释放资源(FileOutputStream,Socket,ServerSocket)
        accept.close();
        serverSocket.close();
        fileOutputStream.close();
    }
}
