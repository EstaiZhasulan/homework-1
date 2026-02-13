package com.narxoz.rpg.equipment;

public class EnchantedRobes implements Armor {

    private final int defense = 10;

    @Override
    public int getDefense() {
        return defense;
    }

    @Override
    public String getArmorInfo() {
        return "Enchanted Robes (Magic) - Defense: " + defense + ", Mana Boost: +25";
    }
}
