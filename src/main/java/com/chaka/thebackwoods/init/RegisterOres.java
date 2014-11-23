package com.chaka.thebackwoods.init;

import net.minecraftforge.oredict.OreDictionary;

public class RegisterOres {

    public static void init() {

        //Ores
        OreDictionary.registerOre("oreCopper", ModBlocks.copperOre);
        OreDictionary.registerOre("oreTin", ModBlocks.tinOre);
        OreDictionary.registerOre("oreSilver", ModBlocks.silverOre);
        OreDictionary.registerOre("oreLead", ModBlocks.leadOre);
        OreDictionary.registerOre("oreAmethyst", ModBlocks.amethystOre);
        OreDictionary.registerOre("oreSapphire", ModBlocks.sapphireOre);
        OreDictionary.registerOre("oreRuby", ModBlocks.rubyOre);

        //Blocks
        OreDictionary.registerOre("blockCopper", ModBlocks.copperBlock);
        OreDictionary.registerOre("blockTin", ModBlocks.tinBlock);
        OreDictionary.registerOre("blockSilver", ModBlocks.silverBlock);
        OreDictionary.registerOre("blockLead", ModBlocks.leadBlock);
        OreDictionary.registerOre("blockAmethyst", ModBlocks.amethyst);
        OreDictionary.registerOre("blockSapphire", ModBlocks.sapphire);
        OreDictionary.registerOre("blockRuby", ModBlocks.ruby);

        //Wood - log<Type, Wood>
        OreDictionary.registerOre("logWood", ModBlocks.deadWood);
        OreDictionary.registerOre("logWood", ModBlocks.firWood);
        OreDictionary.registerOre("logWood", ModBlocks.greatOakWood);
        OreDictionary.registerOre("logWood", ModBlocks.mapleWood);
        OreDictionary.registerOre("logWood", ModBlocks.redwoodWood);

        //Planks - plank<Type, Wood>

        OreDictionary.registerOre("plankWood", ModBlocks.deadWoodPlanks);
        OreDictionary.registerOre("plankWood", ModBlocks.firPlanks);
        OreDictionary.registerOre("plankWood", ModBlocks.greatOakPlanks);
        OreDictionary.registerOre("plankWood", ModBlocks.mapleWoodPlanks);
        OreDictionary.registerOre("plankWood", ModBlocks.redwoodPlanks);

        //Slab slab<Type, Wood>
        OreDictionary.registerOre("slabWood", ModBlocks.deadWoodSlab);
        OreDictionary.registerOre("slabWood", ModBlocks.firWoodSlab);
        OreDictionary.registerOre("slabWood", ModBlocks.greatOakWoodSlab);
        OreDictionary.registerOre("slabWood", ModBlocks.mapleWoodSlab);
        OreDictionary.registerOre("slabWood", ModBlocks.redwoodSlab);

        //Leaves - treeLeaves
        OreDictionary.registerOre("treeLeaves", ModBlocks.firLeaves);
        OreDictionary.registerOre("treeLeaves", ModBlocks.greatOakLeaves);
        OreDictionary.registerOre("treeLeaves", ModBlocks.mapleLeaves);
        OreDictionary.registerOre("treeLeaves", ModBlocks.redwoodLeaves);

        //Items (String)<Type>

        //Nugget nugget<Type>

        //Dust - dust<Type>
        OreDictionary.registerOre("dustCopper", ModItems.copperDust);
        OreDictionary.registerOre("dustTin", ModItems.tinDust);
        OreDictionary.registerOre("dustSilver", ModItems.silverDust);
        OreDictionary.registerOre("dustLead", ModItems.leadDust);

        //Gems - gem<Type>
        OreDictionary.registerOre("gemAmethyst", ModItems.amethystItem);
        OreDictionary.registerOre("gemSapphire", ModItems.sapphireItem);
        OreDictionary.registerOre("gemRuby", ModItems.rubyItem);

        //Ingots
        OreDictionary.registerOre("ingotCopper", ModItems.copperIngot);
        OreDictionary.registerOre("ingotTin", ModItems.tinIngot);
        OreDictionary.registerOre("ingotSilver", ModItems.silverIngot);
        OreDictionary.registerOre("ingotLead", ModItems.leadIngot);

        //Glass
        OreDictionary.registerOre("blockGlassClear", ModBlocks.clearGlass);
    }
}
