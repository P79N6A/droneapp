package com.google.android.gms.config.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import java.util.Map;

public interface i extends IInterface {

    public static abstract class a extends Binder implements i {

        private static class a implements i {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public void a(Status status) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.config.internal.IConfigCallbacks");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(Status status, FetchConfigIpcResponse fetchConfigIpcResponse) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.config.internal.IConfigCallbacks");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (fetchConfigIpcResponse != null) {
                        obtain.writeInt(1);
                        fetchConfigIpcResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(Status status, Map map) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.config.internal.IConfigCallbacks");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeMap(map);
                    this.a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(Status status, byte[] bArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.config.internal.IConfigCallbacks");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeByteArray(bArr);
                    this.a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.a;
            }
        }

        public a() {
            attachInterface(this, "com.google.android.gms.config.internal.IConfigCallbacks");
        }

        public static i a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.config.internal.IConfigCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof i)) ? new a(iBinder) : (i) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.config.internal.IConfigCallbacks");
                    a(parcel.readInt() != 0 ? (Status) Status.CREATOR.createFromParcel(parcel) : null, parcel.createByteArray());
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.config.internal.IConfigCallbacks");
                    a(parcel.readInt() != 0 ? (Status) Status.CREATOR.createFromParcel(parcel) : null, parcel.readHashMap(getClass().getClassLoader()));
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.config.internal.IConfigCallbacks");
                    a(parcel.readInt() != 0 ? (Status) Status.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.config.internal.IConfigCallbacks");
                    a(parcel.readInt() != 0 ? (Status) Status.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (FetchConfigIpcResponse) FetchConfigIpcResponse.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.config.internal.IConfigCallbacks");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void a(Status status);

    void a(Status status, FetchConfigIpcResponse fetchConfigIpcResponse);

    void a(Status status, Map map);

    void a(Status status, byte[] bArr);
}
