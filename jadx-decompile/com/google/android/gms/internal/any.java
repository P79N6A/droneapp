package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.g.b;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.internal.anw.a;
import java.util.List;

public class any extends w<anw> {
    private final Context a;

    public any(Context context, Looper looper, s sVar, b bVar, c cVar) {
        super(context, looper, 45, sVar, bVar, cVar);
        this.a = context;
    }

    private String h() {
        try {
            PackageManager packageManager = this.a.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(this.a.getPackageName(), 128);
            if (applicationInfo == null) {
                return null;
            }
            Bundle bundle = applicationInfo.metaData;
            return bundle == null ? null : (String) bundle.get("com.google.android.safetynet.API_KEY");
        } catch (NameNotFoundException e) {
            return null;
        }
    }

    protected anw a(IBinder iBinder) {
        return a.a(iBinder);
    }

    protected String a() {
        return "com.google.android.gms.safetynet.service.START";
    }

    public void a(anv com_google_android_gms_internal_anv) {
        ((anw) G()).b(com_google_android_gms_internal_anv);
    }

    public void a(anv com_google_android_gms_internal_anv, List<Integer> list, int i, String str, String str2) {
        String h = str2 == null ? h() : str2;
        int[] iArr = new int[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            iArr[i2] = ((Integer) list.get(i2)).intValue();
        }
        ((anw) G()).a(com_google_android_gms_internal_anv, h, iArr, i, str);
    }

    public void a(anv com_google_android_gms_internal_anv, byte[] bArr) {
        ((anw) G()).a(com_google_android_gms_internal_anv, bArr);
    }

    protected /* synthetic */ IInterface b(IBinder iBinder) {
        return a(iBinder);
    }

    protected String b() {
        return "com.google.android.gms.safetynet.internal.ISafetyNetService";
    }

    public void b(anv com_google_android_gms_internal_anv) {
        ((anw) G()).c(com_google_android_gms_internal_anv);
    }
}
