package com.google.android.gms.wearable;

import android.net.Uri;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface m {
    public static final String a = "com.google.android.gms.wearable.MESSAGE_RECEIVED";
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = -1;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public interface b {
        void a(n nVar);
    }

    public interface c extends com.google.android.gms.common.api.m {
        int b();
    }

    i<Status> a(g gVar, b bVar);

    i<Status> a(g gVar, b bVar, Uri uri, int i);

    i<c> a(g gVar, String str, String str2, byte[] bArr);

    i<Status> b(g gVar, b bVar);
}
