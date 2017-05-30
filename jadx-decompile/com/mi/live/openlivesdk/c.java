package com.mi.live.openlivesdk;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import com.mi.live.openlivesdk.a.a;

public class c {
    static final String a = "liveopen://startstream?appid=%s&appkey=%s&packagename=%s&playui=%s";
    static final String b = "liveopen://endstream?appid=%s&appkey=%s&packagename=%s";
    private String c;
    private String d;
    private int e = 0;
    private a f;
    private Application g;
    private BroadcastReceiver h = new BroadcastReceiver(this) {
        final /* synthetic */ c a;

        {
            this.a = r1;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onReceive(android.content.Context r4, android.content.Intent r5) {
            /*
            r3 = this;
            r1 = -1;
            if (r5 == 0) goto L_0x0012;
        L_0x0003:
            r0 = r5.getAction();
            r2 = r0.hashCode();
            switch(r2) {
                case -2077898362: goto L_0x0013;
                case 1390740215: goto L_0x001d;
                default: goto L_0x000e;
            };
        L_0x000e:
            r0 = r1;
        L_0x000f:
            switch(r0) {
                case 0: goto L_0x0027;
                case 1: goto L_0x0051;
                default: goto L_0x0012;
            };
        L_0x0012:
            return;
        L_0x0013:
            r2 = "com.wali.live.action.openlive";
            r0 = r0.equals(r2);
            if (r0 == 0) goto L_0x000e;
        L_0x001b:
            r0 = 0;
            goto L_0x000f;
        L_0x001d:
            r2 = "com.wali.live.action.endlive";
            r0 = r0.equals(r2);
            if (r0 == 0) goto L_0x000e;
        L_0x0025:
            r0 = 1;
            goto L_0x000f;
        L_0x0027:
            r0 = "upstream_url";
            r0 = r5.getStringExtra(r0);
            r2 = r3.a;
            r2 = r2.f;
            if (r2 == 0) goto L_0x0012;
        L_0x0035:
            r2 = android.text.TextUtils.isEmpty(r0);
            if (r2 == 0) goto L_0x0047;
        L_0x003b:
            r0 = r3.a;
            r0 = r0.f;
            r2 = "";
            r0.a(r1, r2);
            goto L_0x0012;
        L_0x0047:
            r1 = r3.a;
            r1 = r1.f;
            r1.a(r0);
            goto L_0x0012;
        L_0x0051:
            r0 = r3.a;
            r0 = r0.f;
            if (r0 == 0) goto L_0x0012;
        L_0x0059:
            r0 = r3.a;
            r0 = r0.f;
            r0.a();
            goto L_0x0012;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mi.live.openlivesdk.c.1.onReceive(android.content.Context, android.content.Intent):void");
        }
    };

    public c(String str, String str2, int i, a aVar, Application application) {
        this.c = str;
        this.d = str2;
        this.f = aVar;
        this.g = application;
        this.e = i;
        b();
    }

    private void b() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(b.b);
        intentFilter.addAction(b.c);
        if (this.g != null) {
            this.g.registerReceiver(this.h, intentFilter);
        }
    }

    private void c() {
        if (this.g != null) {
            this.g.unregisterReceiver(this.h);
        }
    }

    public void a() {
        this.f = null;
        c();
        this.g = null;
    }

    public void a(Context context) {
        if (context != null) {
            int a = d.a(context);
            if (a == 1) {
                Intent intent = new Intent();
                intent.setAction(b.a);
                intent.setData(Uri.parse(String.format(a, new Object[]{this.c, this.d, context.getPackageName(), Integer.valueOf(this.e)})));
                context.startActivity(intent);
            } else if (a == -2) {
                this.f.a(-2, "MiLive App not install");
            } else if (a == -3) {
                this.f.a(-3, "MiLive App version is too low");
            }
        }
    }

    public void b(Context context) {
        if (context != null) {
            int a = d.a(context);
            if (a == 1) {
                Intent intent = new Intent();
                intent.setAction(b.a);
                intent.setData(Uri.parse(String.format(b, new Object[]{this.c, this.d, context.getPackageName()})));
                context.startActivity(intent);
            } else if (a == -2) {
                this.f.b(-2, "MiLive App not install");
            } else if (a == -3) {
                this.f.b(-3, "MiLive App version is too low");
            }
        }
    }
}
