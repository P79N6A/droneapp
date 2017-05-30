package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.c.f;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.maps.a.g;
import com.google.android.gms.maps.a.i;
import com.google.android.gms.maps.a.l;
import com.google.android.gms.maps.a.s.a;
import com.google.android.gms.maps.model.j;

class StreetViewPanoramaView$a implements l {
    private final ViewGroup a;
    private final i b;
    private View c;

    public StreetViewPanoramaView$a(ViewGroup viewGroup, i iVar) {
        this.b = (i) d.a(iVar);
        this.a = (ViewGroup) d.a(viewGroup);
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        throw new UnsupportedOperationException("onCreateView not allowed on StreetViewPanoramaViewDelegate");
    }

    public void a() {
    }

    public void a(Activity activity, Bundle bundle, Bundle bundle2) {
        throw new UnsupportedOperationException("onInflate not allowed on StreetViewPanoramaViewDelegate");
    }

    public void a(Bundle bundle) {
        try {
            this.b.a(bundle);
            this.c = (View) f.a(this.b.f());
            this.a.removeAllViews();
            this.a.addView(this.c);
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public void a(final g gVar) {
        try {
            this.b.a(new a(this) {
                final /* synthetic */ StreetViewPanoramaView$a b;

                public void a(g gVar) {
                    gVar.a(new i(gVar));
                }
            });
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public void b() {
        try {
            this.b.b();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public void b(Bundle bundle) {
        try {
            this.b.b(bundle);
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public void c() {
        try {
            this.b.c();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public void d() {
    }

    public void e() {
        throw new UnsupportedOperationException("onDestroyView not allowed on StreetViewPanoramaViewDelegate");
    }

    public void f() {
        try {
            this.b.d();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public void g() {
        try {
            this.b.e();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public i h() {
        return this.b;
    }
}
