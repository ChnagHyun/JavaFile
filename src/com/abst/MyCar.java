package com.abst;

public class MyCar {
    // 멤버변수 - 필드 (속성을 나타냄)
    String company;
    String model;
    String color;
    // 생성자  -   객체 생성과 초기화를 담당한다.
    MyCar(){
        //company = "기아자동차";
        //model = "K7";
        //color = "그래비티블루";
        this("삼성자동차","Qm6","빨강");
    }
    MyCar(String company){                        //디폴트 생성자
    this.company = company;
    }
    MyCar(String company, String model, String color){          //디폴트 생성자
    this.company = company;
    this.model = model;
    this.color = color;
}

    void MyCarPrint() {
        System.out.printf("나의 자동차는 %s이고 %s %s 입니다.\n",
                company,color,model);
    }
    // 멤버함수

    public static void main(String[] args) {
        MyCar mc2 = new MyCar("대우");
        MyCar mc1 = new MyCar();
        MyCar mc = new MyCar("현대자동차", "그렌저", "흰색");
        //mc.MyCarPrint();
        mc1.MyCarPrint();
        //mc2.MyCarPrint();
    }
}