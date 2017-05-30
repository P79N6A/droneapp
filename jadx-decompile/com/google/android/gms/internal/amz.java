package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.nearby.bootstrap.Device;

public interface amz extends IInterface {

    public static abstract class a extends Binder implements amz {

        private static class a implements amz {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public void a() {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
                    this.a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(int i) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
                    obtain.writeInt(i);
                    this.a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(Device device, byte[] bArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
                    if (device != null) {
                        obtain.writeInt(1);
                        device.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeByteArray(bArr);
                    this.a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(String str) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
                    obtain.writeString(str);
                    this.a.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.a;
            }

            public void b() {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
                    this.a.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void b(String str) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
                    obtain.writeString(str);
                    this.a.transact(6, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static amz a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof amz)) ? new a(iBinder) : (amz) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
                    a(parcel.readInt() != 0 ? (Device) Device.CREATOR.createFromParcel(parcel) : null, parcel.createByteArray());
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
                    a();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
                    a(parcel.readInt());
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
                    a(parcel.readString());
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
                    b();
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
                    b(parcel.readString());
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void a();

    void a(int i);

    void a(Device device, byte[] bArr);

    void a(String str);

    void b();

    void b(String str);
}
