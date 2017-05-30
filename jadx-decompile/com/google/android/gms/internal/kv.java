package com.google.android.gms.internal;

public class kv implements Comparable<kv> {
    static final /* synthetic */ boolean a = (!kv.class.desiredAssertionStatus());
    private static final kv c = new kv("[MIN_KEY]");
    private static final kv d = new kv("[MAX_KEY]");
    private static final kv e = new kv(".priority");
    private static final kv f = new kv(".info");
    private final String b;

    private static class a extends kv {
        private final int b;

        a(String str, int i) {
            super(str);
            this.b = i;
        }

        public /* synthetic */ int compareTo(Object obj) {
            return super.a((kv) obj);
        }

        protected boolean g() {
            return true;
        }

        protected int h() {
            return this.b;
        }

        public String toString() {
            String b = this.b;
            return new StringBuilder(String.valueOf(b).length() + 20).append("IntegerChildName(\"").append(b).append("\")").toString();
        }
    }

    private kv(String str) {
        this.b = str;
    }

    public static kv a() {
        return c;
    }

    public static kv a(String str) {
        Integer d = mk.d(str);
        if (d != null) {
            return new a(str, d.intValue());
        }
        if (str.equals(".priority")) {
            return e;
        }
        if (a || !str.contains("/")) {
            return new kv(str);
        }
        throw new AssertionError();
    }

    public static kv b() {
        return d;
    }

    public static kv c() {
        return e;
    }

    public static kv d() {
        return f;
    }

    public int a(kv kvVar) {
        if (this == kvVar) {
            return 0;
        }
        if (this == c || kvVar == d) {
            return -1;
        }
        if (kvVar == c || this == d) {
            return 1;
        }
        if (!g()) {
            return kvVar.g() ? 1 : this.b.compareTo(kvVar.b);
        } else {
            if (!kvVar.g()) {
                return -1;
            }
            int a = mk.a(h(), kvVar.h());
            return a == 0 ? mk.a(this.b.length(), kvVar.b.length()) : a;
        }
    }

    public /* synthetic */ int compareTo(Object obj) {
        return a((kv) obj);
    }

    public String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof kv)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return this.b.equals(((kv) obj).b);
    }

    public boolean f() {
        return this == e;
    }

    protected boolean g() {
        return false;
    }

    protected int h() {
        return 0;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        String str = this.b;
        return new StringBuilder(String.valueOf(str).length() + 12).append("ChildKey(\"").append(str).append("\")").toString();
    }
}
