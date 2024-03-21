package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.repositories.ProductRepository;
import com.example.utils.HelloResponse;
import com.example.utils.ProductsItem;

import java.io.IOException;

@RestController
public class HelloController {

    @Autowired
    ProductRepository productRepository;
    @GetMapping("/hello")
    public String getHello() {
        return "<b>hello world</b>";
    }

    @GetMapping("/")
    public String getHome() {
        return "Welcome home...";
    }

    @GetMapping("/test")
    public HelloResponse getTest() {

        HelloResponse hobj = new HelloResponse();
        hobj.status = "OK";
        hobj.data = "Test Data";
        hobj.errors = new String[]{};

        return hobj;
    }

    @GetMapping("/products/{id}")
    public ProductsItem getProduct(@PathVariable("id") String id) throws IOException {
        return productRepository.getProduct(id);
    }
}
