package com.pb.demidenko.hw7;

public class Tshirt extends Clothes implements ManClothes, WomenClothes{

    public Tshirt(Size sizeClothes, float price, String strColorCl) {
        super(sizeClothes, price, strColorCl);
    }

    @Override
   public void dressMan(){
        System.out.println("Футболка мужскач: размер " + sizeClothes + " цена " + price +" цвет " + strColorCl);
    }

    @Override
   public void dressWomen(){
        System.out.println("Футболка женская: размер " + sizeClothes + " цена " + price +" цвет " + strColorCl);
    }


}
