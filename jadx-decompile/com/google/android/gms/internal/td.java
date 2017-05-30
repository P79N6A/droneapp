package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.c.e;

public interface td extends IInterface {

    public static abstract class a extends Binder implements td {

        private static class a implements td {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public IBinder a(String str, e eVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    IBinder readStrongBinder = obtain2.readStrongBinder();
                    return readStrongBinder;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.a;
            }

            public IBinder b(String str, e eVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    this.a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    IBinder readStrongBinder = obtain2.readStrongBinder();
                    return readStrongBinder;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static td a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof td)) ? new a(iBinder) : (td) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            IBinder a;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
                    a = a(parcel.readString(), com.google.android.gms.c.e.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
                    a = b(parcel.readString(), com.google.android.gms.c.e.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    IBinder a(String str, e eVar);

    IBinder b(String str, e eVar);
}
