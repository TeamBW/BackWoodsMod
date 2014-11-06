package com.chaka.thebackwoods.item.armor;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;

public class ItemAmethystHelmet extends ItemTBWArmor {

    public ItemAmethystHelmet(ArmorMaterial armorMaterial, int renderIndex, int armorType) {

        super(armorMaterial, renderIndex, armorType);
        this.setUnlocalizedName("amethystHelmet");
        this.setFull3D();
    }
}
