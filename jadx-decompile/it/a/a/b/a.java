package it.a.a.b;

public class a extends b {
    private static final Object a = new Object();
    private static a b = null;

    private a() {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:37)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:61)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
*/
        /*
        r6 = this;
        r6.<init>();
        r1 = 0;
        r0 = new java.io.BufferedReader;	 Catch:{ Exception -> 0x004e, all -> 0x0038 }
        r2 = new java.io.InputStreamReader;	 Catch:{ Exception -> 0x004e, all -> 0x0038 }
        r3 = r6.getClass();	 Catch:{ Exception -> 0x004e, all -> 0x0038 }
        r4 = "textualexts";	 Catch:{ Exception -> 0x004e, all -> 0x0038 }
        r3 = r3.getResourceAsStream(r4);	 Catch:{ Exception -> 0x004e, all -> 0x0038 }
        r2.<init>(r3);	 Catch:{ Exception -> 0x004e, all -> 0x0038 }
        r0.<init>(r2);	 Catch:{ Exception -> 0x004e, all -> 0x0038 }
    L_0x0018:
        r1 = r0.readLine();	 Catch:{ Exception -> 0x0031, all -> 0x0049 }
        if (r1 == 0) goto L_0x0043;	 Catch:{ Exception -> 0x0031, all -> 0x0049 }
    L_0x001e:
        r2 = new java.util.StringTokenizer;	 Catch:{ Exception -> 0x0031, all -> 0x0049 }
        r2.<init>(r1);	 Catch:{ Exception -> 0x0031, all -> 0x0049 }
    L_0x0023:
        r1 = r2.hasMoreTokens();	 Catch:{ Exception -> 0x0031, all -> 0x0049 }
        if (r1 == 0) goto L_0x0018;	 Catch:{ Exception -> 0x0031, all -> 0x0049 }
    L_0x0029:
        r1 = r2.nextToken();	 Catch:{ Exception -> 0x0031, all -> 0x0049 }
        r6.b(r1);	 Catch:{ Exception -> 0x0031, all -> 0x0049 }
        goto L_0x0023;
    L_0x0031:
        r1 = move-exception;
    L_0x0032:
        if (r0 == 0) goto L_0x0037;
    L_0x0034:
        r0.close();	 Catch:{ Throwable -> 0x003f }
    L_0x0037:
        return;
    L_0x0038:
        r0 = move-exception;
    L_0x0039:
        if (r1 == 0) goto L_0x003e;
    L_0x003b:
        r1.close();	 Catch:{ Throwable -> 0x0041 }
    L_0x003e:
        throw r0;
    L_0x003f:
        r0 = move-exception;
        goto L_0x0037;
    L_0x0041:
        r1 = move-exception;
        goto L_0x003e;
    L_0x0043:
        if (r0 == 0) goto L_0x0037;
    L_0x0045:
        r0.close();	 Catch:{ Throwable -> 0x003f }
        goto L_0x0037;
    L_0x0049:
        r1 = move-exception;
        r5 = r1;
        r1 = r0;
        r0 = r5;
        goto L_0x0039;
    L_0x004e:
        r0 = move-exception;
        r0 = r1;
        goto L_0x0032;
        */
        throw new UnsupportedOperationException("Method not decompiled: it.a.a.b.a.<init>():void");
    }

    public static a a() {
        synchronized (a) {
            if (b == null) {
                b = new a();
            }
        }
        return b;
    }
}
