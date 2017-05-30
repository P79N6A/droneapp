package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface r extends IInterface {

    public static abstract class a extends Binder implements r {

        private static class a implements r {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public void a(OnConnectionResponseParams onConnectionResponseParams) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.IConnectionResponseListener");
                    if (onConnectionResponseParams != null) {
                        obtain.writeInt(1);
                        onConnectionResponseParams.writeToParcel(obtain, 0);
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

        public static r a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.dev.IConnectionResponseListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof r)) ? new a(iBinder) : (r) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.IConnectionResponseListener");
                    a(parcel.readInt() != 0 ? (OnConnectionResponseParams) OnConnectionResponseParams.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.nearby.internal.connection.dev.IConnectionResponseListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void a(OnConnectionResponseParams onConnectionResponseParams);
}
