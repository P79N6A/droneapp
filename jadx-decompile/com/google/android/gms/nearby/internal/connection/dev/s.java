package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface s extends IInterface {

    public static abstract class a extends Binder implements s {

        private static class a implements s {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public void a(OnEndpointFoundParams onEndpointFoundParams) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.IDiscoveryCallback");
                    if (onEndpointFoundParams != null) {
                        obtain.writeInt(1);
                        onEndpointFoundParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(OnEndpointLostParams onEndpointLostParams) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.IDiscoveryCallback");
                    if (onEndpointLostParams != null) {
                        obtain.writeInt(1);
                        onEndpointLostParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(OnStoppedDiscoveryParams onStoppedDiscoveryParams) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.IDiscoveryCallback");
                    if (onStoppedDiscoveryParams != null) {
                        obtain.writeInt(1);
                        onStoppedDiscoveryParams.writeToParcel(obtain, 0);
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

        public static s a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.dev.IDiscoveryCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof s)) ? new a(iBinder) : (s) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            OnStoppedDiscoveryParams onStoppedDiscoveryParams = null;
            switch (i) {
                case 2:
                    OnEndpointFoundParams onEndpointFoundParams;
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.IDiscoveryCallback");
                    if (parcel.readInt() != 0) {
                        onEndpointFoundParams = (OnEndpointFoundParams) OnEndpointFoundParams.CREATOR.createFromParcel(parcel);
                    }
                    a(onEndpointFoundParams);
                    return true;
                case 3:
                    OnEndpointLostParams onEndpointLostParams;
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.IDiscoveryCallback");
                    if (parcel.readInt() != 0) {
                        onEndpointLostParams = (OnEndpointLostParams) OnEndpointLostParams.CREATOR.createFromParcel(parcel);
                    }
                    a(onEndpointLostParams);
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.IDiscoveryCallback");
                    if (parcel.readInt() != 0) {
                        onStoppedDiscoveryParams = (OnStoppedDiscoveryParams) OnStoppedDiscoveryParams.CREATOR.createFromParcel(parcel);
                    }
                    a(onStoppedDiscoveryParams);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.nearby.internal.connection.dev.IDiscoveryCallback");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void a(OnEndpointFoundParams onEndpointFoundParams);

    void a(OnEndpointLostParams onEndpointLostParams);

    void a(OnStoppedDiscoveryParams onStoppedDiscoveryParams);
}
