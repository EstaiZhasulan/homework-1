package com.narxoz.rpg.character;

public class Mage extends Character {

    public Mage(String name) {
        super(name, 80, 150, 20, 90);
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(name + " casts ARCANE BLAST!");
    }
}
