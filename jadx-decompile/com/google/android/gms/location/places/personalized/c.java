package com.google.android.gms.location.places.personalized;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface c extends IInterface {

    public static abstract class a extends Binder implements c {

        private static class a implements c {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public void a(AliasedPlacesResult aliasedPlacesResult) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.personalized.IAliasedPlacesCallbacks");
                    if (aliasedPlacesResult != null) {
                        obtain.writeInt(1);
                        aliasedPlacesResult.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.a;
            }

            public void b(AliasedPlacesResult aliasedPlacesResult) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.personalized.IAliasedPlacesCallbacks");
                    if (aliasedPlacesResult != null) {
                        obtain.writeInt(1);
                        aliasedPlacesResult.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void c(AliasedPlacesResult aliasedPlacesResult) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.personalized.IAliasedPlacesCallbacks");
                    if (aliasedPlacesResult != null) {
                        obtain.writeInt(1);
                        aliasedPlacesResult.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static c a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.places.personalized.IAliasedPlacesCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof c)) ? new a(iBinder) : (c) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            AliasedPlacesResult aliasedPlacesResult = null;
            switch (i) {
                case 2:
                    parcel.enforceInterface("com.google.android.gms.location.places.personalized.IAliasedPlacesCallbacks");
                    if (parcel.readInt() != 0) {
                        aliasedPlacesResult = (AliasedPlacesResult) AliasedPlacesResult.CREATOR.createFromParcel(parcel);
                    }
                    a(aliasedPlacesResult);
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.location.places.personalized.IAliasedPlacesCallbacks");
                    if (parcel.readInt() != 0) {
                        aliasedPlacesResult = (AliasedPlacesResult) AliasedPlacesResult.CREATOR.createFromParcel(parcel);
                    }
                    b(aliasedPlacesResult);
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.location.places.personalized.IAliasedPlacesCallbacks");
                    if (parcel.readInt() != 0) {
                        aliasedPlacesResult = (AliasedPlacesResult) AliasedPlacesResult.CREATOR.createFromParcel(parcel);
                    }
                    c(aliasedPlacesResult);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.location.places.personalized.IAliasedPlacesCallbacks");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void a(AliasedPlacesResult aliasedPlacesResult);

    void b(AliasedPlacesResult aliasedPlacesResult);

    void c(AliasedPlacesResult aliasedPlacesResult);
}
