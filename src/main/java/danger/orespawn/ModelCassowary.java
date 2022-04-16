package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCassowary extends ModelBase {
  private float wingspeed = 1.0F;
  
  ModelRenderer tail;
  
  ModelRenderer body;
  
  ModelRenderer neck1;
  
  ModelRenderer neck;
  
  ModelRenderer head;
  
  ModelRenderer beak;
  
  ModelRenderer leg1;
  
  ModelRenderer leg2;
  
  ModelRenderer crest;
  
  ModelRenderer foot1;
  
  ModelRenderer foot2;
  
  ModelRenderer gobbler;
  
  public ModelCassowary(float f1) {
    this.wingspeed = f1;
    this.textureWidth = 64;
    this.textureHeight = 32;
    this.tail = new ModelRenderer(this, 38, 16);
    this.tail.addBox(-3.0F, 0.0F, 0.0F, 6, 9, 7);
    this.tail.setRotationPoint(0.0F, 8.0F, 1.0F);
    this.tail.setTextureSize(64, 32);
    this.tail.mirror = true;
    setRotation(this.tail, 0.8922867F, 0.0F, 0.0F);
    this.body = new ModelRenderer(this, 0, 13);
    this.body.addBox(-4.0F, 0.0F, 0.0F, 8, 10, 9);
    this.body.setRotationPoint(0.0F, 5.0F, -3.0F);
    this.body.setTextureSize(64, 32);
    this.body.mirror = true;
    setRotation(this.body, 0.3346075F, 0.0F, 0.0F);
    this.neck1 = new ModelRenderer(this, 48, 0);
    this.neck1.addBox(-2.0F, 0.0F, 0.0F, 4, 5, 4);
    this.neck1.setRotationPoint(0.0F, 4.0F, -1.0F);
    this.neck1.setTextureSize(64, 32);
    this.neck1.mirror = true;
    setRotation(this.neck1, -1.189716F, 0.0F, 0.0F);
    this.neck = new ModelRenderer(this, 38, 0);
    this.neck.addBox(-1.0F, 0.0F, 0.0F, 2, 7, 2);
    this.neck.setRotationPoint(0.0F, 8.0F, -3.0F);
    this.neck.setTextureSize(64, 32);
    this.neck.mirror = true;
    setRotation(this.neck, -2.806985F, 0.0F, 0.0F);
    this.head = new ModelRenderer(this, 24, 0);
    this.head.addBox(-1.0F, -2.0F, -3.0F, 2, 2, 4);
    this.head.setRotationPoint(0.0F, 2.0F, -6.0F);
    this.head.setTextureSize(64, 32);
    this.head.mirror = true;
    setRotation(this.head, 0.0371786F, 0.0F, 0.0F);
    this.beak = new ModelRenderer(this, 28, 7);
    this.beak.addBox(-0.5F, 0.0F, 3.0F, 1, 1, 3);
    this.beak.setRotationPoint(0.0F, 2.0F, -6.0F);
    this.beak.setTextureSize(64, 32);
    this.beak.mirror = true;
    setRotation(this.beak, -3.104414F, 0.0F, 0.0F);
    this.leg1 = new ModelRenderer(this, 0, 0);
    this.leg1.addBox(-0.5F, 0.0F, -1.0F, 1, 11, 2);
    this.leg1.setRotationPoint(3.0F, 12.0F, 3.0F);
    this.leg1.setTextureSize(64, 32);
    this.leg1.mirror = true;
    setRotation(this.leg1, 0.0F, 0.0F, 0.0F);
    this.leg2 = new ModelRenderer(this, 0, 0);
    this.leg2.addBox(-0.5F, 0.0F, -1.0F, 1, 11, 2);
    this.leg2.setRotationPoint(-3.0F, 12.0F, 3.0F);
    this.leg2.setTextureSize(64, 32);
    this.leg2.mirror = true;
    setRotation(this.leg2, 0.0F, 0.0F, 0.0F);
    this.crest = new ModelRenderer(this, 10, 0);
    this.crest.addBox(-0.5F, -4.0F, 1.0F, 1, 4, 5);
    this.crest.setRotationPoint(0.0F, 2.0F, -6.0F);
    this.crest.setTextureSize(64, 32);
    this.crest.mirror = true;
    setRotation(this.crest, 1.710216F, 0.0F, 0.0F);
    this.foot1 = new ModelRenderer(this, 47, 10);
    this.foot1.addBox(-1.033333F, 11.0F, -2.0F, 2, 1, 3);
    this.foot1.setRotationPoint(-3.0F, 12.0F, 3.0F);
    this.foot1.setTextureSize(64, 32);
    this.foot1.mirror = true;
    setRotation(this.foot1, 0.0F, 0.0F, 0.0F);
    this.foot2 = new ModelRenderer(this, 47, 10);
    this.foot2.addBox(-1.0F, 11.0F, -2.0F, 2, 1, 3);
    this.foot2.setRotationPoint(3.0F, 12.0F, 3.0F);
    this.foot2.setTextureSize(64, 32);
    this.foot2.mirror = true;
    setRotation(this.foot2, 0.0F, 0.0F, 0.0F);
    this.gobbler = new ModelRenderer(this, 38, 10);
    this.gobbler.addBox(-0.5F, -1.0F, -2.5F, 1, 5, 1);
    this.gobbler.setRotationPoint(0.0F, 8.0F, -3.0F);
    this.gobbler.setTextureSize(64, 32);
    this.gobbler.mirror = true;
    setRotation(this.gobbler, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    // Byte code:
    //   0: aload_1
    //   1: checkcast danger/orespawn/Cassowary
    //   4: astore #8
    //   6: aload_0
    //   7: aload_1
    //   8: fload_2
    //   9: fload_3
    //   10: fload #4
    //   12: fload #5
    //   14: fload #6
    //   16: fload #7
    //   18: invokespecial render : (Lnet/minecraft/entity/Entity;FFFFFF)V
    //   21: aload_0
    //   22: fload_2
    //   23: fload_3
    //   24: fload #4
    //   26: fload #5
    //   28: fload #6
    //   30: fload #7
    //   32: aload_1
    //   33: invokevirtual setRotationAngles : (FFFFFFLnet/minecraft/entity/Entity;)V
    //   36: fconst_0
    //   37: fstore #9
    //   39: fconst_0
    //   40: fstore #10
    //   42: fload_3
    //   43: f2d
    //   44: ldc2_w 0.1
    //   47: dcmpl
    //   48: ifle -> 100
    //   51: fload #4
    //   53: ldc 1.3
    //   55: fmul
    //   56: aload_0
    //   57: getfield wingspeed : F
    //   60: fmul
    //   61: invokestatic cos : (F)F
    //   64: ldc 3.1415927
    //   66: fmul
    //   67: ldc 0.15
    //   69: fmul
    //   70: fload_3
    //   71: fmul
    //   72: fstore #9
    //   74: fload #4
    //   76: ldc 2.6
    //   78: fmul
    //   79: aload_0
    //   80: getfield wingspeed : F
    //   83: fmul
    //   84: invokestatic cos : (F)F
    //   87: ldc 3.1415927
    //   89: fmul
    //   90: ldc 0.1
    //   92: fmul
    //   93: fload_3
    //   94: fmul
    //   95: fstore #10
    //   97: goto -> 106
    //   100: fconst_0
    //   101: dup
    //   102: fstore #10
    //   104: fstore #9
    //   106: aload_0
    //   107: getfield leg1 : Lnet/minecraft/client/model/ModelRenderer;
    //   110: aload_0
    //   111: getfield foot2 : Lnet/minecraft/client/model/ModelRenderer;
    //   114: fload #9
    //   116: dup_x1
    //   117: putfield rotateAngleX : F
    //   120: putfield rotateAngleX : F
    //   123: aload_0
    //   124: getfield leg2 : Lnet/minecraft/client/model/ModelRenderer;
    //   127: aload_0
    //   128: getfield foot1 : Lnet/minecraft/client/model/ModelRenderer;
    //   131: fload #9
    //   133: fneg
    //   134: dup_x1
    //   135: putfield rotateAngleX : F
    //   138: putfield rotateAngleX : F
    //   141: aload_0
    //   142: getfield neck : Lnet/minecraft/client/model/ModelRenderer;
    //   145: ldc -2.827
    //   147: fload #10
    //   149: fadd
    //   150: putfield rotateAngleX : F
    //   153: aload_0
    //   154: getfield gobbler : Lnet/minecraft/client/model/ModelRenderer;
    //   157: fload #10
    //   159: putfield rotateAngleX : F
    //   162: aload_0
    //   163: getfield head : Lnet/minecraft/client/model/ModelRenderer;
    //   166: aload_0
    //   167: getfield crest : Lnet/minecraft/client/model/ModelRenderer;
    //   170: aload_0
    //   171: getfield beak : Lnet/minecraft/client/model/ModelRenderer;
    //   174: aload_0
    //   175: getfield neck : Lnet/minecraft/client/model/ModelRenderer;
    //   178: getfield rotationPointZ : F
    //   181: aload_0
    //   182: getfield neck : Lnet/minecraft/client/model/ModelRenderer;
    //   185: getfield rotateAngleX : F
    //   188: invokestatic sin : (F)F
    //   191: ldc 7.0
    //   193: fmul
    //   194: fadd
    //   195: dup_x1
    //   196: putfield rotationPointZ : F
    //   199: dup_x1
    //   200: putfield rotationPointZ : F
    //   203: putfield rotationPointZ : F
    //   206: aload_0
    //   207: getfield head : Lnet/minecraft/client/model/ModelRenderer;
    //   210: aload_0
    //   211: getfield crest : Lnet/minecraft/client/model/ModelRenderer;
    //   214: aload_0
    //   215: getfield beak : Lnet/minecraft/client/model/ModelRenderer;
    //   218: aload_0
    //   219: getfield neck : Lnet/minecraft/client/model/ModelRenderer;
    //   222: getfield rotationPointY : F
    //   225: aload_0
    //   226: getfield neck : Lnet/minecraft/client/model/ModelRenderer;
    //   229: getfield rotateAngleX : F
    //   232: invokestatic cos : (F)F
    //   235: ldc 7.0
    //   237: fmul
    //   238: fadd
    //   239: dup_x1
    //   240: putfield rotationPointY : F
    //   243: dup_x1
    //   244: putfield rotationPointY : F
    //   247: putfield rotationPointY : F
    //   250: aload_0
    //   251: getfield tail : Lnet/minecraft/client/model/ModelRenderer;
    //   254: fload #7
    //   256: invokevirtual render : (F)V
    //   259: aload_0
    //   260: getfield body : Lnet/minecraft/client/model/ModelRenderer;
    //   263: fload #7
    //   265: invokevirtual render : (F)V
    //   268: aload_0
    //   269: getfield neck1 : Lnet/minecraft/client/model/ModelRenderer;
    //   272: fload #7
    //   274: invokevirtual render : (F)V
    //   277: aload_0
    //   278: getfield neck : Lnet/minecraft/client/model/ModelRenderer;
    //   281: fload #7
    //   283: invokevirtual render : (F)V
    //   286: aload_0
    //   287: getfield head : Lnet/minecraft/client/model/ModelRenderer;
    //   290: fload #7
    //   292: invokevirtual render : (F)V
    //   295: aload_0
    //   296: getfield beak : Lnet/minecraft/client/model/ModelRenderer;
    //   299: fload #7
    //   301: invokevirtual render : (F)V
    //   304: aload_0
    //   305: getfield leg1 : Lnet/minecraft/client/model/ModelRenderer;
    //   308: fload #7
    //   310: invokevirtual render : (F)V
    //   313: aload_0
    //   314: getfield leg2 : Lnet/minecraft/client/model/ModelRenderer;
    //   317: fload #7
    //   319: invokevirtual render : (F)V
    //   322: aload_0
    //   323: getfield crest : Lnet/minecraft/client/model/ModelRenderer;
    //   326: fload #7
    //   328: invokevirtual render : (F)V
    //   331: aload_0
    //   332: getfield foot1 : Lnet/minecraft/client/model/ModelRenderer;
    //   335: fload #7
    //   337: invokevirtual render : (F)V
    //   340: aload_0
    //   341: getfield foot2 : Lnet/minecraft/client/model/ModelRenderer;
    //   344: fload #7
    //   346: invokevirtual render : (F)V
    //   349: aload_0
    //   350: getfield gobbler : Lnet/minecraft/client/model/ModelRenderer;
    //   353: fload #7
    //   355: invokevirtual render : (F)V
    //   358: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #109	-> 0
    //   #110	-> 6
    //   #111	-> 21
    //   #113	-> 36
    //   #114	-> 39
    //   #116	-> 42
    //   #117	-> 51
    //   #118	-> 74
    //   #120	-> 100
    //   #123	-> 106
    //   #124	-> 123
    //   #126	-> 141
    //   #127	-> 153
    //   #129	-> 162
    //   #130	-> 206
    //   #132	-> 250
    //   #133	-> 259
    //   #134	-> 268
    //   #135	-> 277
    //   #136	-> 286
    //   #137	-> 295
    //   #138	-> 304
    //   #139	-> 313
    //   #140	-> 322
    //   #141	-> 331
    //   #142	-> 340
    //   #143	-> 349
    //   #145	-> 358
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	359	0	this	Ldanger/orespawn/ModelCassowary;
    //   0	359	1	entity	Lnet/minecraft/entity/Entity;
    //   0	359	2	f	F
    //   0	359	3	f1	F
    //   0	359	4	f2	F
    //   0	359	5	f3	F
    //   0	359	6	f4	F
    //   0	359	7	f5	F
    //   6	353	8	e	Ldanger/orespawn/Cassowary;
    //   39	320	9	newangle	F
    //   42	317	10	newangle2	F
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z) {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
    super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
  }
}
