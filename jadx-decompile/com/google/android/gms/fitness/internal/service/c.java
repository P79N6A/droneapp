package com.google.android.gms.fitness.internal.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fitness.service.FitnessSensorServiceRequest;
import com.google.android.gms.internal.aky;
import com.google.android.gms.internal.alq;

public interface c extends IInterface {

    public static abstract class a extends Binder implements c {
        public a() {
            attachInterface(this, "com.google.android.gms.fitness.internal.service.IFitnessSensorService");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            FitnessUnregistrationRequest fitnessUnregistrationRequest = null;
            switch (i) {
                case 1:
                    FitnessDataSourcesRequest fitnessDataSourcesRequest;
                    parcel.enforceInterface("com.google.android.gms.fitness.internal.service.IFitnessSensorService");
                    if (parcel.readInt() != 0) {
                        fitnessDataSourcesRequest = (FitnessDataSourcesRequest) FitnessDataSourcesRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(fitnessDataSourcesRequest, com.google.android.gms.internal.aky.a.a(parcel.readStrongBinder()));
                    return true;
                case 2:
                    FitnessSensorServiceRequest fitnessSensorServiceRequest;
                    parcel.enforceInterface("com.google.android.gms.fitness.internal.service.IFitnessSensorService");
                    if (parcel.readInt() != 0) {
                        fitnessSensorServiceRequest = (FitnessSensorServiceRequest) FitnessSensorServiceRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(fitnessSensorServiceRequest, com.google.android.gms.internal.alq.a.a(parcel.readStrongBinder()));
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.fitness.internal.service.IFitnessSensorService");
                    if (parcel.readInt() != 0) {
                        fitnessUnregistrationRequest = (FitnessUnregistrationRequest) FitnessUnregistrationRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(fitnessUnregistrationRequest, com.google.android.gms.internal.alq.a.a(parcel.readStrongBinder()));
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.fitness.internal.service.IFitnessSensorService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void a(FitnessDataSourcesRequest fitnessDataSourcesRequest, aky com_google_android_gms_internal_aky);

    void a(FitnessUnregistrationRequest fitnessUnregistrationRequest, alq com_google_android_gms_internal_alq);

    void a(FitnessSensorServiceRequest fitnessSensorServiceRequest, alq com_google_android_gms_internal_alq);
}
