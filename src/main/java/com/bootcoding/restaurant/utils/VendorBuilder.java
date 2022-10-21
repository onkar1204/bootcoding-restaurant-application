package com.bootcoding.restaurant.utils;

import com.bootcoding.restaurant.model.Vendor;

import java.util.Random;

public class VendorBuilder {
    private static Random random = new Random();
    public static Vendor build(){
        Vendor vendor = new Vendor();
        vendor.setVendorId( random.nextInt(100));
        return vendor;
    }
}
