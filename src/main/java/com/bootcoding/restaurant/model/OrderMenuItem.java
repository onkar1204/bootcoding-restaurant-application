package com.bootcoding.restaurant.model;

public class OrderMenuItem {

    private long orderId;

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    private String menuItem;
        private int quantity;
        private double price;

        private boolean isVeg;

        public boolean isVeg() {
            return isVeg;
        }

        public void setVeg(boolean veg) {
            isVeg = veg;
        }

        public String getMenuItem() {
            return menuItem;
        }

        public void setMenuItem(String menuItem) {
            this.menuItem = menuItem;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }

