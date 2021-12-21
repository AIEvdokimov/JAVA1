package com.company.network;

public class BoxPrice1 {
    private Integer priceofbox = 0;
    private String trademark;
    public String boxname;

    public BoxPrice1 (Integer pb, String tm, String bn){
        priceofbox = pb;
        trademark = tm;
        boxname = bn;
    }

    public BoxPrice1(double v, String lamba, String marusha) {
        trademark = "";
        boxname = "";
    }

    public String Label (){
        return ("price of" + " trademark" + " is" + " priceofbox");

        // тут я хочел чтобы он напречатал мне ярлык: мол коробка такой то марки стоит столько то, но не получислось

    }


}
