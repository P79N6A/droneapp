package com.google.android.gms.common.images;

public final class a {
    private final int a;
    private final int b;

    public a(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static a a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("string must not be null");
        }
        int indexOf = str.indexOf(42);
        if (indexOf < 0) {
            indexOf = str.indexOf(120);
        }
        if (indexOf < 0) {
            throw b(str);
        }
        try {
            return new a(Integer.parseInt(str.substring(0, indexOf)), Integer.parseInt(str.substring(indexOf + 1)));
        } catch (NumberFormatException e) {
            throw b(str);
        }
    }

    private static NumberFormatException b(String str) {
        throw new NumberFormatException(new StringBuilder(String.valueOf(str).length() + 16).append("Invalid Size: \"").append(str).append("\"").toString());
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!(this.a == aVar.a && this.b == aVar.b)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return this.b ^ ((this.a << 16) | (this.a >>> 16));
    }

    public String toString() {
        int i = this.a;
        return i + "x" + this.b;
    }
}
