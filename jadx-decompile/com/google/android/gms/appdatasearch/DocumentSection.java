package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.appdatasearch.RegisterSectionInfo.a;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class DocumentSection extends AbstractSafeParcelable {
    public static final d CREATOR = new d();
    public static final int a = Integer.parseInt("-1");
    private static final RegisterSectionInfo g = new a("SsbContext").a(true).a("blob").a();
    final int b;
    public final String c;
    final RegisterSectionInfo d;
    public final int e;
    public final byte[] f;

    DocumentSection(int i, String str, RegisterSectionInfo registerSectionInfo, int i2, byte[] bArr) {
        boolean z = i2 == a || h.a(i2) != null;
        d.b(z, "Invalid section type " + i2);
        this.b = i;
        this.c = str;
        this.d = registerSectionInfo;
        this.e = i2;
        this.f = bArr;
        String a = a();
        if (a != null) {
            throw new IllegalArgumentException(a);
        }
    }

    public DocumentSection(String str, RegisterSectionInfo registerSectionInfo) {
        this(1, str, registerSectionInfo, a, null);
    }

    public DocumentSection(String str, RegisterSectionInfo registerSectionInfo, String str2) {
        this(1, str, registerSectionInfo, h.a(str2), null);
    }

    public DocumentSection(byte[] bArr, RegisterSectionInfo registerSectionInfo) {
        this(1, null, registerSectionInfo, a, bArr);
    }

    public static DocumentSection a(byte[] bArr) {
        return new DocumentSection(bArr, g);
    }

    public String a() {
        if (this.e == a || h.a(this.e) != null) {
            return (this.c == null || this.f == null) ? null : "Both content and blobContent set";
        } else {
            return "Invalid section type " + this.e;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        d dVar = CREATOR;
        d.a(this, parcel, i);
    }
}
