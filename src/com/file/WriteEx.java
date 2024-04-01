package com.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteEx {
    static OutputStream os = null;
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("./test1.db");

            //byte a = 10;
            //byte b = 20;
            //byte c = 30;

            //os.write(a);
            //os.write(b);
            //os.write(c);

            //os.flush();      // 출력스트림에 있는 값들을 출력하기 위함
            //os.close();
        byte[] array = {40, 50, 60};

            os.write(array);
        }catch(IOException e) {
            e.printStackTrace();

        } finally {
            try {
                os.close();

            }catch(IOException e) {
                e.printStackTrace();

            }
    }
}
}