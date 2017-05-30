package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface aog extends IInterface {

    public static abstract class a extends Binder implements aog {

        private static class a implements aog {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public void a(aof com_google_android_gms_internal_aof, String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.search.internal.ISearchAuthService");
                    obtain.writeStrongBinder(com_google_android_gms_internal_aof != null ? com_google_android_gms_internal_aof.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
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

            public void b(aof com_google_android_gms_internal_aof, String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.search.internal.ISearchAuthService");
                    obtain.writeStrongBinder(com_google_android_gms_internal_aof != null ? com_google_android_gms_internal_aof.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static aog a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.search.internal.ISearchAuthService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof aog)) ? new a(iBinder) : (aog) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.search.internal.ISearchAuthService");
                    a(com.google.android.gms.internal.aof.a.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.search.internal.ISearchAuthService");
                    b(com.google.android.gms.internal.aof.a.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.search.internal.ISearchAuthService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void a(aof com_google_android_gms_internal_aof, String str, String str2);

    void b(aof com_google_android_gms_internal_aof, String str, String str2);
}
