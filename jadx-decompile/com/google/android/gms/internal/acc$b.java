package com.google.android.gms.internal;

import com.google.android.gms.internal.adf.a;
import com.google.android.gms.internal.adf.b;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

class acc$b<T> extends abd<InputStream> {
    private final acc$a<T> a;
    private final b<T> b;

    class AnonymousClass1 implements a {
        final /* synthetic */ b a;
        final /* synthetic */ acc$a b;

        AnonymousClass1(b bVar, acc$a com_google_android_gms_internal_acc_a) {
            this.a = bVar;
            this.b = com_google_android_gms_internal_acc_a;
        }

        public void a(aii com_google_android_gms_internal_aii) {
            this.a.a(this.b.b());
        }
    }

    public acc$b(String str, acc$a<T> com_google_android_gms_internal_acc_a_T, b<T> bVar) {
        super(0, str, new AnonymousClass1(bVar, com_google_android_gms_internal_acc_a_T));
        this.a = com_google_android_gms_internal_acc_a_T;
        this.b = bVar;
    }

    protected adf<InputStream> a(zb zbVar) {
        return adf.a(new ByteArrayInputStream(zbVar.b), aol.a(zbVar));
    }

    protected void a(InputStream inputStream) {
        this.b.a(this.a.b(inputStream));
    }

    protected /* synthetic */ void a(Object obj) {
        a((InputStream) obj);
    }
}
