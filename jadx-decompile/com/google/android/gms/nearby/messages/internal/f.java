package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.util.b;
import java.util.Arrays;

public class f extends c {
    public f(String str) {
        this(c.a(str));
    }

    public f(String str, String str2) {
        this(c.a(str), c.a(str2));
    }

    public f(byte[] bArr) {
        super(d(bArr));
    }

    public f(byte[] bArr, byte[] bArr2) {
        this(b.a(b(bArr), c(bArr2)));
    }

    private static byte[] b(byte[] bArr) {
        d.b(bArr.length == 10, "Namespace length(" + bArr.length + " bytes) must be " + 10 + " bytes.");
        return bArr;
    }

    private static byte[] c(byte[] bArr) {
        d.b(bArr.length == 6, "Instance length(" + bArr.length + " bytes) must be " + 6 + " bytes.");
        return bArr;
    }

    private static byte[] d(byte[] bArr) {
        boolean z = bArr.length == 10 || bArr.length == 16;
        d.b(z, "Bytes must be a namespace (10 bytes), or a namespace plus instance (16 bytes).");
        return bArr;
    }

    public String c() {
        return c.a(Arrays.copyOfRange(a(), 0, 10));
    }

    public String d() {
        byte[] a = a();
        return a.length < 16 ? null : c.a(Arrays.copyOfRange(a, 10, 16));
    }

    public String toString() {
        String valueOf = String.valueOf(b());
        return new StringBuilder(String.valueOf(valueOf).length() + 26).append("EddystoneUidPrefix{bytes=").append(valueOf).append("}").toString();
    }
}
