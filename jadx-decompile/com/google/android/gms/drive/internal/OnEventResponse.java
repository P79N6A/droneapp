package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.events.ChangeEvent;
import com.google.android.gms.drive.events.ChangesAvailableEvent;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.drive.events.DriveEvent;
import com.google.android.gms.drive.events.QueryResultEventParcelable;
import com.google.android.gms.drive.events.TransferProgressEvent;
import com.google.android.gms.drive.events.TransferStateEvent;

public class OnEventResponse extends AbstractSafeParcelable {
    public static final Creator<OnEventResponse> CREATOR = new y();
    final int a;
    final int b;
    final ChangeEvent c;
    final CompletionEvent d;
    final QueryResultEventParcelable e;
    final ChangesAvailableEvent f;
    final TransferStateEvent g;
    final TransferProgressEvent h;

    OnEventResponse(int i, int i2, ChangeEvent changeEvent, CompletionEvent completionEvent, QueryResultEventParcelable queryResultEventParcelable, ChangesAvailableEvent changesAvailableEvent, TransferStateEvent transferStateEvent, TransferProgressEvent transferProgressEvent) {
        this.a = i;
        this.b = i2;
        this.c = changeEvent;
        this.d = completionEvent;
        this.e = queryResultEventParcelable;
        this.f = changesAvailableEvent;
        this.g = transferStateEvent;
        this.h = transferProgressEvent;
    }

    public DriveEvent a() {
        switch (this.b) {
            case 1:
                return this.c;
            case 2:
                return this.d;
            case 3:
                return this.e;
            case 4:
                return this.f;
            case 7:
                return this.g;
            case 8:
                return this.h;
            default:
                throw new IllegalStateException("Unexpected event type " + this.b);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        y.a(this, parcel, i);
    }
}
