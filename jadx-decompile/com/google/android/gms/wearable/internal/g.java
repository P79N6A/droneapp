package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.util.Log;
import com.facebook.common.util.UriUtil;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.j;
import com.google.android.gms.wearable.h;
import com.google.android.gms.wearable.i;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class g extends j implements h {
    private final int c;

    public g(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.c = i2;
    }

    public h a(byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ Object a() {
        return f();
    }

    public String a(boolean z) {
        byte[] d = d();
        Map e = e();
        StringBuilder stringBuilder = new StringBuilder("DataItemInternal{ ");
        String valueOf = String.valueOf(c());
        stringBuilder.append(new StringBuilder(String.valueOf(valueOf).length() + 4).append("uri=").append(valueOf).toString());
        String valueOf2 = String.valueOf(d == null ? "null" : Integer.valueOf(d.length));
        stringBuilder.append(new StringBuilder(String.valueOf(valueOf2).length() + 9).append(", dataSz=").append(valueOf2).toString());
        stringBuilder.append(", numAssets=" + e.size());
        if (z && !e.isEmpty()) {
            stringBuilder.append(", assets=[");
            valueOf = "";
            for (Entry entry : e.entrySet()) {
                String str = (String) entry.getKey();
                valueOf2 = String.valueOf(((i) entry.getValue()).c());
                stringBuilder.append(new StringBuilder(((String.valueOf(valueOf).length() + 2) + String.valueOf(str).length()) + String.valueOf(valueOf2).length()).append(valueOf).append(str).append(": ").append(valueOf2).toString());
                valueOf = ", ";
            }
            stringBuilder.append("]");
        }
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }

    public Uri c() {
        return Uri.parse(e("path"));
    }

    public byte[] d() {
        return g(UriUtil.DATA_SCHEME);
    }

    public Map<String, i> e() {
        Map<String, i> hashMap = new HashMap(this.c);
        for (int i = 0; i < this.c; i++) {
            d dVar = new d(this.c_, this.d_ + i);
            if (dVar.d() != null) {
                hashMap.put(dVar.d(), dVar);
            }
        }
        return hashMap;
    }

    public h f() {
        return new e(this);
    }

    public String toString() {
        return a(Log.isLoggable("DataItem", 3));
    }
}
