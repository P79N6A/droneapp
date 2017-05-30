package com.google.android.gms.vision.text.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.c.e;
import com.google.android.gms.vision.internal.client.FrameMetadataParcel;

public interface b extends IInterface {

    public static abstract class a extends Binder implements b {

        private static class a implements b {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public void a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.vision.text.internal.client.INativeTextRecognizer");
                    this.a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public LineBoxParcel[] a(e eVar, FrameMetadataParcel frameMetadataParcel) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.vision.text.internal.client.INativeTextRecognizer");
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    if (frameMetadataParcel != null) {
                        obtain.writeInt(1);
                        frameMetadataParcel.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    LineBoxParcel[] lineBoxParcelArr = (LineBoxParcel[]) obtain2.createTypedArray(LineBoxParcel.CREATOR);
                    return lineBoxParcelArr;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public LineBoxParcel[] a(e eVar, FrameMetadataParcel frameMetadataParcel, RecognitionOptions recognitionOptions) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.vision.text.internal.client.INativeTextRecognizer");
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    if (frameMetadataParcel != null) {
                        obtain.writeInt(1);
                        frameMetadataParcel.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (recognitionOptions != null) {
                        obtain.writeInt(1);
                        recognitionOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    LineBoxParcel[] lineBoxParcelArr = (LineBoxParcel[]) obtain2.createTypedArray(LineBoxParcel.CREATOR);
                    return lineBoxParcelArr;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.a;
            }
        }

        public static b a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.vision.text.internal.client.INativeTextRecognizer");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof b)) ? new a(iBinder) : (b) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            Parcelable[] a;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.vision.text.internal.client.INativeTextRecognizer");
                    a = a(com.google.android.gms.c.e.a.a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (FrameMetadataParcel) FrameMetadataParcel.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeTypedArray(a, 1);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.vision.text.internal.client.INativeTextRecognizer");
                    a();
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.vision.text.internal.client.INativeTextRecognizer");
                    a = a(com.google.android.gms.c.e.a.a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (FrameMetadataParcel) FrameMetadataParcel.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (RecognitionOptions) RecognitionOptions.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeTypedArray(a, 1);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.vision.text.internal.client.INativeTextRecognizer");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void a();

    LineBoxParcel[] a(e eVar, FrameMetadataParcel frameMetadataParcel);

    LineBoxParcel[] a(e eVar, FrameMetadataParcel frameMetadataParcel, RecognitionOptions recognitionOptions);
}
