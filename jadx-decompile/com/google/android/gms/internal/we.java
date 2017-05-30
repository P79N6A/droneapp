package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.fimi.soul.utils.a.b.a;
import com.google.android.gms.ads.internal.client.ac;
import com.google.android.gms.ads.internal.overlay.k;
import com.google.android.gms.ads.internal.util.client.b;
import com.tencent.tauth.AuthActivity;
import java.util.Map;
import org.json.JSONObject;

@aaa
public final class we implements vt {
    private boolean a;

    private static int a(Context context, Map<String, String> map, String str, int i) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                i = ac.a().a(context, Integer.parseInt(str2));
            } catch (NumberFormatException e) {
                b.d(new StringBuilder((String.valueOf(str).length() + 34) + String.valueOf(str2).length()).append("Could not parse ").append(str).append(" in a video GMSG: ").append(str2).toString());
            }
        }
        return i;
    }

    public void a(acy com_google_android_gms_internal_acy, Map<String, String> map) {
        String str = (String) map.get(AuthActivity.ACTION_KEY);
        if (str == null) {
            b.d("Action missing from video GMSG.");
            return;
        }
        if (b.a(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String valueOf = String.valueOf(jSONObject.toString());
            b.a(new StringBuilder((String.valueOf(str).length() + 13) + String.valueOf(valueOf).length()).append("Video GMSG: ").append(str).append(" ").append(valueOf).toString());
        }
        if ("background".equals(str)) {
            valueOf = (String) map.get("color");
            if (TextUtils.isEmpty(valueOf)) {
                b.d("Color parameter missing from color video GMSG.");
                return;
            }
            try {
                com_google_android_gms_internal_acy.setBackgroundColor(Color.parseColor(valueOf));
                return;
            } catch (IllegalArgumentException e) {
                b.d("Invalid color parameter in video GMSG.");
                return;
            }
        }
        acx w = com_google_android_gms_internal_acy.w();
        if (w == null) {
            b.d("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean equals = "new".equals(str);
        boolean equals2 = "position".equals(str);
        int a;
        int min;
        if (equals || equals2) {
            Context context = com_google_android_gms_internal_acy.getContext();
            int a2 = a(context, map, "x", 0);
            a = a(context, map, "y", 0);
            int a3 = a(context, map, "w", -1);
            int a4 = a(context, map, "h", -1);
            if (((Boolean) uf.bR.c()).booleanValue()) {
                min = Math.min(a3, com_google_android_gms_internal_acy.getMeasuredWidth() - a2);
                a4 = Math.min(a4, com_google_android_gms_internal_acy.getMeasuredHeight() - a);
            } else {
                min = a3;
            }
            try {
                a3 = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException e2) {
                a3 = 0;
            }
            boolean parseBoolean = Boolean.parseBoolean((String) map.get("spherical"));
            if (equals && w.a() == null) {
                w.a(a2, a, min, a4, a3, parseBoolean);
                return;
            } else {
                w.a(a2, a, min, a4);
                return;
            }
        }
        k a5 = w.a();
        if (a5 == null) {
            k.a(com_google_android_gms_internal_acy);
        } else if ("click".equals(str)) {
            r0 = com_google_android_gms_internal_acy.getContext();
            a = a(r0, map, "x", 0);
            min = a(r0, map, "y", 0);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, (float) a, (float) min, 0);
            a5.a(obtain);
            obtain.recycle();
        } else if ("currentTime".equals(str)) {
            valueOf = (String) map.get(a.i);
            if (valueOf == null) {
                b.d("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                a5.a((int) (Float.parseFloat(valueOf) * 1000.0f));
            } catch (NumberFormatException e3) {
                str = "Could not parse time parameter from currentTime video GMSG: ";
                valueOf = String.valueOf(valueOf);
                b.d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
        } else if ("hide".equals(str)) {
            a5.setVisibility(4);
        } else if ("load".equals(str)) {
            a5.g();
        } else if ("muted".equals(str)) {
            if (Boolean.parseBoolean((String) map.get("muted"))) {
                a5.j();
            } else {
                a5.k();
            }
        } else if ("pause".equals(str)) {
            a5.h();
        } else if ("play".equals(str)) {
            a5.i();
        } else if ("show".equals(str)) {
            a5.setVisibility(0);
        } else if ("src".equals(str)) {
            a5.a((String) map.get("src"));
        } else if ("touchMove".equals(str)) {
            r0 = com_google_android_gms_internal_acy.getContext();
            a5.a((float) a(r0, map, "dx", 0), (float) a(r0, map, "dy", 0));
            if (!this.a) {
                com_google_android_gms_internal_acy.i().r();
                this.a = true;
            }
        } else if (MediaRouteProviderProtocol.CLIENT_DATA_VOLUME.equals(str)) {
            valueOf = (String) map.get(MediaRouteProviderProtocol.CLIENT_DATA_VOLUME);
            if (valueOf == null) {
                b.d("Level parameter missing from volume video GMSG.");
                return;
            }
            try {
                a5.a(Float.parseFloat(valueOf));
            } catch (NumberFormatException e4) {
                str = "Could not parse volume parameter from volume video GMSG: ";
                valueOf = String.valueOf(valueOf);
                b.d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
        } else if ("watermark".equals(str)) {
            a5.l();
        } else {
            String str2 = "Unknown video action: ";
            valueOf = String.valueOf(str);
            b.d(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
    }
}
