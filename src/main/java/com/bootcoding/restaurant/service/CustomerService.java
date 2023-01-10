package com.bootcoding.restaurant.service;

import com.bootcoding.restaurant.dao.CustomerDAO;
import com.bootcoding.restaurant.model.Customer;
import com.bootcoding.restaurant.utils.AddressGenerator;
import com.bootcoding.restaurant.utils.EmailIdGenerator;
import com.bootcoding.restaurant.utils.NameGenerator;
import com.bootcoding.restaurant.utils.PhoneNumberGenerator;
//import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Date;

public class CustomerService {

    CustomerDAO customerDAO = new CustomerDAO();

    public void createDummyCustomers(){
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

        }
    }

    public void creteTable() {
        customerDAO.createTable();
    }
}
