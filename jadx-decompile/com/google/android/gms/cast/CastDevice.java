package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.internal.f;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CastDevice extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<CastDevice> CREATOR = new j();
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 4;
    public static final int d = 8;
    public static final int e = 32;
    String f;
    private final int g;
    private String h;
    private Inet4Address i;
    private String j;
    private String k;
    private String l;
    private int m;
    private List<WebImage> n;
    private int o;
    private int p;
    private String q;

    CastDevice(int i, String str, String str2, String str3, String str4, String str5, int i2, List<WebImage> list, int i3, int i4, String str6) {
        List arrayList;
        this.g = i;
        this.h = a(str);
        this.f = a(str2);
        if (!TextUtils.isEmpty(this.f)) {
            try {
                InetAddress byName = InetAddress.getByName(this.f);
                if (byName instanceof Inet4Address) {
                    this.i = (Inet4Address) byName;
                }
            } catch (UnknownHostException e) {
                String str7 = this.f;
                String valueOf = String.valueOf(e.getMessage());
                Log.i("CastDevice", new StringBuilder((String.valueOf(str7).length() + 48) + String.valueOf(valueOf).length()).append("Unable to convert host address (").append(str7).append(") to ipaddress: ").append(valueOf).toString());
            }
        }
        this.j = a(str3);
        this.k = a(str4);
        this.l = a(str5);
        this.m = i2;
        if (list == null) {
            arrayList = new ArrayList();
        }
        this.n = arrayList;
        this.o = i3;
        this.p = i4;
        this.q = a(str6);
    }

    private static String a(String str) {
        return str == null ? "" : str;
    }

    public static CastDevice b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(CastDevice.class.getClassLoader());
        return (CastDevice) bundle.getParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE");
    }

    public int a() {
        return this.g;
    }

    public WebImage a(int i, int i2) {
        WebImage webImage = null;
        if (this.n.isEmpty()) {
            return null;
        }
        if (i <= 0 || i2 <= 0) {
            return (WebImage) this.n.get(0);
        }
        WebImage webImage2 = null;
        for (WebImage webImage3 : this.n) {
            WebImage webImage32;
            int c = webImage32.c();
            int d = webImage32.d();
            if (c < i || d < i2) {
                if (c < i && d < i2 && (webImage == null || (webImage.c() < c && webImage.d() < d))) {
                    webImage = webImage2;
                }
                webImage32 = webImage;
                webImage = webImage2;
            } else {
                if (webImage2 == null || (webImage2.c() > c && webImage2.d() > d)) {
                    WebImage webImage4 = webImage;
                    webImage = webImage32;
                    webImage32 = webImage4;
                }
                webImage32 = webImage;
                webImage = webImage2;
            }
            webImage2 = webImage;
            webImage = webImage32;
        }
        if (webImage2 == null) {
            webImage2 = webImage != null ? webImage : (WebImage) this.n.get(0);
        }
        return webImage2;
    }

    public void a(Bundle bundle) {
        if (bundle != null) {
            bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", this);
        }
    }

    public boolean a(int i) {
        return (this.o & i) == i;
    }

    public boolean a(CastDevice castDevice) {
        return castDevice == null ? false : this.h == null ? castDevice.h == null : f.a(this.h, castDevice.h);
    }

    public boolean a(int[] iArr) {
        if (iArr == null) {
            return false;
        }
        for (int a : iArr) {
            if (!a(a)) {
                return false;
            }
        }
        return true;
    }

    public String b() {
        return this.h.startsWith("__cast_nearby__") ? this.h.substring("__cast_nearby__".length() + 1) : this.h;
    }

    public String c() {
        return this.h;
    }

    public Inet4Address d() {
        return this.i;
    }

    public String e() {
        return this.j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CastDevice)) {
            return false;
        }
        CastDevice castDevice = (CastDevice) obj;
        return this.h == null ? castDevice.h == null : f.a(this.h, castDevice.h) && f.a(this.i, castDevice.i) && f.a(this.k, castDevice.k) && f.a(this.j, castDevice.j) && f.a(this.l, castDevice.l) && this.m == castDevice.m && f.a(this.n, castDevice.n) && this.o == castDevice.o && this.p == castDevice.p && f.a(this.q, castDevice.q);
    }

    public String f() {
        return this.k;
    }

    public String g() {
        return this.l;
    }

    public String h() {
        return this.q;
    }

    public int hashCode() {
        return this.h == null ? 0 : this.h.hashCode();
    }

    public int i() {
        return this.m;
    }

    public List<WebImage> j() {
        return Collections.unmodifiableList(this.n);
    }

    public boolean k() {
        return !this.n.isEmpty();
    }

    public int l() {
        return this.o;
    }

    public int m() {
        return this.p;
    }

    public boolean n() {
        return !this.h.startsWith("__cast_nearby__");
    }

    public String toString() {
        return String.format("\"%s\" (%s)", new Object[]{this.j, this.h});
    }

    public void writeToParcel(Parcel parcel, int i) {
        j.a(this, parcel, i);
    }
}
