package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.events.ChangeEvent;
import com.google.android.gms.drive.events.ChangesAvailableEvent;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.drive.events.QueryResultEventParcelable;
import com.google.android.gms.drive.events.TransferProgressEvent;
import com.google.android.gms.drive.events.TransferStateEvent;

public class y implements Creator<OnEventResponse> {
    static void a(OnEventResponse onEventResponse, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, onEventResponse.a);
        b.a(parcel, 2, onEventResponse.b);
        b.a(parcel, 3, onEventResponse.c, i, false);
        b.a(parcel, 5, onEventResponse.d, i, false);
        b.a(parcel, 6, onEventResponse.e, i, false);
        b.a(parcel, 7, onEventResponse.f, i, false);
        b.a(parcel, 9, onEventResponse.g, i, false);
        b.a(parcel, 10, onEventResponse.h, i, false);
        b.a(parcel, a);
    }

    public OnEventResponse a(Parcel parcel) {
        int i = 0;
        TransferProgressEvent transferProgressEvent = null;
        int b = a.b(parcel);
        TransferStateEvent transferStateEvent = null;
        ChangesAvailableEvent changesAvailableEvent = null;
        QueryResultEventParcelable queryResultEventParcelable = null;
        CompletionEvent completionEvent = null;
        ChangeEvent changeEvent = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i2 = a.g(parcel, a);
                    break;
                case 2:
                    i = a.g(parcel, a);
                    break;
                case 3:
                    changeEvent = (ChangeEvent) a.a(parcel, a, ChangeEvent.CREATOR);
                    break;
                case 5:
                    completionEvent = (CompletionEvent) a.a(parcel, a, CompletionEvent.CREATOR);
                    break;
                case 6:
                    queryResultEventParcelable = (QueryResultEventParcelable) a.a(parcel, a, QueryResultEventParcelable.CREATOR);
                    break;
                case 7:
                    changesAvailableEvent = (ChangesAvailableEvent) a.a(parcel, a, ChangesAvailableEvent.CREATOR);
                    break;
                case 9:
                    transferStateEvent = (TransferStateEvent) a.a(parcel, a, TransferStateEvent.CREATOR);
                    break;
                case 10:
                    transferProgressEvent = (TransferProgressEvent) a.a(parcel, a, TransferProgressEvent.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new OnEventResponse(i2, i, changeEvent, completionEvent, queryResultEventParcelable, changesAvailableEvent, transferStateEvent, transferProgressEvent);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public OnEventResponse[] a(int i) {
        return new OnEventResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
