package com.fimi.soul.biz.c;

import android.content.Context;
import com.fimi.overseas.soul.R;
import com.fimi.soul.drone.a;
import com.google.android.gms.maps.c;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.g;
import com.google.android.gms.maps.model.i;
import java.util.List;

public class b {
    public volatile boolean a;
    private c b;
    private Context c;
    private a d;
    private g e;
    private i f;

    public b(c cVar, Context context, a aVar) {
        this.d = aVar;
        this.b = cVar;
        this.c = context;
    }

    public void a() {
        a(new LatLng(this.d.u().e(), this.d.u().d()));
    }

    public void a(LatLng latLng) {
        if (this.e == null) {
            this.e = this.b.a(new MarkerOptions().a(j.a(R.drawable.img_fly_origin_blue)).a(latLng));
            this.e.a(0.5f, 0.88f);
            this.e.a(this);
        }
    }

    public void b() {
        if (this.e != null) {
            this.e.a(j.a(R.drawable.img_fly_origin_red));
        }
    }

    public void b(LatLng latLng) {
        List b = d.k().b();
        if (b != null && !b.contains(latLng)) {
            b.add(latLng);
            if (b.size() < 2) {
                return;
            }
            if (this.f == null) {
                this.f = this.b.a(i.a(b, 4, this.c.getResources().getColor(R.color.drone_inface_line)).b(50.0f));
            } else {
                this.f.a(b);
            }
        }
    }

    public void c() {
        if (this.e != null) {
            this.e.a();
            this.e = null;
        }
        if (this.f != null) {
            this.f.a();
            this.f = null;
        }
    }

    public void d() {
        this.a = false;
        if (this.e != null) {
            this.e.a(this.d.d.getString(R.string.delete_marker));
            this.e.h();
        }
    }

    public void e() {
        this.a = false;
        if (this.e != null) {
            this.e.i();
        }
    }

    public void f() {
        this.a = true;
        if (this.e != null) {
            this.e.i();
        }
    }

    public boolean g() {
        return this.e == null;
    }
}
