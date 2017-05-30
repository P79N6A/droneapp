package com.google.firebase.appindexing.internal;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.webkit.URLUtil;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.d;
import com.google.firebase.appindexing.c;
import com.google.firebase.appindexing.e;

public class k {
    public static c a(@NonNull Status status, String str) {
        d.a((Object) status);
        String c = status.c();
        if (!(c == null || c.isEmpty())) {
            str = c;
        }
        switch (status.i()) {
            case 17510:
                return new com.google.firebase.appindexing.d(str);
            case 17511:
                return new e(str);
            default:
                return new c(str);
        }
    }

    public static void a(@NonNull String str) {
        d.a((Object) str);
        Uri parse = Uri.parse(str);
        if (parse == null || !parse.isAbsolute()) {
            throw new com.google.firebase.appindexing.d(new StringBuilder(String.valueOf(str).length() + 33).append("Invalid String passed as url: '").append(str).append("'.").toString());
        }
    }

    public static void b(@NonNull String str) {
        d.a((Object) str);
        if (!URLUtil.isHttpUrl(str) && !URLUtil.isHttpsUrl(str)) {
            throw new com.google.firebase.appindexing.d(new StringBuilder(String.valueOf(str).length() + 46).append("Web url must be with http or https scheme: '").append(str).append("'.").toString());
        }
    }
}
