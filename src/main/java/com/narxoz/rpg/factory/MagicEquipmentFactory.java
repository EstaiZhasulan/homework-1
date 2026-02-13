package com.narxoz.rpg.factory;

import com.narxoz.rpg.equipment.*;

public class MagicEquipmentFactory implements EquipmentFactory {

    @Override
    public Weapon createWeapon() {
        return new WizardStaff();
    }

    @Override
    public Armor createArmor() {
        return new EnchantedRobes();
    }
}
