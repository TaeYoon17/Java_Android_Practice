package com.example.myapplication.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DataClass{
    @Expose
    @SerializedName("name") String name;

    public String getName(){return name;}
    public void setName(String name){this.name = name;}
}
