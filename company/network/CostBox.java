package com.company.network;

public class CostBox {
    public Integer cost = 0;
    public Integer margin = 0;

    public CostBox(Integer c, Integer m, Integer p){
        cost = c;
        margin = m;
    }

    public CostBox(int c, int m) {
    }

    public Integer pricing (){
        return cost + margin;
    }

}
