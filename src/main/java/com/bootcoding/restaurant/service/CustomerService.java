package com.bootcoding.restaurant.service;

import com.bootcoding.restaurant.dao.CustomerDAO;
import com.bootcoding.restaurant.model.Customer;
import com.bootcoding.restaurant.utils.AddressGenerator;
import com.bootcoding.restaurant.utils.EmailIdGenerator;
import com.bootcoding.restaurant.utils.NameGenerator;
import com.bootcoding.restaurant.utils.PhoneNumberGenerator;

import java.util.Date;

public class CustomerService {
    public void createDummyCustomers(){
        CustomerDAO customerDAO = new CustomerDAO();

        for(int i = 0; i < 100; i++){
            Customer customer = new Customer();
            customer.setCustomerId(i + 1);
            customer.setName(NameGenerator.getName());
            customer.setAddress(AddressGenerator.getAddress());
            customer.setEmailId(EmailIdGenerator.
                    getEmailId(customer.getName()));
            customer.setCity("Nagpur");
            customer.setState("Maharashtra");
            customer.setPhoneNumber(PhoneNumberGenerator.getPhoneNumber());
            customer.setCreatedAt(new Date());


            customerDAO.insertCustomer(customer);


             System.out.println(" Customer Details: ");
            System.out.println("Name : " + customer.getName());
            System.out.println("City : " + customer.getCity());
            System.out.println("Address : " + customer.getAddress());
            System.out.println("State : "+ customer.getState());
            System.out.println("Email Id : " + customer.getEmailId());
            System.out.println("Phone : " + customer.getPhoneNumber());
        }
    }
}
