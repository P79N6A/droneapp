package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.amu.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

class h {
    final int a;
    final boolean b;
    final String c;
    final List<String> d;
    final String e;
    final boolean f;

    public h(f fVar) {
        boolean z;
        boolean z2 = false;
        d.a(fVar);
        if (fVar.a == null || fVar.a.intValue() == 0) {
            z = false;
        } else {
            if (fVar.a.intValue() == 6) {
                if (fVar.d == null || fVar.d.length == 0) {
                    z = false;
                }
            } else if (fVar.b == null) {
                z = false;
            }
            z = true;
        }
        if (z) {
            this.a = fVar.a.intValue();
            if (fVar.c != null && fVar.c.booleanValue()) {
                z2 = true;
            }
            this.b = z2;
            if (this.b || this.a == 1 || this.a == 6) {
                this.c = fVar.b;
            } else {
                this.c = fVar.b.toUpperCase(Locale.ENGLISH);
            }
            this.d = fVar.d == null ? null : a(fVar.d, this.b);
            if (this.a == 1) {
                this.e = this.c;
            } else {
                this.e = null;
            }
        } else {
            this.a = 0;
            this.b = false;
            this.c = null;
            this.d = null;
            this.e = null;
        }
        this.f = z;
    }

    private List<String> a(String[] strArr, boolean z) {
        if (z) {
            return Arrays.asList(strArr);
        }
        List<String> arrayList = new ArrayList();
        for (String toUpperCase : strArr) {
            arrayList.add(toUpperCase.toUpperCase(Locale.ENGLISH));
        }
        return arrayList;
    }

    public Boolean a(String str) {
        if (!this.f || str == null) {
            return null;
        }
        if (!(this.b || this.a == 1)) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (this.a) {
            case 1:
                return Boolean.valueOf(Pattern.compile(this.e, this.b ? 0 : 66).matcher(str).matches());
            case 2:
                return Boolean.valueOf(str.startsWith(this.c));
            case 3:
                return Boolean.valueOf(str.endsWith(this.c));
            case 4:
                return Boolean.valueOf(str.contains(this.c));
            case 5:
                return Boolean.valueOf(str.equals(this.c));
            case 6:
                return Boolean.valueOf(this.d.contains(str));
            default:
                return null;
        }
    }
}
