package com.java.fundamentals;

public class OperatorsTest {
    public static void main(String[] args){
        int no1 =  10;
        int no2 =  20;
        int res1 = no1 + (no2-30) * 40 / 50 % 60;
        int res2 = no1++ - --no2 + no2-- * ++no1 + --no1;
        System.out.println(res1);
        System.out.println(res2);
        int no3 = 10;
        System.out.println(no3++ > 10 && ++no3 > 5);
        System.out.println(no1);
    }
}
