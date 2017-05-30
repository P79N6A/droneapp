package com.google.android.gms.drive.realtime.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface h extends IInterface {

    public static abstract class a extends Binder implements h {

        private static class a implements h {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public void a(boolean z, boolean z2) {
                int i = 1;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IDocumentSaveStateEventCallback");
                    obtain.writeInt(z ? 1 : 0);
                    if (!z2) {
                        i = 0;
                    }
                    obtain.writeInt(i);
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

        public static h a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IDocumentSaveStateEventCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof h)) ? new a(iBinder) : (h) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            boolean z = false;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IDocumentSaveStateEventCallback");
                    boolean z2 = parcel.readInt() != 0;
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    a(z2, z);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.drive.realtime.internal.IDocumentSaveStateEventCallback");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void a(boolean z, boolean z2);
}
