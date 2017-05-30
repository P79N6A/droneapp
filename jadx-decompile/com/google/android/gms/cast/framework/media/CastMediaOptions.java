package com.google.android.gms.cast.framework.media;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.c.f;
import com.google.android.gms.cast.internal.m;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Locale;

public class CastMediaOptions extends AbstractSafeParcelable {
    public static final Creator<CastMediaOptions> CREATOR = new d();
    private static final m a = new m("CastMediaOptions");
    private final int b;
    private final String c;
    private final String d;
    private final e e;
    private final NotificationOptions f;

    public static final class a {
        private String a = MediaIntentReceiver.class.getName();
        private String b;
        private a c;
        private NotificationOptions d = new com.google.android.gms.cast.framework.media.NotificationOptions.a().a();

        public a a(NotificationOptions notificationOptions) {
            this.d = notificationOptions;
            return this;
        }

        public a a(a aVar) {
            this.c = aVar;
            return this;
        }

        public a a(String str) {
            this.a = str;
            return this;
        }

        public CastMediaOptions a() {
            return new CastMediaOptions(1, this.a, this.b, this.c == null ? null : this.c.a().asBinder(), this.d);
        }

        public a b(String str) {
            this.b = str;
            return this;
        }
    }

    CastMediaOptions(int i, String str, String str2, IBinder iBinder, NotificationOptions notificationOptions) {
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = com.google.android.gms.cast.framework.media.e.a.a(iBinder);
        this.f = notificationOptions;
    }

    int a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public NotificationOptions c() {
        return this.f;
    }

    public String d() {
        return this.d;
    }

    public a e() {
        if (this.e != null) {
            try {
                return (a) f.a(this.e.b());
            } catch (Throwable e) {
                a.a(e, "Unable to call %s on %s.", "getWrappedClientObject", e.class.getSimpleName());
            }
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CastMediaOptions)) {
            return false;
        }
        CastMediaOptions castMediaOptions = (CastMediaOptions) obj;
        return com.google.android.gms.cast.internal.f.a(this.c, castMediaOptions.b()) && com.google.android.gms.cast.internal.f.a(this.d, castMediaOptions.d) && com.google.android.gms.cast.internal.f.a(this.f, castMediaOptions.f);
    }

    public IBinder f() {
        return this.e == null ? null : this.e.asBinder();
    }

    public int hashCode() {
        return c.a(this.c, this.d, this.f);
    }

    public String toString() {
        return String.format(Locale.ROOT, "CastMediaOptions(mediaIntentReceiverClassName=%s, expandedControllerActivityClassName=%s, notificationOptions=%s)", new Object[]{this.c, this.d, this.f});
    }

    public void writeToParcel(Parcel parcel, int i) {
        d.a(this, parcel, i);
    }
}
