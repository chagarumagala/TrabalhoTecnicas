package com.isekai.isekaiOnline.entities;

public class CharacterBuilder implements Builder{
    int[] stats;
    int statTotal = 0;
    int level;

    public void addLevel(int i ){
        this.level = i;
    }
    public CharacterBuilder(){
        stats = new int[7];
    }

    @Override
    public void addStr(int str) {
        stats[0] = str;
        statTotal += str;
    }

    @Override
    public void addDex(int dex) {
        // TODO Auto-generated method stub
        stats[1] = dex;
        statTotal += dex;
    }

    @Override
    public void addCon(int con) {
        // TODO Auto-generated method stub
        stats[2] = con;
        statTotal += con;
    }

    @Override
    public void addWis(int wis) {
        // TODO Auto-generated method stub
        stats[3] = wis;
        statTotal += wis;
    }

    @Override
    public void addInt(int intel) {
        // TODO Auto-generated method stub
        stats[4] = intel;
        statTotal += intel;
    }

   
    
}