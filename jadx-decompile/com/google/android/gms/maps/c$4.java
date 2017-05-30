package com.google.android.gms.maps;

import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.maps.a.ak;
import com.google.android.gms.maps.a.c.a;
import com.google.android.gms.maps.model.j;

class c$4 extends a {
    final /* synthetic */ d a;
    final /* synthetic */ c b;

    c$4(c cVar, d dVar) {
        this.b = cVar;
        this.a = dVar;
    }

    public void a() {
        this.a.a();
    }

    public void a(final ak akVar) {
        this.a.a(new d.a(this) {
            final /* synthetic */ c$4 b;

            public void a(Location location) {
                try {
                    akVar.a(location);
                } catch (RemoteException e) {
                    throw new j(e);
                }
            }
        });
    }
}
