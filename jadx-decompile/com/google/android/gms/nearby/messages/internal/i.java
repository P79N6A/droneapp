package com.google.android.gms.nearby.messages.internal;

import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.d;
import java.nio.ByteBuffer;
import java.util.UUID;

public class i extends c {
    public i(UUID uuid, @Nullable Short sh, @Nullable Short sh2) {
        this(a(uuid, sh, sh2));
    }

    public i(byte[] bArr) {
        super(b(bArr));
    }

    private static byte[] a(UUID uuid, Short sh, Short sh2) {
        int i = 0;
        int i2 = (sh == null ? 0 : 2) + 16;
        if (sh2 != null) {
            i = 2;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i + i2);
        allocate.putLong(uuid.getMostSignificantBits()).putLong(uuid.getLeastSignificantBits());
        if (sh != null) {
            allocate.putShort(sh.shortValue());
        }
        if (sh2 != null) {
            allocate.putShort(sh2.shortValue());
        }
        return allocate.array();
    }

    private static byte[] b(byte[] bArr) {
        boolean z = bArr.length == 16 || bArr.length == 18 || bArr.length == 20;
        d.b(z, "Prefix must be a UUID, a UUID and a major, or a UUID, a major, and a minor.");
        return bArr;
    }

    public UUID c() {
        ByteBuffer wrap = ByteBuffer.wrap(a());
        return new UUID(wrap.getLong(), wrap.getLong());
    }

    public Short d() {
        byte[] a = a();
        return a.length >= 18 ? Short.valueOf(ByteBuffer.wrap(a).getShort(16)) : null;
    }

    public Short e() {
        byte[] a = a();
        return a.length == 20 ? Short.valueOf(ByteBuffer.wrap(a).getShort(18)) : null;
    }

    public String toString() {
        String valueOf = String.valueOf(c());
        String valueOf2 = String.valueOf(d());
        String valueOf3 = String.valueOf(e());
        return new StringBuilder(((String.valueOf(valueOf).length() + 47) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("IBeaconIdPrefix{proximityUuid=").append(valueOf).append(", major=").append(valueOf2).append(", minor=").append(valueOf3).append("}").toString();
    }
}
