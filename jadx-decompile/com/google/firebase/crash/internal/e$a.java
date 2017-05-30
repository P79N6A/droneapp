package com.google.firebase.crash.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.c.e;

public abstract class e$a extends Binder implements e {

    private static class a implements e {
        private IBinder a;

        a(IBinder iBinder) {
            this.a = iBinder;
        }

        public void a() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.firebase.crash.internal.IFirebaseCrashReceiverService");
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
                obtain.writeInterfaceToken("com.google.firebase.crash.internal.IFirebaseCrashReceiverService");
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
                obtain.writeInterfaceToken("com.google.firebase.crash.internal.IFirebaseCrashReceiverService");
                obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                this.a.transact(3, obtain, obtain2, 0);
                obtain2.readException();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    public static e a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.crash.internal.IFirebaseCrashReceiverService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof e)) ? new a(iBinder) : (e) queryLocalInterface;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.firebase.crash.internal.IFirebaseCrashReceiverService");
                a(com.google.android.gms.c.e.a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 2:
                parcel.enforceInterface("com.google.firebase.crash.internal.IFirebaseCrashReceiverService");
                a();
                parcel2.writeNoException();
                return true;
            case 3:
                parcel.enforceInterface("com.google.firebase.crash.internal.IFirebaseCrashReceiverService");
                b(com.google.android.gms.c.e.a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.firebase.crash.internal.IFirebaseCrashReceiverService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
