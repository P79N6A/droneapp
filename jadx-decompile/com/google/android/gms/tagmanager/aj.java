package com.google.android.gms.tagmanager;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.Map;

public interface aj extends IInterface {

    public static abstract class a extends Binder implements aj {

        private static class a implements aj {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public Map a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.tagmanager.IMeasurementProxy");
                    this.a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    Map readHashMap = obtain2.readHashMap(getClass().getClassLoader());
                    return readHashMap;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(ag agVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.tagmanager.IMeasurementProxy");
                    obtain.writeStrongBinder(agVar != null ? agVar.asBinder() : null);
                    this.a.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(ai aiVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.tagmanager.IMeasurementProxy");
                    obtain.writeStrongBinder(aiVar != null ? aiVar.asBinder() : null);
                    this.a.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(String str, String str2, Bundle bundle, long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.tagmanager.IMeasurementProxy");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeLong(j);
                    this.a.transact(2, obtain, obtain2, 0);
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
            attachInterface(this, "com.google.android.gms.tagmanager.IMeasurementProxy");
        }

        public static aj a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.tagmanager.IMeasurementProxy");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof aj)) ? new a(iBinder) : (aj) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    parcel.enforceInterface("com.google.android.gms.tagmanager.IMeasurementProxy");
                    a(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 11:
                    parcel.enforceInterface("com.google.android.gms.tagmanager.IMeasurementProxy");
                    Map a = a();
                    parcel2.writeNoException();
                    parcel2.writeMap(a);
                    return true;
                case 21:
                    parcel.enforceInterface("com.google.android.gms.tagmanager.IMeasurementProxy");
                    a(com.google.android.gms.tagmanager.ai.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 22:
                    parcel.enforceInterface("com.google.android.gms.tagmanager.IMeasurementProxy");
                    a(com.google.android.gms.tagmanager.ag.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.tagmanager.IMeasurementProxy");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    Map a();

    void a(ag agVar);

    void a(ai aiVar);

    void a(String str, String str2, Bundle bundle, long j);
}
