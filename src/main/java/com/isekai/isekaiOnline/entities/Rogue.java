package com.isekai.isekaiOnline.entities;

public class Rogue extends Character{
    
    protected int calcHP(){
        return stats[5] * 6 + 6;
    }
}