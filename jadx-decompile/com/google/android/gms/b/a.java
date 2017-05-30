package com.google.android.gms.b;

import android.net.Uri;
import android.os.Bundle;
import com.fimi.soul.entity.User;
import com.google.android.gms.common.internal.d;

public final class a extends e {
    public static final String a = "http://schema.org/ActivateAction";
    public static final String b = "http://schema.org/AddAction";
    public static final String c = "http://schema.org/BookmarkAction";
    public static final String d = "http://schema.org/CommunicateAction";
    public static final String e = "http://schema.org/FilmAction";
    public static final String f = "http://schema.org/LikeAction";
    public static final String g = "http://schema.org/ListenAction";
    public static final String h = "http://schema.org/PhotographAction";
    public static final String i = "http://schema.org/ReserveAction";
    public static final String j = "http://schema.org/SearchAction";
    public static final String k = "http://schema.org/ViewAction";
    public static final String l = "http://schema.org/WantAction";
    public static final String m = "http://schema.org/WatchAction";
    public static final String n = "http://schema.org/ActiveActionStatus";
    public static final String o = "http://schema.org/CompletedActionStatus";
    public static final String p = "http://schema.org/FailedActionStatus";

    public static final class a extends com.google.android.gms.b.e.a {
        public a(String str) {
            d.a((Object) str);
            super.b("type", str);
        }

        public a a(Uri uri) {
            if (uri != null) {
                super.b("url", uri.toString());
            }
            return this;
        }

        public a a(e eVar) {
            d.a((Object) eVar);
            return (a) super.b("object", eVar);
        }

        public a a(String str) {
            return (a) super.b(User.FN_NAME, str);
        }

        public a a(String str, e eVar) {
            return (a) super.b(str, eVar);
        }

        public a a(String str, String str2) {
            return (a) super.b(str, str2);
        }

        public a a(String str, boolean z) {
            return (a) super.b(str, z);
        }

        public a a(String str, e[] eVarArr) {
            return (a) super.b(str, eVarArr);
        }

        public a a(String str, String[] strArr) {
            return (a) super.b(str, strArr);
        }

        public a a() {
            d.a(this.a.get("object"), (Object) "setObject is required before calling build().");
            d.a(this.a.get("type"), (Object) "setType is required before calling build().");
            Bundle bundle = (Bundle) this.a.getParcelable("object");
            d.a(bundle.get(User.FN_NAME), (Object) "Must call setObject() with a valid name. Example: setObject(new Thing.Builder().setName(name).setUrl(url))");
            d.a(bundle.get("url"), (Object) "Must call setObject() with a valid app URI. Example: setObject(new Thing.Builder().setName(name).setUrl(url))");
            return new a(this.a);
        }

        public a b(String str) {
            d.a((Object) str);
            return (a) super.b(com.google.android.gms.fitness.d.b, str);
        }

        public /* synthetic */ com.google.android.gms.b.e.a b(Uri uri) {
            return a(uri);
        }

        public /* synthetic */ com.google.android.gms.b.e.a b(String str, e eVar) {
            return a(str, eVar);
        }

        public /* synthetic */ com.google.android.gms.b.e.a b(String str, String str2) {
            return a(str, str2);
        }

        public /* synthetic */ com.google.android.gms.b.e.a b(String str, boolean z) {
            return a(str, z);
        }

        public /* synthetic */ com.google.android.gms.b.e.a b(String str, e[] eVarArr) {
            return a(str, eVarArr);
        }

        public /* synthetic */ com.google.android.gms.b.e.a b(String str, String[] strArr) {
            return a(str, strArr);
        }

        public /* synthetic */ e b() {
            return a();
        }

        public /* synthetic */ com.google.android.gms.b.e.a c(String str) {
            return a(str);
        }
    }

    private a(Bundle bundle) {
        super(bundle);
    }

    public static a a(String str, String str2, Uri uri) {
        return a(str, str2, null, uri);
    }

    public static a a(String str, String str2, Uri uri, Uri uri2) {
        return (a) new a(str).a(new com.google.android.gms.b.e.a().c(str2).d(uri == null ? null : uri.toString()).b(uri2).b()).b();
    }
}
