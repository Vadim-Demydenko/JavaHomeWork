package com.pb.demidenko.hw7;

public class Tie extends Clothes implements ManClothes{
    public Tie(Size sizeClothes, float price, String strColorCl) {
        super(sizeClothes, price, strColorCl);
    }

    @Override
    public void dressMan(){
        System.out.println("Брюки мужские: размер " + sizeClothes + " цена " + price +" цвет " + strColorCl);
    }
}
