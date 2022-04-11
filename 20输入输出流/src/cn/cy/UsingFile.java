package cn.cy;

import java.io.File;
import java.io.FilenameFilter;

public class UsingFile {
    public static void main(String[] args) {
        //File对象主要用来判断和检测文件状态
        File file = new File("c:\\windows");
        System.out.println(file.exists()); //判断是否存在
        //打印路径下所有文件(夹)
//        String[] files = file.list();
//        for (var filename : files){
//            System.out.println(filename);
//        }
        //筛选出可执行文件,需要实现文件筛选匿名接口
        File[] fs = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".exe");
            }
        });
        for(var filename : fs){
            System.out.println(filename);
        }
    }
}

//File对象常用方法
//getName() 获取文件名
//getParent() 获取父文件夹路径
//getPath() 获取输入的(相对)路径
//getAbsolutePath() 获取输入的绝对路径
//getCanonicalPath() 获取标准绝对路径(需要抛出异常)
