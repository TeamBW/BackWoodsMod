package com.chaka.thebackwoods.entity.render;

import com.chaka.thebackwoods.entity.mob.EntitySatanicSantaMob;
import com.chaka.thebackwoods.reference.Reference;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderSatanicSantaMob extends RenderLiving {

    public static final ResourceLocation mobTextures = new ResourceLocation(Reference.MOD_ID + ":textures/entity/SatanicSanta.png");

    public RenderSatanicSantaMob(ModelBase par1ModelBase, float par2) {
        super(par1ModelBase, par2);

    }

    protected ResourceLocation getEntityTexture(EntitySatanicSantaMob entity) {

        return mobTextures;
    }

    protected ResourceLocation getEntityTexture(Entity entity) {

        return this.getEntityTexture((EntitySatanicSantaMob)entity);
    }
}
