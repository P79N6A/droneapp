package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.c.e;

public abstract class yq$a extends Binder implements yq {

    private static class a implements yq {
        private IBinder a;

        a(IBinder iBinder) {
            this.a = iBinder;
        }

        public void a(int i, int i2, Intent intent) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                obtain.writeInt(i);
                obtain.writeInt(i2);
                if (intent != null) {
                    obtain.writeInt(1);
                    intent.writeToParcel(obtain, 0);
                } else {
                    obtain.writeInt(0);
                }
                this.a.transact(12, obtain, obtain2, 0);
                obtain2.readException();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public void a(Bundle bundle) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                if (bundle != null) {
                    obtain.writeInt(1);
                    bundle.writeToParcel(obtain, 0);
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

        public void a(e eVar) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                this.a.transact(13, obtain, obtain2, 0);
                obtain2.readException();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public IBinder asBinder() {
            return this.a;
        }

        public void b(Bundle bundle) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                if (bundle != null) {
                    obtain.writeInt(1);
                    bundle.writeToParcel(obtain, 0);
                } else {
                    obtain.writeInt(0);
                }
                this.a.transact(6, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() != 0) {
                    bundle.readFromParcel(obtain2);
                }
                obtain2.recycle();
                obtain.recycle();
            } catch (Throwable th) {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public void d() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                this.a.transact(10, obtain, obtain2, 0);
                obtain2.readException();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public boolean e() {
            boolean z = false;
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
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

        public void f() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                this.a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public void g() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                this.a.transact(3, obtain, obtain2, 0);
                obtain2.readException();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public void h() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                this.a.transact(4, obtain, obtain2, 0);
                obtain2.readException();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public void i() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                this.a.transact(5, obtain, obtain2, 0);
                obtain2.readException();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public void j() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                this.a.transact(7, obtain, obtain2, 0);
                obtain2.readException();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public void k() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                this.a.transact(8, obtain, obtain2, 0);
                obtain2.readException();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public void l() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                this.a.transact(9, obtain, obtain2, 0);
                obtain2.readException();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    public yq$a() {
        attachInterface(this, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public static yq a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof yq)) ? new a(iBinder) : (yq) queryLocalInterface;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Intent intent = null;
        Bundle bundle;
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                a(bundle);
                parcel2.writeNoException();
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                f();
                parcel2.writeNoException();
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                g();
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                h();
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                i();
                parcel2.writeNoException();
                return true;
            case 6:
                parcel.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                b(bundle);
                parcel2.writeNoException();
                if (bundle != null) {
                    parcel2.writeInt(1);
                    bundle.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            case 7:
                parcel.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                j();
                parcel2.writeNoException();
                return true;
            case 8:
                parcel.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                k();
                parcel2.writeNoException();
                return true;
            case 9:
                parcel.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                l();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                d();
                parcel2.writeNoException();
                return true;
            case 11:
                parcel.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                boolean e = e();
                parcel2.writeNoException();
                parcel2.writeInt(e ? 1 : 0);
                return true;
            case 12:
                parcel.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                if (parcel.readInt() != 0) {
                    intent = (Intent) Intent.CREATOR.createFromParcel(parcel);
                }
                a(readInt, readInt2, intent);
                parcel2.writeNoException();
                return true;
            case 13:
                parcel.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                a(com.google.android.gms.c.e.a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
