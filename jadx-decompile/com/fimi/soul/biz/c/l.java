package com.fimi.soul.biz.c;

import com.fimi.kernel.utils.z;
import com.fimi.overseas.soul.R;
import com.fimi.soul.drone.a;
import com.fimi.soul.entity.FlyActionBean;
import com.fimi.soul.module.b.d;
import com.fimi.soul.utils.af;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;

public class l implements m {
    private a a;

    public l(a aVar) {
        this.a = aVar;
    }

    public void a() {
        d.a(this.a).a(1, 0.0d, 0.0d, 0, 22, 0, 0, 0, 0, 0);
    }

    public void a(List<FlyActionBean> list) {
        if (list == null || list.size() <= 0) {
            z.a(this.a.d, (int) R.string.no_poipoint);
            return;
        }
        LatLng latLng;
        FlyActionBean flyActionBean = (FlyActionBean) list.get(0);
        int start_point_agle = (flyActionBean.getPara1() == 0 || flyActionBean.getPara1() == 1) ? (short) ((int) (((double) (360 - flyActionBean.getStart_point_agle())) / 1.412d)) : (short) ((int) (((double) flyActionBean.getStart_point_agle()) / 1.412d));
        if (com.fimi.soul.biz.n.a.a().b()) {
            latLng = new LatLng(flyActionBean.getLatLng().a, flyActionBean.getLatLng().b);
        } else {
            af a = com.fimi.soul.utils.z.a(0.5d, flyActionBean.getLatLng().a, flyActionBean.getLatLng().b);
            latLng = new LatLng(a.a(), a.b());
        }
        d.a(this.a).a(1, latLng.b, latLng.a, flyActionBean.getHeight() * 10, flyActionBean.getOpration_Code(), flyActionBean.getRidus() * 10, flyActionBean.getSpeek() * 10, start_point_agle, flyActionBean.getPara1(), flyActionBean.getYaw_mode());
    }
}
