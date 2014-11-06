package com.chaka.thebackwoods.item.armor;

import com.chaka.thebackwoods.item.ItemRuby;

public class ItemRubyBoots extends ItemTBWArmor {

    public ItemRubyBoots(ArmorMaterial armorMaterial, int renderIndex, int armorType) {

        super(armorMaterial, renderIndex, armorType);
        this.setUnlocalizedName("rubyBoots");
        this.setFull3D();
    }
}