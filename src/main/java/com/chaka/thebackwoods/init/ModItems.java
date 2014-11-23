package com.chaka.thebackwoods.init;

import com.chaka.thebackwoods.item.*;
import com.chaka.thebackwoods.item.armor.*;
import com.chaka.thebackwoods.item.crop.ItemCornCrop;
import com.chaka.thebackwoods.item.crop.ItemTBWCrop;
import com.chaka.thebackwoods.item.dust.ItemCopperDust;
import com.chaka.thebackwoods.item.dust.ItemLeadDust;
import com.chaka.thebackwoods.item.dust.ItemSilverDust;
import com.chaka.thebackwoods.item.dust.ItemTinDust;
import com.chaka.thebackwoods.item.ingot.ItemCopperIngot;
import com.chaka.thebackwoods.item.ingot.ItemLeadIngot;
import com.chaka.thebackwoods.item.ingot.ItemSilverIngot;
import com.chaka.thebackwoods.item.ingot.ItemTinIngot;
import com.chaka.thebackwoods.item.other.*;
import com.chaka.thebackwoods.item.seed.ItemCornSeed;
import com.chaka.thebackwoods.item.seed.ItemTBWSeed;
import com.chaka.thebackwoods.item.tool.*;
import com.chaka.thebackwoods.item.wand.ItemTBWWand;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {

    //Tool Constructors
    public static final Item.ToolMaterial amethystToolMaterial = EnumHelper.addToolMaterial("amethystToolMaterial", 4, 2600, 10.0F, 8.0F, 30);
    public static final Item.ToolMaterial rubyToolMaterial = EnumHelper.addToolMaterial("rubyToolMaterial", 2, 1600, 7.0F, 5.0F, 30);
    public static final Item.ToolMaterial sapphireToolMaterial = EnumHelper.addToolMaterial("sapphireToolMaterial", 3, 2000, 8.0F, 6.5F, 30);

    //Armor Constructors
    public static final ItemArmor.ArmorMaterial amethystArmorMaterial = EnumHelper.addArmorMaterial("amethystArmorMaterial", 4600, new int[]{5,10,8,6}, 30);
    public static final ItemArmor.ArmorMaterial sapphireArmorMaterial = EnumHelper.addArmorMaterial("sapphireArmorMaterial", 3600, new int[]{4,9,7,5}, 30);
    public static final ItemArmor.ArmorMaterial rubyArmorMaterial = EnumHelper.addArmorMaterial("rubyArmorMaterial", 2600, new int[]{3,8,6,4}, 30);


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

    //Armor
    public static final ItemTBWArmor amethystHelmet = new ItemAmethystHelmet(amethystArmorMaterial, 0, 0);
    public static final ItemTBWArmor amethystChestplate = new ItemAmethystChestplate(amethystArmorMaterial, 0, 1);
    public static final ItemTBWArmor amethystLeggings = new ItemAmethystLeggings(amethystArmorMaterial, 0, 2);
    public static final ItemTBWArmor amethystBoots = new ItemAmethystBoots(amethystArmorMaterial, 0, 3);

    //Ingots
    public static final ItemTBW silverIngot = new ItemSilverIngot();
    public static final ItemTBW tinIngot = new ItemTinIngot();
    public static final ItemTBW copperIngot = new ItemCopperIngot();
    public static final ItemTBW leadIngot = new ItemLeadIngot();

    //Dust
    public static final ItemTBW silverDust = new ItemSilverDust();
    public static final ItemTBW tinDust = new ItemTinDust();
    public static final ItemTBW copperDust = new ItemCopperDust();
    public static final ItemTBW leadDust = new ItemLeadDust();

    //Wands
    public static final Item wandWood = new ItemTBWWand();

    //Crop
    public static  final  Item itemCornCrop = new ItemCornCrop();
    public static final Item itemCornSeed = new ItemCornSeed(ModBlocks.cornBlock, Blocks.farmland);

    //Test
    public static  final  ItemTBWTest testItem = new ItemTest();
    public static  final ItemSword itemSword = new ItemTBWSword(Item.ToolMaterial.EMERALD);
    public static  final  Item TBWCrop = new ItemTBWCrop();
    public static  final  Item TBWSeed = new ItemTBWSeed(ModBlocks.BlockTBWCrop, Blocks.farmland);


    public static void init() {

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

        //Armor
        GameRegistry.registerItem(amethystHelmet, "amethystHelmet");
        GameRegistry.registerItem(amethystChestplate, "amethystChestplate");
        GameRegistry.registerItem(amethystLeggings, "amethystLeggings");
        GameRegistry.registerItem(amethystBoots, "amethystBoots");

        //Ingots
        GameRegistry.registerItem(silverIngot, "silverIngot");
        GameRegistry.registerItem(tinIngot, "tinIngot");
        GameRegistry.registerItem(copperIngot, "copperIngot");
        GameRegistry.registerItem(leadIngot, "leadIngot");

        //Dust
        GameRegistry.registerItem(silverDust, "silverDust");
        GameRegistry.registerItem(tinDust, "tinDust");
        GameRegistry.registerItem(copperDust, "copperDust");
        GameRegistry.registerItem(leadDust, "leadDust");

        //Wand
        GameRegistry.registerItem(wandWood, "wandWood");

        //Crop
        GameRegistry.registerItem(itemCornCrop, "itemCornCrop");
        GameRegistry.registerItem(itemCornSeed, "itemCornSeed");

        //Test
        GameRegistry.registerItem(testItem,"testItem");
        GameRegistry.registerItem(itemSword,"itemSword");
        GameRegistry.registerItem(TBWSeed,"TBWSeed");
        GameRegistry.registerItem(TBWCrop,"TBWCrop");
    }
}
