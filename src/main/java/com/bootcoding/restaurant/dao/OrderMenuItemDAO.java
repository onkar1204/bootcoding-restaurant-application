package com.bootcoding.restaurant.dao;

import com.bootcoding.restaurant.model.Customer;
import com.bootcoding.restaurant.model.OrderMenuItem;

import java.sql.*;

public class OrderMenuItemDAO {
    private static final String TABLE_NAME = "app_order_menu_item";
    private DAOService daoService;

    public OrderMenuItemDAO() {
        // Inside Constructor
        daoService = new DAOService();
    }

    public void insertCustomer(OrderMenuItem ordremenuitem) {
        try {
            Connection con = daoService.getConnection();
            if(!daoService.exists(con, TABLE_NAME, ordremenuitem.getOrderId())) {
                String sql = "INSERT INTO " + TABLE_NAME + " VALUES ( ?, ?, ?, ?, ?)";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setLong(1, ordremenuitem.getOrderId());
                ps.setString(2, ordremenuitem.getMenuItem());
                ps.setInt(3, ordremenuitem.getQuantity());
                ps.setDouble(4, ordremenuitem.getPrice());
                ps.setBoolean(5, ordremenuitem.isVeg());
                ps.executeUpdate();
                System.out.println(ordremenuitem.getOrderId() + " inserted into DB!");
            }else{
                System.out.println(ordremenuitem.getOrderId()+ " already exists!");
            }
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public void createTable(){


        try{

            Connection con = daoService.getConnection();

            Statement stmt = con.createStatement();
            String query="Create table if not exists " + TABLE_NAME
                    +"( id bigint NOT NULL, "
                    +"menuItem text, "
                    +"quantity bigint, "
                    +"price decimal, "
                    +"isveg bool, "
                    +"CONSTRAINT app_order_menu_item_pkey PRIMARY KEY (id))";
            System.out.println(query);
            stmt.executeUpdate(query);




        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("query");

        }
    }
}
