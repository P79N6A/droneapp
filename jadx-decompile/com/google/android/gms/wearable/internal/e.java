package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.wearable.h;
import com.google.android.gms.wearable.i;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class e implements h {
    private Uri a;
    private byte[] b;
    private Map<String, i> c;

    public e(h hVar) {
        this.a = hVar.c();
        this.b = hVar.d();
        Map hashMap = new HashMap();
        for (Entry entry : hVar.e().entrySet()) {
            if (entry.getKey() != null) {
                hashMap.put((String) entry.getKey(), (i) ((i) entry.getValue()).a());
            }
        }
        this.c = Collections.unmodifiableMap(hashMap);
    }

    public h a(byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ Object a() {
        return f();
    }

    public String a(boolean z) {
        StringBuilder stringBuilder = new StringBuilder("DataItemEntity{ ");
        String valueOf = String.valueOf(this.a);
        stringBuilder.append(new StringBuilder(String.valueOf(valueOf).length() + 4).append("uri=").append(valueOf).toString());
        valueOf = String.valueOf(this.b == null ? "null" : Integer.valueOf(this.b.length));
        stringBuilder.append(new StringBuilder(String.valueOf(valueOf).length() + 9).append(", dataSz=").append(valueOf).toString());
        stringBuilder.append(", numAssets=" + this.c.size());
        if (z && !this.c.isEmpty()) {
            stringBuilder.append(", assets=[");
            String str = "";
            for (Entry entry : this.c.entrySet()) {
                String str2 = (String) entry.getKey();
                valueOf = String.valueOf(((i) entry.getValue()).c());
                stringBuilder.append(new StringBuilder(((String.valueOf(str).length() + 2) + String.valueOf(str2).length()) + String.valueOf(valueOf).length()).append(str).append(str2).append(": ").append(valueOf).toString());
                str = ", ";
            }
            stringBuilder.append("]");
        }
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }

    public boolean b() {
        return true;
    }

    public Uri c() {
        return this.a;
    }

    public byte[] d() {
        return this.b;
    }

    public Map<String, i> e() {
        return this.c;
    }

    public h f() {
        return this;
    }

    public String toString() {
        return a(Log.isLoggable("DataItem", 3));
    }
}
