package com.chaka.thebackwoods.block;

import com.chaka.thebackwoods.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockSapphireOre extends BlockTBW {

    public BlockSapphireOre() {

        super(Material.rock);
        this.setBlockName("sapphireOre");
        this.setStepSound(soundTypeStone);
    }

    public int quantityDropped(Random p_149745_1_) {

        return 4;
    }

    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {

        return Item.getItemFromBlock(Block.getBlockFromItem(ModItems.sapphireItem));
    }
}
