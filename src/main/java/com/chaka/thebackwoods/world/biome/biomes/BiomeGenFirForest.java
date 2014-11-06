package com.chaka.thebackwoods.world.biome.biomes;

import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenFirForest extends BiomeGenBase{

    public BiomeGenFirForest(int id) {

        super(id);

        //The Biome Decorator
        this.theBiomeDecorator.generateLakes = false;
        this.theBiomeDecorator.treesPerChunk = 10;
    }
}