package com.chaka.thebackwoods.world.biome.biomes;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.entity.monster.EntitySlime;

public class BiomeGenMapleForest extends BiomeGenBase{

    public BiomeGenMapleForest(int id) {

        super(id);

        this.theBiomeDecorator.treesPerChunk = 5;
        this.theBiomeDecorator.grassPerChunk = 2;


        this.topBlock = Blocks.grass;
        this.fillerBlock = Blocks.stone;

        this.spawnableCaveCreatureList.add(new SpawnListEntry(EntitySlime.class, 5, 2, 10));
    }
}