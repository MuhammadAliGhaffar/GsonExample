package com.example.gsonexample;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gsonexample.User.UserSample;
import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    private static String _TAG = "LoggingValues";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //serializeUserSample();
        //deserializeUserSample();
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
}