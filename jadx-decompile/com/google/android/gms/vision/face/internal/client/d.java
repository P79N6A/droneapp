package com.google.android.gms.vision.face.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.c.e;
import com.google.android.gms.vision.internal.client.FrameMetadataParcel;

public interface d extends IInterface {

    public static abstract class a extends Binder implements d {

        private static class a implements d {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public void a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
                    this.a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean a(int i) {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
                    obtain.writeInt(i);
                    this.a.transact(2, obtain, obtain2, 0);
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

            public FaceParcel[] a(e eVar, FrameMetadataParcel frameMetadataParcel) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    if (frameMetadataParcel != null) {
                        obtain.writeInt(1);
                        frameMetadataParcel.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    FaceParcel[] faceParcelArr = (FaceParcel[]) obtain2.createTypedArray(FaceParcel.CREATOR);
                    return faceParcelArr;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.a;
            }
        }

        public static d a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof d)) ? new a(iBinder) : (d) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
                    Parcelable[] a = a(com.google.android.gms.c.e.a.a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (FrameMetadataParcel) FrameMetadataParcel.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeTypedArray(a, 1);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
                    boolean a2 = a(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(a2 ? 1 : 0);
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
                    a();
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void a();

    boolean a(int i);

    FaceParcel[] a(e eVar, FrameMetadataParcel frameMetadataParcel);
}
