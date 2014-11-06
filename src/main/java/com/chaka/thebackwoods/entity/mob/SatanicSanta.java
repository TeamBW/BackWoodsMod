package com.chaka.thebackwoods.entity.mob;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class SatanicSanta extends ModelBase {

    ModelRenderer Left_Leg;
    ModelRenderer Right_Leg;
    ModelRenderer Torso;
    ModelRenderer Left_Arm;
    ModelRenderer Right_Arm;
    ModelRenderer Head;
  
  public SatanicSanta() {

    textureWidth = 64;
    textureHeight = 32;
    
      Left_Leg = new ModelRenderer(this, 7, 8);
      Left_Leg.addBox(0F, 0F, 0F, 1, 4, 1);
      Left_Leg.setRotationPoint(0F, 20F, 0F);
      Left_Leg.setTextureSize(64, 32);
      Left_Leg.mirror = true;
      setRotation(Left_Leg, 0F, 0F, 0F);
      Right_Leg = new ModelRenderer(this, 3, 8);
      Right_Leg.addBox(0F, 0F, 0F, 1, 4, 1);
      Right_Leg.setRotationPoint(-1F, 20F, 0F);
      Right_Leg.setTextureSize(64, 32);
      Right_Leg.mirror = true;
      setRotation(Right_Leg, 0F, 0F, 0F);
      Torso = new ModelRenderer(this, 4, 4);
      Torso.addBox(0F, 0F, 0F, 2, 3, 1);
      Torso.setRotationPoint(-1F, 18F, 0F);
      Torso.setTextureSize(64, 32);
      Torso.mirror = true;
      setRotation(Torso, 0F, 0F, 0F);
      Left_Arm = new ModelRenderer(this, 10, 4);
      Left_Arm.addBox(0F, 0F, 0F, 1, 3, 1);
      Left_Arm.setRotationPoint(1F, 18F, 0F);
      Left_Arm.setTextureSize(64, 32);
      Left_Arm.mirror = true;
      setRotation(Left_Arm, 0F, 0F, 0F);
      Right_Arm = new ModelRenderer(this, 0, 4);
      Right_Arm.addBox(0F, 0F, 0F, 1, 3, 1);
      Right_Arm.setRotationPoint(-2F, 18F, 0F);
      Right_Arm.setTextureSize(64, 32);
      Right_Arm.mirror = true;
      setRotation(Right_Arm, 0F, 0F, 0F);
      Head = new ModelRenderer(this, 3, 0);
      Head.addBox(0F, 0F, 0F, 2, 2, 2);
      Head.setRotationPoint(-1F, 16F, -0.3333333F);
      Head.setTextureSize(64, 32);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Left_Leg.render(f5);
    Right_Leg.render(f5);
    Torso.render(f5);
    Left_Arm.render(f5);
    Right_Arm.render(f5);
    Head.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z) {

    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {

    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
      float f6 = (180F / (float)Math.PI);
      this.Torso.rotateAngleX = f4 / (180F / (float)Math.PI);
      this.Torso.rotateAngleY = f4 / (180F / (float)Math.PI);

      this.Right_Leg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
      this.Left_Leg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F *f1;
  }
}
