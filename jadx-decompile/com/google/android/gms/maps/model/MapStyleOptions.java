package com.google.android.gms.maps.model;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.o;
import java.io.IOException;

public final class MapStyleOptions extends AbstractSafeParcelable {
    public static final s CREATOR = new s();
    private static final String a = MapStyleOptions.class.getSimpleName();
    private final int b;
    private String c;

    MapStyleOptions(int i, String str) {
        this.b = i;
        this.c = str;
    }

    public MapStyleOptions(String str) {
        this.b = 1;
        this.c = str;
    }

    public static MapStyleOptions a(Context context, int i) {
        try {
            return new MapStyleOptions(new String(o.a(context.getResources().openRawResource(i)), "UTF-8"));
        } catch (IOException e) {
            String valueOf = String.valueOf(e);
            throw new NotFoundException(new StringBuilder(String.valueOf(valueOf).length() + 37).append("Failed to read resource ").append(i).append(": ").append(valueOf).toString());
        }
    }

    int a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        s.a(this, parcel, i);
    }
}
