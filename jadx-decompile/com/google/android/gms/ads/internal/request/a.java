package com.google.android.gms.ads.internal.request;

import android.content.Context;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abq;
import com.google.android.gms.internal.ro;
import java.util.concurrent.Future;

@aaa
public class a {

    public interface a {
        void a(com.google.android.gms.internal.abi.a aVar);
    }

    public abq a(Context context, com.google.android.gms.ads.internal.request.AdRequestInfoParcel.a aVar, ro roVar, a aVar2) {
        abq nVar = aVar.b.c.getBundle("sdk_less_server_data") != null ? new n(context, aVar, aVar2) : new b(context, aVar, roVar, aVar2);
        Future future = (Future) nVar.e();
        return nVar;
    }
}
