package com.google.firebase.database.connection.idl;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.hp;

class HostInfoParcelable extends AbstractSafeParcelable {
    public static final d CREATOR = new d();
    final int a;
    final String b;
    final String c;
    final boolean d;

    public HostInfoParcelable(int i, String str, String str2, boolean z) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public static hp a(HostInfoParcelable hostInfoParcelable) {
        return new hp(hostInfoParcelable.b, hostInfoParcelable.c, hostInfoParcelable.d);
    }

    public static HostInfoParcelable a(hp hpVar) {
        return new HostInfoParcelable(1, hpVar.a(), hpVar.b(), hpVar.c());
    }

    public void writeToParcel(Parcel parcel, int i) {
        d.a(this, parcel, i);
    }
}
