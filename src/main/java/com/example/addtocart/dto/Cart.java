package com.example.addtocart.dto;

public class Cart {
    private int proId;
    private int quantity;
    private int price;
    public int getPro_Id()
    {
        return proId;
    }
    public void setProId(int proId)
    {
        proId=this.proId;
    }
    public int getQuantity()
    {
        return quantity;
    }
    public void setQuantity(int quantity)
    {
        quantity=this.quantity;
    }
    public int getPrice()
    {
        return price;
    }
    public void setPrice(int price)
    {
        price=this.price;
    }

}
