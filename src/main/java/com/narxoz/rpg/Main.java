package com.narxoz.rpg;

import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.factory.*;
import com.narxoz.rpg.equipment.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== RPG Character & Equipment System ===\n");

        System.out.println("Choose your character type:");
        System.out.println("1 - Warrior");
        System.out.println("2 - Mage");
        System.out.println("3 - Archer");
        System.out.print("Enter choice (1-3): ");

        int charChoice = readInt(scanner, 1, 3);
        scanner.nextLine();

        System.out.print("Enter character name: ");
        String name = scanner.nextLine().trim();
        if (name.isEmpty()) {
            name = switch (charChoice) {
                case 1 -> "Warrior";
                case 2 -> "Mage";
                default -> "Archer";
            };
        }

        CharacterFactory characterFactory;
        switch (charChoice) {
            case 1 -> characterFactory = new WarriorFactory();
            case 2 -> characterFactory = new MageFactory();
            default -> characterFactory = new ArcherFactory();
        }

        Character character = characterFactory.createCharacter(name);

        System.out.println("\nChoose equipment theme:");
        System.out.println("1 - Medieval");
        System.out.println("2 - Magic");
        System.out.println("3 - Ranger");
        System.out.print("Enter choice (1-3): ");

        int equipChoice = readInt(scanner, 1, 3);
        scanner.nextLine();

        EquipmentFactory equipmentFactory;
        switch (equipChoice) {
            case 1 -> equipmentFactory = new MedievalEquipmentFactory();
            case 2 -> equipmentFactory = new MagicEquipmentFactory();
            default -> equipmentFactory = new RangerEquipmentFactory();
        }

        Weapon weapon = equipmentFactory.createWeapon();
        Armor armor = equipmentFactory.createArmor();

        character.equipWeapon(weapon);
        character.equipArmor(armor);

        System.out.println("\n--- Character summary ---");
        character.displayStats();
        character.useSpecialAbility();

        System.out.println("\nThank you for playing :)");
        scanner.close();
    }


    private static int readInt(Scanner scanner, int min, int max) {
        while (true) {
            if (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Enter a number: ");
                scanner.next();
                continue;
            }
            int v = scanner.nextInt();
            if (v < min || v > max) {
                System.out.print("Choice out of range. Enter (" + min + "-" + max + "): ");
                continue;
            }
            return v;
        }
    }
}
