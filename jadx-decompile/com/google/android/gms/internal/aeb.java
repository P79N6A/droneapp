package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.appdatasearch.GetRecentContextCall.Request;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.firebase.appindexing.internal.ActionImpl;

public interface aeb extends IInterface {

    public static abstract class a extends Binder implements aeb {

        private static class a implements aeb {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public void a(Request request, aec com_google_android_gms_internal_aec) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                    if (request != null) {
                        obtain.writeInt(1);
                        request.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_internal_aec != null ? com_google_android_gms_internal_aec.asBinder() : null);
                    this.a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(aec com_google_android_gms_internal_aec) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                    obtain.writeStrongBinder(com_google_android_gms_internal_aec != null ? com_google_android_gms_internal_aec.asBinder() : null);
                    this.a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(aec com_google_android_gms_internal_aec, String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                    obtain.writeStrongBinder(com_google_android_gms_internal_aec != null ? com_google_android_gms_internal_aec.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(aec com_google_android_gms_internal_aec, String str, UsageInfo[] usageInfoArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                    obtain.writeStrongBinder(com_google_android_gms_internal_aec != null ? com_google_android_gms_internal_aec.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeTypedArray(usageInfoArr, 0);
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(aec com_google_android_gms_internal_aec, boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                    obtain.writeStrongBinder(com_google_android_gms_internal_aec != null ? com_google_android_gms_internal_aec.asBinder() : null);
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(aec com_google_android_gms_internal_aec, ActionImpl[] actionImplArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                    obtain.writeStrongBinder(com_google_android_gms_internal_aec != null ? com_google_android_gms_internal_aec.asBinder() : null);
                    obtain.writeTypedArray(actionImplArr, 0);
                    this.a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.a;
            }

            public void b(aec com_google_android_gms_internal_aec) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                    obtain.writeStrongBinder(com_google_android_gms_internal_aec != null ? com_google_android_gms_internal_aec.asBinder() : null);
                    this.a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static aeb a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof aeb)) ? new a(iBinder) : (aeb) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                    a(com.google.android.gms.internal.aec.a.a(parcel.readStrongBinder()), parcel.readString(), (UsageInfo[]) parcel.createTypedArray(UsageInfo.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                    a(com.google.android.gms.internal.aec.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                    b(com.google.android.gms.internal.aec.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                    a(com.google.android.gms.internal.aec.a.a(parcel.readStrongBinder()), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                    a(parcel.readInt() != 0 ? (Request) Request.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.internal.aec.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                    a(com.google.android.gms.internal.aec.a.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                    a(com.google.android.gms.internal.aec.a.a(parcel.readStrongBinder()), (ActionImpl[]) parcel.createTypedArray(ActionImpl.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void a(Request request, aec com_google_android_gms_internal_aec);

    void a(aec com_google_android_gms_internal_aec);

    void a(aec com_google_android_gms_internal_aec, String str, String str2);

    void a(aec com_google_android_gms_internal_aec, String str, UsageInfo[] usageInfoArr);

    void a(aec com_google_android_gms_internal_aec, boolean z);

    void a(aec com_google_android_gms_internal_aec, ActionImpl[] actionImplArr);

    void b(aec com_google_android_gms_internal_aec);
}
