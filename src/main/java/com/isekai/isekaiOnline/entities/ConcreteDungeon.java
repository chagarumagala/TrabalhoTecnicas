package com.isekai.isekaiOnline.entities;

import java.util.List;

public class ConcreteDungeon extends Dungeon {
    private List<Monster> monsters;
    private String nome;
    private String descr;

    public String getNome(){
        return this.nome;
    }

    public String getDescr(){
        return this.descr;
    }
    
    @Override
    public int getDifficulty() {
        int total = 0;
        for(Monster m: monsters){
            total = m.getLevel();
        }
        return total / monsters.size();
    }
}