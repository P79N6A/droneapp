package com.fimi.soul.utils;

import android.content.Context;
import android.text.TextUtils;
import com.fimi.kernel.c;
import com.fimi.soul.biz.m.k;
import com.fimi.soul.biz.manager.x;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.User;
import com.fimi.soul.receiver.NetworkStateReceiver;
import java.io.File;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class FlyLogTools extends NetworkStateReceiver {
    public static FlyLogTools c;
    static long d;
    t b;
    private Context e;

    private class a implements k {
        final /* synthetic */ FlyLogTools a;
        private String b;

        public a(FlyLogTools flyLogTools, String str) {
            this.a = flyLogTools;
            this.b = str;
        }

        public void a(PlaneMsg planeMsg, File file) {
            if (planeMsg.isSuccess() && this.a.b != null && !"".equals(this.b)) {
                this.a.b.b(this.b);
            }
        }
    }

    public FlyLogTools(Context context) {
        this.b = t.a(context);
    }

    public static FlyLogTools a(Context context) {
        if (c == null) {
            c = new FlyLogTools(context);
        }
        return c;
    }

    public void a() {
        try {
            new Thread(new Runnable(this) {
                final /* synthetic */ FlyLogTools a;

                {
                    this.a = r1;
                }

                public void run() {
                    Context a = c.a();
                    if (a != null) {
                        x a2 = x.a(a);
                        String i = com.fimi.soul.module.update.a.a.a().a(0).i();
                        User b = com.fimi.soul.base.a.b(a);
                        if (b != null || !TextUtils.isEmpty(b.getUserID())) {
                            String userID = b.getUserID();
                            this.a.b = t.a(a);
                            List<u> a3 = this.a.b.a(b.getUserID());
                            if (a3 != null && a3.size() > 0) {
                                JSONArray jSONArray = new JSONArray();
                                try {
                                    for (u uVar : a3) {
                                        JSONObject jSONObject = new JSONObject();
                                        jSONObject.put("planeID", i);
                                        jSONObject.put("flyTime", uVar.c());
                                        jSONObject.put("flyJourney", uVar.d());
                                        jSONObject.put("userID", userID);
                                        jSONArray.put(jSONObject);
                                    }
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                                a2.b(jSONArray.toString(), new a(this.a, userID));
                            }
                        }
                    }
                }
            }).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void a(final k kVar) {
        try {
            new Thread(new Runnable(this) {
                final /* synthetic */ FlyLogTools b;

                public void run() {
                    Context a = c.a();
                    if (a != null) {
                        x a2 = x.a(a);
                        String i = com.fimi.soul.module.update.a.a.a().a(0).i();
                        User b = com.fimi.soul.base.a.b(a);
                        if (b != null || !TextUtils.isEmpty(b.getUserID())) {
                            c.c();
                            a2.d(i, b.getUserID(), kVar);
                        }
                    }
                }
            }).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void a(com.fimi.soul.receiver.NetworkStateReceiver.a aVar, Context context) {
        if (aVar == com.fimi.soul.receiver.NetworkStateReceiver.a.Wifi || aVar == com.fimi.soul.receiver.NetworkStateReceiver.a.Mobile) {
            this.e = context;
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - d >= 1000) {
                d = currentTimeMillis;
                a();
            }
        }
    }
}
