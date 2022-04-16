package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelSpitBug extends ModelBase {
  private float wingspeed = 1.0F;
  
  ModelRenderer legintersection;
  
  ModelRenderer legintersectionpart2;
  
  ModelRenderer legintersectionpart3;
  
  ModelRenderer leg1start;
  
  ModelRenderer leg1startpart2;
  
  ModelRenderer leg1startpart3;
  
  ModelRenderer leg1;
  
  ModelRenderer leg1part2;
  
  ModelRenderer leg1part2b;
  
  ModelRenderer leg1part2c;
  
  ModelRenderer leg1part2d;
  
  ModelRenderer leg1part3;
  
  ModelRenderer leg1part3b;
  
  ModelRenderer leg1part3c;
  
  ModelRenderer leg2start;
  
  ModelRenderer leg2startpart2;
  
  ModelRenderer leg2startpart3;
  
  ModelRenderer leg2;
  
  ModelRenderer leg2part2;
  
  ModelRenderer leg2part2b;
  
  ModelRenderer leg2part2c;
  
  ModelRenderer leg2part2d;
  
  ModelRenderer leg2part3;
  
  ModelRenderer leg2part3b;
  
  ModelRenderer leg2part3c;
  
  ModelRenderer leg3start;
  
  ModelRenderer leg3startpart2;
  
  ModelRenderer leg3startpart3;
  
  ModelRenderer leg3;
  
  ModelRenderer leg3part2;
  
  ModelRenderer leg3part2b;
  
  ModelRenderer leg3part2c;
  
  ModelRenderer leg3part2d;
  
  ModelRenderer leg3part3;
  
  ModelRenderer leg3part3b;
  
  ModelRenderer leg3part3c;
  
  ModelRenderer leg4start;
  
  ModelRenderer leg4startpart2;
  
  ModelRenderer leg4startpart3;
  
  ModelRenderer leg4;
  
  ModelRenderer leg4part2;
  
  ModelRenderer leg4part2b;
  
  ModelRenderer leg4part2c;
  
  ModelRenderer leg4part2d;
  
  ModelRenderer leg4part3;
  
  ModelRenderer leg4part3b;
  
  ModelRenderer leg4part3c;
  
  ModelRenderer bodybase;
  
  ModelRenderer bodybasepart2;
  
  ModelRenderer bodybasepart3;
  
  ModelRenderer bodybasepart4;
  
  ModelRenderer bodybasepart5;
  
  ModelRenderer bodybasepart6;
  
  ModelRenderer bodybasepart7;
  
  ModelRenderer bodybasepart8;
  
  ModelRenderer bodybasepart9;
  
  ModelRenderer bodybasepart10;
  
  ModelRenderer bodybasepart11;
  
  ModelRenderer bodybasepart12;
  
  ModelRenderer bodybasepart13;
  
  ModelRenderer bodybasepart14;
  
  ModelRenderer bodybasepart15;
  
  ModelRenderer upperjawbase;
  
  ModelRenderer upperjawbasepart1;
  
  ModelRenderer upperjawbasepart2;
  
  ModelRenderer upperjawbasepart3;
  
  ModelRenderer tooth1;
  
  ModelRenderer tooth2;
  
  ModelRenderer tooth3;
  
  ModelRenderer tooth4;
  
  ModelRenderer tooth5;
  
  ModelRenderer lowerjawbase;
  
  ModelRenderer lowerjawbasepart1;
  
  ModelRenderer lowerjawbasepart2;
  
  ModelRenderer lowerjawbasepart3;
  
  ModelRenderer lowerjawbasepart4;
  
  ModelRenderer lowerjawbasepart5;
  
  ModelRenderer lowerjawbasepart6;
  
  ModelRenderer lowerjawbasepart7;
  
  ModelRenderer lowerjawbasepart8;
  
  ModelRenderer lowerjawbasepart9;
  
  ModelRenderer lowerjawbasepart10;
  
  ModelRenderer lowerjawbasepart11;
  
  ModelRenderer arm1start;
  
  ModelRenderer arm1;
  
  ModelRenderer arm1part2;
  
  ModelRenderer arm1end;
  
  ModelRenderer arm2start;
  
  ModelRenderer arm2;
  
  ModelRenderer arm2part2;
  
  ModelRenderer arm2end;
  
  ModelRenderer eye1;
  
  ModelRenderer eye2;
  
  public ModelSpitBug(float f1) {
    this.wingspeed = f1;
    this.textureWidth = 512;
    this.textureHeight = 256;
    this.legintersection = new ModelRenderer(this, 0, 0);
    this.legintersection.addBox(-6.0F, -2.0F, -7.0F, 12, 6, 14);
    this.legintersection.setRotationPoint(0.0F, 3.0F, 1.0F);
    this.legintersection.setTextureSize(512, 256);
    this.legintersection.mirror = true;
    setRotation(this.legintersection, 0.0F, 0.0F, 0.0F);
    this.legintersectionpart2 = new ModelRenderer(this, 0, 21);
    this.legintersectionpart2.addBox(-8.0F, -2.0F, 0.0F, 8, 6, 8);
    this.legintersectionpart2.setRotationPoint(0.0F, 3.0F, 2.0F);
    this.legintersectionpart2.setTextureSize(512, 256);
    this.legintersectionpart2.mirror = true;
    setRotation(this.legintersectionpart2, 0.0F, 0.7853982F, 0.0F);
    this.legintersectionpart3 = new ModelRenderer(this, 282, 18);
    this.legintersectionpart3.addBox(-7.0F, 3.0F, -6.0F, 14, 2, 12);
    this.legintersectionpart3.setRotationPoint(0.0F, 3.0F, 1.0F);
    this.legintersectionpart3.setTextureSize(512, 256);
    this.legintersectionpart3.mirror = true;
    setRotation(this.legintersectionpart3, 0.0F, 0.0F, 0.0F);
    this.leg1start = new ModelRenderer(this, 53, 0);
    this.leg1start.addBox(-3.0F, -3.0F, -3.0F, 6, 6, 4);
    this.leg1start.setRotationPoint(4.0F, 3.0F, -4.0F);
    this.leg1start.setTextureSize(512, 256);
    this.leg1start.mirror = true;
    setRotation(this.leg1start, 0.0F, -0.7853982F, 0.0F);
    this.leg1startpart2 = new ModelRenderer(this, 53, 19);
    this.leg1startpart2.addBox(-2.5F, -2.0F, -3.0F, 5, 5, 4);
    this.leg1startpart2.setRotationPoint(6.0F, 3.0F, -6.0F);
    this.leg1startpart2.setTextureSize(512, 256);
    this.leg1startpart2.mirror = true;
    setRotation(this.leg1startpart2, 0.3717861F, -0.7853982F, 0.0F);
    this.leg1startpart3 = new ModelRenderer(this, 53, 29);
    this.leg1startpart3.addBox(-2.0F, -2.0F, -4.0F, 4, 4, 2);
    this.leg1startpart3.setRotationPoint(6.0F, 3.0F, -6.0F);
    this.leg1startpart3.setTextureSize(512, 256);
    this.leg1startpart3.mirror = true;
    setRotation(this.leg1startpart3, 0.669215F, -0.7853982F, 0.0F);
    this.leg1 = new ModelRenderer(this, 45, 36);
    this.leg1.addBox(-1.5F, -3.0F, -13.0F, 3, 3, 10);
    this.leg1.setRotationPoint(6.0F, 3.0F, -6.0F);
    this.leg1.setTextureSize(512, 256);
    this.leg1.mirror = true;
    setRotation(this.leg1, 1.041001F, -0.7853982F, 0.0F);
    this.leg1part2 = new ModelRenderer(this, 33, 50);
    this.leg1part2.addBox(-2.0F, -1.5F, -13.0F, 4, 3, 15);
    this.leg1part2.setRotationPoint(12.0F, 13.0F, -12.0F);
    this.leg1part2.setTextureSize(512, 256);
    this.leg1part2.mirror = true;
    setRotation(this.leg1part2, -1.152537F, -0.7853982F, 0.0F);
    this.leg1part2b = new ModelRenderer(this, 33, 50);
    this.leg1part2b.addBox(-2.0F, 0.5F, 1.0F, 4, 1, 3);
    this.leg1part2b.setRotationPoint(12.0F, 13.0F, -12.0F);
    this.leg1part2b.setTextureSize(512, 256);
    this.leg1part2b.mirror = true;
    setRotation(this.leg1part2b, -0.7435722F, -0.7853982F, 0.0F);
    this.leg1part2c = new ModelRenderer(this, 33, 50);
    this.leg1part2c.addBox(-2.0F, -7.5F, -13.0F, 4, 1, 3);
    this.leg1part2c.setRotationPoint(12.0F, 13.0F, -12.0F);
    this.leg1part2c.setTextureSize(512, 256);
    this.leg1part2c.mirror = true;
    setRotation(this.leg1part2c, -0.6320451F, -0.7853982F, 0.0F);
    this.leg1part2d = new ModelRenderer(this, 2, 50);
    this.leg1part2d.addBox(-1.5F, -1.5F, -10.0F, 3, 3, 12);
    this.leg1part2d.setRotationPoint(12.0F, 13.0F, -12.0F);
    this.leg1part2d.setTextureSize(512, 256);
    this.leg1part2d.mirror = true;
    setRotation(this.leg1part2d, -1.041001F, -0.7853982F, 0.0F);
    this.leg1part3 = new ModelRenderer(this, 51, 69);
    this.leg1part3.addBox(-1.5F, -1.5F, -7.0F, 3, 3, 7);
    this.leg1part3.setRotationPoint(16.0F, 3.0F, -16.0F);
    this.leg1part3.setTextureSize(512, 256);
    this.leg1part3.mirror = true;
    setRotation(this.leg1part3, 0.669215F, -0.7853982F, 0.0F);
    this.leg1part3b = new ModelRenderer(this, 55, 80);
    this.leg1part3b.addBox(-2.0F, -2.0F, -2.0F, 4, 16, 4);
    this.leg1part3b.setRotationPoint(20.0F, 8.0F, -20.0F);
    this.leg1part3b.setTextureSize(512, 256);
    this.leg1part3b.mirror = true;
    setRotation(this.leg1part3b, -0.4833219F, -0.7853982F, -0.0349066F);
    this.leg1part3c = new ModelRenderer(this, 42, 80);
    this.leg1part3c.addBox(-2.0F, 14.0F, 0.0F, 4, 3, 2);
    this.leg1part3c.setRotationPoint(20.0F, 8.0F, -20.0F);
    this.leg1part3c.setTextureSize(512, 256);
    this.leg1part3c.mirror = true;
    setRotation(this.leg1part3c, -0.4833219F, -0.7853982F, -0.0349066F);
    this.leg2start = new ModelRenderer(this, 52, 0);
    this.leg2start.addBox(-3.0F, -3.0F, -3.0F, 6, 6, 4);
    this.leg2start.setRotationPoint(-4.0F, 3.0F, -4.0F);
    this.leg2start.setTextureSize(512, 256);
    this.leg2start.mirror = true;
    setRotation(this.leg2start, 0.0F, 0.7853982F, 0.0F);
    this.leg2startpart2 = new ModelRenderer(this, 53, 19);
    this.leg2startpart2.addBox(-2.5F, -2.0F, -3.0F, 5, 5, 4);
    this.leg2startpart2.setRotationPoint(-6.0F, 3.0F, -6.0F);
    this.leg2startpart2.setTextureSize(512, 256);
    this.leg2startpart2.mirror = true;
    setRotation(this.leg2startpart2, 0.3717861F, 0.7853982F, 0.0F);
    this.leg2startpart3 = new ModelRenderer(this, 53, 29);
    this.leg2startpart3.addBox(-2.0F, -2.0F, -4.0F, 4, 4, 2);
    this.leg2startpart3.setRotationPoint(-6.0F, 3.0F, -6.0F);
    this.leg2startpart3.setTextureSize(512, 256);
    this.leg2startpart3.mirror = true;
    setRotation(this.leg2startpart3, 0.669215F, 0.7853982F, 0.0F);
    this.leg2 = new ModelRenderer(this, 45, 36);
    this.leg2.addBox(-1.5F, -3.0F, -13.0F, 3, 3, 10);
    this.leg2.setRotationPoint(-6.0F, 3.0F, -6.0F);
    this.leg2.setTextureSize(512, 256);
    this.leg2.mirror = true;
    setRotation(this.leg2, 1.041001F, 0.7853982F, 0.0F);
    this.leg2part2 = new ModelRenderer(this, 72, 50);
    this.leg2part2.addBox(-2.0F, -1.5F, -13.0F, 4, 3, 15);
    this.leg2part2.setRotationPoint(-12.0F, 13.0F, -12.0F);
    this.leg2part2.setTextureSize(512, 256);
    this.leg2part2.mirror = true;
    setRotation(this.leg2part2, -1.152537F, 0.7853982F, 0.0F);
    this.leg2part2b = new ModelRenderer(this, 33, 50);
    this.leg2part2b.addBox(-2.0F, 0.5F, 1.0F, 4, 1, 3);
    this.leg2part2b.setRotationPoint(-12.0F, 13.0F, -12.0F);
    this.leg2part2b.setTextureSize(512, 256);
    this.leg2part2b.mirror = true;
    setRotation(this.leg2part2b, -0.7435722F, 0.7853982F, 0.0F);
    this.leg2part2c = new ModelRenderer(this, 33, 50);
    this.leg2part2c.addBox(-2.0F, -7.5F, -13.0F, 4, 1, 3);
    this.leg2part2c.setRotationPoint(-12.0F, 13.0F, -12.0F);
    this.leg2part2c.setTextureSize(512, 256);
    this.leg2part2c.mirror = true;
    setRotation(this.leg2part2c, -0.6320451F, 0.7853982F, 0.0F);
    this.leg2part2d = new ModelRenderer(this, 2, 50);
    this.leg2part2d.addBox(-1.5F, -1.5F, -10.0F, 3, 3, 12);
    this.leg2part2d.setRotationPoint(-12.0F, 13.0F, -12.0F);
    this.leg2part2d.setTextureSize(512, 256);
    this.leg2part2d.mirror = true;
    setRotation(this.leg2part2d, -1.041001F, 0.7853982F, 0.0F);
    this.leg2part3 = new ModelRenderer(this, 51, 69);
    this.leg2part3.addBox(-1.5F, -1.5F, -7.0F, 3, 3, 7);
    this.leg2part3.setRotationPoint(-16.0F, 3.0F, -16.0F);
    this.leg2part3.setTextureSize(512, 256);
    this.leg2part3.mirror = true;
    setRotation(this.leg2part3, 0.669215F, 0.7853982F, 0.0F);
    this.leg2part3b = new ModelRenderer(this, 55, 80);
    this.leg2part3b.addBox(-2.0F, -2.0F, -2.0F, 4, 16, 4);
    this.leg2part3b.setRotationPoint(-20.0F, 8.0F, -20.0F);
    this.leg2part3b.setTextureSize(512, 256);
    this.leg2part3b.mirror = true;
    setRotation(this.leg2part3b, -0.4833219F, 0.7853982F, -0.0349066F);
    this.leg2part3c = new ModelRenderer(this, 42, 80);
    this.leg2part3c.addBox(-2.0F, 14.0F, 0.0F, 4, 3, 2);
    this.leg2part3c.setRotationPoint(-20.0F, 8.0F, -20.0F);
    this.leg2part3c.setTextureSize(512, 256);
    this.leg2part3c.mirror = true;
    setRotation(this.leg2part3c, -0.4833219F, 0.7853982F, -0.0349066F);
    this.leg3start = new ModelRenderer(this, 52, 0);
    this.leg3start.addBox(-3.0F, -3.0F, -3.0F, 6, 6, 4);
    this.leg3start.setRotationPoint(4.0F, 3.0F, 6.0F);
    this.leg3start.setTextureSize(512, 256);
    this.leg3start.mirror = true;
    setRotation(this.leg3start, 0.0F, -2.356194F, 0.0F);
    this.leg3startpart2 = new ModelRenderer(this, 72, 19);
    this.leg3startpart2.addBox(-2.5F, -2.0F, -3.0F, 5, 5, 4);
    this.leg3startpart2.setRotationPoint(6.0F, 3.0F, 8.0F);
    this.leg3startpart2.setTextureSize(512, 256);
    this.leg3startpart2.mirror = true;
    setRotation(this.leg3startpart2, 0.3717861F, -2.356194F, 0.0F);
    this.leg3startpart3 = new ModelRenderer(this, 72, 29);
    this.leg3startpart3.addBox(-2.0F, -2.0F, -4.0F, 4, 4, 2);
    this.leg3startpart3.setRotationPoint(6.0F, 3.0F, 8.0F);
    this.leg3startpart3.setTextureSize(512, 256);
    this.leg3startpart3.mirror = true;
    setRotation(this.leg3startpart3, 0.669215F, -2.356194F, 0.0F);
    this.leg3 = new ModelRenderer(this, 72, 36);
    this.leg3.addBox(-1.5F, -3.0F, -13.0F, 3, 3, 10);
    this.leg3.setRotationPoint(6.0F, 3.0F, 8.0F);
    this.leg3.setTextureSize(512, 256);
    this.leg3.mirror = true;
    setRotation(this.leg3, 1.041001F, -2.356194F, 0.0F);
    this.leg3part2 = new ModelRenderer(this, 33, 50);
    this.leg3part2.addBox(-2.0F, -1.5F, -13.0F, 4, 3, 15);
    this.leg3part2.setRotationPoint(12.0F, 13.0F, 14.0F);
    this.leg3part2.setTextureSize(512, 256);
    this.leg3part2.mirror = true;
    setRotation(this.leg3part2, -1.152537F, -2.356194F, 0.0F);
    this.leg3part2b = new ModelRenderer(this, 33, 50);
    this.leg3part2b.addBox(-2.0F, 0.5F, 1.0F, 4, 1, 3);
    this.leg3part2b.setRotationPoint(12.0F, 13.0F, 14.0F);
    this.leg3part2b.setTextureSize(512, 256);
    this.leg3part2b.mirror = true;
    setRotation(this.leg3part2b, -0.7435722F, -2.356194F, 0.0F);
    this.leg3part2c = new ModelRenderer(this, 33, 50);
    this.leg3part2c.addBox(-2.0F, -7.5F, -13.0F, 4, 1, 3);
    this.leg3part2c.setRotationPoint(12.0F, 13.0F, 14.0F);
    this.leg3part2c.setTextureSize(512, 256);
    this.leg3part2c.mirror = true;
    setRotation(this.leg3part2c, -0.6320451F, -2.356194F, 0.0F);
    this.leg3part2d = new ModelRenderer(this, 111, 50);
    this.leg3part2d.addBox(-1.5F, -1.5F, -10.0F, 3, 3, 12);
    this.leg3part2d.setRotationPoint(12.0F, 13.0F, 14.0F);
    this.leg3part2d.setTextureSize(512, 256);
    this.leg3part2d.mirror = true;
    setRotation(this.leg3part2d, -1.041001F, -2.356194F, 0.0F);
    this.leg3part3 = new ModelRenderer(this, 72, 69);
    this.leg3part3.addBox(-1.5F, -1.5F, -7.0F, 3, 3, 7);
    this.leg3part3.setRotationPoint(16.0F, 3.0F, 18.0F);
    this.leg3part3.setTextureSize(512, 256);
    this.leg3part3.mirror = true;
    setRotation(this.leg3part3, 0.669215F, -2.356194F, 0.0F);
    this.leg3part3b = new ModelRenderer(this, 72, 80);
    this.leg3part3b.addBox(-2.0F, -2.0F, -2.0F, 4, 16, 4);
    this.leg3part3b.setRotationPoint(20.0F, 8.0F, 22.0F);
    this.leg3part3b.setTextureSize(512, 256);
    this.leg3part3b.mirror = true;
    setRotation(this.leg3part3b, -0.4833219F, -2.356194F, -0.0349066F);
    this.leg3part3c = new ModelRenderer(this, 89, 80);
    this.leg3part3c.addBox(-2.0F, 14.0F, 0.0F, 4, 3, 2);
    this.leg3part3c.setRotationPoint(20.0F, 8.0F, 22.0F);
    this.leg3part3c.setTextureSize(512, 256);
    this.leg3part3c.mirror = true;
    setRotation(this.leg3part3c, -0.4833219F, -2.356194F, -0.0349066F);
    this.leg4start = new ModelRenderer(this, 52, 0);
    this.leg4start.addBox(-3.0F, -3.0F, -3.0F, 6, 6, 4);
    this.leg4start.setRotationPoint(-4.0F, 3.0F, 6.0F);
    this.leg4start.setTextureSize(512, 256);
    this.leg4start.mirror = true;
    setRotation(this.leg4start, 0.0F, 2.356194F, 0.0F);
    this.leg4startpart2 = new ModelRenderer(this, 72, 19);
    this.leg4startpart2.addBox(-2.5F, -2.0F, -3.0F, 5, 5, 4);
    this.leg4startpart2.setRotationPoint(-6.0F, 3.0F, 8.0F);
    this.leg4startpart2.setTextureSize(512, 256);
    this.leg4startpart2.mirror = true;
    setRotation(this.leg4startpart2, 0.3717861F, 2.356194F, 0.0F);
    this.leg4startpart3 = new ModelRenderer(this, 72, 29);
    this.leg4startpart3.addBox(-2.0F, -2.0F, -4.0F, 4, 4, 2);
    this.leg4startpart3.setRotationPoint(-6.0F, 3.0F, 8.0F);
    this.leg4startpart3.setTextureSize(512, 256);
    this.leg4startpart3.mirror = true;
    setRotation(this.leg4startpart3, 0.669215F, 2.356194F, 0.0F);
    this.leg4 = new ModelRenderer(this, 72, 36);
    this.leg4.addBox(-1.5F, -3.0F, -13.0F, 3, 3, 10);
    this.leg4.setRotationPoint(-6.0F, 3.0F, 8.0F);
    this.leg4.setTextureSize(512, 256);
    this.leg4.mirror = true;
    setRotation(this.leg4, 1.041001F, 2.356194F, 0.0F);
    this.leg4part2 = new ModelRenderer(this, 72, 50);
    this.leg4part2.addBox(-2.0F, -1.5F, -13.0F, 4, 3, 15);
    this.leg4part2.setRotationPoint(-12.0F, 13.0F, 14.0F);
    this.leg4part2.setTextureSize(512, 256);
    this.leg4part2.mirror = true;
    setRotation(this.leg4part2, -1.152537F, 2.356194F, 0.0F);
    this.leg4part2b = new ModelRenderer(this, 33, 50);
    this.leg4part2b.addBox(-2.0F, 0.5F, 1.0F, 4, 1, 3);
    this.leg4part2b.setRotationPoint(-12.0F, 13.0F, 14.0F);
    this.leg4part2b.setTextureSize(512, 256);
    this.leg4part2b.mirror = true;
    setRotation(this.leg4part2b, -0.7435722F, 2.363176F, 0.0F);
    this.leg4part2c = new ModelRenderer(this, 33, 50);
    this.leg4part2c.addBox(-2.0F, -7.5F, -13.0F, 4, 1, 3);
    this.leg4part2c.setRotationPoint(-12.0F, 13.0F, 14.0F);
    this.leg4part2c.setTextureSize(512, 256);
    this.leg4part2c.mirror = true;
    setRotation(this.leg4part2c, -0.6320451F, 2.356194F, 0.0F);
    this.leg4part2d = new ModelRenderer(this, 111, 50);
    this.leg4part2d.addBox(-1.5F, -1.5F, -10.0F, 3, 3, 12);
    this.leg4part2d.setRotationPoint(-12.0F, 13.0F, 14.0F);
    this.leg4part2d.setTextureSize(512, 256);
    this.leg4part2d.mirror = true;
    setRotation(this.leg4part2d, -1.041001F, 2.356194F, 0.0F);
    this.leg4part3 = new ModelRenderer(this, 72, 69);
    this.leg4part3.addBox(-1.5F, -1.5F, -7.0F, 3, 3, 7);
    this.leg4part3.setRotationPoint(-16.0F, 3.0F, 18.0F);
    this.leg4part3.setTextureSize(512, 256);
    this.leg4part3.mirror = true;
    setRotation(this.leg4part3, 0.669215F, 2.356194F, 0.0F);
    this.leg4part3b = new ModelRenderer(this, 72, 80);
    this.leg4part3b.addBox(-2.0F, -2.0F, -2.0F, 4, 16, 4);
    this.leg4part3b.setRotationPoint(-20.0F, 8.0F, 22.0F);
    this.leg4part3b.setTextureSize(512, 256);
    this.leg4part3b.mirror = true;
    setRotation(this.leg4part3b, -0.4833219F, 2.356194F, -0.0349066F);
    this.leg4part3c = new ModelRenderer(this, 42, 80);
    this.leg4part3c.addBox(-2.0F, 14.0F, 0.0F, 4, 3, 2);
    this.leg4part3c.setRotationPoint(-20.0F, 8.0F, 22.0F);
    this.leg4part3c.setTextureSize(512, 256);
    this.leg4part3c.mirror = true;
    setRotation(this.leg4part3c, -0.4833219F, 2.356194F, -0.0349066F);
    this.bodybase = new ModelRenderer(this, 98, 0);
    this.bodybase.addBox(-5.0F, -20.0F, -6.5F, 10, 20, 13);
    this.bodybase.setRotationPoint(0.0F, 1.0F, 1.0F);
    this.bodybase.setTextureSize(512, 256);
    this.bodybase.mirror = true;
    setRotation(this.bodybase, 0.0F, 0.0F, 0.0F);
    this.bodybasepart2 = new ModelRenderer(this, 146, 0);
    this.bodybasepart2.addBox(-6.0F, -20.0F, -7.5F, 12, 12, 21);
    this.bodybasepart2.setRotationPoint(0.0F, 1.0F, 1.0F);
    this.bodybasepart2.setTextureSize(512, 256);
    this.bodybasepart2.mirror = true;
    setRotation(this.bodybasepart2, 0.0F, 0.0F, 0.0F);
    this.bodybasepart3 = new ModelRenderer(this, 213, 0);
    this.bodybasepart3.addBox(-6.5F, -20.0F, -7.5F, 13, 12, 21);
    this.bodybasepart3.setRotationPoint(0.0F, 1.0F, 1.0F);
    this.bodybasepart3.setTextureSize(512, 256);
    this.bodybasepart3.mirror = true;
    setRotation(this.bodybasepart3, 0.0F, 0.0F, 0.0F);
    this.bodybasepart4 = new ModelRenderer(this, 132, 34);
    this.bodybasepart4.addBox(-5.0F, -18.0F, -16.5F, 10, 8, 9);
    this.bodybasepart4.setRotationPoint(0.0F, 1.0F, 1.0F);
    this.bodybasepart4.setTextureSize(512, 256);
    this.bodybasepart4.mirror = true;
    setRotation(this.bodybasepart4, 0.0F, 0.0F, 0.0F);
    this.bodybasepart5 = new ModelRenderer(this, 172, 36);
    this.bodybasepart5.addBox(-5.0F, -19.0F, 13.5F, 10, 10, 5);
    this.bodybasepart5.setRotationPoint(0.0F, 1.0F, 1.0F);
    this.bodybasepart5.setTextureSize(512, 256);
    this.bodybasepart5.mirror = true;
    setRotation(this.bodybasepart5, 0.0F, 0.0F, 0.0F);
    this.bodybasepart6 = new ModelRenderer(this, 142, 53);
    this.bodybasepart6.addBox(-4.5F, -18.0F, 18.5F, 9, 4, 3);
    this.bodybasepart6.setRotationPoint(0.0F, 1.0F, 1.0F);
    this.bodybasepart6.setTextureSize(512, 256);
    this.bodybasepart6.mirror = true;
    setRotation(this.bodybasepart6, 0.0F, 0.0F, 0.0F);
    this.bodybasepart7 = new ModelRenderer(this, 167, 53);
    this.bodybasepart7.addBox(-2.5F, -26.0F, -10.5F, 5, 2, 9);
    this.bodybasepart7.setRotationPoint(0.0F, 1.0F, 1.0F);
    this.bodybasepart7.setTextureSize(512, 256);
    this.bodybasepart7.mirror = true;
    setRotation(this.bodybasepart7, -1.264073F, 0.0F, 0.0F);
    this.bodybasepart8 = new ModelRenderer(this, 111, 68);
    this.bodybasepart8.addBox(-6.0F, -13.0F, -18.5F, 12, 10, 11);
    this.bodybasepart8.setRotationPoint(0.0F, 1.0F, 1.0F);
    this.bodybasepart8.setTextureSize(512, 256);
    this.bodybasepart8.mirror = true;
    setRotation(this.bodybasepart8, -0.4089647F, 0.0F, 0.0F);
    this.bodybasepart9 = new ModelRenderer(this, 157, 66);
    this.bodybasepart9.addBox(-7.5F, -14.0F, -11.5F, 15, 16, 7);
    this.bodybasepart9.setRotationPoint(0.0F, 1.0F, 1.0F);
    this.bodybasepart9.setTextureSize(512, 256);
    this.bodybasepart9.mirror = true;
    setRotation(this.bodybasepart9, -1.412787F, 0.0F, 0.0F);
    this.bodybasepart10 = new ModelRenderer(this, 204, 35);
    this.bodybasepart10.addBox(-7.5F, -22.0F, -9.5F, 15, 5, 22);
    this.bodybasepart10.setRotationPoint(0.0F, 1.0F, 1.0F);
    this.bodybasepart10.setTextureSize(512, 256);
    this.bodybasepart10.mirror = true;
    setRotation(this.bodybasepart10, 0.0F, 0.0F, 0.0F);
    this.bodybasepart11 = new ModelRenderer(this, 204, 63);
    this.bodybasepart11.addBox(-6.5F, -21.0F, -14.5F, 13, 4, 5);
    this.bodybasepart11.setRotationPoint(0.0F, 1.0F, 1.0F);
    this.bodybasepart11.setTextureSize(512, 256);
    this.bodybasepart11.mirror = true;
    setRotation(this.bodybasepart11, 0.0F, 0.0F, 0.0F);
    this.bodybasepart12 = new ModelRenderer(this, 282, 0);
    this.bodybasepart12.addBox(-5.0F, -3.0F, 2.5F, 10, 4, 12);
    this.bodybasepart12.setRotationPoint(0.0F, 1.0F, 1.0F);
    this.bodybasepart12.setTextureSize(512, 256);
    this.bodybasepart12.mirror = true;
    setRotation(this.bodybasepart12, 0.4833219F, 0.0F, 0.0F);
    this.bodybasepart13 = new ModelRenderer(this, 327, 0);
    this.bodybasepart13.addBox(4.0F, 1.0F, -3.5F, 4, 2, 10);
    this.bodybasepart13.setRotationPoint(0.0F, 1.0F, 1.0F);
    this.bodybasepart13.setTextureSize(512, 256);
    this.bodybasepart13.mirror = true;
    setRotation(this.bodybasepart13, 0.1858931F, 0.0F, -1.003822F);
    this.bodybasepart14 = new ModelRenderer(this, 327, 0);
    this.bodybasepart14.addBox(-8.0F, 1.0F, -3.5F, 4, 2, 10);
    this.bodybasepart14.setRotationPoint(0.0F, 1.0F, 1.0F);
    this.bodybasepart14.setTextureSize(512, 256);
    this.bodybasepart14.mirror = true;
    setRotation(this.bodybasepart14, 0.185895F, 0.0F, 1.003826F);
    this.bodybasepart15 = new ModelRenderer(this, 144, 91);
    this.bodybasepart15.addBox(-2.5F, -25.0F, 1.5F, 5, 3, 7);
    this.bodybasepart15.setRotationPoint(0.0F, 1.0F, 1.0F);
    this.bodybasepart15.setTextureSize(512, 256);
    this.bodybasepart15.mirror = true;
    setRotation(this.bodybasepart15, -0.7504916F, 0.0F, 0.0F);
    this.upperjawbase = new ModelRenderer(this, 0, 37);
    this.upperjawbase.addBox(-3.5F, -2.0F, -6.0F, 7, 5, 6);
    this.upperjawbase.setRotationPoint(0.0F, -13.0F, -15.0F);
    this.upperjawbase.setTextureSize(512, 256);
    this.upperjawbase.mirror = true;
    setRotation(this.upperjawbase, 0.0F, 0.0F, 0.0F);
    this.upperjawbasepart1 = new ModelRenderer(this, 35, 28);
    this.upperjawbasepart1.addBox(-4.5F, -1.0F, -7.0F, 3, 3, 2);
    this.upperjawbasepart1.setRotationPoint(0.0F, -13.0F, -15.0F);
    this.upperjawbasepart1.setTextureSize(512, 256);
    this.upperjawbasepart1.mirror = true;
    setRotation(this.upperjawbasepart1, 0.0F, 0.0F, 0.0F);
    this.upperjawbasepart2 = new ModelRenderer(this, 35, 28);
    this.upperjawbasepart2.addBox(1.5F, -1.0F, -7.0F, 3, 3, 2);
    this.upperjawbasepart2.setRotationPoint(0.0F, -13.0F, -15.0F);
    this.upperjawbasepart2.setTextureSize(512, 256);
    this.upperjawbasepart2.mirror = true;
    setRotation(this.upperjawbasepart2, 0.0F, 0.0F, 0.0F);
    this.upperjawbasepart3 = new ModelRenderer(this, 27, 37);
    this.upperjawbasepart3.addBox(-1.0F, -1.0F, -7.0F, 2, 3, 2);
    this.upperjawbasepart3.setRotationPoint(0.0F, -13.0F, -15.0F);
    this.upperjawbasepart3.setTextureSize(512, 256);
    this.upperjawbasepart3.mirror = true;
    setRotation(this.upperjawbasepart3, 0.0F, 0.0F, 0.0F);
    this.tooth1 = new ModelRenderer(this, 116, 34);
    this.tooth1.addBox(-1.5F, -2.0F, -14.0F, 2, 2, 7);
    this.tooth1.setRotationPoint(0.0F, -13.0F, -15.0F);
    this.tooth1.setTextureSize(512, 256);
    this.tooth1.mirror = true;
    setRotation(this.tooth1, 0.2602503F, 0.3717861F, 0.0F);
    this.tooth2 = new ModelRenderer(this, 116, 34);
    this.tooth2.addBox(-0.5F, -2.0F, -14.0F, 2, 2, 7);
    this.tooth2.setRotationPoint(0.0F, -13.0F, -15.0F);
    this.tooth2.setTextureSize(512, 256);
    this.tooth2.mirror = true;
    setRotation(this.tooth2, 0.2602503F, -0.3717861F, 0.0F);
    this.tooth3 = new ModelRenderer(this, 116, 34);
    this.tooth3.addBox(-1.0F, -2.0F, -14.0F, 2, 2, 7);
    this.tooth3.setRotationPoint(0.0F, -13.0F, -15.0F);
    this.tooth3.setTextureSize(512, 256);
    this.tooth3.mirror = true;
    setRotation(this.tooth3, 0.2602503F, 0.0F, 0.0F);
    this.tooth4 = new ModelRenderer(this, 90, 111);
    this.tooth4.addBox(-5.5F, 1.5F, -23.5F, 3, 2, 5);
    this.tooth4.setRotationPoint(0.0F, 0.0F, -6.0F);
    this.tooth4.setTextureSize(512, 256);
    this.tooth4.mirror = true;
    setRotation(this.tooth4, -0.2230717F, 0.0F, 0.0F);
    this.tooth5 = new ModelRenderer(this, 90, 111);
    this.tooth5.addBox(2.5F, 1.5F, -23.5F, 3, 2, 5);
    this.tooth5.setRotationPoint(0.0F, 0.0F, -6.0F);
    this.tooth5.setTextureSize(512, 256);
    this.tooth5.mirror = true;
    setRotation(this.tooth5, -0.2230717F, 0.0F, 0.0F);
    this.lowerjawbase = new ModelRenderer(this, 90, 91);
    this.lowerjawbase.addBox(-5.0F, -1.0F, -15.5F, 10, 2, 16);
    this.lowerjawbase.setRotationPoint(0.0F, 0.0F, -6.0F);
    this.lowerjawbase.setTextureSize(512, 256);
    this.lowerjawbase.mirror = true;
    setRotation(this.lowerjawbase, 0.0F, 0.0F, 0.0F);
    this.lowerjawbasepart1 = new ModelRenderer(this, 0, 69);
    this.lowerjawbasepart1.addBox(-5.0F, -3.0F, -15.5F, 1, 2, 16);
    this.lowerjawbasepart1.setRotationPoint(0.0F, 0.0F, -6.0F);
    this.lowerjawbasepart1.setTextureSize(512, 256);
    this.lowerjawbasepart1.mirror = true;
    setRotation(this.lowerjawbasepart1, 0.0F, 0.0F, 0.0F);
    this.lowerjawbasepart2 = new ModelRenderer(this, 0, 69);
    this.lowerjawbasepart2.addBox(4.0F, -3.0F, -15.5F, 1, 2, 16);
    this.lowerjawbasepart2.setRotationPoint(0.0F, 0.0F, -6.0F);
    this.lowerjawbasepart2.setTextureSize(512, 256);
    this.lowerjawbasepart2.mirror = true;
    setRotation(this.lowerjawbasepart2, 0.0F, 0.0F, 0.0F);
    this.lowerjawbasepart3 = new ModelRenderer(this, 0, 88);
    this.lowerjawbasepart3.addBox(-4.0F, -2.0F, -15.5F, 1, 1, 16);
    this.lowerjawbasepart3.setRotationPoint(0.0F, 0.0F, -6.0F);
    this.lowerjawbasepart3.setTextureSize(512, 256);
    this.lowerjawbasepart3.mirror = true;
    setRotation(this.lowerjawbasepart3, 0.0F, 0.0F, 0.0F);
    this.lowerjawbasepart4 = new ModelRenderer(this, 0, 88);
    this.lowerjawbasepart4.addBox(3.0F, -2.0F, -15.5F, 1, 1, 16);
    this.lowerjawbasepart4.setRotationPoint(0.0F, 0.0F, -6.0F);
    this.lowerjawbasepart4.setTextureSize(512, 256);
    this.lowerjawbasepart4.mirror = true;
    setRotation(this.lowerjawbasepart4, 0.0F, 0.0F, 0.0F);
    this.lowerjawbasepart5 = new ModelRenderer(this, 35, 134);
    this.lowerjawbasepart5.addBox(5.0F, -5.0F, -16.5F, 2, 4, 20);
    this.lowerjawbasepart5.setRotationPoint(0.0F, 0.0F, -6.0F);
    this.lowerjawbasepart5.setTextureSize(512, 256);
    this.lowerjawbasepart5.mirror = true;
    setRotation(this.lowerjawbasepart5, 0.0F, 0.0F, 0.0F);
    this.lowerjawbasepart6 = new ModelRenderer(this, 35, 109);
    this.lowerjawbasepart6.addBox(-7.0F, -5.0F, -16.5F, 2, 4, 20);
    this.lowerjawbasepart6.setRotationPoint(0.0F, 0.0F, -6.0F);
    this.lowerjawbasepart6.setTextureSize(512, 256);
    this.lowerjawbasepart6.mirror = true;
    setRotation(this.lowerjawbasepart6, 0.0F, 0.0F, 0.0F);
    this.lowerjawbasepart7 = new ModelRenderer(this, 73, 101);
    this.lowerjawbasepart7.addBox(-6.0F, -3.0F, -19.5F, 4, 3, 4);
    this.lowerjawbasepart7.setRotationPoint(0.0F, 0.0F, -6.0F);
    this.lowerjawbasepart7.setTextureSize(512, 256);
    this.lowerjawbasepart7.mirror = true;
    setRotation(this.lowerjawbasepart7, 0.0F, 0.0F, 0.0F);
    this.lowerjawbasepart8 = new ModelRenderer(this, 73, 101);
    this.lowerjawbasepart8.addBox(2.0F, -3.0F, -19.5F, 4, 3, 4);
    this.lowerjawbasepart8.setRotationPoint(0.0F, 0.0F, -6.0F);
    this.lowerjawbasepart8.setTextureSize(512, 256);
    this.lowerjawbasepart8.mirror = true;
    setRotation(this.lowerjawbasepart8, 0.0F, 0.0F, 0.0F);
    this.lowerjawbasepart9 = new ModelRenderer(this, 95, 72);
    this.lowerjawbasepart9.addBox(-2.0F, -2.0F, -18.5F, 4, 2, 3);
    this.lowerjawbasepart9.setRotationPoint(0.0F, 0.0F, -6.0F);
    this.lowerjawbasepart9.setTextureSize(512, 256);
    this.lowerjawbasepart9.mirror = true;
    setRotation(this.lowerjawbasepart9, 0.0F, 0.0F, 0.0F);
    this.lowerjawbasepart10 = new ModelRenderer(this, 0, 106);
    this.lowerjawbasepart10.addBox(-8.0F, -3.0F, -12.5F, 1, 2, 16);
    this.lowerjawbasepart10.setRotationPoint(0.0F, 0.0F, -6.0F);
    this.lowerjawbasepart10.setTextureSize(512, 256);
    this.lowerjawbasepart10.mirror = true;
    setRotation(this.lowerjawbasepart10, 0.0F, 0.0F, 0.0F);
    this.lowerjawbasepart11 = new ModelRenderer(this, 0, 106);
    this.lowerjawbasepart11.addBox(7.0F, -3.0F, -12.5F, 1, 2, 16);
    this.lowerjawbasepart11.setRotationPoint(0.0F, 0.0F, -6.0F);
    this.lowerjawbasepart11.setTextureSize(512, 256);
    this.lowerjawbasepart11.mirror = true;
    setRotation(this.lowerjawbasepart11, 0.0F, 0.0F, 0.0F);
    this.arm1start = new ModelRenderer(this, 0, 50);
    this.arm1start.addBox(-0.5F, -1.0F, -1.0F, 3, 2, 2);
    this.arm1start.setRotationPoint(5.0F, -11.0F, -14.0F);
    this.arm1start.setTextureSize(512, 256);
    this.arm1start.mirror = true;
    setRotation(this.arm1start, 0.0F, 0.0F, 0.0F);
    this.arm1 = new ModelRenderer(this, 9, 125);
    this.arm1.addBox(-0.5F, -1.0F, -1.0F, 2, 5, 2);
    this.arm1.setRotationPoint(7.0F, -11.0F, -14.0F);
    this.arm1.setTextureSize(512, 256);
    this.arm1.mirror = true;
    setRotation(this.arm1, -0.8922867F, 0.0F, 0.0F);
    this.arm1part2 = new ModelRenderer(this, 9, 133);
    this.arm1part2.addBox(-0.5F, -1.0F, -1.0F, 2, 5, 2);
    this.arm1part2.setRotationPoint(7.0F, -9.0F, -16.5F);
    this.arm1part2.setTextureSize(512, 256);
    this.arm1part2.mirror = true;
    setRotation(this.arm1part2, 0.7435722F, 0.0F, 0.0F);
    this.arm1end = new ModelRenderer(this, 9, 141);
    this.arm1end.addBox(1.0F, 3.0F, 1.0F, 1, 1, 2);
    this.arm1end.setRotationPoint(6.0F, -9.0F, -16.5F);
    this.arm1end.setTextureSize(512, 256);
    this.arm1end.mirror = true;
    setRotation(this.arm1end, 0.7435722F, 0.0F, 0.0F);
    this.arm2start = new ModelRenderer(this, 0, 50);
    this.arm2start.addBox(-2.5F, -1.0F, -1.0F, 3, 2, 2);
    this.arm2start.setRotationPoint(-5.0F, -11.0F, -14.0F);
    this.arm2start.setTextureSize(512, 256);
    this.arm2start.mirror = true;
    setRotation(this.arm2start, 0.0F, 0.0F, 0.0F);
    this.arm2 = new ModelRenderer(this, 0, 125);
    this.arm2.addBox(-1.5F, -1.0F, -1.0F, 2, 5, 2);
    this.arm2.setRotationPoint(-7.0F, -11.0F, -14.0F);
    this.arm2.setTextureSize(512, 256);
    this.arm2.mirror = true;
    setRotation(this.arm2, -0.8922867F, 0.0F, 0.0F);
    this.arm2part2 = new ModelRenderer(this, 0, 133);
    this.arm2part2.addBox(-1.5F, -1.0F, -1.0F, 2, 5, 2);
    this.arm2part2.setRotationPoint(-7.0F, -9.0F, -16.5F);
    this.arm2part2.setTextureSize(512, 256);
    this.arm2part2.mirror = true;
    setRotation(this.arm2part2, 0.7435722F, 0.0F, 0.0F);
    this.arm2end = new ModelRenderer(this, 0, 141);
    this.arm2end.addBox(-1.0F, 3.0F, 1.0F, 1, 1, 2);
    this.arm2end.setRotationPoint(-7.0F, -9.0F, -16.5F);
    this.arm2end.setTextureSize(512, 256);
    this.arm2end.mirror = true;
    setRotation(this.arm2end, 0.7435722F, 0.0F, 0.0F);
    this.eye1 = new ModelRenderer(this, 36, 37);
    this.eye1.addBox(-0.5F, -1.0F, -1.0F, 1, 2, 2);
    this.eye1.setRotationPoint(6.5F, -10.0F, -11.0F);
    this.eye1.setTextureSize(512, 256);
    this.eye1.mirror = true;
    setRotation(this.eye1, 0.0F, 0.0F, 0.0F);
    this.eye2 = new ModelRenderer(this, 36, 37);
    this.eye2.addBox(-0.5F, -1.0F, -1.0F, 1, 2, 2);
    this.eye2.setRotationPoint(-6.5F, -10.0F, -11.0F);
    this.eye2.setTextureSize(512, 256);
    this.eye2.mirror = true;
    setRotation(this.eye2, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    SpitBug e = (SpitBug)entity;
    RenderInfo r = null;
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    float newangle = 0.0F, upangle = 0.0F, nextangle = 0.0F;
    float pi4 = 1.570795F;
    newangle = MathHelper.sin(f2 * 2.0F * this.wingspeed) * 3.1415927F * 0.12F * f1;
    nextangle = MathHelper.sin((f2 + 0.1F) * 2.0F * this.wingspeed) * 3.1415927F * 0.12F * f1;
    upangle = 0.0F;
    if (nextangle > newangle)
      upangle = Math.abs(MathHelper.cos(f2 * 2.0F * this.wingspeed) * 3.1415927F * 0.12F * f1); 
    doLeftFrontLeg(newangle, upangle);
    doLeftRearLeg(-newangle, upangle);
    newangle = MathHelper.sin((float)((f2 * 2.0F * this.wingspeed) + Math.PI)) * 3.1415927F * 0.12F * f1;
    nextangle = MathHelper.sin((float)(((f2 + 0.1F) * 2.0F * this.wingspeed) + Math.PI)) * 3.1415927F * 0.12F * f1;
    upangle = 0.0F;
    if (nextangle > newangle)
      upangle = Math.abs(MathHelper.cos((float)((f2 * 2.0F * this.wingspeed) + Math.PI)) * 3.1415927F * 0.12F * f1); 
    doRightFrontLeg(-newangle, upangle);
    doRightRearLeg(newangle, upangle);
    if (e.getAttacking() == 0) {
      newangle = MathHelper.cos(f2 * 0.3F * this.wingspeed) * 3.1415927F * 0.015F;
    } else {
      newangle = MathHelper.cos(f2 * 2.6F * this.wingspeed) * 3.1415927F * 0.1F;
    } 
    newangle = Math.abs(newangle);
    this.upperjawbasepart1.rotateAngleX = newangle;
    this.upperjawbasepart2.rotateAngleX = newangle;
    this.upperjawbasepart3.rotateAngleX = newangle;
    this.tooth1.rotateAngleX = 0.26F + newangle;
    this.tooth2.rotateAngleX = 0.26F + newangle;
    this.tooth3.rotateAngleX = 0.26F + newangle;
    this.legintersection.render(f5);
    this.legintersectionpart2.render(f5);
    this.legintersectionpart3.render(f5);
    this.leg1start.render(f5);
    this.leg1startpart2.render(f5);
    this.leg1startpart3.render(f5);
    this.leg1.render(f5);
    this.leg1part2.render(f5);
    this.leg1part2b.render(f5);
    this.leg1part2c.render(f5);
    this.leg1part2d.render(f5);
    this.leg1part3.render(f5);
    this.leg1part3b.render(f5);
    this.leg1part3c.render(f5);
    this.leg2start.render(f5);
    this.leg2startpart2.render(f5);
    this.leg2startpart3.render(f5);
    this.leg2.render(f5);
    this.leg2part2.render(f5);
    this.leg2part2b.render(f5);
    this.leg2part2c.render(f5);
    this.leg2part2d.render(f5);
    this.leg2part3.render(f5);
    this.leg2part3b.render(f5);
    this.leg2part3c.render(f5);
    this.leg3start.render(f5);
    this.leg3startpart2.render(f5);
    this.leg3startpart3.render(f5);
    this.leg3.render(f5);
    this.leg3part2.render(f5);
    this.leg3part2b.render(f5);
    this.leg3part2c.render(f5);
    this.leg3part2d.render(f5);
    this.leg3part3.render(f5);
    this.leg3part3b.render(f5);
    this.leg3part3c.render(f5);
    this.leg4start.render(f5);
    this.leg4startpart2.render(f5);
    this.leg4startpart3.render(f5);
    this.leg4.render(f5);
    this.leg4part2.render(f5);
    this.leg4part2b.render(f5);
    this.leg4part2c.render(f5);
    this.leg4part2d.render(f5);
    this.leg4part3.render(f5);
    this.leg4part3b.render(f5);
    this.leg4part3c.render(f5);
    this.bodybase.render(f5);
    this.bodybasepart2.render(f5);
    this.bodybasepart3.render(f5);
    this.bodybasepart4.render(f5);
    this.bodybasepart5.render(f5);
    this.bodybasepart6.render(f5);
    this.bodybasepart7.render(f5);
    this.bodybasepart8.render(f5);
    this.bodybasepart9.render(f5);
    this.bodybasepart10.render(f5);
    this.bodybasepart11.render(f5);
    this.bodybasepart12.render(f5);
    this.bodybasepart13.render(f5);
    this.bodybasepart14.render(f5);
    this.bodybasepart15.render(f5);
    this.upperjawbase.render(f5);
    this.upperjawbasepart1.render(f5);
    this.upperjawbasepart2.render(f5);
    this.upperjawbasepart3.render(f5);
    this.tooth1.render(f5);
    this.tooth2.render(f5);
    this.tooth3.render(f5);
    this.tooth4.render(f5);
    this.tooth5.render(f5);
    this.lowerjawbase.render(f5);
    this.lowerjawbasepart1.render(f5);
    this.lowerjawbasepart2.render(f5);
    this.lowerjawbasepart3.render(f5);
    this.lowerjawbasepart4.render(f5);
    this.lowerjawbasepart5.render(f5);
    this.lowerjawbasepart6.render(f5);
    this.lowerjawbasepart7.render(f5);
    this.lowerjawbasepart8.render(f5);
    this.lowerjawbasepart9.render(f5);
    this.lowerjawbasepart10.render(f5);
    this.lowerjawbasepart11.render(f5);
    this.arm1start.render(f5);
    this.arm1.render(f5);
    this.arm1part2.render(f5);
    this.arm1end.render(f5);
    this.arm2start.render(f5);
    this.arm2.render(f5);
    this.arm2part2.render(f5);
    this.arm2end.render(f5);
    this.eye1.render(f5);
    this.eye2.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z) {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
    super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
  }
  
  private void doRightFrontLeg(float angle, float upangle) {
    this.leg1.rotateAngleY = -1.2F + angle;
    this.leg1part2.rotateAngleY = this.leg1.rotateAngleY;
    this.leg1part2b.rotateAngleY = this.leg1.rotateAngleY;
    this.leg1part2c.rotateAngleY = this.leg1.rotateAngleY;
    this.leg1part2d.rotateAngleY = this.leg1.rotateAngleY;
    this.leg1part3.rotateAngleY = this.leg1.rotateAngleY;
    this.leg1part3b.rotateAngleY = this.leg1.rotateAngleY;
    this.leg1part3c.rotateAngleY = this.leg1.rotateAngleY;
    float dist = 14.0F;
    dist = (float)(dist * Math.cos(this.leg1.rotateAngleX));
    this.leg1part2d.rotationPointZ = (float)(this.leg1.rotationPointZ - Math.cos(this.leg1.rotateAngleY) * dist);
    this.leg1part2d.rotationPointX = (float)(this.leg1.rotationPointX - Math.sin(this.leg1.rotateAngleY) * dist);
    this.leg1part2.rotateAngleX = -1.152F + upangle;
    this.leg1part2b.rotateAngleX = -0.743F + upangle;
    this.leg1part2c.rotateAngleX = -0.632F + upangle;
    this.leg1part2d.rotateAngleX = -1.041F + upangle;
    dist = 14.0F;
    dist = (float)(dist * Math.cos(this.leg1part2.rotateAngleX));
    this.leg1part3.rotationPointZ = (float)(this.leg1part2.rotationPointZ - Math.cos(this.leg1part2.rotateAngleY) * dist);
    this.leg1part3.rotationPointX = (float)(this.leg1part2.rotationPointX - Math.sin(this.leg1part2.rotateAngleY) * dist);
    this.leg1part3.rotateAngleX = 0.669F - upangle;
    dist = 8.0F;
    dist = (float)Math.abs(dist * Math.cos(this.leg1part3.rotateAngleX));
    this.leg1part3c.rotationPointZ = (float)(this.leg1part3.rotationPointZ - Math.cos(this.leg1part3.rotateAngleY) * dist);
    this.leg1part3c.rotationPointX = (float)(this.leg1part3.rotationPointX - Math.sin(this.leg1part3.rotateAngleY) * dist);
    this.leg1part3b.rotateAngleX = -0.48F - upangle;
    this.leg1part3c.rotateAngleX = -0.48F - upangle;
  }
  
  private void doLeftFrontLeg(float angle, float upangle) {
    this.leg2.rotateAngleY = 1.2F + angle;
    this.leg2part2.rotateAngleY = this.leg2.rotateAngleY;
    this.leg2part2b.rotateAngleY = this.leg2.rotateAngleY;
    this.leg2part2c.rotateAngleY = this.leg2.rotateAngleY;
    this.leg2part2d.rotateAngleY = this.leg2.rotateAngleY;
    this.leg2part3.rotateAngleY = this.leg2.rotateAngleY;
    this.leg2part3b.rotateAngleY = this.leg2.rotateAngleY;
    this.leg2part3c.rotateAngleY = this.leg2.rotateAngleY;
    float dist = 14.0F;
    dist = (float)(dist * Math.cos(this.leg2.rotateAngleX));
    this.leg2part2d.rotationPointZ = (float)(this.leg2.rotationPointZ - Math.cos(this.leg2.rotateAngleY) * dist);
    this.leg2part2d.rotationPointX = (float)(this.leg2.rotationPointX - Math.sin(this.leg2.rotateAngleY) * dist);
    this.leg2part2.rotateAngleX = -1.152F + upangle;
    this.leg2part2b.rotateAngleX = -0.743F + upangle;
    this.leg2part2c.rotateAngleX = -0.632F + upangle;
    this.leg2part2d.rotateAngleX = -1.041F + upangle;
    dist = 14.0F;
    dist = (float)(dist * Math.cos(this.leg2part2.rotateAngleX));
    this.leg2part3.rotationPointZ = (float)(this.leg2part2.rotationPointZ - Math.cos(this.leg2part2.rotateAngleY) * dist);
    this.leg2part3.rotationPointX = (float)(this.leg2part2.rotationPointX - Math.sin(this.leg2part2.rotateAngleY) * dist);
    this.leg2part3.rotateAngleX = 0.669F - upangle;
    dist = 8.0F;
    dist = (float)Math.abs(dist * Math.cos(this.leg2part3.rotateAngleX));
    this.leg2part3c.rotationPointZ = (float)(this.leg2part3.rotationPointZ - Math.cos(this.leg2part3.rotateAngleY) * dist);
    this.leg2part3c.rotationPointX = (float)(this.leg2part3.rotationPointX - Math.sin(this.leg2part3.rotateAngleY) * dist);
    this.leg2part3b.rotateAngleX = -0.48F - upangle;
    this.leg2part3c.rotateAngleX = -0.48F - upangle;
  }
  
  private void doRightRearLeg(float angle, float upangle) {
    this.leg4.rotateAngleY = 2.1F + angle;
    this.leg4part2.rotateAngleY = this.leg4.rotateAngleY;
    this.leg4part2b.rotateAngleY = this.leg4.rotateAngleY;
    this.leg4part2c.rotateAngleY = this.leg4.rotateAngleY;
    this.leg4part2d.rotateAngleY = this.leg4.rotateAngleY;
    this.leg4part3.rotateAngleY = this.leg4.rotateAngleY;
    this.leg4part3b.rotateAngleY = this.leg4.rotateAngleY;
    this.leg4part3c.rotateAngleY = this.leg4.rotateAngleY;
    float dist = 14.0F;
    dist = (float)(dist * Math.cos(this.leg4.rotateAngleX));
    this.leg4part2d.rotationPointZ = (float)(this.leg4.rotationPointZ - Math.cos(this.leg4.rotateAngleY) * dist);
    this.leg4part2d.rotationPointX = (float)(this.leg4.rotationPointX - Math.sin(this.leg4.rotateAngleY) * dist);
    this.leg4part2.rotateAngleX = -1.152F + upangle;
    this.leg4part2b.rotateAngleX = -0.743F + upangle;
    this.leg4part2c.rotateAngleX = -0.632F + upangle;
    this.leg4part2d.rotateAngleX = -1.041F + upangle;
    dist = 14.0F;
    dist = (float)(dist * Math.cos(this.leg4part2.rotateAngleX));
    this.leg4part3.rotationPointZ = (float)(this.leg4part2.rotationPointZ - Math.cos(this.leg4part2.rotateAngleY) * dist);
    this.leg4part3.rotationPointX = (float)(this.leg4part2.rotationPointX - Math.sin(this.leg4part2.rotateAngleY) * dist);
    this.leg4part3.rotateAngleX = 0.669F - upangle;
    dist = 8.0F;
    dist = (float)Math.abs(dist * Math.cos(this.leg4part3.rotateAngleX));
    this.leg4part3c.rotationPointZ = (float)(this.leg4part3.rotationPointZ - Math.cos(this.leg4part3.rotateAngleY) * dist);
    this.leg4part3c.rotationPointX = (float)(this.leg4part3.rotationPointX - Math.sin(this.leg4part3.rotateAngleY) * dist);
    this.leg4part3b.rotateAngleX = -0.48F - upangle;
    this.leg4part3c.rotateAngleX = -0.48F - upangle;
  }
  
  private void doLeftRearLeg(float angle, float upangle) {
    this.leg3.rotateAngleY = -2.1F + angle;
    this.leg3part2.rotateAngleY = this.leg3.rotateAngleY;
    this.leg3part2b.rotateAngleY = this.leg3.rotateAngleY;
    this.leg3part2c.rotateAngleY = this.leg3.rotateAngleY;
    this.leg3part2d.rotateAngleY = this.leg3.rotateAngleY;
    this.leg3part3.rotateAngleY = this.leg3.rotateAngleY;
    this.leg3part3b.rotateAngleY = this.leg3.rotateAngleY;
    this.leg3part3c.rotateAngleY = this.leg3.rotateAngleY;
    float dist = 14.0F;
    dist = (float)(dist * Math.cos(this.leg3.rotateAngleX));
    this.leg3part2d.rotationPointZ = (float)(this.leg3.rotationPointZ - Math.cos(this.leg3.rotateAngleY) * dist);
    this.leg3part2d.rotationPointX = (float)(this.leg3.rotationPointX - Math.sin(this.leg3.rotateAngleY) * dist);
    this.leg3part2.rotateAngleX = -1.152F + upangle;
    this.leg3part2b.rotateAngleX = -0.743F + upangle;
    this.leg3part2c.rotateAngleX = -0.632F + upangle;
    this.leg3part2d.rotateAngleX = -1.041F + upangle;
    dist = 14.0F;
    dist = (float)(dist * Math.cos(this.leg3part2.rotateAngleX));
    this.leg3part3.rotationPointZ = (float)(this.leg3part2.rotationPointZ - Math.cos(this.leg3part2.rotateAngleY) * dist);
    this.leg3part3.rotationPointX = (float)(this.leg3part2.rotationPointX - Math.sin(this.leg3part2.rotateAngleY) * dist);
    this.leg3part3.rotateAngleX = 0.669F - upangle;
    dist = 8.0F;
    dist = (float)Math.abs(dist * Math.cos(this.leg3part3.rotateAngleX));
    this.leg3part3c.rotationPointZ = (float)(this.leg3part3.rotationPointZ - Math.cos(this.leg3part3.rotateAngleY) * dist);
    this.leg3part3c.rotationPointX = (float)(this.leg3part3.rotationPointX - Math.sin(this.leg3part3.rotateAngleY) * dist);
    this.leg3part3b.rotateAngleX = -0.48F - upangle;
    this.leg3part3c.rotateAngleX = -0.48F - upangle;
  }
}
