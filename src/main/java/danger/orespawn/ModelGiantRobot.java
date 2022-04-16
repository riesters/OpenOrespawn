package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelGiantRobot extends ModelBase {
  private float wingspeed = 1.0F;
  
  private float hipy = 0.0F;
  
  ModelRenderer Hip;
  
  ModelRenderer Thigh;
  
  ModelRenderer Shin;
  
  ModelRenderer Foot1;
  
  ModelRenderer Foot2;
  
  ModelRenderer Foot3;
  
  ModelRenderer Thigh2;
  
  ModelRenderer Thigh3;
  
  ModelRenderer Back1;
  
  ModelRenderer Back2;
  
  ModelRenderer Back3;
  
  ModelRenderer Shoulders;
  
  ModelRenderer Neck;
  
  ModelRenderer Head;
  
  ModelRenderer Arm1;
  
  ModelRenderer Arm2;
  
  ModelRenderer Arm3;
  
  ModelRenderer Knuckles;
  
  public ModelGiantRobot(float f1) {
    this.wingspeed = f1;
    this.textureWidth = 256;
    this.textureHeight = 512;
    this.Hip = new ModelRenderer(this, 0, 0);
    this.Hip.addBox(-4.0F, -4.0F, -15.0F, 8, 8, 30);
    this.Hip.setRotationPoint(0.0F, -60.0F, 0.0F);
    this.Hip.setTextureSize(64, 32);
    this.Hip.mirror = true;
    setRotation(this.Hip, 0.0F, 0.0F, 0.0F);
    this.Thigh = new ModelRenderer(this, 0, 115);
    this.Thigh.addBox(-3.0F, -3.0F, -3.0F, 6, 43, 6);
    this.Thigh.setRotationPoint(0.0F, -58.0F, 0.0F);
    this.Thigh.setTextureSize(64, 32);
    this.Thigh.mirror = true;
    setRotation(this.Thigh, 0.0F, 0.0F, 0.0F);
    this.Shin = new ModelRenderer(this, 0, 167);
    this.Shin.addBox(-3.0F, -3.0F, -3.0F, 6, 43, 6);
    this.Shin.setRotationPoint(0.0F, -18.0F, 0.0F);
    this.Shin.setTextureSize(64, 32);
    this.Shin.mirror = true;
    setRotation(this.Shin, 0.0F, 0.0F, 0.0F);
    this.Foot1 = new ModelRenderer(this, 0, 282);
    this.Foot1.addBox(-7.0F, 38.0F, -11.0F, 14, 4, 17);
    this.Foot1.setRotationPoint(0.0F, -18.0F, 0.0F);
    this.Foot1.setTextureSize(64, 32);
    this.Foot1.mirror = true;
    setRotation(this.Foot1, 0.0F, 0.0F, 0.0F);
    this.Foot2 = new ModelRenderer(this, 0, 246);
    this.Foot2.addBox(-6.0F, 19.0F, -8.0F, 12, 19, 13);
    this.Foot2.setRotationPoint(0.0F, -18.0F, 0.0F);
    this.Foot2.setTextureSize(64, 32);
    this.Foot2.mirror = true;
    setRotation(this.Foot2, 0.0F, 0.0F, 0.0F);
    this.Foot3 = new ModelRenderer(this, 0, 219);
    this.Foot3.addBox(-5.0F, 5.0F, -5.0F, 10, 14, 9);
    this.Foot3.setRotationPoint(0.0F, -18.0F, 0.0F);
    this.Foot3.setTextureSize(64, 32);
    this.Foot3.mirror = true;
    setRotation(this.Foot3, 0.0F, 0.0F, 0.0F);
    this.Thigh2 = new ModelRenderer(this, 0, 43);
    this.Thigh2.addBox(-7.0F, -8.0F, -7.0F, 14, 24, 14);
    this.Thigh2.setRotationPoint(0.0F, -58.0F, 0.0F);
    this.Thigh2.setTextureSize(64, 32);
    this.Thigh2.mirror = true;
    setRotation(this.Thigh2, 0.0F, 0.0F, 0.0F);
    this.Thigh3 = new ModelRenderer(this, 0, 84);
    this.Thigh3.addBox(-5.0F, 16.0F, -5.0F, 10, 17, 10);
    this.Thigh3.setRotationPoint(0.0F, -58.0F, 0.0F);
    this.Thigh3.setTextureSize(64, 32);
    this.Thigh3.mirror = true;
    setRotation(this.Thigh3, 0.0F, 0.0F, 0.0F);
    this.Back1 = new ModelRenderer(this, 125, 138);
    this.Back1.addBox(-4.0F, -20.0F, -4.0F, 8, 24, 8);
    this.Back1.setRotationPoint(0.0F, -60.0F, 0.0F);
    this.Back1.setTextureSize(64, 32);
    this.Back1.mirror = true;
    setRotation(this.Back1, 0.0F, 0.0F, 0.0F);
    this.Back2 = new ModelRenderer(this, 125, 95);
    this.Back2.addBox(-13.0F, -42.0F, -10.0F, 26, 24, 16);
    this.Back2.setRotationPoint(0.0F, -60.0F, 0.0F);
    this.Back2.setTextureSize(64, 32);
    this.Back2.mirror = true;
    setRotation(this.Back2, 0.0F, 0.0F, 0.0F);
    this.Back3 = new ModelRenderer(this, 125, 43);
    this.Back3.addBox(-17.0F, -68.0F, -13.0F, 34, 26, 20);
    this.Back3.setRotationPoint(0.0F, -60.0F, 0.0F);
    this.Back3.setTextureSize(64, 32);
    this.Back3.mirror = true;
    setRotation(this.Back3, 0.0F, 0.0F, 0.0F);
    this.Shoulders = new ModelRenderer(this, 60, 200);
    this.Shoulders.addBox(-22.0F, -64.0F, -4.0F, 44, 8, 8);
    this.Shoulders.setRotationPoint(0.0F, -60.0F, 0.0F);
    this.Shoulders.setTextureSize(64, 32);
    this.Shoulders.mirror = true;
    setRotation(this.Shoulders, 0.0F, 0.0F, 0.0F);
    this.Neck = new ModelRenderer(this, 125, 29);
    this.Neck.addBox(-4.0F, -70.0F, -4.0F, 8, 2, 8);
    this.Neck.setRotationPoint(0.0F, -60.0F, 0.0F);
    this.Neck.setTextureSize(64, 32);
    this.Neck.mirror = true;
    setRotation(this.Neck, 0.0F, 0.0F, 0.0F);
    this.Head = new ModelRenderer(this, 127, 0);
    this.Head.addBox(-7.0F, -82.0F, -7.0F, 14, 12, 14);
    this.Head.setRotationPoint(0.0F, -60.0F, 0.0F);
    this.Head.setTextureSize(64, 32);
    this.Head.mirror = true;
    setRotation(this.Head, 0.0F, 0.0F, 0.0F);
    this.Arm1 = new ModelRenderer(this, 77, 250);
    this.Arm1.addBox(-6.0F, -6.0F, -6.0F, 12, 21, 12);
    this.Arm1.setRotationPoint(28.0F, -120.0F, 0.0F);
    this.Arm1.setTextureSize(64, 32);
    this.Arm1.mirror = true;
    setRotation(this.Arm1, 0.0F, 0.0F, 0.0F);
    this.Arm2 = new ModelRenderer(this, 73, 300);
    this.Arm2.addBox(-4.0F, 15.0F, -4.0F, 8, 24, 8);
    this.Arm2.setRotationPoint(28.0F, -120.0F, 0.0F);
    this.Arm2.setTextureSize(64, 32);
    this.Arm2.mirror = true;
    setRotation(this.Arm2, 0.0F, 0.0F, 0.0F);
    this.Arm3 = new ModelRenderer(this, 61, 350);
    this.Arm3.addBox(-3.0F, -3.0F, -3.0F, 6, 33, 6);
    this.Arm3.setRotationPoint(28.0F, -81.0F, 0.0F);
    this.Arm3.setTextureSize(64, 32);
    this.Arm3.mirror = true;
    setRotation(this.Arm3, 0.0F, 0.0F, 0.0F);
    this.Knuckles = new ModelRenderer(this, 56, 400);
    this.Knuckles.addBox(-7.0F, 30.0F, -5.0F, 14, 12, 10);
    this.Knuckles.setRotationPoint(28.0F, -81.0F, 0.0F);
    this.Knuckles.setTextureSize(256, 512);
    this.Knuckles.mirror = true;
    setRotation(this.Knuckles, 0.0F, 0.0F, 0.0F);
    this.hipy = this.Hip.rotationPointY;
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    // Byte code:
    //   0: aload_1
    //   1: checkcast danger/orespawn/GiantRobot
    //   4: astore #8
    //   6: aconst_null
    //   7: astore #9
    //   9: aload_0
    //   10: aload_1
    //   11: fload_2
    //   12: fload_3
    //   13: fload #4
    //   15: fload #5
    //   17: fload #6
    //   19: fload #7
    //   21: invokespecial render : (Lnet/minecraft/entity/Entity;FFFFFF)V
    //   24: aload_0
    //   25: fload_2
    //   26: fload_3
    //   27: fload #4
    //   29: fload #5
    //   31: fload #6
    //   33: fload #7
    //   35: aload_1
    //   36: invokevirtual setRotationAngles : (FFFFFFLnet/minecraft/entity/Entity;)V
    //   39: aload #8
    //   41: invokevirtual getRenderGiantRobotInfo : ()Ldanger/orespawn/RenderGiantRobotInfo;
    //   44: astore #9
    //   46: fload_3
    //   47: ldc 0.65
    //   49: fmul
    //   50: fstore #11
    //   52: fload #11
    //   54: fconst_1
    //   55: fcmpl
    //   56: ifle -> 62
    //   59: fconst_1
    //   60: fstore #11
    //   62: aload #9
    //   64: fload #4
    //   66: fneg
    //   67: aload_0
    //   68: getfield wingspeed : F
    //   71: fmul
    //   72: f2d
    //   73: invokestatic cos : (D)D
    //   76: ldc2_w 3.141592653589793
    //   79: dmul
    //   80: ldc2_w 0.10000000149011612
    //   83: dmul
    //   84: fload #11
    //   86: f2d
    //   87: dmul
    //   88: d2f
    //   89: putfield hipxdisplayangle : F
    //   92: aload #9
    //   94: fload #4
    //   96: fneg
    //   97: aload_0
    //   98: getfield wingspeed : F
    //   101: fmul
    //   102: f2d
    //   103: invokestatic sin : (D)D
    //   106: ldc2_w 3.141592653589793
    //   109: dmul
    //   110: ldc2_w 0.10000000149011612
    //   113: dmul
    //   114: fload #11
    //   116: f2d
    //   117: dmul
    //   118: d2f
    //   119: putfield hipydisplayangle : F
    //   122: aload #9
    //   124: getfield thighdisplayangle : [F
    //   127: iconst_0
    //   128: fload #4
    //   130: fneg
    //   131: aload_0
    //   132: getfield wingspeed : F
    //   135: fmul
    //   136: f2d
    //   137: ldc2_w 1.5707963267948966
    //   140: dadd
    //   141: invokestatic cos : (D)D
    //   144: ldc2_w 3.141592653589793
    //   147: dmul
    //   148: ldc2_w 0.15000000596046448
    //   151: dmul
    //   152: fload #11
    //   154: f2d
    //   155: dmul
    //   156: d2f
    //   157: ldc2_w 0.19634954084936207
    //   160: fload #11
    //   162: f2d
    //   163: dmul
    //   164: d2f
    //   165: fsub
    //   166: fastore
    //   167: aload #9
    //   169: getfield thighdisplayangle : [F
    //   172: iconst_1
    //   173: fload #4
    //   175: fneg
    //   176: aload_0
    //   177: getfield wingspeed : F
    //   180: fmul
    //   181: f2d
    //   182: ldc2_w 3.141592653589793
    //   185: dadd
    //   186: ldc2_w 1.5707963267948966
    //   189: dadd
    //   190: invokestatic cos : (D)D
    //   193: ldc2_w 3.141592653589793
    //   196: dmul
    //   197: ldc2_w 0.15000000596046448
    //   200: dmul
    //   201: fload #11
    //   203: f2d
    //   204: dmul
    //   205: d2f
    //   206: ldc2_w 0.19634954084936207
    //   209: fload #11
    //   211: f2d
    //   212: dmul
    //   213: d2f
    //   214: fsub
    //   215: fastore
    //   216: aload #9
    //   218: getfield shindisplayangle : [F
    //   221: iconst_0
    //   222: fload #4
    //   224: fneg
    //   225: aload_0
    //   226: getfield wingspeed : F
    //   229: fmul
    //   230: f2d
    //   231: ldc2_w 3.141592653589793
    //   234: dadd
    //   235: invokestatic cos : (D)D
    //   238: ldc2_w 3.141592653589793
    //   241: dmul
    //   242: ldc2_w 0.20000000298023224
    //   245: dmul
    //   246: fload #11
    //   248: f2d
    //   249: dmul
    //   250: d2f
    //   251: f2d
    //   252: ldc2_w 0.6283185400806344
    //   255: fload #11
    //   257: f2d
    //   258: dmul
    //   259: dadd
    //   260: d2f
    //   261: fastore
    //   262: aload #9
    //   264: getfield shindisplayangle : [F
    //   267: iconst_1
    //   268: fload #4
    //   270: fneg
    //   271: aload_0
    //   272: getfield wingspeed : F
    //   275: fmul
    //   276: f2d
    //   277: invokestatic cos : (D)D
    //   280: ldc2_w 3.141592653589793
    //   283: dmul
    //   284: ldc2_w 0.20000000298023224
    //   287: dmul
    //   288: fload #11
    //   290: f2d
    //   291: dmul
    //   292: d2f
    //   293: f2d
    //   294: ldc2_w 0.6283185400806344
    //   297: fload #11
    //   299: f2d
    //   300: dmul
    //   301: dadd
    //   302: d2f
    //   303: fastore
    //   304: fload #4
    //   306: fneg
    //   307: aload_0
    //   308: getfield wingspeed : F
    //   311: fmul
    //   312: fconst_2
    //   313: fmul
    //   314: f2d
    //   315: invokestatic cos : (D)D
    //   318: fload #11
    //   320: f2d
    //   321: dmul
    //   322: d2f
    //   323: fstore #10
    //   325: aload_0
    //   326: getfield Hip : Lnet/minecraft/client/model/ModelRenderer;
    //   329: aload_0
    //   330: getfield hipy : F
    //   333: fload #10
    //   335: ldc 4.0
    //   337: fmul
    //   338: fadd
    //   339: putfield rotationPointY : F
    //   342: aload_0
    //   343: getfield Hip : Lnet/minecraft/client/model/ModelRenderer;
    //   346: aload #9
    //   348: getfield hipxdisplayangle : F
    //   351: putfield rotateAngleX : F
    //   354: aload_0
    //   355: getfield Hip : Lnet/minecraft/client/model/ModelRenderer;
    //   358: aload #9
    //   360: getfield hipydisplayangle : F
    //   363: f2d
    //   364: ldc2_w 1.5707963267948966
    //   367: dadd
    //   368: d2f
    //   369: putfield rotateAngleY : F
    //   372: aload_0
    //   373: getfield Hip : Lnet/minecraft/client/model/ModelRenderer;
    //   376: fload #7
    //   378: invokevirtual render : (F)V
    //   381: aload_0
    //   382: getfield Thigh : Lnet/minecraft/client/model/ModelRenderer;
    //   385: aload_0
    //   386: getfield Thigh2 : Lnet/minecraft/client/model/ModelRenderer;
    //   389: aload_0
    //   390: getfield Thigh3 : Lnet/minecraft/client/model/ModelRenderer;
    //   393: aload #9
    //   395: getfield thighdisplayangle : [F
    //   398: iconst_0
    //   399: faload
    //   400: dup_x1
    //   401: putfield rotateAngleX : F
    //   404: dup_x1
    //   405: putfield rotateAngleX : F
    //   408: putfield rotateAngleX : F
    //   411: aload_0
    //   412: getfield Thigh : Lnet/minecraft/client/model/ModelRenderer;
    //   415: aload_0
    //   416: getfield Thigh2 : Lnet/minecraft/client/model/ModelRenderer;
    //   419: aload_0
    //   420: getfield Thigh3 : Lnet/minecraft/client/model/ModelRenderer;
    //   423: aload_0
    //   424: getfield Hip : Lnet/minecraft/client/model/ModelRenderer;
    //   427: getfield rotationPointY : F
    //   430: aload_0
    //   431: getfield Hip : Lnet/minecraft/client/model/ModelRenderer;
    //   434: getfield rotateAngleX : F
    //   437: f2d
    //   438: invokestatic sin : (D)D
    //   441: d2f
    //   442: ldc 13.0
    //   444: fmul
    //   445: fsub
    //   446: dup_x1
    //   447: putfield rotationPointY : F
    //   450: dup_x1
    //   451: putfield rotationPointY : F
    //   454: putfield rotationPointY : F
    //   457: aload_0
    //   458: getfield Thigh : Lnet/minecraft/client/model/ModelRenderer;
    //   461: aload_0
    //   462: getfield Thigh2 : Lnet/minecraft/client/model/ModelRenderer;
    //   465: aload_0
    //   466: getfield Thigh3 : Lnet/minecraft/client/model/ModelRenderer;
    //   469: aload_0
    //   470: getfield Hip : Lnet/minecraft/client/model/ModelRenderer;
    //   473: getfield rotationPointZ : F
    //   476: aload_0
    //   477: getfield Hip : Lnet/minecraft/client/model/ModelRenderer;
    //   480: getfield rotateAngleX : F
    //   483: f2d
    //   484: invokestatic cos : (D)D
    //   487: d2f
    //   488: aload_0
    //   489: getfield Hip : Lnet/minecraft/client/model/ModelRenderer;
    //   492: getfield rotateAngleY : F
    //   495: f2d
    //   496: invokestatic cos : (D)D
    //   499: d2f
    //   500: fmul
    //   501: ldc 13.0
    //   503: fmul
    //   504: fadd
    //   505: dup_x1
    //   506: putfield rotationPointZ : F
    //   509: dup_x1
    //   510: putfield rotationPointZ : F
    //   513: putfield rotationPointZ : F
    //   516: aload_0
    //   517: getfield Thigh : Lnet/minecraft/client/model/ModelRenderer;
    //   520: aload_0
    //   521: getfield Thigh2 : Lnet/minecraft/client/model/ModelRenderer;
    //   524: aload_0
    //   525: getfield Thigh3 : Lnet/minecraft/client/model/ModelRenderer;
    //   528: aload_0
    //   529: getfield Hip : Lnet/minecraft/client/model/ModelRenderer;
    //   532: getfield rotationPointX : F
    //   535: aload_0
    //   536: getfield Hip : Lnet/minecraft/client/model/ModelRenderer;
    //   539: getfield rotateAngleX : F
    //   542: f2d
    //   543: invokestatic cos : (D)D
    //   546: d2f
    //   547: aload_0
    //   548: getfield Hip : Lnet/minecraft/client/model/ModelRenderer;
    //   551: getfield rotateAngleY : F
    //   554: f2d
    //   555: invokestatic sin : (D)D
    //   558: d2f
    //   559: fmul
    //   560: ldc 13.0
    //   562: fmul
    //   563: fadd
    //   564: dup_x1
    //   565: putfield rotationPointX : F
    //   568: dup_x1
    //   569: putfield rotationPointX : F
    //   572: putfield rotationPointX : F
    //   575: aload_0
    //   576: getfield Thigh : Lnet/minecraft/client/model/ModelRenderer;
    //   579: fload #7
    //   581: invokevirtual render : (F)V
    //   584: aload_0
    //   585: getfield Thigh2 : Lnet/minecraft/client/model/ModelRenderer;
    //   588: fload #7
    //   590: invokevirtual render : (F)V
    //   593: aload_0
    //   594: getfield Thigh3 : Lnet/minecraft/client/model/ModelRenderer;
    //   597: fload #7
    //   599: invokevirtual render : (F)V
    //   602: aload_0
    //   603: getfield Shin : Lnet/minecraft/client/model/ModelRenderer;
    //   606: aload #9
    //   608: getfield shindisplayangle : [F
    //   611: iconst_0
    //   612: faload
    //   613: putfield rotateAngleX : F
    //   616: aload_0
    //   617: getfield Shin : Lnet/minecraft/client/model/ModelRenderer;
    //   620: aload_0
    //   621: getfield Thigh : Lnet/minecraft/client/model/ModelRenderer;
    //   624: getfield rotationPointY : F
    //   627: aload_0
    //   628: getfield Thigh : Lnet/minecraft/client/model/ModelRenderer;
    //   631: getfield rotateAngleX : F
    //   634: f2d
    //   635: invokestatic cos : (D)D
    //   638: d2f
    //   639: ldc 40.0
    //   641: fmul
    //   642: fadd
    //   643: putfield rotationPointY : F
    //   646: aload_0
    //   647: getfield Shin : Lnet/minecraft/client/model/ModelRenderer;
    //   650: aload_0
    //   651: getfield Thigh : Lnet/minecraft/client/model/ModelRenderer;
    //   654: getfield rotationPointZ : F
    //   657: aload_0
    //   658: getfield Thigh : Lnet/minecraft/client/model/ModelRenderer;
    //   661: getfield rotateAngleX : F
    //   664: f2d
    //   665: invokestatic sin : (D)D
    //   668: d2f
    //   669: ldc 40.0
    //   671: fmul
    //   672: fadd
    //   673: putfield rotationPointZ : F
    //   676: aload_0
    //   677: getfield Shin : Lnet/minecraft/client/model/ModelRenderer;
    //   680: aload_0
    //   681: getfield Thigh : Lnet/minecraft/client/model/ModelRenderer;
    //   684: getfield rotationPointX : F
    //   687: putfield rotationPointX : F
    //   690: aload_0
    //   691: getfield Shin : Lnet/minecraft/client/model/ModelRenderer;
    //   694: fload #7
    //   696: invokevirtual render : (F)V
    //   699: aload_0
    //   700: getfield Foot1 : Lnet/minecraft/client/model/ModelRenderer;
    //   703: aload_0
    //   704: getfield Foot2 : Lnet/minecraft/client/model/ModelRenderer;
    //   707: aload_0
    //   708: getfield Foot3 : Lnet/minecraft/client/model/ModelRenderer;
    //   711: aload #9
    //   713: getfield shindisplayangle : [F
    //   716: iconst_0
    //   717: faload
    //   718: dup_x1
    //   719: putfield rotateAngleX : F
    //   722: dup_x1
    //   723: putfield rotateAngleX : F
    //   726: putfield rotateAngleX : F
    //   729: aload_0
    //   730: getfield Foot1 : Lnet/minecraft/client/model/ModelRenderer;
    //   733: aload_0
    //   734: getfield Foot2 : Lnet/minecraft/client/model/ModelRenderer;
    //   737: aload_0
    //   738: getfield Foot3 : Lnet/minecraft/client/model/ModelRenderer;
    //   741: aload_0
    //   742: getfield Shin : Lnet/minecraft/client/model/ModelRenderer;
    //   745: getfield rotationPointY : F
    //   748: dup_x1
    //   749: putfield rotationPointY : F
    //   752: dup_x1
    //   753: putfield rotationPointY : F
    //   756: putfield rotationPointY : F
    //   759: aload_0
    //   760: getfield Foot1 : Lnet/minecraft/client/model/ModelRenderer;
    //   763: aload_0
    //   764: getfield Foot2 : Lnet/minecraft/client/model/ModelRenderer;
    //   767: aload_0
    //   768: getfield Foot3 : Lnet/minecraft/client/model/ModelRenderer;
    //   771: aload_0
    //   772: getfield Shin : Lnet/minecraft/client/model/ModelRenderer;
    //   775: getfield rotationPointZ : F
    //   778: dup_x1
    //   779: putfield rotationPointZ : F
    //   782: dup_x1
    //   783: putfield rotationPointZ : F
    //   786: putfield rotationPointZ : F
    //   789: aload_0
    //   790: getfield Foot1 : Lnet/minecraft/client/model/ModelRenderer;
    //   793: aload_0
    //   794: getfield Foot2 : Lnet/minecraft/client/model/ModelRenderer;
    //   797: aload_0
    //   798: getfield Foot3 : Lnet/minecraft/client/model/ModelRenderer;
    //   801: aload_0
    //   802: getfield Shin : Lnet/minecraft/client/model/ModelRenderer;
    //   805: getfield rotationPointX : F
    //   808: dup_x1
    //   809: putfield rotationPointX : F
    //   812: dup_x1
    //   813: putfield rotationPointX : F
    //   816: putfield rotationPointX : F
    //   819: aload_0
    //   820: getfield Foot1 : Lnet/minecraft/client/model/ModelRenderer;
    //   823: fload #7
    //   825: invokevirtual render : (F)V
    //   828: aload_0
    //   829: getfield Foot2 : Lnet/minecraft/client/model/ModelRenderer;
    //   832: fload #7
    //   834: invokevirtual render : (F)V
    //   837: aload_0
    //   838: getfield Foot3 : Lnet/minecraft/client/model/ModelRenderer;
    //   841: fload #7
    //   843: invokevirtual render : (F)V
    //   846: aload_0
    //   847: getfield Thigh : Lnet/minecraft/client/model/ModelRenderer;
    //   850: aload_0
    //   851: getfield Thigh2 : Lnet/minecraft/client/model/ModelRenderer;
    //   854: aload_0
    //   855: getfield Thigh3 : Lnet/minecraft/client/model/ModelRenderer;
    //   858: aload #9
    //   860: getfield thighdisplayangle : [F
    //   863: iconst_1
    //   864: faload
    //   865: dup_x1
    //   866: putfield rotateAngleX : F
    //   869: dup_x1
    //   870: putfield rotateAngleX : F
    //   873: putfield rotateAngleX : F
    //   876: aload_0
    //   877: getfield Thigh : Lnet/minecraft/client/model/ModelRenderer;
    //   880: aload_0
    //   881: getfield Thigh2 : Lnet/minecraft/client/model/ModelRenderer;
    //   884: aload_0
    //   885: getfield Thigh3 : Lnet/minecraft/client/model/ModelRenderer;
    //   888: aload_0
    //   889: getfield Hip : Lnet/minecraft/client/model/ModelRenderer;
    //   892: getfield rotationPointY : F
    //   895: aload_0
    //   896: getfield Hip : Lnet/minecraft/client/model/ModelRenderer;
    //   899: getfield rotateAngleX : F
    //   902: f2d
    //   903: invokestatic sin : (D)D
    //   906: d2f
    //   907: ldc 13.0
    //   909: fmul
    //   910: fadd
    //   911: dup_x1
    //   912: putfield rotationPointY : F
    //   915: dup_x1
    //   916: putfield rotationPointY : F
    //   919: putfield rotationPointY : F
    //   922: aload_0
    //   923: getfield Thigh : Lnet/minecraft/client/model/ModelRenderer;
    //   926: aload_0
    //   927: getfield Thigh2 : Lnet/minecraft/client/model/ModelRenderer;
    //   930: aload_0
    //   931: getfield Thigh3 : Lnet/minecraft/client/model/ModelRenderer;
    //   934: aload_0
    //   935: getfield Hip : Lnet/minecraft/client/model/ModelRenderer;
    //   938: getfield rotationPointZ : F
    //   941: aload_0
    //   942: getfield Hip : Lnet/minecraft/client/model/ModelRenderer;
    //   945: getfield rotateAngleX : F
    //   948: f2d
    //   949: invokestatic cos : (D)D
    //   952: d2f
    //   953: aload_0
    //   954: getfield Hip : Lnet/minecraft/client/model/ModelRenderer;
    //   957: getfield rotateAngleY : F
    //   960: f2d
    //   961: invokestatic cos : (D)D
    //   964: d2f
    //   965: fmul
    //   966: ldc 13.0
    //   968: fmul
    //   969: fsub
    //   970: dup_x1
    //   971: putfield rotationPointZ : F
    //   974: dup_x1
    //   975: putfield rotationPointZ : F
    //   978: putfield rotationPointZ : F
    //   981: aload_0
    //   982: getfield Thigh : Lnet/minecraft/client/model/ModelRenderer;
    //   985: aload_0
    //   986: getfield Thigh2 : Lnet/minecraft/client/model/ModelRenderer;
    //   989: aload_0
    //   990: getfield Thigh3 : Lnet/minecraft/client/model/ModelRenderer;
    //   993: aload_0
    //   994: getfield Hip : Lnet/minecraft/client/model/ModelRenderer;
    //   997: getfield rotationPointX : F
    //   1000: aload_0
    //   1001: getfield Hip : Lnet/minecraft/client/model/ModelRenderer;
    //   1004: getfield rotateAngleX : F
    //   1007: f2d
    //   1008: invokestatic cos : (D)D
    //   1011: d2f
    //   1012: aload_0
    //   1013: getfield Hip : Lnet/minecraft/client/model/ModelRenderer;
    //   1016: getfield rotateAngleY : F
    //   1019: f2d
    //   1020: invokestatic sin : (D)D
    //   1023: d2f
    //   1024: fmul
    //   1025: ldc 13.0
    //   1027: fmul
    //   1028: fsub
    //   1029: dup_x1
    //   1030: putfield rotationPointX : F
    //   1033: dup_x1
    //   1034: putfield rotationPointX : F
    //   1037: putfield rotationPointX : F
    //   1040: aload_0
    //   1041: getfield Thigh : Lnet/minecraft/client/model/ModelRenderer;
    //   1044: fload #7
    //   1046: invokevirtual render : (F)V
    //   1049: aload_0
    //   1050: getfield Thigh2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1053: fload #7
    //   1055: invokevirtual render : (F)V
    //   1058: aload_0
    //   1059: getfield Thigh3 : Lnet/minecraft/client/model/ModelRenderer;
    //   1062: fload #7
    //   1064: invokevirtual render : (F)V
    //   1067: aload_0
    //   1068: getfield Shin : Lnet/minecraft/client/model/ModelRenderer;
    //   1071: aload #9
    //   1073: getfield shindisplayangle : [F
    //   1076: iconst_1
    //   1077: faload
    //   1078: putfield rotateAngleX : F
    //   1081: aload_0
    //   1082: getfield Shin : Lnet/minecraft/client/model/ModelRenderer;
    //   1085: aload_0
    //   1086: getfield Thigh : Lnet/minecraft/client/model/ModelRenderer;
    //   1089: getfield rotationPointY : F
    //   1092: aload_0
    //   1093: getfield Thigh : Lnet/minecraft/client/model/ModelRenderer;
    //   1096: getfield rotateAngleX : F
    //   1099: f2d
    //   1100: invokestatic cos : (D)D
    //   1103: d2f
    //   1104: ldc 40.0
    //   1106: fmul
    //   1107: fadd
    //   1108: putfield rotationPointY : F
    //   1111: aload_0
    //   1112: getfield Shin : Lnet/minecraft/client/model/ModelRenderer;
    //   1115: aload_0
    //   1116: getfield Thigh : Lnet/minecraft/client/model/ModelRenderer;
    //   1119: getfield rotationPointZ : F
    //   1122: aload_0
    //   1123: getfield Thigh : Lnet/minecraft/client/model/ModelRenderer;
    //   1126: getfield rotateAngleX : F
    //   1129: f2d
    //   1130: invokestatic sin : (D)D
    //   1133: d2f
    //   1134: ldc 40.0
    //   1136: fmul
    //   1137: fadd
    //   1138: putfield rotationPointZ : F
    //   1141: aload_0
    //   1142: getfield Shin : Lnet/minecraft/client/model/ModelRenderer;
    //   1145: aload_0
    //   1146: getfield Thigh : Lnet/minecraft/client/model/ModelRenderer;
    //   1149: getfield rotationPointX : F
    //   1152: putfield rotationPointX : F
    //   1155: aload_0
    //   1156: getfield Shin : Lnet/minecraft/client/model/ModelRenderer;
    //   1159: fload #7
    //   1161: invokevirtual render : (F)V
    //   1164: aload_0
    //   1165: getfield Foot1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1168: aload_0
    //   1169: getfield Foot2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1172: aload_0
    //   1173: getfield Foot3 : Lnet/minecraft/client/model/ModelRenderer;
    //   1176: aload #9
    //   1178: getfield shindisplayangle : [F
    //   1181: iconst_1
    //   1182: faload
    //   1183: dup_x1
    //   1184: putfield rotateAngleX : F
    //   1187: dup_x1
    //   1188: putfield rotateAngleX : F
    //   1191: putfield rotateAngleX : F
    //   1194: aload_0
    //   1195: getfield Foot1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1198: aload_0
    //   1199: getfield Foot2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1202: aload_0
    //   1203: getfield Foot3 : Lnet/minecraft/client/model/ModelRenderer;
    //   1206: aload_0
    //   1207: getfield Shin : Lnet/minecraft/client/model/ModelRenderer;
    //   1210: getfield rotationPointY : F
    //   1213: dup_x1
    //   1214: putfield rotationPointY : F
    //   1217: dup_x1
    //   1218: putfield rotationPointY : F
    //   1221: putfield rotationPointY : F
    //   1224: aload_0
    //   1225: getfield Foot1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1228: aload_0
    //   1229: getfield Foot2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1232: aload_0
    //   1233: getfield Foot3 : Lnet/minecraft/client/model/ModelRenderer;
    //   1236: aload_0
    //   1237: getfield Shin : Lnet/minecraft/client/model/ModelRenderer;
    //   1240: getfield rotationPointZ : F
    //   1243: dup_x1
    //   1244: putfield rotationPointZ : F
    //   1247: dup_x1
    //   1248: putfield rotationPointZ : F
    //   1251: putfield rotationPointZ : F
    //   1254: aload_0
    //   1255: getfield Foot1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1258: aload_0
    //   1259: getfield Foot2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1262: aload_0
    //   1263: getfield Foot3 : Lnet/minecraft/client/model/ModelRenderer;
    //   1266: aload_0
    //   1267: getfield Shin : Lnet/minecraft/client/model/ModelRenderer;
    //   1270: getfield rotationPointX : F
    //   1273: dup_x1
    //   1274: putfield rotationPointX : F
    //   1277: dup_x1
    //   1278: putfield rotationPointX : F
    //   1281: putfield rotationPointX : F
    //   1284: aload_0
    //   1285: getfield Foot1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1288: fload #7
    //   1290: invokevirtual render : (F)V
    //   1293: aload_0
    //   1294: getfield Foot2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1297: fload #7
    //   1299: invokevirtual render : (F)V
    //   1302: aload_0
    //   1303: getfield Foot3 : Lnet/minecraft/client/model/ModelRenderer;
    //   1306: fload #7
    //   1308: invokevirtual render : (F)V
    //   1311: aload #9
    //   1313: getfield hipydisplayangle : F
    //   1316: fneg
    //   1317: fstore #12
    //   1319: aload #9
    //   1321: getfield thighdisplayangle : [F
    //   1324: iconst_1
    //   1325: faload
    //   1326: dup
    //   1327: fstore #14
    //   1329: fstore #13
    //   1331: aload #9
    //   1333: getfield thighdisplayangle : [F
    //   1336: iconst_0
    //   1337: faload
    //   1338: dup
    //   1339: fstore #16
    //   1341: fstore #15
    //   1343: aload #8
    //   1345: invokevirtual getAttacking : ()I
    //   1348: ifeq -> 1499
    //   1351: fload #4
    //   1353: aload_0
    //   1354: getfield wingspeed : F
    //   1357: fmul
    //   1358: fconst_2
    //   1359: fmul
    //   1360: f2d
    //   1361: invokestatic sin : (D)D
    //   1364: ldc2_w 3.141592653589793
    //   1367: dmul
    //   1368: ldc2_w 0.20000000298023224
    //   1371: dmul
    //   1372: dneg
    //   1373: d2f
    //   1374: fstore #12
    //   1376: fload #4
    //   1378: aload_0
    //   1379: getfield wingspeed : F
    //   1382: fmul
    //   1383: fconst_2
    //   1384: fmul
    //   1385: f2d
    //   1386: invokestatic sin : (D)D
    //   1389: ldc2_w 3.141592653589793
    //   1392: dmul
    //   1393: ldc2_w 5.0
    //   1396: ddiv
    //   1397: d2f
    //   1398: f2d
    //   1399: ldc2_w 0.7853981633974483
    //   1402: dsub
    //   1403: d2f
    //   1404: fstore #13
    //   1406: fload #13
    //   1408: fneg
    //   1409: f2d
    //   1410: ldc2_w 3.141592653589793
    //   1413: dadd
    //   1414: d2f
    //   1415: fstore #14
    //   1417: fload #13
    //   1419: f2d
    //   1420: ldc2_w 0.6283185307179586
    //   1423: dadd
    //   1424: d2f
    //   1425: fstore #13
    //   1427: fload #14
    //   1429: f2d
    //   1430: ldc2_w 0.6283185307179586
    //   1433: dadd
    //   1434: d2f
    //   1435: fstore #14
    //   1437: fload #4
    //   1439: aload_0
    //   1440: getfield wingspeed : F
    //   1443: fmul
    //   1444: fconst_2
    //   1445: fmul
    //   1446: f2d
    //   1447: invokestatic sin : (D)D
    //   1450: ldc2_w 3.141592653589793
    //   1453: dmul
    //   1454: ldc2_w 5.0
    //   1457: ddiv
    //   1458: dneg
    //   1459: d2f
    //   1460: f2d
    //   1461: ldc2_w 0.7853981633974483
    //   1464: dsub
    //   1465: d2f
    //   1466: fstore #15
    //   1468: fload #15
    //   1470: fneg
    //   1471: f2d
    //   1472: ldc2_w 3.141592653589793
    //   1475: dadd
    //   1476: d2f
    //   1477: fstore #16
    //   1479: fload #15
    //   1481: f2d
    //   1482: ldc2_w 0.6283185307179586
    //   1485: dadd
    //   1486: d2f
    //   1487: fstore #15
    //   1489: fload #16
    //   1491: f2d
    //   1492: ldc2_w 0.6283185307179586
    //   1495: dadd
    //   1496: d2f
    //   1497: fstore #16
    //   1499: aload_0
    //   1500: getfield Back3 : Lnet/minecraft/client/model/ModelRenderer;
    //   1503: fload #12
    //   1505: fconst_2
    //   1506: fdiv
    //   1507: putfield rotateAngleY : F
    //   1510: aload_0
    //   1511: getfield Shoulders : Lnet/minecraft/client/model/ModelRenderer;
    //   1514: fload #12
    //   1516: putfield rotateAngleY : F
    //   1519: aload_0
    //   1520: getfield Arm1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1523: aload_0
    //   1524: getfield Arm2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1527: aload_0
    //   1528: getfield Hip : Lnet/minecraft/client/model/ModelRenderer;
    //   1531: getfield rotationPointY : F
    //   1534: ldc 60.0
    //   1536: fsub
    //   1537: dup_x1
    //   1538: putfield rotationPointY : F
    //   1541: putfield rotationPointY : F
    //   1544: aload_0
    //   1545: getfield Arm1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1548: aload_0
    //   1549: getfield Arm2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1552: aload_0
    //   1553: getfield Hip : Lnet/minecraft/client/model/ModelRenderer;
    //   1556: getfield rotationPointX : F
    //   1559: ldc 26.0
    //   1561: fadd
    //   1562: dup_x1
    //   1563: putfield rotationPointX : F
    //   1566: putfield rotationPointX : F
    //   1569: aload_0
    //   1570: getfield Arm1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1573: aload_0
    //   1574: getfield Arm2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1577: aload_0
    //   1578: getfield Shoulders : Lnet/minecraft/client/model/ModelRenderer;
    //   1581: getfield rotationPointZ : F
    //   1584: aload_0
    //   1585: getfield Shoulders : Lnet/minecraft/client/model/ModelRenderer;
    //   1588: getfield rotateAngleY : F
    //   1591: f2d
    //   1592: invokestatic sin : (D)D
    //   1595: d2f
    //   1596: ldc 26.0
    //   1598: fmul
    //   1599: fsub
    //   1600: dup_x1
    //   1601: putfield rotationPointZ : F
    //   1604: putfield rotationPointZ : F
    //   1607: aload_0
    //   1608: getfield Arm1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1611: aload_0
    //   1612: getfield Arm2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1615: fload #13
    //   1617: dup_x1
    //   1618: putfield rotateAngleX : F
    //   1621: putfield rotateAngleX : F
    //   1624: aload_0
    //   1625: getfield Arm1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1628: fload #7
    //   1630: invokevirtual render : (F)V
    //   1633: aload_0
    //   1634: getfield Arm2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1637: fload #7
    //   1639: invokevirtual render : (F)V
    //   1642: aload_0
    //   1643: getfield Arm3 : Lnet/minecraft/client/model/ModelRenderer;
    //   1646: aload_0
    //   1647: getfield Knuckles : Lnet/minecraft/client/model/ModelRenderer;
    //   1650: fload #14
    //   1652: f2d
    //   1653: ldc2_w 0.19634954084936207
    //   1656: dsub
    //   1657: d2f
    //   1658: dup_x1
    //   1659: putfield rotateAngleX : F
    //   1662: putfield rotateAngleX : F
    //   1665: aload_0
    //   1666: getfield Arm3 : Lnet/minecraft/client/model/ModelRenderer;
    //   1669: aload_0
    //   1670: getfield Knuckles : Lnet/minecraft/client/model/ModelRenderer;
    //   1673: aload_0
    //   1674: getfield Arm1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1677: getfield rotationPointY : F
    //   1680: aload_0
    //   1681: getfield Arm1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1684: getfield rotateAngleX : F
    //   1687: f2d
    //   1688: invokestatic cos : (D)D
    //   1691: d2f
    //   1692: ldc 41.0
    //   1694: fmul
    //   1695: fadd
    //   1696: dup_x1
    //   1697: putfield rotationPointY : F
    //   1700: putfield rotationPointY : F
    //   1703: aload_0
    //   1704: getfield Arm3 : Lnet/minecraft/client/model/ModelRenderer;
    //   1707: aload_0
    //   1708: getfield Knuckles : Lnet/minecraft/client/model/ModelRenderer;
    //   1711: aload_0
    //   1712: getfield Arm1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1715: getfield rotationPointZ : F
    //   1718: aload_0
    //   1719: getfield Arm1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1722: getfield rotateAngleX : F
    //   1725: f2d
    //   1726: invokestatic sin : (D)D
    //   1729: d2f
    //   1730: ldc 41.0
    //   1732: fmul
    //   1733: fadd
    //   1734: dup_x1
    //   1735: putfield rotationPointZ : F
    //   1738: putfield rotationPointZ : F
    //   1741: aload_0
    //   1742: getfield Arm3 : Lnet/minecraft/client/model/ModelRenderer;
    //   1745: aload_0
    //   1746: getfield Knuckles : Lnet/minecraft/client/model/ModelRenderer;
    //   1749: aload_0
    //   1750: getfield Arm1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1753: getfield rotationPointX : F
    //   1756: dup_x1
    //   1757: putfield rotationPointX : F
    //   1760: putfield rotationPointX : F
    //   1763: aload_0
    //   1764: getfield Arm3 : Lnet/minecraft/client/model/ModelRenderer;
    //   1767: fload #7
    //   1769: invokevirtual render : (F)V
    //   1772: aload_0
    //   1773: getfield Knuckles : Lnet/minecraft/client/model/ModelRenderer;
    //   1776: fload #7
    //   1778: invokevirtual render : (F)V
    //   1781: aload_0
    //   1782: getfield Arm1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1785: aload_0
    //   1786: getfield Arm2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1789: aload_0
    //   1790: getfield Hip : Lnet/minecraft/client/model/ModelRenderer;
    //   1793: getfield rotationPointY : F
    //   1796: ldc 60.0
    //   1798: fsub
    //   1799: dup_x1
    //   1800: putfield rotationPointY : F
    //   1803: putfield rotationPointY : F
    //   1806: aload_0
    //   1807: getfield Arm1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1810: aload_0
    //   1811: getfield Arm2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1814: aload_0
    //   1815: getfield Hip : Lnet/minecraft/client/model/ModelRenderer;
    //   1818: getfield rotationPointX : F
    //   1821: ldc 26.0
    //   1823: fsub
    //   1824: dup_x1
    //   1825: putfield rotationPointX : F
    //   1828: putfield rotationPointX : F
    //   1831: aload_0
    //   1832: getfield Arm1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1835: aload_0
    //   1836: getfield Arm2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1839: aload_0
    //   1840: getfield Shoulders : Lnet/minecraft/client/model/ModelRenderer;
    //   1843: getfield rotationPointZ : F
    //   1846: aload_0
    //   1847: getfield Shoulders : Lnet/minecraft/client/model/ModelRenderer;
    //   1850: getfield rotateAngleY : F
    //   1853: f2d
    //   1854: invokestatic sin : (D)D
    //   1857: d2f
    //   1858: ldc 26.0
    //   1860: fmul
    //   1861: fadd
    //   1862: dup_x1
    //   1863: putfield rotationPointZ : F
    //   1866: putfield rotationPointZ : F
    //   1869: aload_0
    //   1870: getfield Arm1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1873: aload_0
    //   1874: getfield Arm2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1877: fload #15
    //   1879: dup_x1
    //   1880: putfield rotateAngleX : F
    //   1883: putfield rotateAngleX : F
    //   1886: aload_0
    //   1887: getfield Arm1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1890: fload #7
    //   1892: invokevirtual render : (F)V
    //   1895: aload_0
    //   1896: getfield Arm2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1899: fload #7
    //   1901: invokevirtual render : (F)V
    //   1904: aload_0
    //   1905: getfield Arm3 : Lnet/minecraft/client/model/ModelRenderer;
    //   1908: aload_0
    //   1909: getfield Knuckles : Lnet/minecraft/client/model/ModelRenderer;
    //   1912: fload #16
    //   1914: f2d
    //   1915: ldc2_w 0.19634954084936207
    //   1918: dsub
    //   1919: d2f
    //   1920: dup_x1
    //   1921: putfield rotateAngleX : F
    //   1924: putfield rotateAngleX : F
    //   1927: aload_0
    //   1928: getfield Arm3 : Lnet/minecraft/client/model/ModelRenderer;
    //   1931: aload_0
    //   1932: getfield Knuckles : Lnet/minecraft/client/model/ModelRenderer;
    //   1935: aload_0
    //   1936: getfield Arm1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1939: getfield rotationPointY : F
    //   1942: aload_0
    //   1943: getfield Arm1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1946: getfield rotateAngleX : F
    //   1949: f2d
    //   1950: invokestatic cos : (D)D
    //   1953: d2f
    //   1954: ldc 41.0
    //   1956: fmul
    //   1957: fadd
    //   1958: dup_x1
    //   1959: putfield rotationPointY : F
    //   1962: putfield rotationPointY : F
    //   1965: aload_0
    //   1966: getfield Arm3 : Lnet/minecraft/client/model/ModelRenderer;
    //   1969: aload_0
    //   1970: getfield Knuckles : Lnet/minecraft/client/model/ModelRenderer;
    //   1973: aload_0
    //   1974: getfield Arm1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1977: getfield rotationPointZ : F
    //   1980: aload_0
    //   1981: getfield Arm1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1984: getfield rotateAngleX : F
    //   1987: f2d
    //   1988: invokestatic sin : (D)D
    //   1991: d2f
    //   1992: ldc 41.0
    //   1994: fmul
    //   1995: fadd
    //   1996: dup_x1
    //   1997: putfield rotationPointZ : F
    //   2000: putfield rotationPointZ : F
    //   2003: aload_0
    //   2004: getfield Arm3 : Lnet/minecraft/client/model/ModelRenderer;
    //   2007: aload_0
    //   2008: getfield Knuckles : Lnet/minecraft/client/model/ModelRenderer;
    //   2011: aload_0
    //   2012: getfield Arm1 : Lnet/minecraft/client/model/ModelRenderer;
    //   2015: getfield rotationPointX : F
    //   2018: dup_x1
    //   2019: putfield rotationPointX : F
    //   2022: putfield rotationPointX : F
    //   2025: aload_0
    //   2026: getfield Arm3 : Lnet/minecraft/client/model/ModelRenderer;
    //   2029: fload #7
    //   2031: invokevirtual render : (F)V
    //   2034: aload_0
    //   2035: getfield Knuckles : Lnet/minecraft/client/model/ModelRenderer;
    //   2038: fload #7
    //   2040: invokevirtual render : (F)V
    //   2043: aload_0
    //   2044: getfield Back1 : Lnet/minecraft/client/model/ModelRenderer;
    //   2047: aload_0
    //   2048: getfield Back2 : Lnet/minecraft/client/model/ModelRenderer;
    //   2051: aload_0
    //   2052: getfield Back3 : Lnet/minecraft/client/model/ModelRenderer;
    //   2055: aload_0
    //   2056: getfield Hip : Lnet/minecraft/client/model/ModelRenderer;
    //   2059: getfield rotationPointY : F
    //   2062: dup_x1
    //   2063: putfield rotationPointY : F
    //   2066: dup_x1
    //   2067: putfield rotationPointY : F
    //   2070: putfield rotationPointY : F
    //   2073: aload_0
    //   2074: getfield Shoulders : Lnet/minecraft/client/model/ModelRenderer;
    //   2077: aload_0
    //   2078: getfield Neck : Lnet/minecraft/client/model/ModelRenderer;
    //   2081: aload_0
    //   2082: getfield Head : Lnet/minecraft/client/model/ModelRenderer;
    //   2085: aload_0
    //   2086: getfield Hip : Lnet/minecraft/client/model/ModelRenderer;
    //   2089: getfield rotationPointY : F
    //   2092: dup_x1
    //   2093: putfield rotationPointY : F
    //   2096: dup_x1
    //   2097: putfield rotationPointY : F
    //   2100: putfield rotationPointY : F
    //   2103: aload_0
    //   2104: getfield Head : Lnet/minecraft/client/model/ModelRenderer;
    //   2107: fload #5
    //   2109: f2d
    //   2110: invokestatic toRadians : (D)D
    //   2113: d2f
    //   2114: putfield rotateAngleY : F
    //   2117: aload_0
    //   2118: getfield Head : Lnet/minecraft/client/model/ModelRenderer;
    //   2121: fload #6
    //   2123: f2d
    //   2124: invokestatic toRadians : (D)D
    //   2127: d2f
    //   2128: ldc 3.0
    //   2130: fdiv
    //   2131: putfield rotateAngleX : F
    //   2134: aload_0
    //   2135: getfield Back1 : Lnet/minecraft/client/model/ModelRenderer;
    //   2138: fload #7
    //   2140: invokevirtual render : (F)V
    //   2143: aload_0
    //   2144: getfield Back2 : Lnet/minecraft/client/model/ModelRenderer;
    //   2147: fload #7
    //   2149: invokevirtual render : (F)V
    //   2152: aload_0
    //   2153: getfield Back3 : Lnet/minecraft/client/model/ModelRenderer;
    //   2156: fload #7
    //   2158: invokevirtual render : (F)V
    //   2161: aload_0
    //   2162: getfield Shoulders : Lnet/minecraft/client/model/ModelRenderer;
    //   2165: fload #7
    //   2167: invokevirtual render : (F)V
    //   2170: aload_0
    //   2171: getfield Neck : Lnet/minecraft/client/model/ModelRenderer;
    //   2174: fload #7
    //   2176: invokevirtual render : (F)V
    //   2179: aload_0
    //   2180: getfield Head : Lnet/minecraft/client/model/ModelRenderer;
    //   2183: fload #7
    //   2185: invokevirtual render : (F)V
    //   2188: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #155	-> 0
    //   #156	-> 6
    //   #157	-> 9
    //   #158	-> 24
    //   #165	-> 39
    //   #166	-> 46
    //   #167	-> 52
    //   #169	-> 62
    //   #170	-> 92
    //   #171	-> 122
    //   #172	-> 167
    //   #173	-> 216
    //   #174	-> 262
    //   #176	-> 304
    //   #177	-> 325
    //   #179	-> 342
    //   #180	-> 354
    //   #181	-> 372
    //   #183	-> 381
    //   #184	-> 411
    //   #185	-> 457
    //   #186	-> 516
    //   #187	-> 575
    //   #188	-> 584
    //   #189	-> 593
    //   #190	-> 602
    //   #191	-> 616
    //   #192	-> 646
    //   #193	-> 676
    //   #194	-> 690
    //   #195	-> 699
    //   #196	-> 729
    //   #197	-> 759
    //   #198	-> 789
    //   #199	-> 819
    //   #200	-> 828
    //   #201	-> 837
    //   #204	-> 846
    //   #205	-> 876
    //   #206	-> 922
    //   #207	-> 981
    //   #208	-> 1040
    //   #209	-> 1049
    //   #210	-> 1058
    //   #211	-> 1067
    //   #212	-> 1081
    //   #213	-> 1111
    //   #214	-> 1141
    //   #215	-> 1155
    //   #216	-> 1164
    //   #217	-> 1194
    //   #218	-> 1224
    //   #219	-> 1254
    //   #220	-> 1284
    //   #221	-> 1293
    //   #222	-> 1302
    //   #224	-> 1311
    //   #225	-> 1319
    //   #226	-> 1331
    //   #227	-> 1343
    //   #228	-> 1351
    //   #229	-> 1376
    //   #230	-> 1406
    //   #231	-> 1417
    //   #232	-> 1427
    //   #233	-> 1437
    //   #234	-> 1468
    //   #235	-> 1479
    //   #236	-> 1489
    //   #239	-> 1499
    //   #240	-> 1510
    //   #242	-> 1519
    //   #243	-> 1544
    //   #244	-> 1569
    //   #245	-> 1607
    //   #246	-> 1624
    //   #247	-> 1633
    //   #248	-> 1642
    //   #249	-> 1665
    //   #250	-> 1703
    //   #251	-> 1741
    //   #252	-> 1763
    //   #253	-> 1772
    //   #255	-> 1781
    //   #256	-> 1806
    //   #257	-> 1831
    //   #258	-> 1869
    //   #259	-> 1886
    //   #260	-> 1895
    //   #261	-> 1904
    //   #262	-> 1927
    //   #263	-> 1965
    //   #264	-> 2003
    //   #265	-> 2025
    //   #266	-> 2034
    //   #268	-> 2043
    //   #269	-> 2073
    //   #271	-> 2103
    //   #272	-> 2117
    //   #274	-> 2134
    //   #275	-> 2143
    //   #276	-> 2152
    //   #277	-> 2161
    //   #278	-> 2170
    //   #279	-> 2179
    //   #281	-> 2188
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	2189	0	this	Ldanger/orespawn/ModelGiantRobot;
    //   0	2189	1	entity	Lnet/minecraft/entity/Entity;
    //   0	2189	2	f	F
    //   0	2189	3	f1	F
    //   0	2189	4	f2	F
    //   0	2189	5	f3	F
    //   0	2189	6	f4	F
    //   0	2189	7	f5	F
    //   6	2183	8	e	Ldanger/orespawn/GiantRobot;
    //   9	2180	9	r	Ldanger/orespawn/RenderGiantRobotInfo;
    //   325	1864	10	newangle	F
    //   52	2137	11	movescale	F
    //   1319	870	12	shoulderangle	F
    //   1331	858	13	a1angle	F
    //   1329	860	14	a2angle	F
    //   1343	846	15	b1angle	F
    //   1341	848	16	b2angle	F
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
