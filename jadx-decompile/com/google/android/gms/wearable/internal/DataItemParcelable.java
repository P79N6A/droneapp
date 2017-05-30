package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.h;
import com.google.android.gms.wearable.i;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DataItemParcelable extends AbstractSafeParcelable implements h {
    public static final Creator<DataItemParcelable> CREATOR = new f();
    final int a;
    private final Uri b;
    private final Map<String, i> c;
    private byte[] d;

    DataItemParcelable(int i, Uri uri, Bundle bundle, byte[] bArr) {
        this.a = i;
        this.b = uri;
        Map hashMap = new HashMap();
        bundle.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
        for (String str : bundle.keySet()) {
            hashMap.put(str, (DataItemAssetParcelable) bundle.getParcelable(str));
        }
        this.c = hashMap;
        this.d = bArr;
    }

    public /* synthetic */ h a(byte[] bArr) {
        return b(bArr);
    }

    public /* synthetic */ Object a() {
        return f();
    }

    public String a(boolean z) {
        StringBuilder stringBuilder = new StringBuilder("DataItemParcelable[");
        stringBuilder.append("@");
        stringBuilder.append(Integer.toHexString(hashCode()));
        String valueOf = String.valueOf(this.d == null ? "null" : Integer.valueOf(this.d.length));
        stringBuilder.append(new StringBuilder(String.valueOf(valueOf).length() + 8).append(",dataSz=").append(valueOf).toString());
        stringBuilder.append(", numAssets=" + this.c.size());
        valueOf = String.valueOf(this.b);
        stringBuilder.append(new StringBuilder(String.valueOf(valueOf).length() + 6).append(", uri=").append(valueOf).toString());
        if (z) {
            stringBuilder.append("]\n  assets: ");
            for (String valueOf2 : this.c.keySet()) {
                String valueOf3 = String.valueOf(this.c.get(valueOf2));
                stringBuilder.append(new StringBuilder((String.valueOf(valueOf2).length() + 7) + String.valueOf(valueOf3).length()).append("\n    ").append(valueOf2).append(": ").append(valueOf3).toString());
            }
            stringBuilder.append("\n  ]");
            return stringBuilder.toString();
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public DataItemParcelable b(byte[] bArr) {
        this.d = bArr;
        return this;
    }

    public boolean b() {
        return true;
    }

    public Uri c() {
        return this.b;
    }

    public byte[] d() {
        return this.d;
    }

    public Map<String, i> e() {
        return this.c;
    }

    public DataItemParcelable f() {
        return this;
    }

    public Bundle g() {
        Bundle bundle = new Bundle();
        bundle.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
        for (Entry entry : this.c.entrySet()) {
            bundle.putParcelable((String) entry.getKey(), new DataItemAssetParcelable((i) entry.getValue()));
        }
        return bundle;
    }

    public String toString() {
        return a(Log.isLoggable("DataItem", 3));
    }

    public void writeToParcel(Parcel parcel, int i) {
        f.a(this, parcel, i);
    }
}
