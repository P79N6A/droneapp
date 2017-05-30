package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.auth.api.model.VerifyAssertionRequest;

public interface ga extends IInterface {

    public static abstract class a extends Binder implements ga {

        private static class a implements ga {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public void a(fz fzVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    obtain.writeStrongBinder(fzVar != null ? fzVar.asBinder() : null);
                    this.a.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(VerifyAssertionRequest verifyAssertionRequest, fz fzVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    if (verifyAssertionRequest != null) {
                        obtain.writeInt(1);
                        verifyAssertionRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(fzVar != null ? fzVar.asBinder() : null);
                    this.a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(String str, fz fzVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(fzVar != null ? fzVar.asBinder() : null);
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(String str, UserProfileChangeRequest userProfileChangeRequest, fz fzVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    obtain.writeString(str);
                    if (userProfileChangeRequest != null) {
                        obtain.writeInt(1);
                        userProfileChangeRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(fzVar != null ? fzVar.asBinder() : null);
                    this.a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(String str, VerifyAssertionRequest verifyAssertionRequest, fz fzVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    obtain.writeString(str);
                    if (verifyAssertionRequest != null) {
                        obtain.writeInt(1);
                        verifyAssertionRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(fzVar != null ? fzVar.asBinder() : null);
                    this.a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(String str, String str2, fz fzVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStrongBinder(fzVar != null ? fzVar.asBinder() : null);
                    this.a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(String str, String str2, String str3, fz fzVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeStrongBinder(fzVar != null ? fzVar.asBinder() : null);
                    this.a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.a;
            }

            public void b(String str, fz fzVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(fzVar != null ? fzVar.asBinder() : null);
                    this.a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void b(String str, String str2, fz fzVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStrongBinder(fzVar != null ? fzVar.asBinder() : null);
                    this.a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void c(String str, fz fzVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(fzVar != null ? fzVar.asBinder() : null);
                    this.a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void c(String str, String str2, fz fzVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStrongBinder(fzVar != null ? fzVar.asBinder() : null);
                    this.a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void d(String str, fz fzVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(fzVar != null ? fzVar.asBinder() : null);
                    this.a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void d(String str, String str2, fz fzVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStrongBinder(fzVar != null ? fzVar.asBinder() : null);
                    this.a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void e(String str, fz fzVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(fzVar != null ? fzVar.asBinder() : null);
                    this.a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void e(String str, String str2, fz fzVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStrongBinder(fzVar != null ? fzVar.asBinder() : null);
                    this.a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void f(String str, fz fzVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(fzVar != null ? fzVar.asBinder() : null);
                    this.a.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void g(String str, fz fzVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(fzVar != null ? fzVar.asBinder() : null);
                    this.a.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void h(String str, fz fzVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(fzVar != null ? fzVar.asBinder() : null);
                    this.a.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static ga a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ga)) ? new a(iBinder) : (ga) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            VerifyAssertionRequest verifyAssertionRequest = null;
            String readString;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    a(parcel.readString(), com.google.android.gms.internal.fz.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    b(parcel.readString(), com.google.android.gms.internal.fz.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    if (parcel.readInt() != 0) {
                        verifyAssertionRequest = (VerifyAssertionRequest) VerifyAssertionRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(verifyAssertionRequest, com.google.android.gms.internal.fz.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    UserProfileChangeRequest userProfileChangeRequest;
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    readString = parcel.readString();
                    if (parcel.readInt() != 0) {
                        userProfileChangeRequest = (UserProfileChangeRequest) UserProfileChangeRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(readString, userProfileChangeRequest, com.google.android.gms.internal.fz.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    a(parcel.readString(), parcel.readString(), com.google.android.gms.internal.fz.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    b(parcel.readString(), parcel.readString(), com.google.android.gms.internal.fz.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    c(parcel.readString(), parcel.readString(), com.google.android.gms.internal.fz.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    d(parcel.readString(), parcel.readString(), com.google.android.gms.internal.fz.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    c(parcel.readString(), com.google.android.gms.internal.fz.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 10:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    d(parcel.readString(), com.google.android.gms.internal.fz.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 11:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    a(parcel.readString(), parcel.readString(), parcel.readString(), com.google.android.gms.internal.fz.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    readString = parcel.readString();
                    if (parcel.readInt() != 0) {
                        verifyAssertionRequest = (VerifyAssertionRequest) VerifyAssertionRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(readString, verifyAssertionRequest, com.google.android.gms.internal.fz.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 13:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    e(parcel.readString(), com.google.android.gms.internal.fz.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    e(parcel.readString(), parcel.readString(), com.google.android.gms.internal.fz.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 15:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    f(parcel.readString(), com.google.android.gms.internal.fz.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 16:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    a(com.google.android.gms.internal.fz.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 17:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    g(parcel.readString(), com.google.android.gms.internal.fz.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 18:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    h(parcel.readString(), com.google.android.gms.internal.fz.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void a(fz fzVar);

    void a(VerifyAssertionRequest verifyAssertionRequest, fz fzVar);

    void a(String str, fz fzVar);

    void a(String str, UserProfileChangeRequest userProfileChangeRequest, fz fzVar);

    void a(String str, VerifyAssertionRequest verifyAssertionRequest, fz fzVar);

    void a(String str, String str2, fz fzVar);

    void a(String str, String str2, String str3, fz fzVar);

    void b(String str, fz fzVar);

    void b(String str, String str2, fz fzVar);

    void c(String str, fz fzVar);

    void c(String str, String str2, fz fzVar);

    void d(String str, fz fzVar);

    void d(String str, String str2, fz fzVar);

    void e(String str, fz fzVar);

    void e(String str, String str2, fz fzVar);

    void f(String str, fz fzVar);

    void g(String str, fz fzVar);

    void h(String str, fz fzVar);
}
