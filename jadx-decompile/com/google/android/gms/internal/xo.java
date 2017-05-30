package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import java.util.ArrayList;
import java.util.List;

@aaa
public class xo implements xf {
    private final AdRequestInfoParcel a;
    private final xq b;
    private final Context c;
    private final Object d = new Object();
    private final xh e;
    private final boolean f;
    private final long g;
    private final long h;
    private final un i;
    private final boolean j;
    private boolean k = false;
    private xk l;
    private List<xl> m = new ArrayList();

    public xo(Context context, AdRequestInfoParcel adRequestInfoParcel, xq xqVar, xh xhVar, boolean z, boolean z2, long j, long j2, un unVar) {
        this.c = context;
        this.a = adRequestInfoParcel;
        this.b = xqVar;
        this.e = xhVar;
        this.f = z;
        this.j = z2;
        this.g = j;
        this.h = j2;
        this.i = unVar;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.internal.xl a(java.util.List<com.google.android.gms.internal.xg> r22) {
        /*
        r21 = this;
        r2 = "Starting mediation.";
        com.google.android.gms.ads.internal.util.client.b.a(r2);
        r15 = new java.util.ArrayList;
        r15.<init>();
        r0 = r21;
        r2 = r0.i;
        r16 = r2.a();
        r17 = r22.iterator();
    L_0x0016:
        r2 = r17.hasNext();
        if (r2 == 0) goto L_0x0133;
    L_0x001c:
        r7 = r17.next();
        r7 = (com.google.android.gms.internal.xg) r7;
        r3 = "Trying mediation network: ";
        r2 = r7.b;
        r2 = java.lang.String.valueOf(r2);
        r4 = r2.length();
        if (r4 == 0) goto L_0x0066;
    L_0x0030:
        r2 = r3.concat(r2);
    L_0x0034:
        com.google.android.gms.ads.internal.util.client.b.c(r2);
        r2 = r7.c;
        r18 = r2.iterator();
    L_0x003d:
        r2 = r18.hasNext();
        if (r2 == 0) goto L_0x0016;
    L_0x0043:
        r4 = r18.next();
        r4 = (java.lang.String) r4;
        r0 = r21;
        r2 = r0.i;
        r19 = r2.a();
        r0 = r21;
        r0 = r0.d;
        r20 = r0;
        monitor-enter(r20);
        r0 = r21;
        r2 = r0.k;	 Catch:{ all -> 0x010a }
        if (r2 == 0) goto L_0x006c;
    L_0x005e:
        r2 = new com.google.android.gms.internal.xl;	 Catch:{ all -> 0x010a }
        r3 = -1;
        r2.<init>(r3);	 Catch:{ all -> 0x010a }
        monitor-exit(r20);	 Catch:{ all -> 0x010a }
    L_0x0065:
        return r2;
    L_0x0066:
        r2 = new java.lang.String;
        r2.<init>(r3);
        goto L_0x0034;
    L_0x006c:
        r2 = new com.google.android.gms.internal.xk;	 Catch:{ all -> 0x010a }
        r0 = r21;
        r3 = r0.c;	 Catch:{ all -> 0x010a }
        r0 = r21;
        r5 = r0.b;	 Catch:{ all -> 0x010a }
        r0 = r21;
        r6 = r0.e;	 Catch:{ all -> 0x010a }
        r0 = r21;
        r8 = r0.a;	 Catch:{ all -> 0x010a }
        r8 = r8.c;	 Catch:{ all -> 0x010a }
        r0 = r21;
        r9 = r0.a;	 Catch:{ all -> 0x010a }
        r9 = r9.d;	 Catch:{ all -> 0x010a }
        r0 = r21;
        r10 = r0.a;	 Catch:{ all -> 0x010a }
        r10 = r10.k;	 Catch:{ all -> 0x010a }
        r0 = r21;
        r11 = r0.f;	 Catch:{ all -> 0x010a }
        r0 = r21;
        r12 = r0.j;	 Catch:{ all -> 0x010a }
        r0 = r21;
        r13 = r0.a;	 Catch:{ all -> 0x010a }
        r13 = r13.z;	 Catch:{ all -> 0x010a }
        r0 = r21;
        r14 = r0.a;	 Catch:{ all -> 0x010a }
        r14 = r14.n;	 Catch:{ all -> 0x010a }
        r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14);	 Catch:{ all -> 0x010a }
        r0 = r21;
        r0.l = r2;	 Catch:{ all -> 0x010a }
        monitor-exit(r20);	 Catch:{ all -> 0x010a }
        r0 = r21;
        r2 = r0.l;
        r0 = r21;
        r8 = r0.g;
        r0 = r21;
        r10 = r0.h;
        r2 = r2.a(r8, r10);
        r0 = r21;
        r3 = r0.m;
        r3.add(r2);
        r3 = r2.a;
        if (r3 != 0) goto L_0x010d;
    L_0x00c3:
        r3 = "Adapter succeeded.";
        com.google.android.gms.ads.internal.util.client.b.a(r3);
        r0 = r21;
        r3 = r0.i;
        r5 = "mediation_network_succeed";
        r3.a(r5, r4);
        r3 = r15.isEmpty();
        if (r3 != 0) goto L_0x00e6;
    L_0x00d7:
        r0 = r21;
        r3 = r0.i;
        r4 = "mediation_networks_fail";
        r5 = ",";
        r5 = android.text.TextUtils.join(r5, r15);
        r3.a(r4, r5);
    L_0x00e6:
        r0 = r21;
        r3 = r0.i;
        r4 = 1;
        r4 = new java.lang.String[r4];
        r5 = 0;
        r6 = "mls";
        r4[r5] = r6;
        r0 = r19;
        r3.a(r0, r4);
        r0 = r21;
        r3 = r0.i;
        r4 = 1;
        r4 = new java.lang.String[r4];
        r5 = 0;
        r6 = "ttm";
        r4[r5] = r6;
        r0 = r16;
        r3.a(r0, r4);
        goto L_0x0065;
    L_0x010a:
        r2 = move-exception;
        monitor-exit(r20);	 Catch:{ all -> 0x010a }
        throw r2;
    L_0x010d:
        r15.add(r4);
        r0 = r21;
        r3 = r0.i;
        r4 = 1;
        r4 = new java.lang.String[r4];
        r5 = 0;
        r6 = "mlf";
        r4[r5] = r6;
        r0 = r19;
        r3.a(r0, r4);
        r3 = r2.c;
        if (r3 == 0) goto L_0x003d;
    L_0x0125:
        r3 = com.google.android.gms.internal.abv.a;
        r4 = new com.google.android.gms.internal.xo$1;
        r0 = r21;
        r4.<init>(r0, r2);
        r3.post(r4);
        goto L_0x003d;
    L_0x0133:
        r2 = r15.isEmpty();
        if (r2 != 0) goto L_0x0148;
    L_0x0139:
        r0 = r21;
        r2 = r0.i;
        r3 = "mediation_networks_fail";
        r4 = ",";
        r4 = android.text.TextUtils.join(r4, r15);
        r2.a(r3, r4);
    L_0x0148:
        r2 = new com.google.android.gms.internal.xl;
        r3 = 1;
        r2.<init>(r3);
        goto L_0x0065;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.xo.a(java.util.List):com.google.android.gms.internal.xl");
    }

    public void a() {
        synchronized (this.d) {
            this.k = true;
            if (this.l != null) {
                this.l.a();
            }
        }
    }

    public List<xl> b() {
        return this.m;
    }
}
