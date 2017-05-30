package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.cast.f;
import com.google.android.gms.location.places.d;
import com.google.android.gms.nearby.connection.dev.AppMetadata;

public interface u extends IInterface {

    public static abstract class a extends Binder implements u {

        private static class a implements u {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public String a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    this.a.transact(d.bi, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String a(GetLocalDeviceIdParams getLocalDeviceIdParams) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    if (getLocalDeviceIdParams != null) {
                        obtain.writeInt(1);
                        getLocalDeviceIdParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(2013, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String a(GetLocalEndpointIdParams getLocalEndpointIdParams) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    if (getLocalEndpointIdParams != null) {
                        obtain.writeInt(1);
                        getLocalEndpointIdParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(2012, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    obtain.writeLong(j);
                    this.a.transact(1002, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(AcceptConnectionRequestParams acceptConnectionRequestParams) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    if (acceptConnectionRequestParams != null) {
                        obtain.writeInt(1);
                        acceptConnectionRequestParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(f.k, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(ClientDisconnectingParams clientDisconnectingParams) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    if (clientDisconnectingParams != null) {
                        obtain.writeInt(1);
                        clientDisconnectingParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(2011, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(DisconnectFromEndpointParams disconnectFromEndpointParams) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    if (disconnectFromEndpointParams != null) {
                        obtain.writeInt(1);
                        disconnectFromEndpointParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(2009, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(RejectConnectionRequestParams rejectConnectionRequestParams) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    if (rejectConnectionRequestParams != null) {
                        obtain.writeInt(1);
                        rejectConnectionRequestParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(f.l, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(SendConnectionRequestParams sendConnectionRequestParams) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    if (sendConnectionRequestParams != null) {
                        obtain.writeInt(1);
                        sendConnectionRequestParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(f.j, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(SendPayloadParams sendPayloadParams) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    if (sendPayloadParams != null) {
                        obtain.writeInt(1);
                        sendPayloadParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(2008, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(StartAdvertisingParams startAdvertisingParams) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    if (startAdvertisingParams != null) {
                        obtain.writeInt(1);
                        startAdvertisingParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(2001, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(StartDiscoveryParams startDiscoveryParams) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    if (startDiscoveryParams != null) {
                        obtain.writeInt(1);
                        startDiscoveryParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(f.h, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(StopAdvertisingParams stopAdvertisingParams) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    if (stopAdvertisingParams != null) {
                        obtain.writeInt(1);
                        stopAdvertisingParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(2002, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(StopAllEndpointsParams stopAllEndpointsParams) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    if (stopAllEndpointsParams != null) {
                        obtain.writeInt(1);
                        stopAllEndpointsParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(2010, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(StopDiscoveryParams stopDiscoveryParams) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    if (stopDiscoveryParams != null) {
                        obtain.writeInt(1);
                        stopDiscoveryParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(f.i, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(t tVar, String str, long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    obtain.writeStrongBinder(tVar != null ? tVar.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeLong(j);
                    this.a.transact(d.bb, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(t tVar, String str, long j, long j2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    obtain.writeStrongBinder(tVar != null ? tVar.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeLong(j);
                    obtain.writeLong(j2);
                    this.a.transact(1003, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(t tVar, String str, AppMetadata appMetadata, long j, long j2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    obtain.writeStrongBinder(tVar != null ? tVar.asBinder() : null);
                    obtain.writeString(str);
                    if (appMetadata != null) {
                        obtain.writeInt(1);
                        appMetadata.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeLong(j);
                    obtain.writeLong(j2);
                    this.a.transact(1001, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(t tVar, String str, String str2, byte[] bArr, long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    obtain.writeStrongBinder(tVar != null ? tVar.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeByteArray(bArr);
                    obtain.writeLong(j);
                    this.a.transact(1007, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(t tVar, String str, byte[] bArr, long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    obtain.writeStrongBinder(tVar != null ? tVar.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeByteArray(bArr);
                    obtain.writeLong(j);
                    this.a.transact(d.ba, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(String str, long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    obtain.writeString(str);
                    obtain.writeLong(j);
                    this.a.transact(d.aW, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(String[] strArr, byte[] bArr, long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    obtain.writeStringArray(strArr);
                    obtain.writeByteArray(bArr);
                    obtain.writeLong(j);
                    this.a.transact(d.bc, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.a;
            }

            public void b(long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    obtain.writeLong(j);
                    this.a.transact(d.bf, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void b(String str, long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    obtain.writeString(str);
                    obtain.writeLong(j);
                    this.a.transact(d.be, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void b(String[] strArr, byte[] bArr, long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    obtain.writeStringArray(strArr);
                    obtain.writeByteArray(bArr);
                    obtain.writeLong(j);
                    this.a.transact(d.bd, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void c(long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    obtain.writeLong(j);
                    this.a.transact(d.bg, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String d(long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    obtain.writeLong(j);
                    this.a.transact(d.bh, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static u a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof u)) ? new a(iBinder) : (u) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            AppMetadata appMetadata = null;
            String d;
            switch (i) {
                case 1001:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    t a = com.google.android.gms.nearby.internal.connection.dev.t.a.a(parcel.readStrongBinder());
                    String readString = parcel.readString();
                    if (parcel.readInt() != 0) {
                        appMetadata = (AppMetadata) AppMetadata.CREATOR.createFromParcel(parcel);
                    }
                    a(a, readString, appMetadata, parcel.readLong(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 1002:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    a(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 1003:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    a(com.google.android.gms.nearby.internal.connection.dev.t.a.a(parcel.readStrongBinder()), parcel.readString(), parcel.readLong(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case d.aW /*1004*/:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    a(parcel.readString(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 1007:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    a(com.google.android.gms.nearby.internal.connection.dev.t.a.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.createByteArray(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case d.ba /*1008*/:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    a(com.google.android.gms.nearby.internal.connection.dev.t.a.a(parcel.readStrongBinder()), parcel.readString(), parcel.createByteArray(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case d.bb /*1009*/:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    a(com.google.android.gms.nearby.internal.connection.dev.t.a.a(parcel.readStrongBinder()), parcel.readString(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case d.bc /*1010*/:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    a(parcel.createStringArray(), parcel.createByteArray(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case d.bd /*1011*/:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    b(parcel.createStringArray(), parcel.createByteArray(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case d.be /*1012*/:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    b(parcel.readString(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case d.bf /*1013*/:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    b(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case d.bg /*1014*/:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    c(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case d.bh /*1015*/:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    d = d(parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeString(d);
                    return true;
                case d.bi /*1016*/:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    d = a();
                    parcel2.writeNoException();
                    parcel2.writeString(d);
                    return true;
                case 2001:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    a(parcel.readInt() != 0 ? (StartAdvertisingParams) StartAdvertisingParams.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 2002:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    a(parcel.readInt() != 0 ? (StopAdvertisingParams) StopAdvertisingParams.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case f.h /*2003*/:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    a(parcel.readInt() != 0 ? (StartDiscoveryParams) StartDiscoveryParams.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case f.i /*2004*/:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    a(parcel.readInt() != 0 ? (StopDiscoveryParams) StopDiscoveryParams.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case f.j /*2005*/:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    a(parcel.readInt() != 0 ? (SendConnectionRequestParams) SendConnectionRequestParams.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case f.k /*2006*/:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    a(parcel.readInt() != 0 ? (AcceptConnectionRequestParams) AcceptConnectionRequestParams.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case f.l /*2007*/:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    a(parcel.readInt() != 0 ? (RejectConnectionRequestParams) RejectConnectionRequestParams.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 2008:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    a(parcel.readInt() != 0 ? (SendPayloadParams) SendPayloadParams.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 2009:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    a(parcel.readInt() != 0 ? (DisconnectFromEndpointParams) DisconnectFromEndpointParams.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 2010:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    a(parcel.readInt() != 0 ? (StopAllEndpointsParams) StopAllEndpointsParams.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 2011:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    a(parcel.readInt() != 0 ? (ClientDisconnectingParams) ClientDisconnectingParams.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 2012:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    d = a(parcel.readInt() != 0 ? (GetLocalEndpointIdParams) GetLocalEndpointIdParams.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeString(d);
                    return true;
                case 2013:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    d = a(parcel.readInt() != 0 ? (GetLocalDeviceIdParams) GetLocalDeviceIdParams.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeString(d);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    String a();

    String a(GetLocalDeviceIdParams getLocalDeviceIdParams);

    String a(GetLocalEndpointIdParams getLocalEndpointIdParams);

    void a(long j);

    void a(AcceptConnectionRequestParams acceptConnectionRequestParams);

    void a(ClientDisconnectingParams clientDisconnectingParams);

    void a(DisconnectFromEndpointParams disconnectFromEndpointParams);

    void a(RejectConnectionRequestParams rejectConnectionRequestParams);

    void a(SendConnectionRequestParams sendConnectionRequestParams);

    void a(SendPayloadParams sendPayloadParams);

    void a(StartAdvertisingParams startAdvertisingParams);

    void a(StartDiscoveryParams startDiscoveryParams);

    void a(StopAdvertisingParams stopAdvertisingParams);

    void a(StopAllEndpointsParams stopAllEndpointsParams);

    void a(StopDiscoveryParams stopDiscoveryParams);

    void a(t tVar, String str, long j);

    void a(t tVar, String str, long j, long j2);

    void a(t tVar, String str, AppMetadata appMetadata, long j, long j2);

    void a(t tVar, String str, String str2, byte[] bArr, long j);

    void a(t tVar, String str, byte[] bArr, long j);

    void a(String str, long j);

    void a(String[] strArr, byte[] bArr, long j);

    void b(long j);

    void b(String str, long j);

    void b(String[] strArr, byte[] bArr, long j);

    void c(long j);

    String d(long j);
}
