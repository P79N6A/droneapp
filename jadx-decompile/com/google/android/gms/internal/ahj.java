package com.google.android.gms.internal;

import android.support.annotation.NonNull;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.common.internal.d;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class ahj extends ahm {
    private final SparseArray<a> e = new SparseArray();

    private class a implements c {
        public final int a;
        public final g b;
        public final c c;
        final /* synthetic */ ahj d;

        public a(ahj com_google_android_gms_internal_ahj, int i, g gVar, c cVar) {
            this.d = com_google_android_gms_internal_ahj;
            this.a = i;
            this.b = gVar;
            this.c = cVar;
            gVar.a(this);
        }

        public void a() {
            this.b.c(this);
            this.b.g();
        }

        public void a(@NonNull ConnectionResult connectionResult) {
            String valueOf = String.valueOf(connectionResult);
            Log.d("AutoManageHelper", new StringBuilder(String.valueOf(valueOf).length() + 27).append("beginFailureResolution for ").append(valueOf).toString());
            this.d.b(connectionResult, this.a);
        }

        public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.append(str).append("GoogleApiClient #").print(this.a);
            printWriter.println(":");
            this.b.b(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        }
    }

    private ahj(aik com_google_android_gms_internal_aik) {
        super(com_google_android_gms_internal_aik);
        this.d.a("AutoManageHelper", (aij) this);
    }

    public static ahj a(aih com_google_android_gms_internal_aih) {
        aik b = aij.b(com_google_android_gms_internal_aih);
        ahj com_google_android_gms_internal_ahj = (ahj) b.a("AutoManageHelper", ahj.class);
        return com_google_android_gms_internal_ahj != null ? com_google_android_gms_internal_ahj : new ahj(b);
    }

    public void a() {
        super.a();
        for (int i = 0; i < this.e.size(); i++) {
            ((a) this.e.valueAt(i)).b.g();
        }
    }

    public void a(int i) {
        a aVar = (a) this.e.get(i);
        this.e.remove(i);
        if (aVar != null) {
            aVar.a();
        }
    }

    public void a(int i, g gVar, c cVar) {
        d.a(gVar, "GoogleApiClient instance cannot be null");
        d.a(this.e.indexOfKey(i) < 0, "Already managing a GoogleApiClient with id " + i);
        Log.d("AutoManageHelper", "starting AutoManage for client " + i + " " + this.a + " " + this.b);
        this.e.put(i, new a(this, i, gVar, cVar));
        if (this.a && !this.b) {
            String valueOf = String.valueOf(gVar);
            Log.d("AutoManageHelper", new StringBuilder(String.valueOf(valueOf).length() + 11).append("connecting ").append(valueOf).toString());
            gVar.e();
        }
    }

    protected void a(ConnectionResult connectionResult, int i) {
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        a aVar = (a) this.e.get(i);
        if (aVar != null) {
            a(i);
            c cVar = aVar.c;
            if (cVar != null) {
                cVar.a(connectionResult);
            }
        }
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i = 0; i < this.e.size(); i++) {
            ((a) this.e.valueAt(i)).a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public void b() {
        super.b();
        boolean z = this.a;
        String valueOf = String.valueOf(this.e);
        Log.d("AutoManageHelper", new StringBuilder(String.valueOf(valueOf).length() + 14).append("onStart ").append(z).append(" ").append(valueOf).toString());
        if (!this.b) {
            for (int i = 0; i < this.e.size(); i++) {
                ((a) this.e.valueAt(i)).b.e();
            }
        }
    }

    protected void c() {
        for (int i = 0; i < this.e.size(); i++) {
            ((a) this.e.valueAt(i)).b.e();
        }
    }
}
