package com.bootcoding.restaurant.model;

public class MenuItem {

        private long menuItemId;
        private String menuItem;
        private double price;
        private String category;
        private boolean isVeg;

        public long getMenuItemId() {
            return menuItemId;
        }

        public void setMenuItemId(long menuItemId) {
            this.menuItemId = menuItemId;
        }

        public String getMenuItem() {
            return menuItem;
        }

        public void setMenuItem(String menuItem) {
            this.menuItem = menuItem;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public boolean isVeg() {
            return isVeg;
        }

        public void setVeg(boolean veg) {
            isVeg = veg;
        }
    }

