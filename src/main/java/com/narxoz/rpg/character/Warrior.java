package com.narxoz.rpg.character;

public class Warrior extends Character {

    public Warrior(String name) {
        super(name, 150, 30, 80, 20);
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(name + " uses BERSERKER Mode");
    }
}
