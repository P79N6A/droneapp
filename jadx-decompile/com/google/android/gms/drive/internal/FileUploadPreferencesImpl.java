package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.k;

public final class FileUploadPreferencesImpl extends AbstractSafeParcelable implements k {
    public static final Creator<FileUploadPreferencesImpl> CREATOR = new h();
    final int f;
    int g;
    int h;
    boolean i;

    FileUploadPreferencesImpl(int i, int i2, int i3, boolean z) {
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = z;
    }

    public static boolean c(int i) {
        switch (i) {
            case 1:
            case 2:
                return true;
            default:
                return false;
        }
    }

    public static boolean d(int i) {
        switch (i) {
            case 256:
            case 257:
                return true;
            default:
                return false;
        }
    }

    public int a() {
        return !c(this.g) ? 0 : this.g;
    }

    public void a(int i) {
        if (c(i)) {
            this.g = i;
            return;
        }
        throw new IllegalArgumentException("Invalid data connection preference value.");
    }

    public void a(boolean z) {
        this.i = z;
    }

    public void b(int i) {
        if (d(i)) {
            this.h = i;
            return;
        }
        throw new IllegalArgumentException("Invalid battery usage preference value.");
    }

    public boolean b() {
        return this.i;
    }

    public int c() {
        return !d(this.h) ? 0 : this.h;
    }

    public void writeToParcel(Parcel parcel, int i) {
        h.a(this, parcel, i);
    }
}
