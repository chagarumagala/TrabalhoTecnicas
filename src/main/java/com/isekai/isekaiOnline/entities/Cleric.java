package com.isekai.isekaiOnline.entities;

public class Cleric extends Character{
    
    protected int calcHP(){
        return stats[5] * 6 + 8;
    }
}