package com.file;

import java.io.*;
import java.util.Scanner;

public class Memo {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. 로그인  2. 회원가입 3. 회원정보 4. 종료 >");
            int num = sc.nextInt();
            sc.nextLine(); // 버퍼 비우기

            if (num == 1) {
                login(sc);
            } else if (num == 2) {
                signup(sc);
            } else if (num == 3) {
                information(sc);
            } else if (num == 4) {
                System.out.println("프로그램이 종료되었습니다.");
                break;
            } else {
                System.out.println("올바른 번호를 입력하세요.");
            }
        }

        sc.close();
    }

    public static void login(Scanner sc) throws IOException {
        System.out.println("아이디 : ");
        String id = sc.nextLine();
        System.out.println("비밀번호 : ");
        String pw = sc.nextLine();

        // 파일에서 사용자 정보를 읽어와서 일치하는지 확인
        try (BufferedReader reader = new BufferedReader(new FileReader("./users.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length == 2 && parts[0].equals(id) && parts[1].equals(pw)) {
                    System.out.println("로그인 성공!");
                    return;
                }
            }
        }

        System.out.println("아이디 또는 비밀번호가 잘못되었습니다.");
    }

    private static void signup(Scanner sc) throws IOException {
        System.out.println("아이디 : ");
        String id = sc.nextLine();
        System.out.println("비밀번호 : ");
        String pw = sc.nextLine();
        System.out.println("이름 : ");
        String name = sc.nextLine();
        System.out.println("번호 : ");
        String number = sc.nextLine();
        System.out.println("주소 : ");
        String address = sc.nextLine();

        // 회원가입 정보를 파일에 저장
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("./users.txt", true))) {
            writer.write(id + ":" + pw + ":" + name + ":" + number + ":" + address);
            writer.newLine();
        }

        System.out.println("회원가입이 완료되었습니다.");
    }

    private static void information(Scanner sc) throws Exception {
        System.out.println("아이디 : ");
        String id = sc.nextLine();
        System.out.println("비밀번호 : ");
        String pw = sc.nextLine();
        System.out.println("정보 : ");

        // 파일에서 사용자 정보를 읽어와서 일치하는지 확인
        try (BufferedReader reader = new BufferedReader(new FileReader("./users.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length == 2 && parts[0].equals(id) && parts[1].equals(pw)) {
                    return;
                }
            }
        }

    }
}