package com.chaka.thebackwoods.item.wand;

import com.chaka.thebackwoods.creativetab.CreativeTabTBWMagic;
import com.chaka.thebackwoods.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemTBWWand extends Item {

    public ItemTBWWand() {

        super();
        this.setUnlocalizedName("wandWood");
        this.setCreativeTab(CreativeTabTBWMagic.TBW_TAB_MAGIC);
        this.hasSubtypes();
        this.setFull3D();
    }

    private void hasSubtypes() {

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
}
