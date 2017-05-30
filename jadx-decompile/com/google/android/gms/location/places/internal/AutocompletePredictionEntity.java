package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import android.text.style.CharacterStyle;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.places.a;
import java.util.Collections;
import java.util.List;

public class AutocompletePredictionEntity extends AbstractSafeParcelable implements a {
    public static final Creator<AutocompletePredictionEntity> CREATOR = new a();
    private static final List<SubstringEntity> k = Collections.emptyList();
    final int a;
    final String b;
    final String c;
    final List<Integer> d;
    final List<SubstringEntity> e;
    final int f;
    final String g;
    final List<SubstringEntity> h;
    final String i;
    final List<SubstringEntity> j;

    public static class SubstringEntity extends AbstractSafeParcelable {
        public static final Creator<SubstringEntity> CREATOR = new u();
        final int a;
        final int b;
        final int c;

        public SubstringEntity(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }

        public int a() {
            return this.b;
        }

        public int b() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SubstringEntity)) {
                return false;
            }
            SubstringEntity substringEntity = (SubstringEntity) obj;
            return c.a(Integer.valueOf(this.b), Integer.valueOf(substringEntity.b)) && c.a(Integer.valueOf(this.c), Integer.valueOf(substringEntity.c));
        }

        public int hashCode() {
            return c.a(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c)});
        }

        public String toString() {
            return c.a(this).a("offset", Integer.valueOf(this.b)).a("length", Integer.valueOf(this.c)).toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            u.a(this, parcel, i);
        }
    }

    AutocompletePredictionEntity(int i, String str, List<Integer> list, int i2, String str2, List<SubstringEntity> list2, String str3, List<SubstringEntity> list3, String str4, List<SubstringEntity> list4) {
        this.a = i;
        this.c = str;
        this.d = list;
        this.f = i2;
        this.b = str2;
        this.e = list2;
        this.g = str3;
        this.h = list3;
        this.i = str4;
        this.j = list4;
    }

    public static AutocompletePredictionEntity a(String str, List<Integer> list, int i, String str2, List<SubstringEntity> list2, String str3, List<SubstringEntity> list3, String str4, List<SubstringEntity> list4) {
        return new AutocompletePredictionEntity(0, str, list, i, (String) d.a(str2), list2, str3, list3, str4, list4);
    }

    public CharSequence a(@Nullable CharacterStyle characterStyle) {
        return c.a(this.b, this.e, characterStyle);
    }

    public /* synthetic */ Object a() {
        return e();
    }

    public CharSequence b(@Nullable CharacterStyle characterStyle) {
        return c.a(this.g, this.h, characterStyle);
    }

    public boolean b() {
        return true;
    }

    public CharSequence c(@Nullable CharacterStyle characterStyle) {
        return c.a(this.i, this.j, characterStyle);
    }

    @Nullable
    public String c() {
        return this.c;
    }

    public List<Integer> d() {
        return this.d;
    }

    public a e() {
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutocompletePredictionEntity)) {
            return false;
        }
        AutocompletePredictionEntity autocompletePredictionEntity = (AutocompletePredictionEntity) obj;
        return c.a(this.c, autocompletePredictionEntity.c) && c.a(this.d, autocompletePredictionEntity.d) && c.a(Integer.valueOf(this.f), Integer.valueOf(autocompletePredictionEntity.f)) && c.a(this.b, autocompletePredictionEntity.b) && c.a(this.e, autocompletePredictionEntity.e) && c.a(this.g, autocompletePredictionEntity.g) && c.a(this.h, autocompletePredictionEntity.h) && c.a(this.i, autocompletePredictionEntity.i) && c.a(this.j, autocompletePredictionEntity.j);
    }

    public int hashCode() {
        return c.a(new Object[]{this.c, this.d, Integer.valueOf(this.f), this.b, this.e, this.g, this.h, this.i, this.j});
    }

    public String toString() {
        return c.a(this).a("placeId", this.c).a("placeTypes", this.d).a("fullText", this.b).a("fullTextMatchedSubstrings", this.e).a("primaryText", this.g).a("primaryTextMatchedSubstrings", this.h).a("secondaryText", this.i).a("secondaryTextMatchedSubstrings", this.j).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        a.a(this, parcel, i);
    }
}
