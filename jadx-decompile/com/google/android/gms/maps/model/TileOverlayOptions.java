package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.a.j;
import com.google.android.gms.maps.model.a.j.a;

public final class TileOverlayOptions extends AbstractSafeParcelable {
    public static final ac CREATOR = new ac();
    private final int a;
    private j b;
    private l c;
    private boolean d;
    private float e;
    private boolean f;
    private float g;

    public TileOverlayOptions() {
        this.d = true;
        this.f = true;
        this.g = 0.0f;
        this.a = 1;
    }

    TileOverlayOptions(int i, IBinder iBinder, boolean z, float f, boolean z2, float f2) {
        this.d = true;
        this.f = true;
        this.g = 0.0f;
        this.a = i;
        this.b = a.a(iBinder);
        this.c = this.b == null ? null : new l(this) {
            final /* synthetic */ TileOverlayOptions a;
            private final j c = this.a.b;

            {
                this.a = r2;
            }

            public Tile a(int i, int i2, int i3) {
                try {
                    return this.c.a(i, i2, i3);
                } catch (RemoteException e) {
                    return null;
                }
            }
        };
        this.d = z;
        this.e = f;
        this.f = z2;
        this.g = f2;
    }

    int a() {
        return this.a;
    }

    public TileOverlayOptions a(float f) {
        this.e = f;
        return this;
    }

    public TileOverlayOptions a(final l lVar) {
        this.c = lVar;
        this.b = this.c == null ? null : new a(this) {
            final /* synthetic */ TileOverlayOptions b;

            public Tile a(int i, int i2, int i3) {
                return lVar.a(i, i2, i3);
            }
        };
        return this;
    }

    public TileOverlayOptions a(boolean z) {
        this.d = z;
        return this;
    }

    IBinder b() {
        return this.b.asBinder();
    }

    public TileOverlayOptions b(float f) {
        boolean z = f >= 0.0f && f <= 1.0f;
        d.b(z, "Transparency must be in the range [0..1]");
        this.g = f;
        return this;
    }

    public TileOverlayOptions b(boolean z) {
        this.f = z;
        return this;
    }

    public l c() {
        return this.c;
    }

    public float d() {
        return this.e;
    }

    public boolean e() {
        return this.d;
    }

    public boolean f() {
        return this.f;
    }

    public float g() {
        return this.g;
    }

    public void writeToParcel(Parcel parcel, int i) {
        ac.a(this, parcel, i);
    }
}
