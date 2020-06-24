package com.isekai.isekaiOnline.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public abstract class Character {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY) long id;
    Inventory inventory;
    int[] att;
    
}