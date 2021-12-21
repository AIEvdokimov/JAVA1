package com.company.network;

public class Box {
        public Integer width = 0;
        public Integer lenght = 0;
        public Integer height = 0;

        public Box(Integer w, Integer l, Integer h){
            width = w;
            lenght = l;
            height= h;
        }

        public Integer square (){
            return width * lenght;
        }

}
