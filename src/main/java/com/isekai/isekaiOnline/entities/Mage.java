package com.isekai.isekaiOnline.entities;

public class Mage extends Character{
    
    protected int calcHP(){
        return stats[5] * 4 + 4;
    }
}