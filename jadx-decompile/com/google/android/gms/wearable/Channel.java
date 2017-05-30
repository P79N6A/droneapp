package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.m;
import java.io.InputStream;
import java.io.OutputStream;

public interface Channel extends Parcelable {

    public interface a extends k, m {
        InputStream c();
    }

    public interface b extends k, m {
        OutputStream c();
    }

    i<Status> a(g gVar);

    i<Status> a(g gVar, int i);

    i<Status> a(g gVar, Uri uri);

    i<Status> a(g gVar, Uri uri, long j, long j2);

    i<Status> a(g gVar, Uri uri, boolean z);

    i<Status> a(g gVar, com.google.android.gms.wearable.c.a aVar);

    String a();

    i<a> b(g gVar);

    i<Status> b(g gVar, com.google.android.gms.wearable.c.a aVar);

    String b();

    i<b> c(g gVar);
}
