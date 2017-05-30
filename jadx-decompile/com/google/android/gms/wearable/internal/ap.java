package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.net.Uri;
import com.google.android.gms.wearable.PutDataRequest;

public final class ap {
    public static IntentFilter a(String str) {
        IntentFilter intentFilter = new IntentFilter(str);
        intentFilter.addDataScheme(PutDataRequest.a);
        intentFilter.addDataAuthority("*", null);
        return intentFilter;
    }

    public static IntentFilter a(String str, Uri uri, int i) {
        IntentFilter intentFilter = new IntentFilter(str);
        if (uri.getScheme() != null) {
            intentFilter.addDataScheme(uri.getScheme());
        }
        if (uri.getAuthority() != null) {
            intentFilter.addDataAuthority(uri.getAuthority(), Integer.toString(uri.getPort()));
        }
        if (uri.getPath() != null) {
            intentFilter.addDataPath(uri.getPath(), i);
        }
        return intentFilter;
    }
}
