package com.google.android.gms.internal;

import com.google.android.gms.internal.wu.a;
import java.util.Map;

class wx$1 implements Runnable {
    final /* synthetic */ ro a;
    final /* synthetic */ wx$d b;
    final /* synthetic */ wx c;

    wx$1(wx wxVar, ro roVar, wx$d com_google_android_gms_internal_wx_d) {
        this.c = wxVar;
        this.a = roVar;
        this.b = com_google_android_gms_internal_wx_d;
    }

    public void run() {
        final wu a = this.c.a(wx.a(this.c), wx.b(this.c), this.a);
        a.a(new a(this) {
            final /* synthetic */ wx$1 b;

            public void a() {
                abv.a.postDelayed(new Runnable(this) {
                    final /* synthetic */ AnonymousClass1 a;

                    {
                        this.a = r1;
                    }

                    /* JADX WARNING: inconsistent code. */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public void run() {
                        /*
                        r3 = this;
                        r0 = r3.a;
                        r0 = r0.b;
                        r0 = r0.c;
                        r1 = com.google.android.gms.internal.wx.c(r0);
                        monitor-enter(r1);
                        r0 = r3.a;	 Catch:{ all -> 0x0043 }
                        r0 = r0.b;	 Catch:{ all -> 0x0043 }
                        r0 = r0.b;	 Catch:{ all -> 0x0043 }
                        r0 = r0.b();	 Catch:{ all -> 0x0043 }
                        r2 = -1;
                        if (r0 == r2) goto L_0x0025;
                    L_0x0018:
                        r0 = r3.a;	 Catch:{ all -> 0x0043 }
                        r0 = r0.b;	 Catch:{ all -> 0x0043 }
                        r0 = r0.b;	 Catch:{ all -> 0x0043 }
                        r0 = r0.b();	 Catch:{ all -> 0x0043 }
                        r2 = 1;
                        if (r0 != r2) goto L_0x0027;
                    L_0x0025:
                        monitor-exit(r1);	 Catch:{ all -> 0x0043 }
                    L_0x0026:
                        return;
                    L_0x0027:
                        r0 = r3.a;	 Catch:{ all -> 0x0043 }
                        r0 = r0.b;	 Catch:{ all -> 0x0043 }
                        r0 = r0.b;	 Catch:{ all -> 0x0043 }
                        r0.a();	 Catch:{ all -> 0x0043 }
                        r0 = com.google.android.gms.ads.internal.u.e();	 Catch:{ all -> 0x0043 }
                        r2 = new com.google.android.gms.internal.wx$1$1$1$1;	 Catch:{ all -> 0x0043 }
                        r2.<init>(r3);	 Catch:{ all -> 0x0043 }
                        r0.a(r2);	 Catch:{ all -> 0x0043 }
                        r0 = "Could not receive loaded message in a timely manner. Rejecting.";
                        com.google.android.gms.internal.abr.e(r0);	 Catch:{ all -> 0x0043 }
                        monitor-exit(r1);	 Catch:{ all -> 0x0043 }
                        goto L_0x0026;
                    L_0x0043:
                        r0 = move-exception;
                        monitor-exit(r1);	 Catch:{ all -> 0x0043 }
                        throw r0;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.wx.1.1.1.run():void");
                    }
                }, (long) wx$a.b);
            }
        });
        a.a("/jsLoaded", new vt(this) {
            final /* synthetic */ wx$1 b;

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void a(com.google.android.gms.internal.acy r4, java.util.Map<java.lang.String, java.lang.String> r5) {
                /*
                r3 = this;
                r0 = r3.b;
                r0 = r0.c;
                r1 = com.google.android.gms.internal.wx.c(r0);
                monitor-enter(r1);
                r0 = r3.b;	 Catch:{ all -> 0x0051 }
                r0 = r0.b;	 Catch:{ all -> 0x0051 }
                r0 = r0.b();	 Catch:{ all -> 0x0051 }
                r2 = -1;
                if (r0 == r2) goto L_0x001f;
            L_0x0014:
                r0 = r3.b;	 Catch:{ all -> 0x0051 }
                r0 = r0.b;	 Catch:{ all -> 0x0051 }
                r0 = r0.b();	 Catch:{ all -> 0x0051 }
                r2 = 1;
                if (r0 != r2) goto L_0x0021;
            L_0x001f:
                monitor-exit(r1);	 Catch:{ all -> 0x0051 }
            L_0x0020:
                return;
            L_0x0021:
                r0 = r3.b;	 Catch:{ all -> 0x0051 }
                r0 = r0.c;	 Catch:{ all -> 0x0051 }
                r2 = 0;
                com.google.android.gms.internal.wx.a(r0, r2);	 Catch:{ all -> 0x0051 }
                r0 = r3.b;	 Catch:{ all -> 0x0051 }
                r0 = r0.c;	 Catch:{ all -> 0x0051 }
                r0 = com.google.android.gms.internal.wx.d(r0);	 Catch:{ all -> 0x0051 }
                r2 = r0;	 Catch:{ all -> 0x0051 }
                r0.a(r2);	 Catch:{ all -> 0x0051 }
                r0 = r3.b;	 Catch:{ all -> 0x0051 }
                r0 = r0.b;	 Catch:{ all -> 0x0051 }
                r2 = r0;	 Catch:{ all -> 0x0051 }
                r0.a(r2);	 Catch:{ all -> 0x0051 }
                r0 = r3.b;	 Catch:{ all -> 0x0051 }
                r0 = r0.c;	 Catch:{ all -> 0x0051 }
                r2 = r3.b;	 Catch:{ all -> 0x0051 }
                r2 = r2.b;	 Catch:{ all -> 0x0051 }
                com.google.android.gms.internal.wx.a(r0, r2);	 Catch:{ all -> 0x0051 }
                r0 = "Successfully loaded JS Engine.";
                com.google.android.gms.internal.abr.e(r0);	 Catch:{ all -> 0x0051 }
                monitor-exit(r1);	 Catch:{ all -> 0x0051 }
                goto L_0x0020;
            L_0x0051:
                r0 = move-exception;
                monitor-exit(r1);	 Catch:{ all -> 0x0051 }
                throw r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.wx.1.2.a(com.google.android.gms.internal.acy, java.util.Map):void");
            }
        });
        final aci com_google_android_gms_internal_aci = new aci();
        vt anonymousClass3 = new vt(this) {
            final /* synthetic */ wx$1 c;

            public void a(acy com_google_android_gms_internal_acy, Map<String, String> map) {
                synchronized (wx.c(this.c.c)) {
                    abr.c("JS Engine is requesting an update");
                    if (wx.e(this.c.c) == 0) {
                        abr.c("Starting reload.");
                        wx.a(this.c.c, 2);
                        this.c.c.a(this.c.a);
                    }
                    a.b("/requestReload", (vt) com_google_android_gms_internal_aci.a());
                }
            }
        };
        com_google_android_gms_internal_aci.a(anonymousClass3);
        a.a("/requestReload", anonymousClass3);
        if (wx.f(this.c).endsWith(".js")) {
            a.a(wx.f(this.c));
        } else if (wx.f(this.c).startsWith("<html>")) {
            a.c(wx.f(this.c));
        } else {
            a.b(wx.f(this.c));
        }
        abv.a.postDelayed(new Runnable(this) {
            final /* synthetic */ wx$1 b;

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                r3 = this;
                r0 = r3.b;
                r0 = r0.c;
                r1 = com.google.android.gms.internal.wx.c(r0);
                monitor-enter(r1);
                r0 = r3.b;	 Catch:{ all -> 0x003b }
                r0 = r0.b;	 Catch:{ all -> 0x003b }
                r0 = r0.b();	 Catch:{ all -> 0x003b }
                r2 = -1;
                if (r0 == r2) goto L_0x001f;
            L_0x0014:
                r0 = r3.b;	 Catch:{ all -> 0x003b }
                r0 = r0.b;	 Catch:{ all -> 0x003b }
                r0 = r0.b();	 Catch:{ all -> 0x003b }
                r2 = 1;
                if (r0 != r2) goto L_0x0021;
            L_0x001f:
                monitor-exit(r1);	 Catch:{ all -> 0x003b }
            L_0x0020:
                return;
            L_0x0021:
                r0 = r3.b;	 Catch:{ all -> 0x003b }
                r0 = r0.b;	 Catch:{ all -> 0x003b }
                r0.a();	 Catch:{ all -> 0x003b }
                r0 = com.google.android.gms.ads.internal.u.e();	 Catch:{ all -> 0x003b }
                r2 = new com.google.android.gms.internal.wx$1$4$1;	 Catch:{ all -> 0x003b }
                r2.<init>(r3);	 Catch:{ all -> 0x003b }
                r0.a(r2);	 Catch:{ all -> 0x003b }
                r0 = "Could not receive loaded message in a timely manner. Rejecting.";
                com.google.android.gms.internal.abr.e(r0);	 Catch:{ all -> 0x003b }
                monitor-exit(r1);	 Catch:{ all -> 0x003b }
                goto L_0x0020;
            L_0x003b:
                r0 = move-exception;
                monitor-exit(r1);	 Catch:{ all -> 0x003b }
                throw r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.wx.1.4.run():void");
            }
        }, (long) wx$a.a);
    }
}
