package com.abst;

public class MainClass {
    public static void main(String[] args) {
            Phone p = new Galaxy();
            System.out.println(p.getNamefacture());
            System.out.println(p.getOs());

            p = new IPhone();
            System.out.println(p.getNamefacture());
            System.out.println(p.getOs());
    }
}
