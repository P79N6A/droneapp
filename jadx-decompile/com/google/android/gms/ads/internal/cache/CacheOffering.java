package com.google.android.gms.ads.internal.cache;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.aaa;
import java.util.List;

@aaa
public class CacheOffering extends AbstractSafeParcelable {
    public static final d CREATOR = new d();
    public final int a;
    @Nullable
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final String f;
    public final Bundle g;
    public final boolean h;

    CacheOffering(int i, @Nullable String str, long j, String str2, String str3, String str4, Bundle bundle, boolean z) {
        this.a = i;
        this.b = str;
        this.c = j;
        if (str2 == null) {
            str2 = "";
        }
        this.d = str2;
        if (str3 == null) {
            str3 = "";
        }
        this.e = str3;
        if (str4 == null) {
            str4 = "";
        }
        this.f = str4;
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.g = bundle;
        this.h = z;
    }

    @Nullable
    public static CacheOffering a(Uri uri) {
        Throwable e;
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                b.d("Expected 2 path parts for namespace and id, found :" + pathSegments.size());
                return null;
            }
            String str = (String) pathSegments.get(0);
            String str2 = (String) pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("url");
            boolean equals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            long parseLong = queryParameter2 == null ? 0 : Long.parseLong(queryParameter2);
            Bundle bundle = new Bundle();
            for (String queryParameter22 : u.g().a(uri)) {
                if (queryParameter22.startsWith("tag.")) {
                    bundle.putString(queryParameter22.substring("tag.".length()), uri.getQueryParameter(queryParameter22));
                }
            }
            return new CacheOffering(1, queryParameter, parseLong, host, str, str2, bundle, equals);
        } catch (NullPointerException e2) {
            e = e2;
            b.d("Unable to parse Uri into cache offering.", e);
            return null;
        } catch (NumberFormatException e3) {
            e = e3;
            b.d("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    @Nullable
    public static CacheOffering a(String str) {
        return a(Uri.parse(str));
    }

    public void writeToParcel(Parcel parcel, int i) {
        d.a(this, parcel, i);
    }
}
