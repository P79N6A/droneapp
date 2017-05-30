package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface q extends IInterface {

    public static abstract class a extends Binder implements q {

        private static class a implements q {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public void a(OnDisconnectedParams onDisconnectedParams) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.IConnectionEventListener");
                    if (onDisconnectedParams != null) {
                        obtain.writeInt(1);
                        onDisconnectedParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(OnPayloadReceivedParams onPayloadReceivedParams) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.IConnectionEventListener");
                    if (onPayloadReceivedParams != null) {
                        obtain.writeInt(1);
                        onPayloadReceivedParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(OnPayloadTransferUpdateParams onPayloadTransferUpdateParams) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.IConnectionEventListener");
                    if (onPayloadTransferUpdateParams != null) {
                        obtain.writeInt(1);
                        onPayloadTransferUpdateParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.a;
            }
        }

        public static q a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.dev.IConnectionEventListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof q)) ? new a(iBinder) : (q) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            OnPayloadTransferUpdateParams onPayloadTransferUpdateParams = null;
            switch (i) {
                case 2:
                    OnPayloadReceivedParams onPayloadReceivedParams;
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.IConnectionEventListener");
                    if (parcel.readInt() != 0) {
                        onPayloadReceivedParams = (OnPayloadReceivedParams) OnPayloadReceivedParams.CREATOR.createFromParcel(parcel);
                    }
                    a(onPayloadReceivedParams);
                    return true;
                case 3:
                    OnDisconnectedParams onDisconnectedParams;
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.IConnectionEventListener");
                    if (parcel.readInt() != 0) {
                        onDisconnectedParams = (OnDisconnectedParams) OnDisconnectedParams.CREATOR.createFromParcel(parcel);
                    }
                    a(onDisconnectedParams);
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.IConnectionEventListener");
                    if (parcel.readInt() != 0) {
                        onPayloadTransferUpdateParams = (OnPayloadTransferUpdateParams) OnPayloadTransferUpdateParams.CREATOR.createFromParcel(parcel);
                    }
                    a(onPayloadTransferUpdateParams);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.nearby.internal.connection.dev.IConnectionEventListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void a(OnDisconnectedParams onDisconnectedParams);

    void a(OnPayloadReceivedParams onPayloadReceivedParams);

    void a(OnPayloadTransferUpdateParams onPayloadTransferUpdateParams);
}
