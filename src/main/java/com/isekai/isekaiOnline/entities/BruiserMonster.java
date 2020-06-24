package com.isekai.isekaiOnline.entities;

public class BruiserMonster extends Monster{
    int[] stats;
    int level;
    public BruiserMonster(int[] stats, int level)throws IllegalArgumentException{
        if(stats.length != 7){
            throw new IllegalArgumentException("There must be 7 stats");
        }
        this.stats = stats;
        this.level = level;

    }
}