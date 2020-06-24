package com.isekai.isekaiOnline.entities;

public class Cleric extends Character{
    int[] stats;
    int level;
    public Cleric(int[] stats, int level)throws IllegalArgumentException{
        if(stats.length != 7){
            throw new IllegalArgumentException("There must be 7 stats");
        }
        this.stats = stats;
        this.level = level;

    }
    protected int calcHP(){
        return stats[5] * 6 + 8;
    }
}