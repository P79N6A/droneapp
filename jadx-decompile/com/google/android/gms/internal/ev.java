package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.wallet.CreateWalletObjectsRequest;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.NotifyTransactionStatusRequest;
import com.google.android.gms.wallet.firstparty.ExecuteBuyFlowRequest;
import com.google.android.gms.wallet.firstparty.GetBuyFlowInitializationTokenRequest;
import com.google.android.gms.wallet.firstparty.GetClientTokenRequest;
import com.google.android.gms.wallet.firstparty.GetInstrumentsRequest;
import com.google.android.gms.wallet.firstparty.InitializeBuyFlowRequest;

public interface ev extends IInterface {

    public static abstract class a extends Binder implements ev {

        private static class a implements ev {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public void a(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
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

            public void a(Bundle bundle, ey eyVar) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (eyVar != null) {
                        iBinder = eyVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.a.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(CreateWalletObjectsRequest createWalletObjectsRequest, Bundle bundle, ey eyVar) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    if (createWalletObjectsRequest != null) {
                        obtain.writeInt(1);
                        createWalletObjectsRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (eyVar != null) {
                        iBinder = eyVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.a.transact(6, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(FullWalletRequest fullWalletRequest, Bundle bundle, ey eyVar) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    if (fullWalletRequest != null) {
                        obtain.writeInt(1);
                        fullWalletRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (eyVar != null) {
                        iBinder = eyVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(IsReadyToPayRequest isReadyToPayRequest, Bundle bundle, ey eyVar) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    if (isReadyToPayRequest != null) {
                        obtain.writeInt(1);
                        isReadyToPayRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (eyVar != null) {
                        iBinder = eyVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.a.transact(14, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(MaskedWalletRequest maskedWalletRequest, Bundle bundle, ex exVar) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    if (maskedWalletRequest != null) {
                        obtain.writeInt(1);
                        maskedWalletRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (exVar != null) {
                        iBinder = exVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.a.transact(7, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(MaskedWalletRequest maskedWalletRequest, Bundle bundle, ey eyVar) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    if (maskedWalletRequest != null) {
                        obtain.writeInt(1);
                        maskedWalletRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (eyVar != null) {
                        iBinder = eyVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(NotifyTransactionStatusRequest notifyTransactionStatusRequest, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    if (notifyTransactionStatusRequest != null) {
                        obtain.writeInt(1);
                        notifyTransactionStatusRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
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

            public void a(ExecuteBuyFlowRequest executeBuyFlowRequest, Bundle bundle, ey eyVar) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    if (executeBuyFlowRequest != null) {
                        obtain.writeInt(1);
                        executeBuyFlowRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (eyVar != null) {
                        iBinder = eyVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.a.transact(16, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(GetBuyFlowInitializationTokenRequest getBuyFlowInitializationTokenRequest, Bundle bundle, ey eyVar) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    if (getBuyFlowInitializationTokenRequest != null) {
                        obtain.writeInt(1);
                        getBuyFlowInitializationTokenRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (eyVar != null) {
                        iBinder = eyVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.a.transact(12, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(GetClientTokenRequest getClientTokenRequest, Bundle bundle, ey eyVar) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    if (getClientTokenRequest != null) {
                        obtain.writeInt(1);
                        getClientTokenRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (eyVar != null) {
                        iBinder = eyVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.a.transact(15, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(GetInstrumentsRequest getInstrumentsRequest, Bundle bundle, ey eyVar) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    if (getInstrumentsRequest != null) {
                        obtain.writeInt(1);
                        getInstrumentsRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (eyVar != null) {
                        iBinder = eyVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.a.transact(8, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(InitializeBuyFlowRequest initializeBuyFlowRequest, Bundle bundle, ey eyVar) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    if (initializeBuyFlowRequest != null) {
                        obtain.writeInt(1);
                        initializeBuyFlowRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (eyVar != null) {
                        iBinder = eyVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.a.transact(13, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(String str, String str2, Bundle bundle, ey eyVar) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (eyVar != null) {
                        iBinder = eyVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.a;
            }

            public void b(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
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

            public void b(Bundle bundle, ey eyVar) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (eyVar != null) {
                        iBinder = eyVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.a.transact(11, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static ev a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IOwService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ev)) ? new a(iBinder) : (ev) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                    a(parcel.readInt() != 0 ? (MaskedWalletRequest) MaskedWalletRequest.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.internal.ey.a.a(parcel.readStrongBinder()));
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                    a(parcel.readInt() != 0 ? (FullWalletRequest) FullWalletRequest.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.internal.ey.a.a(parcel.readStrongBinder()));
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                    a(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.internal.ey.a.a(parcel.readStrongBinder()));
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                    a(parcel.readInt() != 0 ? (NotifyTransactionStatusRequest) NotifyTransactionStatusRequest.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                    a(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.internal.ey.a.a(parcel.readStrongBinder()));
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                    a(parcel.readInt() != 0 ? (CreateWalletObjectsRequest) CreateWalletObjectsRequest.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.internal.ey.a.a(parcel.readStrongBinder()));
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                    a(parcel.readInt() != 0 ? (MaskedWalletRequest) MaskedWalletRequest.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.internal.ex.a.a(parcel.readStrongBinder()));
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                    a(parcel.readInt() != 0 ? (GetInstrumentsRequest) GetInstrumentsRequest.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.internal.ey.a.a(parcel.readStrongBinder()));
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                    a(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 10:
                    parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                    b(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 11:
                    parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                    b(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.internal.ey.a.a(parcel.readStrongBinder()));
                    return true;
                case 12:
                    parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                    a(parcel.readInt() != 0 ? (GetBuyFlowInitializationTokenRequest) GetBuyFlowInitializationTokenRequest.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.internal.ey.a.a(parcel.readStrongBinder()));
                    return true;
                case 13:
                    parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                    a(parcel.readInt() != 0 ? (InitializeBuyFlowRequest) InitializeBuyFlowRequest.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.internal.ey.a.a(parcel.readStrongBinder()));
                    return true;
                case 14:
                    parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                    a(parcel.readInt() != 0 ? (IsReadyToPayRequest) IsReadyToPayRequest.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.internal.ey.a.a(parcel.readStrongBinder()));
                    return true;
                case 15:
                    parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                    a(parcel.readInt() != 0 ? (GetClientTokenRequest) GetClientTokenRequest.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.internal.ey.a.a(parcel.readStrongBinder()));
                    return true;
                case 16:
                    parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                    a(parcel.readInt() != 0 ? (ExecuteBuyFlowRequest) ExecuteBuyFlowRequest.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.internal.ey.a.a(parcel.readStrongBinder()));
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.wallet.internal.IOwService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void a(Bundle bundle);

    void a(Bundle bundle, ey eyVar);

    void a(CreateWalletObjectsRequest createWalletObjectsRequest, Bundle bundle, ey eyVar);

    void a(FullWalletRequest fullWalletRequest, Bundle bundle, ey eyVar);

    void a(IsReadyToPayRequest isReadyToPayRequest, Bundle bundle, ey eyVar);

    void a(MaskedWalletRequest maskedWalletRequest, Bundle bundle, ex exVar);

    void a(MaskedWalletRequest maskedWalletRequest, Bundle bundle, ey eyVar);

    void a(NotifyTransactionStatusRequest notifyTransactionStatusRequest, Bundle bundle);

    void a(ExecuteBuyFlowRequest executeBuyFlowRequest, Bundle bundle, ey eyVar);

    void a(GetBuyFlowInitializationTokenRequest getBuyFlowInitializationTokenRequest, Bundle bundle, ey eyVar);

    void a(GetClientTokenRequest getClientTokenRequest, Bundle bundle, ey eyVar);

    void a(GetInstrumentsRequest getInstrumentsRequest, Bundle bundle, ey eyVar);

    void a(InitializeBuyFlowRequest initializeBuyFlowRequest, Bundle bundle, ey eyVar);

    void a(String str, String str2, Bundle bundle, ey eyVar);

    void b(Bundle bundle);

    void b(Bundle bundle, ey eyVar);
}
