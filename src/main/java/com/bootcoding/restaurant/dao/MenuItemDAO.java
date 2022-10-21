package com.bootcoding.restaurant.dao;

import com.bootcoding.restaurant.model.Customer;
import com.bootcoding.restaurant.model.MenuItem;

import java.sql.*;

public class MenuItemDAO {
    private static final String TABLE_NAME = "app_menu_item";
    private DAOService daoService;
    public MenuItemDAO(){
        daoService = new DAOService();
    }

    public void insertMenuItem(MenuItem menuItem) {
        try {
            Connection con = daoService.getConnection();
            if(!daoService.exists(con, TABLE_NAME, menuItem.getMenuItemId())) {
                String sql = "INSERT INTO " + TABLE_NAME + " VALUES ( ?, ?, ?, ?, ?, ?)";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setLong(1, menuItem.getMenuItemId());
                ps.setLong(2, menuItem.getVendorId());
                ps.setString(3, menuItem.getMenuItem());
                ps.setDouble(4, menuItem.getPrice());
                ps.setString(5, menuItem.getCategory());
                ps.setBoolean(6, menuItem.isVeg());
                ps.executeUpdate();
                System.out.println(menuItem.getMenuItemId() + " inserted into DB!");
            }else{
                System.out.println(menuItem.getMenuItemId() + " already exists!");
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
                    " vendor_id bigint, " +
                    " menu_item text, " +
                    " price bigint, " +
                    " category text, " +
                    " is_veg bool, " +
                    " CONSTRAINT app_menu_item_pkey PRIMARY KEY (id))";
            stmt.executeUpdate(query);


        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("query");

        }
    }
}
