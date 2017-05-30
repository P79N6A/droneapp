package com.fimi.soul.module.dronemanage;

import android.content.Context;
import android.graphics.Point;
import android.location.Location;
import android.os.Handler;
import android.os.Message;
import android.support.v4.internal.view.SupportMenu;
import android.util.DisplayMetrics;
import com.fimi.kernel.utils.t;
import com.fimi.kernel.utils.v;
import com.fimi.overseas.soul.R;
import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d.b;
import com.fimi.soul.drone.h.ag;
import com.fimi.soul.drone.h.ba;
import com.fimi.soul.drone.h.z;
import com.fimi.soul.module.droneFragment.g;
import com.fimi.soul.utils.y;
import com.google.android.gms.maps.c;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.i;
import java.util.ArrayList;
import java.util.List;

public class d implements b {
    private float A = 0.0f;
    PolylineOptions a;
    List<ba> b;
    g c;
    PolylineOptions d = null;
    int e = 0;
    private c f;
    private Context g;
    private a h;
    private LatLng i;
    private LatLng j = null;
    private int k = 20;
    private boolean l = true;
    private com.google.android.gms.maps.model.g m;
    private float n;
    private int o;
    private boolean p;
    private int q;
    private int r;
    private v s;
    private String t = com.fimi.soul.drone.g.c.bG;
    private String u = com.fimi.soul.drone.g.c.bH;
    private final int v = 100;
    private Handler w = new Handler(this) {
        final /* synthetic */ d a;

        {
            this.a = r1;
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 100 && com.fimi.kernel.d.b.b(this.a.h.d) != null) {
                com.fimi.kernel.d.b.b(this.a.h.d).a(this.a.h.d.getString(R.string.set_home));
            }
        }
    };
    private i x;
    private i y;
    private List<LatLng> z = new ArrayList();

    public d(c cVar, Context context, a aVar) {
        this.f = cVar;
        this.g = context;
        this.h = aVar;
        this.c = g.a();
        a();
    }

    private double a(com.google.android.gms.maps.model.g gVar, ba baVar, LatLng latLng) {
        double a = y.c(latLng, baVar.b()).a();
        if (com.fimi.kernel.c.e().m()) {
            gVar.a(this.g.getResources().getString(R.string.distancetag) + t.a(a) + this.g.getResources().getString(R.string.foot_unit));
            return t.a(a);
        }
        gVar.a(this.g.getResources().getString(R.string.distancetag) + t.a(a, 1) + this.g.getResources().getString(R.string.meter));
        return a;
    }

    private void a(z zVar) {
        this.i = new LatLng(zVar.b(), zVar.c());
        this.c.a(this.f, new LatLng(zVar.b(), zVar.c()));
        this.c.a(com.fimi.soul.drone.g.c.Y);
    }

    private void b(LatLng latLng) {
        DisplayMetrics displayMetrics = this.g.getResources().getDisplayMetrics();
        Point a = this.f.n().a(latLng);
        if (a.y > displayMetrics.heightPixels || a.y < 0 || a.x < 0 || a.x > displayMetrics.widthPixels) {
            this.h.a(com.fimi.soul.drone.d.a.CHANGELOCATIONBUTTONOUT);
            if (this.h.r().a() / 100.0d >= 1.0d) {
                this.f.a(com.google.android.gms.maps.b.a(latLng, this.A));
                return;
            }
            return;
        }
        this.h.a(com.fimi.soul.drone.d.a.CHANGELOCATIONBUTTONIN);
    }

    private void c(LatLng latLng) {
        if (this.h.ac()) {
            h(latLng);
            g(latLng);
        } else if (this.x != null) {
            this.x.a();
        }
        f(latLng);
        e(latLng);
        d(latLng);
    }

    private void d(LatLng latLng) {
        if (this.b != null && this.b.size() > 0 && this.k == 6 && this.o > 0 && this.o <= this.b.size()) {
            a(this.m, (ba) this.b.get(this.o - 1), latLng);
            if (this.k == 6) {
                this.m.h();
            }
        } else if (this.k == 4) {
            if (this.b != null && this.b.size() > 0) {
                a(this.m, (ba) this.b.get(0), latLng);
                this.m.h();
            }
        } else if (this.m.j() && com.fimi.soul.module.droneFragment.c.d().get() != 1) {
            this.m.i();
        }
    }

    private void e() {
        LatLngBounds.a aVar = new LatLngBounds.a();
        Location b = this.h.b();
        if (this.j != null) {
            aVar.a(this.j);
        }
        if (b != null) {
            aVar.a(new LatLng(b.getLatitude(), b.getLongitude()));
        }
        if (this.i != null) {
            aVar.a(this.i);
        }
        a(aVar.a());
        com.fimi.soul.biz.d.a a = com.fimi.soul.biz.d.a.a();
        a.a(true);
        a.a(com.fimi.soul.biz.d.a.a.DRONE);
    }

    private void e(LatLng latLng) {
        if (this.m != null) {
            com.fimi.soul.module.droneFragment.c.c().a(this.h);
            this.m.a(latLng);
        } else {
            this.m = this.f.a(new MarkerOptions().a(latLng).a(com.google.android.gms.maps.model.b.a(R.drawable.icon_fly_handpiece_location)).a(false));
        }
        this.m.a(0.5f, 0.5f);
        if (this.n < 0.0f) {
            this.n += 360.0f;
        }
        this.m.b(this.n + g());
    }

    private void f() {
        if (!this.h.U()) {
            if (!this.h.T().a()) {
                if (this.m != null) {
                    this.m.a();
                    this.m = null;
                    g.a().b(com.fimi.soul.drone.g.c.X);
                }
                if (this.y != null) {
                    this.y.a();
                    this.y = null;
                }
                if (this.x != null) {
                    this.x.a();
                    this.x = null;
                }
                g.a().b(com.fimi.soul.drone.g.c.Y);
            } else if (!(this.y == null || this.y.h())) {
                this.y.b(true);
            }
            com.fimi.soul.module.droneFragment.c.f();
        }
    }

    private void f(LatLng latLng) {
        if (this.f.a() != null) {
            this.A = this.f.a().b;
        }
        if (this.l && this.j.a > 1.0d && this.j.b > 1.0d && this.h.u().c() >= (byte) 6) {
            this.e++;
            this.h.f(true);
            this.A = 18.0f;
            if (this.h.ac()) {
                LatLngBounds.a aVar = new LatLngBounds.a();
                Location b = this.h.b();
                aVar.a(this.j);
                if (b != null) {
                    aVar.a(new LatLng(b.getLatitude(), b.getLongitude()));
                }
                if (this.i != null) {
                    aVar.a(this.i);
                }
                a(aVar.a());
                return;
            }
            this.l = false;
            this.f.b(com.google.android.gms.maps.b.a(this.j, this.A));
        }
    }

    private synchronized float g() {
        float f = 0.0f;
        synchronized (this) {
            try {
                CameraPosition a = this.f.a();
                if (a != null) {
                    f = a.d;
                }
            } catch (Exception e) {
            }
        }
        return f;
    }

    private void g(LatLng latLng) {
        if (this.i != null) {
            this.z.add(latLng);
            this.z.add(this.i);
            if (this.d == null) {
                this.d = new PolylineOptions();
                this.d.a(this.h.d.getResources().getColor(R.color.drone_home_line)).a(5.0f);
            }
            if (this.y != null && this.y.h()) {
                this.y.a();
                this.y = null;
            }
            if (this.y != null) {
                this.y.a(this.z);
                if (!this.y.g()) {
                    this.y.a(true);
                }
            } else {
                this.y = this.f.a(this.d.a(new LatLng[]{latLng, this.i}));
            }
            this.z.clear();
        }
    }

    private void h(LatLng latLng) {
        if (this.x != null) {
            this.x.a();
        }
        this.x = this.f.a(a(latLng));
    }

    public PolylineOptions a(LatLng latLng) {
        if (this.a == null) {
            this.a = new PolylineOptions();
            this.a.b(true);
            this.a.a(com.fimi.soul.view.photodraweeview.c.a);
            this.a.a(SupportMenu.CATEGORY_MASK);
        }
        this.a.a(latLng);
        List b = this.a.b();
        if (b != null && b.size() >= 10) {
            b.remove(b.get(0));
        }
        return this.a;
    }

    public void a() {
        this.h.a((b) this);
        com.fimi.soul.module.droneFragment.c.c().e();
    }

    public void a(LatLngBounds latLngBounds) {
        this.f.a(com.google.android.gms.maps.b.a(latLngBounds, com.fimi.soul.utils.g.a(this.h.d, com.google.android.gms.maps.model.b.b), com.fimi.soul.utils.g.a(this.h.d, com.google.android.gms.maps.model.b.b), 0), new c.a(this) {
            final /* synthetic */ d a;

            {
                this.a = r1;
            }

            public void a() {
                if (this.a.e >= 2) {
                    this.a.l = false;
                    this.a.e = 0;
                }
            }

            public void b() {
                this.a.l = true;
            }
        });
    }

    public void a(com.google.android.gms.maps.model.g gVar) {
        if (this.j != null && this.m != null) {
            double a = y.c(this.j, gVar.c()).a();
            if (com.fimi.kernel.c.e().m()) {
                this.m.a(this.g.getResources().getString(R.string.distancetag) + t.a(a) + this.g.getResources().getString(R.string.foot_unit));
            } else {
                this.m.a(this.g.getResources().getString(R.string.distancetag) + t.a(a, 1) + this.g.getResources().getString(R.string.meter));
            }
            this.m.h();
        }
    }

    public void b() {
        this.l = true;
    }

    public void c() {
        com.fimi.soul.module.droneFragment.c.c().b(0);
        com.fimi.soul.module.droneFragment.c.c();
        com.fimi.soul.module.droneFragment.c.f();
    }

    public void d() {
        if (this.m != null) {
            this.m.a();
            this.m = null;
        }
    }

    public void onDroneEvent(com.fimi.soul.drone.d.a aVar, a aVar2) {
        switch (aVar) {
            case CLEANALLOBJ:
                f();
                return;
            case HEARDDAY:
                if (aVar2.u().c() > (byte) 3) {
                    ag u = aVar2.u();
                    this.j = new LatLng(u.e(), u.d());
                    aVar2.a(this.j);
                    if (aVar2.aj().d() != (byte) 2) {
                        c(this.j);
                        return;
                    }
                    return;
                }
                return;
            case Remotecontrol:
                f();
                return;
            case HOMEPOINT:
                if (!aVar2.ac()) {
                    this.p = false;
                    g.a().b(com.fimi.soul.drone.g.c.Y);
                    if (this.y != null) {
                        this.y.a();
                        this.y = null;
                    }
                } else if (aVar2.v().f()) {
                    a(aVar2.v());
                    if (!this.p && aVar2.aj().b() == (byte) 3) {
                        this.p = true;
                        this.s = v.a(this.g);
                        this.t = com.fimi.soul.drone.g.c.bG;
                        this.u = com.fimi.soul.drone.g.c.bH;
                        this.s.a().edit().putFloat(this.t, (float) aVar2.v().b()).commit();
                        this.s.a().edit().putFloat(this.u, (float) aVar2.v().c()).commit();
                        this.w.sendEmptyMessageDelayed(100, 1500);
                        e();
                    }
                    if (this.r != this.k) {
                        this.r = this.k;
                    }
                }
                this.o = aVar2.v().e();
                if (this.q != this.k) {
                    this.q = this.k;
                    return;
                }
                return;
            case HEARDATA:
                this.n = (float) (aVar2.r().k() / 10.0d);
                return;
            case NEWFRONEMODEL:
                this.k = aVar2.aj().e();
                return;
            case CHANGEFLIGHTHEAD:
                if (this.m != null) {
                    if (this.n < 0.0f) {
                        this.n += 360.0f;
                    }
                    this.m.b(this.n + aVar2.ae());
                    return;
                }
                return;
            default:
                return;
        }
    }
}
