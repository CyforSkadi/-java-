package cn.cy;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class UsingOutputStream {
    public static void main(String[] args) throws IOException {
        OutputStream output = new FileOutputStream("data\\sample");

        String msg = "this is a message";
        output.write(msg.getBytes("UTF-8"));
        output.close();

    }
}
