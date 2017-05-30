package com.google.android.gms.maps.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface n extends IInterface {

    public static abstract class a extends Binder implements n {

        private static class a implements n {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public void a(com.google.android.gms.maps.model.a.a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnPolylineClickListener");
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    this.a.transact(1, obtain, obtain2, 0);
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
            attachInterface(this, "com.google.android.gms.maps.internal.IOnPolylineClickListener");
        }

        public static n a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnPolylineClickListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof n)) ? new a(iBinder) : (n) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IOnPolylineClickListener");
                    a(com.google.android.gms.maps.model.a.a.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.maps.internal.IOnPolylineClickListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void a(com.google.android.gms.maps.model.a.a aVar);
}
