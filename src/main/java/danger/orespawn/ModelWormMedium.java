package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelWormMedium extends ModelBase {
  ModelRenderer head;
  
  ModelRenderer body;
  
  ModelRenderer tail;
  
  ModelRenderer tooth1;
  
  ModelRenderer tooth2;
  
  ModelRenderer tooth3;
  
  ModelRenderer tooth4;
  
  ModelRenderer head2;
  
  public ModelWormMedium() {
    this.textureWidth = 64;
    this.textureHeight = 32;
    this.head = new ModelRenderer(this, 24, 0);
    this.head.addBox(-1.5F, -12.0F, -1.5F, 3, 12, 3);
    this.head.setRotationPoint(0.0F, 1.0F, 0.0F);
    this.head.setTextureSize(64, 32);
    this.head.mirror = true;
    setRotation(this.head, 0.0F, 0.0F, 0.0F);
    this.body = new ModelRenderer(this, 37, 0);
    this.body.addBox(-1.5F, -12.0F, -1.5F, 3, 12, 3);
    this.body.setRotationPoint(0.0F, 13.0F, 0.0F);
    this.body.setTextureSize(64, 32);
    this.body.mirror = true;
    setRotation(this.body, 0.0F, 0.0F, 0.0F);
    this.tail = new ModelRenderer(this, 50, 0);
    this.tail.addBox(-1.5F, -12.0F, -1.5F, 3, 12, 3);
    this.tail.setRotationPoint(0.0F, 25.0F, 0.0F);
    this.tail.setTextureSize(64, 32);
    this.tail.mirror = true;
    setRotation(this.tail, 0.0F, 0.0F, 0.0F);
    this.tooth1 = new ModelRenderer(this, 15, 0);
    this.tooth1.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1);
    this.tooth1.setRotationPoint(1.0F, -11.0F, 0.0F);
    this.tooth1.setTextureSize(64, 32);
    this.tooth1.mirror = true;
    setRotation(this.tooth1, 0.0F, 0.0F, 0.0F);
    this.tooth2 = new ModelRenderer(this, 5, 0);
    this.tooth2.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1);
    this.tooth2.setRotationPoint(-1.0F, -11.0F, 0.0F);
    this.tooth2.setTextureSize(64, 32);
    this.tooth2.mirror = true;
    setRotation(this.tooth2, 0.0F, 0.0F, 0.0F);
    this.tooth3 = new ModelRenderer(this, 0, 0);
    this.tooth3.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1);
    this.tooth3.setRotationPoint(0.0F, -11.0F, 1.0F);
    this.tooth3.setTextureSize(64, 32);
    this.tooth3.mirror = true;
    setRotation(this.tooth3, 0.0F, 0.0F, 0.0F);
    this.tooth4 = new ModelRenderer(this, 10, 0);
    this.tooth4.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1);
    this.tooth4.setRotationPoint(0.0F, -11.0F, -1.0F);
    this.tooth4.setTextureSize(64, 32);
    this.tooth4.mirror = true;
    setRotation(this.tooth4, 0.0F, 0.0F, 0.0F);
    this.head2 = new ModelRenderer(this, 0, 6);
    this.head2.addBox(-2.0F, -8.0F, -2.0F, 4, 8, 4);
    this.head2.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.head2.setTextureSize(64, 32);
    this.head2.mirror = true;
    setRotation(this.head2, 0.0F, 0.0F, 0.0F);
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
    //   32: ldc 0.45
    //   34: fmul
    //   35: invokestatic cos : (F)F
    //   38: ldc 3.1415927
    //   40: fmul
    //   41: ldc 0.1
    //   43: fmul
    //   44: fstore #8
    //   46: aload_0
    //   47: getfield tail : Lnet/minecraft/client/model/ModelRenderer;
    //   50: fload #8
    //   52: putfield rotateAngleX : F
    //   55: fload #8
    //   57: f2d
    //   58: invokestatic sin : (D)D
    //   61: ldc2_w 12.0
    //   64: dmul
    //   65: d2f
    //   66: fstore #9
    //   68: fload #8
    //   70: f2d
    //   71: invokestatic cos : (D)D
    //   74: ldc2_w 12.0
    //   77: dmul
    //   78: d2f
    //   79: fstore #10
    //   81: aload_0
    //   82: getfield body : Lnet/minecraft/client/model/ModelRenderer;
    //   85: aload_0
    //   86: getfield tail : Lnet/minecraft/client/model/ModelRenderer;
    //   89: getfield rotationPointZ : F
    //   92: fload #9
    //   94: fsub
    //   95: putfield rotationPointZ : F
    //   98: fload #4
    //   100: ldc 0.25
    //   102: fmul
    //   103: invokestatic cos : (F)F
    //   106: ldc 3.1415927
    //   108: fmul
    //   109: ldc 0.08
    //   111: fmul
    //   112: fstore #8
    //   114: aload_0
    //   115: getfield tail : Lnet/minecraft/client/model/ModelRenderer;
    //   118: fload #8
    //   120: putfield rotateAngleZ : F
    //   123: fload #8
    //   125: f2d
    //   126: invokestatic cos : (D)D
    //   129: fload #10
    //   131: f2d
    //   132: dmul
    //   133: d2f
    //   134: fstore #11
    //   136: fload #8
    //   138: f2d
    //   139: invokestatic sin : (D)D
    //   142: fload #10
    //   144: f2d
    //   145: dmul
    //   146: d2f
    //   147: fstore #12
    //   149: aload_0
    //   150: getfield body : Lnet/minecraft/client/model/ModelRenderer;
    //   153: aload_0
    //   154: getfield tail : Lnet/minecraft/client/model/ModelRenderer;
    //   157: getfield rotationPointX : F
    //   160: fload #12
    //   162: fadd
    //   163: putfield rotationPointX : F
    //   166: aload_0
    //   167: getfield body : Lnet/minecraft/client/model/ModelRenderer;
    //   170: aload_0
    //   171: getfield tail : Lnet/minecraft/client/model/ModelRenderer;
    //   174: getfield rotationPointY : F
    //   177: f2d
    //   178: ldc2_w 12.0
    //   181: dsub
    //   182: ldc2_w 12.0
    //   185: fload #11
    //   187: f2d
    //   188: dsub
    //   189: dadd
    //   190: d2f
    //   191: putfield rotationPointY : F
    //   194: fload #4
    //   196: ldc 0.35
    //   198: fmul
    //   199: invokestatic cos : (F)F
    //   202: ldc 3.1415927
    //   204: fmul
    //   205: ldc 0.1
    //   207: fmul
    //   208: fstore #8
    //   210: aload_0
    //   211: getfield body : Lnet/minecraft/client/model/ModelRenderer;
    //   214: fload #8
    //   216: putfield rotateAngleX : F
    //   219: fload #8
    //   221: f2d
    //   222: invokestatic sin : (D)D
    //   225: ldc2_w 12.0
    //   228: dmul
    //   229: d2f
    //   230: fstore #9
    //   232: fload #8
    //   234: f2d
    //   235: invokestatic cos : (D)D
    //   238: ldc2_w 12.0
    //   241: dmul
    //   242: d2f
    //   243: fstore #10
    //   245: aload_0
    //   246: getfield head2 : Lnet/minecraft/client/model/ModelRenderer;
    //   249: aload_0
    //   250: getfield head : Lnet/minecraft/client/model/ModelRenderer;
    //   253: aload_0
    //   254: getfield body : Lnet/minecraft/client/model/ModelRenderer;
    //   257: getfield rotationPointZ : F
    //   260: fload #9
    //   262: fsub
    //   263: dup_x1
    //   264: putfield rotationPointZ : F
    //   267: putfield rotationPointZ : F
    //   270: fload #4
    //   272: ldc 0.15
    //   274: fmul
    //   275: invokestatic cos : (F)F
    //   278: ldc 3.1415927
    //   280: fmul
    //   281: ldc 0.07
    //   283: fmul
    //   284: fstore #8
    //   286: aload_0
    //   287: getfield body : Lnet/minecraft/client/model/ModelRenderer;
    //   290: fload #8
    //   292: putfield rotateAngleZ : F
    //   295: fload #8
    //   297: f2d
    //   298: invokestatic cos : (D)D
    //   301: fload #10
    //   303: f2d
    //   304: dmul
    //   305: d2f
    //   306: fstore #11
    //   308: fload #8
    //   310: f2d
    //   311: invokestatic sin : (D)D
    //   314: fload #10
    //   316: f2d
    //   317: dmul
    //   318: d2f
    //   319: fstore #12
    //   321: aload_0
    //   322: getfield head2 : Lnet/minecraft/client/model/ModelRenderer;
    //   325: aload_0
    //   326: getfield head : Lnet/minecraft/client/model/ModelRenderer;
    //   329: aload_0
    //   330: getfield body : Lnet/minecraft/client/model/ModelRenderer;
    //   333: getfield rotationPointX : F
    //   336: fload #12
    //   338: fadd
    //   339: dup_x1
    //   340: putfield rotationPointX : F
    //   343: putfield rotationPointX : F
    //   346: aload_0
    //   347: getfield head2 : Lnet/minecraft/client/model/ModelRenderer;
    //   350: aload_0
    //   351: getfield head : Lnet/minecraft/client/model/ModelRenderer;
    //   354: aload_0
    //   355: getfield body : Lnet/minecraft/client/model/ModelRenderer;
    //   358: getfield rotationPointY : F
    //   361: f2d
    //   362: ldc2_w 12.0
    //   365: dsub
    //   366: ldc2_w 12.0
    //   369: fload #11
    //   371: f2d
    //   372: dsub
    //   373: dadd
    //   374: d2f
    //   375: dup_x1
    //   376: putfield rotationPointY : F
    //   379: putfield rotationPointY : F
    //   382: aload_0
    //   383: getfield head2 : Lnet/minecraft/client/model/ModelRenderer;
    //   386: aload_0
    //   387: getfield head : Lnet/minecraft/client/model/ModelRenderer;
    //   390: ldc 0.62
    //   392: fload #4
    //   394: ldc 0.55
    //   396: fmul
    //   397: invokestatic cos : (F)F
    //   400: ldc 3.1415927
    //   402: fmul
    //   403: ldc 0.15
    //   405: fmul
    //   406: fadd
    //   407: dup_x1
    //   408: putfield rotateAngleX : F
    //   411: putfield rotateAngleX : F
    //   414: aload_0
    //   415: getfield head2 : Lnet/minecraft/client/model/ModelRenderer;
    //   418: aload_0
    //   419: getfield head : Lnet/minecraft/client/model/ModelRenderer;
    //   422: fload #4
    //   424: ldc 0.25
    //   426: fmul
    //   427: invokestatic cos : (F)F
    //   430: ldc 3.1415927
    //   432: fmul
    //   433: ldc 0.05
    //   435: fmul
    //   436: dup_x1
    //   437: putfield rotateAngleZ : F
    //   440: putfield rotateAngleZ : F
    //   443: aload_0
    //   444: getfield head : Lnet/minecraft/client/model/ModelRenderer;
    //   447: getfield rotateAngleX : F
    //   450: fstore #8
    //   452: aload_0
    //   453: getfield tooth1 : Lnet/minecraft/client/model/ModelRenderer;
    //   456: aload_0
    //   457: getfield tooth2 : Lnet/minecraft/client/model/ModelRenderer;
    //   460: aload_0
    //   461: getfield tooth3 : Lnet/minecraft/client/model/ModelRenderer;
    //   464: aload_0
    //   465: getfield tooth4 : Lnet/minecraft/client/model/ModelRenderer;
    //   468: fload #8
    //   470: dup_x1
    //   471: putfield rotateAngleX : F
    //   474: dup_x1
    //   475: putfield rotateAngleX : F
    //   478: dup_x1
    //   479: putfield rotateAngleX : F
    //   482: putfield rotateAngleX : F
    //   485: fload #8
    //   487: f2d
    //   488: invokestatic sin : (D)D
    //   491: ldc2_w 12.0
    //   494: dmul
    //   495: d2f
    //   496: fstore #9
    //   498: fload #8
    //   500: f2d
    //   501: invokestatic cos : (D)D
    //   504: ldc2_w 12.0
    //   507: dmul
    //   508: d2f
    //   509: fstore #10
    //   511: aload_0
    //   512: getfield tooth1 : Lnet/minecraft/client/model/ModelRenderer;
    //   515: aload_0
    //   516: getfield tooth2 : Lnet/minecraft/client/model/ModelRenderer;
    //   519: aload_0
    //   520: getfield tooth3 : Lnet/minecraft/client/model/ModelRenderer;
    //   523: aload_0
    //   524: getfield tooth4 : Lnet/minecraft/client/model/ModelRenderer;
    //   527: aload_0
    //   528: getfield head : Lnet/minecraft/client/model/ModelRenderer;
    //   531: getfield rotationPointZ : F
    //   534: fload #9
    //   536: fsub
    //   537: dup_x1
    //   538: putfield rotationPointZ : F
    //   541: dup_x1
    //   542: putfield rotationPointZ : F
    //   545: dup_x1
    //   546: putfield rotationPointZ : F
    //   549: putfield rotationPointZ : F
    //   552: aload_0
    //   553: getfield head : Lnet/minecraft/client/model/ModelRenderer;
    //   556: getfield rotateAngleZ : F
    //   559: fstore #8
    //   561: aload_0
    //   562: getfield tooth1 : Lnet/minecraft/client/model/ModelRenderer;
    //   565: aload_0
    //   566: getfield tooth2 : Lnet/minecraft/client/model/ModelRenderer;
    //   569: aload_0
    //   570: getfield tooth3 : Lnet/minecraft/client/model/ModelRenderer;
    //   573: aload_0
    //   574: getfield tooth4 : Lnet/minecraft/client/model/ModelRenderer;
    //   577: fload #8
    //   579: dup_x1
    //   580: putfield rotateAngleZ : F
    //   583: dup_x1
    //   584: putfield rotateAngleZ : F
    //   587: dup_x1
    //   588: putfield rotateAngleZ : F
    //   591: putfield rotateAngleZ : F
    //   594: fload #8
    //   596: f2d
    //   597: invokestatic cos : (D)D
    //   600: fload #10
    //   602: f2d
    //   603: dmul
    //   604: d2f
    //   605: fstore #11
    //   607: fload #8
    //   609: f2d
    //   610: invokestatic sin : (D)D
    //   613: fload #10
    //   615: f2d
    //   616: dmul
    //   617: d2f
    //   618: fstore #12
    //   620: aload_0
    //   621: getfield tooth1 : Lnet/minecraft/client/model/ModelRenderer;
    //   624: aload_0
    //   625: getfield tooth2 : Lnet/minecraft/client/model/ModelRenderer;
    //   628: aload_0
    //   629: getfield tooth3 : Lnet/minecraft/client/model/ModelRenderer;
    //   632: aload_0
    //   633: getfield tooth4 : Lnet/minecraft/client/model/ModelRenderer;
    //   636: aload_0
    //   637: getfield head : Lnet/minecraft/client/model/ModelRenderer;
    //   640: getfield rotationPointX : F
    //   643: fload #12
    //   645: fadd
    //   646: dup_x1
    //   647: putfield rotationPointX : F
    //   650: dup_x1
    //   651: putfield rotationPointX : F
    //   654: dup_x1
    //   655: putfield rotationPointX : F
    //   658: putfield rotationPointX : F
    //   661: aload_0
    //   662: getfield tooth1 : Lnet/minecraft/client/model/ModelRenderer;
    //   665: aload_0
    //   666: getfield tooth2 : Lnet/minecraft/client/model/ModelRenderer;
    //   669: aload_0
    //   670: getfield tooth3 : Lnet/minecraft/client/model/ModelRenderer;
    //   673: aload_0
    //   674: getfield tooth4 : Lnet/minecraft/client/model/ModelRenderer;
    //   677: aload_0
    //   678: getfield head : Lnet/minecraft/client/model/ModelRenderer;
    //   681: getfield rotationPointY : F
    //   684: f2d
    //   685: ldc2_w 12.0
    //   688: dsub
    //   689: ldc2_w 12.0
    //   692: fload #11
    //   694: f2d
    //   695: dsub
    //   696: dadd
    //   697: d2f
    //   698: dup_x1
    //   699: putfield rotationPointY : F
    //   702: dup_x1
    //   703: putfield rotationPointY : F
    //   706: dup_x1
    //   707: putfield rotationPointY : F
    //   710: putfield rotationPointY : F
    //   713: aload_0
    //   714: getfield tooth1 : Lnet/minecraft/client/model/ModelRenderer;
    //   717: dup
    //   718: getfield rotationPointZ : F
    //   721: fconst_1
    //   722: fadd
    //   723: putfield rotationPointZ : F
    //   726: aload_0
    //   727: getfield tooth2 : Lnet/minecraft/client/model/ModelRenderer;
    //   730: dup
    //   731: getfield rotationPointZ : F
    //   734: fconst_1
    //   735: fsub
    //   736: putfield rotationPointZ : F
    //   739: aload_0
    //   740: getfield tooth1 : Lnet/minecraft/client/model/ModelRenderer;
    //   743: aload_0
    //   744: getfield tooth1 : Lnet/minecraft/client/model/ModelRenderer;
    //   747: getfield rotateAngleX : F
    //   750: ldc 0.4
    //   752: fsub
    //   753: fload #4
    //   755: ldc 0.55
    //   757: fmul
    //   758: invokestatic cos : (F)F
    //   761: ldc 3.1415927
    //   763: fmul
    //   764: ldc 0.15
    //   766: fmul
    //   767: fsub
    //   768: putfield rotateAngleX : F
    //   771: aload_0
    //   772: getfield tooth2 : Lnet/minecraft/client/model/ModelRenderer;
    //   775: aload_0
    //   776: getfield tooth2 : Lnet/minecraft/client/model/ModelRenderer;
    //   779: getfield rotateAngleX : F
    //   782: ldc 0.4
    //   784: fadd
    //   785: fload #4
    //   787: ldc 0.55
    //   789: fmul
    //   790: invokestatic cos : (F)F
    //   793: ldc 3.1415927
    //   795: fmul
    //   796: ldc 0.15
    //   798: fmul
    //   799: fadd
    //   800: putfield rotateAngleX : F
    //   803: aload_0
    //   804: getfield tooth3 : Lnet/minecraft/client/model/ModelRenderer;
    //   807: dup
    //   808: getfield rotationPointX : F
    //   811: fconst_1
    //   812: fadd
    //   813: putfield rotationPointX : F
    //   816: aload_0
    //   817: getfield tooth4 : Lnet/minecraft/client/model/ModelRenderer;
    //   820: dup
    //   821: getfield rotationPointX : F
    //   824: fconst_1
    //   825: fsub
    //   826: putfield rotationPointX : F
    //   829: aload_0
    //   830: getfield tooth3 : Lnet/minecraft/client/model/ModelRenderer;
    //   833: aload_0
    //   834: getfield tooth3 : Lnet/minecraft/client/model/ModelRenderer;
    //   837: getfield rotateAngleZ : F
    //   840: ldc 0.4
    //   842: fadd
    //   843: fload #4
    //   845: ldc 0.55
    //   847: fmul
    //   848: invokestatic cos : (F)F
    //   851: ldc 3.1415927
    //   853: fmul
    //   854: ldc 0.15
    //   856: fmul
    //   857: fadd
    //   858: putfield rotateAngleZ : F
    //   861: aload_0
    //   862: getfield tooth4 : Lnet/minecraft/client/model/ModelRenderer;
    //   865: aload_0
    //   866: getfield tooth4 : Lnet/minecraft/client/model/ModelRenderer;
    //   869: getfield rotateAngleZ : F
    //   872: ldc 0.4
    //   874: fsub
    //   875: fload #4
    //   877: ldc 0.55
    //   879: fmul
    //   880: invokestatic cos : (F)F
    //   883: ldc 3.1415927
    //   885: fmul
    //   886: ldc 0.15
    //   888: fmul
    //   889: fsub
    //   890: putfield rotateAngleZ : F
    //   893: aload_0
    //   894: getfield head : Lnet/minecraft/client/model/ModelRenderer;
    //   897: fload #7
    //   899: invokevirtual render : (F)V
    //   902: aload_0
    //   903: getfield body : Lnet/minecraft/client/model/ModelRenderer;
    //   906: fload #7
    //   908: invokevirtual render : (F)V
    //   911: aload_0
    //   912: getfield tail : Lnet/minecraft/client/model/ModelRenderer;
    //   915: fload #7
    //   917: invokevirtual render : (F)V
    //   920: aload_0
    //   921: getfield tooth1 : Lnet/minecraft/client/model/ModelRenderer;
    //   924: fload #7
    //   926: invokevirtual render : (F)V
    //   929: aload_0
    //   930: getfield tooth2 : Lnet/minecraft/client/model/ModelRenderer;
    //   933: fload #7
    //   935: invokevirtual render : (F)V
    //   938: aload_0
    //   939: getfield tooth3 : Lnet/minecraft/client/model/ModelRenderer;
    //   942: fload #7
    //   944: invokevirtual render : (F)V
    //   947: aload_0
    //   948: getfield tooth4 : Lnet/minecraft/client/model/ModelRenderer;
    //   951: fload #7
    //   953: invokevirtual render : (F)V
    //   956: aload_0
    //   957: getfield head2 : Lnet/minecraft/client/model/ModelRenderer;
    //   960: fload #7
    //   962: invokevirtual render : (F)V
    //   965: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #80	-> 0
    //   #81	-> 15
    //   #83	-> 30
    //   #84	-> 46
    //   #85	-> 55
    //   #86	-> 68
    //   #87	-> 81
    //   #88	-> 98
    //   #89	-> 114
    //   #90	-> 123
    //   #91	-> 136
    //   #92	-> 149
    //   #93	-> 166
    //   #95	-> 194
    //   #96	-> 210
    //   #97	-> 219
    //   #98	-> 232
    //   #99	-> 245
    //   #100	-> 270
    //   #101	-> 286
    //   #102	-> 295
    //   #103	-> 308
    //   #104	-> 321
    //   #105	-> 346
    //   #107	-> 382
    //   #108	-> 414
    //   #110	-> 443
    //   #111	-> 452
    //   #112	-> 485
    //   #113	-> 498
    //   #114	-> 511
    //   #115	-> 552
    //   #116	-> 561
    //   #117	-> 594
    //   #118	-> 607
    //   #119	-> 620
    //   #120	-> 661
    //   #122	-> 713
    //   #123	-> 726
    //   #124	-> 739
    //   #125	-> 771
    //   #127	-> 803
    //   #128	-> 816
    //   #129	-> 829
    //   #130	-> 861
    //   #133	-> 893
    //   #134	-> 902
    //   #135	-> 911
    //   #136	-> 920
    //   #137	-> 929
    //   #138	-> 938
    //   #139	-> 947
    //   #140	-> 956
    //   #142	-> 965
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	966	0	this	Ldanger/orespawn/ModelWormMedium;
    //   0	966	1	entity	Lnet/minecraft/entity/Entity;
    //   0	966	2	f	F
    //   0	966	3	f1	F
    //   0	966	4	f2	F
    //   0	966	5	f3	F
    //   0	966	6	f4	F
    //   0	966	7	f5	F
    //   46	920	8	newangle	F
    //   68	898	9	d1	F
    //   81	885	10	d2	F
    //   136	830	11	d3	F
    //   149	817	12	d4	F
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
