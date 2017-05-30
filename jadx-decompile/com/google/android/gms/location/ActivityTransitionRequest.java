package com.google.android.gms.location;

import android.os.Parcel;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.internal.ClientIdentity;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class ActivityTransitionRequest extends AbstractSafeParcelable {
    public static final t CREATOR = new t();
    public static final Comparator<ActivityTransition> a = new Comparator<ActivityTransition>() {
        public int a(ActivityTransition activityTransition, ActivityTransition activityTransition2) {
            int b = activityTransition.b();
            int b2 = activityTransition2.b();
            if (b != b2) {
                return b < b2 ? -1 : 1;
            } else {
                b = activityTransition.c();
                b2 = activityTransition2.c();
                return b == b2 ? 0 : b >= b2 ? 1 : -1;
            }
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return a((ActivityTransition) obj, (ActivityTransition) obj2);
        }
    };
    private final int b;
    private final List<ActivityTransition> c;
    @Nullable
    private final String d;
    private final List<ClientIdentity> e;

    ActivityTransitionRequest(int i, List<ActivityTransition> list, @Nullable String str, @Nullable List<ClientIdentity> list2) {
        d.a(list, "transitions can't be null");
        d.b(list.size() > 0, "transitions can't be empty.");
        a(list);
        this.b = i;
        this.c = Collections.unmodifiableList(list);
        this.d = str;
        this.e = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
    }

    private static void a(List<ActivityTransition> list) {
        TreeSet treeSet = new TreeSet(a);
        for (ActivityTransition add : list) {
            d.b(treeSet.add(add), String.format("Found duplicated transition: %s.", new Object[]{add}));
        }
    }

    public int a() {
        return this.b;
    }

    public List<ActivityTransition> b() {
        return this.c;
    }

    @Nullable
    public String c() {
        return this.d;
    }

    public List<ClientIdentity> d() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) obj;
        return c.a(this.c, activityTransitionRequest.c) && c.a(this.d, activityTransitionRequest.d) && c.a(this.e, activityTransitionRequest.e);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.d != null ? this.d.hashCode() : 0) + (this.c.hashCode() * 31)) * 31;
        if (this.e != null) {
            i = this.e.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        String valueOf = String.valueOf(this.c);
        String str = this.d;
        String valueOf2 = String.valueOf(this.e);
        return new StringBuilder(((String.valueOf(valueOf).length() + 61) + String.valueOf(str).length()) + String.valueOf(valueOf2).length()).append("ActivityTransitionRequest [mTransitions=").append(valueOf).append(", mTag='").append(str).append("'").append(", mClients=").append(valueOf2).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        t.a(this, parcel, i);
    }
}
