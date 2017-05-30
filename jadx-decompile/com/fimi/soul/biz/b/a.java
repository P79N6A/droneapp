package com.fimi.soul.biz.b;

import android.content.Context;
import com.fimi.kernel.b.d;
import com.fimi.kernel.b.e;
import com.fimi.kernel.b.e.b;
import com.fimi.kernel.c;
import com.fimi.soul.entity.UpdateDroneInforBean;
import com.fimi.soul.utils.NetUtil;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

public class a {
    private b a = null;
    private UpdateDroneInforBean b;
    private Context c;

    public a(Context context) {
        this.c = context;
        this.a = (b) c.a(d.Volley);
        this.b = (UpdateDroneInforBean) c.c().a(com.fimi.soul.drone.g.c.r, UpdateDroneInforBean.class);
    }

    public void a() {
        if (this.b != null && !"".equals(this.b.getPlaneID())) {
            List arrayList = new ArrayList();
            arrayList.add(new BasicNameValuePair("commandCode", "commitDeviceVersion"));
            arrayList.add(new BasicNameValuePair("userID", this.b.getUserID() + ""));
            arrayList.add(new BasicNameValuePair("planeID", this.b.getPlaneID()));
            if (com.fimi.soul.biz.e.d.a().k()) {
                arrayList.add(new BasicNameValuePair("fcType", com.fimi.soul.drone.g.c.bJ));
            } else {
                arrayList.add(new BasicNameValuePair("fcType", com.fimi.soul.drone.g.c.bI));
            }
            Gson gson = new Gson();
            gson.toJson(this.b.getmDroneInfoBean());
            arrayList.add(new BasicNameValuePair("jsonStr", gson.toJson(this.b.getmDroneInfoBean())));
            NetUtil.a(arrayList, c.a());
            String format = URLEncodedUtils.format(arrayList, "UTF-8");
            this.a.a(String.format("%s?%s", new Object[]{com.fimi.soul.base.a.j, format}), new e<String>(this) {
                final /* synthetic */ a a;

                {
                    this.a = r1;
                }

                public void a(String str) {
                    if (str != null && str.length() <= 0) {
                    }
                }

                public void b(String str) {
                }
            });
        }
    }
}
