package com.xiaomi.account;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class IXiaomiAuthResponse$Stub extends Binder implements IXiaomiAuthResponse {
    private static final String DESCRIPTOR = "com.xiaomi.account.IXiaomiAuthResponse";
    static final int TRANSACTION_onCancel = 2;
    static final int TRANSACTION_onResult = 1;

    private static class Proxy implements IXiaomiAuthResponse {
        private IBinder mRemote;

        Proxy(IBinder iBinder) {
            this.mRemote = iBinder;
        }

        public IBinder asBinder() {
            return this.mRemote;
        }

        public String getInterfaceDescriptor() {
            return IXiaomiAuthResponse$Stub.DESCRIPTOR;
        }

        public void onCancel() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken(IXiaomiAuthResponse$Stub.DESCRIPTOR);
                this.mRemote.transact(2, obtain, obtain2, 0);
                obtain2.readException();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public void onResult(Bundle bundle) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken(IXiaomiAuthResponse$Stub.DESCRIPTOR);
                if (bundle != null) {
                    obtain.writeInt(1);
                    bundle.writeToParcel(obtain, 0);
                } else {
                    obtain.writeInt(0);
                }
                this.mRemote.transact(1, obtain, obtain2, 0);
                obtain2.readException();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    public IXiaomiAuthResponse$Stub() {
        attachInterface(this, DESCRIPTOR);
    }

    public static IXiaomiAuthResponse asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
        return (queryLocalInterface == null || !(queryLocalInterface instanceof IXiaomiAuthResponse)) ? new Proxy(iBinder) : (IXiaomiAuthResponse) queryLocalInterface;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface(DESCRIPTOR);
                onResult(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 2:
                parcel.enforceInterface(DESCRIPTOR);
                onCancel();
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString(DESCRIPTOR);
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
