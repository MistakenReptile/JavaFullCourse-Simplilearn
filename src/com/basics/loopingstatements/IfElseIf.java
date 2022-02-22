package com.basics.loopingstatements;

public class IfElseIf {
    public static void main(String[] args) {
        int score=78;
        char grade;

        if (score>=80){
            grade='A';
        }
        else if (score>=70){
            grade='B';
        }

        else if (score>=60){
            grade='C';
        }

        else {
            grade='F';
        }

        System.out.println("Grade = "+grade);
    }
}
