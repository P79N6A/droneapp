package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.metadata.CustomPropertyKey;

public class CustomProperty extends AbstractSafeParcelable {
    public static final Creator<CustomProperty> CREATOR = new c();
    final int a;
    final CustomPropertyKey b;
    final String c;

    CustomProperty(int i, CustomPropertyKey customPropertyKey, String str) {
        this.a = i;
        d.a(customPropertyKey, "key");
        this.b = customPropertyKey;
        this.c = str;
    }

    public CustomProperty(CustomPropertyKey customPropertyKey, String str) {
        this(1, customPropertyKey, str);
    }

    public CustomPropertyKey a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        CustomProperty customProperty = (CustomProperty) obj;
        return c.a(this.b, customProperty.b) && c.a(this.c, customProperty.c);
    }

    public int hashCode() {
        return c.a(new Object[]{this.b, this.c});
    }

    public void writeToParcel(Parcel parcel, int i) {
        c.a(this, parcel, i);
    }
}
