package com.google.android.gms.internal;

public final class ff extends qx<ff> {
    public a[] a;

    public static final class a extends qx<a> {
        private static volatile a[] c;
        public String a;
        public a b;

        public static final class a extends qx<a> {
            private static volatile a[] c;
            public int a;
            public a b;

            public static final class a extends qx<a> {
                public byte[] a;
                public String b;
                public double c;
                public float d;
                public long e;
                public int f;
                public int g;
                public boolean h;
                public a[] i;
                public a[] j;
                public String[] k;
                public long[] l;
                public float[] m;
                public long n;

                public a() {
                    /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
*/
                    /*
                    r0 = this;
                    r0.<init>();
                    r0.b();
                    return;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ff.a.a.a.<init>():void");
                }

                protected int a() {
                    /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
*/
                    /*
                    r8 = this;
                    r6 = 0;
                    r1 = 0;
                    r0 = super.a();
                    r2 = r8.a;
                    r3 = com.google.android.gms.internal.rg.h;
                    r2 = java.util.Arrays.equals(r2, r3);
                    if (r2 != 0) goto L_0x0019;
                L_0x0011:
                    r2 = 1;
                    r3 = r8.a;
                    r2 = com.google.android.gms.internal.qw.b(r2, r3);
                    r0 = r0 + r2;
                L_0x0019:
                    r2 = r8.b;
                    r3 = "";
                    r2 = r2.equals(r3);
                    if (r2 != 0) goto L_0x002b;
                L_0x0023:
                    r2 = 2;
                    r3 = r8.b;
                    r2 = com.google.android.gms.internal.qw.b(r2, r3);
                    r0 = r0 + r2;
                L_0x002b:
                    r2 = r8.c;
                    r2 = java.lang.Double.doubleToLongBits(r2);
                    r4 = 0;
                    r4 = java.lang.Double.doubleToLongBits(r4);
                    r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
                    if (r2 == 0) goto L_0x0043;
                L_0x003b:
                    r2 = 3;
                    r4 = r8.c;
                    r2 = com.google.android.gms.internal.qw.b(r2, r4);
                    r0 = r0 + r2;
                L_0x0043:
                    r2 = r8.d;
                    r2 = java.lang.Float.floatToIntBits(r2);
                    r3 = 0;
                    r3 = java.lang.Float.floatToIntBits(r3);
                    if (r2 == r3) goto L_0x0058;
                L_0x0050:
                    r2 = 4;
                    r3 = r8.d;
                    r2 = com.google.android.gms.internal.qw.b(r2, r3);
                    r0 = r0 + r2;
                L_0x0058:
                    r2 = r8.e;
                    r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
                    if (r2 == 0) goto L_0x0066;
                L_0x005e:
                    r2 = 5;
                    r4 = r8.e;
                    r2 = com.google.android.gms.internal.qw.f(r2, r4);
                    r0 = r0 + r2;
                L_0x0066:
                    r2 = r8.f;
                    if (r2 == 0) goto L_0x0072;
                L_0x006a:
                    r2 = 6;
                    r3 = r8.f;
                    r2 = com.google.android.gms.internal.qw.c(r2, r3);
                    r0 = r0 + r2;
                L_0x0072:
                    r2 = r8.g;
                    if (r2 == 0) goto L_0x007e;
                L_0x0076:
                    r2 = 7;
                    r3 = r8.g;
                    r2 = com.google.android.gms.internal.qw.d(r2, r3);
                    r0 = r0 + r2;
                L_0x007e:
                    r2 = r8.h;
                    if (r2 == 0) goto L_0x008b;
                L_0x0082:
                    r2 = 8;
                    r3 = r8.h;
                    r2 = com.google.android.gms.internal.qw.b(r2, r3);
                    r0 = r0 + r2;
                L_0x008b:
                    r2 = r8.i;
                    if (r2 == 0) goto L_0x00ac;
                L_0x008f:
                    r2 = r8.i;
                    r2 = r2.length;
                    if (r2 <= 0) goto L_0x00ac;
                L_0x0094:
                    r2 = r0;
                    r0 = r1;
                L_0x0096:
                    r3 = r8.i;
                    r3 = r3.length;
                    if (r0 >= r3) goto L_0x00ab;
                L_0x009b:
                    r3 = r8.i;
                    r3 = r3[r0];
                    if (r3 == 0) goto L_0x00a8;
                L_0x00a1:
                    r4 = 9;
                    r3 = com.google.android.gms.internal.qw.c(r4, r3);
                    r2 = r2 + r3;
                L_0x00a8:
                    r0 = r0 + 1;
                    goto L_0x0096;
                L_0x00ab:
                    r0 = r2;
                L_0x00ac:
                    r2 = r8.j;
                    if (r2 == 0) goto L_0x00cd;
                L_0x00b0:
                    r2 = r8.j;
                    r2 = r2.length;
                    if (r2 <= 0) goto L_0x00cd;
                L_0x00b5:
                    r2 = r0;
                    r0 = r1;
                L_0x00b7:
                    r3 = r8.j;
                    r3 = r3.length;
                    if (r0 >= r3) goto L_0x00cc;
                L_0x00bc:
                    r3 = r8.j;
                    r3 = r3[r0];
                    if (r3 == 0) goto L_0x00c9;
                L_0x00c2:
                    r4 = 10;
                    r3 = com.google.android.gms.internal.qw.c(r4, r3);
                    r2 = r2 + r3;
                L_0x00c9:
                    r0 = r0 + 1;
                    goto L_0x00b7;
                L_0x00cc:
                    r0 = r2;
                L_0x00cd:
                    r2 = r8.k;
                    if (r2 == 0) goto L_0x00f2;
                L_0x00d1:
                    r2 = r8.k;
                    r2 = r2.length;
                    if (r2 <= 0) goto L_0x00f2;
                L_0x00d6:
                    r2 = r1;
                    r3 = r1;
                    r4 = r1;
                L_0x00d9:
                    r5 = r8.k;
                    r5 = r5.length;
                    if (r2 >= r5) goto L_0x00ee;
                L_0x00de:
                    r5 = r8.k;
                    r5 = r5[r2];
                    if (r5 == 0) goto L_0x00eb;
                L_0x00e4:
                    r4 = r4 + 1;
                    r5 = com.google.android.gms.internal.qw.b(r5);
                    r3 = r3 + r5;
                L_0x00eb:
                    r2 = r2 + 1;
                    goto L_0x00d9;
                L_0x00ee:
                    r0 = r0 + r3;
                    r2 = r4 * 1;
                    r0 = r0 + r2;
                L_0x00f2:
                    r2 = r8.l;
                    if (r2 == 0) goto L_0x0114;
                L_0x00f6:
                    r2 = r8.l;
                    r2 = r2.length;
                    if (r2 <= 0) goto L_0x0114;
                L_0x00fb:
                    r2 = r1;
                L_0x00fc:
                    r3 = r8.l;
                    r3 = r3.length;
                    if (r1 >= r3) goto L_0x010d;
                L_0x0101:
                    r3 = r8.l;
                    r4 = r3[r1];
                    r3 = com.google.android.gms.internal.qw.f(r4);
                    r2 = r2 + r3;
                    r1 = r1 + 1;
                    goto L_0x00fc;
                L_0x010d:
                    r0 = r0 + r2;
                    r1 = r8.l;
                    r1 = r1.length;
                    r1 = r1 * 1;
                    r0 = r0 + r1;
                L_0x0114:
                    r2 = r8.n;
                    r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
                    if (r1 == 0) goto L_0x0123;
                L_0x011a:
                    r1 = 13;
                    r2 = r8.n;
                    r1 = com.google.android.gms.internal.qw.f(r1, r2);
                    r0 = r0 + r1;
                L_0x0123:
                    r1 = r8.m;
                    if (r1 == 0) goto L_0x0138;
                L_0x0127:
                    r1 = r8.m;
                    r1 = r1.length;
                    if (r1 <= 0) goto L_0x0138;
                L_0x012c:
                    r1 = r8.m;
                    r1 = r1.length;
                    r1 = r1 * 4;
                    r0 = r0 + r1;
                    r1 = r8.m;
                    r1 = r1.length;
                    r1 = r1 * 1;
                    r0 = r0 + r1;
                L_0x0138:
                    return r0;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ff.a.a.a.a():int");
                }

                public com.google.android.gms.internal.ff.a.a.a a(com.google.android.gms.internal.qv r7) {
                    /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
*/
                    /*
                    r6 = this;
                    r1 = 0;
                L_0x0001:
                    r0 = r7.a();
                    switch(r0) {
                        case 0: goto L_0x000e;
                        case 10: goto L_0x000f;
                        case 18: goto L_0x0016;
                        case 25: goto L_0x001d;
                        case 37: goto L_0x0024;
                        case 40: goto L_0x002b;
                        case 48: goto L_0x0032;
                        case 56: goto L_0x0039;
                        case 64: goto L_0x0040;
                        case 74: goto L_0x0047;
                        case 82: goto L_0x0087;
                        case 90: goto L_0x00c7;
                        case 96: goto L_0x00fb;
                        case 98: goto L_0x012f;
                        case 104: goto L_0x0171;
                        case 114: goto L_0x01ad;
                        case 117: goto L_0x0179;
                        default: goto L_0x0008;
                    };
                L_0x0008:
                    r0 = super.a(r7, r0);
                    if (r0 != 0) goto L_0x0001;
                L_0x000e:
                    return r6;
                L_0x000f:
                    r0 = r7.k();
                    r6.a = r0;
                    goto L_0x0001;
                L_0x0016:
                    r0 = r7.j();
                    r6.b = r0;
                    goto L_0x0001;
                L_0x001d:
                    r2 = r7.c();
                    r6.c = r2;
                    goto L_0x0001;
                L_0x0024:
                    r0 = r7.d();
                    r6.d = r0;
                    goto L_0x0001;
                L_0x002b:
                    r2 = r7.f();
                    r6.e = r2;
                    goto L_0x0001;
                L_0x0032:
                    r0 = r7.g();
                    r6.f = r0;
                    goto L_0x0001;
                L_0x0039:
                    r0 = r7.l();
                    r6.g = r0;
                    goto L_0x0001;
                L_0x0040:
                    r0 = r7.i();
                    r6.h = r0;
                    goto L_0x0001;
                L_0x0047:
                    r0 = 74;
                    r2 = com.google.android.gms.internal.rg.b(r7, r0);
                    r0 = r6.i;
                    if (r0 != 0) goto L_0x0073;
                L_0x0051:
                    r0 = r1;
                L_0x0052:
                    r2 = r2 + r0;
                    r2 = new com.google.android.gms.internal.ff.a[r2];
                    if (r0 == 0) goto L_0x005c;
                L_0x0057:
                    r3 = r6.i;
                    java.lang.System.arraycopy(r3, r1, r2, r1, r0);
                L_0x005c:
                    r3 = r2.length;
                    r3 = r3 + -1;
                    if (r0 >= r3) goto L_0x0077;
                L_0x0061:
                    r3 = new com.google.android.gms.internal.ff$a;
                    r3.<init>();
                    r2[r0] = r3;
                    r3 = r2[r0];
                    r7.a(r3);
                    r7.a();
                    r0 = r0 + 1;
                    goto L_0x005c;
                L_0x0073:
                    r0 = r6.i;
                    r0 = r0.length;
                    goto L_0x0052;
                L_0x0077:
                    r3 = new com.google.android.gms.internal.ff$a;
                    r3.<init>();
                    r2[r0] = r3;
                    r0 = r2[r0];
                    r7.a(r0);
                    r6.i = r2;
                    goto L_0x0001;
                L_0x0087:
                    r0 = 82;
                    r2 = com.google.android.gms.internal.rg.b(r7, r0);
                    r0 = r6.j;
                    if (r0 != 0) goto L_0x00b3;
                L_0x0091:
                    r0 = r1;
                L_0x0092:
                    r2 = r2 + r0;
                    r2 = new com.google.android.gms.internal.ff.a.a[r2];
                    if (r0 == 0) goto L_0x009c;
                L_0x0097:
                    r3 = r6.j;
                    java.lang.System.arraycopy(r3, r1, r2, r1, r0);
                L_0x009c:
                    r3 = r2.length;
                    r3 = r3 + -1;
                    if (r0 >= r3) goto L_0x00b7;
                L_0x00a1:
                    r3 = new com.google.android.gms.internal.ff$a$a;
                    r3.<init>();
                    r2[r0] = r3;
                    r3 = r2[r0];
                    r7.a(r3);
                    r7.a();
                    r0 = r0 + 1;
                    goto L_0x009c;
                L_0x00b3:
                    r0 = r6.j;
                    r0 = r0.length;
                    goto L_0x0092;
                L_0x00b7:
                    r3 = new com.google.android.gms.internal.ff$a$a;
                    r3.<init>();
                    r2[r0] = r3;
                    r0 = r2[r0];
                    r7.a(r0);
                    r6.j = r2;
                    goto L_0x0001;
                L_0x00c7:
                    r0 = 90;
                    r2 = com.google.android.gms.internal.rg.b(r7, r0);
                    r0 = r6.k;
                    if (r0 != 0) goto L_0x00ed;
                L_0x00d1:
                    r0 = r1;
                L_0x00d2:
                    r2 = r2 + r0;
                    r2 = new java.lang.String[r2];
                    if (r0 == 0) goto L_0x00dc;
                L_0x00d7:
                    r3 = r6.k;
                    java.lang.System.arraycopy(r3, r1, r2, r1, r0);
                L_0x00dc:
                    r3 = r2.length;
                    r3 = r3 + -1;
                    if (r0 >= r3) goto L_0x00f1;
                L_0x00e1:
                    r3 = r7.j();
                    r2[r0] = r3;
                    r7.a();
                    r0 = r0 + 1;
                    goto L_0x00dc;
                L_0x00ed:
                    r0 = r6.k;
                    r0 = r0.length;
                    goto L_0x00d2;
                L_0x00f1:
                    r3 = r7.j();
                    r2[r0] = r3;
                    r6.k = r2;
                    goto L_0x0001;
                L_0x00fb:
                    r0 = 96;
                    r2 = com.google.android.gms.internal.rg.b(r7, r0);
                    r0 = r6.l;
                    if (r0 != 0) goto L_0x0121;
                L_0x0105:
                    r0 = r1;
                L_0x0106:
                    r2 = r2 + r0;
                    r2 = new long[r2];
                    if (r0 == 0) goto L_0x0110;
                L_0x010b:
                    r3 = r6.l;
                    java.lang.System.arraycopy(r3, r1, r2, r1, r0);
                L_0x0110:
                    r3 = r2.length;
                    r3 = r3 + -1;
                    if (r0 >= r3) goto L_0x0125;
                L_0x0115:
                    r4 = r7.f();
                    r2[r0] = r4;
                    r7.a();
                    r0 = r0 + 1;
                    goto L_0x0110;
                L_0x0121:
                    r0 = r6.l;
                    r0 = r0.length;
                    goto L_0x0106;
                L_0x0125:
                    r4 = r7.f();
                    r2[r0] = r4;
                    r6.l = r2;
                    goto L_0x0001;
                L_0x012f:
                    r0 = r7.n();
                    r3 = r7.d(r0);
                    r2 = r7.t();
                    r0 = r1;
                L_0x013c:
                    r4 = r7.r();
                    if (r4 <= 0) goto L_0x0148;
                L_0x0142:
                    r7.f();
                    r0 = r0 + 1;
                    goto L_0x013c;
                L_0x0148:
                    r7.f(r2);
                    r2 = r6.l;
                    if (r2 != 0) goto L_0x0166;
                L_0x014f:
                    r2 = r1;
                L_0x0150:
                    r0 = r0 + r2;
                    r0 = new long[r0];
                    if (r2 == 0) goto L_0x015a;
                L_0x0155:
                    r4 = r6.l;
                    java.lang.System.arraycopy(r4, r1, r0, r1, r2);
                L_0x015a:
                    r4 = r0.length;
                    if (r2 >= r4) goto L_0x016a;
                L_0x015d:
                    r4 = r7.f();
                    r0[r2] = r4;
                    r2 = r2 + 1;
                    goto L_0x015a;
                L_0x0166:
                    r2 = r6.l;
                    r2 = r2.length;
                    goto L_0x0150;
                L_0x016a:
                    r6.l = r0;
                    r7.e(r3);
                    goto L_0x0001;
                L_0x0171:
                    r2 = r7.f();
                    r6.n = r2;
                    goto L_0x0001;
                L_0x0179:
                    r0 = 117; // 0x75 float:1.64E-43 double:5.8E-322;
                    r2 = com.google.android.gms.internal.rg.b(r7, r0);
                    r0 = r6.m;
                    if (r0 != 0) goto L_0x019f;
                L_0x0183:
                    r0 = r1;
                L_0x0184:
                    r2 = r2 + r0;
                    r2 = new float[r2];
                    if (r0 == 0) goto L_0x018e;
                L_0x0189:
                    r3 = r6.m;
                    java.lang.System.arraycopy(r3, r1, r2, r1, r0);
                L_0x018e:
                    r3 = r2.length;
                    r3 = r3 + -1;
                    if (r0 >= r3) goto L_0x01a3;
                L_0x0193:
                    r3 = r7.d();
                    r2[r0] = r3;
                    r7.a();
                    r0 = r0 + 1;
                    goto L_0x018e;
                L_0x019f:
                    r0 = r6.m;
                    r0 = r0.length;
                    goto L_0x0184;
                L_0x01a3:
                    r3 = r7.d();
                    r2[r0] = r3;
                    r6.m = r2;
                    goto L_0x0001;
                L_0x01ad:
                    r0 = r7.n();
                    r2 = r7.d(r0);
                    r3 = r0 / 4;
                    r0 = r6.m;
                    if (r0 != 0) goto L_0x01d2;
                L_0x01bb:
                    r0 = r1;
                L_0x01bc:
                    r3 = r3 + r0;
                    r3 = new float[r3];
                    if (r0 == 0) goto L_0x01c6;
                L_0x01c1:
                    r4 = r6.m;
                    java.lang.System.arraycopy(r4, r1, r3, r1, r0);
                L_0x01c6:
                    r4 = r3.length;
                    if (r0 >= r4) goto L_0x01d6;
                L_0x01c9:
                    r4 = r7.d();
                    r3[r0] = r4;
                    r0 = r0 + 1;
                    goto L_0x01c6;
                L_0x01d2:
                    r0 = r6.m;
                    r0 = r0.length;
                    goto L_0x01bc;
                L_0x01d6:
                    r6.m = r3;
                    r7.e(r2);
                    goto L_0x0001;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ff.a.a.a.a(com.google.android.gms.internal.qv):com.google.android.gms.internal.ff$a$a$a");
                }

                public void a(com.google.android.gms.internal.qw r9) {
                    /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
*/
                    /*
                    r8 = this;
                    r6 = 0;
                    r1 = 0;
                    r0 = r8.a;
                    r2 = com.google.android.gms.internal.rg.h;
                    r0 = java.util.Arrays.equals(r0, r2);
                    if (r0 != 0) goto L_0x0013;
                L_0x000d:
                    r0 = 1;
                    r2 = r8.a;
                    r9.a(r0, r2);
                L_0x0013:
                    r0 = r8.b;
                    r2 = "";
                    r0 = r0.equals(r2);
                    if (r0 != 0) goto L_0x0023;
                L_0x001d:
                    r0 = 2;
                    r2 = r8.b;
                    r9.a(r0, r2);
                L_0x0023:
                    r2 = r8.c;
                    r2 = java.lang.Double.doubleToLongBits(r2);
                    r4 = 0;
                    r4 = java.lang.Double.doubleToLongBits(r4);
                    r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
                    if (r0 == 0) goto L_0x0039;
                L_0x0033:
                    r0 = 3;
                    r2 = r8.c;
                    r9.a(r0, r2);
                L_0x0039:
                    r0 = r8.d;
                    r0 = java.lang.Float.floatToIntBits(r0);
                    r2 = 0;
                    r2 = java.lang.Float.floatToIntBits(r2);
                    if (r0 == r2) goto L_0x004c;
                L_0x0046:
                    r0 = 4;
                    r2 = r8.d;
                    r9.a(r0, r2);
                L_0x004c:
                    r2 = r8.e;
                    r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
                    if (r0 == 0) goto L_0x0058;
                L_0x0052:
                    r0 = 5;
                    r2 = r8.e;
                    r9.b(r0, r2);
                L_0x0058:
                    r0 = r8.f;
                    if (r0 == 0) goto L_0x0062;
                L_0x005c:
                    r0 = 6;
                    r2 = r8.f;
                    r9.a(r0, r2);
                L_0x0062:
                    r0 = r8.g;
                    if (r0 == 0) goto L_0x006c;
                L_0x0066:
                    r0 = 7;
                    r2 = r8.g;
                    r9.b(r0, r2);
                L_0x006c:
                    r0 = r8.h;
                    if (r0 == 0) goto L_0x0077;
                L_0x0070:
                    r0 = 8;
                    r2 = r8.h;
                    r9.a(r0, r2);
                L_0x0077:
                    r0 = r8.i;
                    if (r0 == 0) goto L_0x0094;
                L_0x007b:
                    r0 = r8.i;
                    r0 = r0.length;
                    if (r0 <= 0) goto L_0x0094;
                L_0x0080:
                    r0 = r1;
                L_0x0081:
                    r2 = r8.i;
                    r2 = r2.length;
                    if (r0 >= r2) goto L_0x0094;
                L_0x0086:
                    r2 = r8.i;
                    r2 = r2[r0];
                    if (r2 == 0) goto L_0x0091;
                L_0x008c:
                    r3 = 9;
                    r9.a(r3, r2);
                L_0x0091:
                    r0 = r0 + 1;
                    goto L_0x0081;
                L_0x0094:
                    r0 = r8.j;
                    if (r0 == 0) goto L_0x00b1;
                L_0x0098:
                    r0 = r8.j;
                    r0 = r0.length;
                    if (r0 <= 0) goto L_0x00b1;
                L_0x009d:
                    r0 = r1;
                L_0x009e:
                    r2 = r8.j;
                    r2 = r2.length;
                    if (r0 >= r2) goto L_0x00b1;
                L_0x00a3:
                    r2 = r8.j;
                    r2 = r2[r0];
                    if (r2 == 0) goto L_0x00ae;
                L_0x00a9:
                    r3 = 10;
                    r9.a(r3, r2);
                L_0x00ae:
                    r0 = r0 + 1;
                    goto L_0x009e;
                L_0x00b1:
                    r0 = r8.k;
                    if (r0 == 0) goto L_0x00ce;
                L_0x00b5:
                    r0 = r8.k;
                    r0 = r0.length;
                    if (r0 <= 0) goto L_0x00ce;
                L_0x00ba:
                    r0 = r1;
                L_0x00bb:
                    r2 = r8.k;
                    r2 = r2.length;
                    if (r0 >= r2) goto L_0x00ce;
                L_0x00c0:
                    r2 = r8.k;
                    r2 = r2[r0];
                    if (r2 == 0) goto L_0x00cb;
                L_0x00c6:
                    r3 = 11;
                    r9.a(r3, r2);
                L_0x00cb:
                    r0 = r0 + 1;
                    goto L_0x00bb;
                L_0x00ce:
                    r0 = r8.l;
                    if (r0 == 0) goto L_0x00e9;
                L_0x00d2:
                    r0 = r8.l;
                    r0 = r0.length;
                    if (r0 <= 0) goto L_0x00e9;
                L_0x00d7:
                    r0 = r1;
                L_0x00d8:
                    r2 = r8.l;
                    r2 = r2.length;
                    if (r0 >= r2) goto L_0x00e9;
                L_0x00dd:
                    r2 = 12;
                    r3 = r8.l;
                    r4 = r3[r0];
                    r9.b(r2, r4);
                    r0 = r0 + 1;
                    goto L_0x00d8;
                L_0x00e9:
                    r2 = r8.n;
                    r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
                    if (r0 == 0) goto L_0x00f6;
                L_0x00ef:
                    r0 = 13;
                    r2 = r8.n;
                    r9.b(r0, r2);
                L_0x00f6:
                    r0 = r8.m;
                    if (r0 == 0) goto L_0x0110;
                L_0x00fa:
                    r0 = r8.m;
                    r0 = r0.length;
                    if (r0 <= 0) goto L_0x0110;
                L_0x00ff:
                    r0 = r8.m;
                    r0 = r0.length;
                    if (r1 >= r0) goto L_0x0110;
                L_0x0104:
                    r0 = 14;
                    r2 = r8.m;
                    r2 = r2[r1];
                    r9.a(r0, r2);
                    r1 = r1 + 1;
                    goto L_0x00ff;
                L_0x0110:
                    super.a(r9);
                    return;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ff.a.a.a.a(com.google.android.gms.internal.qw):void");
                }

                public com.google.android.gms.internal.ff.a.a.a b() {
                    /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
*/
                    /*
                    r6 = this;
                    r4 = 0;
                    r2 = 0;
                    r0 = com.google.android.gms.internal.rg.h;
                    r6.a = r0;
                    r0 = "";
                    r6.b = r0;
                    r0 = 0;
                    r6.c = r0;
                    r0 = 0;
                    r6.d = r0;
                    r6.e = r4;
                    r6.f = r2;
                    r6.g = r2;
                    r6.h = r2;
                    r0 = com.google.android.gms.internal.ff.a.b();
                    r6.i = r0;
                    r0 = com.google.android.gms.internal.ff.a.a.b();
                    r6.j = r0;
                    r0 = com.google.android.gms.internal.rg.f;
                    r6.k = r0;
                    r0 = com.google.android.gms.internal.rg.b;
                    r6.l = r0;
                    r0 = com.google.android.gms.internal.rg.c;
                    r6.m = r0;
                    r6.n = r4;
                    r0 = 0;
                    r6.ag = r0;
                    r0 = -1;
                    r6.ah = r0;
                    return r6;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ff.a.a.a.b():com.google.android.gms.internal.ff$a$a$a");
                }

                public /* synthetic */ com.google.android.gms.internal.rd b(com.google.android.gms.internal.qv r2) {
                    /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
*/
                    /*
                    r1 = this;
                    r0 = r1.a(r2);
                    return r0;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ff.a.a.a.b(com.google.android.gms.internal.qv):com.google.android.gms.internal.rd");
                }

                public boolean equals(java.lang.Object r7) {
                    /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
*/
                    /*
                    r6 = this;
                    r1 = 1;
                    r0 = 0;
                    if (r7 != r6) goto L_0x0006;
                L_0x0004:
                    r0 = r1;
                L_0x0005:
                    return r0;
                L_0x0006:
                    r2 = r7 instanceof com.google.android.gms.internal.ff.a.a.a;
                    if (r2 == 0) goto L_0x0005;
                L_0x000a:
                    r7 = (com.google.android.gms.internal.ff.a.a.a) r7;
                    r2 = r6.a;
                    r3 = r7.a;
                    r2 = java.util.Arrays.equals(r2, r3);
                    if (r2 == 0) goto L_0x0005;
                L_0x0016:
                    r2 = r6.b;
                    if (r2 != 0) goto L_0x00ab;
                L_0x001a:
                    r2 = r7.b;
                    if (r2 != 0) goto L_0x0005;
                L_0x001e:
                    r2 = r6.c;
                    r2 = java.lang.Double.doubleToLongBits(r2);
                    r4 = r7.c;
                    r4 = java.lang.Double.doubleToLongBits(r4);
                    r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
                    if (r2 != 0) goto L_0x0005;
                L_0x002e:
                    r2 = r6.d;
                    r2 = java.lang.Float.floatToIntBits(r2);
                    r3 = r7.d;
                    r3 = java.lang.Float.floatToIntBits(r3);
                    if (r2 != r3) goto L_0x0005;
                L_0x003c:
                    r2 = r6.e;
                    r4 = r7.e;
                    r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
                    if (r2 != 0) goto L_0x0005;
                L_0x0044:
                    r2 = r6.f;
                    r3 = r7.f;
                    if (r2 != r3) goto L_0x0005;
                L_0x004a:
                    r2 = r6.g;
                    r3 = r7.g;
                    if (r2 != r3) goto L_0x0005;
                L_0x0050:
                    r2 = r6.h;
                    r3 = r7.h;
                    if (r2 != r3) goto L_0x0005;
                L_0x0056:
                    r2 = r6.i;
                    r3 = r7.i;
                    r2 = com.google.android.gms.internal.rb.a(r2, r3);
                    if (r2 == 0) goto L_0x0005;
                L_0x0060:
                    r2 = r6.j;
                    r3 = r7.j;
                    r2 = com.google.android.gms.internal.rb.a(r2, r3);
                    if (r2 == 0) goto L_0x0005;
                L_0x006a:
                    r2 = r6.k;
                    r3 = r7.k;
                    r2 = com.google.android.gms.internal.rb.a(r2, r3);
                    if (r2 == 0) goto L_0x0005;
                L_0x0074:
                    r2 = r6.l;
                    r3 = r7.l;
                    r2 = com.google.android.gms.internal.rb.a(r2, r3);
                    if (r2 == 0) goto L_0x0005;
                L_0x007e:
                    r2 = r6.m;
                    r3 = r7.m;
                    r2 = com.google.android.gms.internal.rb.a(r2, r3);
                    if (r2 == 0) goto L_0x0005;
                L_0x0088:
                    r2 = r6.n;
                    r4 = r7.n;
                    r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
                    if (r2 != 0) goto L_0x0005;
                L_0x0090:
                    r2 = r6.ag;
                    if (r2 == 0) goto L_0x009c;
                L_0x0094:
                    r2 = r6.ag;
                    r2 = r2.b();
                    if (r2 == 0) goto L_0x00b7;
                L_0x009c:
                    r2 = r7.ag;
                    if (r2 == 0) goto L_0x00a8;
                L_0x00a0:
                    r2 = r7.ag;
                    r2 = r2.b();
                    if (r2 == 0) goto L_0x0005;
                L_0x00a8:
                    r0 = r1;
                    goto L_0x0005;
                L_0x00ab:
                    r2 = r6.b;
                    r3 = r7.b;
                    r2 = r2.equals(r3);
                    if (r2 != 0) goto L_0x001e;
                L_0x00b5:
                    goto L_0x0005;
                L_0x00b7:
                    r0 = r6.ag;
                    r1 = r7.ag;
                    r0 = r0.equals(r1);
                    goto L_0x0005;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ff.a.a.a.equals(java.lang.Object):boolean");
                }

                public int hashCode() {
                    /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
*/
                    /*
                    r7 = this;
                    r1 = 0;
                    r6 = 32;
                    r0 = r7.getClass();
                    r0 = r0.getName();
                    r0 = r0.hashCode();
                    r0 = r0 + 527;
                    r0 = r0 * 31;
                    r2 = r7.a;
                    r2 = java.util.Arrays.hashCode(r2);
                    r0 = r0 + r2;
                    r2 = r0 * 31;
                    r0 = r7.b;
                    if (r0 != 0) goto L_0x009c;
                L_0x0020:
                    r0 = r1;
                L_0x0021:
                    r0 = r0 + r2;
                    r2 = r7.c;
                    r2 = java.lang.Double.doubleToLongBits(r2);
                    r0 = r0 * 31;
                    r4 = r2 >>> r6;
                    r2 = r2 ^ r4;
                    r2 = (int) r2;
                    r0 = r0 + r2;
                    r0 = r0 * 31;
                    r2 = r7.d;
                    r2 = java.lang.Float.floatToIntBits(r2);
                    r0 = r0 + r2;
                    r0 = r0 * 31;
                    r2 = r7.e;
                    r4 = r7.e;
                    r4 = r4 >>> r6;
                    r2 = r2 ^ r4;
                    r2 = (int) r2;
                    r0 = r0 + r2;
                    r0 = r0 * 31;
                    r2 = r7.f;
                    r0 = r0 + r2;
                    r0 = r0 * 31;
                    r2 = r7.g;
                    r0 = r0 + r2;
                    r2 = r0 * 31;
                    r0 = r7.h;
                    if (r0 == 0) goto L_0x00a4;
                L_0x0052:
                    r0 = 1231; // 0x4cf float:1.725E-42 double:6.08E-321;
                L_0x0054:
                    r0 = r0 + r2;
                    r0 = r0 * 31;
                    r2 = r7.i;
                    r2 = com.google.android.gms.internal.rb.a(r2);
                    r0 = r0 + r2;
                    r0 = r0 * 31;
                    r2 = r7.j;
                    r2 = com.google.android.gms.internal.rb.a(r2);
                    r0 = r0 + r2;
                    r0 = r0 * 31;
                    r2 = r7.k;
                    r2 = com.google.android.gms.internal.rb.a(r2);
                    r0 = r0 + r2;
                    r0 = r0 * 31;
                    r2 = r7.l;
                    r2 = com.google.android.gms.internal.rb.a(r2);
                    r0 = r0 + r2;
                    r0 = r0 * 31;
                    r2 = r7.m;
                    r2 = com.google.android.gms.internal.rb.a(r2);
                    r0 = r0 + r2;
                    r0 = r0 * 31;
                    r2 = r7.n;
                    r4 = r7.n;
                    r4 = r4 >>> r6;
                    r2 = r2 ^ r4;
                    r2 = (int) r2;
                    r0 = r0 + r2;
                    r0 = r0 * 31;
                    r2 = r7.ag;
                    if (r2 == 0) goto L_0x009a;
                L_0x0092:
                    r2 = r7.ag;
                    r2 = r2.b();
                    if (r2 == 0) goto L_0x00a7;
                L_0x009a:
                    r0 = r0 + r1;
                    return r0;
                L_0x009c:
                    r0 = r7.b;
                    r0 = r0.hashCode();
                    goto L_0x0021;
                L_0x00a4:
                    r0 = 1237; // 0x4d5 float:1.733E-42 double:6.11E-321;
                    goto L_0x0054;
                L_0x00a7:
                    r1 = r7.ag;
                    r1 = r1.hashCode();
                    goto L_0x009a;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ff.a.a.a.hashCode():int");
                }
            }

            public a() {
                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
*/
                /*
                r0 = this;
                r0.<init>();
                r0.c();
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ff.a.a.<init>():void");
            }

            public static com.google.android.gms.internal.ff.a.a[] b() {
                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
*/
                /*
                r0 = c;
                if (r0 != 0) goto L_0x0011;
            L_0x0004:
                r1 = com.google.android.gms.internal.rb.c;
                monitor-enter(r1);
                r0 = c;
                if (r0 != 0) goto L_0x0010;
            L_0x000b:
                r0 = 0;
                r0 = new com.google.android.gms.internal.ff.a.a[r0];
                c = r0;
            L_0x0010:
                monitor-exit(r1);
            L_0x0011:
                r0 = c;
                return r0;
            L_0x0014:
                r0 = move-exception;
                monitor-exit(r1);
                throw r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ff.a.a.b():com.google.android.gms.internal.ff$a$a[]");
            }

            protected int a() {
                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
*/
                /*
                r3 = this;
                r0 = super.a();
                r1 = 1;
                r2 = r3.a;
                r1 = com.google.android.gms.internal.qw.c(r1, r2);
                r0 = r0 + r1;
                r1 = r3.b;
                if (r1 == 0) goto L_0x0018;
            L_0x0010:
                r1 = 2;
                r2 = r3.b;
                r1 = com.google.android.gms.internal.qw.c(r1, r2);
                r0 = r0 + r1;
            L_0x0018:
                return r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ff.a.a.a():int");
            }

            public com.google.android.gms.internal.ff.a.a a(com.google.android.gms.internal.qv r2) {
                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
*/
                /*
                r1 = this;
            L_0x0000:
                r0 = r2.a();
                switch(r0) {
                    case 0: goto L_0x000d;
                    case 8: goto L_0x000e;
                    case 18: goto L_0x0019;
                    default: goto L_0x0007;
                };
            L_0x0007:
                r0 = super.a(r2, r0);
                if (r0 != 0) goto L_0x0000;
            L_0x000d:
                return r1;
            L_0x000e:
                r0 = r2.g();
                switch(r0) {
                    case 1: goto L_0x0016;
                    case 2: goto L_0x0016;
                    case 3: goto L_0x0016;
                    case 4: goto L_0x0016;
                    case 5: goto L_0x0016;
                    case 6: goto L_0x0016;
                    case 7: goto L_0x0016;
                    case 8: goto L_0x0016;
                    case 9: goto L_0x0016;
                    case 10: goto L_0x0016;
                    case 11: goto L_0x0016;
                    case 12: goto L_0x0016;
                    case 13: goto L_0x0016;
                    case 14: goto L_0x0016;
                    case 15: goto L_0x0016;
                    default: goto L_0x0015;
                };
            L_0x0015:
                goto L_0x0000;
            L_0x0016:
                r1.a = r0;
                goto L_0x0000;
            L_0x0019:
                r0 = r1.b;
                if (r0 != 0) goto L_0x0024;
            L_0x001d:
                r0 = new com.google.android.gms.internal.ff$a$a$a;
                r0.<init>();
                r1.b = r0;
            L_0x0024:
                r0 = r1.b;
                r2.a(r0);
                goto L_0x0000;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ff.a.a.a(com.google.android.gms.internal.qv):com.google.android.gms.internal.ff$a$a");
            }

            public void a(com.google.android.gms.internal.qw r3) {
                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
*/
                /*
                r2 = this;
                r0 = 1;
                r1 = r2.a;
                r3.a(r0, r1);
                r0 = r2.b;
                if (r0 == 0) goto L_0x0010;
            L_0x000a:
                r0 = 2;
                r1 = r2.b;
                r3.a(r0, r1);
            L_0x0010:
                super.a(r3);
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ff.a.a.a(com.google.android.gms.internal.qw):void");
            }

            public /* synthetic */ com.google.android.gms.internal.rd b(com.google.android.gms.internal.qv r2) {
                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
*/
                /*
                r1 = this;
                r0 = r1.a(r2);
                return r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ff.a.a.b(com.google.android.gms.internal.qv):com.google.android.gms.internal.rd");
            }

            public com.google.android.gms.internal.ff.a.a c() {
                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
*/
                /*
                r2 = this;
                r1 = 0;
                r0 = 1;
                r2.a = r0;
                r2.b = r1;
                r2.ag = r1;
                r0 = -1;
                r2.ah = r0;
                return r2;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ff.a.a.c():com.google.android.gms.internal.ff$a$a");
            }

            public boolean equals(java.lang.Object r5) {
                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
*/
                /*
                r4 = this;
                r1 = 1;
                r0 = 0;
                if (r5 != r4) goto L_0x0006;
            L_0x0004:
                r0 = r1;
            L_0x0005:
                return r0;
            L_0x0006:
                r2 = r5 instanceof com.google.android.gms.internal.ff.a.a;
                if (r2 == 0) goto L_0x0005;
            L_0x000a:
                r5 = (com.google.android.gms.internal.ff.a.a) r5;
                r2 = r4.a;
                r3 = r5.a;
                if (r2 != r3) goto L_0x0005;
            L_0x0012:
                r2 = r4.b;
                if (r2 != 0) goto L_0x0034;
            L_0x0016:
                r2 = r5.b;
                if (r2 != 0) goto L_0x0005;
            L_0x001a:
                r2 = r4.ag;
                if (r2 == 0) goto L_0x0026;
            L_0x001e:
                r2 = r4.ag;
                r2 = r2.b();
                if (r2 == 0) goto L_0x003f;
            L_0x0026:
                r2 = r5.ag;
                if (r2 == 0) goto L_0x0032;
            L_0x002a:
                r2 = r5.ag;
                r2 = r2.b();
                if (r2 == 0) goto L_0x0005;
            L_0x0032:
                r0 = r1;
                goto L_0x0005;
            L_0x0034:
                r2 = r4.b;
                r3 = r5.b;
                r2 = r2.equals(r3);
                if (r2 != 0) goto L_0x001a;
            L_0x003e:
                goto L_0x0005;
            L_0x003f:
                r0 = r4.ag;
                r1 = r5.ag;
                r0 = r0.equals(r1);
                goto L_0x0005;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ff.a.a.equals(java.lang.Object):boolean");
            }

            public int hashCode() {
                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
*/
                /*
                r3 = this;
                r1 = 0;
                r0 = r3.getClass();
                r0 = r0.getName();
                r0 = r0.hashCode();
                r0 = r0 + 527;
                r0 = r0 * 31;
                r2 = r3.a;
                r0 = r0 + r2;
                r2 = r0 * 31;
                r0 = r3.b;
                if (r0 != 0) goto L_0x002c;
            L_0x001a:
                r0 = r1;
            L_0x001b:
                r0 = r0 + r2;
                r0 = r0 * 31;
                r2 = r3.ag;
                if (r2 == 0) goto L_0x002a;
            L_0x0022:
                r2 = r3.ag;
                r2 = r2.b();
                if (r2 == 0) goto L_0x0033;
            L_0x002a:
                r0 = r0 + r1;
                return r0;
            L_0x002c:
                r0 = r3.b;
                r0 = r0.hashCode();
                goto L_0x001b;
            L_0x0033:
                r1 = r3.ag;
                r1 = r1.hashCode();
                goto L_0x002a;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ff.a.a.hashCode():int");
            }
        }

        public a() {
            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
*/
            /*
            r0 = this;
            r0.<init>();
            r0.c();
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ff.a.<init>():void");
        }

        public static com.google.android.gms.internal.ff.a[] b() {
            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
*/
            /*
            r0 = c;
            if (r0 != 0) goto L_0x0011;
        L_0x0004:
            r1 = com.google.android.gms.internal.rb.c;
            monitor-enter(r1);
            r0 = c;
            if (r0 != 0) goto L_0x0010;
        L_0x000b:
            r0 = 0;
            r0 = new com.google.android.gms.internal.ff.a[r0];
            c = r0;
        L_0x0010:
            monitor-exit(r1);
        L_0x0011:
            r0 = c;
            return r0;
        L_0x0014:
            r0 = move-exception;
            monitor-exit(r1);
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ff.a.b():com.google.android.gms.internal.ff$a[]");
        }

        protected int a() {
            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
*/
            /*
            r3 = this;
            r0 = super.a();
            r1 = 1;
            r2 = r3.a;
            r1 = com.google.android.gms.internal.qw.b(r1, r2);
            r0 = r0 + r1;
            r1 = r3.b;
            if (r1 == 0) goto L_0x0018;
        L_0x0010:
            r1 = 2;
            r2 = r3.b;
            r1 = com.google.android.gms.internal.qw.c(r1, r2);
            r0 = r0 + r1;
        L_0x0018:
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ff.a.a():int");
        }

        public com.google.android.gms.internal.ff.a a(com.google.android.gms.internal.qv r2) {
            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
*/
            /*
            r1 = this;
        L_0x0000:
            r0 = r2.a();
            switch(r0) {
                case 0: goto L_0x000d;
                case 10: goto L_0x000e;
                case 18: goto L_0x0015;
                default: goto L_0x0007;
            };
        L_0x0007:
            r0 = super.a(r2, r0);
            if (r0 != 0) goto L_0x0000;
        L_0x000d:
            return r1;
        L_0x000e:
            r0 = r2.j();
            r1.a = r0;
            goto L_0x0000;
        L_0x0015:
            r0 = r1.b;
            if (r0 != 0) goto L_0x0020;
        L_0x0019:
            r0 = new com.google.android.gms.internal.ff$a$a;
            r0.<init>();
            r1.b = r0;
        L_0x0020:
            r0 = r1.b;
            r2.a(r0);
            goto L_0x0000;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ff.a.a(com.google.android.gms.internal.qv):com.google.android.gms.internal.ff$a");
        }

        public void a(com.google.android.gms.internal.qw r3) {
            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
*/
            /*
            r2 = this;
            r0 = 1;
            r1 = r2.a;
            r3.a(r0, r1);
            r0 = r2.b;
            if (r0 == 0) goto L_0x0010;
        L_0x000a:
            r0 = 2;
            r1 = r2.b;
            r3.a(r0, r1);
        L_0x0010:
            super.a(r3);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ff.a.a(com.google.android.gms.internal.qw):void");
        }

        public /* synthetic */ com.google.android.gms.internal.rd b(com.google.android.gms.internal.qv r2) {
            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
*/
            /*
            r1 = this;
            r0 = r1.a(r2);
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ff.a.b(com.google.android.gms.internal.qv):com.google.android.gms.internal.rd");
        }

        public com.google.android.gms.internal.ff.a c() {
            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
*/
            /*
            r2 = this;
            r1 = 0;
            r0 = "";
            r2.a = r0;
            r2.b = r1;
            r2.ag = r1;
            r0 = -1;
            r2.ah = r0;
            return r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ff.a.c():com.google.android.gms.internal.ff$a");
        }

        public boolean equals(java.lang.Object r5) {
            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
*/
            /*
            r4 = this;
            r1 = 1;
            r0 = 0;
            if (r5 != r4) goto L_0x0006;
        L_0x0004:
            r0 = r1;
        L_0x0005:
            return r0;
        L_0x0006:
            r2 = r5 instanceof com.google.android.gms.internal.ff.a;
            if (r2 == 0) goto L_0x0005;
        L_0x000a:
            r5 = (com.google.android.gms.internal.ff.a) r5;
            r2 = r4.a;
            if (r2 != 0) goto L_0x0036;
        L_0x0010:
            r2 = r5.a;
            if (r2 != 0) goto L_0x0005;
        L_0x0014:
            r2 = r4.b;
            if (r2 != 0) goto L_0x0041;
        L_0x0018:
            r2 = r5.b;
            if (r2 != 0) goto L_0x0005;
        L_0x001c:
            r2 = r4.ag;
            if (r2 == 0) goto L_0x0028;
        L_0x0020:
            r2 = r4.ag;
            r2 = r2.b();
            if (r2 == 0) goto L_0x004c;
        L_0x0028:
            r2 = r5.ag;
            if (r2 == 0) goto L_0x0034;
        L_0x002c:
            r2 = r5.ag;
            r2 = r2.b();
            if (r2 == 0) goto L_0x0005;
        L_0x0034:
            r0 = r1;
            goto L_0x0005;
        L_0x0036:
            r2 = r4.a;
            r3 = r5.a;
            r2 = r2.equals(r3);
            if (r2 != 0) goto L_0x0014;
        L_0x0040:
            goto L_0x0005;
        L_0x0041:
            r2 = r4.b;
            r3 = r5.b;
            r2 = r2.equals(r3);
            if (r2 != 0) goto L_0x001c;
        L_0x004b:
            goto L_0x0005;
        L_0x004c:
            r0 = r4.ag;
            r1 = r5.ag;
            r0 = r0.equals(r1);
            goto L_0x0005;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ff.a.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
*/
            /*
            r3 = this;
            r1 = 0;
            r0 = r3.getClass();
            r0 = r0.getName();
            r0 = r0.hashCode();
            r0 = r0 + 527;
            r2 = r0 * 31;
            r0 = r3.a;
            if (r0 != 0) goto L_0x002f;
        L_0x0015:
            r0 = r1;
        L_0x0016:
            r0 = r0 + r2;
            r2 = r0 * 31;
            r0 = r3.b;
            if (r0 != 0) goto L_0x0036;
        L_0x001d:
            r0 = r1;
        L_0x001e:
            r0 = r0 + r2;
            r0 = r0 * 31;
            r2 = r3.ag;
            if (r2 == 0) goto L_0x002d;
        L_0x0025:
            r2 = r3.ag;
            r2 = r2.b();
            if (r2 == 0) goto L_0x003d;
        L_0x002d:
            r0 = r0 + r1;
            return r0;
        L_0x002f:
            r0 = r3.a;
            r0 = r0.hashCode();
            goto L_0x0016;
        L_0x0036:
            r0 = r3.b;
            r0 = r0.hashCode();
            goto L_0x001e;
        L_0x003d:
            r1 = r3.ag;
            r1 = r1.hashCode();
            goto L_0x002d;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ff.a.hashCode():int");
        }
    }

    public ff() {
        b();
    }

    public static ff a(byte[] bArr) {
        return (ff) rd.a(new ff(), bArr);
    }

    protected int a() {
        int a = super.a();
        if (this.a != null && this.a.length > 0) {
            for (rd rdVar : this.a) {
                if (rdVar != null) {
                    a += qw.c(1, rdVar);
                }
            }
        }
        return a;
    }

    public ff a(qv qvVar) {
        while (true) {
            int a = qvVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = rg.b(qvVar, 10);
                    a = this.a == null ? 0 : this.a.length;
                    Object obj = new a[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new a();
                        qvVar.a(obj[a]);
                        qvVar.a();
                        a++;
                    }
                    obj[a] = new a();
                    qvVar.a(obj[a]);
                    this.a = obj;
                    continue;
                default:
                    if (!super.a(qvVar, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }

    public void a(qw qwVar) {
        if (this.a != null && this.a.length > 0) {
            for (rd rdVar : this.a) {
                if (rdVar != null) {
                    qwVar.a(1, rdVar);
                }
            }
        }
        super.a(qwVar);
    }

    public ff b() {
        this.a = a.b();
        this.ag = null;
        this.ah = -1;
        return this;
    }

    public /* synthetic */ rd b(qv qvVar) {
        return a(qvVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ff)) {
            return false;
        }
        ff ffVar = (ff) obj;
        return rb.a(this.a, ffVar.a) ? (this.ag == null || this.ag.b()) ? ffVar.ag == null || ffVar.ag.b() : this.ag.equals(ffVar.ag) : false;
    }

    public int hashCode() {
        int hashCode = (((getClass().getName().hashCode() + 527) * 31) + rb.a(this.a)) * 31;
        int hashCode2 = (this.ag == null || this.ag.b()) ? 0 : this.ag.hashCode();
        return hashCode2 + hashCode;
    }
}
