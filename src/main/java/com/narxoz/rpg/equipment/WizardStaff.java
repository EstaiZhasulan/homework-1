package com.narxoz.rpg.equipment;

public class WizardStaff implements Weapon {

    private final int damage = 15;

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public String getWeaponInfo() {
        return "Wizard Staff (Magic) - Damage: " + damage + ", Mana Boost: +20";
    }
}
