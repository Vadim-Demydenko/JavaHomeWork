package com.pb.demidenko.hw7;

public enum Size {
    XXS, XS, S, M, L;

    private String description;
    private int euroSize;

        Size(String description, int euroSize) {
        this.description = description;
        this.euroSize = euroSize;

    }

    Size() {

    }

    public String  getDescription(Size level) {
        switch (level) {
            case XXS:
                return  "Детский размер";
            case XS:
            case S:
            case M:
            case L:
               return  "Взрослый размер";
        }
    return "Получен не верный тип размера, отличный рт допустимых XXS, XS, S, M, L";
    }
    public int getEuroSize(Size level) {
        switch (level) {
            case XXS: return 32;
            case XS: return 34;
            case S: return 36;
            case M: return 38;
            case L: return 40;
            default:
                System.out.println("Получен не верный тип размера, отличный рт допустимых XXS, XS, S, M, L");
                return 0;
        }

    }


}
