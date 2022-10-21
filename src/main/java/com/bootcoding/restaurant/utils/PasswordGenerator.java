package com.bootcoding.restaurant.utils;

import java.util.Random;

public class PasswordGenerator {
    private static String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static String lowerAlphabets = alphabets.toLowerCase();
    private static String digits = "0123456789";
    private static String alphanumeric = alphabets + lowerAlphabets + digits;

    public static String getPassword(){
        System.out.println(alphanumeric);
        Random random = new Random();
        String password = "";
        for(int i = 0; i < 8; i++) {
            int randomIndex = random.nextInt(alphanumeric.length());
            char character = alphanumeric.charAt(randomIndex);
            password = password + character;
            System.out.println("Random Index " + randomIndex
                    + " and Character: " + character);
        }
        System.out.println("System Generated Password is " + password);
        return password;
    }

    public static void main(String[] args) {
        PasswordGenerator.getPassword();
    }
}
