package com.chaka.thebackwoods.block.other;

import com.chaka.thebackwoods.block.BlockTBW;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockMossyRock extends BlockTBW {

    public BlockMossyRock() {

        super(Material.rock);
        this.setBlockName("mossyRock");
        this.setHardness(1.5F);
    }


    public Item getItemDropped(int metadata, Random rand, int fortune) {

        return Item.getItemById(48);
    }

    public int quantityDropped(Random rand) {

        return 1;
    }
}
