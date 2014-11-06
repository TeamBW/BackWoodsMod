package com.chaka.thebackwoods.item.armor;

import com.chaka.thebackwoods.creativetab.CreativeTabTBWItems;
import com.chaka.thebackwoods.creativetab.CreativeTabTBWTools;
import com.chaka.thebackwoods.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemTBWArmor extends ItemArmor {

    public ItemTBWArmor(ArmorMaterial armorMaterial, int renderIndex, int armorType) {

        super(armorMaterial, renderIndex, armorType);
        this.setCreativeTab(CreativeTabTBWTools.TBW_TAB_TOOLS);
    }

    @Override
    public String getUnlocalizedName() {

        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack) {

        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {

        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName) {

        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {

        if(this.armorType == 2) {

            return "TheBackWoods:textures/models/armor/amethyst_layer_1.png";
        }
        return "TheBackWoods:textures/models/armor/amethyst_layer_1.png";
    }
}
