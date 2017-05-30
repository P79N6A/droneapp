package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.drive.query.Filter;
import java.util.ArrayList;
import java.util.List;

public class LogicalFilter extends AbstractFilter {
    public static final Creator<LogicalFilter> CREATOR = new k();
    final Operator a;
    final List<FilterHolder> b;
    final int c;
    private List<Filter> d;

    LogicalFilter(int i, Operator operator, List<FilterHolder> list) {
        this.c = i;
        this.a = operator;
        this.b = list;
    }

    public LogicalFilter(Operator operator, Filter filter, Filter... filterArr) {
        this.c = 1;
        this.a = operator;
        this.b = new ArrayList(filterArr.length + 1);
        this.b.add(new FilterHolder(filter));
        this.d = new ArrayList(filterArr.length + 1);
        this.d.add(filter);
        for (Filter filter2 : filterArr) {
            this.b.add(new FilterHolder(filter2));
            this.d.add(filter2);
        }
    }

    public LogicalFilter(Operator operator, Iterable<Filter> iterable) {
        this.c = 1;
        this.a = operator;
        this.d = new ArrayList();
        this.b = new ArrayList();
        for (Filter filter : iterable) {
            this.d.add(filter);
            this.b.add(new FilterHolder(filter));
        }
    }

    public <T> T a(f<T> fVar) {
        List arrayList = new ArrayList();
        for (FilterHolder a : this.b) {
            arrayList.add(a.a().a(fVar));
        }
        return fVar.a(this.a, arrayList);
    }

    public void writeToParcel(Parcel parcel, int i) {
        k.a(this, parcel, i);
    }
}
