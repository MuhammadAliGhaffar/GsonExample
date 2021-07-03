package com.example.gsonexample.Restaurant;


import java.util.List;

public class RestaurantSample {
    String name;

    List<RestaurantMenuItems> items;

    // Objects
//    RestaurantOwner owner;
//    RestaurantStaff cook;
//    RestaurantStaff waiter;
//
//    private class RestaurantOwner {
//        String name;
//        UserAddress address;
//    }
//
//    private class RestaurantStaff {
//        int age;
//        int salary;
//        String name;
//    }

    //For ArrayList
    public RestaurantSample(String name, List<RestaurantMenuItems> items) {
        this.name = name;
        this.items = items;
    }

    public static class RestaurantMenuItems{
        String name;
        float price;

        public RestaurantMenuItems(String name, float price) {
            this.name = name;
            this.price = price;
        }
    }
}
