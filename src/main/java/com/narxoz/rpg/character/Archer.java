package com.narxoz.rpg.character;

public class Archer extends Character {

    public Archer(String name) {
        super(name, 110, 60, 60, 50);
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(name + " uses MULTI-SHOT!");
    }
}
