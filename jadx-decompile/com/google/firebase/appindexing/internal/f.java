package com.google.firebase.appindexing.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.aif;

public interface f extends IInterface {

    public static abstract class a extends Binder implements f {

        private static class a implements f {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public void a(aif com_google_android_gms_internal_aif) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.appindexing.internal.IAppIndexingService");
                    obtain.writeStrongBinder(com_google_android_gms_internal_aif != null ? com_google_android_gms_internal_aif.asBinder() : null);
                    this.a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(aif com_google_android_gms_internal_aif, Thing[] thingArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.appindexing.internal.IAppIndexingService");
                    obtain.writeStrongBinder(com_google_android_gms_internal_aif != null ? com_google_android_gms_internal_aif.asBinder() : null);
                    obtain.writeTypedArray(thingArr, 0);
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(aif com_google_android_gms_internal_aif, String[] strArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.appindexing.internal.IAppIndexingService");
                    obtain.writeStrongBinder(com_google_android_gms_internal_aif != null ? com_google_android_gms_internal_aif.asBinder() : null);
                    obtain.writeStringArray(strArr);
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

        public static f a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.appindexing.internal.IAppIndexingService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof f)) ? new a(iBinder) : (f) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.firebase.appindexing.internal.IAppIndexingService");
                    a(com.google.android.gms.internal.aif.a.a(parcel.readStrongBinder()), (Thing[]) parcel.createTypedArray(Thing.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.firebase.appindexing.internal.IAppIndexingService");
                    a(com.google.android.gms.internal.aif.a.a(parcel.readStrongBinder()), parcel.createStringArray());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.firebase.appindexing.internal.IAppIndexingService");
                    a(com.google.android.gms.internal.aif.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.firebase.appindexing.internal.IAppIndexingService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void a(aif com_google_android_gms_internal_aif);

    void a(aif com_google_android_gms_internal_aif, Thing[] thingArr);

    void a(aif com_google_android_gms_internal_aif, String[] strArr);
}
