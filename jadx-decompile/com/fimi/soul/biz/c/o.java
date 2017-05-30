package com.fimi.soul.biz.c;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.fimi.kernel.utils.z;
import com.fimi.overseas.soul.R;
import com.fimi.soul.biz.k.b;
import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d;
import com.fimi.soul.entity.FlyActionBean;
import com.fimi.soul.utils.y;
import com.google.android.gms.maps.c;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.g;
import com.google.android.gms.maps.model.i;
import java.util.List;

public class o implements a {
    Handler a = new Handler(this) {
        final /* synthetic */ o a;

        {
            this.a = r1;
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == this.a.j && this.a.h != null) {
                if (this.a.k) {
                    this.a.h.a(j.a(this.a.f.d, R.drawable.img_fly_origin_blue_m, this.a.i.getHeight(), false));
                    this.a.k = false;
                } else {
                    this.a.h.a(j.a(this.a.f.d, R.drawable.img_fly_origin_flash, this.a.i.getHeight(), false));
                    this.a.k = true;
                }
            }
            this.a.a.sendEmptyMessageDelayed(this.a.j, (long) this.a.l);
        }
    };
    private c b;
    private Context c;
    private volatile i d;
    private d e;
    private a f;
    private volatile i g;
    private g h;
    private FlyActionBean i;
    private int j = 100;
    private boolean k;
    private int l = 200;

    public o(c cVar, Context context, a aVar) {
        this.f = aVar;
        this.b = cVar;
        this.c = context;
        this.e = d.k();
    }

    public synchronized void a() {
        g gVar;
        FlyActionBean flyActionBean;
        List h;
        List e = d.k().e();
        if (d.k().f().size() > 0 && e.size() == 0) {
            for (FlyActionBean flyActionBean2 : d.k().f()) {
                g a = this.b.a(i.a(flyActionBean2.getLatLng(), R.drawable.img_fly_origin_blue));
                a.a(flyActionBean2);
                a.a(0.5f, 0.88f);
                a.i();
                if (!e.contains(a)) {
                    e.add(a);
                }
            }
        }
        if (e != null) {
            if (e.size() > 1) {
                for (int i = 0; i < e.size(); i++) {
                    gVar = (g) e.get(i);
                    flyActionBean = (FlyActionBean) gVar.o();
                    if (i == e.size() - 1) {
                        gVar.a(j.a(R.drawable.img_fly_flag_blue));
                        flyActionBean.setStyleInfo(2);
                        flyActionBean.setCanclick(true);
                        flyActionBean.setDrawableRes(R.drawable.img_fly_flag_blue);
                        gVar.a(0.1f, 0.9f);
                    } else {
                        flyActionBean.setCanclick(false);
                        gVar.a(j.a(R.drawable.img_fly_origin_blue));
                        flyActionBean.setDrawableRes(R.drawable.img_fly_origin_blue);
                        gVar.a(0.5f, 0.7f);
                    }
                    flyActionBean.setModelType(1);
                    gVar.a(false);
                    if (gVar.j()) {
                        gVar.i();
                    }
                }
                h = this.e.h();
                if (h != null && h.size() > 0) {
                    if (this.d != null) {
                        this.d = this.b.a(i.a(h, 4, this.c.getResources().getColor(R.color.polyline_coclor)));
                    } else {
                        this.d.a(h);
                    }
                    this.e.a(this.d);
                }
                if (this.g != null) {
                    this.g.a();
                    this.g = null;
                }
                if (d.k().b() != null) {
                    d.k().b().clear();
                }
            }
        }
        if (e.size() > 0) {
            gVar = (g) e.get(0);
            flyActionBean = (FlyActionBean) gVar.o();
            gVar.a(j.a(R.drawable.img_fly_flag_blue));
            flyActionBean.setStyleInfo(2);
            flyActionBean.setCanclick(true);
            flyActionBean.setDrawableRes(R.drawable.img_fly_flag_blue);
            gVar.a(0.1f, 0.9f);
        }
        h = this.e.h();
        if (this.d != null) {
            this.d.a(h);
        } else {
            this.d = this.b.a(i.a(h, 4, this.c.getResources().getColor(R.color.polyline_coclor)));
        }
        this.e.a(this.d);
        if (this.g != null) {
            this.g.a();
            this.g = null;
        }
        if (d.k().b() != null) {
            d.k().b().clear();
        }
    }

    public void a(int i) {
        if (this.f.aj().e() == (byte) 6) {
            List e = this.e.e();
            if (e.size() >= 1 && i <= e.size() && i >= 1) {
                g gVar;
                if (i <= e.size() - 1) {
                    gVar = (g) e.get(i - 1);
                    this.h = gVar;
                    gVar.a(0.3f, 0.7f);
                    this.i = (FlyActionBean) gVar.o();
                    if (!this.a.hasMessages(this.j)) {
                        this.a.sendEmptyMessageDelayed(this.j, (long) this.l);
                    }
                } else if (i == e.size()) {
                    if (this.a.hasMessages(this.j)) {
                        this.a.removeMessages(this.j);
                    }
                    gVar = (g) e.get(e.size() - 1);
                    gVar.a(j.a(this.f.d, R.drawable.img_fly_flag_blue, ((FlyActionBean) gVar.o()).getHeight(), false));
                    gVar.a(0.15f, 0.9f);
                }
                if (i >= 2) {
                    for (int i2 = 0; i2 < i - 1; i2++) {
                        gVar = (g) e.get(i2);
                        gVar.a(j.a(R.drawable.img_fly_origin_red));
                        gVar.a(0.2f, 0.7f);
                    }
                }
            }
        }
    }

    public void a(FlyActionBean flyActionBean) {
        int i = 0;
        List h = this.e.h();
        List f = this.e.f();
        List<g> e = this.e.e();
        if (flyActionBean != null && f.contains(flyActionBean)) {
            i = f.indexOf(flyActionBean);
            f.remove(flyActionBean);
        }
        int i2 = i;
        if (h != null && h.contains(flyActionBean.getLatLng())) {
            h.remove(flyActionBean.getLatLng());
            if (this.d == null || h.size() <= 0) {
                this.f.a(d.a.HIDEHEIGHTVALUE);
            } else {
                this.d.a(h);
            }
        }
        if (e != null) {
            for (g gVar : e) {
                if (gVar.o().equals(flyActionBean)) {
                    gVar.a();
                    e.remove(gVar);
                    break;
                }
            }
        }
        if (f.size() >= 1 && i2 <= f.size() && i2 > 0) {
            this.e.a((FlyActionBean) f.get(i2 - 1));
        } else if (f.size() >= 1) {
            this.e.a((FlyActionBean) f.get(f.size() - 1));
        }
        if (e.size() >= 1 && i2 <= e.size() && i2 > 0) {
            ((g) e.get(i2 - 1)).a(j.a(this.f.d, R.drawable.icon_fly_waypoint_red, flyActionBean.getHeight(), true));
        } else if (e.size() >= 1) {
            ((g) e.get(e.size() - 1)).a(j.a(this.f.d, R.drawable.icon_fly_waypoint_red, flyActionBean.getHeight(), true));
        }
    }

    public void a(LatLng latLng) {
        List b = d.k().b();
        if (b != null && !b.contains(latLng)) {
            b.add(latLng);
            if (b.size() < 2) {
                return;
            }
            if (this.g == null) {
                this.g = this.b.a(i.a(b, 4, this.c.getResources().getColor(R.color.drone_inface_line)).b(50.0f));
            } else {
                this.g.a(b);
            }
        }
    }

    public void a(LatLng latLng, int i) {
        List h = this.e.h();
        List<g> e = this.e.e();
        if (e == null || e.size() < 20) {
            for (com.google.android.gms.maps.model.c cVar : b.a().b()) {
                if (cVar != null && y.c(cVar.c(), latLng).a() < cVar.d()) {
                    z.a(this.f.d, (int) R.string.flyzonwaypoint, 3000);
                    return;
                }
            }
            double a = y.c(latLng, new LatLng(this.f.v().b(), this.f.v().c())).a();
            if (a <= 500.0d) {
                FlyActionBean flyActionBean = new FlyActionBean();
                flyActionBean.setLatLng(latLng);
                flyActionBean.setDrawableRes(i);
                flyActionBean.setCanclick(true);
                flyActionBean.setType(2);
                flyActionBean.setModelType(1);
                flyActionBean.setHeight(this.e.g());
                flyActionBean.setSpeek(this.e.l());
                g a2 = this.b.a(i.a(latLng, this.f.d, this.e.g(), true, i));
                a2.a(0.5f, 0.88f);
                a2.a(flyActionBean);
                a2.a(1000.0f);
                this.e.a(flyActionBean);
                if (!(e == null || e.contains(a2))) {
                    for (g gVar : e) {
                        gVar.a(j.a(this.f.d, R.drawable.icon_fly_waypoint_blue, ((FlyActionBean) gVar.o()).getHeight(), false));
                    }
                    e.add(a2);
                    this.f.a(d.a.SHOWHEIGHTVIEW);
                }
                List f = this.e.f();
                if (!(f == null || f.contains(flyActionBean))) {
                    f.add(flyActionBean);
                }
                if (h != null && !h.contains(h)) {
                    h.add(latLng);
                    if (this.d == null) {
                        this.d = this.b.a(i.a(h, 4, this.c.getResources().getColor(R.color.polyline_coclor)));
                    } else {
                        this.d.a(h);
                    }
                    this.e.a(this.d);
                    return;
                }
                return;
            } else if (a > 500.0d) {
                z.a(this.c, (int) R.string.outterwaypoint);
                return;
            } else {
                return;
            }
        }
        z.a(this.f.d, (int) R.string.waypointCountOut, 3000);
    }

    public void b() {
        if (this.a.hasMessages(this.j)) {
            this.a.removeMessages(this.j);
        }
        if (this.d != null) {
            this.d.a();
            this.d = null;
        }
        if (this.g != null) {
            this.g.a();
            this.g = null;
        }
    }

    public void c() {
        List e = d.k().e();
        List h = d.k().h();
        int e2 = this.f.v().e();
        if (e != null && e.size() > 0 && h != null && e2 >= h.size()) {
            z.a(this.f.d, (int) R.string.excute_waypoint_com, 3000);
            com.fimi.kernel.d.b.b(this.f.d).a(this.f.d.getString(R.string.excute_waypoint_com));
            ((g) e.get(e.size() - 1)).a(j.a(R.drawable.img_fly_flag_red));
            h.a(this.f.d).a(0);
            this.f.a(d.a.SHOWINFORWINDOW);
        }
    }

    public void d() {
        List h = d.k().h();
        List<FlyActionBean> f = d.k().f();
        if (h != null && f != null) {
            h.clear();
            for (FlyActionBean flyActionBean : f) {
                if (!h.contains(flyActionBean.getLatLng())) {
                    h.add(flyActionBean.getLatLng());
                }
            }
            this.d.a(h);
        }
    }

    public void e() {
        if (this.a.hasMessages(this.j)) {
            this.a.removeMessages(this.j);
        }
        List e = this.e.e();
        if (e != null && e.size() > 0) {
            g gVar = (g) e.get(e.size() - 1);
            FlyActionBean flyActionBean = (FlyActionBean) gVar.o();
            if (flyActionBean != null && flyActionBean.getModelType() == 1) {
                flyActionBean.setStyleInfo(2);
                flyActionBean.setCanExcute(true);
                gVar.a("");
                gVar.h();
            }
        }
    }

    public void f() {
        List e = this.e.e();
        if (e != null && e.size() > 0) {
            g gVar = (g) e.get(e.size() - 1);
            FlyActionBean flyActionBean = (FlyActionBean) gVar.o();
            if (gVar != null && flyActionBean != null && flyActionBean.getModelType() == 1) {
                if (gVar.j()) {
                    gVar.i();
                }
                flyActionBean.setStyleInfo(2);
                flyActionBean.setCanExcute(false);
                gVar.a(this.f.d.getString(R.string.delete_marker));
                gVar.h();
            }
        }
    }

    public void g() {
        List e = this.e.e();
        if (e != null && e.size() > 0) {
            g gVar = (g) e.get(e.size() - 1);
            FlyActionBean flyActionBean = (FlyActionBean) gVar.o();
            if (flyActionBean != null && flyActionBean.getModelType() == 1) {
                flyActionBean.setStyleInfo(2);
                flyActionBean.setCanExcute(true);
                if (gVar.j()) {
                    gVar.i();
                    if (!gVar.j()) {
                        gVar.a("");
                        gVar.h();
                    }
                }
            }
        }
    }

    public void h() {
        List e = this.e.e();
        if (e != null && e.size() > 0) {
            g gVar = (g) e.get(e.size() - 1);
            if (gVar.j()) {
                gVar.i();
            }
        }
    }
}
