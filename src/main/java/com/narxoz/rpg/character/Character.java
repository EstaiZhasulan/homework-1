package com.narxoz.rpg.character;

public abstract class Character {
    protected String name;
    protected int health;
    protected int attack;
    protected int defense;
    protected String specialAbility;
    protected Weapon weapon;
    protected Armor armor;

    public Character(String name, int health, int attack, int defense, String specialAbility) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.specialAbility = specialAbility;
    }

    // Equip a weapon
    public void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
        System.out.println(name + " equipped " + weapon.getName());
    }

    // Equip an armor piece
    public void equipArmor(Armor armor) {
        this.armor = armor;
        System.out.println(name + " equipped " + armor.getName());
    }

    // Use special ability
    public void useSpecialAbility() {
        System.out.println(name + " uses " + specialAbility + "!");
    }

    // Display character stats and equipped items
    public void displayStats() {
        System.out.println("\n=== " + name + " Stats ===");
        System.out.println("Health: " + health);
        int totalAttack = attack + (weapon != null ? weapon.getAttackPower() : 0);
        System.out.println("Attack: " + totalAttack +
                " (Base " + attack +
                " + " + (weapon != null ? weapon.getAttackPower() : 0) +
                " from weapon)");
        int totalDefense = defense + (armor != null ? armor.getDefensePower() : 0);
        System.out.println("Defense: " + totalDefense +
                " (Base " + defense +
                " + " + (armor != null ? armor.getDefensePower() : 0) +
                " from armor)");
        System.out.println("Special Ability: " + specialAbility);
    }
}

