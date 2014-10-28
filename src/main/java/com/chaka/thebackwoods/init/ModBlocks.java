package com.chaka.thebackwoods.init;

import com.chaka.thebackwoods.block.*;
import com.chaka.thebackwoods.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

    public static final BlockTBW mapleLeaves = new BlockMapleLeaves();
    public static final BlockTBW mapleWood = new BlockMapleWood();
    public static final BlockTBW mapleWoodPlanks = new BlockMapleWoodPlanks();
    public static final BlockTBW redwoodLeaves = new BlockRedwoodLeaves();
    public static final BlockTBW redwoodWood = new BlockRedwoodWood();
    public static final BlockTBW redwoodPlanks = new BlockRedwoodPlanks();
    public static final BlockTBW greatOakWood = new BlockGreatOakWood();
    public static final BlockTBW greatOakLeaves = new BlockGreatOakLeaves();
    public static final BlockTBW greatOakPlanks = new BlockGreatOakPlanks();
    public static final BlockTBW puddingStone = new BlockPuddingStone();
    public static final BlockTBW mossyRock = new BlockMossyRock();
    public static final BlockTBW mossyDirt = new BlockMossyDirt();
    public static final BlockTBW mossyGreatOakWood = new BlockMossyGreatOakWood();
    public static final BlockTBW path = new BlockPath();
    public static final BlockTBW mossyPath = new BlockMossyPath();
    public static final BlockTBW granite = new BlockGranite();
    public static final BlockTBW mossyGranite = new BlockMossyGranite();
    public static final BlockTBW mud = new BlockMud();
    public static final BlockTBW quickSand = new BlockQuickSand();
    public static final BlockTBW smoothPuddingStone = new BlockSmoothPuddingStone();
    public static final BlockTBW smeltery = new BlockSmeltery();
    public static final BlockTBW smelteryAdvanced = new BlockSmelteryAdvanced();
    public static final BlockTBW advancedCraftingTable = new BlockAdvancedCraftingTable();
    public static final BlockTBW soilGarden = new BlockSoilGarden();
    public static final BlockTBW fertileLand = new BlockFertileLand();
    public static final BlockTBW clearGlass = new BlockClearGlass();
    public static final BlockTBW clearGlassBlack = new BlockClearGlassBlack();
    public static final BlockTBW clearGlassBlue = new BlockClearGlassBlue();
    public static final BlockTBW clearGlassBrown = new BlockClearGlassBrown();
    public static final BlockTBW clearGlassCyan = new BlockClearGlassCyan();
    public static final BlockTBW clearGlassGray = new BlockClearGlassGray();
    public static final BlockTBW clearGlassGreen = new BlockClearGlassGreen();
    public static final BlockTBW clearGlassLightBlue = new BlockClearGlassLightBlue();
    public static final BlockTBW clearGlassLightGray = new BlockClearGlassLightGray();
    public static final BlockTBW clearGlassLime = new BlockClearGlassLime();
    public static final BlockTBW clearGlassMagenta = new BlockClearGlassMagenta();
    public static final BlockTBW clearGlassOrange = new BlockClearGlassOrange();
    public static final BlockTBW clearGlassPink = new BlockClearGlassPink();
    public static final BlockTBW clearGlassPurple = new BlockClearGlassPurple();
    public static final BlockTBW clearGlassRed = new BlockClearGlassRed();
    public static final BlockTBW clearGlassWhite = new BlockClearGlassWhite();
    public static final BlockTBW clearGlassYellow = new BlockClearGlassYellow();
    public static final BlockTBW amethystOre = new BlockAmethystOre();
    public static final BlockTBW amethyst = new BlockAmethyst();
    public static final BlockTBW driedDirt = new BlockDriedDirt();
    public static final BlockTBW rubyOre = new BlockRubyOre();
    public static final BlockTBW ruby = new BlockRuby();
    public static final BlockTBW sapphireOre = new BlockSapphireOre();
    public static final BlockTBW sapphire = new BlockSapphire();
    public static final BlockTBW firWood = new BlockFirWood();
    public static final BlockTBW firPlanks = new BlockFirPlanks();
    public static final BlockTBW firLeaves = new BlockFirLeaves();
    public static final BlockTBW moss = new BlockMoss();
    public static final BlockTBW firWoodSlab = new BlockFirWoodSlab();
    public static final BlockTBW greatOakWoodSlab = new BlockGreatOakWoodSlab();
    public static final BlockTBW mapleWoodSlab = new BlockMapleWoodSlab();
    public static final BlockTBW redwoodSlab = new BlockRedwoodSlab();
    public static final BlockTBW refinedObsidian = new BlockRefinedObsidian();

    //Test Block
    public static final BlockTest test = new BlockTest();
    public static final BlockTBW slab = new BlockSlab();

    public static void init() {

        GameRegistry.registerBlock(mapleLeaves, "mapleLeaves");
        GameRegistry.registerBlock(mapleWood, "mapleWood");
        GameRegistry.registerBlock(mapleWoodPlanks, "mapleWoodPlanks");
        GameRegistry.registerBlock(redwoodLeaves, "redwoodLeaves");
        GameRegistry.registerBlock(redwoodWood, "redwoodWood");
        GameRegistry.registerBlock(redwoodPlanks, "redwoodPlanks");
        GameRegistry.registerBlock(greatOakWood, "greatOakWood");
        GameRegistry.registerBlock(greatOakLeaves, "greatOakLeaves");
        GameRegistry.registerBlock(greatOakPlanks, "greatOakPlanks");
        GameRegistry.registerBlock(puddingStone, "puddingStone");
        GameRegistry.registerBlock(mossyRock, "mossyRock");
        GameRegistry.registerBlock(mossyDirt, "mossyDirt");
        GameRegistry.registerBlock(mossyGreatOakWood, "mossyGreatOakWood");
        GameRegistry.registerBlock(path, "path");
        GameRegistry.registerBlock(mossyPath, "mossyPath");
        GameRegistry.registerBlock(granite, "granite");
        GameRegistry.registerBlock(mossyGranite, "mossyGranite");
        GameRegistry.registerBlock(mud, "mud");
        GameRegistry.registerBlock(quickSand, "quickSand");
        GameRegistry.registerBlock(smoothPuddingStone, "smoothPuddingStone");
        GameRegistry.registerBlock(smeltery, "smeltery");
        GameRegistry.registerBlock(smelteryAdvanced, "smelteryAdvanced");
        GameRegistry.registerBlock(advancedCraftingTable, "advancedCraftingTable");
        GameRegistry.registerBlock(soilGarden, "soilGarden");
        GameRegistry.registerBlock(fertileLand, "fertileLand");
        GameRegistry.registerBlock(clearGlass, "clearGlass");
        GameRegistry.registerBlock(clearGlassBlack, "clearGlassBlack");
        GameRegistry.registerBlock(clearGlassBlue, "clearGlassBlue");
        GameRegistry.registerBlock(clearGlassBrown, "clearGlassBrown");
        GameRegistry.registerBlock(clearGlassCyan, "clearGlassCyan");
        GameRegistry.registerBlock(clearGlassGray, "clearGlassGray");
        GameRegistry.registerBlock(clearGlassGreen, "clearGlassGreen");
        GameRegistry.registerBlock(clearGlassLightBlue, "clearGlassLightBlue");
        GameRegistry.registerBlock(clearGlassLightGray, "clearGlassLightGray");
        GameRegistry.registerBlock(clearGlassLime, "clearGlassLime");
        GameRegistry.registerBlock(clearGlassMagenta, "clearGlassMagenta");
        GameRegistry.registerBlock(clearGlassOrange, "clearGlassOrange");
        GameRegistry.registerBlock(clearGlassPink, "clearGlassPink");
        GameRegistry.registerBlock(clearGlassPurple, "clearGlassPurple");
        GameRegistry.registerBlock(clearGlassRed, "clearGlassRed");
        GameRegistry.registerBlock(clearGlassWhite, "clearGlassWhite");
        GameRegistry.registerBlock(clearGlassYellow, "clearGlassYellow");
        GameRegistry.registerBlock(amethystOre, "amethystOre");
        GameRegistry.registerBlock(amethyst, "amethyst");
        GameRegistry.registerBlock(driedDirt, "driedDirt");
        GameRegistry.registerBlock(rubyOre, "rubyOre");
        GameRegistry.registerBlock(ruby, "ruby");
        GameRegistry.registerBlock(sapphireOre, "sapphireOre");
        GameRegistry.registerBlock(sapphire, "sapphire");
        GameRegistry.registerBlock(firWood, "firWood");
        GameRegistry.registerBlock(firPlanks, "firPlanks");
        GameRegistry.registerBlock(firLeaves, "firLeaves");
        GameRegistry.registerBlock(moss, "moss");
        GameRegistry.registerBlock(greatOakWoodSlab, "greatOakWoodSlab");
        GameRegistry.registerBlock(firWoodSlab, "firWoodSlab");
        GameRegistry.registerBlock(mapleWoodSlab, "mapleWoodSlab");
        GameRegistry.registerBlock(redwoodSlab, "redwoodSlab");
        GameRegistry.registerBlock(refinedObsidian, "refinedObsidian");

        //Test Block
        GameRegistry.registerBlock(test, "test");
        GameRegistry.registerBlock(slab, "slab");
    }
}
