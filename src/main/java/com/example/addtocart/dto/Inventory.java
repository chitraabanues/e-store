package com.example.addtocart.dto;

public class Inventory {
    
    public int quantity;
    public int proId;
    public int getProdId()
    {
        return proId;

    }
    public void setProdId(int proId)
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


}
