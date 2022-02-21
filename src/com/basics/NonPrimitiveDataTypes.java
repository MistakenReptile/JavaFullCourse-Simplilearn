package com.basics;

public class NonPrimitiveDataTypes {
    public static void main(String[] args) {
        String str="test";
        System.out.println("String "+str);

        String str2=new String("test2");
        System.out.println(str2);

        int arr[];
        arr=new int[2];
        arr[0]=12;
        arr[1]=23;
        //arr[2]=34;

        System.out.println(arr);
        System.out.println(arr[1]);
    }
}
