package oops;


class Calculator{
    int a;
    public int add(int val1,int val2){
        return val1+val2;
    }

    public int mod(int nu1,int nu2){
        return nu1%nu2;

    }
}
public class Calc {
    public static void main(String[] args){
        int num1=10;
        int num2=20;
        Calculator c1=new Calculator();
        System.out.println(c1.add(num1,num2));
        System.out.println("mod:"+c1.mod(20,3));
    }
}
