package com.chaka.thebackwoods;

import com.chaka.thebackwoods.handler.ConfigurationHandler;
import com.chaka.thebackwoods.init.ModBlocks;
import com.chaka.thebackwoods.init.ModItems;
import com.chaka.thebackwoods.proxy.IProxy;
import com.chaka.thebackwoods.reference.Reference;
import com.chaka.thebackwoods.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class TheBackWoods {

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

        LogHelper.info("Pre Initialization Complete");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        LogHelper.info("Initialization Complete");
    }

    @Mod.EventHandler
    public void postInit (FMLPostInitializationEvent event) {

        LogHelper.info("Post Initialization Complete");
    }
}
