package com.bootcoding.restaurant.service;

import com.bootcoding.restaurant.dao.MenuItemDAO;
import com.bootcoding.restaurant.dao.VendorDAO;
import com.bootcoding.restaurant.model.Vendor;
import com.bootcoding.restaurant.utils.*;

public class VendorService {

    private VendorDAO vendorDAO;
    private VendorMenuItemService menuItemService;


    public VendorService(){
        vendorDAO = new VendorDAO();
        menuItemService = new VendorMenuItemService();
        menuItemService.createTable();
    }

    public void createVendors(){
        for(int i = 0; i < 100; i++){
            Vendor vendor = new Vendor();
            vendor.setVendorId(i + 1);
            vendor.setName(RestaurantCategoryGenerator.getName());
            vendor.setAddress(AddressGenerator.getAddress());
            vendor.setEmailId(EmailIdGenerator.
                    getEmailId(vendor.getName()));
            vendor.setCity("Nagpur");
            vendor.setState("Maharashtra");
            vendor.setPhoneNumber(PhoneNumberGenerator.getPhoneNumber());
            vendor.setCategory(RestaurantCategoryGenerator.getCategory(vendor.getName()));

            vendorDAO.insertVendor(vendor);

            addMenuItemsOfVendor(vendor);
        }
    }

    public void addMenuItemsOfVendor(Vendor vendor){
        menuItemService.createMenuItems(vendor);
    }

    public void createTable() {
        vendorDAO.createTable();
    }
}