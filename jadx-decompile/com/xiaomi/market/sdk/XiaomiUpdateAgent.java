package com.xiaomi.market.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import java.io.File;

public class XiaomiUpdateAgent {
    private static final String TAG = "MarketUpdateAgent";
    private static w aK;
    private static q aL;
    private static boolean be = true;
    private static boolean bf = false;
    private static boolean bg = false;
    private static XiaomiUpdateListener bh;
    private static Context mContext;

    static Context getContext() {
        return mContext;
    }

    public static int getSDKVersion() {
        return 0;
    }

    static q p(Context context) {
        PackageInfo packageInfo;
        q h = q.h(context.getPackageName());
        PackageManager packageManager = context.getPackageManager();
        try {
            packageInfo = packageManager.getPackageInfo(h.packageName, 64);
        } catch (NameNotFoundException e) {
            Log.e(TAG, "get package info failed");
            packageInfo = null;
        }
        if (packageInfo == null || packageInfo.applicationInfo == null) {
            return null;
        }
        h.aT = packageManager.getApplicationLabel(packageInfo.applicationInfo).toString();
        h.versionCode = packageInfo.versionCode;
        h.versionName = packageInfo.versionName;
        h.aU = b.a(String.valueOf(packageInfo.signatures[0].toChars()));
        h.sourceDir = packageInfo.applicationInfo.sourceDir;
        h.aV = b.a(new File(h.sourceDir));
        return h;
    }

    public static void setCheckUpdateOnlyWifi(boolean z) {
        bf = z;
    }

    public static void setUpdateAutoPopup(boolean z) {
        be = z;
    }

    public static void setUpdateListener(XiaomiUpdateListener xiaomiUpdateListener) {
        bh = xiaomiUpdateListener;
    }

    public static void update(Context context) {
        if (context != null) {
            mContext = context;
            j.k();
            new t().execute(new Void[0]);
        }
    }
}
