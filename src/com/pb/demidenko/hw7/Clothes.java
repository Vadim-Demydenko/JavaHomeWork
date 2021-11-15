package com.pb.demidenko.hw7;

public abstract class Clothes {
    protected Size sizeClothes;
    protected float price;
    protected String strColorCl;

    Clothes(Size sizeClothes, float price, String strColorCl){
        this.sizeClothes = sizeClothes;
        this.price = price;
        this.strColorCl = strColorCl;
    }


}
