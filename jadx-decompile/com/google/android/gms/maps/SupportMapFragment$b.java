package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import com.google.android.gms.c.b;
import com.google.android.gms.c.f;
import com.google.android.gms.c.g;
import com.google.android.gms.common.c;
import com.google.android.gms.maps.a.d;
import com.google.android.gms.maps.a.v;
import com.google.android.gms.maps.model.j;
import java.util.ArrayList;
import java.util.List;

class SupportMapFragment$b extends b<SupportMapFragment$a> {
    protected g<SupportMapFragment$a> a;
    private final Fragment b;
    private Activity c;
    private final List<f> d = new ArrayList();

    SupportMapFragment$b(Fragment fragment) {
        this.b = fragment;
    }

    private void a(Activity activity) {
        this.c = activity;
        i();
    }

    protected void a(g<SupportMapFragment$a> gVar) {
        this.a = gVar;
        i();
    }

    public void a(f fVar) {
        if (a() != null) {
            ((SupportMapFragment$a) a()).a(fVar);
        } else {
            this.d.add(fVar);
        }
    }

    public void c(Bundle bundle) {
        if (a() != null) {
            ((SupportMapFragment$a) a()).c(bundle);
        }
    }

    public void i() {
        if (this.c != null && this.a != null && a() == null) {
            try {
                e.a(this.c);
                d b = v.a(this.c).b(f.a(this.c));
                if (b != null) {
                    this.a.a(new SupportMapFragment$a(this.b, b));
                    for (f a : this.d) {
                        ((SupportMapFragment$a) a()).a(a);
                    }
                    this.d.clear();
                }
            } catch (RemoteException e) {
                throw new j(e);
            } catch (c e2) {
            }
        }
    }

    public void j() {
        if (a() != null) {
            ((SupportMapFragment$a) a()).h();
        }
    }
}
