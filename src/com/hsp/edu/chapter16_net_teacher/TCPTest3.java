package com.hsp.edu.chapter16_net_teacher;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/*
从客户端发送文件给服务端，服务端保存到本地，并返回发送成功给客户端，并关闭相关连接
 */
public class TCPTest3 {


    /*
     注意：因为涉及到相关资源的关闭，需要使用 try-catch-finnaly处理异常
     */
    // 客户端
    @Test
    public void client() throws IOException {
        // 1.创建socket
        // 指明对方(即为服务器端)的ip地址和端口号
        InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
        int port = 9090;
        Socket socket = new Socket(inetAddress,port);
        // 2.创建File的实例，FileInputStream的实例
        File file = new File("datas/data.txt");
        FileInputStream fis = new FileInputStream(file);
        // 3.通过Socket，获取输出流
        OutputStream os = socket.getOutputStream();

        // 4.读写数据
        byte[] buffer = new byte[1024];
        int len;
        while ( (len = fis.read(buffer) ) != -1 ) {
            os.write(buffer,0,len);
        }

        System.out.println("数据发送完毕");
        // 客户端表明 不再继续发送数据
        socket.shutdownOutput();

        // 5.接收来自于服务器端的数据
        InputStream is = socket.getInputStream();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buffer1 = new byte[5];
        int len1;
        while ( (len1 = is.read(buffer1) ) != -1 ) {
            baos.write(buffer1,0,len1);
        }
        System.out.println(baos.toString());


        // 6.关闭Socket和相关的流
        baos.close();
        is.close();
        os.close();
        fis.close();
        socket.close();
    }

    // 服务端
    @Test
    public void server() throws IOException {

        // 1.创建ServerSocket
        int port = 9090;
        ServerSocket serverSocket = new ServerSocket(port);

        // 2.接收客户端的socket:accept()
        Socket socket = serverSocket.accept();


        // 3.通过Socket获取一个输入流
        InputStream is = socket.getInputStream();

        // 4.创建File类的实例，FileOutputStream的实例
        File file = new File("datas/data_copy2.txt");
        FileOutputStream fos = new FileOutputStream(file);

        // 5.读写过程
        byte[] buffer = new byte[1024];
        int len;
        while ( (len = is.read(buffer)) != -1 ) {
            fos.write(buffer,0,len);
        }

        // 6.服务端发送数据给客户端
        OutputStream os = socket.getOutputStream();
        os.write("你的图片很漂亮，我接收到了".getBytes());

        System.out.println("数据接收完毕");
        // 7.关闭相关的Socket和流
        os.close();
        fos.close();
        is.close();
        socket.close();
        serverSocket.close();
    }
}
