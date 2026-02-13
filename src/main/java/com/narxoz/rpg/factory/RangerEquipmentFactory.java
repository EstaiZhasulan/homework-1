package com.narxoz.rpg.factory;

import com.narxoz.rpg.equipment.*;

public class RangerEquipmentFactory implements EquipmentFactory {

    @Override
    public Weapon createWeapon() {
        return new Longbow();
    }

    @Override
    public Armor createArmor() {
        return new LeatherArmor();
    }
}
