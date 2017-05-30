package com.google.android.gms.maps;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.gms.c.b;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.maps.model.j;

public class StreetViewPanoramaView extends FrameLayout {
    private final b a;
    private i b;

    public StreetViewPanoramaView(Context context) {
        super(context);
        this.a = new b(this, context, null);
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new b(this, context, null);
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new b(this, context, null);
    }

    public StreetViewPanoramaView(Context context, StreetViewPanoramaOptions streetViewPanoramaOptions) {
        super(context);
        this.a = new b(this, context, streetViewPanoramaOptions);
    }

    public final void a() {
        this.a.c();
    }

    public final void a(Bundle bundle) {
        this.a.a(bundle);
        if (this.a.a() == null) {
            b.b((FrameLayout) this);
        }
    }

    public void a(g gVar) {
        d.b("getStreetViewPanoramaAsync() must be called on the main thread");
        this.a.a(gVar);
    }

    public final void b() {
        this.a.d();
    }

    public final void b(Bundle bundle) {
        this.a.b(bundle);
    }

    public final void c() {
        this.a.g();
    }

    public final void d() {
        this.a.h();
    }

    @Deprecated
    public final i getStreetViewPanorama() {
        if (this.b != null) {
            return this.b;
        }
        this.a.i();
        if (this.a.a() == null) {
            return null;
        }
        try {
            this.b = new i(((a) this.a.a()).h().a());
            return this.b;
        } catch (RemoteException e) {
            throw new j(e);
        }
    }
}
