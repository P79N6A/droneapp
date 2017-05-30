package com.google.android.gms.internal;

import java.math.BigInteger;

public final class od extends nx {
    private static final Class<?>[] a = new Class[]{Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};
    private Object b;

    public od(Boolean bool) {
        a((Object) bool);
    }

    public od(Number number) {
        a((Object) number);
    }

    od(Object obj) {
        a(obj);
    }

    public od(String str) {
        a((Object) str);
    }

    private static boolean a(od odVar) {
        if (!(odVar.b instanceof Number)) {
            return false;
        }
        Number number = (Number) odVar.b;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    private static boolean b(Object obj) {
        if (obj instanceof String) {
            return true;
        }
        Class cls = obj.getClass();
        for (Class isAssignableFrom : a) {
            if (isAssignableFrom.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    void a(Object obj) {
        if (obj instanceof Character) {
            this.b = String.valueOf(((Character) obj).charValue());
            return;
        }
        boolean z = (obj instanceof Number) || b(obj);
        op.a(z);
        this.b = obj;
    }

    public boolean a() {
        return this.b instanceof Boolean;
    }

    public Number b() {
        return this.b instanceof String ? new ov((String) this.b) : (Number) this.b;
    }

    public String c() {
        return p() ? b().toString() : a() ? o().toString() : (String) this.b;
    }

    public double d() {
        return p() ? b().doubleValue() : Double.parseDouble(c());
    }

    public long e() {
        return p() ? b().longValue() : Long.parseLong(c());
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        od odVar = (od) obj;
        if (this.b == null) {
            return odVar.b == null;
        } else {
            if (a(this) && a(odVar)) {
                return b().longValue() == odVar.b().longValue();
            } else {
                if (!(this.b instanceof Number) || !(odVar.b instanceof Number)) {
                    return this.b.equals(odVar.b);
                }
                double doubleValue = b().doubleValue();
                double doubleValue2 = odVar.b().doubleValue();
                if (doubleValue == doubleValue2 || (Double.isNaN(doubleValue) && Double.isNaN(doubleValue2))) {
                    z = true;
                }
                return z;
            }
        }
    }

    public int f() {
        return p() ? b().intValue() : Integer.parseInt(c());
    }

    public boolean g() {
        return a() ? o().booleanValue() : Boolean.parseBoolean(c());
    }

    public int hashCode() {
        if (this.b == null) {
            return 31;
        }
        long longValue;
        if (a(this)) {
            longValue = b().longValue();
            return (int) (longValue ^ (longValue >>> 32));
        } else if (!(this.b instanceof Number)) {
            return this.b.hashCode();
        } else {
            longValue = Double.doubleToLongBits(b().doubleValue());
            return (int) (longValue ^ (longValue >>> 32));
        }
    }

    Boolean o() {
        return (Boolean) this.b;
    }

    public boolean p() {
        return this.b instanceof Number;
    }

    public boolean q() {
        return this.b instanceof String;
    }
}
