package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.messages.devices.NearbyDevice;
import java.util.Arrays;

public class Message extends AbstractSafeParcelable {
    public static final Creator<Message> CREATOR = new o();
    public static final int a = 102400;
    public static final int b = 32;
    public static final String c = "__reserved_namespace";
    public static final String d = "__eddystone_uid";
    public static final String e = "__i_beacon_id";
    private static final NearbyDevice[] g = new NearbyDevice[]{NearbyDevice.a};
    final int f;
    private final byte[] h;
    private final String i;
    private final String j;
    private final NearbyDevice[] k;
    private final long l;

    Message(int i, @Nullable byte[] bArr, @Nullable String str, String str2, @Nullable NearbyDevice[] nearbyDeviceArr, long j) {
        this.f = i;
        this.i = (String) d.a((Object) str2);
        if (str == null) {
            str = "";
        }
        this.j = str;
        this.l = 0;
        if (a(this.j, this.i)) {
            d.b(bArr == null, "Content must be null for a device presence message.");
        } else {
            d.a((Object) bArr);
            d.b(bArr.length <= a, "Content length(%d) must not exceed MAX_CONTENT_SIZE_BYTES(%d)", Integer.valueOf(bArr.length), Integer.valueOf(a));
        }
        this.h = bArr;
        if (nearbyDeviceArr == null || nearbyDeviceArr.length == 0) {
            nearbyDeviceArr = g;
        }
        this.k = nearbyDeviceArr;
        d.b(str2.length() <= 32, "Type length(%d) must not exceed MAX_TYPE_LENGTH(%d)", Integer.valueOf(str2.length()), Integer.valueOf(32));
    }

    public Message(byte[] bArr) {
        this(bArr, "", "");
    }

    public Message(byte[] bArr, String str) {
        this(bArr, "", str);
    }

    public Message(byte[] bArr, String str, String str2) {
        this(bArr, str, str2, g);
    }

    public Message(byte[] bArr, String str, String str2, NearbyDevice[] nearbyDeviceArr) {
        this(bArr, str, str2, nearbyDeviceArr, 0);
    }

    public Message(byte[] bArr, String str, String str2, NearbyDevice[] nearbyDeviceArr, long j) {
        this(2, bArr, str, str2, nearbyDeviceArr, j);
    }

    @Deprecated
    public static boolean a(String str, String str2) {
        return str.equals(c) && str2.equals("__device_presence");
    }

    public boolean a() {
        return c.equals(c());
    }

    public boolean a(String str) {
        return a() && str.equals(b());
    }

    public String b() {
        return this.i;
    }

    public String c() {
        return this.j;
    }

    public byte[] d() {
        return this.h;
    }

    public NearbyDevice[] e() {
        return this.k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Message)) {
            return false;
        }
        Message message = (Message) obj;
        return TextUtils.equals(this.j, message.j) && TextUtils.equals(this.i, message.i) && Arrays.equals(this.h, message.h) && 0 == 0;
    }

    public long f() {
        return 0;
    }

    public int hashCode() {
        return c.a(this.j, this.i, Integer.valueOf(Arrays.hashCode(this.h)), Long.valueOf(0));
    }

    public String toString() {
        String str = this.j;
        String str2 = this.i;
        int length = this.h == null ? 0 : this.h.length;
        String valueOf = String.valueOf(Arrays.toString(e()));
        return new StringBuilder(((String.valueOf(str).length() + 69) + String.valueOf(str2).length()) + String.valueOf(valueOf).length()).append("Message{namespace='").append(str).append("', type='").append(str2).append("', content=[").append(length).append(" bytes], devices=").append(valueOf).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        o.a(this, parcel, i);
    }
}
