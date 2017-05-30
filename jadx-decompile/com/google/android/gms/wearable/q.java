package com.google.android.gms.wearable;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.internal.fe;
import com.google.android.gms.internal.fe.a;
import com.google.android.gms.internal.rd;

public class q {
    private final PutDataRequest a;
    private final k b = new k();

    private q(PutDataRequest putDataRequest, k kVar) {
        this.a = putDataRequest;
        if (kVar != null) {
            this.b.a(kVar);
        }
    }

    public static q a(l lVar) {
        return new q(PutDataRequest.a(lVar.a()), lVar.b());
    }

    public static q a(String str) {
        return new q(PutDataRequest.a(str), null);
    }

    public static q b(String str) {
        return new q(PutDataRequest.b(str), null);
    }

    public Uri a() {
        return this.a.a();
    }

    public k b() {
        return this.b;
    }

    public q c() {
        this.a.g();
        return this;
    }

    public boolean d() {
        return this.a.f();
    }

    public PutDataRequest e() {
        a a = fe.a(this.b);
        this.a.a(rd.a(a.a));
        int size = a.b.size();
        int i = 0;
        while (i < size) {
            String num = Integer.toString(i);
            Asset asset = (Asset) a.b.get(i);
            String valueOf;
            if (num == null) {
                valueOf = String.valueOf(asset);
                throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 26).append("asset key cannot be null: ").append(valueOf).toString());
            } else if (asset == null) {
                String str = "asset cannot be null: key=";
                valueOf = String.valueOf(num);
                throw new IllegalStateException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            } else {
                if (Log.isLoggable(k.a, 3)) {
                    String str2 = k.a;
                    String valueOf2 = String.valueOf(asset);
                    Log.d(str2, new StringBuilder((String.valueOf(num).length() + 33) + String.valueOf(valueOf2).length()).append("asPutDataRequest: adding asset: ").append(num).append(" ").append(valueOf2).toString());
                }
                this.a.a(num, asset);
                i++;
            }
        }
        return this.a;
    }
}
