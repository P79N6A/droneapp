package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.List;

public class c implements Creator<ParcelableEvent> {
    static void a(ParcelableEvent parcelableEvent, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, parcelableEvent.a);
        b.a(parcel, 2, parcelableEvent.b, false);
        b.a(parcel, 3, parcelableEvent.c, false);
        b.b(parcel, 4, parcelableEvent.d, false);
        b.a(parcel, 5, parcelableEvent.e);
        b.a(parcel, 6, parcelableEvent.h, false);
        b.a(parcel, 7, parcelableEvent.i, false);
        b.a(parcel, 8, parcelableEvent.j, i, false);
        b.a(parcel, 9, parcelableEvent.k, i, false);
        b.a(parcel, 10, parcelableEvent.l, i, false);
        b.a(parcel, 11, parcelableEvent.m, i, false);
        b.a(parcel, 12, parcelableEvent.n, i, false);
        b.a(parcel, 13, parcelableEvent.o, i, false);
        b.a(parcel, 14, parcelableEvent.p, i, false);
        b.a(parcel, 15, parcelableEvent.q, i, false);
        b.a(parcel, 16, parcelableEvent.f);
        b.a(parcel, 17, parcelableEvent.g);
        b.a(parcel, 18, parcelableEvent.r, i, false);
        b.a(parcel, a);
    }

    public ParcelableEvent a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        List list = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        String str3 = null;
        String str4 = null;
        TextInsertedDetails textInsertedDetails = null;
        TextDeletedDetails textDeletedDetails = null;
        ValuesAddedDetails valuesAddedDetails = null;
        ValuesRemovedDetails valuesRemovedDetails = null;
        ValuesSetDetails valuesSetDetails = null;
        ValueChangedDetails valueChangedDetails = null;
        ReferenceShiftedDetails referenceShiftedDetails = null;
        ObjectChangedDetails objectChangedDetails = null;
        FieldChangedDetails fieldChangedDetails = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    str = a.q(parcel, a);
                    break;
                case 3:
                    str2 = a.q(parcel, a);
                    break;
                case 4:
                    list = a.E(parcel, a);
                    break;
                case 5:
                    z = a.c(parcel, a);
                    break;
                case 6:
                    str3 = a.q(parcel, a);
                    break;
                case 7:
                    str4 = a.q(parcel, a);
                    break;
                case 8:
                    textInsertedDetails = (TextInsertedDetails) a.a(parcel, a, TextInsertedDetails.CREATOR);
                    break;
                case 9:
                    textDeletedDetails = (TextDeletedDetails) a.a(parcel, a, TextDeletedDetails.CREATOR);
                    break;
                case 10:
                    valuesAddedDetails = (ValuesAddedDetails) a.a(parcel, a, ValuesAddedDetails.CREATOR);
                    break;
                case 11:
                    valuesRemovedDetails = (ValuesRemovedDetails) a.a(parcel, a, ValuesRemovedDetails.CREATOR);
                    break;
                case 12:
                    valuesSetDetails = (ValuesSetDetails) a.a(parcel, a, ValuesSetDetails.CREATOR);
                    break;
                case 13:
                    valueChangedDetails = (ValueChangedDetails) a.a(parcel, a, ValueChangedDetails.CREATOR);
                    break;
                case 14:
                    referenceShiftedDetails = (ReferenceShiftedDetails) a.a(parcel, a, ReferenceShiftedDetails.CREATOR);
                    break;
                case 15:
                    objectChangedDetails = (ObjectChangedDetails) a.a(parcel, a, ObjectChangedDetails.CREATOR);
                    break;
                case 16:
                    z2 = a.c(parcel, a);
                    break;
                case 17:
                    z3 = a.c(parcel, a);
                    break;
                case 18:
                    fieldChangedDetails = (FieldChangedDetails) a.a(parcel, a, FieldChangedDetails.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ParcelableEvent(i, str, str2, list, z, z2, z3, str3, str4, textInsertedDetails, textDeletedDetails, valuesAddedDetails, valuesRemovedDetails, valuesSetDetails, valueChangedDetails, referenceShiftedDetails, objectChangedDetails, fieldChangedDetails);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public ParcelableEvent[] a(int i) {
        return new ParcelableEvent[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
