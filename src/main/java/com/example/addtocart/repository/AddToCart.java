package com.example.addtocart.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AddToCart {

    @Autowired
    JdbcTemplate jdbcTemplate;
    public void addToCartItem(int quantity,int proId)
    {
    String sql="Update Cart SET quantity=quantity + ? where pro_id=? ";
    jdbcTemplate.update(sql,quantity,proId);
    }

    
    
}
