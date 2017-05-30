package com.google.android.gms.nearby.connection;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.util.f;
import java.util.List;

public interface a {
    public static final long c = 0;
    public static final int d = 1168;
    public static final int e = 4096;
    public static final List<Integer> f = f.a(Integer.valueOf(1), Integer.valueOf(2));

    i<Status> a(g gVar, String str, long j, c cVar);

    i<e> a(g gVar, String str, AppMetadata appMetadata, long j, a aVar);

    i<Status> a(g gVar, String str, String str2, byte[] bArr, b bVar, d dVar);

    i<Status> a(g gVar, String str, byte[] bArr, d dVar);

    @Deprecated
    String a(g gVar);

    void a(g gVar, String str);

    void a(g gVar, String str, byte[] bArr);

    void a(g gVar, List<String> list, byte[] bArr);

    i<Status> b(g gVar, String str);

    @Deprecated
    String b(g gVar);

    void b(g gVar, String str, byte[] bArr);

    void b(g gVar, List<String> list, byte[] bArr);

    void c(g gVar);

    void c(g gVar, String str);

    void d(g gVar);
}
