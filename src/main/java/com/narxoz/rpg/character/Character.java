package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.Armor;


public abstract class Character {

    protected String name;
    protected int health;
    protected int mana;
    protected int strength;
    protected int intelligence;

    protected Weapon weapon;
    protected Armor armor;

    public Character(String name, int health, int mana, int strength, int intelligence) {
        this.name = name;
        this.health = health;
        this.mana = mana;
        this.strength = strength;
        this.intelligence = intelligence;
    }

    public String getName() {
        return name;
    }

    public void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void equipArmor(Armor armor) {
        this.armor = armor;
    }

    public void displayStats() {
        System.out.println("=== " + name + " ===");
        System.out.println("Health: " + health);
        System.out.println("Mana: " + mana);
        System.out.println("Strength: " + strength);
        System.out.println("Intelligence: " + intelligence);

        if (weapon != null) {
            System.out.println("Weapon: " + weapon.getWeaponInfo());
        }

        if (armor != null) {
            System.out.println("Armor: " + armor.getArmorInfo());
        }
    }

    public abstract void useSpecialAbility();
}
