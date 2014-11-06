package com.chaka.thebackwoods.proxy;

import com.chaka.thebackwoods.client.settings.Keybindings;
import com.chaka.thebackwoods.entity.mob.EntitySatanicSantaMob;
import com.chaka.thebackwoods.entity.mob.SatanicSanta;
import com.chaka.thebackwoods.entity.render.RenderSatanicSantaMob;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {

    public void registerRenderThings() {

        RenderingRegistry.registerEntityRenderingHandler(EntitySatanicSantaMob.class, new RenderSatanicSantaMob(new SatanicSanta(), 0));
    }

    public void registerKeyBindings() {

        ClientRegistry.registerKeyBinding(Keybindings.charge);
        ClientRegistry.registerKeyBinding(Keybindings.release);
    }
}