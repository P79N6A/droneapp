package com.google.android.gms.games.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface j extends IInterface {

    public static abstract class a extends Binder implements j {

        private static class a implements j {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public PopupLocationInfoParcelable a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesClient");
                    this.a.transact(1001, obtain, obtain2, 0);
                    obtain2.readException();
                    PopupLocationInfoParcelable popupLocationInfoParcelable = obtain2.readInt() != 0 ? (PopupLocationInfoParcelable) PopupLocationInfoParcelable.CREATOR.createFromParcel(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return popupLocationInfoParcelable;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.a;
            }
        }

        public a() {
            attachInterface(this, "com.google.android.gms.games.internal.IGamesClient");
        }

        public static j a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.games.internal.IGamesClient");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof j)) ? new a(iBinder) : (j) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1001:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesClient");
                    PopupLocationInfoParcelable a = a();
                    parcel2.writeNoException();
                    if (a != null) {
                        parcel2.writeInt(1);
                        a.writeToParcel(parcel2, 1);
                        return true;
                    }
                    parcel2.writeInt(0);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.games.internal.IGamesClient");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    PopupLocationInfoParcelable a();
}
