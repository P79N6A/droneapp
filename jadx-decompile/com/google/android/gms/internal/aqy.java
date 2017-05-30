package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class aqy extends aqg {

    class a implements Comparator<ea<?>> {
        final /* synthetic */ ed a;
        final /* synthetic */ apr b;
        final /* synthetic */ aqy c;

        a(aqy com_google_android_gms_internal_aqy, ed edVar, apr com_google_android_gms_internal_apr) {
            this.c = com_google_android_gms_internal_aqy;
            this.a = edVar;
            this.b = com_google_android_gms_internal_apr;
        }

        public int a(ea<?> eaVar, ea<?> eaVar2) {
            if (eaVar == null) {
                return eaVar2 != null ? 1 : 0;
            } else {
                if (eaVar2 == null) {
                    return eaVar != null ? -1 : 0;
                } else {
                    ea a_ = ((aqe) this.a.b()).a_(this.b, eaVar, eaVar2);
                    d.a(a_ instanceof ec);
                    return (int) ((Double) ((ec) a_).b()).doubleValue();
                }
            }
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return a((ea) obj, (ea) obj2);
        }
    }

    private static class b implements aqe {
        private b() {
        }

        public ea<?> a_(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
            return new ec(Double.valueOf((double) aqf.d(eaVarArr[0]).compareTo(aqf.d(eaVarArr[1]))));
        }
    }

    protected ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        ed edVar;
        d.a(eaVarArr);
        boolean z = eaVarArr.length == 1 || eaVarArr.length == 2;
        d.b(z);
        d.b(eaVarArr[0] instanceof ef);
        ef efVar = (ef) eaVarArr[0];
        if (eaVarArr.length == 2) {
            d.b(eaVarArr[1] instanceof ed);
            edVar = (ed) eaVarArr[1];
        } else {
            edVar = new ed(new b());
        }
        Collections.sort((List) efVar.b(), new a(this, edVar, com_google_android_gms_internal_apr));
        return eaVarArr[0];
    }
}
