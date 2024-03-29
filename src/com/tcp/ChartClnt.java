package com.tcp;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ChartClnt {
    static Socket socket = null;
    static BufferedReader in = null;
    static BufferedWriter out = null;

    public static void main(String[] args) {
        startConn();
    }
    public static void startConn() {
        Scanner sc = new Scanner(System.in);
        try {
            socket = new Socket("210.119.14.59", 8080);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            while(true) {
                System.out.println("> ");
                String txMsg = sc.nextLine();       //서버로 전송할 메세지 저장
                if(txMsg.equals("bye")){
                    out.write(txMsg + "\n");
                    out.flush();
                    break;
                }
                out.write(txMsg + "\n");
                out.flush();

                String rxMsg = in.readLine();
                System.out.println("[server] " + rxMsg);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try{
                out.close();
                in.close();
                socket.close();
                sc.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
