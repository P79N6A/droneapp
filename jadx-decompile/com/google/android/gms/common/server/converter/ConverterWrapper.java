package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse.a;

public class ConverterWrapper extends AbstractSafeParcelable {
    public static final a CREATOR = new a();
    private final int a;
    private final StringToIntConverter b;

    ConverterWrapper(int i, StringToIntConverter stringToIntConverter) {
        this.a = i;
        this.b = stringToIntConverter;
    }

    private ConverterWrapper(StringToIntConverter stringToIntConverter) {
        this.a = 1;
        this.b = stringToIntConverter;
    }

    public static ConverterWrapper a(a<?, ?> aVar) {
        if (aVar instanceof StringToIntConverter) {
            return new ConverterWrapper((StringToIntConverter) aVar);
        }
        throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
    }

    int a() {
        return this.a;
    }

    StringToIntConverter b() {
        return this.b;
    }

    public a<?, ?> c() {
        if (this.b != null) {
            return this.b;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }

    public void writeToParcel(Parcel parcel, int i) {
        a aVar = CREATOR;
        a.a(this, parcel, i);
    }
}
