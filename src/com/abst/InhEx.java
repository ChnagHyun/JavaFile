package com.abst;

class Base{
    int bNum;
    Base(int bNum){
        this.bNum = bNum;
    }
}
class Drived extends Base{
    private int dNum;
    Drived(int bNum, int dNum){
        super(bNum);
        this.dNum = dNum;
}
void printField(){
    System.out.printf("bNum: %d, dNum: %d\n", bNum,dNum);
    }
}
public class InhEx {

    public static void main(String[] args) {
        Drived d = new Drived(10,20);
        d.printField();
        }

}
