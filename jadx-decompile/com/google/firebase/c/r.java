package com.google.firebase.c;

import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.util.Log;
import com.google.android.gms.g.g;
import com.google.android.gms.internal.nb;
import com.google.android.gms.internal.nk;
import com.google.firebase.c.h.a;
import org.json.JSONException;

class r implements Runnable {
    private final i a;
    private final g<h> b;
    private final h c;
    private h d = null;
    private nb e;

    public r(@NonNull i iVar, @NonNull g<h> gVar, @NonNull h hVar) {
        this.a = iVar;
        this.b = gVar;
        this.c = hVar;
        this.e = new nb(this.a.g(), this.a.f().d());
    }

    public void run() {
        Throwable e;
        String str;
        String str2;
        String valueOf;
        try {
            nk a = this.a.h().a(this.a.o(), this.c.s());
            this.e.a(a);
            if (a.h()) {
                try {
                    this.d = new a(a.d(), this.a).a();
                } catch (JSONException e2) {
                    e = e2;
                    str = "UpdateMetadataTask";
                    str2 = "Unable to parse a valid JSON object from resulting metadata:";
                    valueOf = String.valueOf(a.e());
                    Log.e(str, valueOf.length() == 0 ? str2.concat(valueOf) : new String(str2), e);
                    this.b.a(g.a(e));
                    return;
                } catch (RemoteException e3) {
                    e = e3;
                    str = "UpdateMetadataTask";
                    str2 = "Unable to parse a valid JSON object from resulting metadata:";
                    valueOf = String.valueOf(a.e());
                    if (valueOf.length() == 0) {
                    }
                    Log.e(str, valueOf.length() == 0 ? str2.concat(valueOf) : new String(str2), e);
                    this.b.a(g.a(e));
                    return;
                }
            }
            if (this.b != null) {
                a.a(this.b, this.d);
            }
        } catch (JSONException e4) {
            e = e4;
            Log.e("UpdateMetadataTask", "Unable to create the request from metadata.", e);
            this.b.a(g.a(e));
        } catch (RemoteException e5) {
            e = e5;
            Log.e("UpdateMetadataTask", "Unable to create the request from metadata.", e);
            this.b.a(g.a(e));
        }
    }
}
