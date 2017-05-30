package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.metadata.CustomPropertyKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class AppVisibleCustomProperties extends AbstractSafeParcelable implements ReflectedParcelable, Iterable<CustomProperty> {
    public static final Creator<AppVisibleCustomProperties> CREATOR = new a();
    public static final AppVisibleCustomProperties a = new a().a();
    final int b;
    final List<CustomProperty> c;

    public static class a {
        private final Map<CustomPropertyKey, CustomProperty> a = new HashMap();

        public a a(CustomPropertyKey customPropertyKey, String str) {
            d.a(customPropertyKey, "key");
            this.a.put(customPropertyKey, new CustomProperty(customPropertyKey, str));
            return this;
        }

        public a a(CustomProperty customProperty) {
            d.a(customProperty, "property");
            this.a.put(customProperty.a(), customProperty);
            return this;
        }

        public AppVisibleCustomProperties a() {
            return new AppVisibleCustomProperties(this.a.values());
        }
    }

    AppVisibleCustomProperties(int i, Collection<CustomProperty> collection) {
        this.b = i;
        d.a(collection);
        this.c = new ArrayList(collection);
    }

    private AppVisibleCustomProperties(Collection<CustomProperty> collection) {
        this(1, (Collection) collection);
    }

    public Map<CustomPropertyKey, String> a() {
        Map hashMap = new HashMap(this.c.size());
        for (CustomProperty customProperty : this.c) {
            hashMap.put(customProperty.a(), customProperty.b());
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public boolean equals(Object obj) {
        return this == obj ? true : (obj == null || obj.getClass() != getClass()) ? false : a().equals(((AppVisibleCustomProperties) obj).a());
    }

    public int hashCode() {
        return c.a(new Object[]{this.c});
    }

    public Iterator<CustomProperty> iterator() {
        return this.c.iterator();
    }

    public void writeToParcel(Parcel parcel, int i) {
        a.a(this, parcel, i);
    }
}
