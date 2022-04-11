package cn.cy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class UsingInputStream {
    public static void main(String[] args) throws IOException{
        try (InputStream input = new FileInputStream("data\\sample")) {
            //采用语法糖可以使具有自动关闭的对象遇到异常后自动关闭
            byte[] buffer = new byte[4];
            int n;
            while ((n = input.read(buffer)) != -1){
                System.out.println(n);
            }
        }
    }

    public static void show(InputStream input) throws IOException{
        int n;
        while ((n = input.read()) != -1){
            System.out.println((char) n);
        }
    }
}
