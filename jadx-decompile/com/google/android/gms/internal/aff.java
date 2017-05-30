package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.c.e;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.ad;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.cast.framework.media.f;
import com.google.android.gms.cast.framework.s;
import com.google.android.gms.cast.framework.t;
import com.google.android.gms.cast.framework.u;
import com.google.android.gms.cast.framework.y;
import com.google.android.gms.cast.framework.z;
import java.util.Map;

public interface aff extends IInterface {

    public static abstract class a extends Binder implements aff {

        private static class a implements aff {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public f a(e eVar, e eVar2, e eVar3, CastMediaOptions castMediaOptions) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    obtain.writeStrongBinder(eVar2 != null ? eVar2.asBinder() : null);
                    if (eVar3 != null) {
                        iBinder = eVar3.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (castMediaOptions != null) {
                        obtain.writeInt(1);
                        castMediaOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    f a = com.google.android.gms.cast.framework.media.f.a.a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public t a(e eVar, CastOptions castOptions, afh com_google_android_gms_internal_afh, Map map) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    if (castOptions != null) {
                        obtain.writeInt(1);
                        castOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (com_google_android_gms_internal_afh != null) {
                        iBinder = com_google_android_gms_internal_afh.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeMap(map);
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    t a = com.google.android.gms.cast.framework.t.a.a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public u a(CastOptions castOptions, e eVar, s sVar) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
                    if (castOptions != null) {
                        obtain.writeInt(1);
                        castOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    if (sVar != null) {
                        iBinder = sVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    u a = com.google.android.gms.cast.framework.u.a.a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public y a(e eVar, e eVar2, e eVar3) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    obtain.writeStrongBinder(eVar2 != null ? eVar2.asBinder() : null);
                    if (eVar3 != null) {
                        iBinder = eVar3.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    y a = com.google.android.gms.cast.framework.y.a.a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public z a(String str, String str2, ad adVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStrongBinder(adVar != null ? adVar.asBinder() : null);
                    this.a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    z a = com.google.android.gms.cast.framework.z.a.a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public afo a(e eVar, afp com_google_android_gms_internal_afp, int i, int i2, boolean z, long j, int i3, int i4, int i5) {
                IBinder iBinder = null;
                int i6 = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    if (com_google_android_gms_internal_afp != null) {
                        iBinder = com_google_android_gms_internal_afp.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    if (z) {
                        i6 = 1;
                    }
                    obtain.writeInt(i6);
                    obtain.writeLong(j);
                    obtain.writeInt(i3);
                    obtain.writeInt(i4);
                    obtain.writeInt(i5);
                    this.a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    afo a = com.google.android.gms.internal.afo.a.a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.a;
            }
        }

        public static aff a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof aff)) ? new a(iBinder) : (aff) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
                    t a = a(com.google.android.gms.c.e.a.a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (CastOptions) CastOptions.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.internal.afh.a.a(parcel.readStrongBinder()), parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a != null ? a.asBinder() : null);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
                    z a2 = a(parcel.readString(), parcel.readString(), com.google.android.gms.cast.framework.ad.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a2 != null ? a2.asBinder() : null);
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
                    u a3 = a(parcel.readInt() != 0 ? (CastOptions) CastOptions.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.c.e.a.a(parcel.readStrongBinder()), com.google.android.gms.cast.framework.s.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a3 != null ? a3.asBinder() : null);
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
                    f a4 = a(com.google.android.gms.c.e.a.a(parcel.readStrongBinder()), com.google.android.gms.c.e.a.a(parcel.readStrongBinder()), com.google.android.gms.c.e.a.a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (CastMediaOptions) CastMediaOptions.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a4 != null ? a4.asBinder() : null);
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
                    y a5 = a(com.google.android.gms.c.e.a.a(parcel.readStrongBinder()), com.google.android.gms.c.e.a.a(parcel.readStrongBinder()), com.google.android.gms.c.e.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a5 != null ? a5.asBinder() : null);
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
                    afo a6 = a(com.google.android.gms.c.e.a.a(parcel.readStrongBinder()), com.google.android.gms.internal.afp.a.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a6 != null ? a6.asBinder() : null);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    f a(e eVar, e eVar2, e eVar3, CastMediaOptions castMediaOptions);

    t a(e eVar, CastOptions castOptions, afh com_google_android_gms_internal_afh, Map map);

    u a(CastOptions castOptions, e eVar, s sVar);

    y a(e eVar, e eVar2, e eVar3);

    z a(String str, String str2, ad adVar);

    afo a(e eVar, afp com_google_android_gms_internal_afp, int i, int i2, boolean z, long j, int i3, int i4, int i5);
}
