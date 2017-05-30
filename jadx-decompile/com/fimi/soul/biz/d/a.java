package com.fimi.soul.biz.d;

import android.location.Location;
import android.widget.ImageButton;
import com.fimi.overseas.soul.R;
import com.google.android.gms.maps.b;
import com.google.android.gms.maps.c;
import com.google.android.gms.maps.model.LatLng;
import java.lang.ref.WeakReference;

public class a {
    private static a e;
    public volatile a a = a.DRONE;
    private ImageButton b;
    private com.fimi.soul.drone.a c;
    private int d = 0;
    private WeakReference<ImageButton> f;
    private volatile boolean g = true;
    private int h = 18;

    public enum a {
        PEOPLE,
        DRONE,
        DRONEPRESS,
        CACHESTATUS
    }

    public static a a() {
        if (e == null) {
            e = new a();
        }
        return e;
    }

    public void a(int i) {
        if (this.b != null && this.d != i) {
            this.b.setImageResource(i);
            this.d = i;
        }
    }

    public void a(ImageButton imageButton, com.fimi.soul.drone.a aVar) {
        this.f = new WeakReference(imageButton);
        this.b = (ImageButton) this.f.get();
        this.c = aVar;
        b();
    }

    public void a(a aVar) {
        this.a = aVar;
    }

    public void a(LatLng latLng) {
        c aa = this.c.aa();
        if (aa != null && latLng != null) {
            aa.a(b.a(latLng), 300, new com.google.android.gms.maps.c.a(this) {
                final /* synthetic */ a a;

                {
                    this.a = r1;
                }

                public void a() {
                }

                public void b() {
                }
            });
        }
    }

    public void a(boolean z) {
        this.g = z;
    }

    public void b() {
        if (!this.c.U() || this.c.u().c() < (byte) 3) {
            a(a.PEOPLE);
            a((int) R.drawable.locationbutton);
        } else if (this.a == a.DRONEPRESS) {
            a(a.DRONEPRESS);
            a((int) R.mipmap.btn_fly_location_plane_checked);
        } else {
            a(a.DRONE);
            a((int) R.mipmap.btn_fly_location_plane_normal);
        }
    }

    public a c() {
        return this.a;
    }

    public void d() {
        c aa = this.c.aa();
        if (aa != null) {
            switch (this.a) {
                case DRONE:
                    a((int) R.mipmap.btn_fly_location_plane_checked);
                    a(a.DRONEPRESS);
                    aa.a(b.b((float) this.h));
                    return;
                case PEOPLE:
                    Location b = this.c.b();
                    if (b != null) {
                        aa.b(b.a(new LatLng(b.getLatitude(), b.getLongitude()), 18.0f));
                        return;
                    }
                    return;
                case DRONEPRESS:
                    a((int) R.mipmap.btn_fly_location_plane_normal);
                    a(a.DRONE);
                    return;
                default:
                    return;
            }
        }
    }

    public boolean e() {
        return this.g;
    }
}
