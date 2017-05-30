package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.c.e;

public interface ah extends IInterface {

    public static abstract class a extends Binder implements ah {

        private static class a implements ah {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public e a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    e a = com.google.android.gms.c.e.a.a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.a;
            }

            public e b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                    this.a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    e a = com.google.android.gms.c.e.a.a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static ah a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ah)) ? new a(iBinder) : (ah) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            IBinder iBinder = null;
            e a;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                    a = a();
                    parcel2.writeNoException();
                    if (a != null) {
                        iBinder = a.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                    a = b();
                    parcel2.writeNoException();
                    if (a != null) {
                        iBinder = a.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    e a();

    e b();
}
