package com.company.network;

public class BoxWeight {
    public Integer volume = 0;
    public Integer price = 0;

    public BoxWeight(Integer v, Integer p){
        volume = v;
        price = p;
    }

    public String effective (){
        return String.valueOf(volume / price);
    }

}
