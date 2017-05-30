package com.google.android.gms.auth.a;

import android.accounts.Account;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface d extends IInterface {

    public static abstract class a extends Binder implements d {

        private static class a implements d {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public void a(c cVar, Account account) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.auth.account.IWorkAccountService");
                    obtain.writeStrongBinder(cVar != null ? cVar.asBinder() : null);
                    if (account != null) {
                        obtain.writeInt(1);
                        account.writeToParcel(obtain, 0);
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

            public void a(c cVar, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.auth.account.IWorkAccountService");
                    obtain.writeStrongBinder(cVar != null ? cVar.asBinder() : null);
                    obtain.writeString(str);
                    this.a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(boolean z) {
                int i = 1;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.auth.account.IWorkAccountService");
                    if (!z) {
                        i = 0;
                    }
                    obtain.writeInt(i);
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

        public static d a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.IWorkAccountService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof d)) ? new a(iBinder) : (d) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.auth.account.IWorkAccountService");
                    a(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.auth.account.IWorkAccountService");
                    a(com.google.android.gms.auth.a.c.a.a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.auth.account.IWorkAccountService");
                    a(com.google.android.gms.auth.a.c.a.a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Account) Account.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.auth.account.IWorkAccountService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void a(c cVar, Account account);

    void a(c cVar, String str);

    void a(boolean z);
}
