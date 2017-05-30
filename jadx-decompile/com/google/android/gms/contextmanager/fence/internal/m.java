package com.google.android.gms.contextmanager.fence.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface m extends IInterface {

    public static abstract class a extends Binder implements m {

        private static class a implements m {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public void a(FenceTriggerInfoImpl fenceTriggerInfoImpl) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.contextmanager.fence.internal.IContextFenceListener");
                    if (fenceTriggerInfoImpl != null) {
                        obtain.writeInt(1);
                        fenceTriggerInfoImpl.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.a;
            }
        }

        public a() {
            attachInterface(this, "com.google.android.gms.contextmanager.fence.internal.IContextFenceListener");
        }

        public static m a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.contextmanager.fence.internal.IContextFenceListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof m)) ? new a(iBinder) : (m) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.contextmanager.fence.internal.IContextFenceListener");
                    a(parcel.readInt() != 0 ? (FenceTriggerInfoImpl) FenceTriggerInfoImpl.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.contextmanager.fence.internal.IContextFenceListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void a(FenceTriggerInfoImpl fenceTriggerInfoImpl);
}
