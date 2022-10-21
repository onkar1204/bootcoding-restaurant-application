package com.bootcoding.restaurant.utils;

import java.util.*;

public class RestaurantCategoryGenerator {

    public static final Map<String, String> namesWithCategory = new LinkedHashMap<>();
    private static final List<String> vendorNames = new ArrayList<>();
    public static final String ALL = "All";
    public static final String BURGER = "Burger";
    public static final String PURE_VEG = "Pure Veg";
    public static final String PIZZA = "Pizza";
    public static final String BIRYANI = "Biryani";

    static {
        namesWithCategory.put("Hotel Al-Zam Zam", ALL);
        namesWithCategory.put("Pintu Saoji Restaurant", ALL);
        namesWithCategory.put("Laxmi Family Restaurant", ALL);
        namesWithCategory.put("Ashoka Restaurant", ALL);
        namesWithCategory.put("Hotel Mejwani", ALL);
        namesWithCategory.put("Laziz Food", BIRYANI);
        namesWithCategory.put("Heritage Plaza", BIRYANI);
        namesWithCategory.put("Sherubhai Biryani", BIRYANI);
        namesWithCategory.put("Desi Grill", BIRYANI);
        namesWithCategory.put("Pizza Hut", PIZZA);
        namesWithCategory.put("Panino", PIZZA);
        namesWithCategory.put("Dominos", PIZZA);
        namesWithCategory.put("McDonalds", BURGER);
        namesWithCategory.put("Burger Kings", BURGER);
        namesWithCategory.put("Subway", BURGER);
        namesWithCategory.put("KFC", BURGER);
        namesWithCategory.put("Veggietude", PURE_VEG);
        namesWithCategory.put("Ram Bhandar", PURE_VEG);
        namesWithCategory.put("Haldiram", PURE_VEG);

       vendorNames.addAll(namesWithCategory.keySet());
    }


    public static String getName(){
        Random random = new Random();
        int randomIndex = random.nextInt(vendorNames.size());
        String name = vendorNames.get(randomIndex);
        return name;
    }
    public static String getCategory(String name){
        return namesWithCategory.get(name);
    }

}
