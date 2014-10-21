package com.chaka.thebackwoods.init;

import com.chaka.thebackwoods.item.*;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {

    public static final ItemTBW mapleLeaf = new ItemMapleLeaf();
    public static final ItemTBW amethystItem = new ItemAmethyst();
    public static final ItemTBW rubyItem = new ItemRuby();
    public static final ItemTBW sapphireItem = new ItemSapphire();
    public static final ItemTBW amethystSword = new ItemAmethystSword();

    public static void init() {

        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
        GameRegistry.registerItem(amethystItem, "amethystItem");
        GameRegistry.registerItem(rubyItem, "rubyItem");
        GameRegistry.registerItem(sapphireItem, "sapphireItem");
        GameRegistry.registerItem(amethystSword, "amethystSword");
    }
}
