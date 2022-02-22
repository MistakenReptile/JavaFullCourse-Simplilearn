package com.basics.loopingstatements;

public class SimpleIfElse {
    public static void main(String[] args) {
        int score=78;
        char grade;

        if (score>=80){
            grade='A';
        }
        else {
            grade='F';
        }

        System.out.println("Grade= "+grade);
    }
}
