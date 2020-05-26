package com.example.recyclerviewsampleapp;

import java.util.ArrayList;

public class MyListData {

    public String number;

    public MyListData(String mNumber){
        this.number = mNumber;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public static ArrayList<MyListData> createNumberList(int count){
        ArrayList<MyListData> numbers = new ArrayList<>();
        for(int i=1; i<=count; i++){
            numbers.add(new MyListData(String.valueOf(i)));
        }
        return numbers;
    }
}
