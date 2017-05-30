package com.google.firebase.appindexing.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.appindexing.a;

public class ActionImpl extends AbstractSafeParcelable implements a {
    public static final Creator<ActionImpl> CREATOR = new a();
    public final int a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final MetadataImpl f;
    private final String g;

    public static class MetadataImpl extends AbstractSafeParcelable {
        public static final Creator<MetadataImpl> CREATOR = new i();
        public final int a;
        private int b;
        private final boolean c;
        private final String d;
        private final String e;
        private final byte[] f;
        private final boolean g;

        MetadataImpl(int i, int i2, boolean z, String str, String str2, byte[] bArr, boolean z2) {
            this.b = 0;
            this.a = i;
            this.b = i2;
            this.c = z;
            this.d = str;
            this.e = str2;
            this.f = bArr;
            this.g = z2;
        }

        public MetadataImpl(boolean z, String str, String str2, byte[] bArr, boolean z2) {
            this.b = 0;
            this.a = 1;
            this.c = z;
            this.d = str;
            this.e = str2;
            this.f = bArr;
            this.g = z2;
        }

        public int a() {
            return this.b;
        }

        public void a(int i) {
            this.b = i;
        }

        public boolean b() {
            return this.c;
        }

        public String c() {
            return this.d;
        }

        public String d() {
            return this.e;
        }

        public byte[] e() {
            return this.f;
        }

        public boolean f() {
            return this.g;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("MetadataImpl { ");
            stringBuilder.append("{ eventStatus: '").append(this.b).append("' } ");
            stringBuilder.append("{ uploadable: '").append(this.c).append("' } ");
            if (this.d != null) {
                stringBuilder.append("{ completionToken: '").append(this.d).append("' } ");
            }
            if (this.e != null) {
                stringBuilder.append("{ accountName: '").append(this.e).append("' } ");
            }
            if (this.f != null) {
                stringBuilder.append("{ ssbContext: [ ");
                for (byte toHexString : this.f) {
                    stringBuilder.append("0x").append(Integer.toHexString(toHexString)).append(" ");
                }
                stringBuilder.append("] } ");
            }
            stringBuilder.append("{ contextOnly: '").append(this.g).append("' } ");
            stringBuilder.append("}");
            return stringBuilder.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.a(this, parcel, i);
        }
    }

    ActionImpl(int i, String str, String str2, String str3, String str4, MetadataImpl metadataImpl, String str5) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = metadataImpl;
        this.g = str5;
    }

    public ActionImpl(@NonNull String str, @NonNull String str2, @NonNull String str3, String str4, @NonNull MetadataImpl metadataImpl, String str5) {
        this.a = 1;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = metadataImpl;
        this.g = str5;
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public String c() {
        return this.d;
    }

    public String d() {
        return this.e;
    }

    public MetadataImpl e() {
        return this.f;
    }

    public String f() {
        return this.g;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ActionImpl { ");
        stringBuilder.append("{ actionType: '").append(this.b).append("' } ");
        stringBuilder.append("{ objectName: '").append(this.c).append("' } ");
        stringBuilder.append("{ objectUrl: '").append(this.d).append("' } ");
        if (this.e != null) {
            stringBuilder.append("{ objectSameAs: '").append(this.e).append("' } ");
        }
        if (this.f != null) {
            stringBuilder.append("{ metadata: '").append(this.f.toString()).append("' } ");
        }
        if (this.g != null) {
            stringBuilder.append("{ actionStatus: '").append(this.g).append("' } ");
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        a.a(this, parcel, i);
    }
}
