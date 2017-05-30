package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.support.annotation.Nullable;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.acy;
import com.google.android.gms.internal.un;

@aaa
public class n extends j {
    @Nullable
    public i a(Context context, acy com_google_android_gms_internal_acy, int i, boolean z, un unVar) {
        if (!a(context)) {
            return null;
        }
        return new c(context, z, a(com_google_android_gms_internal_acy), new x(context, com_google_android_gms_internal_acy.o(), com_google_android_gms_internal_acy.v(), unVar, com_google_android_gms_internal_acy.x()));
    }
}
