package com.chaka.thebackwoods;

import com.chaka.thebackwoods.entity.EntityTBW;
import com.chaka.thebackwoods.handler.ConfigurationHandler;
import com.chaka.thebackwoods.init.ModBlocks;
import com.chaka.thebackwoods.init.ModItems;
import com.chaka.thebackwoods.init.Recipes;
import com.chaka.thebackwoods.init.RegisterOres;
import com.chaka.thebackwoods.proxy.IProxy;
import com.chaka.thebackwoods.reference.Reference;
import com.chaka.thebackwoods.tile_entity.TBWTileEntity;
import com.chaka.thebackwoods.utility.LogHelper;
import com.chaka.thebackwoods.world.OreGeneration;
import com.chaka.thebackwoods.world.biome.BiomeRegistry;
import com.chaka.thebackwoods.world.biome.WorldTypeBackWoods;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockObsidian;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.world.WorldType;
import net.minecraftforge.oredict.OreDictionary;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class TheBackWoods {

    public static Item chakaMeat;

    @Mod.Instance(Reference.MOD_ID)
    public static TheBackWoods instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        proxy.registerKeyBindings();

        ModItems.init();
        ModBlocks.init();
        RegisterOres.init();

        LogHelper.info("Pre Initialization Complete");

        GameRegistry.registerWorldGenerator(new OreGeneration(), 0);

        BiomeRegistry.MainRegistry();

        EntityTBW.mainRegistry();

        chakaMeat = new ItemFood(5, 1.0F, true).setUnlocalizedName("chakaMeat");
        GameRegistry.registerItem(chakaMeat, chakaMeat.getUnlocalizedName().substring(5));

        TBWTileEntity.mainRegistry();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        Recipes.init();

        LogHelper.info("Initialization Complete");


    }

    @Mod.EventHandler
    public void postInit (FMLPostInitializationEvent event) {

        LogHelper.info("Post Initialization Complete");

        WorldType BACKWOODS = new WorldTypeBackWoods(3, "backWoods");
    }
}
