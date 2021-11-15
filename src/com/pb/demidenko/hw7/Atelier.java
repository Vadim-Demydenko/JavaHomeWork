package com.pb.demidenko.hw7;

public class Atelier {


    public static void main(String[] args) {
        Pants pant = new Pants(Size.S, 23.6f, "белые");
        Skirt skirt = new Skirt(Size.M, 789.12f, "Синяя");
        Tie tie = new Tie(Size.L, 456.2f, "Желтый");
        Tshirt tshirt = new Tshirt(Size.L, 45.25F, "синяя");
        Clothes[] clothe = {pant, skirt, tie, tshirt};
        dressMan(clothe);
        dressWomen(clothe);

    }

    public static void dressMan(Clothes[] clothes) {
        for (Clothes clothe : clothes) {
            if ((clothe instanceof Pants) || (clothe instanceof Tshirt) ||
                    (clothe instanceof Tie)) {
                ((ManClothes) clothe).dressMan();
            }


        }
    }
        public static void dressWomen(Clothes[] clothes) {
            for (Clothes clothe : clothes) {
                if ((clothe instanceof Pants) || (clothe instanceof Tshirt) ||
                        (clothe instanceof Skirt)) {
                    ((WomenClothes) clothe).dressWomen();
                }


            }
        }



}