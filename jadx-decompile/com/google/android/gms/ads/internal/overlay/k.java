package com.google.android.gms.ads.internal.overlay;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.internal.view.SupportMenu;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.fimi.soul.utils.a.b.a;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abv;
import com.google.android.gms.internal.acy;
import com.google.android.gms.internal.uf;
import com.google.android.gms.internal.un;
import com.google.android.gms.tagmanager.e;
import java.util.HashMap;
import java.util.Map;

@aaa
public class k extends FrameLayout implements h {
    private final acy a;
    private final FrameLayout b;
    private final y c;
    @Nullable
    private i d;
    private boolean e;
    private boolean f;
    private long g;
    private long h;
    private String i;

    public k(Context context, acy com_google_android_gms_internal_acy, int i, boolean z, un unVar) {
        super(context);
        this.a = com_google_android_gms_internal_acy;
        this.b = new FrameLayout(context);
        addView(this.b, new LayoutParams(-1, -1));
        n.a(com_google_android_gms_internal_acy.h());
        this.d = com_google_android_gms_internal_acy.h().b.a(context, com_google_android_gms_internal_acy, i, z, unVar);
        if (this.d != null) {
            this.b.addView(this.d, new LayoutParams(-1, -1, 17));
            if (((Boolean) uf.B.c()).booleanValue()) {
                l();
            }
        }
        this.c = new y(this);
        this.c.b();
        if (this.d != null) {
            this.d.a((h) this);
        }
        if (this.d == null) {
            a("AdVideoUnderlay Error", "Allocating player failed.");
        }
    }

    public static void a(acy com_google_android_gms_internal_acy) {
        Map hashMap = new HashMap();
        hashMap.put(e.b, "no_video_view");
        com_google_android_gms_internal_acy.a("onVideoEvent", hashMap);
    }

    private void a(String str, String... strArr) {
        Map hashMap = new HashMap();
        hashMap.put(e.b, str);
        int length = strArr.length;
        int i = 0;
        Object obj = null;
        while (i < length) {
            Object obj2 = strArr[i];
            if (obj != null) {
                hashMap.put(obj, obj2);
                obj2 = null;
            }
            i++;
            obj = obj2;
        }
        this.a.a("onVideoEvent", hashMap);
    }

    private void o() {
        if (this.a.f() != null && !this.e) {
            this.f = (this.a.f().getWindow().getAttributes().flags & 128) != 0;
            if (!this.f) {
                this.a.f().getWindow().addFlags(128);
                this.e = true;
            }
        }
    }

    private void p() {
        if (this.a.f() != null && this.e && !this.f) {
            this.a.f().getWindow().clearFlags(128);
            this.e = false;
        }
    }

    public void a() {
        abv.a.post(new Runnable(this) {
            final /* synthetic */ k a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.a("surfaceCreated", new String[0]);
            }
        });
    }

    public void a(float f) {
        if (this.d != null) {
            this.d.a(f);
        }
    }

    public void a(float f, float f2) {
        if (this.d != null) {
            this.d.a(f, f2);
        }
    }

    public void a(int i) {
        if (this.d != null) {
            this.d.a(i);
        }
    }

    public void a(int i, int i2, int i3, int i4) {
        if (i3 != 0 && i4 != 0) {
            ViewGroup.LayoutParams layoutParams = new LayoutParams(i3, i4);
            layoutParams.setMargins(i, i2, 0, 0);
            this.b.setLayoutParams(layoutParams);
            requestLayout();
        }
    }

    @TargetApi(14)
    public void a(MotionEvent motionEvent) {
        if (this.d != null) {
            this.d.dispatchTouchEvent(motionEvent);
        }
    }

    public void a(String str) {
        this.i = str;
    }

    public void a(String str, @Nullable String str2) {
        a("error", "what", str, "extra", str2);
    }

    public void b() {
        if (this.d != null && this.h == 0) {
            float duration = ((float) this.d.getDuration()) / 1000.0f;
            int videoWidth = this.d.getVideoWidth();
            int videoHeight = this.d.getVideoHeight();
            a("canplaythrough", "duration", String.valueOf(duration), "videoWidth", String.valueOf(videoWidth), "videoHeight", String.valueOf(videoHeight));
        }
    }

    public void c() {
        o();
    }

    public void d() {
        a("pause", new String[0]);
        p();
    }

    public void e() {
        a("ended", new String[0]);
        p();
    }

    public void f() {
        this.h = this.g;
        abv.a.post(new Runnable(this) {
            final /* synthetic */ k a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.a("surfaceDestroyed", new String[0]);
            }
        });
    }

    public void g() {
        if (this.d != null) {
            if (TextUtils.isEmpty(this.i)) {
                a("no_src", new String[0]);
            } else {
                this.d.setVideoPath(this.i);
            }
        }
    }

    public void h() {
        if (this.d != null) {
            this.d.d();
        }
    }

    public void i() {
        if (this.d != null) {
            this.d.c();
        }
    }

    public void j() {
        if (this.d != null) {
            this.d.e();
        }
    }

    public void k() {
        if (this.d != null) {
            this.d.f();
        }
    }

    @TargetApi(14)
    public void l() {
        if (this.d != null) {
            View textView = new TextView(this.d.getContext());
            String str = "AdMob - ";
            String valueOf = String.valueOf(this.d.a());
            textView.setText(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            textView.setTextColor(SupportMenu.CATEGORY_MASK);
            textView.setBackgroundColor(-256);
            this.b.addView(textView, new LayoutParams(-2, -2, 17));
            this.b.bringChildToFront(textView);
        }
    }

    public void m() {
        this.c.a();
        if (this.d != null) {
            this.d.b();
        }
        p();
    }

    void n() {
        if (this.d != null) {
            long currentPosition = (long) this.d.getCurrentPosition();
            if (this.g != currentPosition && currentPosition > 0) {
                float f = ((float) currentPosition) / 1000.0f;
                a("timeupdate", a.i, String.valueOf(f));
                this.g = currentPosition;
            }
        }
    }
}
