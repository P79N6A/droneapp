package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Iterator;

public class EventParams extends AbstractSafeParcelable implements Iterable<String> {
    public static final v CREATOR = new v();
    public final int a;
    private final Bundle b;

    EventParams(int i, Bundle bundle) {
        this.a = i;
        this.b = bundle;
    }

    EventParams(Bundle bundle) {
        d.a(bundle);
        this.b = bundle;
        this.a = 1;
    }

    public int a() {
        return this.b.size();
    }

    Object a(String str) {
        return this.b.get(str);
    }

    public Bundle b() {
        return new Bundle(this.b);
    }

    public Iterator<String> iterator() {
        return new Iterator<String>(this) {
            Iterator<String> a = this.b.b.keySet().iterator();
            final /* synthetic */ EventParams b;

            {
                this.b = r2;
            }

            public String a() {
                return (String) this.a.next();
            }

            public boolean hasNext() {
                return this.a.hasNext();
            }

            public /* synthetic */ Object next() {
                return a();
            }

            public void remove() {
                throw new UnsupportedOperationException("Remove not supported");
            }
        };
    }

    public String toString() {
        return this.b.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        v.a(this, parcel, i);
    }
}
