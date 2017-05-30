package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.c.e;

public interface ni extends IInterface {

    public static abstract class a extends Binder implements ni {

        private static class a implements ni {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public nh a(Uri uri, e eVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequestFactory");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    nh a = com.google.android.gms.internal.nh.a.a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public nh a(Uri uri, e eVar, long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequestFactory");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    obtain.writeLong(j);
                    this.a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    nh a = com.google.android.gms.internal.nh.a.a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public nh a(Uri uri, e eVar, e eVar2) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequestFactory");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    if (eVar2 != null) {
                        iBinder = eVar2.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    nh a = com.google.android.gms.internal.nh.a.a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public nh a(Uri uri, e eVar, e eVar2, String str) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequestFactory");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    if (eVar2 != null) {
                        iBinder = eVar2.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeString(str);
                    this.a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    nh a = com.google.android.gms.internal.nh.a.a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public nh a(Uri uri, e eVar, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequestFactory");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    obtain.writeString(str);
                    this.a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    nh a = com.google.android.gms.internal.nh.a.a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public nh a(Uri uri, e eVar, String str, e eVar2, long j, int i, boolean z) {
                IBinder iBinder = null;
                int i2 = 1;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequestFactory");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    obtain.writeString(str);
                    if (eVar2 != null) {
                        iBinder = eVar2.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeLong(j);
                    obtain.writeInt(i);
                    if (!z) {
                        i2 = 0;
                    }
                    obtain.writeInt(i2);
                    this.a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    nh a = com.google.android.gms.internal.nh.a.a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequestFactory");
                    this.a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String a(Uri uri) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequestFactory");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.a;
            }

            public nh b(Uri uri, e eVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequestFactory");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    this.a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    nh a = com.google.android.gms.internal.nh.a.a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public nh b(Uri uri, e eVar, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequestFactory");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    obtain.writeString(str);
                    this.a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    nh a = com.google.android.gms.internal.nh.a.a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String b(Uri uri) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequestFactory");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public nh c(Uri uri, e eVar, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequestFactory");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    obtain.writeString(str);
                    this.a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    nh a = com.google.android.gms.internal.nh.a.a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static ni a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.storage.network.INetworkRequestFactory");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ni)) ? new a(iBinder) : (ni) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            nh a;
            String a2;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequestFactory");
                    a = a(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.c.e.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a != null ? a.asBinder() : null);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequestFactory");
                    a = b(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.c.e.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a != null ? a.asBinder() : null);
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequestFactory");
                    a = a(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.c.e.a.a(parcel.readStrongBinder()), parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a != null ? a.asBinder() : null);
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequestFactory");
                    a = a(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.c.e.a.a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a != null ? a.asBinder() : null);
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequestFactory");
                    a = a(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.c.e.a.a(parcel.readStrongBinder()), parcel.readString(), com.google.android.gms.c.e.a.a(parcel.readStrongBinder()), parcel.readLong(), parcel.readInt(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a != null ? a.asBinder() : null);
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequestFactory");
                    a = b(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.c.e.a.a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a != null ? a.asBinder() : null);
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequestFactory");
                    a = c(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.c.e.a.a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a != null ? a.asBinder() : null);
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequestFactory");
                    a = a(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.c.e.a.a(parcel.readStrongBinder()), com.google.android.gms.c.e.a.a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a != null ? a.asBinder() : null);
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequestFactory");
                    a = a(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.c.e.a.a(parcel.readStrongBinder()), com.google.android.gms.c.e.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a != null ? a.asBinder() : null);
                    return true;
                case 10:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequestFactory");
                    a2 = a();
                    parcel2.writeNoException();
                    parcel2.writeString(a2);
                    return true;
                case 11:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequestFactory");
                    a2 = a(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeString(a2);
                    return true;
                case 12:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequestFactory");
                    a2 = b(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeString(a2);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.firebase.storage.network.INetworkRequestFactory");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    nh a(Uri uri, e eVar);

    nh a(Uri uri, e eVar, long j);

    nh a(Uri uri, e eVar, e eVar2);

    nh a(Uri uri, e eVar, e eVar2, String str);

    nh a(Uri uri, e eVar, String str);

    nh a(Uri uri, e eVar, String str, e eVar2, long j, int i, boolean z);

    String a();

    String a(Uri uri);

    nh b(Uri uri, e eVar);

    nh b(Uri uri, e eVar, String str);

    String b(Uri uri);

    nh c(Uri uri, e eVar, String str);
}
