package com.google.android.gms.internal;

import android.os.RemoteException;

public class amf$c extends amf<Long> {
    public amf$c(int i, String str, Long l) {
        super(i, str, l, null);
    }

    public /* synthetic */ Object a(ami com_google_android_gms_internal_ami) {
        return b(com_google_android_gms_internal_ami);
    }

    public Long b(ami com_google_android_gms_internal_ami) {
        try {
            return Long.valueOf(com_google_android_gms_internal_ami.getLongFlagValue(a(), ((Long) b()).longValue(), d()));
        } catch (RemoteException e) {
            return (Long) b();
        }
    }
}
