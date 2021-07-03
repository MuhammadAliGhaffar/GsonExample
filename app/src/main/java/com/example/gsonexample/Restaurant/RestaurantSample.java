package com.example.gsonexample.Restaurant;

import com.example.gsonexample.UserNested.UserAddress;

public class RestaurantSample {
    String name;

    // Objects
    RestaurantOwner owner;
    RestaurantStaff cook;
    RestaurantStaff waiter;

    private class RestaurantOwner {
        String name;
        UserAddress address;
    }

    private class RestaurantStaff {
        int age;
        int salary;
        String name;
    }
}
