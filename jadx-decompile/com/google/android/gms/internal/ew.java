package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.c.d;
import com.google.android.gms.c.e;
import com.google.android.gms.wallet.fragment.WalletFragmentOptions;

public interface ew extends IInterface {

    public static abstract class a extends Binder implements ew {

        private static class a implements ew {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public et a(e eVar, d dVar, WalletFragmentOptions walletFragmentOptions, eu euVar) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IWalletDynamiteCreator");
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    if (walletFragmentOptions != null) {
                        obtain.writeInt(1);
                        walletFragmentOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (euVar != null) {
                        iBinder = euVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    et a = com.google.android.gms.internal.et.a.a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.a;
            }
        }

        public static ew a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IWalletDynamiteCreator");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ew)) ? new a(iBinder) : (ew) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            IBinder iBinder = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.wallet.internal.IWalletDynamiteCreator");
                    et a = a(com.google.android.gms.c.e.a.a(parcel.readStrongBinder()), com.google.android.gms.c.d.a.a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (WalletFragmentOptions) WalletFragmentOptions.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.internal.eu.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    if (a != null) {
                        iBinder = a.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.wallet.internal.IWalletDynamiteCreator");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    et a(e eVar, d dVar, WalletFragmentOptions walletFragmentOptions, eu euVar);
}
