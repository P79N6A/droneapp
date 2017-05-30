package com.xiaomi.mistatistic.sdk.controller.a;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.support.v7.media.SystemMediaRouteProvider;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.xiaomi.market.sdk.j;
import com.xiaomi.mistatistic.sdk.controller.e;
import com.xiaomi.mistatistic.sdk.controller.g;
import com.xiaomi.mistatistic.sdk.controller.m;
import com.xiaomi.mistatistic.sdk.controller.s;
import com.xiaomi.mistatistic.sdk.controller.t;
import com.xiaomi.mistatistic.sdk.data.c;
import java.util.Locale;

public class a implements e {
    public void a() {
        Context a = com.xiaomi.mistatistic.sdk.controller.a.a();
        if (!s.a(a, "basic_info_reported")) {
            a(a);
            s.b(a, "basic_info_reported", 1);
            new t().a();
        }
        String e = com.xiaomi.mistatistic.sdk.controller.a.e();
        Object a2 = s.a(a, "basic_info_version", "");
        if (!(TextUtils.isEmpty(a2) || a2.equals(e))) {
            m.a(new c("mistat_basic", "upgrade"));
        }
        s.b(a, "basic_info_version", e);
    }

    public void a(Context context) {
        m.a(new c("mistat_basic", "new"));
        m.a(new com.xiaomi.mistatistic.sdk.data.e("mistat_basic", "model", Build.MODEL));
        m.a(new com.xiaomi.mistatistic.sdk.data.e("mistat_basic", "OS", SystemMediaRouteProvider.PACKAGE_NAME + VERSION.SDK_INT));
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (!TextUtils.isEmpty(telephonyManager.getNetworkOperatorName())) {
            m.a(new com.xiaomi.mistatistic.sdk.data.e("mistat_basic", "operator", telephonyManager.getSimOperator()));
        }
        Object b = g.b(context);
        if (!TextUtils.isEmpty(b)) {
            m.a(new com.xiaomi.mistatistic.sdk.data.e("mistat_basic", "IMEI", b));
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            m.a(new com.xiaomi.mistatistic.sdk.data.e("mistat_basic", j.ai, i < i2 ? i + "x" + i2 : i2 + "x" + i));
        }
        m.a(new com.xiaomi.mistatistic.sdk.data.e("mistat_basic", "locale", Locale.getDefault().toString()));
    }
}
