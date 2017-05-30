package com.google.android.gms.tagmanager;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.Map;

public interface af extends IInterface {

    public static abstract class a extends Binder implements af {

        private static class a implements af {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public void a(String str, Map map) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.tagmanager.ICustomEvaluatorProxy");
                    obtain.writeString(str);
                    obtain.writeMap(map);
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.a;
            }

            public String b(String str, Map map) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.tagmanager.ICustomEvaluatorProxy");
                    obtain.writeString(str);
                    obtain.writeMap(map);
                    this.a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.google.android.gms.tagmanager.ICustomEvaluatorProxy");
        }

        public static af a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.tagmanager.ICustomEvaluatorProxy");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof af)) ? new a(iBinder) : (af) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.tagmanager.ICustomEvaluatorProxy");
                    a(parcel.readString(), parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.tagmanager.ICustomEvaluatorProxy");
                    String b = b(parcel.readString(), parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    parcel2.writeString(b);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.tagmanager.ICustomEvaluatorProxy");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void a(String str, Map map);

    String b(String str, Map map);
}
