package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.facebook.common.util.UriUtil;
import org.json.JSONObject;

@aaa
public class yv extends Handler {
    private final yu a;

    public yv(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this(new yw(context));
    }

    public yv(yu yuVar) {
        this.a = yuVar;
    }

    private void a(JSONObject jSONObject) {
        try {
            this.a.a(jSONObject.getString("request_id"), jSONObject.getString("base_url"), jSONObject.getString("html"));
        } catch (Exception e) {
        }
    }

    public void handleMessage(Message message) {
        try {
            Bundle data = message.getData();
            if (data != null) {
                JSONObject jSONObject = new JSONObject(data.getString(UriUtil.DATA_SCHEME));
                if ("fetch_html".equals(jSONObject.getString("message_name"))) {
                    a(jSONObject);
                }
            }
        } catch (Exception e) {
        }
    }
}
