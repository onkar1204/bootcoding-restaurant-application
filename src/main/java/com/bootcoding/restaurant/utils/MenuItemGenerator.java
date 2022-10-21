package com.bootcoding.restaurant.utils;

import java.util.*;

public class MenuItemGenerator {

    private static final Map<String, List<String>> vendorMenuItems = new LinkedHashMap<>();
    private static final Random random = new Random();
    private static final List<String> menuItemsOfAllCategory = Arrays.asList("Fish Masala", "Chicken Masala",
            "Prawns Masala", "Paneer Tikka Masala", "Fish Curry", "Chicken Curry",
            "Prawns Curry", "Paneer Lababdar", "Fish Handi", "Chicken Handi",
            "Prawns Handi", "Paneer Handi", "Fish Kolhapuri", "Chicken Kolhapuri",
            "Prawns Kolhapuri", "Paneer Tikka Kolhapuri", "Chicken Lollypop",
            "Chicken Tandoori", "Chilli Paneer", "Cispy Veg");

    private static final List<String> menuItemsOfPizzaCategory = Arrays.asList("Margherita", "Spicy Mexicana", "Double Cheese Margherita",
            "Onion Pizza", "Tomato Pizza", "French Fries", "Tandoori Paneer", "Peppy Paneer", "Cheeze N Corn", "Paneer Makhani");

    private static final List<String> menuItemsOfBiryaniCategory = Arrays.asList("Dum Biryani", "Chicken Biryani", "Mutton Biryani",
            "Egg Biryani", "Paneer Biryani", "Chicken Tandoori Biryani", "Murg Masala Biryani");

    private static final List<String> menuItemsOfBurgerCategory = Arrays.asList("Cheese Burger", "Mushroom Burger", "Barbeque Burger",
            "Chicken Wings", "Chicken McGrill", "McSpicy Paneer", "McAloo Tikki");
    private static final List<String> menuItemsOfPureVegCategory = Arrays.asList("Samosa", "Dosa", "Cutlet", "Paneer Bhurji",
            "Mix Veg", "Pav Bhaji", "Vada Pav", "Sandwich", "Missal Pav", "Puri Bhaji");


    static {
        vendorMenuItems.put(RestaurantCategoryGenerator.ALL, menuItemsOfAllCategory);
        vendorMenuItems.put(RestaurantCategoryGenerator.PIZZA, menuItemsOfPizzaCategory);
        vendorMenuItems.put(RestaurantCategoryGenerator.BIRYANI, menuItemsOfBiryaniCategory);
        vendorMenuItems.put(RestaurantCategoryGenerator.BURGER, menuItemsOfBurgerCategory);
        vendorMenuItems.put(RestaurantCategoryGenerator.PURE_VEG, menuItemsOfPureVegCategory);
    }

    public static String getMenuItemByVendorCategory(String category){
        List<String> menuItems = vendorMenuItems.get(category);
        int index = random.nextInt(menuItems.size());
        return menuItems.get(index);
    }

    public static String getMenuItemByVendor(String vendorName){
        String category = RestaurantCategoryGenerator.getCategory(vendorName);
        String menuItem = getMenuItemByVendorCategory(category);
        return menuItem;
    }
}
