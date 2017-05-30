package com.google.android.gms.config.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.phenotype.Configuration;
import java.util.List;

public interface j extends IInterface {

    public static abstract class a extends Binder implements j {

        private static class a implements j {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public void a(i iVar, FetchConfigIpcRequest fetchConfigIpcRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.config.internal.IConfigService");
                    obtain.writeStrongBinder(iVar != null ? iVar.asBinder() : null);
                    if (fetchConfigIpcRequest != null) {
                        obtain.writeInt(1);
                        fetchConfigIpcRequest.writeToParcel(obtain, 0);
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

            public void a(i iVar, String str, Configuration configuration, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.config.internal.IConfigService");
                    obtain.writeStrongBinder(iVar != null ? iVar.asBinder() : null);
                    obtain.writeString(str);
                    if (configuration != null) {
                        obtain.writeInt(1);
                        configuration.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str2);
                    this.a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(i iVar, String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.config.internal.IConfigService");
                    obtain.writeStrongBinder(iVar != null ? iVar.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(i iVar, String str, List list) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.config.internal.IConfigService");
                    obtain.writeStrongBinder(iVar != null ? iVar.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeList(list);
                    this.a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.a;
            }

            public void b(i iVar, String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.config.internal.IConfigService");
                    obtain.writeStrongBinder(iVar != null ? iVar.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static j a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.config.internal.IConfigService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof j)) ? new a(iBinder) : (j) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            FetchConfigIpcRequest fetchConfigIpcRequest = null;
            i a;
            switch (i) {
                case 4:
                    parcel.enforceInterface("com.google.android.gms.config.internal.IConfigService");
                    a(com.google.android.gms.config.internal.i.a.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.config.internal.IConfigService");
                    b(com.google.android.gms.config.internal.i.a.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.config.internal.IConfigService");
                    a(com.google.android.gms.config.internal.i.a.a(parcel.readStrongBinder()), parcel.readString(), parcel.readArrayList(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    return true;
                case 7:
                    Configuration configuration;
                    parcel.enforceInterface("com.google.android.gms.config.internal.IConfigService");
                    a = com.google.android.gms.config.internal.i.a.a(parcel.readStrongBinder());
                    String readString = parcel.readString();
                    if (parcel.readInt() != 0) {
                        configuration = (Configuration) Configuration.CREATOR.createFromParcel(parcel);
                    }
                    a(a, readString, configuration, parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.android.gms.config.internal.IConfigService");
                    a = com.google.android.gms.config.internal.i.a.a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        fetchConfigIpcRequest = (FetchConfigIpcRequest) FetchConfigIpcRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(a, fetchConfigIpcRequest);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.config.internal.IConfigService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void a(i iVar, FetchConfigIpcRequest fetchConfigIpcRequest);

    void a(i iVar, String str, Configuration configuration, String str2);

    void a(i iVar, String str, String str2);

    void a(i iVar, String str, List list);

    void b(i iVar, String str, String str2);
}
