package com.google.android.gms.internal;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashMap;
import java.util.Map;

class vs$16 implements vt {
    vs$16() {
    }

    public void a(acy com_google_android_gms_internal_acy, Map<String, String> map) {
        String str = (String) map.get("urls");
        if (TextUtils.isEmpty(str)) {
            abr.d("URLs missing in canOpenURLs GMSG.");
            return;
        }
        String[] split = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
        Map hashMap = new HashMap();
        PackageManager packageManager = com_google_android_gms_internal_acy.getContext().getPackageManager();
        for (String str2 : split) {
            String[] split2 = str2.split(";", 2);
            hashMap.put(str2, Boolean.valueOf(packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), 65536) != null));
        }
        com_google_android_gms_internal_acy.a("openableURLs", hashMap);
    }
}
