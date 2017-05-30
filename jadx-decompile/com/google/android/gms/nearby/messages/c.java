package com.google.android.gms.nearby.messages;

import com.google.android.gms.common.internal.d;
import com.google.android.gms.nearby.messages.internal.f;

public class c {
    public static final int a = 16;
    public static final int b = 10;
    public static final int c = 6;
    private final f d;

    public c(String str) {
        this(com.google.android.gms.nearby.messages.internal.c.a(str));
    }

    public c(String str, String str2) {
        this.d = new f(str, str2);
    }

    public c(byte[] bArr) {
        this.d = new f(a(bArr));
    }

    public static c a(Message message) {
        boolean a = message.a(Message.d);
        String valueOf = String.valueOf(message.b());
        d.b(a, new StringBuilder(String.valueOf(valueOf).length() + 58).append("Message type '").append(valueOf).append("' is not Message.MESSAGE_TYPE_EDDYSTONE_UID.").toString());
        return new c(message.d());
    }

    private static byte[] a(byte[] bArr) {
        d.b(bArr.length == 16, "Bytes must be a namespace plus instance (16 bytes).");
        return bArr;
    }

    public String a() {
        return this.d.c();
    }

    public String b() {
        return this.d.d();
    }

    public String c() {
        return this.d.b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return com.google.android.gms.common.internal.c.a(this.d, ((c) obj).d);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.c.a(new Object[]{this.d});
    }

    public String toString() {
        String valueOf = String.valueOf(c());
        return new StringBuilder(String.valueOf(valueOf).length() + 17).append("EddystoneUid{id=").append(valueOf).append("}").toString();
    }
}
