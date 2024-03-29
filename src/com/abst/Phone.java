package com.abst;

public interface Phone {
    public static final int version = 10;
    String getNamefacture();
    String getOs();
}
class IPhone implements Phone{
    @Override
    public String getNamefacture() {
        return "Apple";
    }
    @Override
    public String getOs() {
        return "MacOs";
    }
    void filedInfo() {
        System.out.println(version);
    }
}
class Galaxy implements Phone{

    @Override
    public String getNamefacture() {
        return "Samsung";
    }

    @Override
    public String getOs() {
        return "Android";
    }
    void filedInfo() {
        System.out.println(version);
    }
}
class Main{
public static void main(String[] args) {
    Phone p = new Galaxy();
    System.out.println(p.getNamefacture());
    System.out.println(p.getOs());
    p = new IPhone();
    System.out.println(p.getNamefacture());
    System.out.println(p.getOs());

    p = new Phone(){
        @Override
        public String getNamefacture() {
            return "알뜰폰";
        }
        @Override
        public String getOs() {
            return "안드로이드";
        }
    };
    p = new IPhone();
    System.out.println(p.getNamefacture());
    System.out.println(p.getOs());

}
}