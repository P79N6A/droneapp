package com.fimi.soul.biz.f;

import android.content.Context;
import com.fimi.kernel.utils.x;
import com.fimi.soul.biz.m.k;
import com.fimi.soul.biz.manager.r;
import com.fimi.soul.entity.BatteryOverDischange;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.utils.ao;
import com.fimi.soul.utils.d;
import java.io.File;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class a {
    private d a = d.a(this.b);
    private Context b;
    private r c = r.a(this.b);

    public a(Context context) {
        this.b = context;
    }

    public void a() {
        x.b(new Runnable(this) {
            final /* synthetic */ a a;

            {
                this.a = r1;
            }

            public void run() {
                if (ao.b(this.a.b)) {
                    List<BatteryOverDischange> a = this.a.a.a();
                    if (a.size() > 0) {
                        JSONArray jSONArray = new JSONArray();
                        try {
                            for (BatteryOverDischange batteryOverDischange : a) {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("userID", batteryOverDischange.getUserId());
                                jSONObject.put("batteryId", batteryOverDischange.getBatteryId());
                                jSONObject.put("battery_level", batteryOverDischange.getBatteryLevel());
                                jSONObject.put("voltage", batteryOverDischange.getVoltage());
                                jSONObject.put("battery_current", batteryOverDischange.getBatteryCurrent());
                                jSONObject.put("temperature", batteryOverDischange.getTemperature());
                                jSONObject.put("battery_full", batteryOverDischange.getBatteryFull());
                                jSONObject.put("battery_one", batteryOverDischange.getBatteryOne());
                                jSONObject.put("battery_two", batteryOverDischange.getBatteryTwo());
                                jSONObject.put("battery_three", batteryOverDischange.getBatteryThree());
                                jSONObject.put("battery_four", batteryOverDischange.getBatteryFour());
                                jSONObject.put("battery_recyle", batteryOverDischange.getBatteryRecyle());
                                jSONObject.put("version", batteryOverDischange.getVersion());
                                jSONObject.put("appType", batteryOverDischange.getAppType());
                                jSONObject.put("accidentType", batteryOverDischange.getAccidentType());
                                jSONObject.put("updateTimes", batteryOverDischange.getUpdateTimes());
                                jSONObject.put("curElectric ", batteryOverDischange.getCurElectric());
                                jSONObject.put("fcVersion", batteryOverDischange.getFcVersion());
                                jSONArray.put(jSONObject);
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        this.a.c.b(jSONArray.toString(), new k(this) {
                            final /* synthetic */ AnonymousClass1 a;

                            {
                                this.a = r1;
                            }

                            public void a(PlaneMsg planeMsg, File file) {
                                if (planeMsg.isSuccess()) {
                                    this.a.a.a.b();
                                }
                            }
                        });
                    }
                }
            }
        });
    }

    public void a(final BatteryOverDischange batteryOverDischange) {
        JSONArray jSONArray = new JSONArray();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("userID", batteryOverDischange.getUserId());
            jSONObject.put("batteryId", batteryOverDischange.getBatteryId());
            jSONObject.put("battery_level", batteryOverDischange.getBatteryLevel());
            jSONObject.put("voltage", batteryOverDischange.getVoltage());
            jSONObject.put("battery_current", batteryOverDischange.getBatteryCurrent());
            jSONObject.put("temperature", batteryOverDischange.getTemperature());
            jSONObject.put("battery_full", batteryOverDischange.getBatteryFull());
            jSONObject.put("battery_one", batteryOverDischange.getBatteryOne());
            jSONObject.put("battery_two", batteryOverDischange.getBatteryTwo());
            jSONObject.put("battery_three", batteryOverDischange.getBatteryThree());
            jSONObject.put("battery_four", batteryOverDischange.getBatteryFour());
            jSONObject.put("battery_recyle", batteryOverDischange.getBatteryRecyle());
            jSONObject.put("version", batteryOverDischange.getVersion());
            jSONObject.put("appType", batteryOverDischange.getAppType());
            jSONObject.put("accidentType", batteryOverDischange.getAccidentType());
            jSONObject.put("updateTimes", batteryOverDischange.getUpdateTimes());
            jSONObject.put("curElectric ", batteryOverDischange.getCurElectric());
            jSONObject.put("fcVersion", batteryOverDischange.getFcVersion());
            jSONArray.put(jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (ao.b(this.b)) {
            this.c.b(jSONArray.toString(), new k(this) {
                final /* synthetic */ a b;

                public void a(PlaneMsg planeMsg, File file) {
                    if (!planeMsg.isSuccess()) {
                        this.b.a.a(batteryOverDischange);
                    }
                }
            });
        } else {
            this.a.a(batteryOverDischange);
        }
    }
}
