package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.firstparty.GetBuyFlowInitializationTokenResponse;
import com.google.android.gms.wallet.firstparty.GetClientTokenResponse;
import com.google.android.gms.wallet.firstparty.GetInstrumentsResponse;

public interface ey extends IInterface {

    public static abstract class a extends Binder implements ey {

        private static class a implements ey {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public void a(int i, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(int i, FullWallet fullWallet, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                    obtain.writeInt(i);
                    if (fullWallet != null) {
                        obtain.writeInt(1);
                        fullWallet.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(int i, MaskedWallet maskedWallet, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                    obtain.writeInt(i);
                    if (maskedWallet != null) {
                        obtain.writeInt(1);
                        maskedWallet.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(int i, boolean z, Bundle bundle) {
                int i2 = 1;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                    obtain.writeInt(i);
                    if (!z) {
                        i2 = 0;
                    }
                    obtain.writeInt(i2);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(Status status, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(8, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(Status status, GetBuyFlowInitializationTokenResponse getBuyFlowInitializationTokenResponse, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (getBuyFlowInitializationTokenResponse != null) {
                        obtain.writeInt(1);
                        getBuyFlowInitializationTokenResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
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

            public void a(Status status, GetClientTokenResponse getClientTokenResponse, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (getClientTokenResponse != null) {
                        obtain.writeInt(1);
                        getClientTokenResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(10, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(Status status, GetInstrumentsResponse getInstrumentsResponse, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (getInstrumentsResponse != null) {
                        obtain.writeInt(1);
                        getInstrumentsResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(Status status, boolean z, Bundle bundle) {
                int i = 1;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!z) {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(9, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.a;
            }

            public void b(int i, boolean z, Bundle bundle) {
                int i2 = 1;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                    obtain.writeInt(i);
                    if (!z) {
                        i2 = 0;
                    }
                    obtain.writeInt(i2);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(6, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void b(Status status, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(11, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
        }

        public static ey a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ey)) ? new a(iBinder) : (ey) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            boolean z = false;
            int readInt;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                    a(parcel.readInt(), parcel.readInt() != 0 ? (MaskedWallet) MaskedWallet.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                    a(parcel.readInt(), parcel.readInt() != 0 ? (FullWallet) FullWallet.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                    readInt = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    a(readInt, z, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                    a(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                    a(parcel.readInt() != 0 ? (Status) Status.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (GetInstrumentsResponse) GetInstrumentsResponse.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                    readInt = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    b(readInt, z, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                    a(parcel.readInt() != 0 ? (Status) Status.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (GetBuyFlowInitializationTokenResponse) GetBuyFlowInitializationTokenResponse.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                    a(parcel.readInt() != 0 ? (Status) Status.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                    Status status = parcel.readInt() != 0 ? (Status) Status.CREATOR.createFromParcel(parcel) : null;
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    a(status, z, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 10:
                    parcel.enforceInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                    a(parcel.readInt() != 0 ? (Status) Status.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (GetClientTokenResponse) GetClientTokenResponse.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 11:
                    parcel.enforceInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                    b(parcel.readInt() != 0 ? (Status) Status.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void a(int i, Bundle bundle);

    void a(int i, FullWallet fullWallet, Bundle bundle);

    void a(int i, MaskedWallet maskedWallet, Bundle bundle);

    void a(int i, boolean z, Bundle bundle);

    void a(Status status, Bundle bundle);

    void a(Status status, GetBuyFlowInitializationTokenResponse getBuyFlowInitializationTokenResponse, Bundle bundle);

    void a(Status status, GetClientTokenResponse getClientTokenResponse, Bundle bundle);

    void a(Status status, GetInstrumentsResponse getInstrumentsResponse, Bundle bundle);

    void a(Status status, boolean z, Bundle bundle);

    void b(int i, boolean z, Bundle bundle);

    void b(Status status, Bundle bundle);
}
