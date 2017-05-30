package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.location.places.d;
import com.google.android.gms.nearby.connection.AppMetadata;

public interface ani extends IInterface {

    public static abstract class a extends Binder implements ani {

        private static class a implements ani {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public String a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    this.a.transact(d.bi, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    obtain.writeLong(j);
                    this.a.transact(1002, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(anh com_google_android_gms_internal_anh, String str, long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    obtain.writeStrongBinder(com_google_android_gms_internal_anh != null ? com_google_android_gms_internal_anh.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeLong(j);
                    this.a.transact(d.bb, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(anh com_google_android_gms_internal_anh, String str, long j, long j2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    obtain.writeStrongBinder(com_google_android_gms_internal_anh != null ? com_google_android_gms_internal_anh.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeLong(j);
                    obtain.writeLong(j2);
                    this.a.transact(1003, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(anh com_google_android_gms_internal_anh, String str, AppMetadata appMetadata, long j, long j2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    obtain.writeStrongBinder(com_google_android_gms_internal_anh != null ? com_google_android_gms_internal_anh.asBinder() : null);
                    obtain.writeString(str);
                    if (appMetadata != null) {
                        obtain.writeInt(1);
                        appMetadata.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeLong(j);
                    obtain.writeLong(j2);
                    this.a.transact(1001, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(anh com_google_android_gms_internal_anh, String str, String str2, byte[] bArr, long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    obtain.writeStrongBinder(com_google_android_gms_internal_anh != null ? com_google_android_gms_internal_anh.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeByteArray(bArr);
                    obtain.writeLong(j);
                    this.a.transact(1007, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(anh com_google_android_gms_internal_anh, String str, byte[] bArr, long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    obtain.writeStrongBinder(com_google_android_gms_internal_anh != null ? com_google_android_gms_internal_anh.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeByteArray(bArr);
                    obtain.writeLong(j);
                    this.a.transact(d.ba, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(String str, long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    obtain.writeString(str);
                    obtain.writeLong(j);
                    this.a.transact(d.aW, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(String[] strArr, byte[] bArr, long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    obtain.writeStringArray(strArr);
                    obtain.writeByteArray(bArr);
                    obtain.writeLong(j);
                    this.a.transact(d.bc, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.a;
            }

            public void b(long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    obtain.writeLong(j);
                    this.a.transact(d.bf, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void b(String str, long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    obtain.writeString(str);
                    obtain.writeLong(j);
                    this.a.transact(d.be, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void b(String[] strArr, byte[] bArr, long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    obtain.writeStringArray(strArr);
                    obtain.writeByteArray(bArr);
                    obtain.writeLong(j);
                    this.a.transact(d.bd, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void c(long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    obtain.writeLong(j);
                    this.a.transact(d.bg, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String d(long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    obtain.writeLong(j);
                    this.a.transact(d.bh, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static ani a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ani)) ? new a(iBinder) : (ani) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String d;
            switch (i) {
                case 1001:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    a(com.google.android.gms.internal.anh.a.a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt() != 0 ? (AppMetadata) AppMetadata.CREATOR.createFromParcel(parcel) : null, parcel.readLong(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 1002:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    a(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 1003:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    a(com.google.android.gms.internal.anh.a.a(parcel.readStrongBinder()), parcel.readString(), parcel.readLong(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case d.aW /*1004*/:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    a(parcel.readString(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 1007:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    a(com.google.android.gms.internal.anh.a.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.createByteArray(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case d.ba /*1008*/:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    a(com.google.android.gms.internal.anh.a.a(parcel.readStrongBinder()), parcel.readString(), parcel.createByteArray(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case d.bb /*1009*/:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    a(com.google.android.gms.internal.anh.a.a(parcel.readStrongBinder()), parcel.readString(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case d.bc /*1010*/:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    a(parcel.createStringArray(), parcel.createByteArray(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case d.bd /*1011*/:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    b(parcel.createStringArray(), parcel.createByteArray(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case d.be /*1012*/:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    b(parcel.readString(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case d.bf /*1013*/:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    b(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case d.bg /*1014*/:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    c(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case d.bh /*1015*/:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    d = d(parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeString(d);
                    return true;
                case d.bi /*1016*/:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    d = a();
                    parcel2.writeNoException();
                    parcel2.writeString(d);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    String a();

    void a(long j);

    void a(anh com_google_android_gms_internal_anh, String str, long j);

    void a(anh com_google_android_gms_internal_anh, String str, long j, long j2);

    void a(anh com_google_android_gms_internal_anh, String str, AppMetadata appMetadata, long j, long j2);

    void a(anh com_google_android_gms_internal_anh, String str, String str2, byte[] bArr, long j);

    void a(anh com_google_android_gms_internal_anh, String str, byte[] bArr, long j);

    void a(String str, long j);

    void a(String[] strArr, byte[] bArr, long j);

    void b(long j);

    void b(String str, long j);

    void b(String[] strArr, byte[] bArr, long j);

    void c(long j);

    String d(long j);
}
