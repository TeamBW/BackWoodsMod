package com.chaka.thebackwoods.proxy;

import com.chaka.thebackwoods.client.settings.Keybindings;
import com.chaka.thebackwoods.entity.mob.EntitySatanicSantaMob;
import com.chaka.thebackwoods.entity.mob.SatanicSanta;
import com.chaka.thebackwoods.entity.render.RenderSatanicSantaMob;
import com.chaka.thebackwoods.init.ModBlocks;
import com.chaka.thebackwoods.item.render.ItemRenderTestChest;
import com.chaka.thebackwoods.tile_entity.TileEntityTestChest;
import com.chaka.thebackwoods.tile_entity.render.BlockTestChestRenderer;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy {

    public void registerRenderThings() {

        RenderingRegistry.registerEntityRenderingHandler(EntitySatanicSantaMob.class, new RenderSatanicSantaMob(new SatanicSanta(), 0));

        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTestChest.class, new BlockTestChestRenderer());
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.testChest), new ItemRenderTestChest());
    }

    public void registerKeyBindings() {

        ClientRegistry.registerKeyBinding(Keybindings.charge);
        ClientRegistry.registerKeyBinding(Keybindings.release);
    }
}