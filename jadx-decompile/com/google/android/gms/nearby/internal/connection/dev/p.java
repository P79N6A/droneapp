package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface p extends IInterface {

    public static abstract class a extends Binder implements p {

        private static class a implements p {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public void a(OnConnectionRequestParams onConnectionRequestParams) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.IAdvertisingCallback");
                    if (onConnectionRequestParams != null) {
                        obtain.writeInt(1);
                        onConnectionRequestParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(OnStoppedAdvertisingParams onStoppedAdvertisingParams) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.IAdvertisingCallback");
                    if (onStoppedAdvertisingParams != null) {
                        obtain.writeInt(1);
                        onStoppedAdvertisingParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.a;
            }
        }

        public static p a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.dev.IAdvertisingCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof p)) ? new a(iBinder) : (p) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            OnStoppedAdvertisingParams onStoppedAdvertisingParams = null;
            switch (i) {
                case 2:
                    OnConnectionRequestParams onConnectionRequestParams;
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.IAdvertisingCallback");
                    if (parcel.readInt() != 0) {
                        onConnectionRequestParams = (OnConnectionRequestParams) OnConnectionRequestParams.CREATOR.createFromParcel(parcel);
                    }
                    a(onConnectionRequestParams);
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.IAdvertisingCallback");
                    if (parcel.readInt() != 0) {
                        onStoppedAdvertisingParams = (OnStoppedAdvertisingParams) OnStoppedAdvertisingParams.CREATOR.createFromParcel(parcel);
                    }
                    a(onStoppedAdvertisingParams);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.nearby.internal.connection.dev.IAdvertisingCallback");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void a(OnConnectionRequestParams onConnectionRequestParams);

    void a(OnStoppedAdvertisingParams onStoppedAdvertisingParams);
}
