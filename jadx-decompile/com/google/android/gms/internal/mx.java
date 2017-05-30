package com.google.android.gms.internal;

import com.google.firebase.b.a;
import com.google.firebase.b.g;
import java.nio.charset.Charset;
import java.util.regex.Pattern;

public class mx implements g {
    public static final Charset a = Charset.forName("UTF-8");
    public static final Pattern b = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
    public static final Pattern c = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    private final byte[] d;
    private final int e;

    public mx(byte[] bArr, int i) {
        this.d = bArr;
        this.e = i;
    }

    private void g() {
        if (this.d == null) {
            throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
        }
    }

    public long a() {
        if (this.e == 0) {
            return 0;
        }
        String c = c();
        try {
            return Long.valueOf(c).longValue();
        } catch (Throwable e) {
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(c).length() + 40).append("[Value: ").append(c).append("] cannot be converted to a long.").toString(), e);
        }
    }

    public double b() {
        if (this.e == 0) {
            return 0.0d;
        }
        String c = c();
        try {
            return Double.valueOf(c).doubleValue();
        } catch (Throwable e) {
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(c).length() + 42).append("[Value: ").append(c).append("] cannot be converted to a double.").toString(), e);
        }
    }

    public String c() {
        if (this.e == 0) {
            return "";
        }
        g();
        return new String(this.d, a);
    }

    public byte[] d() {
        return this.e == 0 ? a.e : this.d;
    }

    public boolean e() {
        if (this.e == 0) {
            return false;
        }
        Object c = c();
        if (b.matcher(c).matches()) {
            return true;
        }
        if (c.matcher(c).matches()) {
            return false;
        }
        throw new IllegalArgumentException(new StringBuilder(String.valueOf(c).length() + 45).append("[Value: ").append(c).append("] cannot be interpreted as a boolean.").toString());
    }

    public int f() {
        return this.e;
    }
}
