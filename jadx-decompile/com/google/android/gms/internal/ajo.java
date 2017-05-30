package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import com.google.android.gms.common.util.s;

public class ajo {
    protected final Context a;

    public ajo(Context context) {
        this.a = context;
    }

    public int a(String str, String str2) {
        return this.a.getPackageManager().checkPermission(str, str2);
    }

    public ApplicationInfo a(String str, int i) {
        return this.a.getPackageManager().getApplicationInfo(str, i);
    }

    public CharSequence a(String str) {
        return this.a.getPackageManager().getApplicationLabel(this.a.getPackageManager().getApplicationInfo(str, 0));
    }

    @TargetApi(19)
    public boolean a(int i, String str) {
        if (s.h()) {
            try {
                ((AppOpsManager) this.a.getSystemService("appops")).checkPackage(i, str);
                return true;
            } catch (SecurityException e) {
                return false;
            }
        }
        String[] packagesForUid = this.a.getPackageManager().getPackagesForUid(i);
        if (str == null || packagesForUid == null) {
            return false;
        }
        for (Object equals : packagesForUid) {
            if (str.equals(equals)) {
                return true;
            }
        }
        return false;
    }

    public PackageInfo b(String str, int i) {
        return this.a.getPackageManager().getPackageInfo(str, i);
    }
}
