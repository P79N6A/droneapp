package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.request.AutoClickProtectionConfigurationParcel;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abi.a;

@aaa
public class e {
    private final Context a;
    private final AutoClickProtectionConfigurationParcel b;
    private boolean c;

    public e(Context context) {
        this(context, false);
    }

    public e(Context context, @Nullable a aVar) {
        this.a = context;
        if (aVar == null || aVar.b.G == null) {
            this.b = new AutoClickProtectionConfigurationParcel();
        } else {
            this.b = aVar.b.G;
        }
    }

    public e(Context context, boolean z) {
        this.a = context;
        this.b = new AutoClickProtectionConfigurationParcel(z);
    }

    public void a() {
        this.c = true;
    }

    public void a(@Nullable String str) {
        if (str == null) {
            str = "";
        }
        b.c("Action was blocked because no touch was detected.");
        if (this.b.b && this.b.c != null) {
            for (String str2 : this.b.c) {
                if (!TextUtils.isEmpty(str2)) {
                    u.e().a(this.a, "", str2.replace("{NAVIGATION_URL}", Uri.encode(str)));
                }
            }
        }
    }

    public boolean b() {
        return !this.b.b || this.c;
    }
}
