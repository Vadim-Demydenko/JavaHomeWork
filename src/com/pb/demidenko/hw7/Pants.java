package com.pb.demidenko.hw7;

public class Pants extends Clothes implements ManClothes, WomenClothes{

    public Pants(Size sizeClothes, float price, String strColorCl) {
        super(sizeClothes, price, strColorCl);
    }

    @Override
    public void dressMan(){
        System.out.println("Брюки мужские: размер " + sizeClothes + " цена " + price +" цвет " + strColorCl);
    }

    @Override
    public void dressWomen(){
        System.out.println("Брюки женские: размер " + sizeClothes + " цена " + price +" цвет " + strColorCl);
    }
}
