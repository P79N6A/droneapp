package com.google.android.gms.tagmanager;

class cv extends Number implements Comparable<cv> {
    private double a;
    private long b;
    private boolean c = false;

    private cv(double d) {
        this.a = d;
    }

    private cv(long j) {
        this.b = j;
    }

    public static cv a(long j) {
        return new cv(j);
    }

    public static cv a(Double d) {
        return new cv(d.doubleValue());
    }

    public static cv a(String str) {
        try {
            return new cv(Long.parseLong(str));
        } catch (NumberFormatException e) {
            try {
                return new cv(Double.parseDouble(str));
            } catch (NumberFormatException e2) {
                throw new NumberFormatException(String.valueOf(str).concat(" is not a valid TypedNumber"));
            }
        }
    }

    public int a(cv cvVar) {
        return (b() && cvVar.b()) ? new Long(this.b).compareTo(Long.valueOf(cvVar.b)) : Double.compare(doubleValue(), cvVar.doubleValue());
    }

    public boolean a() {
        return !b();
    }

    public boolean b() {
        return this.c;
    }

    public byte byteValue() {
        return (byte) ((int) longValue());
    }

    public long c() {
        return b() ? this.b : (long) this.a;
    }

    public /* synthetic */ int compareTo(Object obj) {
        return a((cv) obj);
    }

    public int d() {
        return (int) longValue();
    }

    public double doubleValue() {
        return b() ? (double) this.b : this.a;
    }

    public short e() {
        return (short) ((int) longValue());
    }

    public boolean equals(Object obj) {
        return (obj instanceof cv) && a((cv) obj) == 0;
    }

    public float floatValue() {
        return (float) doubleValue();
    }

    public int hashCode() {
        return new Long(longValue()).hashCode();
    }

    public int intValue() {
        return d();
    }

    public long longValue() {
        return c();
    }

    public short shortValue() {
        return e();
    }

    public String toString() {
        return b() ? Long.toString(this.b) : Double.toString(this.a);
    }
}
