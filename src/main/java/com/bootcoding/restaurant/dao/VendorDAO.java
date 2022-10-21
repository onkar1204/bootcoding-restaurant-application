package com.bootcoding.restaurant.dao;

import com.bootcoding.restaurant.model.Customer;
import com.bootcoding.restaurant.model.Vendor;

import java.sql.*;

public class VendorDAO {
    private static final String TABLE_NAME = "app_vendor";
    private DAOService daoService;

    public VendorDAO() {
        // Inside Constructor
        daoService = new DAOService();
    }
    public void insertVendor(Vendor Vendor) {
        try {
            Connection con = daoService.getConnection();
            if(!daoService.exists(con, TABLE_NAME, Vendor.getVendorId())) {
                String sql = "INSERT INTO " + TABLE_NAME + " VALUES ( ?, ?, ?, ?, ?, ?, ?,?,?,?)";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setLong(1, Vendor.getVendorId());
                ps.setString(2, Vendor.getName());
                ps.setLong(3, Vendor.getPhoneNumber());
                ps.setString(4, Vendor.getAddress());
                ps.setString(5, Vendor.getEmailId());
                ps.setString(6, Vendor.getCity());
                ps.setString(7, Vendor.getState());
                ps.setBoolean(8,Vendor.isPureVeg());
                ps.setString(9,Vendor.getCategory());
                ps.setDouble(10,Vendor.getRating());
                ps.executeUpdate();
                System.out.println(Vendor.getVendorId() + " inserted into DB!");
            }else{
                System.out.println(Vendor.getVendorId() + " already exists!");
            }
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public void createTable(){
        try {

            Connection con = daoService.getConnection();

            Statement stmt = con.createStatement();
            String query = " Create table if not exists " + TABLE_NAME +
                    " (id bigint NOT NULL," +
                    " name text,"+
                    " phone_number bigint," +
                    " address text,"+
                    " email_id text," +
                    " city text," +
                    " state text," +
                    " pureVeg bool, " +
                    " category text, " +
                    " rating bigint, " +
                    " CONSTRAINT app_vendor_pkey PRIMARY KEY (id))";
            stmt.executeUpdate(query);


        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("query");

        }
    }
}
