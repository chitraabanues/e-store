package com.example.addtocart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.addtocart.dto.Inventory;
import com.example.addtocart.repository.AddToCart;
import com.example.addtocart.repository.CartRepository;

@Service
public class CartService {

    @Autowired
    CartRepository cartRepository;

    @Autowired
    AddToCart addToCart;
    
    public String checkInventory(int proId)
    {
        int availableStock=cartRepository.checkInventory(proId);
        return availableStock!=0 ?"Stock is available":"Stock unavailable";
    }
    public String addToCart(int quantity,int proId)
    {
      int availableStock=cartRepository.checkInventory(proId);
      if(availableStock>=quantity)
      {
      addToCart.addToCartItem(quantity, proId);
      cartRepository.reduceQuantity(quantity, proId);
      return "Item added to cart";
      }
      else{
        return "Item not added";

      }
       


    }

}
