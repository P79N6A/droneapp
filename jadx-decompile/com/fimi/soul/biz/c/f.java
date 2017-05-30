package com.fimi.soul.biz.c;

import com.fimi.kernel.utils.z;
import com.fimi.overseas.soul.R;
import com.fimi.soul.drone.a;
import com.fimi.soul.entity.FlyActionBean;
import com.fimi.soul.module.b.d;
import com.fimi.soul.utils.af;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;

public class f implements m {
    private a a;

    public f(a aVar) {
        this.a = aVar;
    }

    public void a() {
        d.a(this.a).a(0, 0.0d, 0.0d, (short) 0, 170, 0);
    }

    public void a(List<FlyActionBean> list) {
        if (list == null || list.size() <= 0) {
            z.a(this.a.d, (int) R.string.no_flytopoint);
            return;
        }
        LatLng latLng;
        FlyActionBean flyActionBean = (FlyActionBean) list.get(0);
        if (com.fimi.soul.biz.n.a.a().b()) {
            latLng = new LatLng(flyActionBean.getLatLng().a, flyActionBean.getLatLng().b);
        } else {
            af a = com.fimi.soul.utils.z.a(0.5d, flyActionBean.getLatLng().a, flyActionBean.getLatLng().b);
            latLng = new LatLng(a.a(), a.b());
        }
        d.a(this.a).a(1, latLng.b, latLng.a, (short) flyActionBean.getHeight(), 85, flyActionBean.getSpeek());
    }
}
