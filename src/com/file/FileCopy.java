package com.file;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) throws Exception {
        String originalFileName = "C:/Users/Administrator/Downloads/taeyeon.jpg";
        String targetFileName = "./copyGame.jpg";

        InputStream is = new FileInputStream(originalFileName);
        OutputStream os = new FileOutputStream(targetFileName);

        byte[] data = new byte[1024];
        while(true) {
            int num = is.read(data);
            if(num == -1) break;
            os.write(data, 0 , num);
        }

        os.flush();
        os.close();
        is.close();

        System.out.println("복사가 잘 되었습니다");
    }
}


