package com.google.android.gms.cast.framework;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.cast.internal.f;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CastOptions extends AbstractSafeParcelable {
    public static final Creator<CastOptions> CREATOR = new o();
    private final int a;
    private final String b;
    private final List<String> c;
    private final boolean d;
    private final LaunchOptions e;
    private final boolean f;
    private final CastMediaOptions g;
    private final boolean h;
    private final double i;

    public static final class a {
        private String a;
        private List<String> b = new ArrayList();
        private boolean c;
        private LaunchOptions d = new LaunchOptions();
        private boolean e = true;
        private CastMediaOptions f = new com.google.android.gms.cast.framework.media.CastMediaOptions.a().a();
        private boolean g = true;
        private double h = 0.05000000074505806d;

        public a a(double d) {
            if (d <= 0.0d || d > 0.5d) {
                throw new IllegalArgumentException("volumeDelta must be greater than 0 and less or equal to 0.5");
            }
            this.h = d;
            return this;
        }

        public a a(LaunchOptions launchOptions) {
            this.d = launchOptions;
            return this;
        }

        public a a(CastMediaOptions castMediaOptions) {
            this.f = castMediaOptions;
            return this;
        }

        public a a(String str) {
            this.a = str;
            return this;
        }

        public a a(List<String> list) {
            this.b = list;
            return this;
        }

        public a a(boolean z) {
            this.c = z;
            return this;
        }

        public CastOptions a() {
            return new CastOptions(1, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        }

        public a b(boolean z) {
            this.e = z;
            return this;
        }

        public a c(boolean z) {
            this.g = z;
            return this;
        }
    }

    CastOptions(int i, String str, List<String> list, boolean z, LaunchOptions launchOptions, boolean z2, CastMediaOptions castMediaOptions, boolean z3, double d) {
        this.a = i;
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        this.b = str;
        int size = list == null ? 0 : list.size();
        this.c = new ArrayList(size);
        if (size > 0) {
            this.c.addAll(list);
        }
        this.d = z;
        if (launchOptions == null) {
            launchOptions = new LaunchOptions();
        }
        this.e = launchOptions;
        this.f = z2;
        this.g = castMediaOptions;
        this.h = z3;
        this.i = d;
    }

    int a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public List<String> c() {
        return Collections.unmodifiableList(this.c);
    }

    public boolean d() {
        return this.d;
    }

    public LaunchOptions e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CastOptions)) {
            return false;
        }
        CastOptions castOptions = (CastOptions) obj;
        return f.a(this.b, castOptions.b) && f.a(this.c, castOptions.c) && this.d == castOptions.d && f.a(this.e, castOptions.e) && this.f == castOptions.f && f.a(this.g, castOptions.g) && this.h == castOptions.h() && this.i == castOptions.i();
    }

    public boolean f() {
        return this.f;
    }

    public CastMediaOptions g() {
        return this.g;
    }

    public boolean h() {
        return this.h;
    }

    public int hashCode() {
        return c.a(this.b, this.c, Boolean.valueOf(this.d), this.e, Boolean.valueOf(this.f), this.g, Boolean.valueOf(this.h), Double.valueOf(this.i));
    }

    public double i() {
        return this.i;
    }

    public String toString() {
        return "CastOptions(" + String.format("receiverApplicationId=%s", new Object[]{this.b}) + ", " + String.format("supportedNamespaces=%s", new Object[]{this.c}) + ", " + String.format("stopReceiverApplicationWhenEndingSession=%b", new Object[]{Boolean.valueOf(this.d)}) + ", " + String.format("launchOptions=%s", new Object[]{this.e}) + ", " + String.format("resumeSavedSession=%s", new Object[]{Boolean.valueOf(this.f)}) + ", " + String.format("castMediaOptions=%s", new Object[]{this.g}) + ", " + String.format("enableReconnectionService=%s", new Object[]{Boolean.valueOf(this.h)}) + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        o.a(this, parcel, i);
    }
}
