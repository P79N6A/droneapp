package com.google.android.gms.internal;

import java.math.BigDecimal;

public final class ov extends Number {
    private final String a;

    public ov(String str) {
        this.a = str;
    }

    public double doubleValue() {
        return Double.parseDouble(this.a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ov)) {
            return false;
        }
        ov ovVar = (ov) obj;
        return this.a == ovVar.a || this.a.equals(ovVar.a);
    }

    public float floatValue() {
        return Float.parseFloat(this.a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public int intValue() {
        try {
            return Integer.parseInt(this.a);
        } catch (NumberFormatException e) {
            try {
                return (int) Long.parseLong(this.a);
            } catch (NumberFormatException e2) {
                return new BigDecimal(this.a).intValue();
            }
        }
    }

    public long longValue() {
        try {
            return Long.parseLong(this.a);
        } catch (NumberFormatException e) {
            return new BigDecimal(this.a).longValue();
        }
    }

    public String toString() {
        return this.a;
    }
}
