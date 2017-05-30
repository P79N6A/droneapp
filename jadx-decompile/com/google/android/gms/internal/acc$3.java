package com.google.android.gms.internal;

import com.google.android.gms.internal.adf.a;
import com.google.android.gms.internal.adf.b;
import java.util.Map;

class acc$3 extends ac {
    final /* synthetic */ byte[] a;
    final /* synthetic */ Map b;
    final /* synthetic */ acc c;

    acc$3(acc com_google_android_gms_internal_acc, int i, String str, b bVar, a aVar, byte[] bArr, Map map) {
        this.c = com_google_android_gms_internal_acc;
        this.a = bArr;
        this.b = map;
        super(i, str, bVar, aVar);
    }

    public Map<String, String> g() {
        return this.b == null ? super.g() : this.b;
    }

    public byte[] o() {
        return this.a == null ? super.o() : this.a;
    }
}
