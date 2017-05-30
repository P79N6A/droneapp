package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.Surface;

public interface agw extends IInterface {

    public static abstract class a extends Binder implements agw {
        public a() {
            attachInterface(this, "com.google.android.gms.cast.remote_display.ICastRemoteDisplayCallbacks");
        }

        public static agw a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof agw)) ? new a(iBinder) : (agw) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayCallbacks");
                    a(parcel.readInt(), parcel.readInt(), parcel.readInt() != 0 ? (Surface) Surface.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayCallbacks");
                    a(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayCallbacks");
                    a();
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayCallbacks");
                    b();
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.cast.remote_display.ICastRemoteDisplayCallbacks");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void a();

    void a(int i);

    void a(int i, int i2, Surface surface);

    void b();
}
