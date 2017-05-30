package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Base64;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.internal.bv;
import com.google.android.gms.drive.internal.bx;
import com.google.android.gms.drive.internal.by;
import com.google.android.gms.drive.internal.c;
import com.google.android.gms.internal.aju;
import com.google.android.gms.internal.ajv;
import com.google.android.gms.internal.rc;
import com.google.android.gms.internal.rd;

public class DriveId extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<DriveId> CREATOR = new t();
    public static final int a = -1;
    public static final int b = 0;
    public static final int c = 1;
    final int d;
    final String e;
    final long f;
    final long g;
    final int h;
    private volatile String i;
    private volatile String j;

    DriveId(int i, String str, long j, long j2, int i2) {
        boolean z = false;
        this.i = null;
        this.j = null;
        this.d = i;
        this.e = str;
        d.b(!"".equals(str));
        if (!(str == null && j == -1)) {
            z = true;
        }
        d.b(z);
        this.f = j;
        this.g = j2;
        this.h = i2;
    }

    public DriveId(String str, long j, long j2, int i) {
        this(1, str, j, j2, i);
    }

    public static DriveId a(String str) {
        d.a(str);
        return new DriveId(str, -1, -1, -1);
    }

    static DriveId a(byte[] bArr) {
        try {
            aju a = aju.a(bArr);
            return new DriveId(a.a, "".equals(a.b) ? null : a.b, a.c, a.d, a.e);
        } catch (rc e) {
            throw new IllegalArgumentException();
        }
    }

    public static DriveId b(String str) {
        boolean startsWith = str.startsWith("DriveId:");
        String str2 = "Invalid DriveId: ";
        String valueOf = String.valueOf(str);
        d.b(startsWith, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        return a(Base64.decode(str.substring("DriveId:".length()), 10));
    }

    private byte[] i() {
        rd com_google_android_gms_internal_ajv = new ajv();
        com_google_android_gms_internal_ajv.a = this.f;
        com_google_android_gms_internal_ajv.b = this.g;
        return rd.a(com_google_android_gms_internal_ajv);
    }

    public String a() {
        return this.e;
    }

    public int b() {
        return this.h;
    }

    public e c() {
        if (this.h != 1) {
            return new bv(this);
        }
        throw new IllegalStateException("This DriveId corresponds to a folder. Call asDriveFolder instead.");
    }

    public f d() {
        if (this.h != 0) {
            return new bx(this);
        }
        throw new IllegalStateException("This DriveId corresponds to a file. Call asDriveFile instead.");
    }

    public h e() {
        return this.h == 1 ? d() : this.h == 0 ? c() : new c(this);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (!(obj instanceof DriveId)) {
            return false;
        }
        DriveId driveId = (DriveId) obj;
        if (driveId.g != this.g) {
            return false;
        }
        if (driveId.f == -1 && this.f == -1) {
            return driveId.e.equals(this.e);
        }
        if (this.e == null || driveId.e == null) {
            if (driveId.f != this.f) {
                z = false;
            }
            return z;
        } else if (driveId.f != this.f) {
            return false;
        } else {
            if (driveId.e.equals(this.e)) {
                return true;
            }
            by.b("DriveId", "Unexpected unequal resourceId for same DriveId object.");
            return false;
        }
    }

    public final String f() {
        if (this.i == null) {
            String encodeToString = Base64.encodeToString(h(), 10);
            String valueOf = String.valueOf("DriveId:");
            encodeToString = String.valueOf(encodeToString);
            this.i = encodeToString.length() != 0 ? valueOf.concat(encodeToString) : new String(valueOf);
        }
        return this.i;
    }

    public final String g() {
        if (this.j == null) {
            this.j = Base64.encodeToString(i(), 10);
        }
        return this.j;
    }

    final byte[] h() {
        rd com_google_android_gms_internal_aju = new aju();
        com_google_android_gms_internal_aju.a = this.d;
        com_google_android_gms_internal_aju.b = this.e == null ? "" : this.e;
        com_google_android_gms_internal_aju.c = this.f;
        com_google_android_gms_internal_aju.d = this.g;
        com_google_android_gms_internal_aju.e = this.h;
        return rd.a(com_google_android_gms_internal_aju);
    }

    public int hashCode() {
        if (this.f == -1) {
            return this.e.hashCode();
        }
        String valueOf = String.valueOf(String.valueOf(this.g));
        String valueOf2 = String.valueOf(String.valueOf(this.f));
        return (valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)).hashCode();
    }

    public String toString() {
        return f();
    }

    public void writeToParcel(Parcel parcel, int i) {
        t.a(this, parcel, i);
    }
}
