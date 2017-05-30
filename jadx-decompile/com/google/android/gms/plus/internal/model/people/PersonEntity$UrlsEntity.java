package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import com.google.android.gms.common.f;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import com.google.android.gms.fitness.d;
import com.google.android.gms.plus.a.a.a.j;
import com.google.android.gms.plus.e;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class PersonEntity$UrlsEntity extends FastSafeParcelableJsonResponse implements j {
    public static final j CREATOR = new j();
    private static final HashMap<String, Field<?, ?>> f = new HashMap();
    final Set<Integer> a;
    final int b;
    String c;
    int d;
    String e;
    private final int g;

    static {
        f.put(e.i, Field.c(e.i, 5));
        f.put("type", Field.a("type", 6, new StringToIntConverter().a("home", 0).a("work", 1).a("blog", 2).a(f.a, 3).a(d.ad, 4).a("otherProfile", 5).a("contributor", 6).a("website", 7), false));
        f.put("value", Field.c("value", 4));
    }

    public PersonEntity$UrlsEntity() {
        this.g = 4;
        this.b = 1;
        this.a = new HashSet();
    }

    PersonEntity$UrlsEntity(Set<Integer> set, int i, String str, int i2, String str2, int i3) {
        this.g = 4;
        this.a = set;
        this.b = i;
        this.c = str;
        this.d = i2;
        this.e = str2;
    }

    public /* synthetic */ Object a() {
        return n();
    }

    protected boolean a(Field field) {
        return this.a.contains(Integer.valueOf(field.g()));
    }

    protected Object b(Field field) {
        switch (field.g()) {
            case 4:
                return this.e;
            case 5:
                return this.c;
            case 6:
                return Integer.valueOf(this.d);
            default:
                throw new IllegalStateException("Unknown safe parcelable id=" + field.g());
        }
    }

    public boolean b() {
        return true;
    }

    public /* synthetic */ Map c() {
        return f();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PersonEntity$UrlsEntity)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        PersonEntity$UrlsEntity personEntity$UrlsEntity = (PersonEntity$UrlsEntity) obj;
        for (Field field : f.values()) {
            if (a(field)) {
                if (!personEntity$UrlsEntity.a(field)) {
                    return false;
                }
                if (!b(field).equals(personEntity$UrlsEntity.b(field))) {
                    return false;
                }
            } else if (personEntity$UrlsEntity.a(field)) {
                return false;
            }
        }
        return true;
    }

    public HashMap<String, Field<?, ?>> f() {
        return f;
    }

    public String g() {
        return this.c;
    }

    public boolean h() {
        return this.a.contains(Integer.valueOf(5));
    }

    public int hashCode() {
        int i = 0;
        for (Field field : f.values()) {
            int hashCode;
            if (a(field)) {
                hashCode = b(field).hashCode() + (i + field.g());
            } else {
                hashCode = i;
            }
            i = hashCode;
        }
        return i;
    }

    @Deprecated
    public int i() {
        return 4;
    }

    public int j() {
        return this.d;
    }

    public boolean k() {
        return this.a.contains(Integer.valueOf(6));
    }

    public String l() {
        return this.e;
    }

    public boolean m() {
        return this.a.contains(Integer.valueOf(4));
    }

    public PersonEntity$UrlsEntity n() {
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        j jVar = CREATOR;
        j.a(this, parcel, i);
    }
}
