package com.google.android.gms.gcm;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.iid.a;
import java.util.regex.Pattern;

public class b {
    private static b a;
    private static final Pattern c = Pattern.compile("/topics/[a-zA-Z0-9-_.~%]{1,900}");
    private a b;

    private b(Context context) {
        this.b = a.c(context);
    }

    public static synchronized b a(Context context) {
        b bVar;
        synchronized (b.class) {
            if (a == null) {
                a = new b(context);
            }
            bVar = a;
        }
        return bVar;
    }

    @RequiresPermission("com.google.android.c2dm.permission.RECEIVE")
    public void a(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", str2);
        this.b.a(str, str2, bundle);
    }

    @RequiresPermission("com.google.android.c2dm.permission.RECEIVE")
    public void a(String str, String str2, Bundle bundle) {
        String str3;
        String valueOf;
        if (str == null || str.isEmpty()) {
            str3 = "Invalid appInstanceToken: ";
            valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
        } else if (str2 == null || !c.matcher(str2).matches()) {
            str3 = "Invalid topic name: ";
            valueOf = String.valueOf(str2);
            throw new IllegalArgumentException(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
        } else {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putString("gcm.topic", str2);
            this.b.b(str, str2, bundle);
        }
    }
}
