package com.isekai.isekaiOnline.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Anuncio {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY) long id;
    Party party;
    String title;
    String description;

    public Anuncio(Party party, String title, String description){
        this.party = party;
        this.title = title;
        this.description = description;
    }

    
}