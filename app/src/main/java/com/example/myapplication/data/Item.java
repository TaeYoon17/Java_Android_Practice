package com.example.myapplication.data;

public final class Item {
    private int iv_profile;
    private String tv_name;
    private String tv_desc;

    public Item(int iv_profile,String tv_name,String tv_desc){
        this.iv_profile = iv_profile;
        this.tv_name = tv_name;
        this.tv_desc = tv_desc;
    }

    public int getIv_profile(){ return iv_profile; }

    public void setIv_profile(int iv_profile){
        this.iv_profile = iv_profile;
    }

    public String getTv_name(){ return this.tv_name; }
    public void setTv_name(String tv_name){
        this.tv_name = tv_name;
    }

    public String getTv_desc(){ return tv_desc; }
    public void setTv_desc(String tv_desc) { this.tv_desc = tv_desc; }
}
