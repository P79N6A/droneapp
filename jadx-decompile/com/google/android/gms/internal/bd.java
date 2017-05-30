package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.http.AndroidHttpClient;
import android.os.Build.VERSION;
import java.io.File;

public class bd {
    public static ace a(Context context) {
        return a(context, null);
    }

    public static ace a(Context context, apm com_google_android_gms_internal_apm) {
        File file = new File(context.getCacheDir(), "volley");
        String str = "volley/0";
        try {
            String packageName = context.getPackageName();
            str = new StringBuilder(String.valueOf(packageName).length() + 12).append(packageName).append("/").append(context.getPackageManager().getPackageInfo(packageName, 0).versionCode).toString();
        } catch (NameNotFoundException e) {
        }
        if (com_google_android_gms_internal_apm == null) {
            com_google_android_gms_internal_apm = VERSION.SDK_INT >= 9 ? new aqn() : new ank(AndroidHttpClient.newInstance(str));
        }
        ace com_google_android_gms_internal_ace = new ace(new amj(file), new akh(com_google_android_gms_internal_apm));
        com_google_android_gms_internal_ace.a();
        return com_google_android_gms_internal_ace;
    }
}
