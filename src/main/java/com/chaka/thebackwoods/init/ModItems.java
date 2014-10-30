package com.chaka.thebackwoods.init;

import com.chaka.thebackwoods.item.*;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {

    public static final ItemTBW mapleLeaf = new ItemMapleLeaf();
    public static final ItemTBW amethystItem = new ItemAmethyst();
    public static final ItemTBW rubyItem = new ItemRuby();
    public static final ItemTBW sapphireItem = new ItemSapphire();
    public static final ItemTBW amethystSword = new ItemAmethystSword();
    public static final ItemTBW amethystPick = new ItemAmethystPickaxe();
    public static final ItemTBW amethystSpade = new ItemAmethystSpade();
    public static final ItemTBW amethystAxe = new ItemAmethystAxe();
    public static final ItemTBW amethystHoe = new ItemAmethystHoe();
    public static final ItemTBW mossItem = new ItemMoss();
    public static final ItemTBW refiningPowder = new ItemRefiningPowder();
    public static final ItemTBW obsidianIngot = new ItemObsidianIngot();
    public static final ItemTBW refinedObsidianIngot = new ItemRefinedObsidianIngot();
    public static final ItemTBW rubySword = new ItemRubySword();
    public static final ItemTBW rubyPick = new ItemRubyPickaxe();
    public static final ItemTBW rubySpade = new ItemRubySpade();
    public static final ItemTBW rubyAxe = new ItemRubyAxe();
    public static final ItemTBW rubyHoe = new ItemRuby();
    public static final ItemTBW sapphirePickaxe = new ItemSapphirePickaxe();

    public static void init() {

        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
        GameRegistry.registerItem(amethystItem, "amethystItem");
        GameRegistry.registerItem(rubyItem, "rubyItem");
        GameRegistry.registerItem(sapphireItem, "sapphireItem");
        GameRegistry.registerItem(amethystSword, "amethystSword");
        GameRegistry.registerItem(amethystPick, "amethystPick");
        GameRegistry.registerItem(amethystSpade, "amethystSpade");
        GameRegistry.registerItem(amethystAxe, "amethystAxe");
        GameRegistry.registerItem(amethystHoe, "amethystHoe");
        GameRegistry.registerItem(mossItem, "mossItem");
        GameRegistry.registerItem(refiningPowder, "refiningPowder");
        GameRegistry.registerItem(refiningPowder, "refiningPowder");
        GameRegistry.registerItem(obsidianIngot, "obsidianIngot");
        GameRegistry.registerItem(refinedObsidianIngot, "refinedObsidianIngot");
        GameRegistry.registerItem(rubySword, "rubySword");
        GameRegistry.registerItem(rubyPick, "rubyPick");
        GameRegistry.registerItem(rubySpade, "rubySpade");
        GameRegistry.registerItem(rubyAxe, "rubyAxe");
        GameRegistry.registerItem(rubyHoe, "rubyHoe");
        GameRegistry.registerItem(sapphirePickaxe, "sapphirePickaxe");
    }
}
