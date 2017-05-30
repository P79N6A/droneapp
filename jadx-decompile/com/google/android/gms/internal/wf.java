package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.b;
import java.util.Map;

@aaa
class wf implements vt {
    wf() {
    }

    private int a(Map<String, String> map) {
        int parseInt = Integer.parseInt((String) map.get("playbackState"));
        return (parseInt < 0 || 3 < parseInt) ? 0 : parseInt;
    }

    public void a(acy com_google_android_gms_internal_acy, Map<String, String> map) {
        Throwable e;
        if (((Boolean) uf.aS.c()).booleanValue()) {
            add com_google_android_gms_internal_add;
            add z = com_google_android_gms_internal_acy.z();
            if (z == null) {
                try {
                    z = new add(com_google_android_gms_internal_acy, Float.parseFloat((String) map.get("duration")));
                    com_google_android_gms_internal_acy.a(z);
                    com_google_android_gms_internal_add = z;
                } catch (NullPointerException e2) {
                    e = e2;
                    b.b("Unable to parse videoMeta message.", e);
                    u.i().a(e, "VideoMetaGmsgHandler.onGmsg");
                    return;
                } catch (NumberFormatException e3) {
                    e = e3;
                    b.b("Unable to parse videoMeta message.", e);
                    u.i().a(e, "VideoMetaGmsgHandler.onGmsg");
                    return;
                }
            }
            com_google_android_gms_internal_add = z;
            boolean equals = "1".equals(map.get("muted"));
            float parseFloat = Float.parseFloat((String) map.get("currentTime"));
            int a = a(map);
            String str = (String) map.get("aspectRatio");
            float parseFloat2 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
            if (b.a(3)) {
                b.a(new StringBuilder(String.valueOf(str).length() + 79).append("Video Meta GMSG: isMuted : ").append(equals).append(" , playbackState : ").append(a).append(" , aspectRatio : ").append(str).toString());
            }
            com_google_android_gms_internal_add.a(parseFloat, a, equals, parseFloat2);
        }
    }
}
