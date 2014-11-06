package com.chaka.thebackwoods.world.biome.biomes;

import com.chaka.thebackwoods.init.ModBlocks;
import cpw.mods.fml.common.network.handshake.FMLHandshakeMessage;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenDeadForest extends BiomeGenBase{

    public BiomeGenDeadForest(int id) {

        super(id);

        //The Biome Decorator
        this.theBiomeDecorator.treesPerChunk = 1;
        this.theBiomeDecorator.deadBushPerChunk = 8;
        this.theBiomeDecorator.sandPerChunk = 1;
        this.theBiomeDecorator.generateLakes = false;

        //Layers
        this.topBlock = ModBlocks.driedGrass;
        this.fillerBlock = ModBlocks.driedDirt;
    }
}