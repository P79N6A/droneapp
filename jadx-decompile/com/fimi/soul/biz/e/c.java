package com.fimi.soul.biz.e;

import android.text.TextUtils;
import com.fimi.kernel.b.c.d;
import com.fimi.kernel.utils.n;
import com.fimi.kernel.utils.x;
import com.fimi.soul.biz.camera.e;
import com.fimi.soul.biz.camera.entity.RelayEntity;
import com.fimi.soul.biz.update.l;
import com.fimi.soul.module.update.a.b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public class c implements d {
    private static c b = new c();
    int a;
    private com.fimi.kernel.b.d.c c = ((com.fimi.kernel.b.d.c) com.fimi.kernel.c.a(com.fimi.kernel.b.d.Socket));
    private String d;
    private String e;
    private JSONObject f = null;
    private List<a> g = new ArrayList();

    public interface a {
        void a(RelayEntity relayEntity);
    }

    private c() {
        com.fimi.kernel.b.d.d f = this.c.f();
        f.a(e.c());
        f.a(8080);
        f.b(10240);
        f.b(true);
        f.a(true);
        this.c.b((d) this);
    }

    public static synchronized c a() {
        c cVar;
        synchronized (c.class) {
            if (b == null) {
                b = new c();
            }
            cVar = b;
        }
        return cVar;
    }

    public void a(a aVar) {
        this.g.add(aVar);
    }

    public void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            RelayEntity relayEntity = new RelayEntity();
            l.c("msg:" + str);
            try {
                this.f = new JSONObject(str);
                this.f = new JSONObject(this.f.getJSONObject("system").toString());
                this.d = this.f.optString("device_type");
                relayEntity.setDevice_type(this.d);
                if (TextUtils.isEmpty(this.e) && !TextUtils.isEmpty(this.f.getString("sw_version"))) {
                    com.fimi.soul.module.update.a.a.a().a(new com.fimi.soul.module.update.a.e(this.e, 14, Integer.valueOf(n.n(this.f.getString("sw_version"))).intValue()));
                    com.fimi.soul.module.update.a.a.a().a(14, Integer.valueOf(n.n(this.f.getString("sw_version"))).intValue());
                }
                this.e = this.f.getString("sw_version");
                if (!TextUtils.isEmpty(this.e) && com.fimi.soul.module.update.a.a.a().b().get(Integer.valueOf(14)) == null) {
                    com.fimi.soul.module.update.a.a.a().a(new com.fimi.soul.module.update.a.e(this.e, 14, Integer.valueOf(n.n(this.f.getString("sw_version"))).intValue()));
                    com.fimi.soul.module.update.a.a.a().a(14, Integer.valueOf(n.n(this.f.getString("sw_version"))).intValue());
                }
                this.a = this.f.getInt("firmupg_finished");
                relayEntity.setFirmupg_finished(this.a);
                relayEntity.setSw_version(this.e);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (this.g != null && this.g.size() > 0) {
                for (a a : this.g) {
                    a.a(relayEntity);
                }
            }
        }
    }

    public void b() {
        x.a(new Runnable(this) {
            final /* synthetic */ c a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.c.d();
            }
        });
    }

    public void b(a aVar) {
        this.g.remove(aVar);
    }

    public int c() {
        return this.a;
    }

    public boolean d() {
        return this.a > 0;
    }

    public String e() {
        if (TextUtils.isEmpty(this.e)) {
            b bVar = (b) com.fimi.kernel.c.c().a(com.fimi.soul.module.update.b.w, b.class);
            if (bVar != null) {
                return bVar.k() + "";
            }
        }
        return n.n(this.e) + "";
    }

    public com.fimi.kernel.b.d.c f() {
        return this.c;
    }
}
