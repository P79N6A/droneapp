package com.google.android.gms.internal;

import java.lang.ref.WeakReference;
import org.json.JSONObject;

class zv$1 implements Runnable {
    final /* synthetic */ JSONObject a;
    final /* synthetic */ acl b;
    final /* synthetic */ zv c;

    zv$1(zv zvVar, JSONObject jSONObject, acl com_google_android_gms_internal_acl) {
        this.c = zvVar;
        this.a = jSONObject;
        this.b = com_google_android_gms_internal_acl;
    }

    public void run() {
        try {
            final acy a = this.c.a();
            zv.a(this.c).a(a);
            WeakReference weakReference = new WeakReference(a);
            a.l().a(zv.a(this.c, weakReference), zv.b(this.c, weakReference));
            zv.a(this.c, a);
            a.l().a(new acz$b(this) {
                final /* synthetic */ zv$1 b;

                public void a(acy com_google_android_gms_internal_acy) {
                    a.a("google.afma.nativeAds.renderVideo", this.b.a);
                }
            });
            a.l().a(new acz$a(this) {
                final /* synthetic */ zv$1 a;

                {
                    this.a = r1;
                }

                public void a(acy com_google_android_gms_internal_acy, boolean z) {
                    zv.a(this.a.c).H();
                    this.a.b.b(com_google_android_gms_internal_acy);
                }
            });
            a.loadUrl(zt.a(zv.b(this.c), (String) uf.bJ.c()));
        } catch (Throwable e) {
            abr.d("Exception occurred while getting video view", e);
            this.b.b(null);
        }
    }
}
