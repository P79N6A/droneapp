package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class yz$a extends Binder implements yz {

    private static class a implements yz {
        private IBinder a;

        a(IBinder iBinder) {
            this.a = iBinder;
        }

        public void a() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManager");
                this.a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public void a(int i, int i2, Intent intent) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManager");
                obtain.writeInt(i);
                obtain.writeInt(i2);
                if (intent != null) {
                    obtain.writeInt(1);
                    intent.writeToParcel(obtain, 0);
                } else {
                    obtain.writeInt(0);
                }
                this.a.transact(3, obtain, obtain2, 0);
                obtain2.readException();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public IBinder asBinder() {
            return this.a;
        }

        public void b() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManager");
                this.a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    public yz$a() {
        attachInterface(this, "com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManager");
    }

    public static yz a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManager");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof yz)) ? new a(iBinder) : (yz) queryLocalInterface;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManager");
                a();
                parcel2.writeNoException();
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManager");
                b();
                parcel2.writeNoException();
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManager");
                a(parcel.readInt(), parcel.readInt(), parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManager");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
