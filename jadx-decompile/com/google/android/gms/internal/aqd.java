package com.google.android.gms.internal;

import java.util.Arrays;
import java.util.List;

public class aqd extends aqg {
    private apr a;
    private final String b;
    private final List<String> c;
    private final List<ei> d;

    public aqd(apr com_google_android_gms_internal_apr, String str, List<String> list, List<ei> list2) {
        this.a = com_google_android_gms_internal_apr;
        this.b = str;
        this.c = list;
        this.d = list2;
    }

    public ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        try {
            apr a = this.a.a();
            for (int i = 0; i < this.c.size(); i++) {
                if (eaVarArr.length > i) {
                    a.a((String) this.c.get(i), eaVarArr[i]);
                } else {
                    a.a((String) this.c.get(i), ee.e);
                }
            }
            a.a("arguments", new ef(Arrays.asList(eaVarArr)));
            for (ei a2 : this.d) {
                ea a3 = ek.a(a, a2);
                if ((a3 instanceof ee) && ((ee) a3).e()) {
                    return (ea) ((ee) a3).b();
                }
            }
        } catch (RuntimeException e) {
            String str = this.b;
            String valueOf = String.valueOf(e.getMessage());
            aph.a(new StringBuilder((String.valueOf(str).length() + 33) + String.valueOf(valueOf).length()).append("Internal error - Function call: ").append(str).append("\n").append(valueOf).toString());
        }
        return ee.e;
    }

    public String a() {
        return this.b;
    }

    public void a(apr com_google_android_gms_internal_apr) {
        this.a = com_google_android_gms_internal_apr;
    }

    public String toString() {
        String str = this.b;
        String valueOf = String.valueOf(this.c.toString());
        String valueOf2 = String.valueOf(this.d.toString());
        return new StringBuilder(((String.valueOf(str).length() + 26) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()).append(str).append("\n\tparams: ").append(valueOf).append("\n\t: statements: ").append(valueOf2).toString();
    }
}
