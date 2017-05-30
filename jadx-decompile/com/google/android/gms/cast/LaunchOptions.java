package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.internal.f;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Locale;

public class LaunchOptions extends AbstractSafeParcelable {
    public static final Creator<LaunchOptions> CREATOR = new l();
    private final int a;
    private boolean b;
    private String c;

    public static final class a {
        private LaunchOptions a = new LaunchOptions();

        public a a(Locale locale) {
            this.a.a(f.a(locale));
            return this;
        }

        public a a(boolean z) {
            this.a.a(z);
            return this;
        }

        public LaunchOptions a() {
            return this.a;
        }
    }

    public LaunchOptions() {
        this(1, false, f.a(Locale.getDefault()));
    }

    LaunchOptions(int i, boolean z, String str) {
        this.a = i;
        this.b = z;
        this.c = str;
    }

    int a() {
        return this.a;
    }

    public void a(String str) {
        this.c = str;
    }

    public void a(boolean z) {
        this.b = z;
    }

    public boolean b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LaunchOptions)) {
            return false;
        }
        LaunchOptions launchOptions = (LaunchOptions) obj;
        return this.b == launchOptions.b && f.a(this.c, launchOptions.c);
    }

    public int hashCode() {
        return c.a(Boolean.valueOf(this.b), this.c);
    }

    public String toString() {
        return String.format("LaunchOptions(relaunchIfRunning=%b, language=%s)", new Object[]{Boolean.valueOf(this.b), this.c});
    }

    public void writeToParcel(Parcel parcel, int i) {
        l.a(this, parcel, i);
    }
}
