package com.google.android.gms.maps.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.c.e;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import com.google.android.gms.maps.model.a.b;

public interface x extends IInterface {

    public static abstract class a extends Binder implements x {

        private static class a implements x {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public a a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
                    this.a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    a a = com.google.android.gms.maps.a.a.a.a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public e a(e eVar, GoogleMapOptions googleMapOptions) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    if (googleMapOptions != null) {
                        obtain.writeInt(1);
                        googleMapOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    e a = com.google.android.gms.maps.a.e.a.a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public i a(e eVar, StreetViewPanoramaOptions streetViewPanoramaOptions) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    if (streetViewPanoramaOptions != null) {
                        obtain.writeInt(1);
                        streetViewPanoramaOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    i a = com.google.android.gms.maps.a.i.a.a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(e eVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(e eVar, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    obtain.writeInt(i);
                    this.a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.a;
            }

            public d b(e eVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    this.a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    d a = com.google.android.gms.maps.a.d.a.a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public b b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
                    this.a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    b a = com.google.android.gms.maps.model.a.b.a.a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public h c(e eVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    this.a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    h a = com.google.android.gms.maps.a.h.a.a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static x a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof x)) ? new a(iBinder) : (x) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            IBinder iBinder = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                    a(com.google.android.gms.c.e.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                    d b = b(com.google.android.gms.c.e.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(b != null ? b.asBinder() : null);
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                    e a = a(com.google.android.gms.c.e.a.a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (GoogleMapOptions) GoogleMapOptions.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (a != null) {
                        iBinder = a.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                    a a2 = a();
                    parcel2.writeNoException();
                    if (a2 != null) {
                        iBinder = a2.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                    b b2 = b();
                    parcel2.writeNoException();
                    if (b2 != null) {
                        iBinder = b2.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                    a(com.google.android.gms.c.e.a.a(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                    i a3 = a(com.google.android.gms.c.e.a.a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (StreetViewPanoramaOptions) StreetViewPanoramaOptions.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (a3 != null) {
                        iBinder = a3.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                    h c = c(com.google.android.gms.c.e.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    if (c != null) {
                        iBinder = c.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.maps.internal.ICreator");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    a a();

    e a(e eVar, GoogleMapOptions googleMapOptions);

    i a(e eVar, StreetViewPanoramaOptions streetViewPanoramaOptions);

    void a(e eVar);

    void a(e eVar, int i);

    d b(e eVar);

    b b();

    h c(e eVar);
}
