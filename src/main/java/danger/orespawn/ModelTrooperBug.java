package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelTrooperBug extends ModelBase {
  private float wingspeed = 1.0F;
  
  ModelRenderer legintersection;
  
  ModelRenderer legintersectionb;
  
  ModelRenderer leg1start;
  
  ModelRenderer leg1shoulder;
  
  ModelRenderer leg1shoulderpart2;
  
  ModelRenderer leg1part1;
  
  ModelRenderer leg1part1b;
  
  ModelRenderer leg1elbow;
  
  ModelRenderer leg1part2;
  
  ModelRenderer leg1part2b;
  
  ModelRenderer leg1part2c;
  
  ModelRenderer leg1part3;
  
  ModelRenderer leg1part3b;
  
  ModelRenderer leg1part3c;
  
  ModelRenderer leg1part3d;
  
  ModelRenderer leg2start;
  
  ModelRenderer leg2shoulder;
  
  ModelRenderer leg2shoulderpart2;
  
  ModelRenderer leg2part1;
  
  ModelRenderer leg2part1b;
  
  ModelRenderer leg2elbow;
  
  ModelRenderer leg2part2;
  
  ModelRenderer leg2part2b;
  
  ModelRenderer leg2part2c;
  
  ModelRenderer leg2part3;
  
  ModelRenderer leg2part3b;
  
  ModelRenderer leg2part3c;
  
  ModelRenderer leg2part3d;
  
  ModelRenderer leg3start;
  
  ModelRenderer leg3shoulder;
  
  ModelRenderer leg3shoulderpart2;
  
  ModelRenderer leg3part1;
  
  ModelRenderer leg3part1b;
  
  ModelRenderer leg3elbow;
  
  ModelRenderer leg3part2;
  
  ModelRenderer leg3part2b;
  
  ModelRenderer leg3part2c;
  
  ModelRenderer leg3part3;
  
  ModelRenderer leg3part3b;
  
  ModelRenderer leg3part3c;
  
  ModelRenderer leg3part3d;
  
  ModelRenderer leg4start;
  
  ModelRenderer leg4shoulder;
  
  ModelRenderer leg4shoulderpart2;
  
  ModelRenderer leg4part1;
  
  ModelRenderer leg4part1b;
  
  ModelRenderer leg4elbow;
  
  ModelRenderer leg4part2;
  
  ModelRenderer leg4part2b;
  
  ModelRenderer leg4part2c;
  
  ModelRenderer leg4part3;
  
  ModelRenderer leg4part3b;
  
  ModelRenderer leg4part3c;
  
  ModelRenderer leg4part3d;
  
  ModelRenderer jawbase;
  
  ModelRenderer jawbase2;
  
  ModelRenderer jawbase3;
  
  ModelRenderer jawbase4;
  
  ModelRenderer jawbase5;
  
  ModelRenderer jawbase6;
  
  ModelRenderer jawbase7;
  
  ModelRenderer jawbase8;
  
  ModelRenderer jawbase9;
  
  ModelRenderer jawleft;
  
  ModelRenderer jawright;
  
  ModelRenderer jawend;
  
  ModelRenderer headstart;
  
  ModelRenderer headbase;
  
  ModelRenderer headbase2;
  
  ModelRenderer headbase3;
  
  ModelRenderer headbase4;
  
  ModelRenderer headbase5;
  
  ModelRenderer headbase6;
  
  ModelRenderer headbase7;
  
  ModelRenderer headbase8;
  
  ModelRenderer headbase9;
  
  ModelRenderer headbase10;
  
  ModelRenderer headleftridge;
  
  ModelRenderer headrightridge;
  
  ModelRenderer antenna1;
  
  ModelRenderer antenna1part2;
  
  ModelRenderer antenna2;
  
  ModelRenderer antenna2part2;
  
  ModelRenderer eyebase1;
  
  ModelRenderer eye1;
  
  ModelRenderer eyebase2;
  
  ModelRenderer eye2;
  
  ModelRenderer arm1start;
  
  ModelRenderer arm1part1;
  
  ModelRenderer arm1part2;
  
  ModelRenderer arm1part2b;
  
  ModelRenderer arm1part2c;
  
  ModelRenderer arm1part3;
  
  ModelRenderer arm1part3b;
  
  ModelRenderer arm2start;
  
  ModelRenderer arm2part1;
  
  ModelRenderer arm2part2;
  
  ModelRenderer arm2part2b;
  
  ModelRenderer arm2part2c;
  
  ModelRenderer arm2part3;
  
  ModelRenderer arm2part3b;
  
  ModelRenderer innermouth;
  
  ModelRenderer innermouth2;
  
  ModelRenderer tooth1;
  
  ModelRenderer tooth2;
  
  ModelRenderer tooth3;
  
  ModelRenderer tooth4;
  
  ModelRenderer tooth5;
  
  ModelRenderer tooth6;
  
  ModelRenderer mouthedge1;
  
  ModelRenderer mouthedge2;
  
  ModelRenderer mouthedge3;
  
  ModelRenderer mouthedge4;
  
  ModelRenderer arm3start;
  
  ModelRenderer arm3part1;
  
  ModelRenderer arm3part1b;
  
  ModelRenderer arm3part1c;
  
  ModelRenderer arm4start;
  
  ModelRenderer arm4part1;
  
  ModelRenderer arm4part1b;
  
  ModelRenderer arm4part1c;
  
  ModelRenderer tongue;
  
  ModelRenderer tonguepart2;
  
  ModelRenderer upperjawridgeleft;
  
  ModelRenderer upperjawridgeright;
  
  ModelRenderer upperjawbaseleft;
  
  ModelRenderer upperjawbaseright;
  
  ModelRenderer upperjawbase;
  
  ModelRenderer upperjawbase2;
  
  ModelRenderer upperjawbase3;
  
  ModelRenderer upperjawbase4;
  
  ModelRenderer upperjawend;
  
  ModelRenderer upperjawleftend;
  
  ModelRenderer upperjawrightend;
  
  public ModelTrooperBug(float f1) {
    this.wingspeed = f1;
    this.textureWidth = 512;
    this.textureHeight = 256;
    this.legintersection = new ModelRenderer(this, 0, 0);
    this.legintersection.addBox(-9.0F, -2.0F, -9.0F, 18, 4, 18);
    this.legintersection.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.legintersection.setTextureSize(512, 256);
    this.legintersection.mirror = true;
    setRotation(this.legintersection, 0.0F, 0.0F, 0.0F);
    this.legintersectionb = new ModelRenderer(this, 0, 156);
    this.legintersectionb.addBox(-9.0F, -2.0F, -16.0F, 18, 4, 18);
    this.legintersectionb.setRotationPoint(0.0F, 0.0F, 7.0F);
    this.legintersectionb.setTextureSize(512, 256);
    this.legintersectionb.mirror = true;
    setRotation(this.legintersectionb, 0.2230717F, 0.0F, 0.0F);
    this.leg1start = new ModelRenderer(this, 55, 0);
    this.leg1start.addBox(-3.0F, -2.5F, -4.0F, 6, 5, 5);
    this.leg1start.setRotationPoint(-7.0F, 0.0F, -7.0F);
    this.leg1start.setTextureSize(512, 256);
    this.leg1start.mirror = true;
    setRotation(this.leg1start, 0.0F, 0.7853982F, 0.0F);
    this.leg1shoulder = new ModelRenderer(this, 77, 0);
    this.leg1shoulder.addBox(-2.5F, -4.5F, -6.0F, 5, 6, 10);
    this.leg1shoulder.setRotationPoint(-10.0F, 0.0F, -10.0F);
    this.leg1shoulder.setTextureSize(512, 256);
    this.leg1shoulder.mirror = true;
    setRotation(this.leg1shoulder, -0.5576792F, 0.7853982F, 0.0F);
    this.leg1shoulderpart2 = new ModelRenderer(this, 70, 18);
    this.leg1shoulderpart2.addBox(-1.5F, -2.5F, -11.0F, 3, 3, 6);
    this.leg1shoulderpart2.setRotationPoint(-10.0F, 0.0F, -10.0F);
    this.leg1shoulderpart2.setTextureSize(512, 256);
    this.leg1shoulderpart2.mirror = true;
    setRotation(this.leg1shoulderpart2, -0.4089647F, 0.7853982F, 0.0F);
    this.leg1part1 = new ModelRenderer(this, 68, 17);
    this.leg1part1.addBox(-2.0F, -2.5F, -23.0F, 4, 3, 26);
    this.leg1part1.setRotationPoint(-17.0F, -5.0F, -17.0F);
    this.leg1part1.setTextureSize(512, 256);
    this.leg1part1.mirror = true;
    setRotation(this.leg1part1, 1.115358F, 0.7853982F, 0.0F);
    this.leg1part1b = new ModelRenderer(this, 19, 23);
    this.leg1part1b.addBox(-1.5F, 0.5F, -23.0F, 3, 3, 21);
    this.leg1part1b.setRotationPoint(-17.0F, -5.0F, -17.0F);
    this.leg1part1b.setTextureSize(512, 256);
    this.leg1part1b.mirror = true;
    setRotation(this.leg1part1b, 1.07818F, 0.7853982F, 0.0F);
    this.leg1elbow = new ModelRenderer(this, 68, 28);
    this.leg1elbow.addBox(-1.5F, -5.5F, -22.0F, 3, 6, 3);
    this.leg1elbow.setRotationPoint(-17.0F, -5.0F, -17.0F);
    this.leg1elbow.setTextureSize(512, 256);
    this.leg1elbow.mirror = true;
    setRotation(this.leg1elbow, 1.115358F, 0.7853982F, 0.0F);
    this.leg1part2 = new ModelRenderer(this, 48, 47);
    this.leg1part2.addBox(-3.0F, -2.5F, -2.0F, 6, 4, 34);
    this.leg1part2.setRotationPoint(-27.0F, 12.0F, -27.0F);
    this.leg1part2.setTextureSize(512, 256);
    this.leg1part2.mirror = true;
    setRotation(this.leg1part2, 1.784573F, 0.7853982F, 0.0F);
    this.leg1part2b = new ModelRenderer(this, 3, 53);
    this.leg1part2b.addBox(-2.5F, -2.5F, -2.0F, 5, 4, 33);
    this.leg1part2b.setRotationPoint(-27.0F, 12.0F, -27.0F);
    this.leg1part2b.setTextureSize(512, 256);
    this.leg1part2b.mirror = true;
    setRotation(this.leg1part2b, 1.747395F, 0.7853982F, 0.0F);
    this.leg1part2c = new ModelRenderer(this, 48, 86);
    this.leg1part2c.addBox(-2.0F, -2.5F, -2.0F, 4, 4, 32);
    this.leg1part2c.setRotationPoint(-27.0F, 12.0F, -27.0F);
    this.leg1part2c.setTextureSize(512, 256);
    this.leg1part2c.mirror = true;
    setRotation(this.leg1part2c, 1.710216F, 0.7853982F, 0.0F);
    this.leg1part3 = new ModelRenderer(this, 0, 91);
    this.leg1part3.addBox(-1.5F, -2.5F, -17.0F, 3, 4, 18);
    this.leg1part3.setRotationPoint(-32.0F, -17.0F, -32.0F);
    this.leg1part3.setTextureSize(512, 256);
    this.leg1part3.mirror = true;
    setRotation(this.leg1part3, 1.189716F, 0.7853982F, 0.0F);
    this.leg1part3b = new ModelRenderer(this, 15, 30);
    this.leg1part3b.addBox(-1.0F, -1.5F, -27.0F, 2, 3, 10);
    this.leg1part3b.setRotationPoint(-32.0F, -17.0F, -32.0F);
    this.leg1part3b.setTextureSize(512, 256);
    this.leg1part3b.mirror = true;
    setRotation(this.leg1part3b, 1.189716F, 0.7853982F, 0.0F);
    this.leg1part3c = new ModelRenderer(this, 47, 23);
    this.leg1part3c.addBox(-0.5F, -0.5F, -34.0F, 1, 2, 7);
    this.leg1part3c.setRotationPoint(-32.0F, -17.0F, -32.0F);
    this.leg1part3c.setTextureSize(512, 256);
    this.leg1part3c.mirror = true;
    setRotation(this.leg1part3c, 1.189716F, 0.7853982F, 0.0F);
    this.leg1part3d = new ModelRenderer(this, 0, 23);
    this.leg1part3d.addBox(-0.5F, 0.5F, -44.0F, 1, 1, 10);
    this.leg1part3d.setRotationPoint(-32.0F, -17.0F, -32.0F);
    this.leg1part3d.setTextureSize(512, 256);
    this.leg1part3d.mirror = true;
    setRotation(this.leg1part3d, 1.189716F, 0.7853982F, 0.0F);
    this.leg2start = new ModelRenderer(this, 55, 0);
    this.leg2start.addBox(-3.0F, -2.5F, -4.0F, 6, 5, 5);
    this.leg2start.setRotationPoint(7.0F, 0.0F, -7.0F);
    this.leg2start.setTextureSize(512, 256);
    this.leg2start.mirror = true;
    setRotation(this.leg2start, 0.0F, -0.7853982F, 0.0F);
    this.leg2shoulder = new ModelRenderer(this, 77, 0);
    this.leg2shoulder.addBox(-2.5F, -4.5F, -6.0F, 5, 6, 10);
    this.leg2shoulder.setRotationPoint(10.0F, 0.0F, -10.0F);
    this.leg2shoulder.setTextureSize(512, 256);
    this.leg2shoulder.mirror = true;
    setRotation(this.leg2shoulder, -0.5576792F, -0.7853982F, 0.0F);
    this.leg2shoulderpart2 = new ModelRenderer(this, 70, 18);
    this.leg2shoulderpart2.addBox(-1.5F, -2.5F, -11.0F, 3, 3, 6);
    this.leg2shoulderpart2.setRotationPoint(10.0F, 0.0F, -10.0F);
    this.leg2shoulderpart2.setTextureSize(512, 256);
    this.leg2shoulderpart2.mirror = true;
    setRotation(this.leg2shoulderpart2, -0.4089647F, -0.7853982F, 0.0F);
    this.leg2part1 = new ModelRenderer(this, 68, 17);
    this.leg2part1.addBox(-2.0F, -2.5F, -23.0F, 4, 3, 26);
    this.leg2part1.setRotationPoint(17.0F, -5.0F, -17.0F);
    this.leg2part1.setTextureSize(512, 256);
    this.leg2part1.mirror = true;
    setRotation(this.leg2part1, 1.115358F, -0.7853982F, 0.0F);
    this.leg2part1b = new ModelRenderer(this, 19, 23);
    this.leg2part1b.addBox(-1.5F, 0.5F, -23.0F, 3, 3, 21);
    this.leg2part1b.setRotationPoint(17.0F, -5.0F, -17.0F);
    this.leg2part1b.setTextureSize(512, 256);
    this.leg2part1b.mirror = true;
    setRotation(this.leg2part1b, 1.07818F, -0.7853982F, 0.0F);
    this.leg2elbow = new ModelRenderer(this, 68, 28);
    this.leg2elbow.addBox(-1.5F, -5.5F, -22.0F, 3, 6, 3);
    this.leg2elbow.setRotationPoint(17.0F, -5.0F, -17.0F);
    this.leg2elbow.setTextureSize(512, 256);
    this.leg2elbow.mirror = true;
    setRotation(this.leg2elbow, 1.115358F, -0.7853982F, 0.0F);
    this.leg2part2 = new ModelRenderer(this, 48, 47);
    this.leg2part2.addBox(-3.0F, -2.5F, -2.0F, 6, 4, 34);
    this.leg2part2.setRotationPoint(27.0F, 12.0F, -27.0F);
    this.leg2part2.setTextureSize(512, 256);
    this.leg2part2.mirror = true;
    setRotation(this.leg2part2, 1.784573F, -0.7853982F, 0.0F);
    this.leg2part2b = new ModelRenderer(this, 3, 53);
    this.leg2part2b.addBox(-2.5F, -2.5F, -2.0F, 5, 4, 33);
    this.leg2part2b.setRotationPoint(27.0F, 12.0F, -27.0F);
    this.leg2part2b.setTextureSize(512, 256);
    this.leg2part2b.mirror = true;
    setRotation(this.leg2part2b, 1.747395F, -0.7853982F, 0.0F);
    this.leg2part2c = new ModelRenderer(this, 48, 86);
    this.leg2part2c.addBox(-2.0F, -2.5F, -2.0F, 4, 4, 32);
    this.leg2part2c.setRotationPoint(27.0F, 12.0F, -27.0F);
    this.leg2part2c.setTextureSize(512, 256);
    this.leg2part2c.mirror = true;
    setRotation(this.leg2part2c, 1.710216F, -0.7853982F, 0.0F);
    this.leg2part3 = new ModelRenderer(this, 0, 91);
    this.leg2part3.addBox(-1.5F, -2.5F, -17.0F, 3, 4, 18);
    this.leg2part3.setRotationPoint(32.0F, -17.0F, -32.0F);
    this.leg2part3.setTextureSize(512, 256);
    this.leg2part3.mirror = true;
    setRotation(this.leg2part3, 1.189716F, -0.7853982F, 0.0F);
    this.leg2part3b = new ModelRenderer(this, 15, 30);
    this.leg2part3b.addBox(-1.0F, -1.5F, -27.0F, 2, 3, 10);
    this.leg2part3b.setRotationPoint(32.0F, -17.0F, -32.0F);
    this.leg2part3b.setTextureSize(512, 256);
    this.leg2part3b.mirror = true;
    setRotation(this.leg2part3b, 1.189716F, -0.7853982F, 0.0F);
    this.leg2part3c = new ModelRenderer(this, 47, 23);
    this.leg2part3c.addBox(-0.5F, -0.5F, -34.0F, 1, 2, 7);
    this.leg2part3c.setRotationPoint(32.0F, -17.0F, -32.0F);
    this.leg2part3c.setTextureSize(512, 256);
    this.leg2part3c.mirror = true;
    setRotation(this.leg2part3c, 1.189716F, -0.7853982F, 0.0F);
    this.leg2part3d = new ModelRenderer(this, 0, 23);
    this.leg2part3d.addBox(-0.5F, 0.5F, -44.0F, 1, 1, 10);
    this.leg2part3d.setRotationPoint(32.0F, -17.0F, -32.0F);
    this.leg2part3d.setTextureSize(512, 256);
    this.leg2part3d.mirror = true;
    setRotation(this.leg2part3d, 1.189716F, -0.7853982F, 0.0F);
    this.leg3start = new ModelRenderer(this, 55, 0);
    this.leg3start.addBox(-3.0F, -2.5F, -1.0F, 6, 5, 5);
    this.leg3start.setRotationPoint(7.0F, 0.0F, 7.0F);
    this.leg3start.setTextureSize(512, 256);
    this.leg3start.mirror = true;
    setRotation(this.leg3start, 0.0F, 0.7853982F, 0.0F);
    this.leg3shoulder = new ModelRenderer(this, 114, 0);
    this.leg3shoulder.addBox(-2.5F, -4.5F, -4.0F, 5, 6, 10);
    this.leg3shoulder.setRotationPoint(10.0F, 0.0F, 10.0F);
    this.leg3shoulder.setTextureSize(512, 256);
    this.leg3shoulder.mirror = true;
    setRotation(this.leg3shoulder, 0.5576851F, 0.7853982F, 0.0F);
    this.leg3shoulderpart2 = new ModelRenderer(this, 70, 18);
    this.leg3shoulderpart2.addBox(-1.5F, -2.5F, 5.0F, 3, 3, 6);
    this.leg3shoulderpart2.setRotationPoint(10.0F, 0.0F, 10.0F);
    this.leg3shoulderpart2.setTextureSize(512, 256);
    this.leg3shoulderpart2.mirror = true;
    setRotation(this.leg3shoulderpart2, 0.4089656F, 0.7853982F, 0.0F);
    this.leg3part1 = new ModelRenderer(this, 68, 17);
    this.leg3part1.addBox(-2.0F, -2.5F, -3.0F, 4, 3, 26);
    this.leg3part1.setRotationPoint(17.0F, -5.0F, 17.0F);
    this.leg3part1.setTextureSize(512, 256);
    this.leg3part1.mirror = true;
    setRotation(this.leg3part1, -1.115353F, 0.7853982F, 0.0F);
    this.leg3part1b = new ModelRenderer(this, 117, 55);
    this.leg3part1b.addBox(-1.5F, 0.5F, 2.0F, 3, 3, 21);
    this.leg3part1b.setRotationPoint(17.0F, -5.0F, 17.0F);
    this.leg3part1b.setTextureSize(512, 256);
    this.leg3part1b.mirror = true;
    setRotation(this.leg3part1b, -1.078177F, 0.7853982F, 0.0F);
    this.leg3elbow = new ModelRenderer(this, 68, 28);
    this.leg3elbow.addBox(-1.5F, -5.5F, 19.0F, 3, 6, 3);
    this.leg3elbow.setRotationPoint(17.0F, -5.0F, 17.0F);
    this.leg3elbow.setTextureSize(512, 256);
    this.leg3elbow.mirror = true;
    setRotation(this.leg3elbow, -1.115353F, 0.7853982F, 0.0F);
    this.leg3part2 = new ModelRenderer(this, 0, 206);
    this.leg3part2.addBox(-3.0F, -2.5F, -32.0F, 6, 4, 34);
    this.leg3part2.setRotationPoint(27.0F, 12.0F, 27.0F);
    this.leg3part2.setTextureSize(512, 256);
    this.leg3part2.mirror = true;
    setRotation(this.leg3part2, -1.784582F, 0.7853982F, 0.0F);
    this.leg3part2b = new ModelRenderer(this, 3, 53);
    this.leg3part2b.addBox(-2.5F, -2.5F, -31.0F, 5, 4, 33);
    this.leg3part2b.setRotationPoint(27.0F, 12.0F, 27.0F);
    this.leg3part2b.setTextureSize(512, 256);
    this.leg3part2b.mirror = true;
    setRotation(this.leg3part2b, -1.747389F, 0.7853982F, 0.0F);
    this.leg3part2c = new ModelRenderer(this, 48, 86);
    this.leg3part2c.addBox(-2.0F, -2.5F, -30.0F, 4, 4, 32);
    this.leg3part2c.setRotationPoint(27.0F, 12.0F, 27.0F);
    this.leg3part2c.setTextureSize(512, 256);
    this.leg3part2c.mirror = true;
    setRotation(this.leg3part2c, -1.710213F, 0.7853982F, 0.0F);
    this.leg3part3 = new ModelRenderer(this, 0, 178);
    this.leg3part3.addBox(-1.5F, -2.5F, -1.0F, 3, 4, 18);
    this.leg3part3.setRotationPoint(32.0F, -17.0F, 32.0F);
    this.leg3part3.setTextureSize(512, 256);
    this.leg3part3.mirror = true;
    setRotation(this.leg3part3, -1.189721F, 0.7853982F, 0.0F);
    this.leg3part3b = new ModelRenderer(this, 12, 62);
    this.leg3part3b.addBox(-1.0F, -1.5F, 17.0F, 2, 3, 10);
    this.leg3part3b.setRotationPoint(32.0F, -17.0F, 32.0F);
    this.leg3part3b.setTextureSize(512, 256);
    this.leg3part3b.mirror = true;
    setRotation(this.leg3part3b, -1.189721F, 0.7853982F, 0.0F);
    this.leg3part3c = new ModelRenderer(this, 47, 32);
    this.leg3part3c.addBox(-0.5F, -0.5F, 27.0F, 1, 2, 7);
    this.leg3part3c.setRotationPoint(32.0F, -17.0F, 32.0F);
    this.leg3part3c.setTextureSize(512, 256);
    this.leg3part3c.mirror = true;
    setRotation(this.leg3part3c, -1.189721F, 0.7853982F, 0.0F);
    this.leg3part3d = new ModelRenderer(this, 0, 23);
    this.leg3part3d.addBox(-0.5F, 0.5F, 34.0F, 1, 1, 10);
    this.leg3part3d.setRotationPoint(32.0F, -17.0F, 32.0F);
    this.leg3part3d.setTextureSize(512, 256);
    this.leg3part3d.mirror = true;
    setRotation(this.leg3part3d, -1.189721F, 0.7853982F, 0.0F);
    this.leg4start = new ModelRenderer(this, 55, 0);
    this.leg4start.addBox(-3.0F, -2.5F, -1.0F, 6, 5, 5);
    this.leg4start.setRotationPoint(-7.0F, 0.0F, 7.0F);
    this.leg4start.setTextureSize(512, 256);
    this.leg4start.mirror = true;
    setRotation(this.leg4start, 0.0F, -0.7853982F, 0.0F);
    this.leg4shoulder = new ModelRenderer(this, 114, 0);
    this.leg4shoulder.addBox(-2.5F, -4.5F, -4.0F, 5, 6, 10);
    this.leg4shoulder.setRotationPoint(-10.0F, 0.0F, 10.0F);
    this.leg4shoulder.setTextureSize(512, 256);
    this.leg4shoulder.mirror = true;
    setRotation(this.leg4shoulder, 0.5576851F, -0.7853982F, 0.0F);
    this.leg4shoulderpart2 = new ModelRenderer(this, 70, 18);
    this.leg4shoulderpart2.addBox(-1.5F, -2.5F, 5.0F, 3, 3, 6);
    this.leg4shoulderpart2.setRotationPoint(-10.0F, 0.0F, 10.0F);
    this.leg4shoulderpart2.setTextureSize(512, 256);
    this.leg4shoulderpart2.mirror = true;
    setRotation(this.leg4shoulderpart2, 0.4089656F, -0.7853982F, 0.0F);
    this.leg4part1 = new ModelRenderer(this, 68, 17);
    this.leg4part1.addBox(-2.0F, -2.5F, -3.0F, 4, 3, 26);
    this.leg4part1.setRotationPoint(-17.0F, -5.0F, 17.0F);
    this.leg4part1.setTextureSize(512, 256);
    this.leg4part1.mirror = true;
    setRotation(this.leg4part1, -1.115353F, -0.7853982F, 0.0F);
    this.leg4part1b = new ModelRenderer(this, 117, 55);
    this.leg4part1b.addBox(-1.5F, 0.5F, 2.0F, 3, 3, 21);
    this.leg4part1b.setRotationPoint(-17.0F, -5.0F, 17.0F);
    this.leg4part1b.setTextureSize(512, 256);
    this.leg4part1b.mirror = true;
    setRotation(this.leg4part1b, -1.078177F, -0.7853982F, 0.0F);
    this.leg4elbow = new ModelRenderer(this, 68, 28);
    this.leg4elbow.addBox(-1.5F, -5.5F, 19.0F, 3, 6, 3);
    this.leg4elbow.setRotationPoint(-17.0F, -5.0F, 17.0F);
    this.leg4elbow.setTextureSize(512, 256);
    this.leg4elbow.mirror = true;
    setRotation(this.leg4elbow, -1.115353F, -0.7853982F, 0.0F);
    this.leg4part2 = new ModelRenderer(this, 0, 206);
    this.leg4part2.addBox(-3.0F, -2.5F, -32.0F, 6, 4, 34);
    this.leg4part2.setRotationPoint(-27.0F, 12.0F, 27.0F);
    this.leg4part2.setTextureSize(512, 256);
    this.leg4part2.mirror = true;
    setRotation(this.leg4part2, -1.784582F, -0.7853982F, 0.0F);
    this.leg4part2b = new ModelRenderer(this, 3, 53);
    this.leg4part2b.addBox(-2.5F, -2.5F, -31.0F, 5, 4, 33);
    this.leg4part2b.setRotationPoint(-27.0F, 12.0F, 27.0F);
    this.leg4part2b.setTextureSize(512, 256);
    this.leg4part2b.mirror = true;
    setRotation(this.leg4part2b, -1.747389F, -0.7853982F, 0.0F);
    this.leg4part2c = new ModelRenderer(this, 48, 86);
    this.leg4part2c.addBox(-2.0F, -2.5F, -30.0F, 4, 4, 32);
    this.leg4part2c.setRotationPoint(-27.0F, 12.0F, 27.0F);
    this.leg4part2c.setTextureSize(512, 256);
    this.leg4part2c.mirror = true;
    setRotation(this.leg4part2c, -1.710213F, -0.7853982F, 0.0F);
    this.leg4part3 = new ModelRenderer(this, 0, 178);
    this.leg4part3.addBox(-1.5F, -2.5F, -1.0F, 3, 4, 18);
    this.leg4part3.setRotationPoint(-32.0F, -17.0F, 32.0F);
    this.leg4part3.setTextureSize(512, 256);
    this.leg4part3.mirror = true;
    setRotation(this.leg4part3, -1.189721F, -0.7853982F, 0.0F);
    this.leg4part3b = new ModelRenderer(this, 12, 62);
    this.leg4part3b.addBox(-1.0F, -1.5F, 17.0F, 2, 3, 10);
    this.leg4part3b.setRotationPoint(-32.0F, -17.0F, 32.0F);
    this.leg4part3b.setTextureSize(512, 256);
    this.leg4part3b.mirror = true;
    setRotation(this.leg4part3b, -1.189721F, -0.7853982F, 0.0F);
    this.leg4part3c = new ModelRenderer(this, 47, 32);
    this.leg4part3c.addBox(-0.5F, -0.5F, 27.0F, 1, 2, 7);
    this.leg4part3c.setRotationPoint(-32.0F, -17.0F, 32.0F);
    this.leg4part3c.setTextureSize(512, 256);
    this.leg4part3c.mirror = true;
    setRotation(this.leg4part3c, -1.189721F, -0.7853982F, 0.0F);
    this.leg4part3d = new ModelRenderer(this, 0, 23);
    this.leg4part3d.addBox(-0.5F, 0.5F, 34.0F, 1, 1, 10);
    this.leg4part3d.setRotationPoint(-32.0F, -17.0F, 32.0F);
    this.leg4part3d.setTextureSize(512, 256);
    this.leg4part3d.mirror = true;
    setRotation(this.leg4part3d, -1.189721F, -0.7853982F, 0.0F);
    this.jawbase = new ModelRenderer(this, 104, 0);
    this.jawbase.addBox(-2.0F, -2.0F, -40.0F, 4, 3, 40);
    this.jawbase.setRotationPoint(0.0F, 0.0F, -8.0F);
    this.jawbase.setTextureSize(512, 256);
    this.jawbase.mirror = true;
    setRotation(this.jawbase, 0.2230717F, 0.0F, 0.0F);
    this.jawbase2 = new ModelRenderer(this, 133, 44);
    this.jawbase2.addBox(-6.0F, -2.0F, -8.0F, 12, 3, 8);
    this.jawbase2.setRotationPoint(0.0F, 0.0F, -8.0F);
    this.jawbase2.setTextureSize(512, 256);
    this.jawbase2.mirror = true;
    setRotation(this.jawbase2, 0.2230705F, 0.0F, 0.0F);
    this.jawbase3 = new ModelRenderer(this, 96, 55);
    this.jawbase3.addBox(-7.0F, -2.0F, -15.0F, 14, 3, 7);
    this.jawbase3.setRotationPoint(0.0F, 0.0F, -8.0F);
    this.jawbase3.setTextureSize(512, 256);
    this.jawbase3.mirror = true;
    setRotation(this.jawbase3, 0.2230705F, 0.0F, 0.0F);
    this.jawbase4 = new ModelRenderer(this, 96, 47);
    this.jawbase4.addBox(-6.0F, -2.0F, -19.0F, 12, 3, 4);
    this.jawbase4.setRotationPoint(0.0F, 0.0F, -8.0F);
    this.jawbase4.setTextureSize(512, 256);
    this.jawbase4.mirror = true;
    setRotation(this.jawbase4, 0.2230705F, 0.0F, 0.0F);
    this.jawbase5 = new ModelRenderer(this, 104, 32);
    this.jawbase5.addBox(-5.0F, -2.0F, -23.0F, 10, 3, 4);
    this.jawbase5.setRotationPoint(0.0F, 0.0F, -8.0F);
    this.jawbase5.setTextureSize(512, 256);
    this.jawbase5.mirror = true;
    setRotation(this.jawbase5, 0.2230705F, 0.0F, 0.0F);
    this.jawbase6 = new ModelRenderer(this, 104, 25);
    this.jawbase6.addBox(-4.0F, -2.0F, -26.0F, 8, 3, 3);
    this.jawbase6.setRotationPoint(0.0F, 0.0F, -8.0F);
    this.jawbase6.setTextureSize(512, 256);
    this.jawbase6.mirror = true;
    setRotation(this.jawbase6, 0.2230705F, 0.0F, 0.0F);
    this.jawbase7 = new ModelRenderer(this, 104, 19);
    this.jawbase7.addBox(-3.0F, -2.0F, -28.0F, 6, 3, 2);
    this.jawbase7.setRotationPoint(0.0F, 0.0F, -8.0F);
    this.jawbase7.setTextureSize(512, 256);
    this.jawbase7.mirror = true;
    setRotation(this.jawbase7, 0.2230705F, 0.0F, 0.0F);
    this.jawbase8 = new ModelRenderer(this, 104, 150);
    this.jawbase8.addBox(-2.0F, -2.0F, -40.0F, 4, 4, 40);
    this.jawbase8.setRotationPoint(0.0F, 0.0F, -8.0F);
    this.jawbase8.setTextureSize(512, 256);
    this.jawbase8.mirror = true;
    setRotation(this.jawbase8, 0.2146755F, 0.1487144F, -0.7679449F);
    this.jawbase9 = new ModelRenderer(this, 104, 112);
    this.jawbase9.addBox(-3.0F, -3.0F, -21.0F, 6, 6, 29);
    this.jawbase9.setRotationPoint(0.0F, 0.0F, -8.0F);
    this.jawbase9.setTextureSize(512, 256);
    this.jawbase9.mirror = true;
    setRotation(this.jawbase9, 0.1031397F, 0.0743623F, -0.837758F);
    this.jawleft = new ModelRenderer(this, 76, 61);
    this.jawleft.addBox(-14.0F, -10.0F, -37.0F, 1, 11, 1);
    this.jawleft.setRotationPoint(0.0F, 0.0F, -8.0F);
    this.jawleft.setTextureSize(512, 256);
    this.jawleft.mirror = true;
    setRotation(this.jawleft, 0.2230717F, -0.3346075F, 0.0F);
    this.jawright = new ModelRenderer(this, 71, 61);
    this.jawright.addBox(13.0F, -10.0F, -37.0F, 1, 11, 1);
    this.jawright.setRotationPoint(0.0F, 0.0F, -8.0F);
    this.jawright.setTextureSize(512, 256);
    this.jawright.mirror = true;
    setRotation(this.jawright, 0.2230717F, 0.3346145F, 0.0F);
    this.jawend = new ModelRenderer(this, 76, 47);
    this.jawend.addBox(-0.5F, -11.0F, -39.5F, 1, 12, 1);
    this.jawend.setRotationPoint(0.0F, 0.0F, -8.0F);
    this.jawend.setTextureSize(512, 256);
    this.jawend.mirror = true;
    setRotation(this.jawend, 0.2230717F, 0.0F, 0.0F);
    this.headstart = new ModelRenderer(this, 92, 87);
    this.headstart.addBox(-6.5F, -2.0F, -7.0F, 13, 9, 13);
    this.headstart.setRotationPoint(0.0F, -9.0F, 2.0F);
    this.headstart.setTextureSize(512, 256);
    this.headstart.mirror = true;
    setRotation(this.headstart, 0.0F, 0.0F, 0.0F);
    this.headbase = new ModelRenderer(this, 206, 0);
    this.headbase.addBox(-8.0F, -2.0F, -6.0F, 16, 13, 24);
    this.headbase.setRotationPoint(0.0F, -17.0F, -2.0F);
    this.headbase.setTextureSize(512, 256);
    this.headbase.mirror = true;
    setRotation(this.headbase, 0.0F, 0.0F, 0.0F);
    this.headbase2 = new ModelRenderer(this, 300, 136);
    this.headbase2.addBox(-8.5F, -2.0F, -6.0F, 17, 1, 34);
    this.headbase2.setRotationPoint(0.0F, -17.0F, -3.0F);
    this.headbase2.setTextureSize(512, 256);
    this.headbase2.mirror = true;
    setRotation(this.headbase2, 0.0F, 0.0F, 0.0F);
    this.headbase3 = new ModelRenderer(this, 300, 129);
    this.headbase3.addBox(-9.0F, -2.0F, -6.0F, 18, 1, 39);
    this.headbase3.setRotationPoint(0.0F, -18.0F, -4.0F);
    this.headbase3.setTextureSize(512, 256);
    this.headbase3.mirror = true;
    setRotation(this.headbase3, 0.0F, 0.0F, 0.0F);
    this.headbase4 = new ModelRenderer(this, 300, 121);
    this.headbase4.addBox(-9.5F, -2.0F, -6.0F, 19, 1, 45);
    this.headbase4.setRotationPoint(0.0F, -19.0F, -5.0F);
    this.headbase4.setTextureSize(512, 256);
    this.headbase4.mirror = true;
    setRotation(this.headbase4, 0.0F, 0.0F, 0.0F);
    this.headbase5 = new ModelRenderer(this, 300, 117);
    this.headbase5.addBox(-10.0F, -2.0F, -6.0F, 20, 1, 47);
    this.headbase5.setRotationPoint(0.0F, -20.0F, -6.0F);
    this.headbase5.setTextureSize(512, 256);
    this.headbase5.mirror = true;
    setRotation(this.headbase5, 0.0F, 0.0F, 0.0F);
    this.headbase6 = new ModelRenderer(this, 300, 112);
    this.headbase6.addBox(-11.0F, -2.0F, -6.0F, 22, 1, 50);
    this.headbase6.setRotationPoint(0.0F, -21.0F, -9.0F);
    this.headbase6.setTextureSize(512, 256);
    this.headbase6.mirror = true;
    setRotation(this.headbase6, 0.0F, 0.0F, 0.0F);
    this.headbase7 = new ModelRenderer(this, 0, 123);
    this.headbase7.addBox(-8.0F, -7.0F, 0.0F, 16, 8, 24);
    this.headbase7.setRotationPoint(0.0F, -8.0F, 13.0F);
    this.headbase7.setTextureSize(512, 256);
    this.headbase7.mirror = true;
    setRotation(this.headbase7, 0.5576792F, 0.0F, 0.0F);
    this.headbase8 = new ModelRenderer(this, 300, 109);
    this.headbase8.addBox(-11.0F, -1.0F, -6.0F, 22, 1, 51);
    this.headbase8.setRotationPoint(0.0F, -23.0F, -9.0F);
    this.headbase8.setTextureSize(512, 256);
    this.headbase8.mirror = true;
    setRotation(this.headbase8, 0.0F, 0.0F, 0.0F);
    this.headbase9 = new ModelRenderer(this, 300, 50);
    this.headbase9.addBox(-11.0F, -1.0F, -6.0F, 22, 1, 51);
    this.headbase9.setRotationPoint(0.0F, -24.0F, -9.0F);
    this.headbase9.setTextureSize(512, 256);
    this.headbase9.mirror = true;
    setRotation(this.headbase9, 0.0F, 0.0F, 0.0F);
    this.headbase10 = new ModelRenderer(this, 185, 107);
    this.headbase10.addBox(-7.0F, -1.5F, -20.0F, 14, 1, 42);
    this.headbase10.setRotationPoint(0.0F, -24.0F, 7.0F);
    this.headbase10.setTextureSize(512, 256);
    this.headbase10.mirror = true;
    setRotation(this.headbase10, 0.0261799F, 0.0F, 0.0F);
    this.headleftridge = new ModelRenderer(this, 180, 153);
    this.headleftridge.addBox(-12.0F, -1.0F, -1.0F, 13, 1, 46);
    this.headleftridge.setRotationPoint(0.0F, -22.0F, -9.0F);
    this.headleftridge.setTextureSize(512, 256);
    this.headleftridge.mirror = true;
    setRotation(this.headleftridge, 0.0743572F, -0.2230717F, 0.1487144F);
    this.headrightridge = new ModelRenderer(this, 300, 174);
    this.headrightridge.addBox(-1.0F, -1.0F, -1.0F, 13, 1, 46);
    this.headrightridge.setRotationPoint(0.0F, -22.0F, -9.0F);
    this.headrightridge.setTextureSize(512, 256);
    this.headrightridge.mirror = true;
    setRotation(this.headrightridge, 0.0743572F, 0.2230705F, -0.1487195F);
    this.antenna1 = new ModelRenderer(this, 332, 72);
    this.antenna1.addBox(-3.0F, -1.0F, -1.0F, 5, 2, 2);
    this.antenna1.setRotationPoint(-10.0F, -20.0F, 19.0F);
    this.antenna1.setTextureSize(512, 256);
    this.antenna1.mirror = true;
    setRotation(this.antenna1, 0.0F, 0.0F, 0.0F);
    this.antenna1part2 = new ModelRenderer(this, 300, 81);
    this.antenna1part2.addBox(-3.0F, -1.0F, 1.0F, 2, 2, 9);
    this.antenna1part2.setRotationPoint(-10.0F, -20.0F, 19.0F);
    this.antenna1part2.setTextureSize(512, 256);
    this.antenna1part2.mirror = true;
    setRotation(this.antenna1part2, 0.0F, -0.7807508F, 0.0F);
    this.antenna2 = new ModelRenderer(this, 325, 79);
    this.antenna2.addBox(-2.0F, -1.0F, -1.0F, 5, 2, 2);
    this.antenna2.setRotationPoint(10.0F, -20.0F, 19.0F);
    this.antenna2.setTextureSize(512, 256);
    this.antenna2.mirror = true;
    setRotation(this.antenna2, 0.0F, 0.0F, 0.0F);
    this.antenna2part2 = new ModelRenderer(this, 300, 81);
    this.antenna2part2.addBox(1.0F, -1.0F, 1.0F, 2, 2, 9);
    this.antenna2part2.setRotationPoint(10.0F, -20.0F, 19.0F);
    this.antenna2part2.setTextureSize(512, 256);
    this.antenna2part2.mirror = true;
    setRotation(this.antenna2part2, 0.0F, 0.7807556F, 0.0F);
    this.eyebase1 = new ModelRenderer(this, 300, 121);
    this.eyebase1.addBox(-2.5F, -2.5F, -1.5F, 5, 5, 3);
    this.eyebase1.setRotationPoint(-6.0F, -14.0F, -8.0F);
    this.eyebase1.setTextureSize(512, 256);
    this.eyebase1.mirror = true;
    setRotation(this.eyebase1, 0.0F, 0.7807556F, -0.37179F);
    this.eye1 = new ModelRenderer(this, 0, 0);
    this.eye1.addBox(-1.0F, -1.0F, -2.5F, 2, 2, 2);
    this.eye1.setRotationPoint(-6.0F, -14.0F, -8.0F);
    this.eye1.setTextureSize(512, 256);
    this.eye1.mirror = true;
    setRotation(this.eye1, 0.0F, 0.7807556F, -0.37179F);
    this.eyebase2 = new ModelRenderer(this, 300, 121);
    this.eyebase2.addBox(-2.5F, -2.5F, -1.5F, 5, 5, 3);
    this.eyebase2.setRotationPoint(6.0F, -14.0F, -8.0F);
    this.eyebase2.setTextureSize(512, 256);
    this.eyebase2.mirror = true;
    setRotation(this.eyebase2, 0.0F, -0.7807508F, 0.3717861F);
    this.eye2 = new ModelRenderer(this, 0, 0);
    this.eye2.addBox(-1.0F, -1.0F, -2.5F, 2, 2, 2);
    this.eye2.setRotationPoint(6.0F, -14.0F, -8.0F);
    this.eye2.setTextureSize(512, 256);
    this.eye2.mirror = true;
    setRotation(this.eye2, 0.0F, -0.7807508F, 0.3717861F);
    this.arm1start = new ModelRenderer(this, 300, 93);
    this.arm1start.addBox(-3.0F, -1.5F, -1.5F, 4, 3, 3);
    this.arm1start.setRotationPoint(-9.0F, -20.0F, -3.0F);
    this.arm1start.setTextureSize(512, 256);
    this.arm1start.mirror = true;
    setRotation(this.arm1start, 0.0F, 0.0F, 0.0F);
    this.arm1part1 = new ModelRenderer(this, 250, 83);
    this.arm1part1.addBox(-2.0F, -1.5F, -16.5F, 3, 3, 18);
    this.arm1part1.setRotationPoint(-11.0F, -20.0F, -4.0F);
    this.arm1part1.setTextureSize(512, 256);
    this.arm1part1.mirror = true;
    setRotation(this.arm1part1, 0.0F, 0.2777036F, 0.0F);
    this.arm1part2 = new ModelRenderer(this, 250, 83);
    this.arm1part2.addBox(-2.0F, -9.5F, -1.5F, 3, 11, 3);
    this.arm1part2.setRotationPoint(-15.3F, -20.0F, -20.0F);
    this.arm1part2.setTextureSize(512, 256);
    this.arm1part2.mirror = true;
    setRotation(this.arm1part2, -0.7807508F, 0.0F, 0.0F);
    this.arm1part2b = new ModelRenderer(this, 250, 69);
    this.arm1part2b.addBox(-2.0F, -15.5F, -3.5F, 3, 8, 3);
    this.arm1part2b.setRotationPoint(-15.3F, -20.0F, -20.0F);
    this.arm1part2b.setTextureSize(512, 256);
    this.arm1part2b.mirror = true;
    setRotation(this.arm1part2b, -1.041001F, 0.0F, 0.0F);
    this.arm1part2c = new ModelRenderer(this, 300, 66);
    this.arm1part2c.addBox(-2.0F, -17.5F, 8.5F, 3, 8, 3);
    this.arm1part2c.setRotationPoint(-15.3F, -20.0F, -19.0F);
    this.arm1part2c.setTextureSize(512, 256);
    this.arm1part2c.mirror = true;
    setRotation(this.arm1part2c, -0.0743572F, 0.0F, 0.0F);
    this.arm1part3 = new ModelRenderer(this, 278, 60);
    this.arm1part3.addBox(-1.0F, -19.5F, -1.0F, 2, 21, 2);
    this.arm1part3.setRotationPoint(-15.8F, -36.0F, -8.0F);
    this.arm1part3.setTextureSize(512, 256);
    this.arm1part3.mirror = true;
    setRotation(this.arm1part3, 1.561502F, 0.0F, 0.0F);
    this.arm1part3b = new ModelRenderer(this, 279, 84);
    this.arm1part3b.addBox(-0.5F, -10.5F, -1.0F, 1, 12, 2);
    this.arm1part3b.setRotationPoint(-15.8F, -36.0F, -8.0F);
    this.arm1part3b.setTextureSize(512, 256);
    this.arm1part3b.mirror = true;
    setRotation(this.arm1part3b, 1.710216F, 0.0F, 0.0F);
    this.arm2start = new ModelRenderer(this, 300, 105);
    this.arm2start.addBox(-1.0F, -1.5F, -1.5F, 4, 3, 3);
    this.arm2start.setRotationPoint(9.0F, -20.0F, -3.0F);
    this.arm2start.setTextureSize(512, 256);
    this.arm2start.mirror = true;
    setRotation(this.arm2start, 0.0F, 0.0F, 0.0F);
    this.arm2part1 = new ModelRenderer(this, 250, 83);
    this.arm2part1.addBox(-2.0F, -1.5F, -16.5F, 3, 3, 18);
    this.arm2part1.setRotationPoint(11.0F, -20.0F, -4.0F);
    this.arm2part1.setTextureSize(512, 256);
    this.arm2part1.mirror = true;
    setRotation(this.arm2part1, 0.0F, -0.2776993F, 0.0F);
    this.arm2part2 = new ModelRenderer(this, 250, 83);
    this.arm2part2.addBox(-2.0F, -9.5F, -1.5F, 3, 11, 3);
    this.arm2part2.setRotationPoint(15.3F, -20.0F, -20.0F);
    this.arm2part2.setTextureSize(512, 256);
    this.arm2part2.mirror = true;
    setRotation(this.arm2part2, -0.7807508F, 0.0F, 0.0F);
    this.arm2part2b = new ModelRenderer(this, 250, 69);
    this.arm2part2b.addBox(-2.0F, -15.5F, -3.5F, 3, 8, 3);
    this.arm2part2b.setRotationPoint(15.3F, -20.0F, -20.0F);
    this.arm2part2b.setTextureSize(512, 256);
    this.arm2part2b.mirror = true;
    setRotation(this.arm2part2b, -1.041001F, 0.0F, 0.0F);
    this.arm2part2c = new ModelRenderer(this, 300, 66);
    this.arm2part2c.addBox(-2.0F, -17.5F, 8.5F, 3, 8, 3);
    this.arm2part2c.setRotationPoint(15.3F, -20.0F, -19.0F);
    this.arm2part2c.setTextureSize(512, 256);
    this.arm2part2c.mirror = true;
    setRotation(this.arm2part2c, -0.0743572F, 0.0F, 0.0F);
    this.arm2part3 = new ModelRenderer(this, 287, 60);
    this.arm2part3.addBox(-1.0F, -19.5F, -1.0F, 2, 21, 2);
    this.arm2part3.setRotationPoint(14.8F, -36.0F, -8.0F);
    this.arm2part3.setTextureSize(512, 256);
    this.arm2part3.mirror = true;
    setRotation(this.arm2part3, 1.561502F, 0.0F, 0.0F);
    this.arm2part3b = new ModelRenderer(this, 279, 84);
    this.arm2part3b.addBox(-0.5F, -10.5F, -1.0F, 1, 12, 2);
    this.arm2part3b.setRotationPoint(14.8F, -36.0F, -8.0F);
    this.arm2part3b.setTextureSize(512, 256);
    this.arm2part3b.mirror = true;
    setRotation(this.arm2part3b, 1.710216F, 0.0F, 0.0F);
    this.innermouth = new ModelRenderer(this, 176, 44);
    this.innermouth.addBox(-6.0F, -2.0F, -8.0F, 12, 3, 8);
    this.innermouth.setRotationPoint(0.0F, 0.0F, -12.0F);
    this.innermouth.setTextureSize(512, 256);
    this.innermouth.mirror = true;
    setRotation(this.innermouth, -1.933289F, 0.0F, 0.0F);
    this.innermouth2 = new ModelRenderer(this, 159, 4);
    this.innermouth2.addBox(-6.0F, -2.0F, -8.0F, 12, 3, 8);
    this.innermouth2.setRotationPoint(0.0F, -24.0F, -12.0F);
    this.innermouth2.setTextureSize(512, 256);
    this.innermouth2.mirror = true;
    setRotation(this.innermouth2, 1.933284F, 0.0F, 0.0F);
    this.tooth1 = new ModelRenderer(this, 0, 6);
    this.tooth1.addBox(-5.0F, 0.0F, -10.0F, 2, 1, 2);
    this.tooth1.setRotationPoint(1.0F, 0.0F, -12.0F);
    this.tooth1.setTextureSize(512, 256);
    this.tooth1.mirror = true;
    setRotation(this.tooth1, -1.933289F, 0.0F, 0.0F);
    this.tooth2 = new ModelRenderer(this, 0, 6);
    this.tooth2.addBox(1.0F, 0.0F, -10.0F, 2, 1, 2);
    this.tooth2.setRotationPoint(1.0F, 0.0F, -12.0F);
    this.tooth2.setTextureSize(512, 256);
    this.tooth2.mirror = true;
    setRotation(this.tooth2, -1.933289F, 0.0F, 0.0F);
    this.tooth3 = new ModelRenderer(this, 0, 6);
    this.tooth3.addBox(1.0F, 0.0F, -10.0F, 2, 1, 2);
    this.tooth3.setRotationPoint(-2.0F, 0.0F, -12.0F);
    this.tooth3.setTextureSize(512, 256);
    this.tooth3.mirror = true;
    setRotation(this.tooth3, -1.933289F, 0.0F, 0.0F);
    this.tooth4 = new ModelRenderer(this, 0, 6);
    this.tooth4.addBox(-4.0F, -2.0F, -10.0F, 2, 1, 2);
    this.tooth4.setRotationPoint(0.0F, -24.0F, -12.0F);
    this.tooth4.setTextureSize(512, 256);
    this.tooth4.mirror = true;
    setRotation(this.tooth4, 1.933284F, 0.0F, 0.0F);
    this.tooth5 = new ModelRenderer(this, 0, 6);
    this.tooth5.addBox(2.0F, -2.0F, -10.0F, 2, 1, 2);
    this.tooth5.setRotationPoint(0.0F, -24.0F, -12.0F);
    this.tooth5.setTextureSize(512, 256);
    this.tooth5.mirror = true;
    setRotation(this.tooth5, 1.933284F, 0.0F, 0.0F);
    this.tooth6 = new ModelRenderer(this, 0, 6);
    this.tooth6.addBox(-1.0F, -2.0F, -10.0F, 2, 1, 2);
    this.tooth6.setRotationPoint(0.0F, -24.0F, -12.0F);
    this.tooth6.setTextureSize(512, 256);
    this.tooth6.mirror = true;
    setRotation(this.tooth6, 1.933284F, 0.0F, 0.0F);
    this.mouthedge1 = new ModelRenderer(this, 400, 77);
    this.mouthedge1.addBox(-1.0F, -4.5F, -1.5F, 3, 9, 14);
    this.mouthedge1.setRotationPoint(9.0F, -12.0F, -6.0F);
    this.mouthedge1.setTextureSize(512, 256);
    this.mouthedge1.mirror = true;
    setRotation(this.mouthedge1, 0.0F, -0.2230717F, 0.0F);
    this.mouthedge2 = new ModelRenderer(this, 400, 52);
    this.mouthedge2.addBox(-2.0F, -4.5F, -1.5F, 3, 9, 14);
    this.mouthedge2.setRotationPoint(-9.0F, -12.0F, -6.0F);
    this.mouthedge2.setTextureSize(512, 256);
    this.mouthedge2.mirror = true;
    setRotation(this.mouthedge2, 0.0F, 0.2230717F, 0.0F);
    this.mouthedge3 = new ModelRenderer(this, 450, 69);
    this.mouthedge3.addBox(-1.0F, -4.5F, -1.5F, 3, 9, 14);
    this.mouthedge3.setRotationPoint(8.0F, -6.0F, -7.0F);
    this.mouthedge3.setTextureSize(512, 256);
    this.mouthedge3.mirror = true;
    setRotation(this.mouthedge3, 0.5576792F, -0.2230717F, 0.0F);
    this.mouthedge4 = new ModelRenderer(this, 450, 93);
    this.mouthedge4.addBox(-2.0F, -4.5F, -1.5F, 3, 9, 14);
    this.mouthedge4.setRotationPoint(-8.0F, -6.0F, -7.0F);
    this.mouthedge4.setTextureSize(512, 256);
    this.mouthedge4.mirror = true;
    setRotation(this.mouthedge4, 0.5576792F, 0.2230705F, 0.0F);
    this.arm3start = new ModelRenderer(this, 335, 85);
    this.arm3start.addBox(-1.0F, -1.5F, -1.5F, 4, 3, 3);
    this.arm3start.setRotationPoint(10.0F, -9.0F, -3.0F);
    this.arm3start.setTextureSize(512, 256);
    this.arm3start.mirror = true;
    setRotation(this.arm3start, 0.0F, 0.0F, 0.0F);
    this.arm3part1 = new ModelRenderer(this, 264, 108);
    this.arm3part1.addBox(-1.0F, -1.5F, -9.5F, 3, 3, 11);
    this.arm3part1.setRotationPoint(13.0F, -9.0F, -3.0F);
    this.arm3part1.setTextureSize(512, 256);
    this.arm3part1.mirror = true;
    setRotation(this.arm3part1, -0.2602503F, 0.0F, 0.0F);
    this.arm3part1b = new ModelRenderer(this, 317, 67);
    this.arm3part1b.addBox(0.0F, -2.5F, -12.5F, 3, 5, 4);
    this.arm3part1b.setRotationPoint(13.0F, -9.0F, -3.0F);
    this.arm3part1b.setTextureSize(512, 256);
    this.arm3part1b.mirror = true;
    setRotation(this.arm3part1b, -0.2602503F, 0.0F, 0.0F);
    this.arm3part1c = new ModelRenderer(this, 300, 81);
    this.arm3part1c.addBox(-2.0F, -2.5F, -12.51F, 3, 5, 0);
    this.arm3part1c.setRotationPoint(13.0F, -9.0F, -3.0F);
    this.arm3part1c.setTextureSize(512, 256);
    this.arm3part1c.mirror = true;
    setRotation(this.arm3part1c, -0.2602503F, 0.0F, 0.0F);
    this.arm4start = new ModelRenderer(this, 335, 93);
    this.arm4start.addBox(-3.0F, -1.5F, -1.5F, 4, 3, 3);
    this.arm4start.setRotationPoint(-10.0F, -9.0F, -3.0F);
    this.arm4start.setTextureSize(512, 256);
    this.arm4start.mirror = true;
    setRotation(this.arm4start, 0.0F, 0.0F, 0.0F);
    this.arm4part1 = new ModelRenderer(this, 300, 51);
    this.arm4part1.addBox(-2.0F, -1.5F, -9.5F, 3, 3, 11);
    this.arm4part1.setRotationPoint(-13.0F, -9.0F, -3.0F);
    this.arm4part1.setTextureSize(512, 256);
    this.arm4part1.mirror = true;
    setRotation(this.arm4part1, -0.2602503F, 0.0F, 0.0F);
    this.arm4part1b = new ModelRenderer(this, 322, 106);
    this.arm4part1b.addBox(-3.0F, -2.5F, -12.5F, 3, 5, 4);
    this.arm4part1b.setRotationPoint(-13.0F, -9.0F, -3.0F);
    this.arm4part1b.setTextureSize(512, 256);
    this.arm4part1b.mirror = true;
    setRotation(this.arm4part1b, -0.2602503F, 0.0F, 0.0F);
    this.arm4part1c = new ModelRenderer(this, 316, 81);
    this.arm4part1c.addBox(-1.0F, -2.5F, -12.51F, 3, 5, 0);
    this.arm4part1c.setRotationPoint(-13.0F, -9.0F, -3.0F);
    this.arm4part1c.setTextureSize(512, 256);
    this.arm4part1c.mirror = true;
    setRotation(this.arm4part1c, -0.2602503F, 0.0F, 0.0F);
    this.tongue = new ModelRenderer(this, 0, 49);
    this.tongue.addBox(-1.0F, -1.0F, -10.0F, 2, 2, 11);
    this.tongue.setRotationPoint(0.0F, -12.0F, -8.0F);
    this.tongue.setTextureSize(512, 256);
    this.tongue.mirror = true;
    setRotation(this.tongue, 0.0F, 0.0F, 0.0F);
    this.tonguepart2 = new ModelRenderer(this, 0, 12);
    this.tonguepart2.addBox(-1.0F, -1.5F, -8.0F, 2, 3, 1);
    this.tonguepart2.setRotationPoint(0.0F, -12.0F, -8.0F);
    this.tonguepart2.setTextureSize(512, 256);
    this.tonguepart2.mirror = true;
    setRotation(this.tonguepart2, 0.0F, 0.0F, 0.0F);
    this.upperjawridgeleft = new ModelRenderer(this, 350, 27);
    this.upperjawridgeleft.addBox(-3.0F, -4.0F, -2.0F, 5, 1, 18);
    this.upperjawridgeleft.setRotationPoint(0.0F, -22.0F, -33.0F);
    this.upperjawridgeleft.setTextureSize(512, 256);
    this.upperjawridgeleft.mirror = true;
    setRotation(this.upperjawridgeleft, 0.2602503F, -0.3717861F, 0.0F);
    this.upperjawridgeright = new ModelRenderer(this, 350, 27);
    this.upperjawridgeright.addBox(-2.0F, -4.0F, -2.0F, 5, 1, 18);
    this.upperjawridgeright.setRotationPoint(0.0F, -22.0F, -33.0F);
    this.upperjawridgeright.setTextureSize(512, 256);
    this.upperjawridgeright.mirror = true;
    setRotation(this.upperjawridgeright, 0.260246F, 0.37179F, 0.0F);
    this.upperjawbaseleft = new ModelRenderer(this, 235, 44);
    this.upperjawbaseleft.addBox(-5.0F, -3.0F, -16.0F, 3, 4, 14);
    this.upperjawbaseleft.setRotationPoint(0.0F, -22.0F, -35.0F);
    this.upperjawbaseleft.setTextureSize(512, 256);
    this.upperjawbaseleft.mirror = true;
    setRotation(this.upperjawbaseleft, 0.0F, -0.2230717F, 0.0F);
    this.upperjawbaseright = new ModelRenderer(this, 210, 68);
    this.upperjawbaseright.addBox(2.0F, -3.0F, -16.0F, 3, 4, 14);
    this.upperjawbaseright.setRotationPoint(0.0F, -22.0F, -35.0F);
    this.upperjawbaseright.setTextureSize(512, 256);
    this.upperjawbaseright.mirror = true;
    setRotation(this.upperjawbaseright, 0.0F, 0.2230767F, 0.0F);
    this.upperjawbase = new ModelRenderer(this, 146, 76);
    this.upperjawbase.addBox(-5.0F, -3.0F, -29.0F, 10, 4, 29);
    this.upperjawbase.setRotationPoint(0.0F, -22.0F, -10.0F);
    this.upperjawbase.setTextureSize(512, 256);
    this.upperjawbase.mirror = true;
    setRotation(this.upperjawbase, 0.0F, 0.0F, 0.0F);
    this.upperjawbase2 = new ModelRenderer(this, 168, 111);
    this.upperjawbase2.addBox(-5.0F, -4.0F, -2.0F, 10, 5, 18);
    this.upperjawbase2.setRotationPoint(0.0F, -22.0F, -33.0F);
    this.upperjawbase2.setTextureSize(512, 256);
    this.upperjawbase2.mirror = true;
    setRotation(this.upperjawbase2, 0.2602503F, 0.0F, 0.0F);
    this.upperjawbase3 = new ModelRenderer(this, 300, 0);
    this.upperjawbase3.addBox(-1.5F, -3.01F, -16.0F, 3, 3, 14);
    this.upperjawbase3.setRotationPoint(0.0F, -22.0F, -35.0F);
    this.upperjawbase3.setTextureSize(512, 256);
    this.upperjawbase3.mirror = true;
    setRotation(this.upperjawbase3, 0.0F, 5.1E-6F, 0.0F);
    this.upperjawbase4 = new ModelRenderer(this, 45, 161);
    this.upperjawbase4.addBox(-2.0F, -2.0F, -29.0F, 4, 4, 41);
    this.upperjawbase4.setRotationPoint(0.0F, -22.0F, -22.0F);
    this.upperjawbase4.setTextureSize(512, 256);
    this.upperjawbase4.mirror = true;
    setRotation(this.upperjawbase4, 0.0698132F, -0.0488692F, 0.7807508F);
    this.upperjawend = new ModelRenderer(this, 160, 57);
    this.upperjawend.addBox(-0.5F, 0.0F, -0.5F, 1, 10, 1);
    this.upperjawend.setRotationPoint(0.0F, -20.0F, -50.0F);
    this.upperjawend.setTextureSize(512, 256);
    this.upperjawend.mirror = true;
    setRotation(this.upperjawend, 0.0F, 5.1E-6F, 0.0F);
    this.upperjawleftend = new ModelRenderer(this, 171, 58);
    this.upperjawleftend.addBox(-0.5F, 0.0F, -0.5F, 1, 9, 1);
    this.upperjawleftend.setRotationPoint(-1.0F, -20.0F, -50.0F);
    this.upperjawleftend.setTextureSize(512, 256);
    this.upperjawleftend.mirror = true;
    setRotation(this.upperjawleftend, -0.1115358F, -1.52433F, 0.0F);
    this.upperjawrightend = new ModelRenderer(this, 165, 58);
    this.upperjawrightend.addBox(-0.5F, 0.0F, -0.5F, 1, 9, 1);
    this.upperjawrightend.setRotationPoint(1.0F, -20.0F, -50.0F);
    this.upperjawrightend.setTextureSize(512, 256);
    this.upperjawrightend.mirror = true;
    setRotation(this.upperjawrightend, -0.1115358F, 1.52433F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    TrooperBug e = (TrooperBug)entity;
    RenderInfo r = null;
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    float newangle = 0.0F, upangle = 0.0F, nextangle = 0.0F;
    float pi4 = 1.570795F;
    if (e.getAttacking() == 0) {
      newangle = MathHelper.cos(f2 * 0.4F * this.wingspeed) * 3.1415927F * 0.05F;
    } else {
      newangle = MathHelper.cos(f2 * 1.4F * this.wingspeed) * 3.1415927F * 0.1F;
    } 
    this.antenna2part2.rotateAngleY = 0.78F + newangle;
    this.antenna1part2.rotateAngleY = -0.78F - newangle;
    if (e.getAttacking() == 0) {
      newangle = MathHelper.cos(f2 * 0.5F * this.wingspeed) * 3.1415927F * 0.05F;
    } else {
      newangle = MathHelper.cos(f2 * 2.5F * this.wingspeed) * 3.1415927F * 0.15F;
    } 
    this.arm4part1.rotateAngleY = newangle;
    this.arm4part1b.rotateAngleY = newangle;
    this.arm4part1c.rotateAngleY = newangle;
    this.arm3part1.rotateAngleY = -newangle;
    this.arm3part1b.rotateAngleY = -newangle;
    this.arm3part1c.rotateAngleY = -newangle;
    if (e.getAttacking() == 0) {
      newangle = MathHelper.cos(f2 * 0.3F * this.wingspeed) * 3.1415927F * 0.05F;
    } else {
      newangle = MathHelper.cos(f2 * 2.6F * this.wingspeed) * 3.1415927F * 0.2F;
    } 
    this.arm1part3.rotateAngleX = 1.56F + newangle;
    this.arm1part3b.rotateAngleX = 1.56F + newangle;
    this.arm2part3.rotateAngleX = 1.56F - newangle;
    this.arm2part3b.rotateAngleX = 1.56F - newangle;
    if (e.getAttacking() == 0) {
      newangle = MathHelper.cos(f2 * 0.1F * this.wingspeed) * 3.1415927F * 0.02F;
    } else {
      newangle = MathHelper.cos(f2 * 1.0F * this.wingspeed) * 3.1415927F * 0.1F;
    } 
    this.headleftridge.rotateAngleY = -0.25F + newangle;
    this.headrightridge.rotateAngleY = 0.25F - newangle;
    this.upperjawridgeleft.rotateAngleY = -0.372F + newangle;
    this.upperjawridgeright.rotateAngleY = 0.372F - newangle;
    if (e.getAttacking() == 0) {
      newangle = MathHelper.cos(f2 * 0.3F * this.wingspeed) * 3.1415927F * 0.015F;
    } else {
      newangle = MathHelper.cos(f2 * 2.6F * this.wingspeed) * 3.1415927F * 0.1F;
    } 
    this.jawbase.rotateAngleX = 0.22F + newangle;
    this.jawbase2.rotateAngleX = 0.22F + newangle;
    this.jawbase3.rotateAngleX = 0.22F + newangle;
    this.jawbase4.rotateAngleX = 0.22F + newangle;
    this.jawbase5.rotateAngleX = 0.22F + newangle;
    this.jawbase6.rotateAngleX = 0.22F + newangle;
    this.jawbase7.rotateAngleX = 0.22F + newangle;
    this.jawbase8.rotateAngleX = 0.2146F + newangle;
    this.jawbase8.rotateAngleY = 0.1487F + newangle;
    this.jawbase9.rotateAngleX = 0.1F + newangle;
    this.jawbase9.rotateAngleY = 0.07F + newangle;
    this.jawend.rotateAngleX = 0.22F + newangle;
    this.jawleft.rotateAngleX = 0.22F + newangle;
    this.jawright.rotateAngleX = 0.22F + newangle;
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
    this.legintersection.render(f5);
    this.legintersectionb.render(f5);
    this.leg1start.render(f5);
    this.leg1shoulder.render(f5);
    this.leg1shoulderpart2.render(f5);
    this.leg1part1.render(f5);
    this.leg1part1b.render(f5);
    this.leg1elbow.render(f5);
    this.leg1part2.render(f5);
    this.leg1part2b.render(f5);
    this.leg1part2c.render(f5);
    this.leg1part3.render(f5);
    this.leg1part3b.render(f5);
    this.leg1part3c.render(f5);
    this.leg1part3d.render(f5);
    this.leg2start.render(f5);
    this.leg2shoulder.render(f5);
    this.leg2shoulderpart2.render(f5);
    this.leg2part1.render(f5);
    this.leg2part1b.render(f5);
    this.leg2elbow.render(f5);
    this.leg2part2.render(f5);
    this.leg2part2b.render(f5);
    this.leg2part2c.render(f5);
    this.leg2part3.render(f5);
    this.leg2part3b.render(f5);
    this.leg2part3c.render(f5);
    this.leg2part3d.render(f5);
    this.leg3start.render(f5);
    this.leg3shoulder.render(f5);
    this.leg3shoulderpart2.render(f5);
    this.leg3part1.render(f5);
    this.leg3part1b.render(f5);
    this.leg3elbow.render(f5);
    this.leg3part2.render(f5);
    this.leg3part2b.render(f5);
    this.leg3part2c.render(f5);
    this.leg3part3.render(f5);
    this.leg3part3b.render(f5);
    this.leg3part3c.render(f5);
    this.leg3part3d.render(f5);
    this.leg4start.render(f5);
    this.leg4shoulder.render(f5);
    this.leg4shoulderpart2.render(f5);
    this.leg4part1.render(f5);
    this.leg4part1b.render(f5);
    this.leg4elbow.render(f5);
    this.leg4part2.render(f5);
    this.leg4part2b.render(f5);
    this.leg4part2c.render(f5);
    this.leg4part3.render(f5);
    this.leg4part3b.render(f5);
    this.leg4part3c.render(f5);
    this.leg4part3d.render(f5);
    this.jawbase.render(f5);
    this.jawbase2.render(f5);
    this.jawbase3.render(f5);
    this.jawbase4.render(f5);
    this.jawbase5.render(f5);
    this.jawbase6.render(f5);
    this.jawbase7.render(f5);
    this.jawbase8.render(f5);
    this.jawbase9.render(f5);
    this.jawleft.render(f5);
    this.jawright.render(f5);
    this.jawend.render(f5);
    this.headstart.render(f5);
    this.headbase.render(f5);
    this.headbase2.render(f5);
    this.headbase3.render(f5);
    this.headbase4.render(f5);
    this.headbase5.render(f5);
    this.headbase6.render(f5);
    this.headbase7.render(f5);
    this.headbase8.render(f5);
    this.headbase9.render(f5);
    this.headbase10.render(f5);
    this.headleftridge.render(f5);
    this.headrightridge.render(f5);
    this.antenna1.render(f5);
    this.antenna1part2.render(f5);
    this.antenna2.render(f5);
    this.antenna2part2.render(f5);
    this.eyebase1.render(f5);
    this.eye1.render(f5);
    this.eyebase2.render(f5);
    this.eye2.render(f5);
    this.arm1start.render(f5);
    this.arm1part1.render(f5);
    this.arm1part2.render(f5);
    this.arm1part2b.render(f5);
    this.arm1part2c.render(f5);
    this.arm1part3.render(f5);
    this.arm1part3b.render(f5);
    this.arm2start.render(f5);
    this.arm2part1.render(f5);
    this.arm2part2.render(f5);
    this.arm2part2b.render(f5);
    this.arm2part2c.render(f5);
    this.arm2part3.render(f5);
    this.arm2part3b.render(f5);
    this.innermouth.render(f5);
    this.innermouth2.render(f5);
    this.tooth1.render(f5);
    this.tooth2.render(f5);
    this.tooth3.render(f5);
    this.tooth4.render(f5);
    this.tooth5.render(f5);
    this.tooth6.render(f5);
    this.mouthedge1.render(f5);
    this.mouthedge2.render(f5);
    this.mouthedge3.render(f5);
    this.mouthedge4.render(f5);
    this.arm3start.render(f5);
    this.arm3part1.render(f5);
    this.arm3part1b.render(f5);
    this.arm3part1c.render(f5);
    this.arm4start.render(f5);
    this.arm4part1.render(f5);
    this.arm4part1b.render(f5);
    this.arm4part1c.render(f5);
    this.tongue.render(f5);
    this.tonguepart2.render(f5);
    this.upperjawridgeleft.render(f5);
    this.upperjawridgeright.render(f5);
    this.upperjawbaseleft.render(f5);
    this.upperjawbaseright.render(f5);
    this.upperjawbase.render(f5);
    this.upperjawbase2.render(f5);
    this.upperjawbase3.render(f5);
    this.upperjawbase4.render(f5);
    this.upperjawend.render(f5);
    this.upperjawleftend.render(f5);
    this.upperjawrightend.render(f5);
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
    this.leg1part1.rotateAngleY = 1.2F + angle;
    this.leg1part1b.rotateAngleY = this.leg1part1.rotateAngleY;
    this.leg1elbow.rotateAngleY = this.leg1part1.rotateAngleY;
    this.leg1part2.rotateAngleY = this.leg1part1.rotateAngleY;
    this.leg1part2b.rotateAngleY = this.leg1part1.rotateAngleY;
    this.leg1part2c.rotateAngleY = this.leg1part1.rotateAngleY;
    this.leg1part3.rotateAngleY = this.leg1part1.rotateAngleY;
    this.leg1part3b.rotateAngleY = this.leg1part1.rotateAngleY;
    this.leg1part3c.rotateAngleY = this.leg1part1.rotateAngleY;
    this.leg1part3d.rotateAngleY = this.leg1part1.rotateAngleY;
    this.leg1part1.rotateAngleX = 1.115F + upangle;
    this.leg1part1b.rotateAngleX = 1.078F + upangle;
    this.leg1elbow.rotateAngleX = this.leg1part1.rotateAngleX;
    float dist = 26.0F;
    dist = (float)(dist * Math.cos(this.leg1part1.rotateAngleX));
    this.leg1part2c.rotationPointZ = (float)(this.leg1part1.rotationPointZ - Math.cos(this.leg1part1.rotateAngleY) * dist);
    this.leg1part2c.rotationPointX = (float)(this.leg1part1.rotationPointX - Math.sin(this.leg1part1.rotateAngleY) * dist);
    this.leg1part2.rotateAngleX = 1.871F - upangle;
    this.leg1part2b.rotateAngleX = 1.817F - upangle;
    this.leg1part2c.rotateAngleX = 1.762F - upangle;
    dist = 32.0F;
    dist = (float)Math.abs(dist * Math.cos(this.leg1part2.rotateAngleX));
    this.leg1part3d.rotationPointZ = (float)(this.leg1part2.rotationPointZ - Math.cos(this.leg1part2.rotateAngleY) * dist);
    this.leg1part3d.rotationPointX = (float)(this.leg1part2.rotationPointX - Math.sin(this.leg1part2.rotateAngleY) * dist);
    this.leg1part3.rotateAngleX = 1.08F + upangle;
    this.leg1part3b.rotateAngleX = 1.08F + upangle;
    this.leg1part3c.rotateAngleX = 1.08F + upangle;
    this.leg1part3d.rotateAngleX = 1.08F + upangle;
  }
  
  private void doLeftFrontLeg(float angle, float upangle) {
    this.leg2part1.rotateAngleY = -1.2F + angle;
    this.leg2part1b.rotateAngleY = this.leg2part1.rotateAngleY;
    this.leg2elbow.rotateAngleY = this.leg2part1.rotateAngleY;
    this.leg2part2.rotateAngleY = this.leg2part1.rotateAngleY;
    this.leg2part2b.rotateAngleY = this.leg2part1.rotateAngleY;
    this.leg2part2c.rotateAngleY = this.leg2part1.rotateAngleY;
    this.leg2part3.rotateAngleY = this.leg2part1.rotateAngleY;
    this.leg2part3b.rotateAngleY = this.leg2part1.rotateAngleY;
    this.leg2part3c.rotateAngleY = this.leg2part1.rotateAngleY;
    this.leg2part3d.rotateAngleY = this.leg2part1.rotateAngleY;
    this.leg2part1.rotateAngleX = 1.115F + upangle;
    this.leg2part1b.rotateAngleX = 1.078F + upangle;
    this.leg2elbow.rotateAngleX = this.leg2part1.rotateAngleX;
    float dist = 26.0F;
    dist = (float)(dist * Math.cos(this.leg2part1.rotateAngleX));
    this.leg2part2c.rotationPointZ = (float)(this.leg2part1.rotationPointZ - Math.cos(this.leg2part1.rotateAngleY) * dist);
    this.leg2part2c.rotationPointX = (float)(this.leg2part1.rotationPointX - Math.sin(this.leg2part1.rotateAngleY) * dist);
    this.leg2part2.rotateAngleX = 1.871F - upangle;
    this.leg2part2b.rotateAngleX = 1.817F - upangle;
    this.leg2part2c.rotateAngleX = 1.762F - upangle;
    dist = 32.0F;
    dist = (float)Math.abs(dist * Math.cos(this.leg2part2.rotateAngleX));
    this.leg2part3d.rotationPointZ = (float)(this.leg2part2.rotationPointZ - Math.cos(this.leg2part2.rotateAngleY) * dist);
    this.leg2part3d.rotationPointX = (float)(this.leg2part2.rotationPointX - Math.sin(this.leg2part2.rotateAngleY) * dist);
    this.leg2part3.rotateAngleX = 1.08F + upangle;
    this.leg2part3b.rotateAngleX = 1.08F + upangle;
    this.leg2part3c.rotateAngleX = 1.08F + upangle;
    this.leg2part3d.rotateAngleX = 1.08F + upangle;
  }
  
  private void doRightRearLeg(float angle, float upangle) {
    this.leg4part1.rotateAngleY = -1.2F + angle;
    this.leg4part1b.rotateAngleY = this.leg4part1.rotateAngleY;
    this.leg4elbow.rotateAngleY = this.leg4part1.rotateAngleY;
    this.leg4part2.rotateAngleY = this.leg4part1.rotateAngleY;
    this.leg4part2b.rotateAngleY = this.leg4part1.rotateAngleY;
    this.leg4part2c.rotateAngleY = this.leg4part1.rotateAngleY;
    this.leg4part3.rotateAngleY = this.leg4part1.rotateAngleY;
    this.leg4part3b.rotateAngleY = this.leg4part1.rotateAngleY;
    this.leg4part3c.rotateAngleY = this.leg4part1.rotateAngleY;
    this.leg4part3d.rotateAngleY = this.leg4part1.rotateAngleY;
    this.leg4part1.rotateAngleX = -1.115F + upangle;
    this.leg4part1b.rotateAngleX = -1.078F + upangle;
    this.leg4elbow.rotateAngleX = this.leg4part1.rotateAngleX;
    float dist = 26.0F;
    dist = (float)(dist * Math.cos(this.leg4part1.rotateAngleX));
    this.leg4part2c.rotationPointZ = (float)(this.leg4part1.rotationPointZ + Math.cos(this.leg4part1.rotateAngleY) * dist);
    this.leg4part2c.rotationPointX = (float)(this.leg4part1.rotationPointX + Math.sin(this.leg4part1.rotateAngleY) * dist);
    this.leg4part2.rotateAngleX = -1.871F - upangle;
    this.leg4part2b.rotateAngleX = -1.817F - upangle;
    this.leg4part2c.rotateAngleX = -1.762F - upangle;
    dist = 32.0F;
    dist = (float)Math.abs(dist * Math.cos(this.leg4part2.rotateAngleX));
    this.leg4part3d.rotationPointZ = (float)(this.leg4part2.rotationPointZ + Math.cos(this.leg4part2.rotateAngleY) * dist);
    this.leg4part3d.rotationPointX = (float)(this.leg4part2.rotationPointX + Math.sin(this.leg4part2.rotateAngleY) * dist);
    this.leg4part3.rotateAngleX = -1.08F + upangle;
    this.leg4part3b.rotateAngleX = -1.08F + upangle;
    this.leg4part3c.rotateAngleX = -1.08F + upangle;
    this.leg4part3d.rotateAngleX = -1.08F + upangle;
  }
  
  private void doLeftRearLeg(float angle, float upangle) {
    this.leg3part1.rotateAngleY = 1.2F + angle;
    this.leg3part1b.rotateAngleY = this.leg3part1.rotateAngleY;
    this.leg3elbow.rotateAngleY = this.leg3part1.rotateAngleY;
    this.leg3part2.rotateAngleY = this.leg3part1.rotateAngleY;
    this.leg3part2b.rotateAngleY = this.leg3part1.rotateAngleY;
    this.leg3part2c.rotateAngleY = this.leg3part1.rotateAngleY;
    this.leg3part3.rotateAngleY = this.leg3part1.rotateAngleY;
    this.leg3part3b.rotateAngleY = this.leg3part1.rotateAngleY;
    this.leg3part3c.rotateAngleY = this.leg3part1.rotateAngleY;
    this.leg3part3d.rotateAngleY = this.leg3part1.rotateAngleY;
    this.leg3part1.rotateAngleX = -1.115F + upangle;
    this.leg3part1b.rotateAngleX = -1.078F + upangle;
    this.leg3elbow.rotateAngleX = this.leg3part1.rotateAngleX;
    float dist = 26.0F;
    dist = (float)(dist * Math.cos(this.leg3part1.rotateAngleX));
    this.leg3part2c.rotationPointZ = (float)(this.leg3part1.rotationPointZ + Math.cos(this.leg3part1.rotateAngleY) * dist);
    this.leg3part2c.rotationPointX = (float)(this.leg3part1.rotationPointX + Math.sin(this.leg3part1.rotateAngleY) * dist);
    this.leg3part2.rotateAngleX = -1.871F - upangle;
    this.leg3part2b.rotateAngleX = -1.817F - upangle;
    this.leg3part2c.rotateAngleX = -1.762F - upangle;
    dist = 32.0F;
    dist = (float)Math.abs(dist * Math.cos(this.leg3part2.rotateAngleX));
    this.leg3part3d.rotationPointZ = (float)(this.leg3part2.rotationPointZ + Math.cos(this.leg3part2.rotateAngleY) * dist);
    this.leg3part3d.rotationPointX = (float)(this.leg3part2.rotationPointX + Math.sin(this.leg3part2.rotateAngleY) * dist);
    this.leg3part3.rotateAngleX = -1.08F + upangle;
    this.leg3part3b.rotateAngleX = -1.08F + upangle;
    this.leg3part3c.rotateAngleX = -1.08F + upangle;
    this.leg3part3d.rotateAngleX = -1.08F + upangle;
  }
}
