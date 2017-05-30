package com.google.firebase.database;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

public class c {
    public static final int a = -1;
    public static final int b = -2;
    public static final int c = -3;
    public static final int d = -4;
    public static final int e = -6;
    public static final int f = -7;
    public static final int g = -8;
    public static final int h = -9;
    public static final int i = -10;
    public static final int j = -11;
    public static final int k = -24;
    public static final int l = -25;
    public static final int m = -999;
    private static final Map<Integer, String> n = new HashMap();
    private static final Map<String, Integer> o = new HashMap();
    private final int p;
    private final String q;
    private final String r;

    static {
        n.put(Integer.valueOf(-1), "The transaction needs to be run again with current data");
        n.put(Integer.valueOf(-2), "The server indicated that this operation failed");
        n.put(Integer.valueOf(-3), "This client does not have permission to perform this operation");
        n.put(Integer.valueOf(-4), "The operation had to be aborted due to a network disconnect");
        n.put(Integer.valueOf(-6), "The supplied auth token has expired");
        n.put(Integer.valueOf(-7), "The supplied auth token was invalid");
        n.put(Integer.valueOf(-8), "The transaction had too many retries");
        n.put(Integer.valueOf(-9), "The transaction was overridden by a subsequent set");
        n.put(Integer.valueOf(-10), "The service is unavailable");
        n.put(Integer.valueOf(-11), "User code called from the Firebase Database runloop threw an exception:\n");
        n.put(Integer.valueOf(-24), "The operation could not be performed due to a network error");
        n.put(Integer.valueOf(-25), "The write was canceled by the user.");
        n.put(Integer.valueOf(m), "An unknown error occurred");
        o.put("datastale", Integer.valueOf(-1));
        o.put("failure", Integer.valueOf(-2));
        o.put("permission_denied", Integer.valueOf(-3));
        o.put("disconnected", Integer.valueOf(-4));
        o.put("expired_token", Integer.valueOf(-6));
        o.put("invalid_token", Integer.valueOf(-7));
        o.put("maxretries", Integer.valueOf(-8));
        o.put("overriddenbyset", Integer.valueOf(-9));
        o.put("unavailable", Integer.valueOf(-10));
        o.put("network_error", Integer.valueOf(-24));
        o.put("write_canceled", Integer.valueOf(-25));
    }

    private c(int i, String str) {
        this(i, str, null);
    }

    private c(int i, String str, String str2) {
        this.p = i;
        this.q = str;
        if (str2 == null) {
            str2 = "";
        }
        this.r = str2;
    }

    public static c a(int i) {
        if (n.containsKey(Integer.valueOf(i))) {
            return new c(i, (String) n.get(Integer.valueOf(i)), null);
        }
        throw new IllegalArgumentException("Invalid Firebase Database error code: " + i);
    }

    public static c a(String str) {
        return a(str, null);
    }

    public static c a(String str, String str2) {
        return a(str, str2, null);
    }

    public static c a(String str, String str2, String str3) {
        Integer num = (Integer) o.get(str.toLowerCase());
        Integer valueOf = num == null ? Integer.valueOf(m) : num;
        return new c(valueOf.intValue(), str2 == null ? (String) n.get(valueOf) : str2, str3);
    }

    public static c a(Throwable th) {
        Writer stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String valueOf = String.valueOf((String) n.get(Integer.valueOf(-11)));
        String valueOf2 = String.valueOf(stringWriter.toString());
        return new c(-11, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
    }

    public int a() {
        return this.p;
    }

    public String b() {
        return this.q;
    }

    public String c() {
        return this.r;
    }

    public d d() {
        String str = "Firebase Database error: ";
        String valueOf = String.valueOf(this.q);
        return new d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    public String toString() {
        String str = "DatabaseError: ";
        String valueOf = String.valueOf(this.q);
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }
}
