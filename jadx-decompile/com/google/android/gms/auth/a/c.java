package com.google.android.gms.auth.a;

import android.accounts.Account;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface c extends IInterface {

    public static abstract class a extends Binder implements c {

        private static class a implements c {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public void a(Account account) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.auth.account.IWorkAccountCallback");
                    if (account != null) {
                        obtain.writeInt(1);
                        account.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(boolean z) {
                int i = 1;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.auth.account.IWorkAccountCallback");
                    if (!z) {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    this.a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.a;
            }
        }

        public a() {
            attachInterface(this, "com.google.android.gms.auth.account.IWorkAccountCallback");
        }

        public static c a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.IWorkAccountCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof c)) ? new a(iBinder) : (c) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.auth.account.IWorkAccountCallback");
                    a(parcel.readInt() != 0 ? (Account) Account.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.auth.account.IWorkAccountCallback");
                    a(parcel.readInt() != 0);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.auth.account.IWorkAccountCallback");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void a(Account account);

    void a(boolean z);
}
