package com.google.android.gms.drive.query;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.metadata.e;
import com.google.android.gms.drive.query.internal.FieldWithSortOrder;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class SortOrder extends AbstractSafeParcelable {
    public static final Creator<SortOrder> CREATOR = new e();
    final List<FieldWithSortOrder> a;
    final boolean b;
    final int c;

    public static class a {
        private final List<FieldWithSortOrder> a = new ArrayList();
        private boolean b = false;

        public a a(e eVar) {
            this.a.add(new FieldWithSortOrder(eVar.a(), true));
            return this;
        }

        public SortOrder a() {
            return new SortOrder(this.a, false);
        }

        public a b(e eVar) {
            this.a.add(new FieldWithSortOrder(eVar.a(), false));
            return this;
        }
    }

    SortOrder(int i, List<FieldWithSortOrder> list, boolean z) {
        this.c = i;
        this.a = list;
        this.b = z;
    }

    private SortOrder(List<FieldWithSortOrder> list, boolean z) {
        this(1, (List) list, z);
    }

    public String toString() {
        return String.format(Locale.US, "SortOrder[%s, %s]", new Object[]{TextUtils.join(Constants.ACCEPT_TIME_SEPARATOR_SP, this.a), Boolean.valueOf(this.b)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        e.a(this, parcel, i);
    }
}
