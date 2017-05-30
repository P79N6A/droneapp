package com.google.android.gms.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import android.view.View;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.i;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.tf.a;
import com.google.android.gms.internal.tf.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.WeakHashMap;

@aaa
public class ti implements tj {
    private final Object a = new Object();
    private final WeakHashMap<abi, tf> b = new WeakHashMap();
    private final ArrayList<tf> c = new ArrayList();
    private final Context d;
    private final VersionInfoParcel e;
    private final wx f;

    public ti(Context context, VersionInfoParcel versionInfoParcel, wx wxVar) {
        this.d = context.getApplicationContext();
        this.e = versionInfoParcel;
        this.f = wxVar;
    }

    public tf a(AdSizeParcel adSizeParcel, abi com_google_android_gms_internal_abi) {
        return a(adSizeParcel, com_google_android_gms_internal_abi, com_google_android_gms_internal_abi.b.b());
    }

    public tf a(AdSizeParcel adSizeParcel, abi com_google_android_gms_internal_abi, View view) {
        return a(adSizeParcel, com_google_android_gms_internal_abi, new d(view, com_google_android_gms_internal_abi), null);
    }

    public tf a(AdSizeParcel adSizeParcel, abi com_google_android_gms_internal_abi, View view, wy wyVar) {
        return a(adSizeParcel, com_google_android_gms_internal_abi, new d(view, com_google_android_gms_internal_abi), wyVar);
    }

    public tf a(AdSizeParcel adSizeParcel, abi com_google_android_gms_internal_abi, i iVar) {
        return a(adSizeParcel, com_google_android_gms_internal_abi, new a(iVar), null);
    }

    public tf a(AdSizeParcel adSizeParcel, abi com_google_android_gms_internal_abi, tm tmVar, @Nullable wy wyVar) {
        tf tfVar;
        synchronized (this.a) {
            if (a(com_google_android_gms_internal_abi)) {
                tfVar = (tf) this.b.get(com_google_android_gms_internal_abi);
            } else {
                if (wyVar != null) {
                    tfVar = new tk(this.d, adSizeParcel, com_google_android_gms_internal_abi, this.e, tmVar, wyVar);
                } else {
                    tfVar = new tl(this.d, adSizeParcel, com_google_android_gms_internal_abi, this.e, tmVar, this.f);
                }
                tfVar.a((tj) this);
                this.b.put(com_google_android_gms_internal_abi, tfVar);
                this.c.add(tfVar);
            }
        }
        return tfVar;
    }

    public void a(tf tfVar) {
        synchronized (this.a) {
            if (!tfVar.f()) {
                this.c.remove(tfVar);
                Iterator it = this.b.entrySet().iterator();
                while (it.hasNext()) {
                    if (((Entry) it.next()).getValue() == tfVar) {
                        it.remove();
                    }
                }
            }
        }
    }

    public boolean a(abi com_google_android_gms_internal_abi) {
        boolean z;
        synchronized (this.a) {
            tf tfVar = (tf) this.b.get(com_google_android_gms_internal_abi);
            z = tfVar != null && tfVar.f();
        }
        return z;
    }

    public void b(abi com_google_android_gms_internal_abi) {
        synchronized (this.a) {
            tf tfVar = (tf) this.b.get(com_google_android_gms_internal_abi);
            if (tfVar != null) {
                tfVar.d();
            }
        }
    }

    public void c(abi com_google_android_gms_internal_abi) {
        synchronized (this.a) {
            tf tfVar = (tf) this.b.get(com_google_android_gms_internal_abi);
            if (tfVar != null) {
                tfVar.n();
            }
        }
    }

    public void d(abi com_google_android_gms_internal_abi) {
        synchronized (this.a) {
            tf tfVar = (tf) this.b.get(com_google_android_gms_internal_abi);
            if (tfVar != null) {
                tfVar.o();
            }
        }
    }

    public void e(abi com_google_android_gms_internal_abi) {
        synchronized (this.a) {
            tf tfVar = (tf) this.b.get(com_google_android_gms_internal_abi);
            if (tfVar != null) {
                tfVar.p();
            }
        }
    }
}
