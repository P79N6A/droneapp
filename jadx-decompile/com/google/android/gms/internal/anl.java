package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface anl extends IInterface {

    public static abstract class a extends Binder implements anl {

        private static class a implements anl {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public void a(anj com_google_android_gms_internal_anj, Uri uri, Bundle bundle, boolean z) {
                IBinder iBinder = null;
                int i = 1;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.panorama.internal.IPanoramaService");
                    if (com_google_android_gms_internal_anj != null) {
                        iBinder = com_google_android_gms_internal_anj.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!z) {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    this.a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.a;
            }
        }

        public static anl a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.panorama.internal.IPanoramaService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof anl)) ? new a(iBinder) : (anl) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.panorama.internal.IPanoramaService");
                    a(com.google.android.gms.internal.anj.a.a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.panorama.internal.IPanoramaService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void a(anj com_google_android_gms_internal_anj, Uri uri, Bundle bundle, boolean z);
}
