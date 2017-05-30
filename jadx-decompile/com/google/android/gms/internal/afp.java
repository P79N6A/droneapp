package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface afp extends IInterface {

    public static abstract class a extends Binder implements afp {

        private static class a implements afp {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public int a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher");
                    this.a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(long j, long j2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher");
                    obtain.writeLong(j);
                    obtain.writeLong(j2);
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
            attachInterface(this, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher");
        }

        public static afp a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof afp)) ? new a(iBinder) : (afp) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher");
                    a(parcel.readLong(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher");
                    int a = a();
                    parcel2.writeNoException();
                    parcel2.writeInt(a);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    int a();

    void a(long j, long j2);
}
