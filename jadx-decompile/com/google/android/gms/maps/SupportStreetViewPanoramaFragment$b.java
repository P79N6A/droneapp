package com.google.android.gms.maps;

import android.app.Activity;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import com.google.android.gms.c.b;
import com.google.android.gms.c.f;
import com.google.android.gms.c.g;
import com.google.android.gms.common.c;
import com.google.android.gms.maps.a.v;
import com.google.android.gms.maps.model.j;
import java.util.ArrayList;
import java.util.List;

class SupportStreetViewPanoramaFragment$b extends b<SupportStreetViewPanoramaFragment$a> {
    protected g<SupportStreetViewPanoramaFragment$a> a;
    private final Fragment b;
    private Activity c;
    private final List<g> d = new ArrayList();

    SupportStreetViewPanoramaFragment$b(Fragment fragment) {
        this.b = fragment;
    }

    private void a(Activity activity) {
        this.c = activity;
        i();
    }

    protected void a(g<SupportStreetViewPanoramaFragment$a> gVar) {
        this.a = gVar;
        i();
    }

    public void a(g gVar) {
        if (a() != null) {
            ((SupportStreetViewPanoramaFragment$a) a()).a(gVar);
        } else {
            this.d.add(gVar);
        }
    }

    public void i() {
        if (this.c != null && this.a != null && a() == null) {
            try {
                e.a(this.c);
                this.a.a(new SupportStreetViewPanoramaFragment$a(this.b, v.a(this.c).c(f.a(this.c))));
                for (g a : this.d) {
                    ((SupportStreetViewPanoramaFragment$a) a()).a(a);
                }
                this.d.clear();
            } catch (RemoteException e) {
                throw new j(e);
            } catch (c e2) {
            }
        }
    }
}
