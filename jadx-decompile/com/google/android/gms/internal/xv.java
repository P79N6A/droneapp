package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.c.e;
import java.util.List;

public interface xv extends IInterface {

    public static abstract class a extends Binder implements xv {

        private static class a implements xv {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public String a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
                    this.a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(e eVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    this.a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.a;
            }

            public List b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
                    this.a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    List readArrayList = obtain2.readArrayList(getClass().getClassLoader());
                    return readArrayList;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void b(e eVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    this.a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String c() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
                    this.a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void c(e eVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    this.a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public uu d() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
                    this.a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    uu a = com.google.android.gms.internal.uu.a.a(obtain2.readStrongBinder());
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
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
                    this.a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String f() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
                    this.a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void g() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
                    this.a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean h() {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
                    this.a.transact(11, obtain, obtain2, 0);
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

            public boolean i() {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
                    this.a.transact(12, obtain, obtain2, 0);
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

            public Bundle j() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
                    this.a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                    Bundle bundle = obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return bundle;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
        }

        public static xv a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof xv)) ? new a(iBinder) : (xv) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3 = 0;
            String a;
            boolean h;
            switch (i) {
                case 2:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
                    a = a();
                    parcel2.writeNoException();
                    parcel2.writeString(a);
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
                    List b = b();
                    parcel2.writeNoException();
                    parcel2.writeList(b);
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
                    a = c();
                    parcel2.writeNoException();
                    parcel2.writeString(a);
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
                    uu d = d();
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(d != null ? d.asBinder() : null);
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
                    a = e();
                    parcel2.writeNoException();
                    parcel2.writeString(a);
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
                    a = f();
                    parcel2.writeNoException();
                    parcel2.writeString(a);
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
                    g();
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
                    a(com.google.android.gms.c.e.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 10:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
                    b(com.google.android.gms.c.e.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 11:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
                    h = h();
                    parcel2.writeNoException();
                    if (h) {
                        i3 = 1;
                    }
                    parcel2.writeInt(i3);
                    return true;
                case 12:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
                    h = i();
                    parcel2.writeNoException();
                    if (h) {
                        i3 = 1;
                    }
                    parcel2.writeInt(i3);
                    return true;
                case 13:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
                    Bundle j = j();
                    parcel2.writeNoException();
                    if (j != null) {
                        parcel2.writeInt(1);
                        j.writeToParcel(parcel2, 1);
                        return true;
                    }
                    parcel2.writeInt(0);
                    return true;
                case 14:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
                    c(com.google.android.gms.c.e.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    String a();

    void a(e eVar);

    List b();

    void b(e eVar);

    String c();

    void c(e eVar);

    uu d();

    String e();

    String f();

    void g();

    boolean h();

    boolean i();

    Bundle j();
}
