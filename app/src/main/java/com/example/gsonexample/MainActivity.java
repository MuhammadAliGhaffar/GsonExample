package com.example.gsonexample;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gsonexample.Info.FSInfo;
import com.example.gsonexample.Restaurant.RestaurantSample;
import com.example.gsonexample.User.UserSample;
import com.example.gsonexample.UserNested.UserAddress;
import com.example.gsonexample.UserNested.UserNested;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static String _TAG = "LoggingValues";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //serializeUserSample();
        //deserializeUserSample();

        //serializeUserNested();
        //deserializeUserNested();

        //serializeListRestaurant();
        deserializeListRestaurant();
    }

    private static void serializeUserSample() {
        UserSample userSample = new UserSample("Ali",
                "abc@123.com",
                23,
                true);

        Gson gson = new Gson();
        String json = gson.toJson(userSample);

        Log.i(_TAG, json);
    }

    private static void deserializeUserSample() {
        String userJson = "{'age':25,'email':'abc@123.com','isDeveloper':true,'name':'Ali'}";
        Gson gson = new Gson();
        UserSample userSample = gson.fromJson(userJson, UserSample.class);

    }

    private static void serializeUserNested() {
        UserAddress userAddress = new UserAddress("Main street",
                "B104",
                "karachi",
                "pakistan");
        UserNested userNested = new UserNested("Ali",
                "abc@123.com",
                23,
                true,
                userAddress);

        Gson gson = new Gson();
        String json = gson.toJson(userNested);

        Log.i(_TAG, json);
    }

    private static void deserializeUserNested() {
        String restaurantJson = "{ 'name':'Future Studio Steak House', 'owner':{ 'name':'Christian', 'address':{ 'city':'Magdeburg', 'country':'Germany', 'houseNumber':'42', 'street':'Main Street'}},'cook':{ 'age':18, 'name': 'Marcus', 'salary': 1500 }, 'waiter':{ 'age':23, 'name': 'Ali', 'salary': 4000}}";

        RestaurantSample restaurantSample = new Gson().fromJson(restaurantJson, RestaurantSample.class);
    }

    private static void serializeListRestaurant() {
        List<RestaurantSample.RestaurantMenuItems> menuItems = new ArrayList<>();
        menuItems.add(new RestaurantSample.RestaurantMenuItems("Steak", 200f));
        menuItems.add(new RestaurantSample.RestaurantMenuItems("Kabaab", 400f));
        menuItems.add(new RestaurantSample.RestaurantMenuItems("Desert", 100f));

        RestaurantSample restaurantSample = new RestaurantSample("Future Studio Steak House", menuItems);
        Log.i(_TAG,new Gson().toJson(restaurantSample));
    }

    private static void deserializeListRestaurant() {
        //String founderJson = "[{'name': 'Christian','flowerCount': 1}, {'name': 'Marcus', 'flowerCount': 3}, {'name': 'Norman', 'flowerCount': 2}]";
        Gson gson = new Gson();
        //FSFounder[] founderArray = gson.fromJson(founderJson, FSFounder[].class);

        //IF ArrayList
//        Type founderListType = new TypeToken<ArrayList<FSFounder>>(){}.getType();
//        List<FSFounder> founderList = gson.fromJson(founderJson, founderListType);

        String generalInfoJson = "{'name': 'Future Studio Dev Team', 'website': 'https://futurestud.io', 'founders': [{'name': 'Christian', 'flowerCount': 1 }, {'name': 'Marcus','flowerCount': 3 }, {'name': 'Norman','flowerCount': 2 }]}";
        FSInfo fSInfoObject = gson.fromJson(generalInfoJson, FSInfo.class);
    }
}