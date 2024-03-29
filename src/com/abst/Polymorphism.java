package com.abst;

class Coffee {
    String name;
    int price;
    Coffee(String name, int price){
        this.name = name;
        this.price = price;
    }
}
class Americano extends Coffee{
   Americano(String name, int price){
       super(name, price);
   }
}
class Hazelnuts extends Coffee{
    Hazelnuts(String name, int price){
        super(name, price);
    }
}
class Cafelatte extends Coffee{
    Cafelatte(String name, int price){
        super(name, price);
    }
}
class Customer {
    int money = 300000;
    void buyCoffee(Coffee coffee){
        if(money < coffee.price) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        money = money - coffee.price;
        System.out.printf("%s를 구입하셨습니다.\n", coffee.name);
    }
}
public class Polymorphism {

    public static void main(String[] args) {
        Customer c = new Customer();
        c.buyCoffee(new Americano("아메리카노",5000));       //5000
        c.buyCoffee(new Hazelnuts("헤이즐넛",5500));        //5500
        c.buyCoffee(new Cafelatte("카페라떼",7500));       //7500

        System.out.printf("커피를 구입하고 남은 잔액은 %d 입니다.\n", c.money);
    }
}