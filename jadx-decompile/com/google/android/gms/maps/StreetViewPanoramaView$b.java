package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.c.b;
import com.google.android.gms.c.f;
import com.google.android.gms.c.g;
import com.google.android.gms.common.c;
import com.google.android.gms.maps.a.v;
import com.google.android.gms.maps.model.j;
import java.util.ArrayList;
import java.util.List;

class StreetViewPanoramaView$b extends b<StreetViewPanoramaView$a> {
    protected g<StreetViewPanoramaView$a> a;
    private final ViewGroup b;
    private final Context c;
    private final StreetViewPanoramaOptions d;
    private final List<g> e = new ArrayList();

    StreetViewPanoramaView$b(ViewGroup viewGroup, Context context, StreetViewPanoramaOptions streetViewPanoramaOptions) {
        this.b = viewGroup;
        this.c = context;
        this.d = streetViewPanoramaOptions;
    }

    protected void a(g<StreetViewPanoramaView$a> gVar) {
        this.a = gVar;
        i();
    }

    public void a(g gVar) {
        if (a() != null) {
            ((StreetViewPanoramaView$a) a()).a(gVar);
        } else {
            this.e.add(gVar);
        }
    }

    public void i() {
        if (this.a != null && a() == null) {
            try {
                this.a.a(new StreetViewPanoramaView$a(this.b, v.a(this.c).a(f.a(this.c), this.d)));
                for (g a : this.e) {
                    ((StreetViewPanoramaView$a) a()).a(a);
                }
                this.e.clear();
            } catch (RemoteException e) {
                throw new j(e);
            } catch (c e2) {
            }
        }
    }
}
