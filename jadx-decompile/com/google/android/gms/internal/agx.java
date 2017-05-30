package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface agx extends IInterface {

    public static abstract class a extends Binder implements agx {

        private static class a implements agx {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public void a() {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
                    this.a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(agw com_google_android_gms_internal_agw) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
                    if (com_google_android_gms_internal_agw != null) {
                        iBinder = com_google_android_gms_internal_agw.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.a.transact(6, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(agw com_google_android_gms_internal_agw, int i) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
                    if (com_google_android_gms_internal_agw != null) {
                        iBinder = com_google_android_gms_internal_agw.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i);
                    this.a.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(agw com_google_android_gms_internal_agw, agy com_google_android_gms_internal_agy, String str, String str2) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
                    obtain.writeStrongBinder(com_google_android_gms_internal_agw != null ? com_google_android_gms_internal_agw.asBinder() : null);
                    if (com_google_android_gms_internal_agy != null) {
                        iBinder = com_google_android_gms_internal_agy.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.a.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(agw com_google_android_gms_internal_agw, agy com_google_android_gms_internal_agy, String str, String str2, Bundle bundle) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
                    obtain.writeStrongBinder(com_google_android_gms_internal_agw != null ? com_google_android_gms_internal_agw.asBinder() : null);
                    if (com_google_android_gms_internal_agy != null) {
                        iBinder = com_google_android_gms_internal_agy.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(7, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.a;
            }

            public void b() {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
                    this.a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static agx a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof agx)) ? new a(iBinder) : (agx) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    parcel.enforceInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
                    a();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
                    b();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
                    a(com.google.android.gms.internal.agw.a.a(parcel.readStrongBinder()), com.google.android.gms.internal.agy.a.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
                    a(com.google.android.gms.internal.agw.a.a(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
                    a(com.google.android.gms.internal.agw.a.a(parcel.readStrongBinder()));
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
                    a(com.google.android.gms.internal.agw.a.a(parcel.readStrongBinder()), com.google.android.gms.internal.agy.a.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void a();

    void a(agw com_google_android_gms_internal_agw);

    void a(agw com_google_android_gms_internal_agw, int i);

    void a(agw com_google_android_gms_internal_agw, agy com_google_android_gms_internal_agy, String str, String str2);

    void a(agw com_google_android_gms_internal_agw, agy com_google_android_gms_internal_agy, String str, String str2, Bundle bundle);

    void b();
}
