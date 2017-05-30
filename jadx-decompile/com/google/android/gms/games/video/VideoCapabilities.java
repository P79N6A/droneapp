package com.google.android.gms.games.video;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class VideoCapabilities extends AbstractSafeParcelable {
    public static final Creator<VideoCapabilities> CREATOR = new c();
    private final int a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean[] e;
    private final boolean[] f;

    public VideoCapabilities(int i, boolean z, boolean z2, boolean z3, boolean[] zArr, boolean[] zArr2) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = zArr;
        this.f = zArr2;
    }

    public int a() {
        return this.a;
    }

    public boolean a(int i) {
        d.a(VideoConfiguration.b(i, false));
        return this.e[i];
    }

    public boolean a(int i, int i2) {
        return this.b && this.c && this.d && a(i) && b(i2);
    }

    public boolean b() {
        return this.c;
    }

    public boolean b(int i) {
        d.a(VideoConfiguration.a(i, false));
        return this.f[i];
    }

    public boolean c() {
        return this.b;
    }

    public boolean d() {
        return this.d;
    }

    public boolean[] e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof VideoCapabilities)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        VideoCapabilities videoCapabilities = (VideoCapabilities) obj;
        return c.a(videoCapabilities.e(), e()) && c.a(videoCapabilities.f(), f()) && c.a(Boolean.valueOf(videoCapabilities.c()), Boolean.valueOf(c())) && c.a(Boolean.valueOf(videoCapabilities.b()), Boolean.valueOf(b())) && c.a(Boolean.valueOf(videoCapabilities.d()), Boolean.valueOf(d()));
    }

    public boolean[] f() {
        return this.f;
    }

    public int hashCode() {
        return c.a(new Object[]{e(), f(), Boolean.valueOf(c()), Boolean.valueOf(b()), Boolean.valueOf(d())});
    }

    public String toString() {
        return c.a(this).a("SupportedCaptureModes", e()).a("SupportedQualityLevels", f()).a("CameraSupported", Boolean.valueOf(c())).a("MicSupported", Boolean.valueOf(b())).a("StorageWriteSupported", Boolean.valueOf(d())).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        c.a(this, parcel, i);
    }
}
