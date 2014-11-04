package com.chaka.thebackwoods.init;

import com.chaka.thebackwoods.item.*;
import com.chaka.thebackwoods.item.tool.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {

    //Tool Constructors
    public static final Item.ToolMaterial amethystToolMaterial = EnumHelper.addToolMaterial("amethystToolMaterial", 4, 2600, 10.0F, 8.0F, 30);
    public static final Item.ToolMaterial rubyToolMaterial = EnumHelper.addToolMaterial("rubyToolMaterial", 2, 1600, 7.0F, 5.0F, 30);
    public static final Item.ToolMaterial sapphireToolMaterial = EnumHelper.addToolMaterial("sapphireToolMaterial", 3, 2000, 8.0F, 6.5F, 30);


    public static final ItemTBW mapleLeaf = new ItemMapleLeaf();
    public static final ItemTBW amethystItem = new ItemAmethyst();
    public static final ItemTBW rubyItem = new ItemRuby();
    public static final ItemTBW sapphireItem = new ItemSapphire();
    public static final ItemTBW mossItem = new ItemMoss();
    public static final ItemTBW refiningPowder = new ItemRefiningPowder();
    public static final ItemTBW obsidianIngot = new ItemObsidianIngot();
    public static final ItemTBW refinedObsidianIngot = new ItemRefinedObsidianIngot();

    //Tools
    public static final ItemTBWSword amethystSword = new ItemAmethystSword(amethystToolMaterial);
    public static final ItemTBWPickaxe amethystPickaxe = new ItemAmethystPickaxe(amethystToolMaterial);
    public static final ItemTBWShovel amethystShovel = new ItemAmethystShovel(amethystToolMaterial);
    public static final ItemTBWAxe amethystAxe = new ItemAmethystAxe(amethystToolMaterial);
    public static final ItemTBWHoe amethystHoe = new ItemAmethystHoe(amethystToolMaterial);

    public static final ItemTBWSword rubySword = new ItemRubySword(rubyToolMaterial);
    public static final ItemTBWPickaxe rubyPickaxe = new ItemRubyPickaxe(rubyToolMaterial);
    public static final ItemTBWShovel rubyShovel = new ItemRubyShovel(rubyToolMaterial);
    public static final ItemTBWAxe rubyAxe = new ItemRubyAxe(rubyToolMaterial);
    public static final ItemTBWHoe rubyHoe = new ItemRubyHoe(rubyToolMaterial);

    public static final ItemTBWSword sapphireSword = new ItemSapphireSword(sapphireToolMaterial);
    public static final ItemTBWPickaxe sapphirePickaxe = new ItemSapphirePickaxe(sapphireToolMaterial);
    public static final ItemTBWShovel sapphireShovel = new ItemSapphireShovel(sapphireToolMaterial);
    public static final ItemTBWAxe sapphireAxe = new ItemSapphireAxe(sapphireToolMaterial);
    public static final ItemTBWHoe sapphireHoe = new ItemSapphireHoe(sapphireToolMaterial);

    //Test
    public static  final  ItemTBWTest testItem = new ItemTest();


    public static void init() {

        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
        GameRegistry.registerItem(amethystItem, "amethystItem");
        GameRegistry.registerItem(rubyItem, "rubyItem");
        GameRegistry.registerItem(sapphireItem, "sapphireItem");
        GameRegistry.registerItem(mossItem, "mossItem");
        GameRegistry.registerItem(refiningPowder, "refiningPowder");
        GameRegistry.registerItem(refiningPowder, "refiningPowder");
        GameRegistry.registerItem(obsidianIngot, "obsidianIngot");
        GameRegistry.registerItem(refinedObsidianIngot, "refinedObsidianIngot");

        //Tools
        GameRegistry.registerItem(amethystSword, "amethystSword");
        GameRegistry.registerItem(amethystPickaxe, "amethystPickaxe");
        GameRegistry.registerItem(amethystShovel, "amethystShovel");
        GameRegistry.registerItem(amethystAxe, "amethystAxe");
        GameRegistry.registerItem(amethystHoe, "amethystHoe");

        GameRegistry.registerItem(rubySword, "rubySword");
        GameRegistry.registerItem(rubyPickaxe, "rubyPick");
        GameRegistry.registerItem(rubyShovel, "rubySpade");
        GameRegistry.registerItem(rubyAxe, "rubyAxe");
        GameRegistry.registerItem(rubyHoe, "rubyHoe");

        GameRegistry.registerItem(sapphireSword, "sapphireSword");
        GameRegistry.registerItem(sapphirePickaxe, "sapphirePickaxe");
        GameRegistry.registerItem(sapphireShovel, "sapphireShovel");
        GameRegistry.registerItem(sapphireAxe, "sapphireAxe");
        GameRegistry.registerItem(sapphireHoe, "sapphireHoe");

        //Test
        GameRegistry.registerItem(testItem,"testItem");
    }
}
