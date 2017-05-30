package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;

public final class IsReadyToPayRequest extends AbstractSafeParcelable {
    public static final Creator<IsReadyToPayRequest> CREATOR = new n();
    final int a;
    ArrayList<Integer> b;

    public final class a {
        final /* synthetic */ IsReadyToPayRequest a;

        private a(IsReadyToPayRequest isReadyToPayRequest) {
            this.a = isReadyToPayRequest;
        }

        public a a(int i) {
            if (this.a.b == null) {
                this.a.b = new ArrayList();
            }
            this.a.b.add(Integer.valueOf(i));
            return this;
        }

        public IsReadyToPayRequest a() {
            return this.a;
        }
    }

    IsReadyToPayRequest() {
        this.a = 1;
    }

    IsReadyToPayRequest(int i, ArrayList<Integer> arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    public static a c() {
        IsReadyToPayRequest isReadyToPayRequest = new IsReadyToPayRequest();
        isReadyToPayRequest.getClass();
        return new a();
    }

    public int a() {
        return this.a;
    }

    public ArrayList<Integer> b() {
        return this.b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        n.a(this, parcel, i);
    }
}
