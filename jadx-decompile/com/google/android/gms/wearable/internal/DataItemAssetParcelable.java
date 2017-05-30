package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.i;
import com.xiaomi.mipush.sdk.Constants;

@KeepName
public class DataItemAssetParcelable extends AbstractSafeParcelable implements ReflectedParcelable, i {
    public static final Creator<DataItemAssetParcelable> CREATOR = new c();
    final int a;
    private final String b;
    private final String c;

    DataItemAssetParcelable(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public DataItemAssetParcelable(i iVar) {
        this.a = 1;
        this.b = (String) d.a(iVar.c());
        this.c = (String) d.a(iVar.d());
    }

    public /* synthetic */ Object a() {
        return e();
    }

    public boolean b() {
        return true;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.c;
    }

    public i e() {
        return this;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DataItemAssetParcelable[");
        stringBuilder.append("@");
        stringBuilder.append(Integer.toHexString(hashCode()));
        if (this.b == null) {
            stringBuilder.append(",noid");
        } else {
            stringBuilder.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            stringBuilder.append(this.b);
        }
        stringBuilder.append(", key=");
        stringBuilder.append(this.c);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        c.a(this, parcel, i);
    }
}
