package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.nearby.bootstrap.request.ConnectRequest;
import com.google.android.gms.nearby.bootstrap.request.ContinueConnectRequest;
import com.google.android.gms.nearby.bootstrap.request.DisableTargetRequest;
import com.google.android.gms.nearby.bootstrap.request.DisconnectRequest;
import com.google.android.gms.nearby.bootstrap.request.EnableTargetRequest;
import com.google.android.gms.nearby.bootstrap.request.SendDataRequest;
import com.google.android.gms.nearby.bootstrap.request.StartScanRequest;
import com.google.android.gms.nearby.bootstrap.request.StopScanRequest;

public interface anc extends IInterface {

    public static abstract class a extends Binder implements anc {

        private static class a implements anc {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public String a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
                    this.a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(anb com_google_android_gms_internal_anb) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
                    obtain.writeStrongBinder(com_google_android_gms_internal_anb != null ? com_google_android_gms_internal_anb.asBinder() : null);
                    this.a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(ConnectRequest connectRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
                    if (connectRequest != null) {
                        obtain.writeInt(1);
                        connectRequest.writeToParcel(obtain, 0);
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

            public void a(ContinueConnectRequest continueConnectRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
                    if (continueConnectRequest != null) {
                        obtain.writeInt(1);
                        continueConnectRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(DisableTargetRequest disableTargetRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
                    if (disableTargetRequest != null) {
                        obtain.writeInt(1);
                        disableTargetRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(DisconnectRequest disconnectRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
                    if (disconnectRequest != null) {
                        obtain.writeInt(1);
                        disconnectRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(EnableTargetRequest enableTargetRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
                    if (enableTargetRequest != null) {
                        obtain.writeInt(1);
                        enableTargetRequest.writeToParcel(obtain, 0);
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

            public void a(SendDataRequest sendDataRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
                    if (sendDataRequest != null) {
                        obtain.writeInt(1);
                        sendDataRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(StartScanRequest startScanRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
                    if (startScanRequest != null) {
                        obtain.writeInt(1);
                        startScanRequest.writeToParcel(obtain, 0);
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

            public void a(StopScanRequest stopScanRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
                    if (stopScanRequest != null) {
                        obtain.writeInt(1);
                        stopScanRequest.writeToParcel(obtain, 0);
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

        public static anc a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof anc)) ? new a(iBinder) : (anc) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            ContinueConnectRequest continueConnectRequest = null;
            switch (i) {
                case 1:
                    StartScanRequest startScanRequest;
                    parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
                    if (parcel.readInt() != 0) {
                        startScanRequest = (StartScanRequest) StartScanRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(startScanRequest);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    StopScanRequest stopScanRequest;
                    parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
                    if (parcel.readInt() != 0) {
                        stopScanRequest = (StopScanRequest) StopScanRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(stopScanRequest);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    EnableTargetRequest enableTargetRequest;
                    parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
                    if (parcel.readInt() != 0) {
                        enableTargetRequest = (EnableTargetRequest) EnableTargetRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(enableTargetRequest);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    DisableTargetRequest disableTargetRequest;
                    parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
                    if (parcel.readInt() != 0) {
                        disableTargetRequest = (DisableTargetRequest) DisableTargetRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(disableTargetRequest);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    ConnectRequest connectRequest;
                    parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
                    if (parcel.readInt() != 0) {
                        connectRequest = (ConnectRequest) ConnectRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(connectRequest);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    DisconnectRequest disconnectRequest;
                    parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
                    if (parcel.readInt() != 0) {
                        disconnectRequest = (DisconnectRequest) DisconnectRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(disconnectRequest);
                    parcel2.writeNoException();
                    return true;
                case 7:
                    SendDataRequest sendDataRequest;
                    parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
                    if (parcel.readInt() != 0) {
                        sendDataRequest = (SendDataRequest) SendDataRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(sendDataRequest);
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
                    if (parcel.readInt() != 0) {
                        continueConnectRequest = (ContinueConnectRequest) ContinueConnectRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(continueConnectRequest);
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
                    String a = a();
                    parcel2.writeNoException();
                    parcel2.writeString(a);
                    return true;
                case 10:
                    parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
                    a(com.google.android.gms.internal.anb.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    String a();

    void a(anb com_google_android_gms_internal_anb);

    void a(ConnectRequest connectRequest);

    void a(ContinueConnectRequest continueConnectRequest);

    void a(DisableTargetRequest disableTargetRequest);

    void a(DisconnectRequest disconnectRequest);

    void a(EnableTargetRequest enableTargetRequest);

    void a(SendDataRequest sendDataRequest);

    void a(StartScanRequest startScanRequest);

    void a(StopScanRequest stopScanRequest);
}
