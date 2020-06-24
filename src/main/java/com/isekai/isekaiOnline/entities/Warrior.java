package com.isekai.isekaiOnline.entities;

public class Warrior extends Character{
    
    protected int calcHP(){
        return stats[5] * 8 + 8;
    }
}