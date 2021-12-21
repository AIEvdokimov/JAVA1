package com.company.network;

public class Room {
    public Integer width = 0;
    public Integer lenght = 0;
    public Integer height = 0;
    public String nameOfLivin = "";

    public Room(Integer w, Integer l, Integer h, String n){
        width = w;
        lenght = l;
        height= h;
        nameOfLivin = n;
    }

    public Room(Integer w, Integer l, String n){
        width = w;
        lenght = l;
        nameOfLivin = n;
    }

    public Room(Integer w, Integer l, Integer h){
        width = w;
        lenght = l;
        height= h;
    }

    public Room(){
    }

    public Integer calculate(){
        String somevar = "room 1 ";
        System.out.println(somevar);

        return width + lenght + height;
    }

    public Integer calculate(String newname){

        String somevar = "hi there ";
        System.out.println(somevar + newname);

        return width + lenght + height;
    }

    public void setWidth(Integer w){
        width = w;
    }

    public Integer getWidth(){
        return width;
    }
}
