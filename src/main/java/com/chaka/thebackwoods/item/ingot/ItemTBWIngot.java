package com.chaka.thebackwoods.item.ingot;

import com.chaka.thebackwoods.creativetab.CreativeTabTBWItems;
import com.chaka.thebackwoods.creativetab.CreativeTabTBWTools;
import com.chaka.thebackwoods.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

import java.util.List;

public class ItemTBWIngot extends ItemSword {

    public ItemTBWIngot(ToolMaterial material) {

        super(material);
        this.setCreativeTab(CreativeTabTBWItems.TBW_TAB_ITEMS);
        this.hasSubtypes(true);
        this.setUnlocalizedName("itemTBWIngot");
    }

    private void hasSubtypes(boolean b) {

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

    public void getSubItems(Item i, CreativeTabs c, List l) {

        l.add(new ItemStack(i, 1, 0));
        l.add(new ItemStack(i, 1, 1));
        l.add(new ItemStack(i, 1, 2));
        l.add(new ItemStack(i, 1, 3));
        l.add(new ItemStack(i, 1, 4));
    }
}
