package com.basics.operators;

public class UnaryOperators {
    public static void main(String[] args) {
        int result=0;
        System.out.println("original result"+result);

        result=+1;
        System.out.println("Unary Plus(+) "+result);

        result--;
        System.out.println("Decrement Operator "+result);

        result++;
        System.out.println("Increment Operator "+result);

        result=-result;
        System.out.println(result);

        boolean bl=false;
        System.out.println(bl);
        System.out.println(!bl);   // opposite of boolean value

        System.out.println(result);

        ++result;      //pre increment
        System.out.println(result);

        result++;   //post increment
        System.out.println(result);

        result++;   //post increment
        System.out.println(result);


    }
}
