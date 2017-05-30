package com.google.android.gms.location.places.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.location.places.PlacePhotoMetadataResult;
import com.google.android.gms.location.places.PlacePhotoResult;

public interface h extends IInterface {

    public static abstract class a extends Binder implements h {

        private static class a implements h {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public void a(PlacePhotoMetadataResult placePhotoMetadataResult) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IPhotosCallbacks");
                    if (placePhotoMetadataResult != null) {
                        obtain.writeInt(1);
                        placePhotoMetadataResult.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(PlacePhotoResult placePhotoResult) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IPhotosCallbacks");
                    if (placePhotoResult != null) {
                        obtain.writeInt(1);
                        placePhotoResult.writeToParcel(obtain, 0);
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
        }

        public a() {
            attachInterface(this, "com.google.android.gms.location.places.internal.IPhotosCallbacks");
        }

        public static h a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.places.internal.IPhotosCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof h)) ? new a(iBinder) : (h) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            PlacePhotoResult placePhotoResult = null;
            switch (i) {
                case 2:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IPhotosCallbacks");
                    if (parcel.readInt() != 0) {
                        placePhotoResult = (PlacePhotoResult) PlacePhotoResult.CREATOR.createFromParcel(parcel);
                    }
                    a(placePhotoResult);
                    return true;
                case 3:
                    PlacePhotoMetadataResult placePhotoMetadataResult;
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IPhotosCallbacks");
                    if (parcel.readInt() != 0) {
                        placePhotoMetadataResult = (PlacePhotoMetadataResult) PlacePhotoMetadataResult.CREATOR.createFromParcel(parcel);
                    }
                    a(placePhotoMetadataResult);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.location.places.internal.IPhotosCallbacks");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void a(PlacePhotoMetadataResult placePhotoMetadataResult);

    void a(PlacePhotoResult placePhotoResult);
}
