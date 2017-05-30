package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public class ParcelableEvent extends AbstractSafeParcelable {
    public static final Creator<ParcelableEvent> CREATOR = new c();
    final int a;
    final String b;
    final String c;
    final List<String> d;
    final boolean e;
    final boolean f;
    final boolean g;
    final String h;
    final String i;
    final TextInsertedDetails j;
    final TextDeletedDetails k;
    final ValuesAddedDetails l;
    final ValuesRemovedDetails m;
    final ValuesSetDetails n;
    final ValueChangedDetails o;
    final ReferenceShiftedDetails p;
    final ObjectChangedDetails q;
    final FieldChangedDetails r;

    ParcelableEvent(int i, String str, String str2, List<String> list, boolean z, boolean z2, boolean z3, String str3, String str4, TextInsertedDetails textInsertedDetails, TextDeletedDetails textDeletedDetails, ValuesAddedDetails valuesAddedDetails, ValuesRemovedDetails valuesRemovedDetails, ValuesSetDetails valuesSetDetails, ValueChangedDetails valueChangedDetails, ReferenceShiftedDetails referenceShiftedDetails, ObjectChangedDetails objectChangedDetails, FieldChangedDetails fieldChangedDetails) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = list;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = str3;
        this.i = str4;
        this.j = textInsertedDetails;
        this.k = textDeletedDetails;
        this.l = valuesAddedDetails;
        this.m = valuesRemovedDetails;
        this.n = valuesSetDetails;
        this.o = valueChangedDetails;
        this.p = referenceShiftedDetails;
        this.q = objectChangedDetails;
        this.r = fieldChangedDetails;
    }

    public void writeToParcel(Parcel parcel, int i) {
        c.a(this, parcel, i);
    }
}
