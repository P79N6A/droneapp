package com.google.android.gms.contextmanager.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.awareness.snapshot.internal.Snapshot;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.contextmanager.fence.internal.FenceStateMapImpl;

public interface h extends IInterface {

    public static abstract class a extends Binder implements h {

        private static class a implements h {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public void a(Status status) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
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

            public void a(Status status, Snapshot snapshot) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (snapshot != null) {
                        obtain.writeInt(1);
                        snapshot.writeToParcel(obtain, 0);
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

            public void a(Status status, DataHolder dataHolder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
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

            public void a(Status status, DataHolder dataHolder, DataHolder dataHolder2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (dataHolder2 != null) {
                        obtain.writeInt(1);
                        dataHolder2.writeToParcel(obtain, 0);
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

            public void a(Status status, FenceStateMapImpl fenceStateMapImpl) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (fenceStateMapImpl != null) {
                        obtain.writeInt(1);
                        fenceStateMapImpl.writeToParcel(obtain, 0);
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

            public void a(Status status, WriteBatchImpl writeBatchImpl) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (writeBatchImpl != null) {
                        obtain.writeInt(1);
                        writeBatchImpl.writeToParcel(obtain, 0);
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

            public IBinder asBinder() {
                return this.a;
            }
        }

        public a() {
            attachInterface(this, "com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
        }

        public static h a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof h)) ? new a(iBinder) : (h) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
                    a(parcel.readInt() != 0 ? (Status) Status.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
                    a(parcel.readInt() != 0 ? (Status) Status.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (DataHolder) DataHolder.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (DataHolder) DataHolder.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
                    a(parcel.readInt() != 0 ? (Status) Status.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (WriteBatchImpl) WriteBatchImpl.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
                    a(parcel.readInt() != 0 ? (Status) Status.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (DataHolder) DataHolder.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
                    a(parcel.readInt() != 0 ? (Status) Status.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Snapshot) Snapshot.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
                    a(parcel.readInt() != 0 ? (Status) Status.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (FenceStateMapImpl) FenceStateMapImpl.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void a(Status status);

    void a(Status status, Snapshot snapshot);

    void a(Status status, DataHolder dataHolder);

    void a(Status status, DataHolder dataHolder, DataHolder dataHolder2);

    void a(Status status, FenceStateMapImpl fenceStateMapImpl);

    void a(Status status, WriteBatchImpl writeBatchImpl);
}
