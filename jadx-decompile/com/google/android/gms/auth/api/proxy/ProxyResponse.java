package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ProxyResponse extends AbstractSafeParcelable {
    public static final Creator<ProxyResponse> CREATOR = new e();
    public static final int a = -1;
    final int b;
    public final int c;
    public final PendingIntent d;
    public final int e;
    final Bundle f;
    public final byte[] g;

    ProxyResponse(int i, int i2, PendingIntent pendingIntent, int i3, Bundle bundle, byte[] bArr) {
        this.b = i;
        this.c = i2;
        this.e = i3;
        this.f = bundle;
        this.g = bArr;
        this.d = pendingIntent;
    }

    public ProxyResponse(int i, PendingIntent pendingIntent, int i2, Bundle bundle, byte[] bArr) {
        this(1, i, pendingIntent, i2, bundle, bArr);
    }

    private ProxyResponse(int i, Bundle bundle, byte[] bArr) {
        this(1, 0, null, i, bundle, bArr);
    }

    public ProxyResponse(int i, Map<String, String> map, byte[] bArr) {
        this(i, a(map), bArr);
    }

    private static Bundle a(Map<String, String> map) {
        Bundle bundle = new Bundle();
        if (map == null) {
            return bundle;
        }
        for (Entry entry : map.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        return bundle;
    }

    public static ProxyResponse a(int i, PendingIntent pendingIntent, int i2, Map<String, String> map, byte[] bArr) {
        return new ProxyResponse(1, i, pendingIntent, i2, a(map), bArr);
    }

    public Map<String, String> a() {
        if (this.f == null) {
            return Collections.emptyMap();
        }
        Map<String, String> hashMap = new HashMap();
        for (String str : this.f.keySet()) {
            hashMap.put(str, this.f.getString(str));
        }
        return hashMap;
    }

    public void writeToParcel(Parcel parcel, int i) {
        e.a(this, parcel, i);
    }
}
