package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;

public class Flag extends AbstractSafeParcelable implements Comparable<Flag> {
    public static final Creator<Flag> CREATOR = new b();
    public static final a j = new a();
    private static final Charset k = Charset.forName("UTF-8");
    final int a;
    public final String b;
    final long c;
    final boolean d;
    final double e;
    final String f;
    final byte[] g;
    public final int h;
    public final int i;

    public static class a implements Comparator<Flag> {
        public int a(Flag flag, Flag flag2) {
            return flag.i == flag2.i ? flag.b.compareTo(flag2.b) : flag.i - flag2.i;
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return a((Flag) obj, (Flag) obj2);
        }
    }

    Flag(int i, String str, long j, boolean z, double d, String str2, byte[] bArr, int i2, int i3) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = z;
        this.e = d;
        this.f = str2;
        this.g = bArr;
        this.h = i2;
        this.i = i3;
    }

    private static int a(byte b, byte b2) {
        return b - b2;
    }

    private static int a(int i, int i2) {
        return i < i2 ? -1 : i == i2 ? 0 : 1;
    }

    private static int a(long j, long j2) {
        return j < j2 ? -1 : j == j2 ? 0 : 1;
    }

    private static int a(String str, String str2) {
        return str == str2 ? 0 : str == null ? -1 : str2 == null ? 1 : str.compareTo(str2);
    }

    private static int a(boolean z, boolean z2) {
        return z == z2 ? 0 : z ? 1 : -1;
    }

    public int a(Flag flag) {
        int i = 0;
        int compareTo = this.b.compareTo(flag.b);
        if (compareTo != 0) {
            return compareTo;
        }
        compareTo = a(this.h, flag.h);
        if (compareTo != 0) {
            return compareTo;
        }
        switch (this.h) {
            case 1:
                return a(this.c, flag.c);
            case 2:
                return a(this.d, flag.d);
            case 3:
                return Double.compare(this.e, flag.e);
            case 4:
                return a(this.f, flag.f);
            case 5:
                if (this.g == flag.g) {
                    return 0;
                }
                if (this.g == null) {
                    return -1;
                }
                if (flag.g == null) {
                    return 1;
                }
                while (i < Math.min(this.g.length, flag.g.length)) {
                    compareTo = a(this.g[i], flag.g[i]);
                    if (compareTo != 0) {
                        return compareTo;
                    }
                    i++;
                }
                return a(this.g.length, flag.g.length);
            default:
                throw new AssertionError("Invalid enum value: " + this.h);
        }
    }

    public /* synthetic */ int compareTo(Object obj) {
        return a((Flag) obj);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Flag)) {
            return false;
        }
        Flag flag = (Flag) obj;
        if (this.a != flag.a || !c.a(this.b, flag.b) || this.h != flag.h || this.i != flag.i) {
            return false;
        }
        switch (this.h) {
            case 1:
                return this.c == flag.c;
            case 2:
                return this.d == flag.d;
            case 3:
                return this.e == flag.e;
            case 4:
                return c.a(this.f, flag.f);
            case 5:
                return Arrays.equals(this.g, flag.g);
            default:
                throw new AssertionError("Invalid enum value: " + this.h);
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Flag(");
        stringBuilder.append(this.a);
        stringBuilder.append(", ");
        stringBuilder.append(this.b);
        stringBuilder.append(", ");
        switch (this.h) {
            case 1:
                stringBuilder.append(this.c);
                break;
            case 2:
                stringBuilder.append(this.d);
                break;
            case 3:
                stringBuilder.append(this.e);
                break;
            case 4:
                stringBuilder.append("'");
                stringBuilder.append(this.f);
                stringBuilder.append("'");
                break;
            case 5:
                if (this.g != null) {
                    stringBuilder.append("'");
                    stringBuilder.append(new String(this.g, k));
                    stringBuilder.append("'");
                    break;
                }
                stringBuilder.append("null");
                break;
            default:
                throw new AssertionError("Invalid enum value: " + this.h);
        }
        stringBuilder.append(", ");
        stringBuilder.append(this.h);
        stringBuilder.append(", ");
        stringBuilder.append(this.i);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        b.a(this, parcel, i);
    }
}
