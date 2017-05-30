package com.google.android.gms.auth.api.signin.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface e extends IInterface {

    public static abstract class a extends Binder implements e {
        public a() {
            attachInterface(this, "com.google.android.gms.auth.api.signin.internal.IRevocationService");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.auth.api.signin.internal.IRevocationService");
                    a();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.auth.api.signin.internal.IRevocationService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void a();
}
