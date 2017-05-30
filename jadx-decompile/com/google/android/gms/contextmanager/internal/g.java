package com.google.android.gms.contextmanager.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.Relation;

public interface g extends IInterface {

    public static abstract class a extends Binder implements g {

        private static class a implements g {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public void a(ContextData contextData) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.contextmanager.internal.IContextListener");
                    if (contextData != null) {
                        obtain.writeInt(1);
                        contextData.writeToParcel(obtain, 0);
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

            public void a(Relation relation) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.contextmanager.internal.IContextListener");
                    if (relation != null) {
                        obtain.writeInt(1);
                        relation.writeToParcel(obtain, 0);
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

            public IBinder asBinder() {
                return this.a;
            }
        }

        public static g a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.contextmanager.internal.IContextListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof g)) ? new a(iBinder) : (g) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            Relation relation = null;
            switch (i) {
                case 1:
                    ContextData contextData;
                    parcel.enforceInterface("com.google.android.gms.contextmanager.internal.IContextListener");
                    if (parcel.readInt() != 0) {
                        contextData = (ContextData) ContextData.CREATOR.createFromParcel(parcel);
                    }
                    a(contextData);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.contextmanager.internal.IContextListener");
                    if (parcel.readInt() != 0) {
                        relation = (Relation) Relation.CREATOR.createFromParcel(parcel);
                    }
                    a(relation);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.contextmanager.internal.IContextListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void a(ContextData contextData);

    void a(Relation relation);
}
