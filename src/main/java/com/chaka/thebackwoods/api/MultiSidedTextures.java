package com.chaka.thebackwoods.api;

import com.chaka.thebackwoods.reference.Reference;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class MultiSidedTextures {

    public IIcon Bottom;
    public IIcon Top;
    public IIcon North;
    public IIcon South;
    public IIcon West;
    public IIcon East;
    //Logs
    public IIcon Sides;


    public void registerBlockIcons(IIconRegister icon) {

        Bottom = icon.registerIcon(Reference.MOD_ID + ":Bottom");
        Top = icon.registerIcon(Reference.MOD_ID + ":Top");
        North = icon.registerIcon(Reference.MOD_ID + ":North");
        South = icon.registerIcon(Reference.MOD_ID + ":South");
        West = icon.registerIcon(Reference.MOD_ID + ":West");
        East = icon.registerIcon(Reference.MOD_ID + ":East");

        Sides = icon.registerIcon(Reference.MOD_ID + "Sides");
    }

    public IIcon getIconLog(int side, int meta) {

        if(side == 0) {

            return Bottom;

        } else if(side == 1) {

            return Top;

        }

        return Sides;
    }

    public IIcon getIcon(int side, int meta) {

        if(side == 0) {

            return Bottom;

        } else if(side == 1) {

            return Top;

        }

        return Sides;
    }
}
