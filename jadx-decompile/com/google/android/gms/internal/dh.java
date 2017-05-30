package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.h;
import com.google.android.gms.internal.dm.a;

public abstract class dh {
    protected final dl a;
    protected final dj b;
    protected final e c;
    @Nullable
    protected final aos d;
    private int e;

    public dh(int i, dl dlVar, dj djVar, @Nullable aos com_google_android_gms_internal_aos) {
        this(i, dlVar, djVar, com_google_android_gms_internal_aos, h.d());
    }

    public dh(int i, dl dlVar, dj djVar, @Nullable aos com_google_android_gms_internal_aos, e eVar) {
        this.a = (dl) d.a(dlVar);
        d.a(dlVar.a());
        this.e = i;
        this.b = (dj) d.a(djVar);
        this.c = (e) d.a(eVar);
        this.d = com_google_android_gms_internal_aos;
    }

    public String a(int i) {
        switch (i) {
            case 0:
                return "Resource not available";
            case 1:
                return "IOError";
            case 2:
                return "Server error";
            default:
                return "Unknown reason";
        }
    }

    public void a(int i, int i2) {
        if (this.d != null && i2 == 0 && i == 3) {
            this.d.e();
        }
        String valueOf = String.valueOf(this.a.a().a());
        String valueOf2 = String.valueOf(a(i));
        aph.d(new StringBuilder((String.valueOf(valueOf).length() + 61) + String.valueOf(valueOf2).length()).append("Failed to fetch the container resource for the container \"").append(valueOf).append("\": ").append(valueOf2).toString());
        a(new dm(Status.c, i2));
    }

    protected abstract void a(dm dmVar);

    public void a(byte[] bArr) {
        dm dmVar;
        dm b = b(bArr);
        if (this.d != null && this.e == 0) {
            this.d.f();
        }
        if (b == null || b.a() != Status.a) {
            dmVar = new dm(Status.c, this.e);
        } else {
            dv c = b.b().c();
            dmVar = new dm(Status.a, this.e, new a(this.a.a(), bArr, c, this.c.a()), b.c());
        }
        a(dmVar);
    }

    protected dm b(byte[] bArr) {
        dm dmVar = null;
        try {
            dmVar = this.b.a(bArr);
            if (dmVar == null) {
                aph.c("Parsed resource from is null");
            }
        } catch (de e) {
            aph.c("Resource data is corrupted");
        }
        return dmVar;
    }
}
