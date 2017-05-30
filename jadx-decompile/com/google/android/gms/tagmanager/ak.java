package com.google.android.gms.tagmanager;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.c.e;

public interface ak extends IInterface {

    public static abstract class a extends Binder implements ak {

        private static class a implements ak {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public IBinder asBinder() {
                return this.a;
            }

            public void initialize(e eVar, aj ajVar, af afVar) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.tagmanager.ITagManagerApi");
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    obtain.writeStrongBinder(ajVar != null ? ajVar.asBinder() : null);
                    if (afVar != null) {
                        iBinder = afVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void preview(Intent intent, e eVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.tagmanager.ITagManagerApi");
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    this.a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void previewIntent(Intent intent, e eVar, e eVar2, aj ajVar, af afVar) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.tagmanager.ITagManagerApi");
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    obtain.writeStrongBinder(eVar2 != null ? eVar2.asBinder() : null);
                    obtain.writeStrongBinder(ajVar != null ? ajVar.asBinder() : null);
                    if (afVar != null) {
                        iBinder = afVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.google.android.gms.tagmanager.ITagManagerApi");
        }

        public static ak asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.tagmanager.ITagManagerApi");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ak)) ? new a(iBinder) : (ak) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            Intent intent = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.tagmanager.ITagManagerApi");
                    initialize(com.google.android.gms.c.e.a.a(parcel.readStrongBinder()), com.google.android.gms.tagmanager.aj.a.a(parcel.readStrongBinder()), com.google.android.gms.tagmanager.af.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.tagmanager.ITagManagerApi");
                    if (parcel.readInt() != 0) {
                        intent = (Intent) Intent.CREATOR.createFromParcel(parcel);
                    }
                    preview(intent, com.google.android.gms.c.e.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.tagmanager.ITagManagerApi");
                    previewIntent(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.c.e.a.a(parcel.readStrongBinder()), com.google.android.gms.c.e.a.a(parcel.readStrongBinder()), com.google.android.gms.tagmanager.aj.a.a(parcel.readStrongBinder()), com.google.android.gms.tagmanager.af.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.tagmanager.ITagManagerApi");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void initialize(e eVar, aj ajVar, af afVar);

    void preview(Intent intent, e eVar);

    void previewIntent(Intent intent, e eVar, e eVar2, aj ajVar, af afVar);
}
