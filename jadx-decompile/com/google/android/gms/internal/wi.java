package com.google.android.gms.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.client.ac;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.a;
import com.google.android.gms.common.api.k;
import java.lang.ref.WeakReference;
import java.util.Map;

@aaa
public abstract class wi implements k {
    protected Context a;
    protected String b;
    protected WeakReference<acy> c;

    public wi(acy com_google_android_gms_internal_acy) {
        this.a = com_google_android_gms_internal_acy.getContext();
        this.b = u.e().a(this.a, com_google_android_gms_internal_acy.o().b);
        this.c = new WeakReference(com_google_android_gms_internal_acy);
    }

    private void a(String str, Map<String, String> map) {
        acy com_google_android_gms_internal_acy = (acy) this.c.get();
        if (com_google_android_gms_internal_acy != null) {
            com_google_android_gms_internal_acy.a(str, (Map) map);
        }
    }

    private String c(String str) {
        String str2 = "internal";
        Object obj = -1;
        switch (str.hashCode()) {
            case -1396664534:
                if (str.equals("badUrl")) {
                    obj = 6;
                    break;
                }
                break;
            case -1347010958:
                if (str.equals("inProgress")) {
                    obj = 2;
                    break;
                }
                break;
            case -918817863:
                if (str.equals("downloadTimeout")) {
                    obj = 7;
                    break;
                }
                break;
            case -659376217:
                if (str.equals("contentLengthMissing")) {
                    obj = 3;
                    break;
                }
                break;
            case -642208130:
                if (str.equals("playerFailed")) {
                    obj = 1;
                    break;
                }
                break;
            case -354048396:
                if (str.equals("sizeExceeded")) {
                    obj = 8;
                    break;
                }
                break;
            case -32082395:
                if (str.equals("externalAbort")) {
                    obj = 9;
                    break;
                }
                break;
            case 96784904:
                if (str.equals("error")) {
                    obj = null;
                    break;
                }
                break;
            case 580119100:
                if (str.equals("expireFailed")) {
                    obj = 5;
                    break;
                }
                break;
            case 725497484:
                if (str.equals("noCacheDir")) {
                    obj = 4;
                    break;
                }
                break;
        }
        switch (obj) {
            case null:
            case 1:
            case 2:
            case 3:
                return "internal";
            case 4:
            case 5:
                return "io";
            case 6:
            case 7:
                return "network";
            case 8:
            case 9:
                return "policy";
            default:
                return str2;
        }
    }

    public abstract void a();

    protected void a(String str, String str2, int i) {
        a.a.post(new 2(this, str, str2, i));
    }

    protected void a(String str, String str2, int i, int i2, boolean z) {
        a.a.post(new 1(this, str, str2, i, i2, z));
    }

    public void a(String str, String str2, String str3, @Nullable String str4) {
        a.a.post(new 3(this, str, str2, str3, str4));
    }

    public abstract boolean a(String str);

    protected String b(String str) {
        return ac.a().a(str);
    }

    public void b() {
    }
}
