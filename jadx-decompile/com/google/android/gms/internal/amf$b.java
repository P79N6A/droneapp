package com.google.android.gms.internal;

import android.os.RemoteException;

public class amf$b extends amf<Integer> {
    public amf$b(int i, String str, Integer num) {
        super(i, str, num, null);
    }

    public /* synthetic */ Object a(ami com_google_android_gms_internal_ami) {
        return b(com_google_android_gms_internal_ami);
    }

    public Integer b(ami com_google_android_gms_internal_ami) {
        try {
            return Integer.valueOf(com_google_android_gms_internal_ami.getIntFlagValue(a(), ((Integer) b()).intValue(), d()));
        } catch (RemoteException e) {
            return (Integer) b();
        }
    }
}
