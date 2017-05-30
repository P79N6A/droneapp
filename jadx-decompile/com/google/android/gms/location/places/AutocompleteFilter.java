package com.google.android.gms.location.places;

import android.os.Parcel;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class AutocompleteFilter extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final p CREATOR = new p();
    public static final int a = 0;
    public static final int b = 1007;
    public static final int c = 2;
    public static final int d = 34;
    public static final int e = 4;
    public static final int f = 5;
    final int g;
    final boolean h;
    final List<Integer> i;
    final String j;
    final int k;

    public static final class a {
        private boolean a = false;
        private int b = 0;
        private String c = "";

        public a a(int i) {
            this.b = i;
            return this;
        }

        public a a(String str) {
            this.c = str;
            return this;
        }

        public AutocompleteFilter a() {
            return new AutocompleteFilter(1, false, Arrays.asList(new Integer[]{Integer.valueOf(this.b)}), this.c);
        }
    }

    AutocompleteFilter(int i, boolean z, List<Integer> list, String str) {
        boolean z2 = true;
        this.g = i;
        this.i = list;
        this.k = a(list);
        this.j = str;
        if (this.g < 1) {
            if (z) {
                z2 = false;
            }
            this.h = z2;
            return;
        }
        this.h = z;
    }

    private static int a(@Nullable Collection<Integer> collection) {
        return (collection == null || collection.isEmpty()) ? 0 : ((Integer) collection.iterator().next()).intValue();
    }

    public int a() {
        return this.k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutocompleteFilter)) {
            return false;
        }
        AutocompleteFilter autocompleteFilter = (AutocompleteFilter) obj;
        return this.k == autocompleteFilter.k && this.h == autocompleteFilter.h && this.j == autocompleteFilter.j;
    }

    public int hashCode() {
        return c.a(new Object[]{Boolean.valueOf(this.h), Integer.valueOf(this.k), this.j});
    }

    public String toString() {
        return c.a(this).a("includeQueryPredictions", Boolean.valueOf(this.h)).a("typeFilter", Integer.valueOf(this.k)).a("country", this.j).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        p.a(this, parcel, i);
    }
}
