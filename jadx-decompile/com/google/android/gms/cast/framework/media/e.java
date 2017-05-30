package com.google.android.gms.cast.framework.media;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.common.images.WebImage;

public interface e extends IInterface {

    public static abstract class a extends Binder implements e {

        private static class a implements e {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public int a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.media.IImagePicker");
                    this.a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public WebImage a(MediaMetadata mediaMetadata, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.media.IImagePicker");
                    if (mediaMetadata != null) {
                        obtain.writeInt(1);
                        mediaMetadata.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    WebImage webImage = obtain2.readInt() != 0 ? (WebImage) WebImage.CREATOR.createFromParcel(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return webImage;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.a;
            }

            public com.google.android.gms.c.e b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.media.IImagePicker");
                    this.a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    com.google.android.gms.c.e a = com.google.android.gms.c.e.a.a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.google.android.gms.cast.framework.media.IImagePicker");
        }

        public static e a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.IImagePicker");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof e)) ? new a(iBinder) : (e) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            IBinder iBinder = null;
            switch (i) {
                case 1:
                    MediaMetadata mediaMetadata;
                    parcel.enforceInterface("com.google.android.gms.cast.framework.media.IImagePicker");
                    if (parcel.readInt() != 0) {
                        mediaMetadata = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(parcel);
                    }
                    WebImage a = a(mediaMetadata, parcel.readInt());
                    parcel2.writeNoException();
                    if (a != null) {
                        parcel2.writeInt(1);
                        a.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.media.IImagePicker");
                    com.google.android.gms.c.e b = b();
                    parcel2.writeNoException();
                    if (b != null) {
                        iBinder = b.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.media.IImagePicker");
                    int a2 = a();
                    parcel2.writeNoException();
                    parcel2.writeInt(a2);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.cast.framework.media.IImagePicker");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    int a();

    WebImage a(MediaMetadata mediaMetadata, int i);

    com.google.android.gms.c.e b();
}
