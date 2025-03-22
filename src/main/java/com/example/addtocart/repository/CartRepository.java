package com.example.addtocart.repository;

import java.sql.ResultSet;
import java.sql.SQLException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.addtocart.dto.Inventory;
@Repository
public class CartRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    public int checkInventory(int proId)
    {
       
        String sql="SELECT quantity FROM inventory WHERE pro_id = ?";
        return jdbcTemplate.queryForObject(sql,Integer.class,proId);
    }
    public void reduceQuantity(int quantity,int proId)
    {
        String sql="UPDATE inventory SET quantity=quantity - ? where pro_id=?";
        jdbcTemplate.update(sql,quantity,proId);
    }
    

}
