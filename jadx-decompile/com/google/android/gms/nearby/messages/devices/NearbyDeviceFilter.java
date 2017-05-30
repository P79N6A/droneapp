package com.google.android.gms.nearby.messages.devices;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.messages.internal.f;
import com.google.android.gms.nearby.messages.internal.i;
import java.util.UUID;

public class NearbyDeviceFilter extends AbstractSafeParcelable {
    public static final Creator<NearbyDeviceFilter> CREATOR = new b();
    final int a;
    final int b;
    final byte[] c;
    final boolean d;

    NearbyDeviceFilter(int i, int i2, byte[] bArr, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = bArr;
        this.d = z;
    }

    private NearbyDeviceFilter(int i, byte[] bArr) {
        this(1, i, bArr, false);
    }

    public static NearbyDeviceFilter a(String str, @Nullable String str2) {
        Object obj;
        String valueOf = String.valueOf(str);
        if (str2 == null) {
            obj = "";
        }
        String valueOf2 = String.valueOf(obj);
        return new NearbyDeviceFilter(2, new f(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)).a());
    }

    public static NearbyDeviceFilter a(UUID uuid, @Nullable Short sh, @Nullable Short sh2) {
        return new NearbyDeviceFilter(3, new i(uuid, sh, sh2).a());
    }

    public void writeToParcel(Parcel parcel, int i) {
        b.a(this, parcel, i);
    }
}
