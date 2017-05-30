package com.google.android.gms.internal;

import android.text.TextUtils;
import com.fimi.soul.entity.User;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.plus.e;
import com.tencent.tauth.AuthActivity;
import java.util.Map;

@aaa
public final class vr implements vt {
    private long a(long j) {
        return (j - u.k().a()) + u.k().b();
    }

    private void b(acy com_google_android_gms_internal_acy, Map<String, String> map) {
        String str = (String) map.get(e.i);
        String str2 = (String) map.get("start_label");
        String str3 = (String) map.get("timestamp");
        if (TextUtils.isEmpty(str)) {
            b.d("No label given for CSI tick.");
        } else if (TextUtils.isEmpty(str3)) {
            b.d("No timestamp given for CSI tick.");
        } else {
            try {
                long a = a(Long.parseLong(str3));
                if (TextUtils.isEmpty(str2)) {
                    str2 = "native:view_load";
                }
                com_google_android_gms_internal_acy.y().a(str, str2, a);
            } catch (Throwable e) {
                b.d("Malformed timestamp for CSI tick.", e);
            }
        }
    }

    private void c(acy com_google_android_gms_internal_acy, Map<String, String> map) {
        String str = (String) map.get("value");
        if (TextUtils.isEmpty(str)) {
            b.d("No value given for CSI experiment.");
            return;
        }
        un a = com_google_android_gms_internal_acy.y().a();
        if (a == null) {
            b.d("No ticker for WebView, dropping experiment ID.");
        } else {
            a.a("e", str);
        }
    }

    private void d(acy com_google_android_gms_internal_acy, Map<String, String> map) {
        String str = (String) map.get(User.FN_NAME);
        String str2 = (String) map.get("value");
        if (TextUtils.isEmpty(str2)) {
            b.d("No value given for CSI extra.");
        } else if (TextUtils.isEmpty(str)) {
            b.d("No name given for CSI extra.");
        } else {
            un a = com_google_android_gms_internal_acy.y().a();
            if (a == null) {
                b.d("No ticker for WebView, dropping extra parameter.");
            } else {
                a.a(str, str2);
            }
        }
    }

    public void a(acy com_google_android_gms_internal_acy, Map<String, String> map) {
        String str = (String) map.get(AuthActivity.ACTION_KEY);
        if ("tick".equals(str)) {
            b(com_google_android_gms_internal_acy, map);
        } else if ("experiment".equals(str)) {
            c(com_google_android_gms_internal_acy, map);
        } else if ("extra".equals(str)) {
            d(com_google_android_gms_internal_acy, map);
        }
    }
}
