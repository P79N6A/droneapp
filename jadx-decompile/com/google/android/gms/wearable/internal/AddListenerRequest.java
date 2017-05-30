package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.internal.x.a;

public class AddListenerRequest extends AbstractSafeParcelable {
    public static final Creator<AddListenerRequest> CREATOR = new au();
    final int a;
    public final x b;
    public final IntentFilter[] c;
    public final String d;
    public final String e;

    AddListenerRequest(int i, IBinder iBinder, IntentFilter[] intentFilterArr, String str, String str2) {
        this.a = i;
        if (iBinder != null) {
            this.b = a.a(iBinder);
        } else {
            this.b = null;
        }
        this.c = intentFilterArr;
        this.d = str;
        this.e = str2;
    }

    public AddListenerRequest(as asVar) {
        this.a = 1;
        this.b = asVar;
        this.c = asVar.b();
        this.d = asVar.c();
        this.e = null;
    }

    IBinder a() {
        return this.b == null ? null : this.b.asBinder();
    }

    public void writeToParcel(Parcel parcel, int i) {
        au.a(this, parcel, i);
    }
}
