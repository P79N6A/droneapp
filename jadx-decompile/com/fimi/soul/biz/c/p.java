package com.fimi.soul.biz.c;

import com.fimi.overseas.soul.R;
import com.fimi.soul.drone.a;
import com.fimi.soul.drone.h.al;
import com.fimi.soul.drone.h.am;
import com.fimi.soul.entity.FlyActionBean;
import com.fimi.soul.module.b.d;
import com.fimi.soul.utils.af;
import com.fimi.soul.utils.z;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;

public class p implements m {
    private List<FlyActionBean> a;
    private a b;
    private volatile int c = 1;

    public p(a aVar) {
        this.b = aVar;
    }

    public void a() {
        al l = this.b.l();
        if (l.a() < this.c || this.c != l.a() || l.g() != 0.0d || this.a == null || this.c > this.a.size()) {
            return;
        }
        if (l.a() == this.a.size()) {
            d.a(this.b).q();
            return;
        }
        this.c++;
        a(this.c);
    }

    public void a(int i) {
        if (this.a.size() >= 1 && i <= this.a.size()) {
            LatLng latLng;
            FlyActionBean flyActionBean = (FlyActionBean) this.a.get(i - 1);
            if (com.fimi.soul.biz.n.a.a().b()) {
                latLng = new LatLng(flyActionBean.getLatLng().a, flyActionBean.getLatLng().b);
            } else {
                af a = z.a(0.5d, flyActionBean.getLatLng().a, flyActionBean.getLatLng().b);
                latLng = new LatLng(a.a(), a.b());
            }
            d.a(this.b).a(i, latLng.b, latLng.a, (short) flyActionBean.getHeight(), (short) this.a.size(), flyActionBean.getSpeek());
        }
    }

    public void a(am amVar) {
        List h = d.k().h();
        List f = d.k().f();
        LatLng latLng = new LatLng(amVar.c(), amVar.b());
        if (!(h == null || h.contains(latLng) || amVar.h() == 0)) {
            h.add(latLng);
            FlyActionBean flyActionBean = new FlyActionBean();
            flyActionBean.setLatLng(latLng);
            flyActionBean.setHeight((int) amVar.d());
            flyActionBean.setType(1);
            flyActionBean.setModelType(1);
            flyActionBean.setSpeek((int) amVar.g());
            if (!(f == null || f.contains(flyActionBean))) {
                f.add(flyActionBean);
            }
        }
        if (amVar.h() <= h.size()) {
            this.b.a(com.fimi.soul.drone.d.a.RESHWAYPOINT);
        } else {
            b(amVar.a() + 1);
        }
    }

    public void a(List<FlyActionBean> list) {
        if (list == null || list.size() > 0) {
            this.c = 1;
            this.a = list;
            a(this.c);
            return;
        }
        com.fimi.kernel.utils.z.a(this.b.d, (int) R.string.no_waypoint);
    }

    public void b(int i) {
        d.a(this.b).a(i);
    }
}
