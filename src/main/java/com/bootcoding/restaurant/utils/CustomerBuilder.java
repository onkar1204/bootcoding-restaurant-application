package com.bootcoding.restaurant.utils;

import com.bootcoding.restaurant.model.Customer;

import java.util.Random;

public class CustomerBuilder {
    private static Random random = new Random();
    public static Customer build(){
        Customer customer = new Customer();
        customer.setCustomerId(random.nextInt(100));
        return customer;
    }
}
