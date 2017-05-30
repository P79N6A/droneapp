package com.google.android.gms.maps.model.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

public interface e extends IInterface {

    public static abstract class a extends Binder implements e {

        private static class a implements e {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public int a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean a(e eVar) {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    this.a.transact(5, obtain, obtain2, 0);
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

            public int b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
                    this.a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public List<IBinder> c() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
                    this.a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    List<IBinder> createBinderArrayList = obtain2.createBinderArrayList();
                    return createBinderArrayList;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean d() {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
                    this.a.transact(4, obtain, obtain2, 0);
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

            public int e() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
                    this.a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static e a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof e)) ? new a(iBinder) : (e) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3 = 0;
            boolean d;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
                    i3 = a();
                    parcel2.writeNoException();
                    parcel2.writeInt(i3);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
                    i3 = b();
                    parcel2.writeNoException();
                    parcel2.writeInt(i3);
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
                    List c = c();
                    parcel2.writeNoException();
                    parcel2.writeBinderList(c);
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
                    d = d();
                    parcel2.writeNoException();
                    if (d) {
                        i3 = 1;
                    }
                    parcel2.writeInt(i3);
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
                    d = a(a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    if (d) {
                        i3 = 1;
                    }
                    parcel2.writeInt(i3);
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
                    i3 = e();
                    parcel2.writeNoException();
                    parcel2.writeInt(i3);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    int a();

    boolean a(e eVar);

    int b();

    List<IBinder> c();

    boolean d();

    int e();
}
