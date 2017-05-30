package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.anb;
import com.google.android.gms.internal.anb.a;

public class ContinueConnectRequest extends AbstractSafeParcelable {
    public static final b CREATOR = new b();
    final int a;
    private final String b;
    private final anb c;

    ContinueConnectRequest(int i, String str, IBinder iBinder) {
        this.a = i;
        this.b = (String) d.a(str);
        this.c = a.a(iBinder);
    }

    public String a() {
        return this.b;
    }

    public IBinder b() {
        return this.c == null ? null : this.c.asBinder();
    }

    public void writeToParcel(Parcel parcel, int i) {
        b bVar = CREATOR;
        b.a(this, parcel, i);
    }
}
