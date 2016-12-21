package com.example.khiemnv.testcrosswalk;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author Favo
 *         Created on 18/10/2016.
 */

class ApiClientManager {
    private static Retrofit retrofit = null;

    public static Retrofit createNewInstance(String baseUrl) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
    }
}
