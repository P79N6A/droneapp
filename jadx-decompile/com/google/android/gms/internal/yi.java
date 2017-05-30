package com.google.android.gms.internal;

import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.fimi.soul.media.player.FimiMediaMeta;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.ac;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.common.util.f;
import java.util.Map;
import java.util.Set;

@aaa
public class yi extends yn {
    static final Set<String> a = f.a(new String[]{"top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center"});
    private String b = "top-right";
    private boolean c = true;
    private int d = 0;
    private int e = 0;
    private int f = -1;
    private int g = 0;
    private int h = 0;
    private int i = -1;
    private final Object j = new Object();
    private final acy k;
    private final Activity l;
    private AdSizeParcel m;
    private ImageView n;
    private LinearLayout o;
    private yo p;
    private PopupWindow q;
    private RelativeLayout r;
    private ViewGroup s;

    public yi(acy com_google_android_gms_internal_acy, yo yoVar) {
        super(com_google_android_gms_internal_acy, "resize");
        this.k = com_google_android_gms_internal_acy;
        this.l = com_google_android_gms_internal_acy.f();
        this.p = yoVar;
    }

    private void b(Map<String, String> map) {
        if (!TextUtils.isEmpty((CharSequence) map.get(FimiMediaMeta.IJKM_KEY_WIDTH))) {
            this.i = u.e().b((String) map.get(FimiMediaMeta.IJKM_KEY_WIDTH));
        }
        if (!TextUtils.isEmpty((CharSequence) map.get(FimiMediaMeta.IJKM_KEY_HEIGHT))) {
            this.f = u.e().b((String) map.get(FimiMediaMeta.IJKM_KEY_HEIGHT));
        }
        if (!TextUtils.isEmpty((CharSequence) map.get("offsetX"))) {
            this.g = u.e().b((String) map.get("offsetX"));
        }
        if (!TextUtils.isEmpty((CharSequence) map.get("offsetY"))) {
            this.h = u.e().b((String) map.get("offsetY"));
        }
        if (!TextUtils.isEmpty((CharSequence) map.get("allowOffscreen"))) {
            this.c = Boolean.parseBoolean((String) map.get("allowOffscreen"));
        }
        String str = (String) map.get("customClosePosition");
        if (!TextUtils.isEmpty(str)) {
            this.b = str;
        }
    }

    private int[] d() {
        if (!c()) {
            return null;
        }
        if (this.c) {
            return new int[]{this.d + this.g, this.e + this.h};
        }
        int[] b = u.e().b(this.l);
        int[] d = u.e().d(this.l);
        int i = b[0];
        int i2 = this.d + this.g;
        int i3 = this.e + this.h;
        if (i2 < 0) {
            i2 = 0;
        } else if (this.i + i2 > i) {
            i2 = i - this.i;
        }
        if (i3 < d[0]) {
            i3 = d[0];
        } else if (this.f + i3 > d[1]) {
            i3 = d[1] - this.f;
        }
        return new int[]{i2, i3};
    }

    void a(int i, int i2) {
        if (this.p != null) {
            this.p.a(i, i2, this.i, this.f);
        }
    }

