package com.example.cyrinehammmi.gps;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Cyrine Hammémi on 30/01/2018.
 */

public class ApiClient {
    public static Retrofit retrofit;
    public static ApiService service;

    public static ApiService sharedInstance() {
        if (retrofit == null) {
            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                    .create();
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("http://10.54.234.210/workshop/public/api/")
                    .addConverterFactory(GsonConverterFactory.create(gson)) //convertir vers json auto
                    .build();
            service = retrofit.create(ApiService.class);
        }
        return service;
    }

}