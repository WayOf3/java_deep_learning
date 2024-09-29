package com.hsp.edu.chapter08;

import java.io.*;

public class Java05_IO_Copy_String_1 {
    public static void main(String[] args)  {

        // TODO Java IO - 文件复制 - 字符串

        // TODO 数据源文件对象
        File srcFile = new File("E:\\computer\\javacode\\java_hsp\\input\\word.txt");
        // TODO 数据目的地文件对象 (自动生成)
        File destFile = new File("E:\\computer\\javacode\\java_hsp\\input\\word.txt.copy");

        // TODO 字符输入流(管道对象)
        BufferedReader reader = null;
        // TODO 字符输出流(管道对象)
        PrintWriter writer = null;
        try {
            reader  = new BufferedReader(new FileReader(srcFile));
            writer = new PrintWriter(destFile);

            // TODO 打开阀门，流转数据(输入)
            // 读取文件中一行数据(字符串)
            String line = null;

            StringBuilder ss = new StringBuilder();


            while ( (line = reader.readLine()) != null ) {
                System.out.println(line);
                writer.println(line);

            }

            // 刷写数据
            writer.flush();


            // 可以将字符串转换成字节数组 ，再将数组中每一个字节写入到文件中

            // Unicode 编码
            // byte => -128 - 127
            // asc => 0-127



        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if ( reader != null ) {
                try {
                    reader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            if ( writer != null ) {
                writer.close();
            }


        }




        // TODO 数据目的地文件对象



    }
}
