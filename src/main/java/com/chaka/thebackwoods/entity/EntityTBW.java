package com.chaka.thebackwoods.entity;

import com.chaka.thebackwoods.TheBackWoods;
import com.chaka.thebackwoods.entity.mob.EntitySatanicSantaMob;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

public class EntityTBW {

    public static void mainRegistry() {

        registerEntity();
    }

    public static void registerEntity(){

        createEntity(EntitySatanicSantaMob.class, "SatanicSanta", 0xFFFFFF, 0xFF0000);
    }

    public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor) {

        int randomId = EntityRegistry.findGlobalUniqueEntityId();
        EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
        EntityRegistry.registerModEntity(entityClass, entityName, randomId, TheBackWoods.instance, 64, 1, true);
        EntityRegistry.addSpawn(entityClass, 2, 0, 1, EnumCreatureType.monster, BiomeGenBase.forest);

        createEgg(randomId, solidColor, spotColor);
    }

    private static void createEgg(int randomId, int solidColor, int spotColor) {

        EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColor, spotColor));
    }
}
