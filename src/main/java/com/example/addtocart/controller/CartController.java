package com.example.addtocart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.addtocart.dto.Inventory;
import com.example.addtocart.service.CartService;

@RestController
public class CartController {

    @Autowired
    CartService cartService;
    

    @PostMapping("/inventorycheck/{proId}")
    public String checKInventory(@PathVariable int proId)
    {
        return cartService.checkInventory(proId);
    }
    @PostMapping("/addtocart/{quantity}/{proId}")
    public String addToCart(@PathVariable int quantity,@PathVariable int proId)
    {
        return cartService.addToCart(quantity, proId);
    }


}
