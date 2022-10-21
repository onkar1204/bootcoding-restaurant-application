package com.bootcoding.restaurant.utils;

import java.util.Random;

public class MenuPriceGenerator {

    final static int MAX = 300;
    final static int MIN = 180;
    static Random random = new Random();

    public static int getPrice(){
        int number = random.nextInt(MAX - MIN);
        return MIN + number;
    }

    public static void main(String[] args) {
        for(int i =0; i < 100; i++) {
            int price = MenuPriceGenerator.getPrice();
            System.out.println(price);
        }
    }

}
