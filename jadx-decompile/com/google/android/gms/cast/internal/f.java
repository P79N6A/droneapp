package com.google.android.gms.cast.internal;

import android.text.TextUtils;
import java.util.Locale;
import java.util.regex.Pattern;
import org.codehaus.jackson.org.objectweb.asm.signature.SignatureVisitor;

public final class f {
    private static final Pattern a = Pattern.compile("urn:x-cast:[-A-Za-z0-9_]+(\\.[-A-Za-z0-9_]+)*");

    public static double a(long j) {
        return ((double) j) / 1000.0d;
    }

    public static long a(double d) {
        return (long) (1000.0d * d);
    }

    public static String a(Locale locale) {
        StringBuilder stringBuilder = new StringBuilder(20);
        stringBuilder.append(locale.getLanguage());
        Object country = locale.getCountry();
        if (!TextUtils.isEmpty(country)) {
            stringBuilder.append(SignatureVisitor.SUPER).append(country);
        }
        country = locale.getVariant();
        if (!TextUtils.isEmpty(country)) {
            stringBuilder.append(SignatureVisitor.SUPER).append(country);
        }
        return stringBuilder.toString();
    }

    public static void a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Namespace cannot be null or empty");
        } else if (str.length() > 128) {
            throw new IllegalArgumentException("Invalid namespace length");
        } else if (!str.startsWith("urn:x-cast:")) {
            throw new IllegalArgumentException("Namespace must begin with the prefix \"urn:x-cast:\"");
        } else if (str.length() == "urn:x-cast:".length()) {
            throw new IllegalArgumentException("Namespace must begin with the prefix \"urn:x-cast:\" and have non-empty suffix");
        }
    }

    private static boolean a(char c) {
        return (c >= 'A' && c <= 'Z') || ((c >= 'a' && c <= 'z') || ((c >= '0' && c <= '9') || c == '_' || c == SignatureVisitor.SUPER));
    }

    public static <T> boolean a(T t, T t2) {
        return (t == null && t2 == null) || !(t == null || t2 == null || !t.equals(t2));
    }

    public static String b(String str) {
        String valueOf = String.valueOf("urn:x-cast:");
        String valueOf2 = String.valueOf(str);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public static String c(String str) {
        if (a.matcher(str).matches()) {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (a(charAt) || charAt == '.' || charAt == ':') {
                stringBuilder.append(charAt);
            } else {
                stringBuilder.append(String.format("%%%04x", new Object[]{Integer.valueOf(charAt & 65535)}));
            }
        }
        return stringBuilder.toString();
    }
}
