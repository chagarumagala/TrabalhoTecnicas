package com.isekai.isekaiOnline.entities;

public class CharacterBuilder implements Builder{
    int[] stats;
    
    public CharacterBuilder(){
        stats = new int[7];
    }

    @Override
    public void addStr(int str) {
        // TODO Auto-generated method stub
        stats[0] = str;
    }

    @Override
    public void addDex(int dex) {
        // TODO Auto-generated method stub
        stats[1] = dex;
    }

    @Override
    public void addCon(int con) {
        // TODO Auto-generated method stub
        stats[2] = con;
    }

    @Override
    public void addWis(int wis) {
        // TODO Auto-generated method stub
        stats[3] = wis;
    }

    @Override
    public void addInt(int intel) {
        // TODO Auto-generated method stub
        stats[4] = intel;
    }

   
    
}