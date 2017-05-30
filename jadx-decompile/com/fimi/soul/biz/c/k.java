package com.fimi.soul.biz.c;

import android.content.Context;
import com.fimi.kernel.utils.z;
import com.fimi.overseas.soul.R;
import com.fimi.soul.biz.k.b;
import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d;
import com.fimi.soul.drone.h.ag;
import com.fimi.soul.entity.FlyActionBean;
import com.fimi.soul.utils.y;
import com.google.android.gms.maps.c;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.g;
import com.google.android.gms.maps.model.i;
import java.util.List;

public class k implements a {
    private c a;
    private Context b;
    private a c;
    private d d = d.k();
    private g e;
    private i f;

    public k(c cVar, Context context, a aVar) {
        this.c = aVar;
        this.a = cVar;
        this.b = context;
    }

    public void a() {
        ag u = this.c.u();
        a(u.e(), u.d());
    }

    public void a(double d, double d2) {
        a(new LatLng(d, d2), 0);
    }

    public void a(FlyActionBean flyActionBean) {
        List f = this.d.f();
        LatLng latLng = flyActionBean.getLatLng();
        if (this.e == null) {
            this.e = this.a.a(i.a(latLng, this.c.d, this.d.g(), true, R.drawable.img_fly_flag_blue));
            this.e.a(flyActionBean);
            this.e.a(1000.0f);
            this.e.a(0.2f, 0.8f);
            this.e.a(false);
            this.d.a(flyActionBean);
            if (!f.contains(flyActionBean)) {
                f.add(flyActionBean);
            }
            f = this.d.e();
            if (!(f == null || f.contains(this.e))) {
                f.add(this.e);
            }
            this.c.a(d.a.SHOWPOIOPERA);
        }
    }

    public void a(LatLng latLng) {
        List b = d.k().b();
        if (b != null && !b.contains(latLng)) {
            b.add(latLng);
            if (b.size() < 2) {
                return;
            }
            if (this.f == null) {
                this.f = this.a.a(i.a(b, 4, this.b.getResources().getColor(R.color.drone_inface_line)).b(50.0f));
            } else {
                this.f.a(b);
            }
        }
    }

    public void a(LatLng latLng, int i) {
        for (com.google.android.gms.maps.model.c cVar : b.a().b()) {
            if (cVar != null && y.c(cVar.c(), latLng).a() < cVar.d()) {
                z.a(this.c.d, (int) R.string.flyzonwaypoint, 3000);
                return;
            }
        }
        double a = y.c(latLng, new LatLng(this.c.v().b(), this.c.v().c())).a();
        if (a <= 500.0d) {
            List f = this.d.f();
            if (this.e == null) {
                FlyActionBean flyActionBean = new FlyActionBean();
                flyActionBean.setLatLng(latLng);
                flyActionBean.setDrawableRes(R.drawable.img_fly_flag_blue);
                flyActionBean.setCanclick(true);
                flyActionBean.setType(2);
                flyActionBean.setModelType(3);
                flyActionBean.setStyleInfo(1);
                flyActionBean.setHeight(this.d.g());
                this.e = this.a.a(i.a(latLng, this.c.d, this.d.g(), true, R.drawable.img_fly_flag_blue));
                this.e.a(flyActionBean);
                this.e.a(1000.0f);
                this.e.a(0.2f, 0.8f);
                this.e.a(false);
                this.d.a(flyActionBean);
                if (!f.contains(flyActionBean)) {
                    f.add(flyActionBean);
                }
                f = this.d.e();
                if (!(f == null || f.contains(this.e))) {
                    f.add(this.e);
                }
                this.c.a(d.a.SHOWPOIOPERA);
                return;
            }
            ((FlyActionBean) this.e.o()).setLatLng(latLng);
            this.e.a(latLng);
        } else if (a > 500.0d) {
            z.a(this.b, (int) R.string.outterwaypoint);
        }
    }

    public void b() {
        if (this.e != null) {
            this.e.a(j.a(R.drawable.img_fly_flag_red));
        }
        h.a(this.b).a(0);
    }

    public void c() {
        if (this.e != null) {
            FlyActionBean flyActionBean = (FlyActionBean) this.e.o();
            if (flyActionBean != null) {
                flyActionBean.setStyleInfo(1);
            }
            this.e.a(this.c.d.getString(R.string.delete_marker));
            this.e.h();
        }
    }

    public void d() {
        if (this.e != null) {
            FlyActionBean flyActionBean = (FlyActionBean) this.e.o();
            if (flyActionBean != null) {
                flyActionBean.setType(1);
                this.e.a(j.a(this.c.d, R.drawable.img_fly_flag_blue, flyActionBean.getHeight(), false));
            }
        }
    }

    public void e() {
        if (this.e != null) {
            FlyActionBean flyActionBean = (FlyActionBean) this.e.o();
            if (flyActionBean != null && flyActionBean.getModelType() == 3 && 1 == flyActionBean.getType()) {
                flyActionBean.setStyleInfo(2);
                flyActionBean.setCanExcute(false);
                this.e.a(j.a(R.drawable.img_fly_flag_blue));
                if (this.e.j()) {
                    this.e.i();
                }
                this.e.a(this.c.d.getString(R.string.delete_marker));
                this.e.h();
            }
        }
    }

    public void f() {
        if (this.e != null) {
            FlyActionBean flyActionBean = (FlyActionBean) this.e.o();
            if (flyActionBean != null && flyActionBean.getModelType() == 3 && 1 == flyActionBean.getType()) {
                flyActionBean.setStyleInfo(2);
                flyActionBean.setCanExcute(true);
                this.e.a(j.a(R.drawable.img_fly_flag_blue));
                if (this.e.j()) {
                    this.e.i();
                }
                this.e.a(this.c.d.getString(R.string.delete_marker));
                this.e.h();
            }
        }
    }

    public void g() {
        FlyActionBean j = d.k().j();
        if (j != null) {
            j.setType(1);
        }
        if (this.e != null) {
            this.e.i();
        }
    }

    public void h() {
        if (this.e != null) {
            if (this.e.j()) {
                this.e.i();
            }
            this.e.a(false);
        }
    }

    public void i() {
        if (this.e != null) {
            this.e.a();
            this.e = null;
        }
        if (this.f != null) {
            this.f.a();
            this.f = null;
        }
        this.d.f().clear();
        this.c.a(d.a.HIDEHEIGHTVALUE);
    }
}
