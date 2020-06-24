package com.isekai.isekaiOnline.entities;

public class BursterMonster extends Monster{
    int[] stats;
    int level;
    public BursterMonster(int[] stats, int level)throws IllegalArgumentException{
        if(stats.length != 7){
            throw new IllegalArgumentException("There must be 7 stats");
        }
        this.stats = stats;
        this.level = level;

    }
}