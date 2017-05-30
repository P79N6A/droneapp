package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.i;
import com.xiaomi.mipush.sdk.Constants;

public class b implements i {
    private final String a;
    private final String b;

    public b(i iVar) {
        this.a = iVar.c();
        this.b = iVar.d();
    }

    public /* synthetic */ Object a() {
        return e();
    }

    public boolean b() {
        return true;
    }

    public String c() {
        return this.a;
    }

    public String d() {
        return this.b;
    }

    public i e() {
        return this;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DataItemAssetEntity[");
        stringBuilder.append("@");
        stringBuilder.append(Integer.toHexString(hashCode()));
        if (this.a == null) {
            stringBuilder.append(",noid");
        } else {
            stringBuilder.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            stringBuilder.append(this.a);
        }
        stringBuilder.append(", key=");
        stringBuilder.append(this.b);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
