package com.isekai.isekaiOnline.entities;

import javax.persistence.Entity;

@Entity
public class PartyLeader{
    Character leader;
    Party party;

    public PartyLeader(Character leader, Party party){
        this.leader = leader;
        this.party = party;
    }

    public Party getParty(){
        return party;
    }

    public Character getLeader(){
        return leader;
    }
}