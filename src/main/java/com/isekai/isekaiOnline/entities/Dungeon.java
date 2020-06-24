package com.isekai.isekaiOnline.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public abstract class Dungeon {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY) long id;

    public abstract int getDifficulty();
}