package com.chaka.thebackwoods.world.biome;

import com.chaka.thebackwoods.world.biome.biomes.BiomeGenGreatOakForest;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;

public class BiomeRegistry {

    public static void MainRegistry() {

        initializeBiome();
        registerBiome();
    }

    public static BiomeGenBase biomeGenGreatOakForest;
    public static BiomeGenBase biomeGenDeadForest;
    public static BiomeGenBase biomeGenFirForest;
    public static BiomeGenBase biomeGenMapleForest;
    public static BiomeGenBase biomeGenRedwoodForest;

    public static void initializeBiome() {

        //final BiomeGenBase.Height height_LowPlains = new BiomeGenBase.Height(0.125F, 0.05F);

        //Temp Rainfall
        biomeGenGreatOakForest = new BiomeGenGreatOakForest(137).setBiomeName("GreatOakForest");
        biomeGenDeadForest = new BiomeGenGreatOakForest(138).setBiomeName("DeadForest").setTemperatureRainfall(1.2F, 0.0F).setDisableRain();
        biomeGenFirForest = new BiomeGenGreatOakForest(149).setBiomeName("FirForest");
        biomeGenMapleForest = new BiomeGenGreatOakForest(140).setBiomeName("MapleForest").setTemperatureRainfall(1.2F, 0.9F);
        biomeGenRedwoodForest = new BiomeGenGreatOakForest(141).setBiomeName("RedwoodForest").setTemperatureRainfall(1.2F, 0.9F);
    }

    public static void registerBiome() {

        BiomeDictionary.registerBiomeType(biomeGenGreatOakForest, Type.FOREST);
        BiomeDictionary.registerBiomeType(biomeGenDeadForest, Type.FOREST);
        BiomeDictionary.registerBiomeType(biomeGenFirForest, Type.FOREST);
        BiomeDictionary.registerBiomeType(biomeGenMapleForest, Type.FOREST);
        BiomeDictionary.registerBiomeType(biomeGenRedwoodForest, Type.FOREST);

        BiomeManager.addSpawnBiome(biomeGenGreatOakForest);
        BiomeManager.addSpawnBiome(biomeGenDeadForest);
        BiomeManager.addSpawnBiome(biomeGenFirForest);
        BiomeManager.addSpawnBiome(biomeGenMapleForest);
        BiomeManager.addSpawnBiome(biomeGenRedwoodForest);
    }
}
