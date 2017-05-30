package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fitness.result.GoalsResult;

public interface alb extends IInterface {

    public static abstract class a extends Binder implements alb {

        private static class a implements alb {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public void a(GoalsResult goalsResult) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoalsReadCallback");
                    if (goalsResult != null) {
                        obtain.writeInt(1);
                        goalsResult.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.a;
            }
        }

        public static alb a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoalsReadCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof alb)) ? new a(iBinder) : (alb) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoalsReadCallback");
                    a(parcel.readInt() != 0 ? (GoalsResult) GoalsResult.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.fitness.internal.IGoalsReadCallback");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void a(GoalsResult goalsResult);
}
