package com.google.android.gms.wearable;

import android.net.Uri;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;

public interface a {
    public static final String a = "com.google.android.gms.wearable.CAPABILITY_CHANGED";
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 0;
    public static final int e = 1;

    public interface a extends m {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public interface c {
        void a(b bVar);
    }

    public interface d extends m {
        Map<String, b> b();
    }

    public interface e extends m {
        b b();
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface f {
    }

    public interface g extends m {
    }

    i<d> a(com.google.android.gms.common.api.g gVar, int i);

    i<Status> a(com.google.android.gms.common.api.g gVar, c cVar);

    i<Status> a(com.google.android.gms.common.api.g gVar, c cVar, Uri uri, int i);

    i<Status> a(com.google.android.gms.common.api.g gVar, c cVar, String str);

    i<a> a(com.google.android.gms.common.api.g gVar, String str);

    i<e> a(com.google.android.gms.common.api.g gVar, String str, int i);

    i<Status> b(com.google.android.gms.common.api.g gVar, c cVar, String str);

    i<g> b(com.google.android.gms.common.api.g gVar, String str);
}
