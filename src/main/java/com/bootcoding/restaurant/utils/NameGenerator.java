package com.bootcoding.restaurant.utils;

import java.util.Random;

public class NameGenerator {
    private static String[] names =
            {"Ramesh", "Suresh", "Jayesh", "Ganesh",
            "Mahesh", "Rajesh", "Mitesh", "Dinesh",
            "Pooja", "Priya", "Pinky",
            "Manisha", "Usha", "Asha", "Diksha", "Nisha"};

    public static String getName(){
        Random random = new Random();
        int randomIndex = random.nextInt(names.length);
        String name = names[randomIndex];
        System.out.println("Names = " + name);
        return name;
    }
    public static void main(String[] args) {
        NameGenerator.getName();
    }
}

