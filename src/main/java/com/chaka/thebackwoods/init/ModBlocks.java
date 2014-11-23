package com.chaka.thebackwoods.init;

import com.chaka.thebackwoods.block.*;
import com.chaka.thebackwoods.block.clearglass.*;
import com.chaka.thebackwoods.block.crop.BlockCorn;
import com.chaka.thebackwoods.block.crop.BlockTBWCrop;
import com.chaka.thebackwoods.block.ore.*;
import com.chaka.thebackwoods.block.other.*;
import com.chaka.thebackwoods.block.tile.BlockTestChest;
import com.chaka.thebackwoods.block.wood.*;
import com.chaka.thebackwoods.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.material.Material;

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
    public static final BlockTBW soilGarden = new BlockSoilGarden();
    public static final BlockTBW fertileLand = new BlockFertileLand();
    public static final BlockTBW clearGlass = new BlockClearGlass();
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
    public static final BlockTBW firWoodSlab = new BlockFirWoodSlab(false, Material.wood);
    public static final BlockTBW greatOakWoodSlab = new BlockGreatOakWoodSlab();
    public static final BlockTBW mapleWoodSlab = new BlockMapleWoodSlab();
    public static final BlockTBW redwoodSlab = new BlockRedwoodSlab();
    public static final BlockTBW refinedObsidian = new BlockRefinedObsidian();
    public static final BlockTBW deadWood = new BlockDeadWood();
    public static final BlockTBW deadWoodPlanks = new BlockDeadWoodPlanks();
    public static final BlockTBW deadWoodSlab = new BlockDeadWoodSlab();
    public static final BlockTBW driedGrass = new BlockDriedGrass();
    public static final BlockTestChest testChest = new BlockTestChest(0);

    //Ores
    public static final BlockTBW silverOre = new BlockSilverOre();
    public static final BlockTBW tinOre = new BlockTinOre();
    public static final BlockTBW copperOre = new BlockCopperOre();
    public static final BlockTBW leadOre = new BlockLeadOre();

    //Metal blocks
    public static final BlockTBW silverBlock = new BlockSilverBlock();
    public static final BlockTBW tinBlock = new BlockTinBlock();
    public static final BlockTBW copperBlock = new BlockCopperBlock();
    public static final BlockTBW leadBlock = new BlockLeadBlock();

    //Crop
    public static final BlockCrops cornBlock = new BlockCorn();

    //Test Block
    public static final BlockTest test = new BlockTest();
    public static final BlockCrops BlockTBWCrop = new BlockTBWCrop();

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
        GameRegistry.registerBlock(soilGarden, "soilGarden");
        GameRegistry.registerBlock(fertileLand, "fertileLand");
        GameRegistry.registerBlock(clearGlass, "clearGlass");
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
        GameRegistry.registerBlock(deadWood, "deadWood");
        GameRegistry.registerBlock(deadWoodPlanks, "deadWoodPlanks");
        GameRegistry.registerBlock(deadWoodSlab, "deadWoodSlab");
        GameRegistry.registerBlock(driedGrass, "driedGrass");
        GameRegistry.registerBlock(testChest, "testChest");

        //Ores
        GameRegistry.registerBlock(silverOre, "silverOre");
        GameRegistry.registerBlock(tinOre, "tinOre");
        GameRegistry.registerBlock(copperOre, "copperOre");
        GameRegistry.registerBlock(leadOre, "leadOre");

        //Metal Blocks
        GameRegistry.registerBlock(silverBlock, "silverBlock");
        GameRegistry.registerBlock(tinBlock, "tinBlock");
        GameRegistry.registerBlock(copperBlock, "copperBlock");
        GameRegistry.registerBlock(leadBlock, "leadBlock");

        //Crop
        GameRegistry.registerBlock(cornBlock, "cornBlock");

        //Test Block
        GameRegistry.registerBlock(test, "test");
        GameRegistry.registerBlock(BlockTBWCrop, "BlockTBWCrop");
    }
}
