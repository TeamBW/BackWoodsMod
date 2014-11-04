package com.chaka.thebackwoods.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;

public class Recipes {

    public static void init() {

        //Amethyst Tools
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.amethystSword), " A ", " A ", " S ", 'A', new ItemStack(ModItems.amethystItem), 'S', new ItemStack(Item.getItemById(280)));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.amethystPickaxe), "AAA", " S ", " S ", 'A', new ItemStack(ModItems.amethystItem), 'S', new ItemStack(Item.getItemById(280)));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.amethystShovel), " A ", " S ", " S ", 'A', new ItemStack(ModItems.amethystItem), 'S', new ItemStack(Item.getItemById(280)));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.amethystAxe), "AA ", "AS ", " S ", 'A', new ItemStack(ModItems.amethystItem), 'S', new ItemStack(Item.getItemById(280)));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.amethystAxe), " AA", " SA", " S ", 'A', new ItemStack(ModItems.amethystItem), 'S', new ItemStack(Item.getItemById(280)));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.amethystHoe), "AA ", " S ", " S ", 'A', new ItemStack(ModItems.amethystItem), 'S', new ItemStack(Item.getItemById(280)));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.amethystHoe), " AA", " S ", " S ", 'A', new ItemStack(ModItems.amethystItem), 'S', new ItemStack(Item.getItemById(280)));

        //Ruby Tools
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.rubySword), " R ", " R ", " S ", 'R', new ItemStack(ModItems.rubyItem), 'S', new ItemStack(Item.getItemById(280)));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.rubyPickaxe), "RRR", " S ", " S ", 'R', new ItemStack(ModItems.rubyItem), 'S', new ItemStack(Item.getItemById(280)));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.rubyShovel), " R ", " S ", " S ", 'R', new ItemStack(ModItems.rubyItem), 'S', new ItemStack(Item.getItemById(280)));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.rubyAxe), "RR ", "RS ", " S ", 'R', new ItemStack(ModItems.rubyItem), 'S', new ItemStack(Item.getItemById(280)));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.rubyAxe), " RR", " SR", " S ", 'R', new ItemStack(ModItems.rubyItem), 'S', new ItemStack(Item.getItemById(280)));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.rubyHoe), "RR ", " S ", " S ", 'R', new ItemStack(ModItems.rubyItem), 'S', new ItemStack(Item.getItemById(280)));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.rubyHoe), " RR", " S ", " S ", 'R', new ItemStack(ModItems.rubyItem), 'S', new ItemStack(Item.getItemById(280)));

        //Sapphire Tools
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.sapphireSword), " # ", " # ", " S ", '#', new ItemStack(ModItems.sapphireItem), 'S', new ItemStack(Item.getItemById(280)));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.sapphirePickaxe), "###", " S ", " S ", '#', new ItemStack(ModItems.sapphireItem), 'S', new ItemStack(Item.getItemById(280)));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.sapphireShovel), " # ", " S ", " S ", '#', new ItemStack(ModItems.sapphireItem), 'S', new ItemStack(Item.getItemById(280)));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.sapphireAxe), "## ", "#S ", " S ", '#', new ItemStack(ModItems.sapphireItem), 'S', new ItemStack(Item.getItemById(280)));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.sapphireAxe), " ##", " S#", " S ", '#', new ItemStack(ModItems.sapphireItem), 'S', new ItemStack(Item.getItemById(280)));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.sapphireHoe), "## ", " S ", " S ", '#', new ItemStack(ModItems.sapphireItem), 'S', new ItemStack(Item.getItemById(280)));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.sapphireHoe), " ##", " S ", " S ", '#', new ItemStack(ModItems.sapphireItem), 'S', new ItemStack(Item.getItemById(280)));

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.amethyst), "sss", "sss", "sss", 's', new ItemStack(ModItems.amethystItem));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.moss), "sss", "sss", "sss", 's', new ItemStack(ModItems.mossItem));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.ruby), "sss", "sss", "sss", 's', new ItemStack(ModItems.rubyItem));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.sapphire), "sss", "sss", "sss", 's', new ItemStack(ModItems.sapphireItem));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.smeltery), " s ", "sss", "sss", 's', new ItemStack(Block.getBlockById(61)));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.smelteryAdvanced), " s ", "sss", "sss", 's', new ItemStack(ModBlocks.smeltery));

        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.firPlanks), new ItemStack(ModBlocks.firWood));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.greatOakPlanks), new ItemStack(ModBlocks.greatOakWood));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.redwoodPlanks), new ItemStack(ModBlocks.redwoodWood));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.mapleWoodPlanks), new ItemStack(ModBlocks.mapleWood));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.granite), new ItemStack(Block.getBlockById(1)), new ItemStack(Block.getBlockById(4)), new ItemStack(Item.getItemById(406)));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.mossyDirt), new ItemStack(Item.getItemById(3)), new ItemStack(ModItems.mossItem));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.mossyGranite), new ItemStack(ModBlocks.granite), new ItemStack(ModItems.mossItem));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.mossyGreatOakWood), new ItemStack(ModBlocks.greatOakWood), new ItemStack(ModItems.mossItem));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.mossyPath), new ItemStack(ModBlocks.path), new ItemStack(ModItems.mossItem));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.mossyRock), new ItemStack(Block.getBlockById(1)), new ItemStack(ModItems.mossItem));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.mud), new ItemStack(Block.getBlockById(326)), new ItemStack(Block.getBlockById(3)));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.path), new ItemStack(Block.getBlockById(98)), new ItemStack(Block.getBlockById(98)), new ItemStack(Block.getBlockById(98)), new ItemStack(Block.getBlockById(98)));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.quickSand), new ItemStack(Block.getBlockById(12)), new ItemStack(Block.getBlockById(326)));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.mossItem), new ItemStack(Block.getBlockById(106)), new ItemStack(Block.getBlockById(106)), new ItemStack(Block.getBlockById(106)), new ItemStack(Block.getBlockById(106)));
    }
}