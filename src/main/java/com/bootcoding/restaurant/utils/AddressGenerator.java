package com.bootcoding.restaurant.utils;

import java.util.Random;

public class AddressGenerator {

    private static String[] addresses =
            {"KR Pandav College, New Nandanwan",
            "Trillium VR, Medical Square",
            "Beside Haldiram, Ajni Square",
            "Bhole Petrol pump, Civil Lines",
            "opposite Batukbhai Jewellers, Dharampeth",
            "Sangam Mithai, Manish nagar"};

    public static String getAddress(){
        Random random = new Random();
        int randomIndex = random.nextInt(addresses.length);
        String address = addresses[randomIndex];
        System.out.println("Address = " + address);
        return address;
    }

    public static void main(String[] args) {
        AddressGenerator.getAddress();
    }
}
