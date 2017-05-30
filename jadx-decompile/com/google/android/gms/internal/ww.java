package com.google.android.gms.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.a;
import com.google.android.gms.ads.internal.client.ac;
import com.google.android.gms.ads.internal.d;
import com.google.android.gms.ads.internal.e;
import com.google.android.gms.ads.internal.overlay.g;
import com.google.android.gms.ads.internal.overlay.p;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONObject;

@aaa
public class ww implements wu {
    private final acy a;

    public ww(Context context, VersionInfoParcel versionInfoParcel, @Nullable ro roVar, d dVar) {
        this.a = u.f().a(context, new AdSizeParcel(), false, false, roVar, versionInfoParcel, null, null, dVar);
        this.a.a().setWillNotDraw(true);
    }

    private void a(Runnable runnable) {
        if (ac.a().b()) {
            runnable.run();
        } else {
            abv.a.post(runnable);
        }
    }

    public void a() {
        this.a.destroy();
    }

    public void a(a aVar, g gVar, vp vpVar, p pVar, boolean z, vv vvVar, vx vxVar, e eVar, yo yoVar) {
        this.a.l().a(aVar, gVar, vpVar, pVar, z, vvVar, vxVar, new e(this.a.getContext(), false), yoVar, null);
    }

    public void a(wu.a aVar) {
        this.a.l().a(new 6(this, aVar));
    }

    public void a(String str) {
        a(new 3(this, String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", new Object[]{str})));
    }

    public void a(String str, vt vtVar) {
        this.a.l().a(str, vtVar);
    }

    public void a(String str, String str2) {
        a(new 2(this, str, str2));
    }

    public void a(String str, JSONObject jSONObject) {
        a(new 1(this, str, jSONObject));
    }

    public xa b() {
        return new xb(this);
    }

    public void b(String str) {
        a(new 5(this, str));
    }

    public void b(String str, vt vtVar) {
        this.a.l().b(str, vtVar);
    }

    public void b(String str, JSONObject jSONObject) {
        this.a.b(str, jSONObject);
    }

    public void c(String str) {
        a(new 4(this, str));
    }
}
