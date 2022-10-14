package com.bootcoding.restaurant.app;

import com.bootcoding.restaurant.model.Customer;
import com.bootcoding.restaurant.model.Order;
import com.bootcoding.restaurant.model.Vendor;

import java.util.Date;

public class Application {
    public static void main(String[] args) {
        Customer ramesh = new Customer();
        ramesh.setName("Ramesh");
        ramesh.setCity("Nagpur");
        ramesh.setAddress("New Nandanwan, Nagpur");
        ramesh.setState("Maharashtra");
        ramesh.setEmailId("abc@gmail.com");
        ramesh.setPhoneNumber(9090909090L);

        System.out.println(" Customer Details: ");
        System.out.println("Name : " + ramesh.getName());
        System.out.println("City : " + ramesh.getCity());
        System.out.println("Address : " + ramesh.getAddress());
        System.out.println("State : "+ ramesh.getState());
        System.out.println("Email Id : " + ramesh.getEmailId());
        System.out.println("Phone : " + ramesh.getPhoneNumber());

        Vendor haldiram = new Vendor();
        haldiram.setName("Haldiram Veg Restaurant");
        haldiram.setAddress("Ajni Square, Nagpur");
        haldiram.setCategory("VEG");
        haldiram.setPhoneNumber(0712223344);
        haldiram.setRating(5.0);
        haldiram.setState("Maharashtra");
        haldiram.setCity("Nagpur");

        System.out.println("Vendor Details:");
        System.out.println("Name: " + haldiram.getName());
        System.out.println("Address : "+ haldiram.getAddress());
        System.out.println("Category : " + haldiram.getCategory());
        System.out.println("Phone : " + haldiram.getPhoneNumber());
        System.out.println("Rating : " + haldiram.getRating());
        System.out.println("State : " + haldiram.getState());
        System.out.println("City : " + haldiram.getCity());

        Order order = new Order();
        order.setCustomer(ramesh);
        order.setVendor(haldiram);
        order.setTotalAmount(999.00);
        order.setOrderDate(new Date());
        order.setDeliveryAddress("101, Civil Lines, Nagpur");

        System.out.println("Order Details: ");
        System.out.println("Total Amount: " + order.getTotalAmount());
        System.out.println("Order Date: " + order.getOrderDate());
        System.out.println("Order Delivery Address : " + order.getDeliveryAddress());

    }
}

