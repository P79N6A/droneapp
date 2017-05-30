package com.google.android.gms.internal;

import android.os.RemoteException;

public class amf$d extends amf<String> {
    public amf$d(int i, String str, String str2) {
        super(i, str, str2, null);
    }

    public /* synthetic */ Object a(ami com_google_android_gms_internal_ami) {
        return b(com_google_android_gms_internal_ami);
    }

    public String b(ami com_google_android_gms_internal_ami) {
        try {
            return com_google_android_gms_internal_ami.getStringFlagValue(a(), (String) b(), d());
        } catch (RemoteException e) {
            return (String) b();
        }
    }
}
