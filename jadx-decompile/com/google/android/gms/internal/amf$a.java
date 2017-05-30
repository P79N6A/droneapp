package com.google.android.gms.internal;

import android.os.RemoteException;

public class amf$a extends amf<Boolean> {
    public amf$a(int i, String str, Boolean bool) {
        super(i, str, bool, null);
    }

    public /* synthetic */ Object a(ami com_google_android_gms_internal_ami) {
        return b(com_google_android_gms_internal_ami);
    }

    public Boolean b(ami com_google_android_gms_internal_ami) {
        try {
            return Boolean.valueOf(com_google_android_gms_internal_ami.getBooleanFlagValue(a(), ((Boolean) b()).booleanValue(), d()));
        } catch (RemoteException e) {
            return (Boolean) b();
        }
    }
}
