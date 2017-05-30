package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.app.c;
import com.google.android.gms.tagmanager.aj;
import java.util.Map;

public class da extends aqg {
    private final aj a;
    private final c b;

    public da(aj ajVar, c cVar) {
        this.a = ajVar;
        this.b = cVar;
    }

    protected ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        boolean z = true;
        d.b(eaVarArr != null);
        boolean z2 = eaVarArr.length == 1 || eaVarArr.length == 2;
        d.b(z2);
        d.b(eaVarArr[0] instanceof ej);
        ee eeVar = eaVarArr.length > 1 ? eaVarArr[1] : ee.e;
        if (!(eeVar == ee.e || (eeVar instanceof eh))) {
            z = false;
        }
        d.b(z);
        aow a = this.b.a();
        String str = (String) ((ej) eaVarArr[0]).b();
        Bundle bundle = null;
        if (eeVar != ee.e) {
            bundle = ek.a((Map) ((eh) eeVar).b());
        }
        try {
            this.a.a(a.f(), str, bundle, a.a());
        } catch (RemoteException e) {
            String str2 = "Error calling measurement proxy:";
            String valueOf = String.valueOf(e.getMessage());
            aph.a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
        return ee.e;
    }
}
