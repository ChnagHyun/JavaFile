package com.tcp.test01;

class Animal{
    int numm = 10;
    String name;            //멤버변수

    Animal(){
        System.out.println("Anamal 생성자");
    }
    void setName(String name){          //멤버함수(메소드)
        this.name = name;
    }
}
class Dog extends Animal{                   //Animal 클래스 상속
    int num = 20;
    Dog() {
        System.out.println("Dog 생성자");
    }
    void sleep() {                  // 재정의(상속관계)
        System.out.println(this.name  + "~~~");
    }
}
class HouseDog extends Dog{
    int num = 30;
    HouseDog() {
    }
    HouseDog(String name) {            //클래스 이름과 동일한 메서드, 출력이 없다. - 생성자(객체생성과 초기화)
        this.setName(name);
        System.out.println("HouseDog 생성자");
    }
    @Override
    void sleep() {          // 재정의(상속관계)
        System.out.println(this.name + "zzzzzz");
    }
    void sleep(int h) {     // 다중정의
        System.out.println(this.name + "zzzzzz" + h + "잔다");
    }
    void numPrint() {
        System.out.printf("A_Anum: %d D_Dnum: %d H_Hnum: %d\n", super.num,super.num, this.num);
    }
}

public class InheSample {
    public static void main(String[] args) {
       // Dog dog = new Dog();        // Dog 객체 생성
       // dog.setName("똥개");
       // System.out.println(dog.name);
       // dog.sleep();
       // HouseDog hd = new HouseDog("바둑이");
       // hd.setName("Happy");
       // hd.sleep();
       // hd.sleep(3);        // 다중정의 메서드 호출시 입력 주의

       // System.out.println(hd.name);

       // HouseDog hd2 = new HouseDog();
       // hd2.numPrint();
        Animal a = new Animal();
        Dog d = new Dog();
        HouseDog hd = new HouseDog();

        Animal a2 = new Dog();       // 다형성: 부모는 자식을 가리킬수 있다.(new Dog가 Animal 타입으로 변환) upcasting
        Animal a3 = new HouseDog();
        Dog d2 = new HouseDog();

        //HouseDog hd2 = new Dog();   //자식 객체가 부모 객체로 만드는건 불가능 downCasting(실행 안됨)
    }
}
