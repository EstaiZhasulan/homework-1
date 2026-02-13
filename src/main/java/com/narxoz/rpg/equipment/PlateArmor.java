package com.narxoz.rpg.equipment;

public class PlateArmor implements Armor {

    private final int defense = 30;

    @Override
    public int getDefense() {
        return defense;
    }

    @Override
    public String getArmorInfo() {
        return "Plate Armor (Medieval) - Defense: " + defense;
    }
}
