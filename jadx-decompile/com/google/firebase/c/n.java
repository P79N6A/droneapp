package com.google.firebase.c;

import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.util.Log;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.g.g;
import com.google.android.gms.internal.nb;
import com.google.android.gms.internal.nk;
import com.google.firebase.c.h.a;
import org.json.JSONException;

class n implements Runnable {
    private i a;
    private g<h> b;
    private h c;
    private nb d = new nb(this.a.g(), this.a.f().d());

    public n(@NonNull i iVar, @NonNull g<h> gVar) {
        d.a(iVar);
        d.a(gVar);
        this.a = iVar;
        this.b = gVar;
    }

    public void run() {
        Throwable e;
        String str;
        String str2;
        String valueOf;
        try {
            nk b = this.a.h().b(this.a.o());
            this.d.a(b);
            if (b.h()) {
                try {
                    this.c = new a(b.d(), this.a).a();
                } catch (JSONException e2) {
                    e = e2;
                    str = "GetMetadataTask";
                    str2 = "Unable to parse resulting metadata. ";
                    valueOf = String.valueOf(b.e());
                    Log.e(str, valueOf.length() == 0 ? str2.concat(valueOf) : new String(str2), e);
                    this.b.a(g.a(e));
                    return;
                } catch (RemoteException e3) {
                    e = e3;
                    str = "GetMetadataTask";
                    str2 = "Unable to parse resulting metadata. ";
                    valueOf = String.valueOf(b.e());
                    if (valueOf.length() == 0) {
                    }
                    Log.e(str, valueOf.length() == 0 ? str2.concat(valueOf) : new String(str2), e);
                    this.b.a(g.a(e));
                    return;
                }
            }
            if (this.b != null) {
                b.a(this.b, this.c);
            }
        } catch (Throwable e4) {
            Log.e("GetMetadataTask", "Unable to create firebase storage network request.", e4);
            this.b.a(g.a(e4));
        }
    }
}
