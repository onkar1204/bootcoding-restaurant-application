package com.bootcoding.restaurant.exception;

import java.util.Scanner;

public class ExceptionExample2 {

    public void testExample(){
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.next());
        try{
            int p=n/10;
            System.out.println("number is :"+n);
            System.out.println("Value is:"+p);
        }
        catch (Exception ex){
            System.out.println("Enter the  only Number");
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new ExceptionExample2().testExample();
}
}

