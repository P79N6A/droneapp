package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Contents extends AbstractSafeParcelable {
    public static final Creator<Contents> CREATOR = new q();
    final int a;
    final ParcelFileDescriptor b;
    final int c;
    final int d;
    final DriveId e;
    final boolean f;
    final String g;

    Contents(int i, ParcelFileDescriptor parcelFileDescriptor, int i2, int i3, DriveId driveId, boolean z, String str) {
        this.a = i;
        this.b = parcelFileDescriptor;
        this.c = i2;
        this.d = i3;
        this.e = driveId;
        this.f = z;
        this.g = str;
    }

    public ParcelFileDescriptor a() {
        return this.b;
    }

    public DriveId b() {
        return this.e;
    }

    public InputStream c() {
        return new FileInputStream(this.b.getFileDescriptor());
    }

    public OutputStream d() {
        return new FileOutputStream(this.b.getFileDescriptor());
    }

    public int e() {
        return this.d;
    }

    public int f() {
        return this.c;
    }

    public boolean g() {
        return this.f;
    }

    public void writeToParcel(Parcel parcel, int i) {
        q.a(this, parcel, i);
    }
}
