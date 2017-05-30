package com.google.android.gms.contextmanager.internal;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.awareness.snapshot.internal.SnapshotRequest;
import com.google.android.gms.contextmanager.fence.internal.FenceQueryRequestImpl;
import com.google.android.gms.contextmanager.fence.internal.FenceUpdateRequestImpl;

public interface i extends IInterface {

    public static abstract class a extends Binder implements i {

        private static class a implements i {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public void a(h hVar, String str, String str2, String str3, SnapshotRequest snapshotRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.contextmanager.internal.IContextManagerService");
                    obtain.writeStrongBinder(hVar != null ? hVar.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    if (snapshotRequest != null) {
                        obtain.writeInt(1);
                        snapshotRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(h hVar, String str, String str2, String str3, FenceQueryRequestImpl fenceQueryRequestImpl) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.contextmanager.internal.IContextManagerService");
                    obtain.writeStrongBinder(hVar != null ? hVar.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    if (fenceQueryRequestImpl != null) {
                        obtain.writeInt(1);
                        fenceQueryRequestImpl.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(h hVar, String str, String str2, String str3, FenceUpdateRequestImpl fenceUpdateRequestImpl) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.contextmanager.internal.IContextManagerService");
                    obtain.writeStrongBinder(hVar != null ? hVar.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    if (fenceUpdateRequestImpl != null) {
                        obtain.writeInt(1);
                        fenceUpdateRequestImpl.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(h hVar, String str, String str2, String str3, ContextDataFilterImpl contextDataFilterImpl) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.contextmanager.internal.IContextManagerService");
                    obtain.writeStrongBinder(hVar != null ? hVar.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    if (contextDataFilterImpl != null) {
                        obtain.writeInt(1);
                        contextDataFilterImpl.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(h hVar, String str, String str2, String str3, ContextDataFilterImpl contextDataFilterImpl, RelationFilterImpl relationFilterImpl) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.contextmanager.internal.IContextManagerService");
                    obtain.writeStrongBinder(hVar != null ? hVar.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    if (contextDataFilterImpl != null) {
                        obtain.writeInt(1);
                        contextDataFilterImpl.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (relationFilterImpl != null) {
                        obtain.writeInt(1);
                        relationFilterImpl.writeToParcel(obtain, 0);
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

            public void a(h hVar, String str, String str2, String str3, ContextDataFilterImpl contextDataFilterImpl, RelationFilterImpl relationFilterImpl, g gVar) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.contextmanager.internal.IContextManagerService");
                    obtain.writeStrongBinder(hVar != null ? hVar.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    if (contextDataFilterImpl != null) {
                        obtain.writeInt(1);
                        contextDataFilterImpl.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (relationFilterImpl != null) {
                        obtain.writeInt(1);
                        relationFilterImpl.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (gVar != null) {
                        iBinder = gVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(h hVar, String str, String str2, String str3, ContextDataFilterImpl contextDataFilterImpl, RelationFilterImpl relationFilterImpl, g gVar, PendingIntent pendingIntent) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.contextmanager.internal.IContextManagerService");
                    obtain.writeStrongBinder(hVar != null ? hVar.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    if (contextDataFilterImpl != null) {
                        obtain.writeInt(1);
                        contextDataFilterImpl.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (relationFilterImpl != null) {
                        obtain.writeInt(1);
                        relationFilterImpl.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (gVar != null) {
                        iBinder = gVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
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

            public void a(h hVar, String str, String str2, String str3, InterestUpdateBatchImpl interestUpdateBatchImpl) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.contextmanager.internal.IContextManagerService");
                    obtain.writeStrongBinder(hVar != null ? hVar.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    if (interestUpdateBatchImpl != null) {
                        obtain.writeInt(1);
                        interestUpdateBatchImpl.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(h hVar, String str, String str2, String str3, WriteBatchImpl writeBatchImpl) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.contextmanager.internal.IContextManagerService");
                    obtain.writeStrongBinder(hVar != null ? hVar.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    if (writeBatchImpl != null) {
                        obtain.writeInt(1);
                        writeBatchImpl.writeToParcel(obtain, 0);
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

            public void a(h hVar, String str, String str2, String str3, g gVar) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.contextmanager.internal.IContextManagerService");
                    obtain.writeStrongBinder(hVar != null ? hVar.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    if (gVar != null) {
                        iBinder = gVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(h hVar, String str, String str2, String str3, g gVar, PendingIntent pendingIntent) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.contextmanager.internal.IContextManagerService");
                    obtain.writeStrongBinder(hVar != null ? hVar.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    if (gVar != null) {
                        iBinder = gVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
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

            public IBinder asBinder() {
                return this.a;
            }
        }

        public static i a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.contextmanager.internal.IContextManagerService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof i)) ? new a(iBinder) : (i) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            PendingIntent pendingIntent = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.contextmanager.internal.IContextManagerService");
                    a(com.google.android.gms.contextmanager.internal.h.a.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (WriteBatchImpl) WriteBatchImpl.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.contextmanager.internal.IContextManagerService");
                    a(com.google.android.gms.contextmanager.internal.h.a.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (ContextDataFilterImpl) ContextDataFilterImpl.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (RelationFilterImpl) RelationFilterImpl.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.contextmanager.internal.IContextManagerService");
                    a(com.google.android.gms.contextmanager.internal.h.a.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (ContextDataFilterImpl) ContextDataFilterImpl.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (RelationFilterImpl) RelationFilterImpl.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.contextmanager.internal.g.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.contextmanager.internal.IContextManagerService");
                    a(com.google.android.gms.contextmanager.internal.h.a.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), com.google.android.gms.contextmanager.internal.g.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.contextmanager.internal.IContextManagerService");
                    h a = com.google.android.gms.contextmanager.internal.h.a.a(parcel.readStrongBinder());
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    ContextDataFilterImpl contextDataFilterImpl = parcel.readInt() != 0 ? (ContextDataFilterImpl) ContextDataFilterImpl.CREATOR.createFromParcel(parcel) : null;
                    RelationFilterImpl relationFilterImpl = parcel.readInt() != 0 ? (RelationFilterImpl) RelationFilterImpl.CREATOR.createFromParcel(parcel) : null;
                    g a2 = com.google.android.gms.contextmanager.internal.g.a.a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        pendingIntent = (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel);
                    }
                    a(a, readString, readString2, readString3, contextDataFilterImpl, relationFilterImpl, a2, pendingIntent);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.contextmanager.internal.IContextManagerService");
                    a(com.google.android.gms.contextmanager.internal.h.a.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), com.google.android.gms.contextmanager.internal.g.a.a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface("com.google.android.gms.contextmanager.internal.IContextManagerService");
                    a(com.google.android.gms.contextmanager.internal.h.a.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (InterestUpdateBatchImpl) InterestUpdateBatchImpl.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 13:
                    parcel.enforceInterface("com.google.android.gms.contextmanager.internal.IContextManagerService");
                    a(com.google.android.gms.contextmanager.internal.h.a.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (FenceUpdateRequestImpl) FenceUpdateRequestImpl.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface("com.google.android.gms.contextmanager.internal.IContextManagerService");
                    a(com.google.android.gms.contextmanager.internal.h.a.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (ContextDataFilterImpl) ContextDataFilterImpl.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 15:
                    parcel.enforceInterface("com.google.android.gms.contextmanager.internal.IContextManagerService");
                    a(com.google.android.gms.contextmanager.internal.h.a.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (SnapshotRequest) SnapshotRequest.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 16:
                    parcel.enforceInterface("com.google.android.gms.contextmanager.internal.IContextManagerService");
                    a(com.google.android.gms.contextmanager.internal.h.a.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (FenceQueryRequestImpl) FenceQueryRequestImpl.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.contextmanager.internal.IContextManagerService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void a(h hVar, String str, String str2, String str3, SnapshotRequest snapshotRequest);

    void a(h hVar, String str, String str2, String str3, FenceQueryRequestImpl fenceQueryRequestImpl);

    void a(h hVar, String str, String str2, String str3, FenceUpdateRequestImpl fenceUpdateRequestImpl);

    void a(h hVar, String str, String str2, String str3, ContextDataFilterImpl contextDataFilterImpl);

    void a(h hVar, String str, String str2, String str3, ContextDataFilterImpl contextDataFilterImpl, RelationFilterImpl relationFilterImpl);

    void a(h hVar, String str, String str2, String str3, ContextDataFilterImpl contextDataFilterImpl, RelationFilterImpl relationFilterImpl, g gVar);

    void a(h hVar, String str, String str2, String str3, ContextDataFilterImpl contextDataFilterImpl, RelationFilterImpl relationFilterImpl, g gVar, PendingIntent pendingIntent);

    void a(h hVar, String str, String str2, String str3, InterestUpdateBatchImpl interestUpdateBatchImpl);

    void a(h hVar, String str, String str2, String str3, WriteBatchImpl writeBatchImpl);

    void a(h hVar, String str, String str2, String str3, g gVar);

    void a(h hVar, String str, String str2, String str3, g gVar, PendingIntent pendingIntent);
}
