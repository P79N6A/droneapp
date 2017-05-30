package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.m;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface e {
    public static final String a = "com.google.android.gms.wearable.DATA_CHANGED";
    public static final int b = 0;
    public static final int c = 1;

    public interface a extends m {
        h b();
    }

    public interface b {
        void a(g gVar);
    }

    public interface c extends m {
        int b();
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    public interface e extends k, m {
        ParcelFileDescriptor c();

        InputStream d();
    }

    i<j> a(g gVar);

    i<a> a(g gVar, Uri uri);

    i<j> a(g gVar, Uri uri, int i);

    i<e> a(g gVar, Asset asset);

    i<a> a(g gVar, PutDataRequest putDataRequest);

    i<Status> a(g gVar, b bVar);

    i<Status> a(g gVar, b bVar, Uri uri, int i);

    i<e> a(g gVar, i iVar);

    i<j> b(g gVar, Uri uri);

    i<c> b(g gVar, Uri uri, int i);

    i<Status> b(g gVar, b bVar);

    i<c> c(g gVar, Uri uri);
}
