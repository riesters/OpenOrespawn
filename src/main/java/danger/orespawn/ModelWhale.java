package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelWhale extends ModelBase {
  ModelRenderer belly;
  
  ModelRenderer body;
  
  ModelRenderer back;
  
  ModelRenderer tail1;
  
  ModelRenderer tail2;
  
  ModelRenderer tailfin1;
  
  ModelRenderer tailfin2;
  
  ModelRenderer backfin;
  
  ModelRenderer head;
  
  ModelRenderer jaw;
  
  ModelRenderer lfin1;
  
  ModelRenderer lfin2;
  
  ModelRenderer rfin1;
  
  ModelRenderer rfin2;
  
  public ModelWhale() {
    this.textureWidth = 256;
    this.textureHeight = 256;
    this.belly = new ModelRenderer(this, 0, 92);
    this.belly.addBox(-6.0F, 0.0F, 0.0F, 12, 2, 32);
    this.belly.setRotationPoint(0.0F, 22.0F, 6.0F);
    this.belly.setTextureSize(256, 256);
    this.belly.mirror = true;
    setRotation(this.belly, 0.0F, 0.0F, 0.0F);
    this.body = new ModelRenderer(this, 0, 188);
    this.body.addBox(-10.0F, 0.0F, 0.0F, 20, 12, 52);
    this.body.setRotationPoint(0.0F, 10.0F, 0.0F);
    this.body.setTextureSize(256, 256);
    this.body.mirror = true;
    setRotation(this.body, 0.0F, 0.0F, 0.0F);
    this.back = new ModelRenderer(this, 0, 45);
    this.back.addBox(-4.0F, 0.0F, 0.0F, 8, 2, 40);
    this.back.setRotationPoint(0.0F, 8.0F, 3.0F);
    this.back.setTextureSize(256, 256);
    this.back.mirror = true;
    setRotation(this.back, 0.0F, 0.0F, 0.0F);
    this.tail1 = new ModelRenderer(this, 186, 0);
    this.tail1.addBox(-6.0F, 0.0F, 0.0F, 12, 7, 14);
    this.tail1.setRotationPoint(0.0F, 11.0F, 52.0F);
    this.tail1.setTextureSize(256, 256);
    this.tail1.mirror = true;
    setRotation(this.tail1, 0.0F, 0.0F, 0.0F);
    this.tail2 = new ModelRenderer(this, 186, 24);
    this.tail2.addBox(-4.0F, 0.0F, 0.0F, 8, 5, 10);
    this.tail2.setRotationPoint(0.0F, 12.0F, 66.0F);
    this.tail2.setTextureSize(256, 256);
    this.tail2.mirror = true;
    setRotation(this.tail2, 0.0F, 0.0F, 0.0F);
    this.tailfin1 = new ModelRenderer(this, 186, 43);
    this.tailfin1.addBox(0.0F, 0.0F, 0.0F, 17, 2, 11);
    this.tailfin1.setRotationPoint(2.0F, 13.0F, 74.0F);
    this.tailfin1.setTextureSize(256, 256);
    this.tailfin1.mirror = true;
    setRotation(this.tailfin1, 0.0872665F, -0.0872665F, 0.0F);
    this.tailfin2 = new ModelRenderer(this, 186, 59);
    this.tailfin2.addBox(-17.0F, 0.0F, 0.0F, 17, 2, 11);
    this.tailfin2.setRotationPoint(-2.0F, 13.0F, 74.0F);
    this.tailfin2.setTextureSize(256, 256);
    this.tailfin2.mirror = true;
    setRotation(this.tailfin2, 0.0872665F, 0.0872665F, 0.0F);
    this.backfin = new ModelRenderer(this, 0, 15);
    this.backfin.addBox(-0.5F, 0.0F, 0.0F, 1, 4, 8);
    this.backfin.setRotationPoint(0.0F, 8.0F, 11.0F);
    this.backfin.setTextureSize(256, 256);
    this.backfin.mirror = true;
    setRotation(this.backfin, 0.3665191F, 0.0F, 0.0F);
    this.head = new ModelRenderer(this, 0, 155);
    this.head.addBox(-8.0F, 0.0F, -16.0F, 16, 8, 22);
    this.head.setRotationPoint(0.0F, 11.0F, -6.0F);
    this.head.setTextureSize(256, 256);
    this.head.mirror = true;
    setRotation(this.head, 0.0F, 0.0F, 0.0F);
    this.jaw = new ModelRenderer(this, 0, 130);
    this.jaw.addBox(-7.0F, -1.0F, -20.0F, 14, 2, 20);
    this.jaw.setRotationPoint(0.0F, 20.0F, 0.0F);
    this.jaw.setTextureSize(256, 256);
    this.jaw.mirror = true;
    setRotation(this.jaw, 0.0698132F, 0.0F, 0.0F);
    this.lfin1 = new ModelRenderer(this, 96, 0);
    this.lfin1.addBox(0.0F, -1.0F, -3.0F, 4, 3, 6);
    this.lfin1.setRotationPoint(10.0F, 18.0F, 8.0F);
    this.lfin1.setTextureSize(256, 256);
    this.lfin1.mirror = true;
    setRotation(this.lfin1, 0.0F, -0.0872665F, 0.0F);
    this.lfin2 = new ModelRenderer(this, 120, 0);
    this.lfin2.addBox(2.0F, -0.5F, -3.0F, 22, 2, 8);
    this.lfin2.setRotationPoint(10.0F, 18.0F, 8.0F);
    this.lfin2.setTextureSize(256, 256);
    this.lfin2.mirror = true;
    setRotation(this.lfin2, 0.0F, -0.0872665F, 0.0F);
    this.rfin1 = new ModelRenderer(this, 96, 12);
    this.rfin1.addBox(-4.0F, -1.0F, -3.0F, 4, 3, 6);
    this.rfin1.setRotationPoint(-10.0F, 18.0F, 8.0F);
    this.rfin1.setTextureSize(256, 256);
    this.rfin1.mirror = true;
    setRotation(this.rfin1, 0.0F, 0.0872665F, 0.0F);
    this.rfin2 = new ModelRenderer(this, 120, 13);
    this.rfin2.addBox(-24.0F, -0.5F, -3.0F, 22, 2, 8);
    this.rfin2.setRotationPoint(-10.0F, 18.0F, 8.0F);
    this.rfin2.setTextureSize(256, 256);
    this.rfin2.mirror = true;
    setRotation(this.rfin2, 0.0F, 0.0872665F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: fload_2
    //   3: fload_3
    //   4: fload #4
    //   6: fload #5
    //   8: fload #6
    //   10: fload #7
    //   12: invokespecial render : (Lnet/minecraft/entity/Entity;FFFFFF)V
    //   15: aload_0
    //   16: fload_2
    //   17: fload_3
    //   18: fload #4
    //   20: fload #5
    //   22: fload #6
    //   24: fload #7
    //   26: aload_1
    //   27: invokevirtual setRotationAngles : (FFFFFFLnet/minecraft/entity/Entity;)V
    //   30: fload #4
    //   32: ldc 0.55
    //   34: fmul
    //   35: invokestatic cos : (F)F
    //   38: ldc 3.1415927
    //   40: fmul
    //   41: ldc 0.15
    //   43: fmul
    //   44: fstore #8
    //   46: fload_3
    //   47: f2d
    //   48: ldc2_w 0.1
    //   51: dcmpl
    //   52: ifle -> 76
    //   55: fload #4
    //   57: ldc 0.3
    //   59: fmul
    //   60: invokestatic cos : (F)F
    //   63: ldc 3.1415927
    //   65: fmul
    //   66: ldc 0.2
    //   68: fmul
    //   69: fload_3
    //   70: fmul
    //   71: fstore #8
    //   73: goto -> 92
    //   76: fload #4
    //   78: ldc 0.08
    //   80: fmul
    //   81: invokestatic cos : (F)F
    //   84: ldc 3.1415927
    //   86: fmul
    //   87: ldc 0.05
    //   89: fmul
    //   90: fstore #8
    //   92: aload_0
    //   93: getfield lfin2 : Lnet/minecraft/client/model/ModelRenderer;
    //   96: ldc 0.436
    //   98: fload #8
    //   100: fadd
    //   101: putfield rotateAngleZ : F
    //   104: aload_0
    //   105: getfield lfin1 : Lnet/minecraft/client/model/ModelRenderer;
    //   108: aload_0
    //   109: getfield lfin2 : Lnet/minecraft/client/model/ModelRenderer;
    //   112: getfield rotateAngleZ : F
    //   115: fconst_2
    //   116: fdiv
    //   117: putfield rotateAngleZ : F
    //   120: aload_0
    //   121: getfield rfin2 : Lnet/minecraft/client/model/ModelRenderer;
    //   124: ldc -0.436
    //   126: fload #8
    //   128: fsub
    //   129: putfield rotateAngleZ : F
    //   132: aload_0
    //   133: getfield rfin1 : Lnet/minecraft/client/model/ModelRenderer;
    //   136: aload_0
    //   137: getfield rfin2 : Lnet/minecraft/client/model/ModelRenderer;
    //   140: getfield rotateAngleZ : F
    //   143: fconst_2
    //   144: fdiv
    //   145: putfield rotateAngleZ : F
    //   148: fload #4
    //   150: ldc 0.03
    //   152: fmul
    //   153: invokestatic cos : (F)F
    //   156: ldc 3.1415927
    //   158: fmul
    //   159: ldc 0.02
    //   161: fmul
    //   162: fstore #8
    //   164: aload_0
    //   165: getfield jaw : Lnet/minecraft/client/model/ModelRenderer;
    //   168: ldc 0.087
    //   170: fload #8
    //   172: fadd
    //   173: putfield rotateAngleX : F
    //   176: fload_3
    //   177: f2d
    //   178: ldc2_w 0.1
    //   181: dcmpl
    //   182: ifle -> 206
    //   185: fload #4
    //   187: ldc 0.4
    //   189: fmul
    //   190: invokestatic cos : (F)F
    //   193: ldc 3.1415927
    //   195: fmul
    //   196: ldc 0.16
    //   198: fmul
    //   199: fload_3
    //   200: fmul
    //   201: fstore #8
    //   203: goto -> 222
    //   206: fload #4
    //   208: ldc 0.05
    //   210: fmul
    //   211: invokestatic cos : (F)F
    //   214: ldc 3.1415927
    //   216: fmul
    //   217: ldc 0.03
    //   219: fmul
    //   220: fstore #8
    //   222: aload_0
    //   223: getfield tail1 : Lnet/minecraft/client/model/ModelRenderer;
    //   226: fload #8
    //   228: ldc 0.5
    //   230: fmul
    //   231: putfield rotateAngleX : F
    //   234: aload_0
    //   235: getfield tail2 : Lnet/minecraft/client/model/ModelRenderer;
    //   238: fload #8
    //   240: ldc 1.25
    //   242: fmul
    //   243: putfield rotateAngleX : F
    //   246: aload_0
    //   247: getfield tailfin1 : Lnet/minecraft/client/model/ModelRenderer;
    //   250: aload_0
    //   251: getfield tailfin2 : Lnet/minecraft/client/model/ModelRenderer;
    //   254: fload #8
    //   256: ldc 2.25
    //   258: fmul
    //   259: dup_x1
    //   260: putfield rotateAngleX : F
    //   263: putfield rotateAngleX : F
    //   266: aload_0
    //   267: getfield tail2 : Lnet/minecraft/client/model/ModelRenderer;
    //   270: aload_0
    //   271: getfield tail1 : Lnet/minecraft/client/model/ModelRenderer;
    //   274: getfield rotationPointZ : F
    //   277: aload_0
    //   278: getfield tail1 : Lnet/minecraft/client/model/ModelRenderer;
    //   281: getfield rotateAngleX : F
    //   284: f2d
    //   285: invokestatic cos : (D)D
    //   288: d2f
    //   289: ldc 14.0
    //   291: fmul
    //   292: fadd
    //   293: putfield rotationPointZ : F
    //   296: aload_0
    //   297: getfield tail2 : Lnet/minecraft/client/model/ModelRenderer;
    //   300: aload_0
    //   301: getfield tail1 : Lnet/minecraft/client/model/ModelRenderer;
    //   304: getfield rotationPointY : F
    //   307: aload_0
    //   308: getfield tail1 : Lnet/minecraft/client/model/ModelRenderer;
    //   311: getfield rotateAngleX : F
    //   314: f2d
    //   315: invokestatic sin : (D)D
    //   318: d2f
    //   319: ldc 14.0
    //   321: fmul
    //   322: fsub
    //   323: putfield rotationPointY : F
    //   326: aload_0
    //   327: getfield tailfin1 : Lnet/minecraft/client/model/ModelRenderer;
    //   330: aload_0
    //   331: getfield tailfin2 : Lnet/minecraft/client/model/ModelRenderer;
    //   334: aload_0
    //   335: getfield tail2 : Lnet/minecraft/client/model/ModelRenderer;
    //   338: getfield rotationPointZ : F
    //   341: aload_0
    //   342: getfield tail2 : Lnet/minecraft/client/model/ModelRenderer;
    //   345: getfield rotateAngleX : F
    //   348: f2d
    //   349: invokestatic cos : (D)D
    //   352: d2f
    //   353: ldc 8.0
    //   355: fmul
    //   356: fadd
    //   357: dup_x1
    //   358: putfield rotationPointZ : F
    //   361: putfield rotationPointZ : F
    //   364: aload_0
    //   365: getfield tailfin1 : Lnet/minecraft/client/model/ModelRenderer;
    //   368: aload_0
    //   369: getfield tailfin2 : Lnet/minecraft/client/model/ModelRenderer;
    //   372: aload_0
    //   373: getfield tail2 : Lnet/minecraft/client/model/ModelRenderer;
    //   376: getfield rotationPointY : F
    //   379: aload_0
    //   380: getfield tail2 : Lnet/minecraft/client/model/ModelRenderer;
    //   383: getfield rotateAngleX : F
    //   386: f2d
    //   387: invokestatic sin : (D)D
    //   390: d2f
    //   391: ldc 8.0
    //   393: fmul
    //   394: fsub
    //   395: dup_x1
    //   396: putfield rotationPointY : F
    //   399: putfield rotationPointY : F
    //   402: aload_0
    //   403: getfield belly : Lnet/minecraft/client/model/ModelRenderer;
    //   406: fload #7
    //   408: invokevirtual render : (F)V
    //   411: aload_0
    //   412: getfield body : Lnet/minecraft/client/model/ModelRenderer;
    //   415: fload #7
    //   417: invokevirtual render : (F)V
    //   420: aload_0
    //   421: getfield back : Lnet/minecraft/client/model/ModelRenderer;
    //   424: fload #7
    //   426: invokevirtual render : (F)V
    //   429: aload_0
    //   430: getfield tail1 : Lnet/minecraft/client/model/ModelRenderer;
    //   433: fload #7
    //   435: invokevirtual render : (F)V
    //   438: aload_0
    //   439: getfield tail2 : Lnet/minecraft/client/model/ModelRenderer;
    //   442: fload #7
    //   444: invokevirtual render : (F)V
    //   447: aload_0
    //   448: getfield tailfin1 : Lnet/minecraft/client/model/ModelRenderer;
    //   451: fload #7
    //   453: invokevirtual render : (F)V
    //   456: aload_0
    //   457: getfield tailfin2 : Lnet/minecraft/client/model/ModelRenderer;
    //   460: fload #7
    //   462: invokevirtual render : (F)V
    //   465: aload_0
    //   466: getfield backfin : Lnet/minecraft/client/model/ModelRenderer;
    //   469: fload #7
    //   471: invokevirtual render : (F)V
    //   474: aload_0
    //   475: getfield head : Lnet/minecraft/client/model/ModelRenderer;
    //   478: fload #7
    //   480: invokevirtual render : (F)V
    //   483: aload_0
    //   484: getfield jaw : Lnet/minecraft/client/model/ModelRenderer;
    //   487: fload #7
    //   489: invokevirtual render : (F)V
    //   492: aload_0
    //   493: getfield lfin1 : Lnet/minecraft/client/model/ModelRenderer;
    //   496: fload #7
    //   498: invokevirtual render : (F)V
    //   501: aload_0
    //   502: getfield lfin2 : Lnet/minecraft/client/model/ModelRenderer;
    //   505: fload #7
    //   507: invokevirtual render : (F)V
    //   510: aload_0
    //   511: getfield rfin1 : Lnet/minecraft/client/model/ModelRenderer;
    //   514: fload #7
    //   516: invokevirtual render : (F)V
    //   519: aload_0
    //   520: getfield rfin2 : Lnet/minecraft/client/model/ModelRenderer;
    //   523: fload #7
    //   525: invokevirtual render : (F)V
    //   528: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #124	-> 0
    //   #125	-> 15
    //   #127	-> 30
    //   #129	-> 46
    //   #130	-> 55
    //   #132	-> 76
    //   #135	-> 92
    //   #136	-> 104
    //   #137	-> 120
    //   #138	-> 132
    //   #140	-> 148
    //   #141	-> 164
    //   #144	-> 176
    //   #145	-> 185
    //   #147	-> 206
    //   #149	-> 222
    //   #150	-> 234
    //   #151	-> 246
    //   #152	-> 266
    //   #153	-> 296
    //   #154	-> 326
    //   #155	-> 364
    //   #157	-> 402
    //   #158	-> 411
    //   #159	-> 420
    //   #160	-> 429
    //   #161	-> 438
    //   #162	-> 447
    //   #163	-> 456
    //   #164	-> 465
    //   #165	-> 474
    //   #166	-> 483
    //   #167	-> 492
    //   #168	-> 501
    //   #169	-> 510
    //   #170	-> 519
    //   #171	-> 528
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	529	0	this	Ldanger/orespawn/ModelWhale;
    //   0	529	1	entity	Lnet/minecraft/entity/Entity;
    //   0	529	2	f	F
    //   0	529	3	f1	F
    //   0	529	4	f2	F
    //   0	529	5	f3	F
    //   0	529	6	f4	F
    //   0	529	7	f5	F
    //   46	483	8	newangle	F
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
