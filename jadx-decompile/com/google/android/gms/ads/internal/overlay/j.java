package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.support.annotation.Nullable;
import com.google.android.gms.common.util.s;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.acy;
import com.google.android.gms.internal.un;

@aaa
public abstract class j {
    @Nullable
    public abstract i a(Context context, acy com_google_android_gms_internal_acy, int i, boolean z, un unVar);

    protected boolean a(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return s.d() && (applicationInfo == null || applicationInfo.targetSdkVersion >= 11);
    }

    protected boolean a(acy com_google_android_gms_internal_acy) {
        return com_google_android_gms_internal_acy.k().e;
    }
}
