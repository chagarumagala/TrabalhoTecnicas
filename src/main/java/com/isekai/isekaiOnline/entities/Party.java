package com.isekai.isekaiOnline.entities;

import java.util.List;

public class Party {
    List<Character> members;
    PartyLeader pl;
    Dungeon d;

    public Party(PartyLeader pl, Dungeon d){
        this.pl = pl;
        this.d = d;
    }

    public void addMember(Character member){
        members.add(member);
    }

    public void removeMember(Character member){
        members.remove(member);
    }
}