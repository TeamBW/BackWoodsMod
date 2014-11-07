package com.chaka.thebackwoods.tile_entity;

import com.chaka.thebackwoods.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

public class TBWTileEntity {

    public static void mainRegistry() {

        registerTileEntity();
    }

    public static void registerTileEntity() {

        GameRegistry.registerTileEntity(TileEntityTestChest.class, Reference.MOD_ID);
    }

}
