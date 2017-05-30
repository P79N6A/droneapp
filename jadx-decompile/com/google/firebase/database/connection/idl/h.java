package com.google.firebase.database.connection.idl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.c.e;
import java.util.List;

public interface h extends IInterface {

    public static abstract class a extends Binder implements h {

        private static class a implements h {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public IBinder asBinder() {
                return this.a;
            }

            public void compareAndPut(List<String> list, e eVar, String str, j jVar) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.database.connection.idl.IPersistentConnection");
                    obtain.writeStringList(list);
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    obtain.writeString(str);
                    if (jVar != null) {
                        iBinder = jVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void initialize() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.database.connection.idl.IPersistentConnection");
                    this.a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void interrupt(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.database.connection.idl.IPersistentConnection");
                    obtain.writeString(str);
                    this.a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean isInterrupted(String str) {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.database.connection.idl.IPersistentConnection");
                    obtain.writeString(str);
                    this.a.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void listen(List<String> list, e eVar, g gVar, long j, j jVar) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.database.connection.idl.IPersistentConnection");
                    obtain.writeStringList(list);
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    obtain.writeStrongBinder(gVar != null ? gVar.asBinder() : null);
                    obtain.writeLong(j);
                    if (jVar != null) {
                        iBinder = jVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void merge(List<String> list, e eVar, j jVar) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.database.connection.idl.IPersistentConnection");
                    obtain.writeStringList(list);
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    if (jVar != null) {
                        iBinder = jVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onDisconnectCancel(List<String> list, j jVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.database.connection.idl.IPersistentConnection");
                    obtain.writeStringList(list);
                    obtain.writeStrongBinder(jVar != null ? jVar.asBinder() : null);
                    this.a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onDisconnectMerge(List<String> list, e eVar, j jVar) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.database.connection.idl.IPersistentConnection");
                    obtain.writeStringList(list);
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    if (jVar != null) {
                        iBinder = jVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onDisconnectPut(List<String> list, e eVar, j jVar) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.database.connection.idl.IPersistentConnection");
                    obtain.writeStringList(list);
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    if (jVar != null) {
                        iBinder = jVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void purgeOutstandingWrites() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.database.connection.idl.IPersistentConnection");
                    this.a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void put(List<String> list, e eVar, j jVar) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.database.connection.idl.IPersistentConnection");
                    obtain.writeStringList(list);
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    if (jVar != null) {
                        iBinder = jVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void refreshAuthToken() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.database.connection.idl.IPersistentConnection");
                    this.a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void refreshAuthToken2(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.database.connection.idl.IPersistentConnection");
                    obtain.writeString(str);
                    this.a.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void resume(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.database.connection.idl.IPersistentConnection");
                    obtain.writeString(str);
                    this.a.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setup(ConnectionConfig connectionConfig, e eVar, e eVar2, i iVar) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.database.connection.idl.IPersistentConnection");
                    if (connectionConfig != null) {
                        obtain.writeInt(1);
                        connectionConfig.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    obtain.writeStrongBinder(eVar2 != null ? eVar2.asBinder() : null);
                    if (iVar != null) {
                        iBinder = iVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void shutdown() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.database.connection.idl.IPersistentConnection");
                    this.a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void unlisten(List<String> list, e eVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.database.connection.idl.IPersistentConnection");
                    obtain.writeStringList(list);
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    this.a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.google.firebase.database.connection.idl.IPersistentConnection");
        }

        public static h asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.database.connection.idl.IPersistentConnection");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof h)) ? new a(iBinder) : (h) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.firebase.database.connection.idl.IPersistentConnection");
                    setup(parcel.readInt() != 0 ? (ConnectionConfig) ConnectionConfig.CREATOR.createFromParcel(parcel) : null, com.google.firebase.database.connection.idl.e.a.a(parcel.readStrongBinder()), com.google.android.gms.c.e.a.a(parcel.readStrongBinder()), com.google.firebase.database.connection.idl.i.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.firebase.database.connection.idl.IPersistentConnection");
                    initialize();
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.firebase.database.connection.idl.IPersistentConnection");
                    shutdown();
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.firebase.database.connection.idl.IPersistentConnection");
                    refreshAuthToken();
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.firebase.database.connection.idl.IPersistentConnection");
                    listen(parcel.createStringArrayList(), com.google.android.gms.c.e.a.a(parcel.readStrongBinder()), com.google.firebase.database.connection.idl.g.a.a(parcel.readStrongBinder()), parcel.readLong(), com.google.firebase.database.connection.idl.j.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.firebase.database.connection.idl.IPersistentConnection");
                    unlisten(parcel.createStringArrayList(), com.google.android.gms.c.e.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.firebase.database.connection.idl.IPersistentConnection");
                    purgeOutstandingWrites();
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.firebase.database.connection.idl.IPersistentConnection");
                    put(parcel.createStringArrayList(), com.google.android.gms.c.e.a.a(parcel.readStrongBinder()), com.google.firebase.database.connection.idl.j.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.firebase.database.connection.idl.IPersistentConnection");
                    compareAndPut(parcel.createStringArrayList(), com.google.android.gms.c.e.a.a(parcel.readStrongBinder()), parcel.readString(), com.google.firebase.database.connection.idl.j.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 10:
                    parcel.enforceInterface("com.google.firebase.database.connection.idl.IPersistentConnection");
                    merge(parcel.createStringArrayList(), com.google.android.gms.c.e.a.a(parcel.readStrongBinder()), com.google.firebase.database.connection.idl.j.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 11:
                    parcel.enforceInterface("com.google.firebase.database.connection.idl.IPersistentConnection");
                    onDisconnectPut(parcel.createStringArrayList(), com.google.android.gms.c.e.a.a(parcel.readStrongBinder()), com.google.firebase.database.connection.idl.j.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface("com.google.firebase.database.connection.idl.IPersistentConnection");
                    onDisconnectMerge(parcel.createStringArrayList(), com.google.android.gms.c.e.a.a(parcel.readStrongBinder()), com.google.firebase.database.connection.idl.j.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 13:
                    parcel.enforceInterface("com.google.firebase.database.connection.idl.IPersistentConnection");
                    onDisconnectCancel(parcel.createStringArrayList(), com.google.firebase.database.connection.idl.j.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface("com.google.firebase.database.connection.idl.IPersistentConnection");
                    interrupt(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 15:
                    parcel.enforceInterface("com.google.firebase.database.connection.idl.IPersistentConnection");
                    resume(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 16:
                    parcel.enforceInterface("com.google.firebase.database.connection.idl.IPersistentConnection");
                    boolean isInterrupted = isInterrupted(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(isInterrupted ? 1 : 0);
                    return true;
                case 17:
                    parcel.enforceInterface("com.google.firebase.database.connection.idl.IPersistentConnection");
                    refreshAuthToken2(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.firebase.database.connection.idl.IPersistentConnection");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void compareAndPut(List<String> list, e eVar, String str, j jVar);

    void initialize();

    void interrupt(String str);

    boolean isInterrupted(String str);

    void listen(List<String> list, e eVar, g gVar, long j, j jVar);

    void merge(List<String> list, e eVar, j jVar);

    void onDisconnectCancel(List<String> list, j jVar);

    void onDisconnectMerge(List<String> list, e eVar, j jVar);

    void onDisconnectPut(List<String> list, e eVar, j jVar);

    void purgeOutstandingWrites();

    void put(List<String> list, e eVar, j jVar);

    void refreshAuthToken();

    void refreshAuthToken2(String str);

    void resume(String str);

    void setup(ConnectionConfig connectionConfig, e eVar, e eVar2, i iVar);

    void shutdown();

    void unlisten(List<String> list, e eVar);
}
