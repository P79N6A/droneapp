package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface ape extends IInterface {

    public static abstract class a extends Binder implements ape {

        private static class a implements ape {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public void a(boolean z, String str) {
                int i = 1;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.tagmanager.internal.ITagManagerLoadContainerCallback");
                    if (!z) {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.a;
            }
        }

        public a() {
            attachInterface(this, "com.google.android.gms.tagmanager.internal.ITagManagerLoadContainerCallback");
        }

        public static ape a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.tagmanager.internal.ITagManagerLoadContainerCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ape)) ? new a(iBinder) : (ape) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.tagmanager.internal.ITagManagerLoadContainerCallback");
                    a(parcel.readInt() != 0, parcel.readString());
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.tagmanager.internal.ITagManagerLoadContainerCallback");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void a(boolean z, String str);
}
