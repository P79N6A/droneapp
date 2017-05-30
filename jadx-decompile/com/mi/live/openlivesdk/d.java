package com.mi.live.openlivesdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import java.util.List;

public class d {
    public static final String a = "com.wali.live";
    public static final int b = 101020;
    public static final int c = 1;
    public static final int d = -2;
    public static final int e = -3;

    public static int a(Context context) {
        List installedPackages = context.getPackageManager().getInstalledPackages(0);
        if (installedPackages != null) {
            int i = 0;
            while (i < installedPackages.size()) {
                PackageInfo packageInfo = (PackageInfo) installedPackages.get(i);
                if (a.equals(packageInfo.packageName)) {
                    return packageInfo.versionCode >= b ? 1 : -3;
                } else {
                    i++;
                }
            }
        }
        return -2;
    }
}
