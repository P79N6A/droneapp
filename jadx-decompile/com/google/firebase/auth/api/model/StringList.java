package com.google.firebase.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.gc;
import com.google.android.gms.internal.om;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringList extends AbstractSafeParcelable {
    public static final Creator<StringList> CREATOR = new g();
    @gc
    public final int a;
    @om(a = "values")
    private List<String> b;

    public StringList() {
        this(null);
    }

    StringList(int i, List<String> list) {
        this.a = i;
        if (list == null || list.isEmpty()) {
            this.b = Collections.emptyList();
        } else {
            this.b = Collections.unmodifiableList(list);
        }
    }

    public StringList(@Nullable List<String> list) {
        this.a = 1;
        this.b = new ArrayList();
        if (list != null && !list.isEmpty()) {
            this.b.addAll(list);
        }
    }

    public static StringList a(StringList stringList) {
        return new StringList(stringList != null ? stringList.a() : null);
    }

    public static StringList b() {
        return new StringList(null);
    }

    public List<String> a() {
        return this.b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        g.a(this, parcel, i);
    }
}
