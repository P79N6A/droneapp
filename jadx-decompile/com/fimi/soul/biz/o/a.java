package com.fimi.soul.biz.o;

import android.content.Context;
import com.fimi.kernel.utils.x;
import com.fimi.soul.biz.m.k;
import com.fimi.soul.biz.manager.r;
import com.fimi.soul.entity.FlyModeLog;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.utils.ao;
import com.fimi.soul.utils.s;
import java.io.File;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class a {
    private static a c = null;
    private r a;
    private Context b;
    private s d = s.a(this.b);

    private a(Context context) {
        this.a = r.a(context);
        this.b = context;
    }

    public static a a(Context context) {
        if (c == null) {
            c = new a(context.getApplicationContext());
        }
        return c;
    }

    public void a() {
        x.b(new Runnable(this) {
            final /* synthetic */ a a;

            {
                this.a = r1;
            }

            public void run() {
                if (ao.b(this.a.b)) {
                    List<FlyModeLog> a = this.a.d.a();
                    if (a.size() > 0) {
                        JSONArray jSONArray = new JSONArray();
                        try {
                            for (FlyModeLog flyModeLog : a) {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("userID", flyModeLog.getUserID());
                                jSONObject.put("fcVersion", flyModeLog.getFcVersion());
                                jSONObject.put("openType", flyModeLog.getOpenType());
                                jSONObject.put("applyTime", flyModeLog.getInsertTime());
                                jSONObject.put("x2Version", flyModeLog.getX2Version());
                                jSONObject.put("appType", flyModeLog.getAppType());
                                jSONArray.put(jSONObject);
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        this.a.a.a(jSONArray.toString(), new k(this) {
                            final /* synthetic */ AnonymousClass2 a;

                            {
                                this.a = r1;
                            }

                            public void a(PlaneMsg planeMsg, File file) {
                                if (planeMsg.isSuccess()) {
                                    this.a.a.d.b();
                                }
                            }
                        });
                    }
                }
            }
        });
    }

    public void a(final FlyModeLog flyModeLog) {
        JSONArray jSONArray = new JSONArray();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("userID", flyModeLog.getUserID());
            jSONObject.put("fcVersion", flyModeLog.getFcVersion());
            jSONObject.put("openType", flyModeLog.getOpenType());
            jSONObject.put("applyTime", flyModeLog.getApplyTime());
            jSONObject.put("x2Version", flyModeLog.getX2Version());
            jSONObject.put("appType", flyModeLog.getAppType());
            jSONArray.put(jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (ao.b(this.b)) {
            this.a.a(jSONArray.toString(), new k(this) {
                final /* synthetic */ a b;

                public void a(PlaneMsg planeMsg, File file) {
                    if (!planeMsg.isSuccess()) {
                        this.b.d.a(flyModeLog);
                    }
                }
            });
        } else {
            this.d.a(flyModeLog);
        }
    }
}
