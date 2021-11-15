package com.pb.demidenko.hw7;

public class Skirt extends Clothes implements WomenClothes{
    public Skirt(Size sizeClothes, float price, String strColorCl) {
        super(sizeClothes, price, strColorCl);
    }

    @Override
    public void dressWomen(){
        System.out.println("Юбка: размер " + sizeClothes + " цена " + price +" цвет " + strColorCl);
    }

}
