package com.google.android.gms.drive.metadata.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.internal.by;
import com.google.android.gms.drive.metadata.a;
import com.google.android.gms.internal.ajw;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class MetadataBundle extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<MetadataBundle> CREATOR = new h();
    final int a;
    final Bundle b;

    MetadataBundle(int i, Bundle bundle) {
        this.a = i;
        this.b = (Bundle) d.a(bundle);
        this.b.setClassLoader(getClass().getClassLoader());
        List<String> arrayList = new ArrayList();
        for (String str : this.b.keySet()) {
            String str2;
            if (e.a(str2) == null) {
                arrayList.add(str2);
                String str3 = "MetadataBundle";
                String str4 = "Ignored unknown metadata field in bundle: ";
                str2 = String.valueOf(str2);
                by.b(str3, str2.length() != 0 ? str4.concat(str2) : new String(str4));
            }
        }
        for (String str22 : arrayList) {
            this.b.remove(str22);
        }
    }

    private MetadataBundle(Bundle bundle) {
        this(1, bundle);
    }

    public static MetadataBundle a() {
        return new MetadataBundle(new Bundle());
    }

    public static <T> MetadataBundle a(a<T> aVar, T t) {
        MetadataBundle a = a();
        a.b(aVar, t);
        return a;
    }

    public <T> T a(a<T> aVar) {
        return aVar.a(this.b);
    }

    public void a(Context context) {
        BitmapTeleporter bitmapTeleporter = (BitmapTeleporter) a(ajw.F);
        if (bitmapTeleporter != null) {
            bitmapTeleporter.a(context.getCacheDir());
        }
    }

    public MetadataBundle b() {
        return new MetadataBundle(new Bundle(this.b));
    }

    public <T> void b(a<T> aVar, T t) {
        if (e.a(aVar.a()) == null) {
            String str = "Unregistered field: ";
            String valueOf = String.valueOf(aVar.a());
            throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
        aVar.a(t, this.b);
    }

    public boolean b(a<?> aVar) {
        return this.b.containsKey(aVar.a());
    }

    public Set<a<?>> c() {
        Set<a<?>> hashSet = new HashSet();
        for (String a : this.b.keySet()) {
            hashSet.add(e.a(a));
        }
        return hashSet;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetadataBundle)) {
            return false;
        }
        MetadataBundle metadataBundle = (MetadataBundle) obj;
        Set<String> keySet = this.b.keySet();
        if (!keySet.equals(metadataBundle.b.keySet())) {
            return false;
        }
        for (String str : keySet) {
            if (!c.a(this.b.get(str), metadataBundle.b.get(str))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (String str : this.b.keySet()) {
            i *= 31;
            i = this.b.get(str).hashCode() + i;
        }
        return i;
    }

    public String toString() {
        String valueOf = String.valueOf(this.b);
        return new StringBuilder(String.valueOf(valueOf).length() + 24).append("MetadataBundle [values=").append(valueOf).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        h.a(this, parcel, i);
    }
}
