package com.google.android.gms.auth.api.credentials.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.common.util.UriUtil;
import com.google.android.gms.common.internal.d;

public class b {
    public static String a(String str) {
        boolean z = false;
        d.b(!TextUtils.isEmpty(str), "account type cannot be empty");
        String scheme = Uri.parse(str).getScheme();
        if (UriUtil.HTTP_SCHEME.equalsIgnoreCase(scheme) || UriUtil.HTTPS_SCHEME.equalsIgnoreCase(scheme)) {
            z = true;
        }
        d.b(z, "Account type must be an http or https URI");
        return str;
    }
}
