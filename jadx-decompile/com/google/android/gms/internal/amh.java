package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.c.f;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.internal.ami.a;

public class amh {
    private boolean a = false;
    private ami b = null;

    public <T> T a(amf<T> com_google_android_gms_internal_amf_T) {
        synchronized (this) {
            if (this.a) {
                return com_google_android_gms_internal_amf_T.a(this.b);
            }
            T b = com_google_android_gms_internal_amf_T.b();
            return b;
        }
    }

    public void a(Context context) {
        Throwable e;
        synchronized (this) {
            if (this.a) {
                return;
            }
            try {
                this.b = a.asInterface(akb.a(context, akb.a, ModuleDescriptor.MODULE_ID).a("com.google.android.gms.flags.impl.FlagProviderImpl"));
                this.b.init(f.a(context));
                this.a = true;
            } catch (akb.a e2) {
                e = e2;
                Log.w("FlagValueProvider", "Failed to initialize flags module.", e);
            } catch (RemoteException e3) {
                e = e3;
                Log.w("FlagValueProvider", "Failed to initialize flags module.", e);
            }
        }
    }
}
