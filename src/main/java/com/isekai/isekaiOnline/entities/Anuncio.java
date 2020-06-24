package com.isekai.isekaiOnline.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Anuncio {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY) long id;
    Dungeon dungeon;
    PartyLeader pl;
    String title;
    String description;

}