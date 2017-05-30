package com.google.android.gms.internal;

import android.content.Context;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.ac;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.internal.abi.a;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

@aaa
public class zv {
    private final Object a = new Object();
    private final Context b;
    private final ro c;
    private final a d;
    private final un e;
    private final q f;
    private OnGlobalLayoutListener g;
    private OnScrollChangedListener h;
    private ach i;
    private int j = -1;
    private int k = -1;

    public zv(Context context, ro roVar, a aVar, un unVar, q qVar) {
        this.b = context;
        this.c = roVar;
        this.d = aVar;
        this.e = unVar;
        this.f = qVar;
        this.i = new ach(200);
    }

    private OnGlobalLayoutListener a(WeakReference<acy> weakReference) {
        if (this.g == null) {
            this.g = new 3(this, weakReference);
        }
        return this.g;
    }

    private void a(acy com_google_android_gms_internal_acy) {
        acz l = com_google_android_gms_internal_acy.l();
        l.a("/video", vs.n);
        l.a("/videoMeta", vs.o);
        l.a("/precache", vs.p);
        l.a("/delayPageLoaded", vs.s);
        l.a("/instrument", vs.q);
        l.a("/log", vs.i);
        l.a("/videoClicked", vs.j);
        l.a("/trackActiveViewUnit", new 2(this));
    }

    private void a(WeakReference<acy> weakReference, boolean z) {
        if (weakReference != null) {
            acy com_google_android_gms_internal_acy = (acy) weakReference.get();
            if (com_google_android_gms_internal_acy != null && com_google_android_gms_internal_acy.b() != null) {
                if (!z || this.i.a()) {
                    int[] iArr = new int[2];
                    com_google_android_gms_internal_acy.b().getLocationOnScreen(iArr);
                    int b = ac.a().b(this.b, iArr[0]);
                    int b2 = ac.a().b(this.b, iArr[1]);
                    synchronized (this.a) {
                        if (!(this.j == b && this.k == b2)) {
                            this.j = b;
                            this.k = b2;
                            com_google_android_gms_internal_acy.l().a(this.j, this.k, !z);
                        }
                    }
                }
            }
        }
    }

    private OnScrollChangedListener b(WeakReference<acy> weakReference) {
        if (this.h == null) {
            this.h = new 4(this, weakReference);
        }
        return this.h;
    }

    public aco<acy> a(JSONObject jSONObject) {
        aco com_google_android_gms_internal_acl = new acl();
        u.e().a(new 1(this, jSONObject, com_google_android_gms_internal_acl));
        return com_google_android_gms_internal_acl;
    }

    acy a() {
        return u.f().a(this.b, AdSizeParcel.a(this.b), false, false, this.c, this.d.a.k, this.e, null, this.f.n());
    }
}
