package com.google.android.gms.auth.api.credentials.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.credentials.CredentialRequest;

public interface k extends IInterface {

    public static abstract class a extends Binder implements k {

        private static class a implements k {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public void a(j jVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                    obtain.writeStrongBinder(jVar != null ? jVar.asBinder() : null);
                    this.a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(j jVar, CredentialRequest credentialRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                    obtain.writeStrongBinder(jVar != null ? jVar.asBinder() : null);
                    if (credentialRequest != null) {
                        obtain.writeInt(1);
                        credentialRequest.writeToParcel(obtain, 0);
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

            public void a(j jVar, DeleteRequest deleteRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                    obtain.writeStrongBinder(jVar != null ? jVar.asBinder() : null);
                    if (deleteRequest != null) {
                        obtain.writeInt(1);
                        deleteRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(j jVar, GeneratePasswordRequest generatePasswordRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                    obtain.writeStrongBinder(jVar != null ? jVar.asBinder() : null);
                    if (generatePasswordRequest != null) {
                        obtain.writeInt(1);
                        generatePasswordRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(j jVar, SaveRequest saveRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                    obtain.writeStrongBinder(jVar != null ? jVar.asBinder() : null);
                    if (saveRequest != null) {
                        obtain.writeInt(1);
                        saveRequest.writeToParcel(obtain, 0);
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

        public static k a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof k)) ? new a(iBinder) : (k) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            GeneratePasswordRequest generatePasswordRequest = null;
            j a;
            switch (i) {
                case 1:
                    CredentialRequest credentialRequest;
                    parcel.enforceInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                    a = com.google.android.gms.auth.api.credentials.internal.j.a.a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        credentialRequest = (CredentialRequest) CredentialRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(a, credentialRequest);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    SaveRequest saveRequest;
                    parcel.enforceInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                    a = com.google.android.gms.auth.api.credentials.internal.j.a.a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        saveRequest = (SaveRequest) SaveRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(a, saveRequest);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    DeleteRequest deleteRequest;
                    parcel.enforceInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                    a = com.google.android.gms.auth.api.credentials.internal.j.a.a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        deleteRequest = (DeleteRequest) DeleteRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(a, deleteRequest);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                    a(com.google.android.gms.auth.api.credentials.internal.j.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                    a = com.google.android.gms.auth.api.credentials.internal.j.a.a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        generatePasswordRequest = (GeneratePasswordRequest) GeneratePasswordRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(a, generatePasswordRequest);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void a(j jVar);

    void a(j jVar, CredentialRequest credentialRequest);

    void a(j jVar, DeleteRequest deleteRequest);

    void a(j jVar, GeneratePasswordRequest generatePasswordRequest);

    void a(j jVar, SaveRequest saveRequest);
}
