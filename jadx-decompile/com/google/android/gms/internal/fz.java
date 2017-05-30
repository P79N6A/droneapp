package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.api.model.CreateAuthUriResponse;
import com.google.firebase.auth.api.model.GetAccountInfoUser;
import com.google.firebase.auth.api.model.GetTokenResponse;

public interface fz extends IInterface {

    public static abstract class a extends Binder implements fz {

        private static class a implements fz {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public void a() {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    this.a.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(Status status) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(CreateAuthUriResponse createAuthUriResponse) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (createAuthUriResponse != null) {
                        obtain.writeInt(1);
                        createAuthUriResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(GetTokenResponse getTokenResponse) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (getTokenResponse != null) {
                        obtain.writeInt(1);
                        getTokenResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(GetTokenResponse getTokenResponse, GetAccountInfoUser getAccountInfoUser) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (getTokenResponse != null) {
                        obtain.writeInt(1);
                        getTokenResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (getAccountInfoUser != null) {
                        obtain.writeInt(1);
                        getAccountInfoUser.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(2, obtain, null, 1);
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
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    this.a.transact(6, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void c() {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    this.a.transact(7, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
        }

        public static fz a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof fz)) ? new a(iBinder) : (fz) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    a(parcel.readInt() != 0 ? (GetTokenResponse) GetTokenResponse.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    a(parcel.readInt() != 0 ? (GetTokenResponse) GetTokenResponse.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (GetAccountInfoUser) GetAccountInfoUser.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    a(parcel.readInt() != 0 ? (CreateAuthUriResponse) CreateAuthUriResponse.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    a();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    a(parcel.readInt() != 0 ? (Status) Status.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    b();
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    c();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void a();

    void a(Status status);

    void a(CreateAuthUriResponse createAuthUriResponse);

    void a(GetTokenResponse getTokenResponse);

    void a(GetTokenResponse getTokenResponse, GetAccountInfoUser getAccountInfoUser);

    void b();

    void c();
}
