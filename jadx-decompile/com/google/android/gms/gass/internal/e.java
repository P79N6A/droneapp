package com.google.android.gms.gass.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface e extends IInterface {

    public static abstract class a extends Binder implements e {

        private static class a implements e {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public GassResponseParcel a(GassRequestParcel gassRequestParcel) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.gass.internal.IGassService");
                    if (gassRequestParcel != null) {
                        obtain.writeInt(1);
                        gassRequestParcel.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    GassResponseParcel gassResponseParcel = obtain2.readInt() != 0 ? (GassResponseParcel) GassResponseParcel.CREATOR.createFromParcel(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return gassResponseParcel;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.a;
            }
        }

        public static e a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof e)) ? new a(iBinder) : (e) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.gass.internal.IGassService");
                    GassResponseParcel a = a(parcel.readInt() != 0 ? (GassRequestParcel) GassRequestParcel.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (a != null) {
                        parcel2.writeInt(1);
                        a.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.gass.internal.IGassService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    GassResponseParcel a(GassRequestParcel gassRequestParcel);
}
