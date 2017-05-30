package com.google.android.gms.maps.model.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;

public interface c extends IInterface {

    public static abstract class a extends Binder implements c {

        private static class a implements c {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public void a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(double d) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    obtain.writeDouble(d);
                    this.a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(float f) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    obtain.writeFloat(f);
                    this.a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    obtain.writeInt(i);
                    this.a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(LatLng latLng) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    if (latLng != null) {
                        obtain.writeInt(1);
                        latLng.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.a.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean a(c cVar) {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    obtain.writeStrongBinder(cVar != null ? cVar.asBinder() : null);
                    this.a.transact(17, obtain, obtain2, 0);
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

            public IBinder asBinder() {
                return this.a;
            }

            public String b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    this.a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void b(float f) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    obtain.writeFloat(f);
                    this.a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void b(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    obtain.writeInt(i);
                    this.a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void b(boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.a.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public LatLng c() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    this.a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    LatLng latLng = obtain2.readInt() != 0 ? (LatLng) LatLng.CREATOR.createFromParcel(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return latLng;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public double d() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    this.a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    double readDouble = obtain2.readDouble();
                    return readDouble;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public float e() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    this.a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    float readFloat = obtain2.readFloat();
                    return readFloat;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int f() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    this.a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int g() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    this.a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public float h() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    this.a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                    float readFloat = obtain2.readFloat();
                    return readFloat;
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
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    this.a.transact(16, obtain, obtain2, 0);
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
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    this.a.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean k() {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    this.a.transact(20, obtain, obtain2, 0);
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
        }

        public static c a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof c)) ? new a(iBinder) : (c) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3 = 0;
            float e;
            boolean z;
            boolean i4;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    a();
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    String b = b();
                    parcel2.writeNoException();
                    parcel2.writeString(b);
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    a(parcel.readInt() != 0 ? (LatLng) LatLng.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    LatLng c = c();
                    parcel2.writeNoException();
                    if (c != null) {
                        parcel2.writeInt(1);
                        c.writeToParcel(parcel2, 1);
                        return true;
                    }
                    parcel2.writeInt(0);
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    a(parcel.readDouble());
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    double d = d();
                    parcel2.writeNoException();
                    parcel2.writeDouble(d);
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    a(parcel.readFloat());
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    e = e();
                    parcel2.writeNoException();
                    parcel2.writeFloat(e);
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    a(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 10:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    i3 = f();
                    parcel2.writeNoException();
                    parcel2.writeInt(i3);
                    return true;
                case 11:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    b(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    i3 = g();
                    parcel2.writeNoException();
                    parcel2.writeInt(i3);
                    return true;
                case 13:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    b(parcel.readFloat());
                    parcel2.writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    e = h();
                    parcel2.writeNoException();
                    parcel2.writeFloat(e);
                    return true;
                case 15:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    a(z);
                    parcel2.writeNoException();
                    return true;
                case 16:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    i4 = i();
                    parcel2.writeNoException();
                    if (i4) {
                        i3 = 1;
                    }
                    parcel2.writeInt(i3);
                    return true;
                case 17:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    i4 = a(a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    if (i4) {
                        i3 = 1;
                    }
                    parcel2.writeInt(i3);
                    return true;
                case 18:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    i3 = j();
                    parcel2.writeNoException();
                    parcel2.writeInt(i3);
                    return true;
                case 19:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    b(z);
                    parcel2.writeNoException();
                    return true;
                case 20:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    i4 = k();
                    parcel2.writeNoException();
                    if (i4) {
                        i3 = 1;
                    }
                    parcel2.writeInt(i3);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void a();

    void a(double d);

    void a(float f);

    void a(int i);

    void a(LatLng latLng);

    void a(boolean z);

    boolean a(c cVar);

    String b();

    void b(float f);

    void b(int i);

    void b(boolean z);

    LatLng c();

    double d();

    float e();

    int f();

    int g();

    float h();

    boolean i();

    int j();

    boolean k();
}
