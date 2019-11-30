package com.example.hotelapp;

public class Hotel {
    private String name;
    private int imageId;
    private int price;
    public Hotel(String name,int imageId,int price){
        this.name=name;
        this.imageId=imageId;
        this.price=price;
    }
    public String getName(){
        return  name;
    }
    public int getImageId(){
        return imageId;
    }

    public int getPrice() {
        return price;
    }
}
