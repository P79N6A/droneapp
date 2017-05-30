package com.google.android.gms.internal;

import android.net.Uri;
import android.net.Uri.Builder;
import com.google.android.gms.common.internal.d;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class db extends aqg {
    private final aoz a;

    public db(aoz com_google_android_gms_internal_aoz) {
        this.a = com_google_android_gms_internal_aoz;
    }

    protected ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        boolean z = false;
        d.b(eaVarArr != null);
        d.b(eaVarArr.length >= 1);
        ea eaVar = eaVarArr[0];
        d.b(!(eaVar instanceof ee));
        ee eeVar = eaVarArr.length > 1 ? eaVarArr[1] : ee.e;
        boolean z2 = eeVar == ee.e || (eeVar instanceof ef);
        d.b(z2);
        ea eaVar2 = eaVarArr.length > 2 ? eaVarArr[2] : ee.e;
        if (eaVar2 == ee.e || !(eaVar2 instanceof ee)) {
            z = true;
        }
        d.b(z);
        Builder buildUpon = Uri.parse(aqf.d(eaVar)).buildUpon();
        if (eeVar != ee.e) {
            for (ea eaVar3 : (List) ((ef) eeVar).b()) {
                d.b(eaVar3 instanceof eh);
                for (Entry entry : ((Map) ((eh) eaVar3).b()).entrySet()) {
                    buildUpon.appendQueryParameter(((String) entry.getKey()).toString(), aqf.d(ek.a(com_google_android_gms_internal_apr, (ea) entry.getValue())));
                }
            }
        }
        String uri = buildUpon.build().toString();
        String str;
        if (eaVar2 == ee.e) {
            this.a.a(uri);
            str = "SendPixel: url = ";
            uri = String.valueOf(uri);
            aph.d(uri.length() != 0 ? str.concat(uri) : new String(str));
        } else {
            str = aqf.d(eaVar2);
            this.a.a(uri, str);
            aph.d(new StringBuilder((String.valueOf(uri).length() + 30) + String.valueOf(str).length()).append("SendPixel: url = ").append(uri).append(", uniqueId = ").append(str).toString());
        }
        return ee.e;
    }
}
