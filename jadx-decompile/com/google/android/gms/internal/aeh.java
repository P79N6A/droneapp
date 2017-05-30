package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.util.Log;
import com.facebook.common.util.UriUtil;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.gms.appdatasearch.k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;
import com.google.android.gms.internal.ahl.a;
import java.util.List;

public final class aeh implements k, com.google.android.gms.b.d {
    private static final String a = aeh.class.getSimpleName();

    private static abstract class b<T extends m> extends a<T, aee> {
        public b(g gVar) {
            super(com.google.android.gms.appdatasearch.a.b, gVar);
        }

        protected abstract void a(aeb com_google_android_gms_internal_aeb);

        protected final void a(aee com_google_android_gms_internal_aee) {
            a(com_google_android_gms_internal_aee.h());
        }
    }

    public static abstract class c<T extends m> extends b<Status> {
        public c(g gVar) {
            super(gVar);
        }

        protected Status a(Status status) {
            return status;
        }

        protected /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    public static final class d extends aed<Status> {
        public d(com.google.android.gms.internal.ahl.b<Status> bVar) {
            super(bVar);
        }

        public void a(Status status) {
            this.a.a(status);
        }
    }

    public static Intent a(String str, Uri uri) {
        b(str, uri);
        if (b(uri)) {
            return new Intent("android.intent.action.VIEW", uri);
        }
        if (c(uri)) {
            return new Intent("android.intent.action.VIEW", a(uri));
        }
        String valueOf = String.valueOf(uri);
        throw new RuntimeException(new StringBuilder(String.valueOf(valueOf).length() + 70).append("appIndexingUri is neither an HTTP(S) URL nor an \"android-app://\" URL: ").append(valueOf).toString());
    }

    private static Uri a(Uri uri) {
        List pathSegments = uri.getPathSegments();
        String str = (String) pathSegments.get(0);
        Builder builder = new Builder();
        builder.scheme(str);
        if (pathSegments.size() > 1) {
            builder.authority((String) pathSegments.get(1));
            for (int i = 2; i < pathSegments.size(); i++) {
                builder.appendPath((String) pathSegments.get(i));
            }
        } else {
            str = a;
            String valueOf = String.valueOf(uri);
            Log.e(str, new StringBuilder(String.valueOf(valueOf).length() + 88).append("The app URI must have the format: android-app://<package_name>/<scheme>/<path>. But got ").append(valueOf).toString());
        }
        builder.encodedQuery(uri.getEncodedQuery());
        builder.encodedFragment(uri.getEncodedFragment());
        return builder.build();
    }

    private i<Status> a(g gVar, com.google.android.gms.b.a aVar, int i) {
        String packageName = gVar.b().getPackageName();
        return a(gVar, aef.a(aVar, System.currentTimeMillis(), packageName, i));
    }

    public static void a(List<com.google.android.gms.b.d.b> list) {
        if (list != null) {
            for (com.google.android.gms.b.d.b bVar : list) {
                b(null, bVar.a);
            }
        }
    }

    private static void b(String str, Uri uri) {
        String valueOf;
        if (b(uri)) {
            if (uri.getHost().isEmpty()) {
                valueOf = String.valueOf(uri);
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 98).append("AppIndex: The web URL must have a host (follow the format http(s)://<host>/<path>). Provided URI: ").append(valueOf).toString());
            }
        } else if (!c(uri)) {
            valueOf = String.valueOf(uri);
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 176).append("AppIndex: The URI scheme must either be 'http(s)' or 'android-app'. If the latter, it must follow the format 'android-app://<package_name>/<scheme>/<host_path>'. Provided URI: ").append(valueOf).toString());
        } else if (str == null || str.equals(uri.getHost())) {
            List pathSegments = uri.getPathSegments();
            if (pathSegments.isEmpty() || ((String) pathSegments.get(0)).isEmpty()) {
                valueOf = String.valueOf(uri);
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 128).append("AppIndex: The app URI scheme must exist and follow the format android-app://<package_name>/<scheme>/<host_path>). Provided URI: ").append(valueOf).toString());
            }
        } else {
            valueOf = String.valueOf(uri);
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 150).append("AppIndex: The android-app URI host must match the package name and follow the format android-app://<package_name>/<scheme>/<host_path>. Provided URI: ").append(valueOf).toString());
        }
    }

    private static boolean b(Uri uri) {
        String scheme = uri.getScheme();
        return UriUtil.HTTP_SCHEME.equals(scheme) || UriUtil.HTTPS_SCHEME.equals(scheme);
    }

    private static boolean c(Uri uri) {
        return "android-app".equals(uri.getScheme());
    }

    public com.google.android.gms.b.d.a a(g gVar, com.google.android.gms.b.a aVar) {
        return new a(this, a(gVar, aVar, 1), aVar);
    }

    public i<Status> a(g gVar, Activity activity, Intent intent) {
        String packageName = gVar.b().getPackageName();
        return a(gVar, new UsageInfo.a().a(UsageInfo.a(packageName, intent)).a(System.currentTimeMillis()).a(0).b(2).a());
    }

    public i<Status> a(g gVar, Activity activity, Intent intent, String str, Uri uri, List<com.google.android.gms.b.d.b> list) {
        String packageName = gVar.b().getPackageName();
        a((List) list);
        return a(gVar, new UsageInfo(packageName, intent, str, uri, null, list, 1));
    }

    public i<Status> a(g gVar, Activity activity, Uri uri) {
        return a(gVar, activity, a(gVar.b().getPackageName(), uri));
    }

    public i<Status> a(g gVar, Activity activity, Uri uri, String str, Uri uri2, List<com.google.android.gms.b.d.b> list) {
        String packageName = gVar.b().getPackageName();
        b(packageName, uri);
        return a(gVar, activity, a(packageName, uri), str, uri2, (List) list);
    }

    public i<Status> a(g gVar, final UsageInfo... usageInfoArr) {
        return gVar.a(new c<Status>(this, gVar) {
            final /* synthetic */ aeh b;

            protected void a(aeb com_google_android_gms_internal_aeb) {
                com_google_android_gms_internal_aeb.a(new d(this), null, usageInfoArr);
            }
        });
    }

    public i<Status> b(g gVar, com.google.android.gms.b.a aVar) {
        return a(gVar, aVar, 1);
    }

    public i<Status> c(g gVar, com.google.android.gms.b.a aVar) {
        return a(gVar, aVar, 2);
    }
}
