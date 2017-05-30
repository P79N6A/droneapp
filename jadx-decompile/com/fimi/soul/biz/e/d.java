package com.fimi.soul.biz.e;

import android.text.TextUtils;
import com.fimi.kernel.b.d.c;
import com.fimi.kernel.utils.n;
import com.fimi.kernel.utils.x;
import com.fimi.soul.biz.camera.e;
import com.fimi.soul.biz.camera.entity.RelayEntity;
import com.fimi.soul.biz.update.l;
import com.fimi.soul.module.update.a.b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class d implements com.fimi.kernel.b.c.d {
    private static d b = new d();
    int a;
    private c c = ((c) com.fimi.kernel.c.a(com.fimi.kernel.b.d.Socket));
    private String d;
    private String e;
    private volatile String f = "5G";
    private int g;
    private boolean h = false;
    private boolean i = false;
    private JSONObject j = null;
    private String k;
    private String l;
    private List<a> m = new ArrayList();

    public interface a {
        void a(RelayEntity relayEntity);
    }

    private d() {
        com.fimi.kernel.b.d.d f = this.c.f();
        f.a(e.b());
        f.a(8080);
        f.b(10240);
        f.b(true);
        f.a(true);
        this.c.b((com.fimi.kernel.b.c.d) this);
    }

    public static synchronized d a() {
        d dVar;
        synchronized (d.class) {
            if (b == null) {
                b = new d();
            }
            dVar = b;
        }
        return dVar;
    }

    private void f(String str) {
        try {
            JSONObject jSONObject = (JSONObject) new JSONObject(str).get("fwdap");
            this.k = jSONObject.getString("ssid");
            this.l = jSONObject.getString("key");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void a(com.fimi.kernel.b.c.d dVar) {
        this.c.b(dVar);
    }

    public void a(a aVar) {
        this.m.add(aVar);
    }

    public void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            l.b(str);
            this.i = true;
            RelayEntity relayEntity = new RelayEntity();
            try {
                this.j = new JSONObject(str);
                String jSONObject = this.j.getJSONObject("system").toString();
                String jSONObject2 = this.j.getJSONObject("camera").toString();
                this.j = new JSONObject(jSONObject);
                this.f = this.j.optString("device_type");
                relayEntity.setDevice_type(this.f);
                if (TextUtils.isEmpty(this.d) && !TextUtils.isEmpty(this.j.getString("sw_version"))) {
                    if ("4K".equalsIgnoreCase(this.f)) {
                        com.fimi.soul.module.update.a.a.a().a(new com.fimi.soul.module.update.a.e(this.e, 15, Integer.valueOf(n.n(this.j.getString("sw_version"))).intValue()));
                        com.fimi.soul.module.update.a.a.a().a(15, Integer.valueOf(n.n(this.j.getString("sw_version"))).intValue());
                    } else {
                        com.fimi.soul.module.update.a.a.a().a(new com.fimi.soul.module.update.a.e(this.e, 11, Integer.valueOf(n.n(this.j.getString("sw_version"))).intValue()));
                        com.fimi.soul.module.update.a.a.a().a(11, Integer.valueOf(n.n(this.j.getString("sw_version"))).intValue());
                    }
                }
                this.d = this.j.getString("sw_version");
                this.e = this.j.getString("hw_version");
                this.a = this.j.getInt("firmupg_finished");
                relayEntity.setFirmupg_finished(this.a);
                relayEntity.setHw_version(this.e);
                relayEntity.setSw_version(this.d);
                this.j = new JSONObject(jSONObject2);
                this.g = this.j.getInt("quality");
                this.h = this.j.getBoolean("connected");
                relayEntity.setQuality(this.g);
                relayEntity.setIsConnectCamera(this.h);
                if (str.contains("fwdap")) {
                    f(str);
                } else {
                    this.k = null;
                    this.l = null;
                }
            } catch (JSONException e) {
                l.b("e:" + e.getMessage().toString());
                e.printStackTrace();
            }
            if (this.m != null && this.m.size() > 0) {
                for (a a : this.m) {
                    a.a(relayEntity);
                }
            }
        }
    }

    public void a(boolean z) {
        this.h = z;
    }

    public void b() {
        this.c.g();
        this.c.d();
    }

    public void b(a aVar) {
        this.m.remove(aVar);
    }

    public void b(String str) {
        this.d = str;
    }

    public void b(boolean z) {
        this.i = z;
    }

    public void c() {
        x.a(new Runnable(this) {
            final /* synthetic */ d a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.c.d();
            }
        });
    }

    public void c(String str) {
        this.f = str;
    }

    public String d() {
        if (TextUtils.isEmpty(this.d)) {
            b bVar = (b) com.fimi.kernel.c.c().a(com.fimi.soul.module.update.b.w, b.class);
            if (bVar != null) {
                return bVar.e() + "";
            }
        }
        return this.d;
    }

    public void d(String str) {
        this.l = str;
    }

    public String e() {
        return this.e;
    }

    public void e(String str) {
        this.k = str;
    }

    public int f() {
        return this.g;
    }

    public int g() {
        return this.a;
    }

    public boolean h() {
        return this.a > 0;
    }

    public boolean i() {
        return "4K".equalsIgnoreCase(this.f);
    }

    public boolean j() {
        return TextUtils.isEmpty(this.f);
    }

    public boolean k() {
        return "4K".equalsIgnoreCase(this.f);
    }

    public boolean l() {
        return "5G".equalsIgnoreCase(this.f);
    }

    public boolean m() {
        return this.h;
    }

    public boolean n() {
        return this.i;
    }

    public c o() {
        return this.c;
    }

    public String p() {
        return this.l;
    }

    public String q() {
        return this.k;
    }
}
