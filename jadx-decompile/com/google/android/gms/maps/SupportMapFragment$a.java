package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.c.f;
import com.google.android.gms.maps.a.ao.a;
import com.google.android.gms.maps.a.b;
import com.google.android.gms.maps.a.d;
import com.google.android.gms.maps.a.k;
import com.google.android.gms.maps.a.u;
import com.google.android.gms.maps.model.j;

class SupportMapFragment$a implements k {
    private final Fragment a;
    private final d b;

    public SupportMapFragment$a(Fragment fragment, d dVar) {
        this.b = (d) com.google.android.gms.common.internal.d.a(dVar);
        this.a = (Fragment) com.google.android.gms.common.internal.d.a(fragment);
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            return (View) f.a(this.b.a(f.a(layoutInflater), f.a(viewGroup), bundle));
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public void a() {
        try {
            this.b.i();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public void a(Activity activity, Bundle bundle, Bundle bundle2) {
        try {
            this.b.a(f.a(activity), (GoogleMapOptions) bundle.getParcelable("MapOptions"), bundle2);
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
        if (arguments != null && arguments.containsKey("MapOptions")) {
            u.a(bundle, "MapOptions", arguments.getParcelable("MapOptions"));
        }
        this.b.a(bundle);
    }

    public void a(final f fVar) {
        try {
            this.b.a(new a(this) {
                final /* synthetic */ SupportMapFragment$a b;

                public void a(b bVar) {
                    fVar.b(new c(bVar));
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

    public void c(Bundle bundle) {
        try {
            this.b.c(bundle);
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public void d() {
        try {
            this.b.j();
        } catch (RemoteException e) {
            throw new j(e);
        }
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

    public void h() {
        try {
            this.b.h();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }
}
