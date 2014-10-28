package com.chaka.thebackwoods.block;

import com.chaka.thebackwoods.init.ModItems;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.ArrayList;

public class BlockAmethystOre extends BlockTBW {

    public BlockAmethystOre() {

        super(Material.rock);
        this.setBlockName("amethystOre");
        this.setStepSound(soundTypeStone);
        this.setHardness(2.0F);
    }

    public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {

        ArrayList<ItemStack> ret = new ArrayList<ItemStack>();

        int count = quantityDropped(metadata, fortune, world.rand);
        for(int i = 0; i < count; i++) {

            Item item = getItemDropped(metadata, world.rand, fortune);
            if (item != null) {

                ret.add(new ItemStack(ModItems.amethystItem, 1, damageDropped(metadata)));
            }
        }
        return ret;
    }
}