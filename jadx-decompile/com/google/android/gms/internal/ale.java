package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fitness.request.GoalsReadRequest;

public interface ale extends IInterface {

    public static abstract class a extends Binder implements ale {

        private static class a implements ale {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public void a(GoalsReadRequest goalsReadRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitGoalsApi");
                    if (goalsReadRequest != null) {
                        obtain.writeInt(1);
                        goalsReadRequest.writeToParcel(obtain, 0);
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

        public static ale a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitGoalsApi");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ale)) ? new a(iBinder) : (ale) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitGoalsApi");
                    a(parcel.readInt() != 0 ? (GoalsReadRequest) GoalsReadRequest.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.fitness.internal.IGoogleFitGoalsApi");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void a(GoalsReadRequest goalsReadRequest);
}