    public void a(int i, int i2, boolean z) {
        synchronized (this.j) {
            this.d = i;
            this.e = i2;
            if (this.q != null && z) {
                int[] d = d();
                if (d != null) {
                    this.q.update(ac.a().a(this.l, d[0]), ac.a().a(this.l, d[1]), this.q.getWidth(), this.q.getHeight());
                    b(d[0], d[1]);
                } else {
                    a(true);
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.util.Map<java.lang.String, java.lang.String> r13) {
        /*
        r12 = this;
        r4 = -1;
        r5 = 1;
        r3 = 0;
        r6 = r12.j;
        monitor-enter(r6);
        r1 = r12.l;	 Catch:{ all -> 0x0020 }
        if (r1 != 0) goto L_0x0011;
    L_0x000a:
        r1 = "Not an activity context. Cannot resize.";
        r12.b(r1);	 Catch:{ all -> 0x0020 }
        monitor-exit(r6);	 Catch:{ all -> 0x0020 }
    L_0x0010:
        return;
    L_0x0011:
        r1 = r12.k;	 Catch:{ all -> 0x0020 }
        r1 = r1.k();	 Catch:{ all -> 0x0020 }
        if (r1 != 0) goto L_0x0023;
    L_0x0019:
        r1 = "Webview is not yet available, size is not set.";
        r12.b(r1);	 Catch:{ all -> 0x0020 }
        monitor-exit(r6);	 Catch:{ all -> 0x0020 }
        goto L_0x0010;
    L_0x0020:
        r1 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x0020 }
        throw r1;
    L_0x0023:
        r1 = r12.k;	 Catch:{ all -> 0x0020 }
        r1 = r1.k();	 Catch:{ all -> 0x0020 }
        r1 = r1.e;	 Catch:{ all -> 0x0020 }
        if (r1 == 0) goto L_0x0034;
    L_0x002d:
        r1 = "Is interstitial. Cannot resize an interstitial.";
        r12.b(r1);	 Catch:{ all -> 0x0020 }
        monitor-exit(r6);	 Catch:{ all -> 0x0020 }
        goto L_0x0010;
    L_0x0034:
        r1 = r12.k;	 Catch:{ all -> 0x0020 }
        r1 = r1.p();	 Catch:{ all -> 0x0020 }
        if (r1 == 0) goto L_0x0043;
    L_0x003c:
        r1 = "Cannot resize an expanded banner.";
        r12.b(r1);	 Catch:{ all -> 0x0020 }
        monitor-exit(r6);	 Catch:{ all -> 0x0020 }
        goto L_0x0010;
    L_0x0043:
        r12.b(r13);	 Catch:{ all -> 0x0020 }
        r1 = r12.a();	 Catch:{ all -> 0x0020 }
        if (r1 != 0) goto L_0x0053;
    L_0x004c:
        r1 = "Invalid width and height options. Cannot resize.";
        r12.b(r1);	 Catch:{ all -> 0x0020 }
        monitor-exit(r6);	 Catch:{ all -> 0x0020 }
        goto L_0x0010;
    L_0x0053:
        r1 = r12.l;	 Catch:{ all -> 0x0020 }
        r7 = r1.getWindow();	 Catch:{ all -> 0x0020 }
        if (r7 == 0) goto L_0x0061;
    L_0x005b:
        r1 = r7.getDecorView();	 Catch:{ all -> 0x0020 }
        if (r1 != 0) goto L_0x0068;
    L_0x0061:
        r1 = "Activity context is not ready, cannot get window or decor view.";
        r12.b(r1);	 Catch:{ all -> 0x0020 }
        monitor-exit(r6);	 Catch:{ all -> 0x0020 }
        goto L_0x0010;
    L_0x0068:
        r8 = r12.d();	 Catch:{ all -> 0x0020 }
        if (r8 != 0) goto L_0x0075;
    L_0x006e:
        r1 = "Resize location out of screen or close button is not visible.";
        r12.b(r1);	 Catch:{ all -> 0x0020 }
        monitor-exit(r6);	 Catch:{ all -> 0x0020 }
        goto L_0x0010;
    L_0x0075:
        r1 = com.google.android.gms.ads.internal.client.ac.a();	 Catch:{ all -> 0x0020 }
        r2 = r12.l;	 Catch:{ all -> 0x0020 }
        r9 = r12.i;	 Catch:{ all -> 0x0020 }
        r9 = r1.a(r2, r9);	 Catch:{ all -> 0x0020 }
        r1 = com.google.android.gms.ads.internal.client.ac.a();	 Catch:{ all -> 0x0020 }
        r2 = r12.l;	 Catch:{ all -> 0x0020 }
        r10 = r12.f;	 Catch:{ all -> 0x0020 }
        r10 = r1.a(r2, r10);	 Catch:{ all -> 0x0020 }
        r1 = r12.k;	 Catch:{ all -> 0x0020 }
        r1 = r1.b();	 Catch:{ all -> 0x0020 }
        r2 = r1.getParent();	 Catch:{ all -> 0x0020 }
        if (r2 == 0) goto L_0x01d5;
    L_0x0099:
        r1 = r2 instanceof android.view.ViewGroup;	 Catch:{ all -> 0x0020 }
        if (r1 == 0) goto L_0x01d5;
    L_0x009d:
        r0 = r2;
        r0 = (android.view.ViewGroup) r0;	 Catch:{ all -> 0x0020 }
        r1 = r0;
        r11 = r12.k;	 Catch:{ all -> 0x0020 }
        r11 = r11.b();	 Catch:{ all -> 0x0020 }
        r1.removeView(r11);	 Catch:{ all -> 0x0020 }
        r1 = r12.q;	 Catch:{ all -> 0x0020 }
        if (r1 != 0) goto L_0x01ce;
    L_0x00ae:
        r2 = (android.view.ViewGroup) r2;	 Catch:{ all -> 0x0020 }
        r12.s = r2;	 Catch:{ all -> 0x0020 }
        r1 = com.google.android.gms.ads.internal.u.e();	 Catch:{ all -> 0x0020 }
        r2 = r12.k;	 Catch:{ all -> 0x0020 }
        r2 = r2.b();	 Catch:{ all -> 0x0020 }
        r1 = r1.a(r2);	 Catch:{ all -> 0x0020 }
        r2 = new android.widget.ImageView;	 Catch:{ all -> 0x0020 }
        r11 = r12.l;	 Catch:{ all -> 0x0020 }
        r2.<init>(r11);	 Catch:{ all -> 0x0020 }
        r12.n = r2;	 Catch:{ all -> 0x0020 }
        r2 = r12.n;	 Catch:{ all -> 0x0020 }
        r2.setImageBitmap(r1);	 Catch:{ all -> 0x0020 }
        r1 = r12.k;	 Catch:{ all -> 0x0020 }
        r1 = r1.k();	 Catch:{ all -> 0x0020 }
        r12.m = r1;	 Catch:{ all -> 0x0020 }
        r1 = r12.s;	 Catch:{ all -> 0x0020 }
        r2 = r12.n;	 Catch:{ all -> 0x0020 }
        r1.addView(r2);	 Catch:{ all -> 0x0020 }
    L_0x00dd:
        r1 = new android.widget.RelativeLayout;	 Catch:{ all -> 0x0020 }
        r2 = r12.l;	 Catch:{ all -> 0x0020 }
        r1.<init>(r2);	 Catch:{ all -> 0x0020 }
        r12.r = r1;	 Catch:{ all -> 0x0020 }
        r1 = r12.r;	 Catch:{ all -> 0x0020 }
        r2 = 0;
        r1.setBackgroundColor(r2);	 Catch:{ all -> 0x0020 }
        r1 = r12.r;	 Catch:{ all -> 0x0020 }
        r2 = new android.view.ViewGroup$LayoutParams;	 Catch:{ all -> 0x0020 }
        r2.<init>(r9, r10);	 Catch:{ all -> 0x0020 }
        r1.setLayoutParams(r2);	 Catch:{ all -> 0x0020 }
        r1 = com.google.android.gms.ads.internal.u.e();	 Catch:{ all -> 0x0020 }
        r2 = r12.r;	 Catch:{ all -> 0x0020 }
        r11 = 0;
        r1 = r1.a(r2, r9, r10, r11);	 Catch:{ all -> 0x0020 }
        r12.q = r1;	 Catch:{ all -> 0x0020 }
        r1 = r12.q;	 Catch:{ all -> 0x0020 }
        r2 = 1;
        r1.setOutsideTouchable(r2);	 Catch:{ all -> 0x0020 }
        r1 = r12.q;	 Catch:{ all -> 0x0020 }
        r2 = 1;
        r1.setTouchable(r2);	 Catch:{ all -> 0x0020 }
        r2 = r12.q;	 Catch:{ all -> 0x0020 }
        r1 = r12.c;	 Catch:{ all -> 0x0020 }
        if (r1 != 0) goto L_0x01dd;
    L_0x0115:
        r1 = r5;
    L_0x0116:
        r2.setClippingEnabled(r1);	 Catch:{ all -> 0x0020 }
        r1 = r12.r;	 Catch:{ all -> 0x0020 }
        r2 = r12.k;	 Catch:{ all -> 0x0020 }
        r2 = r2.b();	 Catch:{ all -> 0x0020 }
        r9 = -1;
        r10 = -1;
        r1.addView(r2, r9, r10);	 Catch:{ all -> 0x0020 }
        r1 = new android.widget.LinearLayout;	 Catch:{ all -> 0x0020 }
        r2 = r12.l;	 Catch:{ all -> 0x0020 }
        r1.<init>(r2);	 Catch:{ all -> 0x0020 }
        r12.o = r1;	 Catch:{ all -> 0x0020 }
        r2 = new android.widget.RelativeLayout$LayoutParams;	 Catch:{ all -> 0x0020 }
        r1 = com.google.android.gms.ads.internal.client.ac.a();	 Catch:{ all -> 0x0020 }
        r9 = r12.l;	 Catch:{ all -> 0x0020 }
        r10 = 50;
        r1 = r1.a(r9, r10);	 Catch:{ all -> 0x0020 }
        r9 = com.google.android.gms.ads.internal.client.ac.a();	 Catch:{ all -> 0x0020 }
        r10 = r12.l;	 Catch:{ all -> 0x0020 }
        r11 = 50;
        r9 = r9.a(r10, r11);	 Catch:{ all -> 0x0020 }
        r2.<init>(r1, r9);	 Catch:{ all -> 0x0020 }
        r1 = r12.b;	 Catch:{ all -> 0x0020 }
        r9 = r1.hashCode();	 Catch:{ all -> 0x0020 }
        switch(r9) {
            case -1364013995: goto L_0x01f6;
            case -1012429441: goto L_0x01e0;
            case -655373719: goto L_0x0201;
            case 1163912186: goto L_0x0217;
            case 1288627767: goto L_0x020c;
            case 1755462605: goto L_0x01eb;
            default: goto L_0x0155;
        };	 Catch:{ all -> 0x0020 }
    L_0x0155:
        r1 = r4;
    L_0x0156:
        switch(r1) {
            case 0: goto L_0x0222;
            case 1: goto L_0x022e;
            case 2: goto L_0x023a;
            case 3: goto L_0x0241;
            case 4: goto L_0x024d;
            case 5: goto L_0x0259;
            default: goto L_0x0159;
        };	 Catch:{ all -> 0x0020 }
    L_0x0159:
        r1 = 10;
        r2.addRule(r1);	 Catch:{ all -> 0x0020 }
        r1 = 11;
        r2.addRule(r1);	 Catch:{ all -> 0x0020 }
    L_0x0163:
        r1 = r12.o;	 Catch:{ all -> 0x0020 }
        r3 = new com.google.android.gms.internal.yi$1;	 Catch:{ all -> 0x0020 }
        r3.<init>(r12);	 Catch:{ all -> 0x0020 }
        r1.setOnClickListener(r3);	 Catch:{ all -> 0x0020 }
        r1 = r12.o;	 Catch:{ all -> 0x0020 }
        r3 = "Close button";
        r1.setContentDescription(r3);	 Catch:{ all -> 0x0020 }
        r1 = r12.r;	 Catch:{ all -> 0x0020 }
        r3 = r12.o;	 Catch:{ all -> 0x0020 }
        r1.addView(r3, r2);	 Catch:{ all -> 0x0020 }
        r1 = r12.q;	 Catch:{ RuntimeException -> 0x0265 }
        r2 = r7.getDecorView();	 Catch:{ RuntimeException -> 0x0265 }
        r3 = 0;
        r4 = com.google.android.gms.ads.internal.client.ac.a();	 Catch:{ RuntimeException -> 0x0265 }
        r5 = r12.l;	 Catch:{ RuntimeException -> 0x0265 }
        r7 = 0;
        r7 = r8[r7];	 Catch:{ RuntimeException -> 0x0265 }
        r4 = r4.a(r5, r7);	 Catch:{ RuntimeException -> 0x0265 }
        r5 = com.google.android.gms.ads.internal.client.ac.a();	 Catch:{ RuntimeException -> 0x0265 }
        r7 = r12.l;	 Catch:{ RuntimeException -> 0x0265 }
        r9 = 1;
        r9 = r8[r9];	 Catch:{ RuntimeException -> 0x0265 }
        r5 = r5.a(r7, r9);	 Catch:{ RuntimeException -> 0x0265 }
        r1.showAtLocation(r2, r3, r4, r5);	 Catch:{ RuntimeException -> 0x0265 }
        r1 = 0;
        r1 = r8[r1];	 Catch:{ all -> 0x0020 }
        r2 = 1;
        r2 = r8[r2];	 Catch:{ all -> 0x0020 }
        r12.a(r1, r2);	 Catch:{ all -> 0x0020 }
        r1 = r12.k;	 Catch:{ all -> 0x0020 }
        r2 = new com.google.android.gms.ads.internal.client.AdSizeParcel;	 Catch:{ all -> 0x0020 }
        r3 = r12.l;	 Catch:{ all -> 0x0020 }
        r4 = new com.google.android.gms.ads.d;	 Catch:{ all -> 0x0020 }
        r5 = r12.i;	 Catch:{ all -> 0x0020 }
        r7 = r12.f;	 Catch:{ all -> 0x0020 }
        r4.<init>(r5, r7);	 Catch:{ all -> 0x0020 }
        r2.<init>(r3, r4);	 Catch:{ all -> 0x0020 }
        r1.a(r2);	 Catch:{ all -> 0x0020 }
        r1 = 0;
        r1 = r8[r1];	 Catch:{ all -> 0x0020 }
        r2 = 1;
        r2 = r8[r2];	 Catch:{ all -> 0x0020 }
        r12.b(r1, r2);	 Catch:{ all -> 0x0020 }
        r1 = "resized";
        r12.d(r1);	 Catch:{ all -> 0x0020 }
        monitor-exit(r6);	 Catch:{ all -> 0x0020 }
        goto L_0x0010;
    L_0x01ce:
        r1 = r12.q;	 Catch:{ all -> 0x0020 }
        r1.dismiss();	 Catch:{ all -> 0x0020 }
        goto L_0x00dd;
    L_0x01d5:
        r1 = "Webview is detached, probably in the middle of a resize or expand.";
        r12.b(r1);	 Catch:{ all -> 0x0020 }
        monitor-exit(r6);	 Catch:{ all -> 0x0020 }
        goto L_0x0010;
    L_0x01dd:
        r1 = r3;
        goto L_0x0116;
    L_0x01e0:
        r5 = "top-left";
        r1 = r1.equals(r5);	 Catch:{ all -> 0x0020 }
        if (r1 == 0) goto L_0x0155;
    L_0x01e8:
        r1 = r3;
        goto L_0x0156;
    L_0x01eb:
        r3 = "top-center";
        r1 = r1.equals(r3);	 Catch:{ all -> 0x0020 }
        if (r1 == 0) goto L_0x0155;
    L_0x01f3:
        r1 = r5;
        goto L_0x0156;
    L_0x01f6:
        r3 = "center";
        r1 = r1.equals(r3);	 Catch:{ all -> 0x0020 }
        if (r1 == 0) goto L_0x0155;
    L_0x01fe:
        r1 = 2;
        goto L_0x0156;
    L_0x0201:
        r3 = "bottom-left";
        r1 = r1.equals(r3);	 Catch:{ all -> 0x0020 }
        if (r1 == 0) goto L_0x0155;
    L_0x0209:
        r1 = 3;
        goto L_0x0156;
    L_0x020c:
        r3 = "bottom-center";
        r1 = r1.equals(r3);	 Catch:{ all -> 0x0020 }
        if (r1 == 0) goto L_0x0155;
    L_0x0214:
        r1 = 4;
        goto L_0x0156;
    L_0x0217:
        r3 = "bottom-right";
        r1 = r1.equals(r3);	 Catch:{ all -> 0x0020 }
        if (r1 == 0) goto L_0x0155;
    L_0x021f:
        r1 = 5;
        goto L_0x0156;
    L_0x0222:
        r1 = 10;
        r2.addRule(r1);	 Catch:{ all -> 0x0020 }
        r1 = 9;
        r2.addRule(r1);	 Catch:{ all -> 0x0020 }
        goto L_0x0163;
    L_0x022e:
        r1 = 10;
        r2.addRule(r1);	 Catch:{ all -> 0x0020 }
        r1 = 14;
        r2.addRule(r1);	 Catch:{ all -> 0x0020 }
        goto L_0x0163;
    L_0x023a:
        r1 = 13;
        r2.addRule(r1);	 Catch:{ all -> 0x0020 }
        goto L_0x0163;
    L_0x0241:
        r1 = 12;
        r2.addRule(r1);	 Catch:{ all -> 0x0020 }
        r1 = 9;
        r2.addRule(r1);	 Catch:{ all -> 0x0020 }
        goto L_0x0163;
    L_0x024d:
        r1 = 12;
        r2.addRule(r1);	 Catch:{ all -> 0x0020 }
        r1 = 14;
        r2.addRule(r1);	 Catch:{ all -> 0x0020 }
        goto L_0x0163;
    L_0x0259:
        r1 = 12;
        r2.addRule(r1);	 Catch:{ all -> 0x0020 }
        r1 = 11;
        r2.addRule(r1);	 Catch:{ all -> 0x0020 }
        goto L_0x0163;
    L_0x0265:
        r1 = move-exception;
        r2 = "Cannot show popup window: ";
        r1 = r1.getMessage();	 Catch:{ all -> 0x0020 }
        r1 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x0020 }
        r3 = r1.length();	 Catch:{ all -> 0x0020 }
        if (r3 == 0) goto L_0x02a8;
    L_0x0276:
        r1 = r2.concat(r1);	 Catch:{ all -> 0x0020 }
    L_0x027a:
        r12.b(r1);	 Catch:{ all -> 0x0020 }
        r1 = r12.r;	 Catch:{ all -> 0x0020 }
        r2 = r12.k;	 Catch:{ all -> 0x0020 }
        r2 = r2.b();	 Catch:{ all -> 0x0020 }
        r1.removeView(r2);	 Catch:{ all -> 0x0020 }
        r1 = r12.s;	 Catch:{ all -> 0x0020 }
        if (r1 == 0) goto L_0x02a5;
    L_0x028c:
        r1 = r12.s;	 Catch:{ all -> 0x0020 }
        r2 = r12.n;	 Catch:{ all -> 0x0020 }
        r1.removeView(r2);	 Catch:{ all -> 0x0020 }
        r1 = r12.s;	 Catch:{ all -> 0x0020 }
        r2 = r12.k;	 Catch:{ all -> 0x0020 }
        r2 = r2.b();	 Catch:{ all -> 0x0020 }
        r1.addView(r2);	 Catch:{ all -> 0x0020 }
        r1 = r12.k;	 Catch:{ all -> 0x0020 }
        r2 = r12.m;	 Catch:{ all -> 0x0020 }
        r1.a(r2);	 Catch:{ all -> 0x0020 }
    L_0x02a5:
        monitor-exit(r6);	 Catch:{ all -> 0x0020 }
        goto L_0x0010;
    L_0x02a8:
        r1 = new java.lang.String;	 Catch:{ all -> 0x0020 }
        r1.<init>(r2);	 Catch:{ all -> 0x0020 }
        goto L_0x027a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.yi.a(java.util.Map):void");
    }

    public void a(boolean z) {
        synchronized (this.j) {
            if (this.q != null) {
                this.q.dismiss();
                this.r.removeView(this.k.b());
                if (this.s != null) {
                    this.s.removeView(this.n);
                    this.s.addView(this.k.b());
                    this.k.a(this.m);
                }
                if (z) {
                    d("default");
                    if (this.p != null) {
                        this.p.G();
                    }
                }
                this.q = null;
                this.r = null;
                this.s = null;
                this.o = null;
            }
        }
    }

    boolean a() {
        return this.i > -1 && this.f > -1;
    }

    void b(int i, int i2) {
        a(i, i2 - u.e().d(this.l)[0], this.i, this.f);
    }

    public boolean b() {
        boolean z;
        synchronized (this.j) {
            z = this.q != null;
        }
        return z;
    }

    public void c(int i, int i2) {
        this.d = i;
        this.e = i2;
    }

    boolean c() {
        int[] b = u.e().b(this.l);
        int[] d = u.e().d(this.l);
        int i = b[0];
        int i2 = b[1];
        if (this.i < 50 || this.i > i) {
            b.d("Width is too small or too large.");
            return false;
        } else if (this.f < 50 || this.f > i2) {
            b.d("Height is too small or too large.");
            return false;
        } else if (this.f == i2 && this.i == i) {
            b.d("Cannot resize to a full-screen ad.");
            return false;
        } else {
            if (this.c) {
                int i3;
                String str = this.b;
                boolean z = true;
                switch (str.hashCode()) {
                    case -1364013995:
                        if (str.equals("center")) {
                            z = true;
                            break;
                        }
                        break;
                    case -1012429441:
                        if (str.equals("top-left")) {
                            z = false;
                            break;
                        }
                        break;
                    case -655373719:
                        if (str.equals("bottom-left")) {
                            z = true;
                            break;
                        }
                        break;
                    case 1163912186:
                        if (str.equals("bottom-right")) {
                            z = true;
                            break;
                        }
                        break;
                    case 1288627767:
                        if (str.equals("bottom-center")) {
                            z = true;
                            break;
                        }
                        break;
                    case 1755462605:
                        if (str.equals("top-center")) {
                            z = true;
                            break;
                        }
                        break;
                }
                switch (z) {
                    case false:
                        i3 = this.g + this.d;
                        i2 = this.e + this.h;
                        break;
                    case true:
                        i3 = ((this.d + this.g) + (this.i / 2)) - 25;
                        i2 = this.e + this.h;
                        break;
                    case true:
                        i3 = ((this.d + this.g) + (this.i / 2)) - 25;
                        i2 = ((this.e + this.h) + (this.f / 2)) - 25;
                        break;
                    case true:
                        i3 = this.g + this.d;
                        i2 = ((this.e + this.h) + this.f) - 50;
                        break;
                    case true:
                        i3 = ((this.d + this.g) + (this.i / 2)) - 25;
                        i2 = ((this.e + this.h) + this.f) - 50;
                        break;
                    case true:
                        i3 = ((this.d + this.g) + this.i) - 50;
                        i2 = ((this.e + this.h) + this.f) - 50;
                        break;
                    default:
                        i3 = ((this.d + this.g) + this.i) - 50;
                        i2 = this.e + this.h;
                        break;
                }
                if (i3 < 0 || i3 + 50 > i || r2 < d[0] || r2 + 50 > d[1]) {
                    return false;
                }
            }
            return true;
        }
    }
}
