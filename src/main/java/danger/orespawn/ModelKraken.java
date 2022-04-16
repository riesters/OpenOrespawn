package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelKraken extends ModelBase {
  private float wingspeed = 1.0F;
  
  ModelRenderer Lefteye;
  
  ModelRenderer Backbody;
  
  ModelRenderer Centerbody;
  
  ModelRenderer Head;
  
  ModelRenderer Sucktioncupleft;
  
  ModelRenderer Finright;
  
  ModelRenderer Tailbase1;
  
  ModelRenderer Tail2;
  
  ModelRenderer Tailtip;
  
  ModelRenderer Finleft;
  
  ModelRenderer Frontbody;
  
  ModelRenderer Mouth1;
  
  ModelRenderer Tent54;
  
  ModelRenderer Tent62;
  
  ModelRenderer Tent63;
  
  ModelRenderer Tent64;
  
  ModelRenderer Tent58;
  
  ModelRenderer Tent66;
  
  ModelRenderer Tent67;
  
  ModelRenderer Tent68;
  
  ModelRenderer Tent28;
  
  ModelRenderer Tent51;
  
  ModelRenderer Tent52;
  
  ModelRenderer Tent53;
  
  ModelRenderer Tent65;
  
  ModelRenderer Tent55;
  
  ModelRenderer Tent56;
  
  ModelRenderer Tent57;
  
  ModelRenderer Sucktioncupright;
  
  ModelRenderer Righteye;
  
  ModelRenderer Mouth2;
  
  ModelRenderer Mouth3;
  
  ModelRenderer Mouth4;
  
  ModelRenderer Mouth5;
  
  ModelRenderer Mouth6;
  
  ModelRenderer Mouth7;
  
  ModelRenderer Mouth8;
  
  ModelRenderer Tent61;
  
  ModelRenderer Tent38;
  
  ModelRenderer Tent22;
  
  ModelRenderer Tent23;
  
  ModelRenderer Tent24;
  
  ModelRenderer Tent25;
  
  ModelRenderer Tent26;
  
  ModelRenderer Tent27;
  
  ModelRenderer Tooth1;
  
  ModelRenderer Tent48;
  
  ModelRenderer Tent32;
  
  ModelRenderer Tent33;
  
  ModelRenderer Tent34;
  
  ModelRenderer Tent35;
  
  ModelRenderer Tent36;
  
  ModelRenderer Tent37;
  
  ModelRenderer Jet;
  
  ModelRenderer Tent41;
  
  ModelRenderer Tent42;
  
  ModelRenderer Tent43;
  
  ModelRenderer Tent44;
  
  ModelRenderer Tent45;
  
  ModelRenderer Tent46;
  
  ModelRenderer Tent47;
  
  ModelRenderer Tent21;
  
  ModelRenderer Tent11;
  
  ModelRenderer Tent12;
  
  ModelRenderer Tent13;
  
  ModelRenderer Tent14;
  
  ModelRenderer Tent15;
  
  ModelRenderer Tent16;
  
  ModelRenderer Tent31;
  
  ModelRenderer Tent18;
  
  ModelRenderer Tooth2;
  
  ModelRenderer Tooth3;
  
  ModelRenderer Tooth4;
  
  ModelRenderer Tooth5;
  
  ModelRenderer Tooth6;
  
  ModelRenderer Tooth7;
  
  ModelRenderer Tooth8;
  
  ModelRenderer Tooth9;
  
  ModelRenderer Tooth10;
  
  ModelRenderer Tooth11;
  
  ModelRenderer Tooth12;
  
  ModelRenderer Tooth13;
  
  ModelRenderer Tooth14;
  
  ModelRenderer Tooth15;
  
  ModelRenderer Tooth16;
  
  ModelRenderer Tooth17;
  
  ModelRenderer Tooth18;
  
  ModelRenderer Tooth19;
  
  ModelRenderer Tooth20;
  
  ModelRenderer Tooth21;
  
  ModelRenderer Tooth22;
  
  ModelRenderer Tooth23;
  
  ModelRenderer Tooth24;
  
  ModelRenderer Tooth25;
  
  ModelRenderer Tooth26;
  
  ModelRenderer Tooth27;
  
  ModelRenderer Tooth28;
  
  ModelRenderer Tooth29;
  
  ModelRenderer Tooth30;
  
  ModelRenderer Tooth31;
  
  ModelRenderer Tooth32;
  
  ModelRenderer Tooth33;
  
  ModelRenderer Tooth34;
  
  ModelRenderer Tooth35;
  
  ModelRenderer Tooth36;
  
  ModelRenderer Tooth37;
  
  ModelRenderer Tooth38;
  
  ModelRenderer Tooth39;
  
  ModelRenderer Tooth40;
  
  ModelRenderer Tooth41;
  
  ModelRenderer Tent17;
  
  public ModelKraken(float f1) {
    this.wingspeed = f1;
    this.textureWidth = 512;
    this.textureHeight = 512;
    this.Lefteye = new ModelRenderer(this, 56, 458);
    this.Lefteye.addBox(0.0F, -8.0F, -12.0F, 4, 16, 24);
    this.Lefteye.setRotationPoint(20.0F, -24.0F, -90.0F);
    this.Lefteye.setTextureSize(64, 32);
    this.Lefteye.mirror = true;
    setRotation(this.Lefteye, 0.0F, 0.0F, 0.0F);
    this.Backbody = new ModelRenderer(this, 320, 272);
    this.Backbody.addBox(-24.0F, -24.0F, 0.0F, 48, 48, 48);
    this.Backbody.setRotationPoint(0.0F, -24.0F, 28.0F);
    this.Backbody.setTextureSize(64, 32);
    this.Backbody.mirror = true;
    setRotation(this.Backbody, 0.0F, 0.0F, 0.0F);
    this.Centerbody = new ModelRenderer(this, 320, 176);
    this.Centerbody.addBox(-24.0F, -24.0F, -24.0F, 48, 48, 48);
    this.Centerbody.setRotationPoint(0.0F, -24.0F, 4.0F);
    this.Centerbody.setTextureSize(64, 32);
    this.Centerbody.mirror = true;
    setRotation(this.Centerbody, 0.0F, 0.0F, 0.0F);
    this.Head = new ModelRenderer(this, 336, 0);
    this.Head.addBox(-20.0F, -20.0F, -40.0F, 40, 40, 40);
    this.Head.setRotationPoint(0.0F, -24.0F, -68.0F);
    this.Head.setTextureSize(64, 32);
    this.Head.mirror = true;
    setRotation(this.Head, 0.0F, 0.0F, 0.0F);
    this.Sucktioncupleft = new ModelRenderer(this, 80, 84);
    this.Sucktioncupleft.addBox(-8.0F, -4.0F, -32.0F, 16, 8, 32);
    this.Sucktioncupleft.setRotationPoint(32.0F, -26.0F, -336.0F);
    this.Sucktioncupleft.setTextureSize(64, 32);
    this.Sucktioncupleft.mirror = true;
    setRotation(this.Sucktioncupleft, 0.3490659F, 0.2617994F, 0.0F);
    this.Finright = new ModelRenderer(this, 0, 329);
    this.Finright.addBox(-40.0F, -8.0F, -32.0F, 40, 12, 104);
    this.Finright.setRotationPoint(-12.0F, -21.0F, 83.0F);
    this.Finright.setTextureSize(64, 32);
    this.Finright.mirror = true;
    setRotation(this.Finright, 0.0F, 0.0F, 0.0F);
    this.Tailbase1 = new ModelRenderer(this, 368, 368);
    this.Tailbase1.addBox(-20.0F, -20.0F, 0.0F, 40, 40, 32);
    this.Tailbase1.setRotationPoint(0.0F, -24.0F, 75.0F);
    this.Tailbase1.setTextureSize(64, 32);
    this.Tailbase1.mirror = true;
    setRotation(this.Tailbase1, 0.0F, 0.0F, 0.0F);
    this.Tail2 = new ModelRenderer(this, 384, 440);
    this.Tail2.addBox(-16.0F, -16.0F, 0.0F, 32, 32, 32);
    this.Tail2.setRotationPoint(0.0F, -24.0F, 107.0F);
    this.Tail2.setTextureSize(64, 32);
    this.Tail2.mirror = true;
    setRotation(this.Tail2, 0.0F, 0.0F, 0.0F);
    this.Tailtip = new ModelRenderer(this, 272, 457);
    this.Tailtip.addBox(-12.0F, -12.0F, 0.0F, 24, 24, 32);
    this.Tailtip.setRotationPoint(0.0F, -24.0F, 139.0F);
    this.Tailtip.setTextureSize(64, 32);
    this.Tailtip.mirror = true;
    setRotation(this.Tailtip, 0.0F, 0.0F, 0.0F);
    this.Finleft = new ModelRenderer(this, 0, 201);
    this.Finleft.addBox(0.0F, -8.0F, -32.0F, 40, 12, 104);
    this.Finleft.setRotationPoint(12.0F, -21.0F, 83.0F);
    this.Finleft.setTextureSize(64, 32);
    this.Finleft.mirror = true;
    setRotation(this.Finleft, 0.0F, 0.0F, 0.0F);
    this.Frontbody = new ModelRenderer(this, 320, 80);
    this.Frontbody.addBox(-20.0F, -20.0F, -47.0F, 48, 48, 48);
    this.Frontbody.setRotationPoint(-4.0F, -28.0F, -21.0F);
    this.Frontbody.setTextureSize(64, 32);
    this.Frontbody.mirror = true;
    setRotation(this.Frontbody, 0.0F, 0.0F, 0.0F);
    this.Mouth1 = new ModelRenderer(this, 232, 160);
    this.Mouth1.addBox(-2.0F, -8.0F, -24.0F, 4, 16, 24);
    this.Mouth1.setRotationPoint(11.0F, -28.0F, -104.0F);
    this.Mouth1.setTextureSize(64, 32);
    this.Mouth1.mirror = true;
    setRotation(this.Mouth1, -0.3839724F, -0.3839724F, -0.7853982F);
    this.Tent54 = new ModelRenderer(this, 80, 161);
    this.Tent54.addBox(-4.0F, -4.0F, -32.0F, 8, 8, 32);
    this.Tent54.setRotationPoint(37.0F, -51.0F, -191.0F);
    this.Tent54.setTextureSize(64, 32);
    this.Tent54.mirror = true;
    setRotation(this.Tent54, 0.0872665F, -0.0872665F, 0.0F);
    this.Tent62 = new ModelRenderer(this, 80, 161);
    this.Tent62.addBox(-4.0F, -4.0F, -32.0F, 8, 8, 32);
    this.Tent62.setRotationPoint(-21.0F, -46.0F, -133.0F);
    this.Tent62.setTextureSize(64, 32);
    this.Tent62.mirror = true;
    setRotation(this.Tent62, -0.2617994F, 0.3490659F, 0.0F);
    this.Tent63 = new ModelRenderer(this, 80, 161);
    this.Tent63.addBox(-4.0F, -4.0F, -32.0F, 8, 8, 32);
    this.Tent63.setRotationPoint(-31.0F, -54.0F, -159.5333F);
    this.Tent63.setTextureSize(64, 32);
    this.Tent63.mirror = true;
    setRotation(this.Tent63, -0.0872665F, 0.1745329F, 0.0F);
    this.Tent64 = new ModelRenderer(this, 80, 161);
    this.Tent64.addBox(-4.0F, -4.0F, -32.0F, 8, 8, 32);
    this.Tent64.setRotationPoint(-36.0F, -57.0F, -188.0F);
    this.Tent64.setTextureSize(64, 32);
    this.Tent64.mirror = true;
    setRotation(this.Tent64, 0.0872665F, -0.0872665F, 0.0F);
    this.Tent58 = new ModelRenderer(this, 80, 124);
    this.Tent58.addBox(-2.0F, -2.0F, -32.0F, 4, 4, 32);
    this.Tent58.setRotationPoint(40.0F, -36.0F, -308.0F);
    this.Tent58.setTextureSize(64, 32);
    this.Tent58.mirror = true;
    setRotation(this.Tent58, 0.3490659F, 0.2617994F, 0.0F);
    this.Tent66 = new ModelRenderer(this, 80, 124);
    this.Tent66.addBox(-2.0F, -2.0F, -32.0F, 4, 4, 32);
    this.Tent66.setRotationPoint(-31.0F, -51.0F, -250.0F);
    this.Tent66.setTextureSize(64, 32);
    this.Tent66.mirror = true;
    setRotation(this.Tent66, 0.0872665F, -0.0872665F, 0.0F);
    this.Tent67 = new ModelRenderer(this, 80, 124);
    this.Tent67.addBox(-2.0F, -2.0F, -32.0F, 4, 4, 32);
    this.Tent67.setRotationPoint(-28.0F, -48.0F, -281.0F);
    this.Tent67.setTextureSize(64, 32);
    this.Tent67.mirror = true;
    setRotation(this.Tent67, 0.2617994F, -0.1745329F, 0.0F);
    this.Tent68 = new ModelRenderer(this, 80, 124);
    this.Tent68.addBox(-2.0F, -2.0F, -32.0F, 4, 4, 32);
    this.Tent68.setRotationPoint(-23.0F, -40.0F, -309.0F);
    this.Tent68.setTextureSize(64, 32);
    this.Tent68.mirror = true;
    setRotation(this.Tent68, 0.3490659F, -0.2617994F, 0.0F);
    this.Tent28 = new ModelRenderer(this, 0, 57);
    this.Tent28.addBox(-1.0F, -1.0F, -32.0F, 1, 1, 32);
    this.Tent28.setRotationPoint(-17.0F, 50.0F, -307.0F);
    this.Tent28.setTextureSize(64, 32);
    this.Tent28.mirror = true;
    setRotation(this.Tent28, 0.0872665F, -0.1745329F, 0.0F);
    this.Tent51 = new ModelRenderer(this, 80, 161);
    this.Tent51.addBox(-4.0F, -4.0F, -32.0F, 8, 8, 32);
    this.Tent51.setRotationPoint(14.0F, -38.0F, -105.0F);
    this.Tent51.setTextureSize(64, 32);
    this.Tent51.mirror = true;
    setRotation(this.Tent51, -0.2617994F, -0.2617994F, 0.0F);
    this.Tent52 = new ModelRenderer(this, 80, 161);
    this.Tent52.addBox(-4.0F, -4.0F, -32.0F, 8, 8, 32);
    this.Tent52.setRotationPoint(22.0F, -46.0F, -134.0F);
    this.Tent52.setTextureSize(64, 32);
    this.Tent52.mirror = true;
    setRotation(this.Tent52, -0.2617994F, -0.3490659F, -0.0523599F);
    this.Tent53 = new ModelRenderer(this, 80, 161);
    this.Tent53.addBox(-4.0F, -4.0F, -32.0F, 8, 8, 32);
    this.Tent53.setRotationPoint(32.0F, -54.0F, -161.0F);
    this.Tent53.setTextureSize(64, 32);
    this.Tent53.mirror = true;
    setRotation(this.Tent53, 0.0872665F, -0.1745329F, 0.0F);
    this.Tent65 = new ModelRenderer(this, 80, 124);
    this.Tent65.addBox(-2.0F, -2.0F, -32.0F, 4, 4, 32);
    this.Tent65.setRotationPoint(-34.0F, -54.0F, -219.0F);
    this.Tent65.setTextureSize(64, 32);
    this.Tent65.mirror = true;
    setRotation(this.Tent65, 0.0872665F, -0.0872665F, 0.0F);
    this.Tent55 = new ModelRenderer(this, 80, 124);
    this.Tent55.addBox(-2.0F, -2.0F, -32.0F, 4, 4, 32);
    this.Tent55.setRotationPoint(40.0F, -49.0F, -219.0F);
    this.Tent55.setTextureSize(64, 32);
    this.Tent55.mirror = true;
    setRotation(this.Tent55, 0.0872665F, -0.0872665F, 0.0F);
    this.Tent56 = new ModelRenderer(this, 80, 124);
    this.Tent56.addBox(-2.0F, -2.0F, -32.0F, 4, 4, 32);
    this.Tent56.setRotationPoint(42.0F, -46.0F, -249.0F);
    this.Tent56.setTextureSize(64, 32);
    this.Tent56.mirror = true;
    setRotation(this.Tent56, 0.0872665F, -0.0872665F, 0.0F);
    this.Tent57 = new ModelRenderer(this, 80, 124);
    this.Tent57.addBox(-2.0F, -2.0F, -32.0F, 4, 4, 32);
    this.Tent57.setRotationPoint(45.0F, -44.0F, -279.0F);
    this.Tent57.setTextureSize(64, 32);
    this.Tent57.mirror = true;
    setRotation(this.Tent57, 0.2617994F, 0.1745329F, 0.0F);
    this.Sucktioncupright = new ModelRenderer(this, 80, 84);
    this.Sucktioncupright.addBox(-8.0F, -4.0F, -32.0F, 16, 8, 32);
    this.Sucktioncupright.setRotationPoint(-14.0F, -30.0F, -336.0F);
    this.Sucktioncupright.setTextureSize(64, 32);
    this.Sucktioncupright.mirror = true;
    setRotation(this.Sucktioncupright, 0.3490659F, -0.2617994F, 0.0F);
    this.Righteye = new ModelRenderer(this, 0, 458);
    this.Righteye.addBox(-4.0F, -8.0F, -12.0F, 4, 16, 24);
    this.Righteye.setRotationPoint(-20.0F, -24.0F, -90.0F);
    this.Righteye.setTextureSize(64, 32);
    this.Righteye.mirror = true;
    setRotation(this.Righteye, 0.0F, 0.0F, 0.0F);
    this.Mouth2 = new ModelRenderer(this, 232, 92);
    this.Mouth2.addBox(-2.0F, -8.0F, -24.0F, 4, 16, 24);
    this.Mouth2.setRotationPoint(-12.0F, -28.0F, -104.0F);
    this.Mouth2.setTextureSize(64, 32);
    this.Mouth2.mirror = true;
    setRotation(this.Mouth2, -0.3839724F, 0.3839724F, 0.7853982F);
    this.Mouth3 = new ModelRenderer(this, 232, 12);
    this.Mouth3.addBox(-2.0F, -8.0F, -24.0F, 4, 16, 24);
    this.Mouth3.setRotationPoint(-10.0F, -12.0F, -104.0F);
    this.Mouth3.setTextureSize(64, 32);
    this.Mouth3.mirror = true;
    setRotation(this.Mouth3, 0.3839724F, 0.3839724F, -0.8004762F);
    this.Mouth4 = new ModelRenderer(this, 288, 427);
    this.Mouth4.addBox(-8.0F, -2.0F, -24.0F, 16, 4, 24);
    this.Mouth4.setRotationPoint(0.0F, -9.0F, -104.0F);
    this.Mouth4.setTextureSize(64, 32);
    this.Mouth4.mirror = true;
    setRotation(this.Mouth4, 0.3839724F, 0.0F, 0.0F);
    this.Mouth5 = new ModelRenderer(this, 288, 387);
    this.Mouth5.addBox(-2.0F, -8.0F, -24.0F, 4, 16, 24);
    this.Mouth5.setRotationPoint(11.0F, -12.0F, -104.0F);
    this.Mouth5.setTextureSize(64, 32);
    this.Mouth5.mirror = true;
    setRotation(this.Mouth5, 0.3839724F, -0.3839724F, 0.7853982F);
    this.Mouth6 = new ModelRenderer(this, 175, 160);
    this.Mouth6.addBox(-2.0F, -8.0F, -24.0F, 4, 16, 24);
    this.Mouth6.setRotationPoint(10.0F, -21.0F, -104.0F);
    this.Mouth6.setTextureSize(64, 32);
    this.Mouth6.mirror = true;
    setRotation(this.Mouth6, 0.0F, -0.3839724F, 0.0F);
    this.Mouth7 = new ModelRenderer(this, 232, 52);
    this.Mouth7.addBox(-2.0F, -8.0F, -24.0F, 4, 16, 24);
    this.Mouth7.setRotationPoint(-10.0F, -21.0F, -104.0F);
    this.Mouth7.setTextureSize(64, 32);
    this.Mouth7.mirror = true;
    setRotation(this.Mouth7, 0.0F, 0.3839724F, 0.0F);
    this.Mouth8 = new ModelRenderer(this, 232, 132);
    this.Mouth8.addBox(-8.0F, -2.0F, -24.0F, 16, 4, 24);
    this.Mouth8.setRotationPoint(0.0F, -31.0F, -104.0F);
    this.Mouth8.setTextureSize(64, 32);
    this.Mouth8.mirror = true;
    setRotation(this.Mouth8, -0.3839724F, 0.0F, 0.0F);
    this.Tent61 = new ModelRenderer(this, 80, 161);
    this.Tent61.addBox(-4.0F, -4.0F, -32.0F, 8, 8, 32);
    this.Tent61.setRotationPoint(-14.0F, -38.0F, -105.0F);
    this.Tent61.setTextureSize(64, 32);
    this.Tent61.mirror = true;
    setRotation(this.Tent61, -0.2617994F, 0.2617994F, 0.0F);
    this.Tent38 = new ModelRenderer(this, 0, 57);
    this.Tent38.addBox(0.0F, 0.0F, -32.0F, 1, 1, 32);
    this.Tent38.setRotationPoint(57.0F, 39.0F, -307.0F);
    this.Tent38.setTextureSize(64, 32);
    this.Tent38.mirror = true;
    setRotation(this.Tent38, 0.0F, 0.0F, 0.0F);
    this.Tent22 = new ModelRenderer(this, 0, 162);
    this.Tent22.addBox(-4.0F, -4.0F, -32.0F, 7, 7, 32);
    this.Tent22.setRotationPoint(-21.0F, 0.0F, -133.0F);
    this.Tent22.setTextureSize(64, 32);
    this.Tent22.mirror = true;
    setRotation(this.Tent22, 0.2617994F, 0.1745329F, 0.0F);
    this.Tent23 = new ModelRenderer(this, 0, 162);
    this.Tent23.addBox(-4.0F, -4.0F, -32.0F, 7, 7, 32);
    this.Tent23.setRotationPoint(-26.0F, 8.0F, -161.0F);
    this.Tent23.setTextureSize(64, 32);
    this.Tent23.mirror = true;
    setRotation(this.Tent23, 0.3490659F, 0.0F, 0.0F);
    this.Tent24 = new ModelRenderer(this, 0, 125);
    this.Tent24.addBox(-3.0F, -3.0F, -32.0F, 5, 5, 32);
    this.Tent24.setRotationPoint(-26.0F, 19.0F, -191.0F);
    this.Tent24.setTextureSize(64, 32);
    this.Tent24.mirror = true;
    setRotation(this.Tent24, 0.3490659F, 0.0F, 0.0F);
    this.Tent25 = new ModelRenderer(this, 0, 125);
    this.Tent25.addBox(-3.0F, -3.0F, -32.0F, 5, 5, 32);
    this.Tent25.setRotationPoint(-26.0F, 29.0F, -219.0F);
    this.Tent25.setTextureSize(64, 32);
    this.Tent25.mirror = true;
    setRotation(this.Tent25, 0.2617994F, -0.0872665F, 0.0F);
    this.Tent26 = new ModelRenderer(this, 0, 90);
    this.Tent26.addBox(-2.0F, -2.0F, -32.0F, 3, 3, 32);
    this.Tent26.setRotationPoint(-24.0F, 37.0F, -248.0F);
    this.Tent26.setTextureSize(64, 32);
    this.Tent26.mirror = true;
    setRotation(this.Tent26, 0.2617994F, -0.0872665F, 0.0F);
    this.Tent27 = new ModelRenderer(this, 0, 90);
    this.Tent27.addBox(-2.0F, -2.0F, -32.0F, 3, 3, 32);
    this.Tent27.setRotationPoint(-22.0F, 45.0F, -277.0F);
    this.Tent27.setTextureSize(64, 32);
    this.Tent27.mirror = true;
    setRotation(this.Tent27, 0.1745329F, -0.1745329F, 0.0F);
    this.Tooth1 = new ModelRenderer(this, 0, 0);
    this.Tooth1.addBox(0.0F, 0.0F, -8.0F, 1, 1, 8);
    this.Tooth1.setRotationPoint(-7.0F, -7.0F, -119.0F);
    this.Tooth1.setTextureSize(64, 32);
    this.Tooth1.mirror = true;
    setRotation(this.Tooth1, -0.1745329F, -0.3490659F, 0.0F);
    this.Tent48 = new ModelRenderer(this, 0, 57);
    this.Tent48.addBox(0.0F, 0.0F, -32.0F, 1, 1, 32);
    this.Tent48.setRotationPoint(82.0F, -5.0F, -302.0F);
    this.Tent48.setTextureSize(64, 32);
    this.Tent48.mirror = true;
    setRotation(this.Tent48, 0.0872665F, 0.2617994F, 0.0F);
    this.Tent32 = new ModelRenderer(this, 0, 162);
    this.Tent32.addBox(-4.0F, -4.0F, -32.0F, 7, 7, 32);
    this.Tent32.setRotationPoint(24.0F, 0.0F, -134.0F);
    this.Tent32.setTextureSize(64, 32);
    this.Tent32.mirror = true;
    setRotation(this.Tent32, 0.2617994F, -0.3490659F, 0.0F);
    this.Tent33 = new ModelRenderer(this, 0, 161);
    this.Tent33.addBox(-4.0F, -4.0F, -32.0F, 7, 7, 32);
    this.Tent33.setRotationPoint(34.0F, 8.0F, -162.0F);
    this.Tent33.setTextureSize(64, 32);
    this.Tent33.mirror = true;
    setRotation(this.Tent33, 0.3490659F, -0.2617994F, 0.0F);
    this.Tent34 = new ModelRenderer(this, 0, 125);
    this.Tent34.addBox(-2.0F, -2.0F, -32.0F, 5, 5, 32);
    this.Tent34.setRotationPoint(41.0F, 18.0F, -190.0F);
    this.Tent34.setTextureSize(64, 32);
    this.Tent34.mirror = true;
    setRotation(this.Tent34, 0.2617994F, -0.2617994F, 0.0F);
    this.Tent35 = new ModelRenderer(this, 0, 125);
    this.Tent35.addBox(-2.0F, -2.0F, -32.0F, 5, 5, 32);
    this.Tent35.setRotationPoint(49.0F, 26.0F, -218.0F);
    this.Tent35.setTextureSize(64, 32);
    this.Tent35.mirror = true;
    setRotation(this.Tent35, 0.1745329F, -0.1745329F, 0.0F);
    this.Tent36 = new ModelRenderer(this, 0, 90);
    this.Tent36.addBox(-1.0F, -1.0F, -32.0F, 3, 3, 32);
    this.Tent36.setRotationPoint(54.0F, 31.0F, -247.0F);
    this.Tent36.setTextureSize(64, 32);
    this.Tent36.mirror = true;
    setRotation(this.Tent36, 0.1745329F, -0.0872665F, 0.0F);
    this.Tent37 = new ModelRenderer(this, 0, 90);
    this.Tent37.addBox(-1.0F, -1.0F, -32.0F, 3, 3, 32);
    this.Tent37.setRotationPoint(57.0F, 36.0F, -276.0F);
    this.Tent37.setTextureSize(64, 32);
    this.Tent37.mirror = true;
    setRotation(this.Tent37, 0.0872665F, 0.0F, 0.0F);
    this.Jet = new ModelRenderer(this, 80, 42);
    this.Jet.addBox(-5.0F, -5.0F, -32.0F, 10, 10, 32);
    this.Jet.setRotationPoint(0.0F, -7.0F, -64.0F);
    this.Jet.setTextureSize(64, 32);
    this.Jet.mirror = true;
    setRotation(this.Jet, 0.3490659F, 0.0F, 0.0F);
    this.Tent41 = new ModelRenderer(this, 0, 162);
    this.Tent41.addBox(-4.0F, -4.0F, -32.0F, 7, 7, 32);
    this.Tent41.setRotationPoint(16.0F, -23.0F, -105.0F);
    this.Tent41.setTextureSize(64, 32);
    this.Tent41.mirror = true;
    setRotation(this.Tent41, 0.0872665F, -0.4363323F, 0.0F);
    this.Tent42 = new ModelRenderer(this, 0, 162);
    this.Tent42.addBox(-4.0F, -4.0F, -32.0F, 7, 7, 32);
    this.Tent42.setRotationPoint(28.0F, -21.0F, -132.0F);
    this.Tent42.setTextureSize(64, 32);
    this.Tent42.mirror = true;
    setRotation(this.Tent42, 0.0872665F, -0.5235988F, 0.0F);
    this.Tent43 = new ModelRenderer(this, 0, 162);
    this.Tent43.addBox(-4.0F, -4.0F, -32.0F, 7, 7, 32);
    this.Tent43.setRotationPoint(43.0F, -18.0F, -159.0F);
    this.Tent43.setTextureSize(64, 32);
    this.Tent43.mirror = true;
    setRotation(this.Tent43, 0.0872665F, -0.6108652F, 0.0F);
    this.Tent44 = new ModelRenderer(this, 0, 125);
    this.Tent44.addBox(-2.0F, -2.0F, -32.0F, 5, 5, 32);
    this.Tent44.setRotationPoint(60.0F, -16.0F, -185.0F);
    this.Tent44.setTextureSize(64, 32);
    this.Tent44.mirror = true;
    setRotation(this.Tent44, 0.0872665F, -0.4363323F, 0.0F);
    this.Tent45 = new ModelRenderer(this, 0, 125);
    this.Tent45.addBox(-2.0F, -2.0F, -32.0F, 5, 5, 32);
    this.Tent45.setRotationPoint(73.0F, -13.0F, -213.0F);
    this.Tent45.setTextureSize(64, 32);
    this.Tent45.mirror = true;
    setRotation(this.Tent45, 0.0872665F, -0.2617994F, 0.0F);
    this.Tent46 = new ModelRenderer(this, 0, 90);
    this.Tent46.addBox(-1.0F, -1.0F, -32.0F, 3, 3, 32);
    this.Tent46.setRotationPoint(81.0F, -10.0F, -242.0F);
    this.Tent46.setTextureSize(64, 32);
    this.Tent46.mirror = true;
    setRotation(this.Tent46, 0.0872665F, -0.0872665F, 0.0F);
    this.Tent47 = new ModelRenderer(this, 0, 90);
    this.Tent47.addBox(-1.0F, -1.0F, -32.0F, 3, 3, 32);
    this.Tent47.setRotationPoint(84.0F, -7.0F, -272.0F);
    this.Tent47.setTextureSize(64, 32);
    this.Tent47.mirror = true;
    setRotation(this.Tent47, 0.0872665F, 0.0872665F, 0.0F);
    this.Tent21 = new ModelRenderer(this, 0, 162);
    this.Tent21.addBox(-4.0F, -4.0F, -32.0F, 7, 7, 32);
    this.Tent21.setRotationPoint(-14.0F, -8.0F, -105.0F);
    this.Tent21.setTextureSize(64, 32);
    this.Tent21.mirror = true;
    setRotation(this.Tent21, 0.2617994F, 0.2617994F, 0.0F);
    this.Tent11 = new ModelRenderer(this, 0, 162);
    this.Tent11.addBox(-4.0F, -4.0F, -32.0F, 7, 7, 32);
    this.Tent11.setRotationPoint(-14.0F, -23.0F, -105.0F);
    this.Tent11.setTextureSize(64, 32);
    this.Tent11.mirror = true;
    setRotation(this.Tent11, 0.0872665F, 0.4363323F, 0.0F);
    this.Tent12 = new ModelRenderer(this, 0, 162);
    this.Tent12.addBox(-4.0F, -4.0F, -32.0F, 7, 7, 32);
    this.Tent12.setRotationPoint(-26.0F, -20.0F, -132.0F);
    this.Tent12.setTextureSize(64, 32);
    this.Tent12.mirror = true;
    setRotation(this.Tent12, 0.0872665F, 0.3490659F, 0.0F);
    this.Tent13 = new ModelRenderer(this, 0, 162);
    this.Tent13.addBox(-4.0F, -4.0F, -32.0F, 7, 7, 32);
    this.Tent13.setRotationPoint(-36.0F, -17.0F, -160.0F);
    this.Tent13.setTextureSize(64, 32);
    this.Tent13.mirror = true;
    setRotation(this.Tent13, 0.0872665F, 0.2617994F, 0.0F);
    this.Tent14 = new ModelRenderer(this, 0, 125);
    this.Tent14.addBox(-2.0F, -2.0F, -32.0F, 5, 5, 32);
    this.Tent14.setRotationPoint(-44.0F, -15.0F, -188.0F);
    this.Tent14.setTextureSize(64, 32);
    this.Tent14.mirror = true;
    setRotation(this.Tent14, 0.0872665F, 0.4363323F, 0.0F);
    this.Tent15 = new ModelRenderer(this, 0, 125);
    this.Tent15.addBox(-2.0F, -2.0F, -32.0F, 5, 5, 32);
    this.Tent15.setRotationPoint(-57.0F, -12.0F, -217.0F);
    this.Tent15.setTextureSize(64, 32);
    this.Tent15.mirror = true;
    setRotation(this.Tent15, 0.0872665F, 0.2617994F, 0.0F);
    this.Tent16 = new ModelRenderer(this, 0, 90);
    this.Tent16.addBox(-1.0F, -1.0F, -32.0F, 3, 3, 32);
    this.Tent16.setRotationPoint(-65.0F, -9.0F, -246.0F);
    this.Tent16.setTextureSize(64, 32);
    this.Tent16.mirror = true;
    setRotation(this.Tent16, 0.0872665F, 0.0872665F, 0.0F);
    this.Tent31 = new ModelRenderer(this, 0, 162);
    this.Tent31.addBox(-4.0F, -4.0F, -32.0F, 7, 7, 32);
    this.Tent31.setRotationPoint(16.0F, -8.0F, -105.0F);
    this.Tent31.setTextureSize(64, 32);
    this.Tent31.mirror = true;
    setRotation(this.Tent31, 0.2617994F, -0.2617994F, 0.0F);
    this.Tent18 = new ModelRenderer(this, 0, 57);
    this.Tent18.addBox(-1.0F, -1.0F, -32.0F, 1, 1, 32);
    this.Tent18.setRotationPoint(-62.0F, -3.0F, -307.0F);
    this.Tent18.setTextureSize(64, 32);
    this.Tent18.mirror = true;
    setRotation(this.Tent18, 0.0872665F, -0.1745329F, 0.0F);
    this.Tooth2 = new ModelRenderer(this, 0, 0);
    this.Tooth2.addBox(0.0F, 0.0F, -8.0F, 1, 1, 8);
    this.Tooth2.setRotationPoint(-3.0F, -6.0F, -117.0F);
    this.Tooth2.setTextureSize(64, 32);
    this.Tooth2.mirror = true;
    setRotation(this.Tooth2, -0.3490659F, 0.0F, 0.0F);
    this.Tooth3 = new ModelRenderer(this, 0, 0);
    this.Tooth3.addBox(0.0F, 0.0F, -8.0F, 1, 1, 8);
    this.Tooth3.setRotationPoint(-1.0F, -6.0F, -117.0F);
    this.Tooth3.setTextureSize(64, 32);
    this.Tooth3.mirror = true;
    setRotation(this.Tooth3, -0.3490659F, 0.0F, 0.0F);
    this.Tooth4 = new ModelRenderer(this, 0, 0);
    this.Tooth4.addBox(0.0F, 0.0F, -8.0F, 1, 1, 8);
    this.Tooth4.setRotationPoint(1.0F, -6.0F, -117.0F);
    this.Tooth4.setTextureSize(64, 32);
    this.Tooth4.mirror = true;
    setRotation(this.Tooth4, -0.3490659F, 0.0F, 0.0F);
    this.Tooth5 = new ModelRenderer(this, 0, 0);
    this.Tooth5.addBox(0.0F, 0.0F, -8.0F, 1, 1, 8);
    this.Tooth5.setRotationPoint(3.0F, -6.0F, -117.0F);
    this.Tooth5.setTextureSize(64, 32);
    this.Tooth5.mirror = true;
    setRotation(this.Tooth5, -0.3490659F, 0.0F, 0.0F);
    this.Tooth6 = new ModelRenderer(this, 0, 0);
    this.Tooth6.addBox(0.0F, 0.0F, -8.0F, 1, 1, 8);
    this.Tooth6.setRotationPoint(5.0F, -6.0F, -117.0F);
    this.Tooth6.setTextureSize(64, 32);
    this.Tooth6.mirror = true;
    setRotation(this.Tooth6, -0.3490659F, 0.0F, 0.0F);
    this.Tooth7 = new ModelRenderer(this, 0, 0);
    this.Tooth7.addBox(0.0F, 0.0F, -8.0F, 1, 1, 8);
    this.Tooth7.setRotationPoint(9.0F, -7.0F, -118.0F);
    this.Tooth7.setTextureSize(64, 32);
    this.Tooth7.mirror = true;
    setRotation(this.Tooth7, -0.3490659F, 0.1745329F, 0.0F);
    this.Tooth8 = new ModelRenderer(this, 0, 0);
    this.Tooth8.addBox(0.0F, 0.0F, -8.0F, 1, 1, 8);
    this.Tooth8.setRotationPoint(10.0F, -9.0F, -119.0F);
    this.Tooth8.setTextureSize(64, 32);
    this.Tooth8.mirror = true;
    setRotation(this.Tooth8, -0.3490659F, 0.1745329F, 0.0F);
    this.Tooth9 = new ModelRenderer(this, 0, 0);
    this.Tooth9.addBox(0.0F, 0.0F, -8.0F, 1, 1, 8);
    this.Tooth9.setRotationPoint(12.0F, -10.0F, -118.0F);
    this.Tooth9.setTextureSize(64, 32);
    this.Tooth9.mirror = true;
    setRotation(this.Tooth9, -0.3490659F, 0.1745329F, 0.0F);
    this.Tooth10 = new ModelRenderer(this, 0, 0);
    this.Tooth10.addBox(0.0F, 0.0F, -8.0F, 1, 1, 8);
    this.Tooth10.setRotationPoint(14.0F, -11.0F, -118.0F);
    this.Tooth10.setTextureSize(64, 32);
    this.Tooth10.mirror = true;
    setRotation(this.Tooth10, -0.3490659F, 0.1745329F, 0.0F);
    this.Tooth11 = new ModelRenderer(this, 0, 0);
    this.Tooth11.addBox(0.0F, 0.0F, -8.0F, 1, 1, 8);
    this.Tooth11.setRotationPoint(15.0F, -16.0F, -120.0F);
    this.Tooth11.setTextureSize(64, 32);
    this.Tooth11.mirror = true;
    setRotation(this.Tooth11, 0.0F, 0.3490659F, 0.0F);
    this.Tooth12 = new ModelRenderer(this, 0, 0);
    this.Tooth12.addBox(0.0F, 0.0F, -8.0F, 1, 1, 8);
    this.Tooth12.setRotationPoint(15.0F, -18.0F, -120.0F);
    this.Tooth12.setTextureSize(64, 32);
    this.Tooth12.mirror = true;
    setRotation(this.Tooth12, 0.0F, 0.3490659F, 0.0F);
    this.Tooth13 = new ModelRenderer(this, 0, 0);
    this.Tooth13.addBox(0.0F, 0.0F, -8.0F, 1, 1, 8);
    this.Tooth13.setRotationPoint(15.0F, -20.0F, -120.0F);
    this.Tooth13.setTextureSize(64, 32);
    this.Tooth13.mirror = true;
    setRotation(this.Tooth13, 0.0F, 0.3490659F, 0.0F);
    this.Tooth14 = new ModelRenderer(this, 0, 0);
    this.Tooth14.addBox(0.0F, 0.0F, -8.0F, 1, 1, 8);
    this.Tooth14.setRotationPoint(15.0F, -22.0F, -120.0F);
    this.Tooth14.setTextureSize(64, 32);
    this.Tooth14.mirror = true;
    setRotation(this.Tooth14, 0.0F, 0.3490659F, 0.0F);
    this.Tooth15 = new ModelRenderer(this, 0, 0);
    this.Tooth15.addBox(0.0F, 0.0F, -8.0F, 1, 1, 8);
    this.Tooth15.setRotationPoint(15.0F, -24.0F, -120.0F);
    this.Tooth15.setTextureSize(64, 32);
    this.Tooth15.mirror = true;
    setRotation(this.Tooth15, 0.0F, 0.3490659F, 0.0F);
    this.Tooth16 = new ModelRenderer(this, 0, 0);
    this.Tooth16.addBox(0.0F, 0.0F, -8.0F, 1, 1, 8);
    this.Tooth16.setRotationPoint(15.0F, -26.0F, -120.0F);
    this.Tooth16.setTextureSize(64, 32);
    this.Tooth16.mirror = true;
    setRotation(this.Tooth16, 0.0F, 0.3490659F, 0.0F);
    this.Tooth17 = new ModelRenderer(this, 0, 0);
    this.Tooth17.addBox(0.0F, 0.0F, -8.0F, 1, 1, 8);
    this.Tooth17.setRotationPoint(15.0F, -28.0F, -120.0F);
    this.Tooth17.setTextureSize(64, 32);
    this.Tooth17.mirror = true;
    setRotation(this.Tooth17, 0.0F, 0.3490659F, 0.0F);
    this.Tooth18 = new ModelRenderer(this, 0, 0);
    this.Tooth18.addBox(0.0F, 0.0F, -8.0F, 1, 1, 8);
    this.Tooth18.setRotationPoint(13.0F, -31.0F, -122.0F);
    this.Tooth18.setTextureSize(64, 32);
    this.Tooth18.mirror = true;
    setRotation(this.Tooth18, 0.1745329F, 0.3490659F, 0.0F);
    this.Tooth19 = new ModelRenderer(this, 0, 0);
    this.Tooth19.addBox(-1.0F, 0.0F, -8.0F, 1, 1, 8);
    this.Tooth19.setRotationPoint(11.0F, -33.0F, -122.0F);
    this.Tooth19.setTextureSize(64, 32);
    this.Tooth19.mirror = true;
    setRotation(this.Tooth19, 0.1745329F, 0.3490659F, 0.0F);
    this.Tooth20 = new ModelRenderer(this, 0, 0);
    this.Tooth20.addBox(-1.0F, 0.0F, -8.0F, 1, 1, 8);
    this.Tooth20.setRotationPoint(9.0F, -35.0F, -122.0F);
    this.Tooth20.setTextureSize(64, 32);
    this.Tooth20.mirror = true;
    setRotation(this.Tooth20, 0.1745329F, 0.3490659F, 0.0F);
    this.Tooth21 = new ModelRenderer(this, 0, 0);
    this.Tooth21.addBox(-1.0F, 0.0F, -8.0F, 1, 1, 8);
    this.Tooth21.setRotationPoint(9.0F, -35.0F, -122.0F);
    this.Tooth21.setTextureSize(64, 32);
    this.Tooth21.mirror = true;
    setRotation(this.Tooth21, 0.1745329F, 0.3490659F, 0.0F);
    this.Tooth22 = new ModelRenderer(this, 0, 0);
    this.Tooth22.addBox(-1.0F, 0.0F, -8.0F, 1, 1, 8);
    this.Tooth22.setRotationPoint(5.0F, -37.0F, -122.0F);
    this.Tooth22.setTextureSize(64, 32);
    this.Tooth22.mirror = true;
    setRotation(this.Tooth22, 0.3490659F, 0.0F, 0.0F);
    this.Tooth23 = new ModelRenderer(this, 0, 0);
    this.Tooth23.addBox(-1.0F, 0.0F, -8.0F, 1, 1, 8);
    this.Tooth23.setRotationPoint(3.0F, -37.0F, -122.0F);
    this.Tooth23.setTextureSize(64, 32);
    this.Tooth23.mirror = true;
    setRotation(this.Tooth23, 0.3490659F, 0.0F, 0.0F);
    this.Tooth24 = new ModelRenderer(this, 0, 0);
    this.Tooth24.addBox(-1.0F, 0.0F, -8.0F, 1, 1, 8);
    this.Tooth24.setRotationPoint(1.0F, -37.0F, -122.0F);
    this.Tooth24.setTextureSize(64, 32);
    this.Tooth24.mirror = true;
    setRotation(this.Tooth24, 0.3490659F, 0.0F, 0.0F);
    this.Tooth25 = new ModelRenderer(this, 0, 0);
    this.Tooth25.addBox(-1.0F, 0.0F, -8.0F, 1, 1, 8);
    this.Tooth25.setRotationPoint(-1.0F, -37.0F, -122.0F);
    this.Tooth25.setTextureSize(64, 32);
    this.Tooth25.mirror = true;
    setRotation(this.Tooth25, 0.3490659F, 0.0F, 0.0F);
    this.Tooth26 = new ModelRenderer(this, 0, 0);
    this.Tooth26.addBox(-1.0F, 0.0F, -8.0F, 1, 1, 8);
    this.Tooth26.setRotationPoint(-3.0F, -37.0F, -122.0F);
    this.Tooth26.setTextureSize(64, 32);
    this.Tooth26.mirror = true;
    setRotation(this.Tooth26, 0.3490659F, 0.0F, 0.0F);
    this.Tooth27 = new ModelRenderer(this, 0, 0);
    this.Tooth27.addBox(-1.0F, 0.0F, -8.0F, 1, 1, 8);
    this.Tooth27.setRotationPoint(-5.0F, -37.0F, -122.0F);
    this.Tooth27.setTextureSize(64, 32);
    this.Tooth27.mirror = true;
    setRotation(this.Tooth27, 0.3490659F, 0.0F, 0.0F);
    this.Tooth28 = new ModelRenderer(this, 0, 0);
    this.Tooth28.addBox(-1.0F, 0.0F, -8.0F, 1, 1, 8);
    this.Tooth28.setRotationPoint(-8.0F, -36.0F, -122.0F);
    this.Tooth28.setTextureSize(64, 32);
    this.Tooth28.mirror = true;
    setRotation(this.Tooth28, 0.3490659F, -0.1745329F, 0.0F);
    this.Tooth29 = new ModelRenderer(this, 0, 0);
    this.Tooth29.addBox(0.0F, 0.0F, -8.0F, 1, 1, 8);
    this.Tooth29.setRotationPoint(-11.0F, -34.0F, -122.0F);
    this.Tooth29.setTextureSize(64, 32);
    this.Tooth29.mirror = true;
    setRotation(this.Tooth29, 0.3490659F, -0.1745329F, 0.0F);
    this.Tooth30 = new ModelRenderer(this, 0, 0);
    this.Tooth30.addBox(0.0F, 0.0F, -8.0F, 1, 1, 8);
    this.Tooth30.setRotationPoint(-13.0F, -32.0F, -122.0F);
    this.Tooth30.setTextureSize(64, 32);
    this.Tooth30.mirror = true;
    setRotation(this.Tooth30, 0.3490659F, -0.1745329F, 0.0F);
    this.Tooth31 = new ModelRenderer(this, 0, 0);
    this.Tooth31.addBox(0.0F, 0.0F, -8.0F, 1, 1, 8);
    this.Tooth31.setRotationPoint(-14.0F, -30.0F, -122.0F);
    this.Tooth31.setTextureSize(64, 32);
    this.Tooth31.mirror = true;
    setRotation(this.Tooth31, 0.3490659F, -0.1745329F, 0.0F);
    this.Tooth32 = new ModelRenderer(this, 0, 0);
    this.Tooth32.addBox(0.0F, 0.0F, -8.0F, 1, 1, 8);
    this.Tooth32.setRotationPoint(-16.0F, -26.0F, -122.0F);
    this.Tooth32.setTextureSize(64, 32);
    this.Tooth32.mirror = true;
    setRotation(this.Tooth32, 0.0F, -0.3490659F, 0.0F);
    this.Tooth33 = new ModelRenderer(this, 0, 0);
    this.Tooth33.addBox(0.0F, 0.0F, -8.0F, 1, 1, 8);
    this.Tooth33.setRotationPoint(-16.0F, -24.0F, -122.0F);
    this.Tooth33.setTextureSize(64, 32);
    this.Tooth33.mirror = true;
    setRotation(this.Tooth33, 0.0F, -0.3490659F, 0.0F);
    this.Tooth34 = new ModelRenderer(this, 0, 0);
    this.Tooth34.addBox(0.0F, 0.0F, -8.0F, 1, 1, 8);
    this.Tooth34.setRotationPoint(-16.0F, -22.0F, -122.0F);
    this.Tooth34.setTextureSize(64, 32);
    this.Tooth34.mirror = true;
    setRotation(this.Tooth34, 0.0F, -0.3490659F, 0.0F);
    this.Tooth35 = new ModelRenderer(this, 0, 0);
    this.Tooth35.addBox(0.0F, 0.0F, -8.0F, 1, 1, 8);
    this.Tooth35.setRotationPoint(-16.0F, -20.0F, -122.0F);
    this.Tooth35.setTextureSize(64, 32);
    this.Tooth35.mirror = true;
    setRotation(this.Tooth35, 0.0F, -0.3490659F, 0.0F);
    this.Tooth36 = new ModelRenderer(this, 0, 0);
    this.Tooth36.addBox(0.0F, 0.0F, -8.0F, 1, 1, 8);
    this.Tooth36.setRotationPoint(-16.0F, -18.0F, -122.0F);
    this.Tooth36.setTextureSize(64, 32);
    this.Tooth36.mirror = true;
    setRotation(this.Tooth36, 0.0F, -0.3490659F, 0.0F);
    this.Tooth37 = new ModelRenderer(this, 0, 0);
    this.Tooth37.addBox(0.0F, 0.0F, -8.0F, 1, 1, 8);
    this.Tooth37.setRotationPoint(-16.0F, -16.0F, -122.0F);
    this.Tooth37.setTextureSize(64, 32);
    this.Tooth37.mirror = true;
    setRotation(this.Tooth37, 0.0F, -0.3490659F, 0.0F);
    this.Tooth38 = new ModelRenderer(this, 0, 0);
    this.Tooth38.addBox(0.0F, 0.0F, -8.0F, 1, 1, 8);
    this.Tooth38.setRotationPoint(-15.0F, -12.0F, -120.0F);
    this.Tooth38.setTextureSize(64, 32);
    this.Tooth38.mirror = true;
    setRotation(this.Tooth38, -0.1745329F, -0.3490659F, 0.0F);
    this.Tooth39 = new ModelRenderer(this, 0, 0);
    this.Tooth39.addBox(0.0F, 0.0F, -8.0F, 1, 1, 8);
    this.Tooth39.setRotationPoint(-13.0F, -10.0F, -120.0F);
    this.Tooth39.setTextureSize(64, 32);
    this.Tooth39.mirror = true;
    setRotation(this.Tooth39, -0.1745329F, -0.3490659F, 0.0F);
    this.Tooth40 = new ModelRenderer(this, 0, 0);
    this.Tooth40.addBox(0.0F, 0.0F, -8.0F, 1, 1, 8);
    this.Tooth40.setRotationPoint(-11.0F, -8.0F, -120.0F);
    this.Tooth40.setTextureSize(64, 32);
    this.Tooth40.mirror = true;
    setRotation(this.Tooth40, -0.1745329F, -0.3490659F, 0.0F);
    this.Tooth41 = new ModelRenderer(this, 0, 0);
    this.Tooth41.addBox(0.0F, 0.0F, -8.0F, 1, 1, 8);
    this.Tooth41.setRotationPoint(-9.0F, -7.0F, -119.0F);
    this.Tooth41.setTextureSize(64, 32);
    this.Tooth41.mirror = true;
    setRotation(this.Tooth41, -0.1745329F, -0.3490659F, 0.0F);
    this.Tent17 = new ModelRenderer(this, 0, 90);
    this.Tent17.addBox(-1.0F, -1.0F, -32.0F, 3, 3, 32);
    this.Tent17.setRotationPoint(-68.0F, -6.0F, -277.0F);
    this.Tent17.setTextureSize(64, 32);
    this.Tent17.mirror = true;
    setRotation(this.Tent17, 0.0872665F, -0.1745329F, 0.0F);
    this.Lefteye.rotationPointZ += 90.0F;
    this.Backbody.rotationPointZ += 90.0F;
    this.Centerbody.rotationPointZ += 90.0F;
    this.Head.rotationPointZ += 90.0F;
    this.Sucktioncupleft.rotationPointZ += 90.0F;
    this.Finright.rotationPointZ += 90.0F;
    this.Tailbase1.rotationPointZ += 90.0F;
    this.Tail2.rotationPointZ += 90.0F;
    this.Tailtip.rotationPointZ += 90.0F;
    this.Finleft.rotationPointZ += 90.0F;
    this.Frontbody.rotationPointZ += 90.0F;
    this.Mouth1.rotationPointZ += 90.0F;
    this.Tent54.rotationPointZ += 90.0F;
    this.Tent62.rotationPointZ += 90.0F;
    this.Tent63.rotationPointZ += 90.0F;
    this.Tent64.rotationPointZ += 90.0F;
    this.Tent58.rotationPointZ += 90.0F;
    this.Tent66.rotationPointZ += 90.0F;
    this.Tent67.rotationPointZ += 90.0F;
    this.Tent68.rotationPointZ += 90.0F;
    this.Tent28.rotationPointZ += 90.0F;
    this.Tent51.rotationPointZ += 90.0F;
    this.Tent52.rotationPointZ += 90.0F;
    this.Tent53.rotationPointZ += 90.0F;
    this.Tent65.rotationPointZ += 90.0F;
    this.Tent55.rotationPointZ += 90.0F;
    this.Tent56.rotationPointZ += 90.0F;
    this.Tent57.rotationPointZ += 90.0F;
    this.Sucktioncupright.rotationPointZ += 90.0F;
    this.Righteye.rotationPointZ += 90.0F;
    this.Mouth2.rotationPointZ += 90.0F;
    this.Mouth3.rotationPointZ += 90.0F;
    this.Mouth4.rotationPointZ += 90.0F;
    this.Mouth5.rotationPointZ += 90.0F;
    this.Mouth6.rotationPointZ += 90.0F;
    this.Mouth7.rotationPointZ += 90.0F;
    this.Mouth8.rotationPointZ += 90.0F;
    this.Tent61.rotationPointZ += 90.0F;
    this.Tent38.rotationPointZ += 90.0F;
    this.Tent22.rotationPointZ += 90.0F;
    this.Tent23.rotationPointZ += 90.0F;
    this.Tent24.rotationPointZ += 90.0F;
    this.Tent25.rotationPointZ += 90.0F;
    this.Tent26.rotationPointZ += 90.0F;
    this.Tent27.rotationPointZ += 90.0F;
    this.Tooth1.rotationPointZ += 90.0F;
    this.Tent48.rotationPointZ += 90.0F;
    this.Tent32.rotationPointZ += 90.0F;
    this.Tent33.rotationPointZ += 90.0F;
    this.Tent34.rotationPointZ += 90.0F;
    this.Tent35.rotationPointZ += 90.0F;
    this.Tent36.rotationPointZ += 90.0F;
    this.Tent37.rotationPointZ += 90.0F;
    this.Jet.rotationPointZ += 90.0F;
    this.Tent41.rotationPointZ += 90.0F;
    this.Tent42.rotationPointZ += 90.0F;
    this.Tent43.rotationPointZ += 90.0F;
    this.Tent44.rotationPointZ += 90.0F;
    this.Tent45.rotationPointZ += 90.0F;
    this.Tent46.rotationPointZ += 90.0F;
    this.Tent47.rotationPointZ += 90.0F;
    this.Tent21.rotationPointZ += 90.0F;
    this.Tent11.rotationPointZ += 90.0F;
    this.Tent12.rotationPointZ += 90.0F;
    this.Tent13.rotationPointZ += 90.0F;
    this.Tent14.rotationPointZ += 90.0F;
    this.Tent15.rotationPointZ += 90.0F;
    this.Tent16.rotationPointZ += 90.0F;
    this.Tent31.rotationPointZ += 90.0F;
    this.Tent18.rotationPointZ += 90.0F;
    this.Tooth2.rotationPointZ += 90.0F;
    this.Tooth3.rotationPointZ += 90.0F;
    this.Tooth4.rotationPointZ += 90.0F;
    this.Tooth5.rotationPointZ += 90.0F;
    this.Tooth6.rotationPointZ += 90.0F;
    this.Tooth7.rotationPointZ += 90.0F;
    this.Tooth8.rotationPointZ += 90.0F;
    this.Tooth9.rotationPointZ += 90.0F;
    this.Tooth10.rotationPointZ += 90.0F;
    this.Tooth11.rotationPointZ += 90.0F;
    this.Tooth12.rotationPointZ += 90.0F;
    this.Tooth13.rotationPointZ += 90.0F;
    this.Tooth14.rotationPointZ += 90.0F;
    this.Tooth15.rotationPointZ += 90.0F;
    this.Tooth16.rotationPointZ += 90.0F;
    this.Tooth17.rotationPointZ += 90.0F;
    this.Tooth18.rotationPointZ += 90.0F;
    this.Tooth19.rotationPointZ += 90.0F;
    this.Tooth20.rotationPointZ += 90.0F;
    this.Tooth21.rotationPointZ += 90.0F;
    this.Tooth22.rotationPointZ += 90.0F;
    this.Tooth23.rotationPointZ += 90.0F;
    this.Tooth24.rotationPointZ += 90.0F;
    this.Tooth25.rotationPointZ += 90.0F;
    this.Tooth26.rotationPointZ += 90.0F;
    this.Tooth27.rotationPointZ += 90.0F;
    this.Tooth28.rotationPointZ += 90.0F;
    this.Tooth29.rotationPointZ += 90.0F;
    this.Tooth30.rotationPointZ += 90.0F;
    this.Tooth31.rotationPointZ += 90.0F;
    this.Tooth32.rotationPointZ += 90.0F;
    this.Tooth33.rotationPointZ += 90.0F;
    this.Tooth34.rotationPointZ += 90.0F;
    this.Tooth35.rotationPointZ += 90.0F;
    this.Tooth36.rotationPointZ += 90.0F;
    this.Tooth37.rotationPointZ += 90.0F;
    this.Tooth38.rotationPointZ += 90.0F;
    this.Tooth39.rotationPointZ += 90.0F;
    this.Tooth40.rotationPointZ += 90.0F;
    this.Tooth41.rotationPointZ += 90.0F;
    this.Tent17.rotationPointZ += 90.0F;
    this.Lefteye.rotationPointY += 30.0F;
    this.Backbody.rotationPointY += 30.0F;
    this.Centerbody.rotationPointY += 30.0F;
    this.Head.rotationPointY += 30.0F;
    this.Sucktioncupleft.rotationPointY += 30.0F;
    this.Finright.rotationPointY += 30.0F;
    this.Tailbase1.rotationPointY += 30.0F;
    this.Tail2.rotationPointY += 30.0F;
    this.Tailtip.rotationPointY += 30.0F;
    this.Finleft.rotationPointY += 30.0F;
    this.Frontbody.rotationPointY += 30.0F;
    this.Mouth1.rotationPointY += 30.0F;
    this.Tent54.rotationPointY += 30.0F;
    this.Tent62.rotationPointY += 30.0F;
    this.Tent63.rotationPointY += 30.0F;
    this.Tent64.rotationPointY += 30.0F;
    this.Tent58.rotationPointY += 30.0F;
    this.Tent66.rotationPointY += 30.0F;
    this.Tent67.rotationPointY += 30.0F;
    this.Tent68.rotationPointY += 30.0F;
    this.Tent28.rotationPointY += 30.0F;
    this.Tent51.rotationPointY += 30.0F;
    this.Tent52.rotationPointY += 30.0F;
    this.Tent53.rotationPointY += 30.0F;
    this.Tent65.rotationPointY += 30.0F;
    this.Tent55.rotationPointY += 30.0F;
    this.Tent56.rotationPointY += 30.0F;
    this.Tent57.rotationPointY += 30.0F;
    this.Sucktioncupright.rotationPointY += 30.0F;
    this.Righteye.rotationPointY += 30.0F;
    this.Mouth2.rotationPointY += 30.0F;
    this.Mouth3.rotationPointY += 30.0F;
    this.Mouth4.rotationPointY += 30.0F;
    this.Mouth5.rotationPointY += 30.0F;
    this.Mouth6.rotationPointY += 30.0F;
    this.Mouth7.rotationPointY += 30.0F;
    this.Mouth8.rotationPointY += 30.0F;
    this.Tent61.rotationPointY += 30.0F;
    this.Tent38.rotationPointY += 30.0F;
    this.Tent22.rotationPointY += 30.0F;
    this.Tent23.rotationPointY += 30.0F;
    this.Tent24.rotationPointY += 30.0F;
    this.Tent25.rotationPointY += 30.0F;
    this.Tent26.rotationPointY += 30.0F;
    this.Tent27.rotationPointY += 30.0F;
    this.Tooth1.rotationPointY += 30.0F;
    this.Tent48.rotationPointY += 30.0F;
    this.Tent32.rotationPointY += 30.0F;
    this.Tent33.rotationPointY += 30.0F;
    this.Tent34.rotationPointY += 30.0F;
    this.Tent35.rotationPointY += 30.0F;
    this.Tent36.rotationPointY += 30.0F;
    this.Tent37.rotationPointY += 30.0F;
    this.Jet.rotationPointY += 30.0F;
    this.Tent41.rotationPointY += 30.0F;
    this.Tent42.rotationPointY += 30.0F;
    this.Tent43.rotationPointY += 30.0F;
    this.Tent44.rotationPointY += 30.0F;
    this.Tent45.rotationPointY += 30.0F;
    this.Tent46.rotationPointY += 30.0F;
    this.Tent47.rotationPointY += 30.0F;
    this.Tent21.rotationPointY += 30.0F;
    this.Tent11.rotationPointY += 30.0F;
    this.Tent12.rotationPointY += 30.0F;
    this.Tent13.rotationPointY += 30.0F;
    this.Tent14.rotationPointY += 30.0F;
    this.Tent15.rotationPointY += 30.0F;
    this.Tent16.rotationPointY += 30.0F;
    this.Tent31.rotationPointY += 30.0F;
    this.Tent18.rotationPointY += 30.0F;
    this.Tooth2.rotationPointY += 30.0F;
    this.Tooth3.rotationPointY += 30.0F;
    this.Tooth4.rotationPointY += 30.0F;
    this.Tooth5.rotationPointY += 30.0F;
    this.Tooth6.rotationPointY += 30.0F;
    this.Tooth7.rotationPointY += 30.0F;
    this.Tooth8.rotationPointY += 30.0F;
    this.Tooth9.rotationPointY += 30.0F;
    this.Tooth10.rotationPointY += 30.0F;
    this.Tooth11.rotationPointY += 30.0F;
    this.Tooth12.rotationPointY += 30.0F;
    this.Tooth13.rotationPointY += 30.0F;
    this.Tooth14.rotationPointY += 30.0F;
    this.Tooth15.rotationPointY += 30.0F;
    this.Tooth16.rotationPointY += 30.0F;
    this.Tooth17.rotationPointY += 30.0F;
    this.Tooth18.rotationPointY += 30.0F;
    this.Tooth19.rotationPointY += 30.0F;
    this.Tooth20.rotationPointY += 30.0F;
    this.Tooth21.rotationPointY += 30.0F;
    this.Tooth22.rotationPointY += 30.0F;
    this.Tooth23.rotationPointY += 30.0F;
    this.Tooth24.rotationPointY += 30.0F;
    this.Tooth25.rotationPointY += 30.0F;
    this.Tooth26.rotationPointY += 30.0F;
    this.Tooth27.rotationPointY += 30.0F;
    this.Tooth28.rotationPointY += 30.0F;
    this.Tooth29.rotationPointY += 30.0F;
    this.Tooth30.rotationPointY += 30.0F;
    this.Tooth31.rotationPointY += 30.0F;
    this.Tooth32.rotationPointY += 30.0F;
    this.Tooth33.rotationPointY += 30.0F;
    this.Tooth34.rotationPointY += 30.0F;
    this.Tooth35.rotationPointY += 30.0F;
    this.Tooth36.rotationPointY += 30.0F;
    this.Tooth37.rotationPointY += 30.0F;
    this.Tooth38.rotationPointY += 30.0F;
    this.Tooth39.rotationPointY += 30.0F;
    this.Tooth40.rotationPointY += 30.0F;
    this.Tooth41.rotationPointY += 30.0F;
    this.Tent17.rotationPointY += 30.0F;
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    Kraken e = (Kraken)entity;
    RenderInfo r = null;
    float newangle = 0.0F, nextangle = 0.0F;
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.Finright.rotateAngleZ = MathHelper.cos(f2 * 0.43F * this.wingspeed) * 3.1415927F * 0.15F;
    this.Finleft.rotateAngleZ = MathHelper.cos(f2 * 0.32F * this.wingspeed) * 3.1415927F * 0.14F;
    float pi4 = 0.39269876F;
    dangle_tentacle(f2, 5, e.getAttacking(), this.Tent51, this.Tent52, this.Tent53, this.Tent54, this.Tent55, this.Tent56, this.Tent57, this.Tent58);
    dangle_tentacle(f2, 6, e.getAttacking(), this.Tent61, this.Tent62, this.Tent63, this.Tent64, this.Tent65, this.Tent66, this.Tent67, this.Tent68);
    this.Tent58.rotationPointY += (float)Math.sin(this.Tent58.rotateAngleX) * 30.0F * (float)Math.cos(this.Tent58.rotateAngleY);
    this.Tent58.rotationPointZ -= (float)Math.cos(this.Tent58.rotateAngleX) * 30.0F * (float)Math.cos(this.Tent58.rotateAngleY);
    this.Tent58.rotationPointX -= (float)Math.sin(this.Tent58.rotateAngleY) * 30.0F * (float)Math.cos(this.Tent58.rotateAngleX);
    this.Sucktioncupleft.rotateAngleX = this.Tent58.rotateAngleX;
    this.Sucktioncupleft.rotateAngleY = this.Tent58.rotateAngleY;
    this.Tent68.rotationPointY += (float)Math.sin(this.Tent68.rotateAngleX) * 30.0F * (float)Math.cos(this.Tent68.rotateAngleY);
    this.Tent68.rotationPointZ -= (float)Math.cos(this.Tent68.rotateAngleX) * 30.0F * (float)Math.cos(this.Tent68.rotateAngleY);
    this.Tent68.rotationPointX -= (float)Math.sin(this.Tent68.rotateAngleY) * 30.0F * (float)Math.cos(this.Tent68.rotateAngleX);
    this.Sucktioncupright.rotateAngleX = this.Tent68.rotateAngleX;
    this.Sucktioncupright.rotateAngleY = this.Tent68.rotateAngleY;
    r = e.getRenderInfo();
    newangle = MathHelper.cos(f2 * 0.66F) * 3.1415927F * 0.15F;
    nextangle = MathHelper.cos((f2 + 0.1F) * 0.66F) * 3.1415927F * 0.15F;
    if (nextangle > 0.0F && newangle < 0.0F) {
      r.ri1 = 0;
      if (e.getAttacking() == 0) {
        r.ri1 = e.worldObj.rand.nextInt(10);
        r.ri2 = e.worldObj.rand.nextInt(15);
      } else {
        r.ri1 = e.worldObj.rand.nextInt(4);
        r.ri2 = e.worldObj.rand.nextInt(3);
      } 
    } 
    if (r.ri1 == 1 || r.ri1 == 3) {
      newangle = MathHelper.cos(f2 * 0.5F * this.wingspeed) * 3.1415927F * 0.015F;
    } else {
      newangle = 0.0F;
    } 
    this.Mouth1.rotateAngleX = -0.38F + newangle;
    this.Mouth1.rotateAngleY = -0.38F + newangle;
    this.Mouth2.rotateAngleX = -0.38F + newangle;
    this.Mouth2.rotateAngleY = 0.38F - newangle;
    this.Mouth3.rotateAngleX = 0.38F - newangle;
    this.Mouth3.rotateAngleY = 0.38F - newangle;
    this.Mouth5.rotateAngleX = 0.38F - newangle;
    this.Mouth5.rotateAngleY = -0.38F + newangle;
    this.Mouth4.rotateAngleX = 0.38F - newangle;
    this.Mouth6.rotateAngleY = -0.38F + newangle;
    this.Mouth7.rotateAngleY = 0.38F - newangle;
    this.Mouth8.rotateAngleX = -0.38F + newangle;
    newangle *= 7.0F;
    this.Tooth2.rotateAngleX = -0.35F - newangle;
    this.Tooth3.rotateAngleX = -0.34F - newangle;
    this.Tooth4.rotateAngleX = -0.33F - newangle;
    this.Tooth5.rotateAngleX = -0.36F - newangle;
    this.Tooth6.rotateAngleX = -0.32F - newangle;
    this.Tooth11.rotateAngleY = 0.35F + newangle;
    this.Tooth12.rotateAngleY = 0.37F + newangle;
    this.Tooth13.rotateAngleY = 0.33F + newangle;
    this.Tooth14.rotateAngleY = 0.34F + newangle;
    this.Tooth15.rotateAngleY = 0.36F + newangle;
    this.Tooth16.rotateAngleY = 0.35F + newangle;
    this.Tooth17.rotateAngleY = 0.32F + newangle;
    this.Tooth22.rotateAngleX = 0.31F + newangle;
    this.Tooth23.rotateAngleX = 0.37F + newangle;
    this.Tooth24.rotateAngleX = 0.33F + newangle;
    this.Tooth25.rotateAngleX = 0.34F + newangle;
    this.Tooth26.rotateAngleX = 0.36F + newangle;
    this.Tooth27.rotateAngleX = 0.35F + newangle;
    this.Tooth31.rotateAngleY = -0.35F - newangle;
    this.Tooth32.rotateAngleY = -0.37F - newangle;
    this.Tooth33.rotateAngleY = -0.33F - newangle;
    this.Tooth34.rotateAngleY = -0.34F - newangle;
    this.Tooth35.rotateAngleY = -0.36F - newangle;
    this.Tooth36.rotateAngleY = -0.35F - newangle;
    this.Tooth37.rotateAngleY = -0.32F - newangle;
    this.Tooth7.rotateAngleX = -0.35F - newangle;
    this.Tooth7.rotateAngleY = 0.33F + newangle;
    this.Tooth8.rotateAngleX = -0.31F - newangle;
    this.Tooth8.rotateAngleY = 0.37F + newangle;
    this.Tooth9.rotateAngleX = -0.32F - newangle;
    this.Tooth9.rotateAngleY = 0.3F + newangle;
    this.Tooth10.rotateAngleX = -0.33F - newangle;
    this.Tooth10.rotateAngleY = 0.33F + newangle;
    this.Tooth18.rotateAngleX = 0.35F + newangle;
    this.Tooth18.rotateAngleY = 0.33F + newangle;
    this.Tooth19.rotateAngleX = 0.31F + newangle;
    this.Tooth19.rotateAngleY = 0.37F + newangle;
    this.Tooth20.rotateAngleX = 0.37F + newangle;
    this.Tooth20.rotateAngleY = 0.37F + newangle;
    this.Tooth21.rotateAngleX = 0.3F + newangle;
    this.Tooth21.rotateAngleY = 0.3F + newangle;
    this.Tooth28.rotateAngleX = 0.37F + newangle;
    this.Tooth28.rotateAngleY = -0.3F - newangle;
    this.Tooth29.rotateAngleX = 0.33F + newangle;
    this.Tooth29.rotateAngleY = -0.32F - newangle;
    this.Tooth30.rotateAngleX = 0.3F + newangle;
    this.Tooth30.rotateAngleY = -0.37F - newangle;
    this.Tooth31.rotateAngleX = 0.37F + newangle;
    this.Tooth31.rotateAngleY = -0.3F - newangle;
    this.Tooth38.rotateAngleX = -0.34F - newangle;
    this.Tooth38.rotateAngleY = -0.33F - newangle;
    this.Tooth39.rotateAngleX = -0.35F - newangle;
    this.Tooth39.rotateAngleY = -0.37F - newangle;
    this.Tooth40.rotateAngleX = -0.39F - newangle;
    this.Tooth40.rotateAngleY = -0.33F - newangle;
    this.Tooth41.rotateAngleX = -0.34F - newangle;
    this.Tooth41.rotateAngleY = -0.36F - newangle;
    this.Tooth1.rotateAngleX = -0.35F - newangle;
    this.Tooth1.rotateAngleY = -0.32F - newangle;
    e.setRenderInfo(r);
    dangle_tentacle(f2, 1, 0, this.Tent11, this.Tent12, this.Tent13, this.Tent14, this.Tent15, this.Tent16, this.Tent17, this.Tent18);
    dangle_tentacle(f2, 2, 0, this.Tent21, this.Tent22, this.Tent23, this.Tent24, this.Tent25, this.Tent26, this.Tent27, this.Tent28);
    dangle_tentacle(f2, 3, 0, this.Tent31, this.Tent32, this.Tent33, this.Tent34, this.Tent35, this.Tent36, this.Tent37, this.Tent38);
    dangle_tentacle(f2, 4, 0, this.Tent41, this.Tent42, this.Tent43, this.Tent44, this.Tent45, this.Tent46, this.Tent47, this.Tent48);
    GL11.glPushMatrix();
    GL11.glTranslatef(0.0F, 0.0F, 0.0F);
    GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
    GL11.glTranslatef(0.0F, 0.0F, 0.0F);
    this.Lefteye.render(f5);
    this.Backbody.render(f5);
    this.Centerbody.render(f5);
    this.Head.render(f5);
    this.Sucktioncupleft.render(f5);
    this.Finright.render(f5);
    this.Tailbase1.render(f5);
    this.Tail2.render(f5);
    this.Tailtip.render(f5);
    this.Finleft.render(f5);
    this.Frontbody.render(f5);
    this.Mouth1.render(f5);
    this.Tent54.render(f5);
    this.Tent62.render(f5);
    this.Tent63.render(f5);
    this.Tent64.render(f5);
    this.Tent58.render(f5);
    this.Tent66.render(f5);
    this.Tent67.render(f5);
    this.Tent68.render(f5);
    this.Tent28.render(f5);
    this.Tent51.render(f5);
    this.Tent52.render(f5);
    this.Tent53.render(f5);
    this.Tent65.render(f5);
    this.Tent55.render(f5);
    this.Tent56.render(f5);
    this.Tent57.render(f5);
    this.Sucktioncupright.render(f5);
    this.Righteye.render(f5);
    this.Mouth2.render(f5);
    this.Mouth3.render(f5);
    this.Mouth4.render(f5);
    this.Mouth5.render(f5);
    this.Mouth6.render(f5);
    this.Mouth7.render(f5);
    this.Mouth8.render(f5);
    this.Tent61.render(f5);
    this.Tent38.render(f5);
    this.Tent22.render(f5);
    this.Tent23.render(f5);
    this.Tent24.render(f5);
    this.Tent25.render(f5);
    this.Tent26.render(f5);
    this.Tent27.render(f5);
    this.Tooth1.render(f5);
    this.Tent48.render(f5);
    this.Tent32.render(f5);
    this.Tent33.render(f5);
    this.Tent34.render(f5);
    this.Tent35.render(f5);
    this.Tent36.render(f5);
    this.Tent37.render(f5);
    this.Jet.render(f5);
    this.Tent41.render(f5);
    this.Tent42.render(f5);
    this.Tent43.render(f5);
    this.Tent44.render(f5);
    this.Tent45.render(f5);
    this.Tent46.render(f5);
    this.Tent47.render(f5);
    this.Tent21.render(f5);
    this.Tent11.render(f5);
    this.Tent12.render(f5);
    this.Tent13.render(f5);
    this.Tent14.render(f5);
    this.Tent15.render(f5);
    this.Tent16.render(f5);
    this.Tent31.render(f5);
    this.Tent18.render(f5);
    this.Tooth2.render(f5);
    this.Tooth3.render(f5);
    this.Tooth4.render(f5);
    this.Tooth5.render(f5);
    this.Tooth6.render(f5);
    this.Tooth7.render(f5);
    this.Tooth8.render(f5);
    this.Tooth9.render(f5);
    this.Tooth10.render(f5);
    this.Tooth11.render(f5);
    this.Tooth12.render(f5);
    this.Tooth13.render(f5);
    this.Tooth14.render(f5);
    this.Tooth15.render(f5);
    this.Tooth16.render(f5);
    this.Tooth17.render(f5);
    this.Tooth18.render(f5);
    this.Tooth19.render(f5);
    this.Tooth20.render(f5);
    this.Tooth21.render(f5);
    this.Tooth22.render(f5);
    this.Tooth23.render(f5);
    this.Tooth24.render(f5);
    this.Tooth25.render(f5);
    this.Tooth26.render(f5);
    this.Tooth27.render(f5);
    this.Tooth28.render(f5);
    this.Tooth29.render(f5);
    this.Tooth30.render(f5);
    this.Tooth31.render(f5);
    this.Tooth32.render(f5);
    this.Tooth33.render(f5);
    this.Tooth34.render(f5);
    this.Tooth35.render(f5);
    this.Tooth36.render(f5);
    this.Tooth37.render(f5);
    this.Tooth38.render(f5);
    this.Tooth39.render(f5);
    this.Tooth40.render(f5);
    this.Tooth41.render(f5);
    this.Tent17.render(f5);
    GL11.glPopMatrix();
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z) {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
    super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
  }
  
  private void dangle_tentacle(float f2, int dir, int att, ModelRenderer p1, ModelRenderer p2, ModelRenderer p3, ModelRenderer p4, ModelRenderer p5, ModelRenderer p6, ModelRenderer p7, ModelRenderer p8) {
    float pi4 = 0.314159F;
    int dist = 30;
    float differ = 0.1F;
    float xoff = 0.0F;
    float ydiffer = 0.1F;
    float yoff = 0.0F;
    float s = -1.0F;
    float amp = 0.1F;
    if (dir == 1)
      differ = 0.101F; 
    if (dir == 2)
      differ = 0.097F; 
    if (dir == 3)
      differ = 0.093F; 
    if (dir == 4)
      differ = 0.087F; 
    if (dir == 1)
      ydiffer = 0.102F; 
    if (dir == 2)
      ydiffer = 0.098F; 
    if (dir == 3)
      ydiffer = 0.092F; 
    if (dir == 4)
      ydiffer = 0.088F; 
    if (dir == 2)
      xoff = 0.26F; 
    if (dir == 3)
      xoff = 0.26F; 
    if (dir == 1)
      yoff = 0.44F; 
    if (dir == 4)
      yoff = -0.44F; 
    if (dir == 5)
      differ = 0.2F; 
    if (dir == 6)
      differ = 0.2F; 
    if (dir == 5)
      xoff = -0.25F; 
    if (dir == 6)
      xoff = -0.25F; 
    if (dir == 6)
      s = 1.0F; 
    if (att != 0) {
      if (dir == 5) {
        differ = 0.5F;
        amp = 0.03F;
        xoff = 0.0F;
      } 
      if (dir == 6) {
        differ = 0.5F;
        amp = 0.03F;
        xoff = 0.0F;
      } 
    } 
    p1.rotateAngleX = xoff + s * MathHelper.cos(f2 * differ * this.wingspeed) * 3.1415927F * amp;
    p1.rotateAngleY = yoff - MathHelper.cos(f2 * ydiffer * this.wingspeed) * 3.1415927F * amp;
    p1.rotationPointY += (float)Math.sin(p1.rotateAngleX) * dist * (float)Math.cos(p1.rotateAngleY);
    p1.rotationPointZ -= (float)Math.cos(p1.rotateAngleX) * dist * (float)Math.cos(p1.rotateAngleY);
    p1.rotationPointX -= (float)Math.sin(p1.rotateAngleY) * dist * (float)Math.cos(p1.rotateAngleX);
    p2.rotateAngleX = xoff / 2.0F + s * MathHelper.cos(f2 * differ * this.wingspeed - pi4) * 3.1415927F * amp;
    p2.rotateAngleY = yoff / 2.0F - MathHelper.cos(f2 * ydiffer * this.wingspeed - pi4) * 3.1415927F * amp;
    p2.rotationPointY += (float)Math.sin(p2.rotateAngleX) * dist * (float)Math.cos(p2.rotateAngleY);
    p2.rotationPointZ -= (float)Math.cos(p2.rotateAngleX) * dist * (float)Math.cos(p2.rotateAngleY);
    p2.rotationPointX -= (float)Math.sin(p2.rotateAngleY) * dist * (float)Math.cos(p2.rotateAngleX);
    p3.rotateAngleX = s * MathHelper.cos(f2 * differ * this.wingspeed - 2.0F * pi4) * 3.1415927F * amp;
    p3.rotateAngleY = -MathHelper.cos(f2 * ydiffer * this.wingspeed - 2.0F * pi4) * 3.1415927F * amp;
    p3.rotationPointY += (float)Math.sin(p3.rotateAngleX) * dist * (float)Math.cos(p3.rotateAngleY);
    p3.rotationPointZ -= (float)Math.cos(p3.rotateAngleX) * dist * (float)Math.cos(p3.rotateAngleY);
    p3.rotationPointX -= (float)Math.sin(p3.rotateAngleY) * dist * (float)Math.cos(p3.rotateAngleX);
    p4.rotateAngleX = s * MathHelper.cos(f2 * differ * this.wingspeed - 3.0F * pi4) * 3.1415927F * amp;
    p4.rotateAngleY = -MathHelper.cos(f2 * ydiffer * this.wingspeed - 3.0F * pi4) * 3.1415927F * amp;
    p4.rotationPointY += (float)Math.sin(p4.rotateAngleX) * dist * (float)Math.cos(p4.rotateAngleY);
    p4.rotationPointZ -= (float)Math.cos(p4.rotateAngleX) * dist * (float)Math.cos(p4.rotateAngleY);
    p4.rotationPointX -= (float)Math.sin(p4.rotateAngleY) * dist * (float)Math.cos(p4.rotateAngleX);
    p5.rotateAngleX = s * MathHelper.cos(f2 * differ * this.wingspeed - 4.0F * pi4) * 3.1415927F * amp;
    p5.rotateAngleY = -MathHelper.cos(f2 * ydiffer * this.wingspeed - 4.0F * pi4) * 3.1415927F * amp;
    p5.rotationPointY += (float)Math.sin(p5.rotateAngleX) * dist * (float)Math.cos(p5.rotateAngleY);
    p5.rotationPointZ -= (float)Math.cos(p5.rotateAngleX) * dist * (float)Math.cos(p5.rotateAngleY);
    p5.rotationPointX -= (float)Math.sin(p5.rotateAngleY) * dist * (float)Math.cos(p5.rotateAngleX);
    p6.rotateAngleX = s * MathHelper.cos(f2 * differ * this.wingspeed - 5.0F * pi4) * 3.1415927F * amp;
    p6.rotateAngleY = -MathHelper.cos(f2 * ydiffer * this.wingspeed - 5.0F * pi4) * 3.1415927F * amp;
    p6.rotationPointY += (float)Math.sin(p6.rotateAngleX) * dist * (float)Math.cos(p6.rotateAngleY);
    p6.rotationPointZ -= (float)Math.cos(p6.rotateAngleX) * dist * (float)Math.cos(p6.rotateAngleY);
    p6.rotationPointX -= (float)Math.sin(p6.rotateAngleY) * dist * (float)Math.cos(p6.rotateAngleX);
    p7.rotateAngleX = s * MathHelper.cos(f2 * differ * this.wingspeed - 6.0F * pi4) * 3.1415927F * amp;
    p7.rotateAngleY = -MathHelper.cos(f2 * ydiffer * this.wingspeed - 6.0F * pi4) * 3.1415927F * amp;
    p7.rotationPointY += (float)Math.sin(p7.rotateAngleX) * dist * (float)Math.cos(p7.rotateAngleY);
    p7.rotationPointZ -= (float)Math.cos(p7.rotateAngleX) * dist * (float)Math.cos(p7.rotateAngleY);
    p7.rotationPointX -= (float)Math.sin(p7.rotateAngleY) * dist * (float)Math.cos(p7.rotateAngleX);
    p8.rotateAngleX = s * MathHelper.cos(f2 * differ * this.wingspeed - 7.0F * pi4) * 3.1415927F * amp;
    p8.rotateAngleY = -MathHelper.cos(f2 * ydiffer * this.wingspeed - 7.0F * pi4) * 3.1415927F * amp;
  }
}
