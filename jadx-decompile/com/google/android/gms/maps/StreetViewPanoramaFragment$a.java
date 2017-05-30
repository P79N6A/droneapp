package com.google.android.gms.maps;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.c.f;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.maps.a.g;
import com.google.android.gms.maps.a.h;
import com.google.android.gms.maps.a.l;
import com.google.android.gms.maps.a.s.a;
import com.google.android.gms.maps.a.u;
import com.google.android.gms.maps.model.j;

class StreetViewPanoramaFragment$a implements l {
    private final Fragment a;
    private final h b;

    public StreetViewPanoramaFragment$a(Fragment fragment, h hVar) {
        this.b = (h) d.a(hVar);
        this.a = (Fragment) d.a(fragment);
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            return (View) f.a(this.b.a(f.a(layoutInflater), f.a(viewGroup), bundle));
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public void a() {
    }

    public void a(Activity activity, Bundle bundle, Bundle bundle2) {
        try {
            this.b.a(f.a(activity), null, bundle2);
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public void a(Bundle bundle) {
        if (bundle == null) {
            try {
                bundle = new Bundle();
            } catch (RemoteException e) {
                throw new j(e);
            }
        }
        Bundle arguments = this.a.getArguments();
        if (arguments != null && arguments.containsKey("StreetViewPanoramaOptions")) {
            u.a(bundle, "StreetViewPanoramaOptions", arguments.getParcelable("StreetViewPanoramaOptions"));
        }
        this.b.a(bundle);
    }

    public void a(final g gVar) {
        try {
            this.b.a(new a(this) {
                final /* synthetic */ StreetViewPanoramaFragment$a b;

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
        try {
            this.b.d();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public void f() {
        try {
            this.b.e();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public void g() {
        try {
            this.b.f();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public h h() {
        return this.b;
    }
}
