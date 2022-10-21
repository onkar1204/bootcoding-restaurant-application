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

    public void insertCustomer(MenuItem menuItem) {
        try {
            Connection con = daoService.getConnection();
            if(!daoService.exists(con, TABLE_NAME, menuItem.getMenuItemId())) {
                String sql = "INSERT INTO " + TABLE_NAME + " VALUES ( ?, ?, ?, ?, ?)";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setLong(1, menuItem.getMenuItemId());
                ps.setString(2, menuItem.getMenuItem());
                ps.setDouble(3, menuItem.getPrice());
                ps.setString(4, menuItem.getCategory());
                ps.setBoolean(5, menuItem.isVeg());
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
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                    "postgres", "postgres");
            Statement stmt = con.createStatement();
            String query = " Create table if not exists " + TABLE_NAME +
                    " (menuitemid bigint NOT NULL," +
                    " menuitem text, " +
                    " price bigint, " +
                    " category text, " +
                    " isveg bool, " +
                    " CONSTRAINT app_menuitem_pkey PRIMARY KEY (menuitemid))";
            stmt.executeUpdate(query);


        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("query");

        }
    }
}
