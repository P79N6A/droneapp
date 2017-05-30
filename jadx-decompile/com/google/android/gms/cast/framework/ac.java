package com.google.android.gms.cast.framework;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.c.e;

public interface ac extends IInterface {

    public static abstract class a extends Binder implements ac {
        public a() {
            attachInterface(this, "com.google.android.gms.cast.framework.ISessionProvider");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ISessionProvider");
                    e a = a(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a != null ? a.asBinder() : null);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ISessionProvider");
                    boolean b = b();
                    parcel2.writeNoException();
                    parcel2.writeInt(b ? 1 : 0);
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ISessionProvider");
                    String c = c();
                    parcel2.writeNoException();
                    parcel2.writeString(c);
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ISessionProvider");
                    int a2 = a();
                    parcel2.writeNoException();
                    parcel2.writeInt(a2);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.cast.framework.ISessionProvider");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    int a();

    e a(String str);

    boolean b();

    String c();
}
