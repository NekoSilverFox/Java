import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/9 15:38
 * @Author : NekoSilverfox
 * @FileName: TCPFileClient
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
// 852 - TCP_文件上传到服务器
/*
    文件上传案例的客户端:读取本地文件,上传到服务器,读取服务器回写的数据

    明确:
        数据源:c:\\1.jpg
        目的地:服务器

    实现步骤:
        1.创建一个本地字节输入流FileInputStream对象,构造方法中绑定要读取的数据源
        2.创建一个客户端Socket对象,构造方法中绑定服务器的IP地址和端口号
        3.使用Socket中的方法getOutputStream,获取网络字节输出流OutputStream对象
        4.使用本地字节输入流FileInputStream对象中的方法read,读取本地文件
        5.使用网络字节输出流OutputStream对象中的方法write,把读取到的文件上传到服务器
        6.使用Socket中的方法getInputStream,获取网络字节输入流InputStream对象
        7.使用网络字节输入流InputStream对象中的方法read读取服务回写的数据
        8.释放资源(FileInputStream,Socket)
 */
public class TCPFileClient {
    public static void main(String[] args) throws IOException {

        // 1.创建一个本地字节输入流FileInputStream对象,构造方法中绑定要读取的数据源
        FileInputStream fileInputStream = new FileInputStream("853 - TCP_文件上传到服务器的优化(随机名+多线程+循环接收)\\LocalDisk\\silverfox.gif");

        // 2.创建一个客户端Socket对象,构造方法中绑定服务器的IP地址和端口号
        Socket socket = new Socket("127.0.0.1", 8080);

        // 3.使用Socket中的方法getOutputStream,获取网络字节输出流OutputStream对象
        OutputStream socketOutputStream = socket.getOutputStream();

        // 4.使用本地字节输入流FileInputStream对象中的方法read,读取本地文件
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fileInputStream.read(bytes)) != -1) {
            // 5.使用网络字节输出流OutputStream对象中的方法write,把读取到的文件上传到服务器
            socketOutputStream.write(bytes, 0, len);
        }

        /* 【重点】如果不发送结束标记，服务器端会进入到阻塞状态（一直while死循环）
            解决:上传完文件,给服务器写一个结束标记
            void shutdownOutput() 禁用此套接字的输出流。
            对于 TCP 套接字，任何以前写入的数据都将被发送，并且后跟 TCP 的正常连接终止序列。
         */
        socket.shutdownOutput();

        // 6.使用Socket中的方法getInputStream,获取网络字节输入流InputStream对象
        InputStream socketInputStream = socket.getInputStream();

        // 7.使用网络字节输入流InputStream对象中的方法read读取服务回写的数据
        while ((len = socketInputStream.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }

        // 8.释放资源(FileInputStream,Socket)
        fileInputStream.close();
        socket.close();
    }
}
