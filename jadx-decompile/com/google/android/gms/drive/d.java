package com.google.android.gms.drive;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import java.io.InputStream;
import java.io.OutputStream;

public interface d {
    i<c$a> a(g gVar);

    i<Status> a(g gVar, n nVar);

    i<Status> a(g gVar, n nVar, j jVar);

    DriveId a();

    int b();

    void b(g gVar);

    ParcelFileDescriptor c();

    InputStream d();

    OutputStream e();

    Contents f();

    void g();

    boolean h();
}
