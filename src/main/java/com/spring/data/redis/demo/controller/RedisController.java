package com.spring.data.redis.demo.controller;


import com.spring.data.redis.demo.dao.ProductDao;
import com.spring.data.redis.demo.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class RedisController
{

@Autowired
private ProductDao productDao;

     @PostMapping
    public Product addProduct(@RequestBody Product product)
    {
       return productDao.save(product);
    }

    @GetMapping("/getAll")
    public List<Product> getAllProducts()
    {
        return productDao.findAll();
    }

    @GetMapping("/get/{id}")
    public Product getProduct(@PathVariable int id)
    {
        return productDao.findProductById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id)
    {
        return productDao.deleteProductByID(id);
    }
}
