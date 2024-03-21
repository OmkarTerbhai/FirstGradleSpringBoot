package com.example.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import com.example.services.APIService;
import com.example.utils.ProductsItem;

import java.io.IOException;

@Repository
public class ProductRepository {


    APIService apiService;
    public ProductRepository() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://dummyjson.com/products/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        apiService = retrofit.create(APIService.class);
    }

    public ProductsItem getProduct(String id) throws IOException {
        return apiService.getProductById(id).execute().body();
    }
}
