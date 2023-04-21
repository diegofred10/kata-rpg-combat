package com.factoriaf5.kata;

public class Character {
    private String name;
    private int health = 1000;
    private int level = 1;
    private boolean life = true;

    public Character(String name, int health, int level, boolean life) {
        this.name = name;
        this.health = health;
        this.level = level;
        this.life = life;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isLife() {
        return life;
    }

    public void setLife(boolean life) {
        this.life = life;
    }

}
