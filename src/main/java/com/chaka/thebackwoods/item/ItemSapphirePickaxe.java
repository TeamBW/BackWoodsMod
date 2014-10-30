package com.chaka.thebackwoods.item;

import com.chaka.thebackwoods.creativetab.CreativeTabTBWTools;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemSapphirePickaxe extends ItemTBW {

    private int maxDamage;

    public ItemSapphirePickaxe() {

        super();
        this.setUnlocalizedName("sapphirePickaxe");
        this.maxStackSize = 1;
        this.setCreativeTab(CreativeTabTBWTools.TBW_TAB_TOOLS);
    }

    @SideOnly(Side.CLIENT)
    public boolean isFull3D() {
        return true;
    }

    public Item setMaxDamage(int p_77656_1_)
    {
        this.maxDamage = 1200;
        return this;
    }

    public boolean isDamageable()
    {
        return this.maxDamage > 0 && !this.hasSubtypes;
    }

    public boolean getShareTag()
    {
        return true;
    }

    public boolean isItemTool(ItemStack p_77616_1_)
    {
        return this.getItemStackLimit(p_77616_1_) == 1 && this.isDamageable();
    }

    public int getItemEnchantability()
    {
        return 5;
    }

    public boolean showDurabilityBar(ItemStack stack)
    {
        return stack.isItemDamaged();
    }
}