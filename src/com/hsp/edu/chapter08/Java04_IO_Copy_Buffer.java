package com.hsp.edu.chapter08;

import java.io.*;

public class Java04_IO_Copy_Buffer {
    public static void main(String[] args)  {

        // TODO Java IO - 文件复制 - 缓冲

        // TODO 数据源文件对象
        File srcFile = new File("E:\\computer\\javacode\\java_hsp\\input\\word.txt");
        // TODO 数据目的地文件对象 (自动生成)
        File destFile = new File("E:\\computer\\javacode\\java_hsp\\input\\word.txt.copy");

        // TODO 文件输入流(管道对象)
        FileInputStream in = null;
        // TODO 文件输出流(管道对象)
        FileOutputStream out = null;



        // TODO 缓冲输入流(管道对象)
        BufferedInputStream bufferin = null;
        // TODO 缓冲输出流(管道对象)
        BufferedOutputStream bufferout = null;

        // TODO 缓冲区(水桶)
        byte[] cache = new byte[1024];

        try {
            in  = new FileInputStream(srcFile);
            out = new FileOutputStream(destFile);

            bufferin = new BufferedInputStream(in);
            bufferout = new BufferedOutputStream(out);

            int data = -1;


            while ( (data = bufferin.read(cache)) != -1 ) {
                bufferout.write(cache,0,data);
            }



        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if ( bufferin != null ) {
                try {
                    bufferin.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            if ( bufferout != null ) {
                try {
                    bufferout.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }


        }




        // TODO 数据目的地文件对象



    }
}
