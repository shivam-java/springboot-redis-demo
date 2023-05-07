package com.spring.data.redis.demo.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@RedisHash("Product")
@Getter
@Setter
public class Product implements Serializable
{
    @Id
    private int id;
    private String name;
    private int qty;
    private int price;
}
