package com.google.android.gms.nearby.messages;

import com.google.android.gms.common.internal.c;
import com.google.android.gms.nearby.messages.internal.i;
import java.util.UUID;

public class d {
    public static final int a = 20;
    private final i b;

    public d(UUID uuid, short s, short s2) {
        this.b = new i(uuid, Short.valueOf(s), Short.valueOf(s2));
    }

    public d(byte[] bArr) {
        this.b = new i(a(bArr));
    }

    public static d a(Message message) {
        boolean a = message.a(Message.e);
        String valueOf = String.valueOf(message.b());
        com.google.android.gms.common.internal.d.b(a, new StringBuilder(String.valueOf(valueOf).length() + 55).append("Message type '").append(valueOf).append("' is not Message.MESSAGE_TYPE_I_BEACON_ID").toString());
        return new d(message.d());
    }

    private static byte[] a(byte[] bArr) {
        com.google.android.gms.common.internal.d.b(bArr.length == 20, "iBeacon ID must be a UUID, a major, and a minor (20 total bytes).");
        return bArr;
    }

    public UUID a() {
        return this.b.c();
    }

    public short b() {
        return this.b.d().shortValue();
    }

    public short c() {
        return this.b.e().shortValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        return c.a(this.b, ((d) obj).b);
    }

    public int hashCode() {
        return c.a(new Object[]{this.b});
    }

    public String toString() {
        String valueOf = String.valueOf(a());
        short b = b();
        return new StringBuilder(String.valueOf(valueOf).length() + 53).append("IBeaconId{proximityUuid=").append(valueOf).append(", major=").append(b).append(", minor=").append(c()).append("}").toString();
    }
}
