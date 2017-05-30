package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class RegisterSectionInfo extends AbstractSafeParcelable {
    public static final i CREATOR = new i();
    final int a;
    public final String b;
    public final String c;
    public final boolean d;
    public final int e;
    public final boolean f;
    public final String g;
    public final Feature[] h;
    final int[] i;
    public final String j;

    public static final class a {
        private final String a;
        private String b;
        private boolean c;
        private int d = 1;
        private boolean e;
        private final List<Feature> f = new ArrayList();
        private BitSet g;
        private String h;

        public a(String str) {
            this.a = str;
        }

        public a a(int i) {
            if (this.g == null) {
                this.g = new BitSet();
            }
            this.g.set(i);
            return this;
        }

        public a a(String str) {
            this.b = str;
            return this;
        }

        public a a(boolean z) {
            this.c = z;
            return this;
        }

        public RegisterSectionInfo a() {
            int[] iArr;
            int i = 0;
            if (this.g != null) {
                iArr = new int[this.g.cardinality()];
                int nextSetBit = this.g.nextSetBit(0);
                while (nextSetBit >= 0) {
                    int i2 = i + 1;
                    iArr[i] = nextSetBit;
                    nextSetBit = this.g.nextSetBit(nextSetBit + 1);
                    i = i2;
                }
            } else {
                iArr = null;
            }
            return new RegisterSectionInfo(this.a, this.b, this.c, this.d, this.e, null, (Feature[]) this.f.toArray(new Feature[this.f.size()]), iArr, this.h);
        }

        public a b(String str) {
            this.h = str;
            return this;
        }

        public a b(boolean z) {
            this.e = z;
            return this;
        }
    }

    RegisterSectionInfo(int i, String str, String str2, boolean z, int i2, boolean z2, String str3, Feature[] featureArr, int[] iArr, String str4) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = i2;
        this.f = z2;
        this.g = str3;
        this.h = featureArr;
        this.i = iArr;
        this.j = str4;
    }

    RegisterSectionInfo(String str, String str2, boolean z, int i, boolean z2, String str3, Feature[] featureArr, int[] iArr, String str4) {
        this(2, str, str2, z, i, z2, str3, featureArr, iArr, str4);
    }

    public void writeToParcel(Parcel parcel, int i) {
        i iVar = CREATOR;
        i.a(this, parcel, i);
    }
}
