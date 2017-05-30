package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

public abstract class Task implements Parcelable {
    public static final int c = 0;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 10240;
    protected static final long g = -1;
    private final String a;
    private final String b;
    private final boolean h;
    private final boolean i;
    private final int j;
    private final boolean k;
    private final g l;
    private final Bundle m;

    @Deprecated
    Task(Parcel parcel) {
        boolean z = true;
        Log.e("Task", "Constructing a Task object using a parcel.");
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.h = parcel.readInt() == 1;
        if (parcel.readInt() != 1) {
            z = false;
        }
        this.i = z;
        this.j = 2;
        this.k = false;
        this.l = g.a;
        this.m = null;
    }

    Task(a aVar) {
        this.a = aVar.b;
        this.b = aVar.c;
        this.h = aVar.d;
        this.i = aVar.e;
        this.j = aVar.a;
        this.k = aVar.f;
        this.m = aVar.h;
        this.l = aVar.g != null ? aVar.g : g.a;
    }

    public static void a(g gVar) {
        if (gVar != null) {
            int a = gVar.a();
            if (a == 1 || a == 0) {
                int b = gVar.b();
                int c = gVar.c();
                if (a == 0 && b < 0) {
                    throw new IllegalArgumentException("InitialBackoffSeconds can't be negative: " + b);
                } else if (a == 1 && b < 10) {
                    throw new IllegalArgumentException("RETRY_POLICY_LINEAR must have an initial backoff at least 10 seconds.");
                } else if (c < b) {
                    throw new IllegalArgumentException("MaximumBackoffSeconds must be greater than InitialBackoffSeconds: " + gVar.c());
                } else {
                    return;
                }
            }
            throw new IllegalArgumentException("Must provide a valid RetryPolicy: " + a);
        }
    }

    private static boolean a(Object obj) {
        return (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Double) || (obj instanceof String) || (obj instanceof Boolean);
    }

    public static void b(Bundle bundle) {
        if (bundle != null) {
            Parcel obtain = Parcel.obtain();
            bundle.writeToParcel(obtain, 0);
            int dataSize = obtain.dataSize();
            if (dataSize > 10240) {
                obtain.recycle();
                String valueOf = String.valueOf("Extras exceeding maximum size(10240 bytes): ");
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(dataSize).toString());
            }
            obtain.recycle();
            for (String str : bundle.keySet()) {
                if (!a(bundle.get(str))) {
                    throw new IllegalArgumentException("Only the following extra parameter types are supported: Integer, Long, Double, String, and Boolean. ");
                }
            }
        }
    }

    public void a(Bundle bundle) {
        bundle.putString("tag", this.b);
        bundle.putBoolean("update_current", this.h);
        bundle.putBoolean("persisted", this.i);
        bundle.putString("service", this.a);
        bundle.putInt("requiredNetwork", this.j);
        bundle.putBoolean("requiresCharging", this.k);
        bundle.putBundle("retryStrategy", this.l.a(new Bundle()));
        bundle.putBundle("extras", this.m);
    }

    public String c() {
        return this.a;
    }

    public String d() {
        return this.b;
    }

    public int describeContents() {
        return 0;
    }

    public boolean e() {
        return this.h;
    }

    public boolean f() {
        return this.i;
    }

    public int g() {
        return this.j;
    }

    public boolean h() {
        return this.k;
    }

    public Bundle i() {
        return this.m;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = 1;
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.h ? 1 : 0);
        if (!this.i) {
            i2 = 0;
        }
        parcel.writeInt(i2);
    }
}
