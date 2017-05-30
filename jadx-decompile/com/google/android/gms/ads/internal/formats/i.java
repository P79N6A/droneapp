package com.google.android.gms.ads.internal.formats;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

public interface i {

    public interface a {
        void a(i iVar);

        String k();

        String l();

        a m();
    }

    void a();

    void a(MotionEvent motionEvent);

    void a(View view);

    void a(View view, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);

    void a(View view, Map<String, WeakReference<View>> map);

    void a(View view, Map<String, WeakReference<View>> map, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);

    void b(View view);

    View e();

    Context f();
}
