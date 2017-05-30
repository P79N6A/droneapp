package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface w extends IInterface {

    public static abstract class a extends Binder implements w {

        private static class a implements w {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public void a(OnStartAdvertisingResultParams onStartAdvertisingResultParams) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.IStartAdvertisingResultListener");
                    if (onStartAdvertisingResultParams != null) {
                        obtain.writeInt(1);
                        onStartAdvertisingResultParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.a;
            }
        }

        public static w a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.dev.IStartAdvertisingResultListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof w)) ? new a(iBinder) : (w) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.IStartAdvertisingResultListener");
                    a(parcel.readInt() != 0 ? (OnStartAdvertisingResultParams) OnStartAdvertisingResultParams.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.nearby.internal.connection.dev.IStartAdvertisingResultListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void a(OnStartAdvertisingResultParams onStartAdvertisingResultParams);
}
