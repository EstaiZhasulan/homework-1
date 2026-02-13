package com.narxoz.rpg.equipment;

public class IronSword implements Weapon {

    private final int damage = 25;

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public String getWeaponInfo() {
        return "Iron Sword (Medieval) - Damage: " + damage;
    }
}
