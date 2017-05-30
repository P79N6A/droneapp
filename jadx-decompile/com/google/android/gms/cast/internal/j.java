package com.google.android.gms.cast.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.cast.JoinOptions;
import com.google.android.gms.cast.LaunchOptions;

public interface j extends IInterface {

    public static abstract class a extends Binder implements j {

        private static class a implements j {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public void a() {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
                    this.a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(double d, double d2, boolean z) {
                int i = 1;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
                    obtain.writeDouble(d);
                    obtain.writeDouble(d2);
                    if (!z) {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    this.a.transact(7, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(String str) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
                    obtain.writeString(str);
                    this.a.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(String str, LaunchOptions launchOptions) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
                    obtain.writeString(str);
                    if (launchOptions != null) {
                        obtain.writeInt(1);
                        launchOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(13, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(String str, String str2) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(String str, String str2, long j) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeLong(j);
                    this.a.transact(9, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(String str, String str2, long j, String str3) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeLong(j);
                    obtain.writeString(str3);
                    this.a.transact(15, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(String str, String str2, JoinOptions joinOptions) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (joinOptions != null) {
                        obtain.writeInt(1);
                        joinOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(14, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(String str, boolean z) {
                int i = 1;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
                    obtain.writeString(str);
                    if (!z) {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    this.a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(String str, byte[] bArr, long j) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
                    obtain.writeString(str);
                    obtain.writeByteArray(bArr);
                    obtain.writeLong(j);
                    this.a.transact(10, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(boolean z, double d, boolean z2) {
                int i = 1;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeDouble(d);
                    if (!z2) {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    this.a.transact(8, obtain, null, 1);
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
                    obtain.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
                    this.a.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void b(String str) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
                    obtain.writeString(str);
                    this.a.transact(11, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void c() {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
                    this.a.transact(6, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void c(String str) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
                    obtain.writeString(str);
                    this.a.transact(12, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static j a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof j)) ? new a(iBinder) : (j) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            boolean z = false;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                    a();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                    String readString = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    a(readString, z);
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                    a(parcel.readString(), parcel.readString());
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                    b();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                    a(parcel.readString());
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                    c();
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                    a(parcel.readDouble(), parcel.readDouble(), parcel.readInt() != 0);
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                    boolean z2 = parcel.readInt() != 0;
                    double readDouble = parcel.readDouble();
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    a(z2, readDouble, z);
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                    a(parcel.readString(), parcel.readString(), parcel.readLong());
                    return true;
                case 10:
                    parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                    a(parcel.readString(), parcel.createByteArray(), parcel.readLong());
                    return true;
                case 11:
                    parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                    b(parcel.readString());
                    return true;
                case 12:
                    parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                    c(parcel.readString());
                    return true;
                case 13:
                    parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                    a(parcel.readString(), parcel.readInt() != 0 ? (LaunchOptions) LaunchOptions.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 14:
                    parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                    a(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (JoinOptions) JoinOptions.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 15:
                    parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                    a(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString());
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.cast.internal.ICastDeviceController");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void a();

    void a(double d, double d2, boolean z);

    void a(String str);

    void a(String str, LaunchOptions launchOptions);

    void a(String str, String str2);

    void a(String str, String str2, long j);

    void a(String str, String str2, long j, String str3);

    void a(String str, String str2, JoinOptions joinOptions);

    void a(String str, boolean z);

    void a(String str, byte[] bArr, long j);

    void a(boolean z, double d, boolean z2);

    void b();

    void b(String str);

    void c();

    void c(String str);
}
