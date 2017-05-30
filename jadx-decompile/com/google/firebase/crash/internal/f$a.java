package com.google.firebase.crash.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.c.e;

public abstract class f$a extends Binder implements f {

    private static class a implements f {
        private IBinder a;

        a(IBinder iBinder) {
            this.a = iBinder;
        }

        public void a() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.firebase.crash.internal.IFirebaseCrashSenderService");
                this.a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public void a(e eVar) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.firebase.crash.internal.IFirebaseCrashSenderService");
                obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
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

        public void b(e eVar) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.firebase.crash.internal.IFirebaseCrashSenderService");
                obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                this.a.transact(3, obtain, obtain2, 0);
                obtain2.readException();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    public static f a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.crash.internal.IFirebaseCrashSenderService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof f)) ? new a(iBinder) : (f) queryLocalInterface;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.firebase.crash.internal.IFirebaseCrashSenderService");
                a(com.google.android.gms.c.e.a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 2:
                parcel.enforceInterface("com.google.firebase.crash.internal.IFirebaseCrashSenderService");
                a();
                parcel2.writeNoException();
                return true;
            case 3:
                parcel.enforceInterface("com.google.firebase.crash.internal.IFirebaseCrashSenderService");
                b(com.google.android.gms.c.e.a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.firebase.crash.internal.IFirebaseCrashSenderService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
