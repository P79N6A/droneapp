package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.amu.d;
import java.math.BigDecimal;

class ae {
    final int a;
    BigDecimal b;
    BigDecimal c;
    BigDecimal d;
    final boolean e;

    public ae(d dVar) {
        com.google.android.gms.common.internal.d.a(dVar);
        boolean z = true;
        if (dVar.a == null || dVar.a.intValue() == 0) {
            z = false;
        } else if (dVar.a.intValue() != 4) {
            if (dVar.c == null) {
                z = false;
            }
        } else if (dVar.d == null || dVar.e == null) {
            z = false;
        }
        if (z) {
            this.a = dVar.a.intValue();
            if (dVar.a.intValue() == 4) {
                if (!(m.n(dVar.d) && m.n(dVar.e))) {
                    z = false;
                }
                try {
                    this.c = new BigDecimal(dVar.d);
                    this.d = new BigDecimal(dVar.e);
                } catch (NumberFormatException e) {
                    z = false;
                }
            } else {
                if (!m.n(dVar.c)) {
                    z = false;
                }
                try {
                    this.b = new BigDecimal(dVar.c);
                } catch (NumberFormatException e2) {
                    z = false;
                }
            }
        } else {
            this.a = 0;
        }
        this.e = z;
    }

    private Boolean a(BigDecimal bigDecimal) {
        boolean z = true;
        if (!this.e) {
            return null;
        }
        if (bigDecimal == null) {
            return null;
        }
        switch (this.a) {
            case 1:
                if (bigDecimal.compareTo(this.b) != -1) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                if (bigDecimal.compareTo(this.b) != 1) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                if (bigDecimal.compareTo(this.b) != 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                if (bigDecimal.compareTo(this.c) == -1 || bigDecimal.compareTo(this.d) == 1) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                return null;
        }
    }

    public Boolean a(double d) {
        boolean z = true;
        if (!this.e) {
            return null;
        }
        try {
            BigDecimal bigDecimal = new BigDecimal(d);
            switch (this.a) {
                case 1:
                    if (bigDecimal.compareTo(this.b) != -1) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                case 2:
                    if (bigDecimal.compareTo(this.b) != 1) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                case 3:
                    if (!(bigDecimal.compareTo(this.b.subtract(new BigDecimal(Math.ulp(d)).multiply(new BigDecimal(2)))) == 1 && bigDecimal.compareTo(this.b.add(new BigDecimal(Math.ulp(d)).multiply(new BigDecimal(2)))) == -1)) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                case 4:
                    if (bigDecimal.compareTo(this.c) == -1 || bigDecimal.compareTo(this.d) == 1) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                default:
                    return null;
            }
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public Boolean a(long j) {
        try {
            return a(new BigDecimal(j));
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public Boolean a(String str) {
        Boolean bool = null;
        if (m.n(str)) {
            try {
                bool = a(new BigDecimal(str));
            } catch (NumberFormatException e) {
            }
        }
        return bool;
    }
}
