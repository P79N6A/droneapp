package com.google.android.contextmanager.interest;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.qf.b;
import com.google.android.gms.internal.rd;

public class InterestRecordStub extends AbstractSafeParcelable {
    public static final Creator<InterestRecordStub> CREATOR = new a();
    private final int a;
    private final b b;

    InterestRecordStub(int i, byte[] bArr) {
        this.a = i;
        b bVar = null;
        try {
            bVar = b.a(bArr);
        } catch (Throwable e) {
            Log.e("InterestRecordStub", "Could not deserialize interest bytes.", e);
        }
        this.b = bVar;
    }

    int a() {
        return this.a;
    }

    byte[] b() {
        return rd.a(this.b);
    }

    public void writeToParcel(Parcel parcel, int i) {
        a.a(this, parcel, i);
    }
}
