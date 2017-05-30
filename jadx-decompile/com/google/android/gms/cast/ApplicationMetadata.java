package com.google.android.gms.cast;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.internal.f;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ApplicationMetadata extends AbstractSafeParcelable {
    public static final Creator<ApplicationMetadata> CREATOR = new i();
    String a;
    String b;
    List<WebImage> c;
    List<String> d;
    String e;
    Uri f;
    private final int g;

    private ApplicationMetadata() {
        this.g = 1;
        this.c = new ArrayList();
        this.d = new ArrayList();
    }

    ApplicationMetadata(int i, String str, String str2, List<WebImage> list, List<String> list2, String str3, Uri uri) {
        this.g = i;
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = list2;
        this.e = str3;
        this.f = uri;
    }

    int a() {
        return this.g;
    }

    public boolean a(String str) {
        return this.d != null && this.d.contains(str);
    }

    public boolean a(List<String> list) {
        return this.d != null && this.d.containsAll(list);
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public List<String> d() {
        return Collections.unmodifiableList(this.d);
    }

    public String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ApplicationMetadata)) {
            return false;
        }
        ApplicationMetadata applicationMetadata = (ApplicationMetadata) obj;
        return f.a(this.a, applicationMetadata.a) && f.a(this.c, applicationMetadata.c) && f.a(this.b, applicationMetadata.b) && f.a(this.d, applicationMetadata.d) && f.a(this.e, applicationMetadata.e) && f.a(this.f, applicationMetadata.f);
    }

    public Uri f() {
        return this.f;
    }

    public List<WebImage> g() {
        return this.c;
    }

    public int hashCode() {
        return c.a(Integer.valueOf(this.g), this.a, this.b, this.c, this.d, this.e, this.f);
    }

    public String toString() {
        int i = 0;
        StringBuilder append = new StringBuilder().append("applicationId: ").append(this.a).append(", name: ").append(this.b).append(", images.count: ").append(this.c == null ? 0 : this.c.size()).append(", namespaces.count: ");
        if (this.d != null) {
            i = this.d.size();
        }
        return append.append(i).append(", senderAppIdentifier: ").append(this.e).append(", senderAppLaunchUrl: ").append(this.f).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.a(this, parcel, i);
    }
}
