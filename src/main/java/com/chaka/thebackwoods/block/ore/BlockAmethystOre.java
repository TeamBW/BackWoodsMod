package com.chaka.thebackwoods.block.ore;

import com.chaka.thebackwoods.block.BlockTBW;
import com.chaka.thebackwoods.init.ModBlocks;
import com.chaka.thebackwoods.init.ModItems;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.Random;

public class BlockAmethystOre extends BlockTBW {

    public BlockAmethystOre() {

        super(Material.rock);
        this.setBlockName("amethystOre");
        this.setStepSound(soundTypeStone);
        this.setHardness(2.0F);
        this.setHarvestLevel("pickaxe", 3);
    }

    public Item getItemDropped(int metadata, Random rand, int fortune) {

        return ModItems.amethystItem;
    }

    public int quantityDropped(Random rand) {

        return 1 + rand.nextInt(4);
    }
}