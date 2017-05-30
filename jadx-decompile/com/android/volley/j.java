package com.android.volley;

import java.io.Serializable;
import java.util.Collections;
import java.util.Map;

public class j implements Serializable {
    private static final long serialVersionUID = -20150728102000L;
    public final int a;
    public final byte[] b;
    public final Map<String, String> c;
    public final boolean d;
    public final long e;

    public j(int i, byte[] bArr, Map<String, String> map, boolean z) {
        this(i, bArr, map, z, 0);
    }

    public j(int i, byte[] bArr, Map<String, String> map, boolean z, long j) {
        this.a = i;
        this.b = bArr;
        this.c = map;
        this.d = z;
        this.e = j;
    }

    public j(byte[] bArr) {
        this(200, bArr, Collections.emptyMap(), false, 0);
    }

    public j(byte[] bArr, Map<String, String> map) {
        this(200, bArr, map, false, 0);
    }
}
