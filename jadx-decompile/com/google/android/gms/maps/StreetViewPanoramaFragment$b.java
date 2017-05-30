package com.google.android.gms.maps;

import android.app.Activity;
import android.app.Fragment;
import android.os.RemoteException;
import com.google.android.gms.c.b;
import com.google.android.gms.c.f;
import com.google.android.gms.c.g;
import com.google.android.gms.common.c;
import com.google.android.gms.maps.a.v;
import com.google.android.gms.maps.model.j;
import java.util.ArrayList;
import java.util.List;

class StreetViewPanoramaFragment$b extends b<StreetViewPanoramaFragment$a> {
    protected g<StreetViewPanoramaFragment$a> a;
    private final Fragment b;
    private Activity c;
    private final List<g> d = new ArrayList();

    StreetViewPanoramaFragment$b(Fragment fragment) {
        this.b = fragment;
    }

    private void a(Activity activity) {
        this.c = activity;
        i();
    }

    protected void a(g<StreetViewPanoramaFragment$a> gVar) {
        this.a = gVar;
        i();
    }

    public void a(g gVar) {
        if (a() != null) {
            ((StreetViewPanoramaFragment$a) a()).a(gVar);
        } else {
            this.d.add(gVar);
        }
    }

    public void i() {
        if (this.c != null && this.a != null && a() == null) {
            try {
                e.a(this.c);
                this.a.a(new StreetViewPanoramaFragment$a(this.b, v.a(this.c).c(f.a(this.c))));
                for (g a : this.d) {
                    ((StreetViewPanoramaFragment$a) a()).a(a);
                }
                this.d.clear();
            } catch (RemoteException e) {
                throw new j(e);
            } catch (c e2) {
            }
        }
    }
}
