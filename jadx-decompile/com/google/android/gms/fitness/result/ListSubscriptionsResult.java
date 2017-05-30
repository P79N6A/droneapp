package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Subscription;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSubscriptionsResult extends AbstractSafeParcelable implements m {
    public static final Creator<ListSubscriptionsResult> CREATOR = new j();
    private final int a;
    private final List<Subscription> b;
    private final Status c;

    ListSubscriptionsResult(int i, List<Subscription> list, Status status) {
        this.a = i;
        this.b = list;
        this.c = status;
    }

    public ListSubscriptionsResult(List<Subscription> list, Status status) {
        this.a = 3;
        this.b = Collections.unmodifiableList(list);
        this.c = (Status) d.a(status, "status");
    }

    public static ListSubscriptionsResult a(Status status) {
        return new ListSubscriptionsResult(Collections.emptyList(), status);
    }

    private boolean a(ListSubscriptionsResult listSubscriptionsResult) {
        return this.c.equals(listSubscriptionsResult.c) && c.a(this.b, listSubscriptionsResult.b);
    }

    public Status a() {
        return this.c;
    }

    public List<Subscription> a(DataType dataType) {
        List arrayList = new ArrayList();
        for (Subscription subscription : this.b) {
            if (dataType.equals(subscription.f())) {
                arrayList.add(subscription);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public List<Subscription> b() {
        return this.b;
    }

    int c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ListSubscriptionsResult) && a((ListSubscriptionsResult) obj));
    }

    public int hashCode() {
        return c.a(new Object[]{this.c, this.b});
    }

    public String toString() {
        return c.a(this).a("status", this.c).a("subscriptions", this.b).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        j.a(this, parcel, i);
    }
}
