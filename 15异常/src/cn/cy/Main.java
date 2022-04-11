package cn.cy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class Main {
    //如果文件打不开抛出异常
    public static void main(String[] args) {
        String info = gerInfo("data.scv");
    }

    private static String gerInfo(String filename){
        try{
            InputStream is = new FileInputStream(filename);
            Scanner scanner = new Scanner(is);
            String info = scanner.nextLine();
            scanner.close();
            return info;
        } catch (FileNotFoundException e){
            System.out.println("Can not find the file.");
            System.exit(1); //程序退出
        } finally {
            return null;
        }
    }

    private static void foobar(){
        //主动抛出异常
        throw new IllegalArgumentException();
    }
}
