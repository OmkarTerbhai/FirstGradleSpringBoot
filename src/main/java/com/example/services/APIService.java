package com.example.services;

import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import com.example.utils.ProductsItem;

@Service
public interface APIService {
    @GET("/products/{id}")
    Call<ProductsItem> getProductById(@Path("id") String id);
}
