package com.chaka.thebackwoods.init;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

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

        //DeadWood Recipes
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.deadWoodPlanks, 4), new ItemStack(ModBlocks.deadWood));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.deadWoodSlab, 6), "   ", "   ", "###", '#', new ItemStack(ModBlocks.deadWoodPlanks));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.deadWoodSlab, 6), "   ", "###", "   ", '#', new ItemStack(ModBlocks.deadWoodPlanks));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.deadWoodSlab, 6), "###", "   ", "   ", '#', new ItemStack(ModBlocks.deadWoodPlanks));

        //Fir Wood Recipes
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.firPlanks, 4), new ItemStack(ModBlocks.firWood));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.firWoodSlab, 6), "   ", "   ", "###", '#', new ItemStack(ModBlocks.firPlanks));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.firWoodSlab, 6), "   ", "###", "   ", '#', new ItemStack(ModBlocks.firPlanks));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.firWoodSlab, 6), "###", "   ", "   ", '#', new ItemStack(ModBlocks.firPlanks));

        //GreatOak Wood Recipes
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.greatOakPlanks, 4), new ItemStack(ModBlocks.greatOakWood));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.greatOakPlanks, 6), "   ", "   ", "###", '#', new ItemStack(ModBlocks.greatOakPlanks));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.greatOakPlanks, 6), "   ", "###", "   ", '#', new ItemStack(ModBlocks.greatOakPlanks));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.greatOakPlanks, 6), "###", "   ", "   ", '#', new ItemStack(ModBlocks.greatOakPlanks));

        //Maple Wood Recipes
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.mapleWoodPlanks, 4), new ItemStack(ModBlocks.mapleWood));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.mapleWoodSlab, 6), "   ", "   ", "###", '#', new ItemStack(ModBlocks.mapleWoodPlanks));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.mapleWoodSlab, 6), "   ", "###", "   ", '#', new ItemStack(ModBlocks.mapleWoodPlanks));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.mapleWoodSlab, 6), "###", "   ", "   ", '#', new ItemStack(ModBlocks.mapleWoodPlanks));

        //Redwood Wood Recipes
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.redwoodPlanks, 4), new ItemStack(ModBlocks.redwoodWood));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.redwoodSlab, 6), "   ", "   ", "###", '#', new ItemStack(ModBlocks.redwoodPlanks));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.redwoodSlab, 6), "   ", "###", "   ", '#', new ItemStack(ModBlocks.redwoodPlanks));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.redwoodSlab, 6), "###", "   ", "   ", '#', new ItemStack(ModBlocks.redwoodPlanks));

        //Other Shaped Recipes

        //Gems - Block
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.amethyst), "###", "###", "###", '#', new ItemStack(ModItems.amethystItem));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.sapphire), "###", "###", "###", '#', new ItemStack(ModItems.sapphireItem));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.ruby), "###", "###", "###", '#', new ItemStack(ModItems.rubyItem));

        //Other Shapeless Recipes
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.granite), new ItemStack(Blocks.stone), new ItemStack(Blocks.dirt), new ItemStack(Blocks.gravel));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.moss), new ItemStack(Blocks.vine), new ItemStack(Blocks.vine), new ItemStack(Blocks.vine), new ItemStack(Blocks.vine));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.path), new ItemStack(Blocks.stonebrick));

        //Other Smelting Recipes
        GameRegistry.addSmelting(new ItemStack(Blocks.dirt), new ItemStack(ModBlocks.driedDirt), 5.0F);
        GameRegistry.addSmelting(new ItemStack(Blocks.glass), new ItemStack(ModBlocks.clearGlass), 5.0F);

        //Ingot Smelting
    }
}