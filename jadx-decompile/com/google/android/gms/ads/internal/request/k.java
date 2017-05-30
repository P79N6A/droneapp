package com.google.android.gms.ads.internal.request;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface k extends IInterface {

    public static abstract class a extends Binder implements k {

        private static class a implements k {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public AdResponseParcel a(AdRequestInfoParcel adRequestInfoParcel) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.request.IAdRequestService");
                    if (adRequestInfoParcel != null) {
                        obtain.writeInt(1);
                        adRequestInfoParcel.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    AdResponseParcel adResponseParcel = obtain2.readInt() != 0 ? (AdResponseParcel) AdResponseParcel.CREATOR.createFromParcel(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return adResponseParcel;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(AdRequestInfoParcel adRequestInfoParcel, l lVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.request.IAdRequestService");
                    if (adRequestInfoParcel != null) {
                        obtain.writeInt(1);
                        adRequestInfoParcel.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(lVar != null ? lVar.asBinder() : null);
                    this.a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.a;
            }
        }

        public a() {
            attachInterface(this, "com.google.android.gms.ads.internal.request.IAdRequestService");
        }

        public static k a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof k)) ? new a(iBinder) : (k) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            AdRequestInfoParcel adRequestInfoParcel = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
                    if (parcel.readInt() != 0) {
                        adRequestInfoParcel = (AdRequestInfoParcel) AdRequestInfoParcel.CREATOR.createFromParcel(parcel);
                    }
                    AdResponseParcel a = a(adRequestInfoParcel);
                    parcel2.writeNoException();
                    if (a != null) {
                        parcel2.writeInt(1);
                        a.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
                    if (parcel.readInt() != 0) {
                        adRequestInfoParcel = (AdRequestInfoParcel) AdRequestInfoParcel.CREATOR.createFromParcel(parcel);
                    }
                    a(adRequestInfoParcel, com.google.android.gms.ads.internal.request.l.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.request.IAdRequestService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    AdResponseParcel a(AdRequestInfoParcel adRequestInfoParcel);

    void a(AdRequestInfoParcel adRequestInfoParcel, l lVar);
}
