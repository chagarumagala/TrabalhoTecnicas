package com.isekai.isekaiOnline.entities;

public class MonsterBuilder implements Builder{
    private int[] stats;
    private int statTotal = 0;
    private int level = 0;
    private MonsterKind mk;

    public MonsterKind getMonsterKind() {
        return this.mk;
    }

    public MonsterBuilder(){
        stats = new int[7];
    }

    public void addLevel(int i ){
        this.level = i;
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
    
    public Monster getMonster(){
        switch(mk){
            case  BRUISERMONSTER:
                return new BruiserMonster(stats, level);
            case ANTIMAGEMONSTER:
                return new AntiMageMonster(stats, level);
            case BURSTERMONSTER:
                return new BursterMonster(stats, level);
            default:
                return null;
        }
    }
}