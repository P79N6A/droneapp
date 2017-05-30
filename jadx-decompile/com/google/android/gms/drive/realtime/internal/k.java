package com.google.android.gms.drive.realtime.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

public interface k extends IInterface {

    public static abstract class a extends Binder implements k {

        private static class a implements k {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public void a(Status status) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IIndexReferenceCallback");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(ParcelableIndexReference parcelableIndexReference) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IIndexReferenceCallback");
                    if (parcelableIndexReference != null) {
                        obtain.writeInt(1);
                        parcelableIndexReference.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
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

        public static k a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IIndexReferenceCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof k)) ? new a(iBinder) : (k) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            Status status = null;
            switch (i) {
                case 1:
                    ParcelableIndexReference parcelableIndexReference;
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IIndexReferenceCallback");
                    if (parcel.readInt() != 0) {
                        parcelableIndexReference = (ParcelableIndexReference) ParcelableIndexReference.CREATOR.createFromParcel(parcel);
                    }
                    a(parcelableIndexReference);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IIndexReferenceCallback");
                    if (parcel.readInt() != 0) {
                        status = (Status) Status.CREATOR.createFromParcel(parcel);
                    }
                    a(status);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.drive.realtime.internal.IIndexReferenceCallback");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void a(Status status);

    void a(ParcelableIndexReference parcelableIndexReference);
}
