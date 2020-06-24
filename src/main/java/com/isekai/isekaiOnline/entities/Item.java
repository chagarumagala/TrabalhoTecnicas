package com.isekai.isekaiOnline.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY) long id;
    private String name;
    private String description;
    private int[] attChange = new int[7];

    public Item(String name, String description, int[] attChange){
        this.name = name;
        this.description = description;
        this.attChange = attChange;
    }

    public String getName(){
        return this.name;
    }
    public String getDescription(){
        return this.description;
    }
    public int[] getStatusChange(){
        return this.attChange;
    }
}