package com.google.android.gms.tagmanager;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.c.e;
import com.google.android.gms.internal.apf;

public interface al extends IInterface {

    public static abstract class a extends Binder implements al {

        private static class a implements al {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public IBinder asBinder() {
                return this.a;
            }

            public apf getService(e eVar, aj ajVar, af afVar) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.tagmanager.ITagManagerServiceProvider");
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    obtain.writeStrongBinder(ajVar != null ? ajVar.asBinder() : null);
                    if (afVar != null) {
                        iBinder = afVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    apf a = com.google.android.gms.internal.apf.a.a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.google.android.gms.tagmanager.ITagManagerServiceProvider");
        }

        public static al asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.tagmanager.ITagManagerServiceProvider");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof al)) ? new a(iBinder) : (al) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.tagmanager.ITagManagerServiceProvider");
                    apf service = getService(com.google.android.gms.c.e.a.a(parcel.readStrongBinder()), com.google.android.gms.tagmanager.aj.a.a(parcel.readStrongBinder()), com.google.android.gms.tagmanager.af.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(service != null ? service.asBinder() : null);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.tagmanager.ITagManagerServiceProvider");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    apf getService(e eVar, aj ajVar, af afVar);
}
