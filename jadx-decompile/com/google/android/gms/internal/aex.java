package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.proxy.ProxyGrpcRequest;
import com.google.android.gms.auth.api.proxy.ProxyRequest;

public interface aex extends IInterface {

    public static abstract class a extends Binder implements aex {

        private static class a implements aex {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public void a(aew com_google_android_gms_internal_aew) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.auth.api.internal.IAuthService");
                    obtain.writeStrongBinder(com_google_android_gms_internal_aew != null ? com_google_android_gms_internal_aew.asBinder() : null);
                    this.a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(aew com_google_android_gms_internal_aew, ProxyGrpcRequest proxyGrpcRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.auth.api.internal.IAuthService");
                    obtain.writeStrongBinder(com_google_android_gms_internal_aew != null ? com_google_android_gms_internal_aew.asBinder() : null);
                    if (proxyGrpcRequest != null) {
                        obtain.writeInt(1);
                        proxyGrpcRequest.writeToParcel(obtain, 0);
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

            public void a(aew com_google_android_gms_internal_aew, ProxyRequest proxyRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.auth.api.internal.IAuthService");
                    obtain.writeStrongBinder(com_google_android_gms_internal_aew != null ? com_google_android_gms_internal_aew.asBinder() : null);
                    if (proxyRequest != null) {
                        obtain.writeInt(1);
                        proxyRequest.writeToParcel(obtain, 0);
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

            public IBinder asBinder() {
                return this.a;
            }
        }

        public static aex a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof aex)) ? new a(iBinder) : (aex) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            ProxyGrpcRequest proxyGrpcRequest = null;
            aew a;
            switch (i) {
                case 1:
                    ProxyRequest proxyRequest;
                    parcel.enforceInterface("com.google.android.gms.auth.api.internal.IAuthService");
                    a = com.google.android.gms.internal.aew.a.a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        proxyRequest = (ProxyRequest) ProxyRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(a, proxyRequest);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.auth.api.internal.IAuthService");
                    a = com.google.android.gms.internal.aew.a.a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        proxyGrpcRequest = (ProxyGrpcRequest) ProxyGrpcRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(a, proxyGrpcRequest);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.auth.api.internal.IAuthService");
                    a(com.google.android.gms.internal.aew.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.auth.api.internal.IAuthService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void a(aew com_google_android_gms_internal_aew);

    void a(aew com_google_android_gms_internal_aew, ProxyGrpcRequest proxyGrpcRequest);

    void a(aew com_google_android_gms_internal_aew, ProxyRequest proxyRequest);
}
