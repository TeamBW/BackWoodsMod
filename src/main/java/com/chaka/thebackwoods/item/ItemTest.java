package com.chaka.thebackwoods.item;

import com.chaka.thebackwoods.init.ModItems;
import net.minecraft.potion.PotionHelper;

public class ItemTest extends ItemTBWTest {

    public ItemTest() {

        super();
        this.setUnlocalizedName("testItem");

        //Renders As a 3d Item
        this.setFull3D();

        //Crafting Return
        this.setContainerItem(ModItems.mossItem);

        //The Damage Of The Item - Machine That Takes Damage i.e 999
        this.setMaxDamage(1000);
    }
}
