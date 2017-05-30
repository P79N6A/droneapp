package com.google.firebase.appindexing.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.appindexing.g;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Set;

public final class Thing extends AbstractSafeParcelable implements ReflectedParcelable, g {
    public static final Creator<Thing> CREATOR = new j();
    public final int h;
    private final Bundle i;
    private final Metadata j;
    private final String k;
    private final String l;

    public static class Metadata extends AbstractSafeParcelable {
        public static final Creator<Metadata> CREATOR = new h();
        public final int a;
        private final boolean b;
        private int c;
        private String d;

        Metadata(int i, boolean z, int i2, String str) {
            this.a = i;
            this.b = z;
            this.c = i2;
            this.d = str;
        }

        public Metadata(boolean z, int i, String str) {
            this.a = 1;
            this.b = z;
            this.c = i;
            this.d = str;
        }

        public boolean a() {
            return this.b;
        }

        public int b() {
            return this.c;
        }

        public String c() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Metadata)) {
                return false;
            }
            Metadata metadata = (Metadata) obj;
            return c.a(Boolean.valueOf(this.b), Boolean.valueOf(metadata.b)) && c.a(Integer.valueOf(this.c), Integer.valueOf(metadata.c)) && c.a(this.d, metadata.d);
        }

        public int hashCode() {
            return c.a(new Object[]{Boolean.valueOf(this.b), Integer.valueOf(this.c), this.d});
        }

        public String toString() {
            String str = "";
            if (!c().isEmpty()) {
                String str2 = ", accountEmail: ";
                str = String.valueOf(c());
                str = str.length() != 0 ? str2.concat(str) : new String(str2);
            }
            return new StringBuilder(String.valueOf(str).length() + 39).append("worksOffline: ").append(a()).append(", score: ").append(b()).append(str).toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            h.a(this, parcel, i);
        }
    }

    public Thing(int i, Bundle bundle, Metadata metadata, String str, String str2) {
        this.h = i;
        this.i = bundle;
        this.j = metadata;
        this.k = str;
        this.l = str2;
        this.i.setClassLoader(getClass().getClassLoader());
    }

    public Thing(@NonNull Bundle bundle, @NonNull Metadata metadata, String str, @NonNull String str2) {
        this.h = 6;
        this.i = bundle;
        this.j = metadata;
        this.k = str;
        this.l = str2;
    }

    public int a() {
        return this.h;
    }

    public Bundle b() {
        return this.i;
    }

    public Metadata c() {
        return this.j;
    }

    public String d() {
        return this.k;
    }

    public String e() {
        return this.l;
    }

    public String f() {
        return this.l.equals("Thing") ? "Indexable" : this.l;
    }

    public String toString() {
        String str;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(f()).append(" { ");
        StringBuilder append = stringBuilder.append("{ id: ");
        if (d() == null) {
            str = "<null> } ";
        } else {
            str = String.valueOf(d());
            str = new StringBuilder(String.valueOf(str).length() + 5).append("'").append(str).append("' } ").toString();
        }
        append.append(str);
        stringBuilder.append("Properties { ");
        Set keySet = this.i.keySet();
        String[] strArr = (String[]) keySet.toArray(new String[keySet.size()]);
        Arrays.sort(strArr);
        for (String str2 : strArr) {
            stringBuilder.append("{ key: '").append(str2).append("' value: ");
            Object obj = this.i.get(str2);
            if (obj == null) {
                stringBuilder.append("<null>");
            } else if (obj.getClass().isArray()) {
                stringBuilder.append("[ ");
                for (int i = 0; i < Array.getLength(obj); i++) {
                    stringBuilder.append("'").append(Array.get(obj, i)).append("' ");
                }
                stringBuilder.append("]");
            } else {
                stringBuilder.append(obj.toString());
            }
            stringBuilder.append(" } ");
        }
        stringBuilder.append("} ");
        stringBuilder.append("Metadata { ");
        stringBuilder.append(this.j.toString());
        stringBuilder.append(" } ");
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        j.a(this, parcel, i);
    }
}
