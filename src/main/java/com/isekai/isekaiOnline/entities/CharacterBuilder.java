package com.isekai.isekaiOnline.entities;

public class CharacterBuilder implements Builder{
    int[] stats;
    int statTotal = 0;
    int level;
    CharacterKind ck;

    public void addCharacterKind(CharacterKind ck){
        this.ck = ck;
    }
    public void addLevel(int i ){
        this.level = i;
    }
    public CharacterBuilder(){
        stats = new int[7];
    }

    @Override
    public void addStr(int str) {
        stats[0] = str;
        statTotal += str;
    }

    @Override
    public void addDex(int dex) {
        stats[1] = dex;
        statTotal += dex;
    }

    @Override
    public void addCon(int con) {
        stats[2] = con;
        statTotal += con;
    }

    @Override
    public void addWis(int wis) {
        stats[3] = wis;
        statTotal += wis;
    }

    @Override
    public void addInt(int intel) {
        stats[4] = intel;
        statTotal += intel;
    }

    public Character returnCharacter(){
        switch(ck){
            case MAGE:
                return new Mage(stats, level);
            case WARRIOR:
                return new Warrior(stats, level);
            case CLERIC:
                return new Cleric(stats, level);
            case ROGUE:
                return new Rogue(stats, level);
            default:
                return null;
        }
    }
   
    
}