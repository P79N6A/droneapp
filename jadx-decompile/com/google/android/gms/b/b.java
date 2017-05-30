package com.google.android.gms.b;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.common.internal.c;
import java.util.List;

public final class b {
    private final Uri a;

    private b(Uri uri) {
        this.a = uri;
    }

    public static b a(Uri uri) {
        b bVar = new b(uri);
        if (a(bVar)) {
            return bVar;
        }
        throw new IllegalArgumentException("AndroidAppUri validation failed.");
    }

    public static b a(String str, Uri uri) {
        Builder authority = new Builder().scheme("android-app").authority(str);
        if (uri != null) {
            authority.appendPath(uri.getScheme());
            if (uri.getAuthority() != null) {
                authority.appendPath(uri.getAuthority());
            }
            for (String appendPath : uri.getPathSegments()) {
                authority.appendPath(appendPath);
            }
            authority.encodedQuery(uri.getEncodedQuery()).encodedFragment(uri.getEncodedFragment());
        }
        return new b(authority.build());
    }

    private static boolean a(b bVar) {
        if (!"android-app".equals(bVar.a.getScheme())) {
            throw new IllegalArgumentException("android-app scheme is required.");
        } else if (TextUtils.isEmpty(bVar.b())) {
            throw new IllegalArgumentException("Package name is empty.");
        } else {
            if (bVar.a.equals(a(bVar.b(), bVar.c()).a())) {
                return true;
            }
            throw new IllegalArgumentException("URI is not canonical.");
        }
    }

    public Uri a() {
        return this.a;
    }

    public String b() {
        return this.a.getAuthority();
    }

    public Uri c() {
        List pathSegments = this.a.getPathSegments();
        if (pathSegments.size() <= 0) {
            return null;
        }
        String str = (String) pathSegments.get(0);
        Builder builder = new Builder();
        builder.scheme(str);
        if (pathSegments.size() > 1) {
            builder.authority((String) pathSegments.get(1));
            for (int i = 2; i < pathSegments.size(); i++) {
                builder.appendPath((String) pathSegments.get(i));
            }
        }
        builder.encodedQuery(this.a.getEncodedQuery());
        builder.encodedFragment(this.a.getEncodedFragment());
        return builder.build();
    }

    public boolean equals(Object obj) {
        return obj instanceof b ? this.a.equals(((b) obj).a) : false;
    }

    public int hashCode() {
        return c.a(this.a);
    }

    public String toString() {
        return this.a.toString();
    }
}
