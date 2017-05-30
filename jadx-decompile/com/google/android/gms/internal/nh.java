package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.c.e;

public interface nh extends IInterface {

    public static abstract class a extends Binder implements nh {

        private static class a implements nh {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public void a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequest");
                    this.a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequest");
                    obtain.writeString(str);
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequest");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.a;
            }

            public void b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequest");
                    this.a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void b(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequest");
                    obtain.writeString(str);
                    this.a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public e c() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequest");
                    this.a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    e a = com.google.android.gms.c.e.a.a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String c(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequest");
                    obtain.writeString(str);
                    this.a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public e d() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequest");
                    this.a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    e a = com.google.android.gms.c.e.a.a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String e() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequest");
                    this.a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public e f() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequest");
                    this.a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    e a = com.google.android.gms.c.e.a.a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public e g() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequest");
                    this.a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    e a = com.google.android.gms.c.e.a.a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int h() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequest");
                    this.a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean i() {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequest");
                    this.a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int j() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequest");
                    this.a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static nh a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.storage.network.INetworkRequest");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof nh)) ? new a(iBinder) : (nh) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            IBinder iBinder = null;
            String c;
            e c2;
            int h;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequest");
                    a(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequest");
                    a();
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequest");
                    b(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequest");
                    b();
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequest");
                    a(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequest");
                    c = c(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(c);
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequest");
                    c2 = c();
                    parcel2.writeNoException();
                    if (c2 != null) {
                        iBinder = c2.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequest");
                    c2 = d();
                    parcel2.writeNoException();
                    if (c2 != null) {
                        iBinder = c2.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequest");
                    c = e();
                    parcel2.writeNoException();
                    parcel2.writeString(c);
                    return true;
                case 10:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequest");
                    c2 = f();
                    parcel2.writeNoException();
                    if (c2 != null) {
                        iBinder = c2.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 11:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequest");
                    c2 = g();
                    parcel2.writeNoException();
                    if (c2 != null) {
                        iBinder = c2.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 12:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequest");
                    h = h();
                    parcel2.writeNoException();
                    parcel2.writeInt(h);
                    return true;
                case 13:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequest");
                    boolean i3 = i();
                    parcel2.writeNoException();
                    parcel2.writeInt(i3 ? 1 : 0);
                    return true;
                case 14:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequest");
                    h = j();
                    parcel2.writeNoException();
                    parcel2.writeInt(h);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.firebase.storage.network.INetworkRequest");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void a();

    void a(String str);

    void a(String str, String str2);

    void b();

    void b(String str);

    e c();

    String c(String str);

    e d();

    String e();

    e f();

    e g();

    int h();

    boolean i();

    int j();
}
