package com.google.firebase;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.j;
import com.google.android.gms.common.util.w;
import com.tencent.mm.sdk.plugin.MMPluginProviderConstants.OAuth;

public final class e {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;

    public static final class a {
        private String a;
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;

        public a(e eVar) {
            this.b = eVar.b;
            this.a = eVar.a;
            this.c = eVar.c;
            this.d = eVar.d;
            this.e = eVar.e;
            this.f = eVar.f;
        }

        public a a(@NonNull String str) {
            this.a = d.a(str, "ApiKey must be set.");
            return this;
        }

        public e a() {
            return new e(this.b, this.a, this.c, this.d, this.e, this.f);
        }

        public a b(@NonNull String str) {
            this.b = d.a(str, "ApplicationId must be set.");
            return this;
        }

        public a c(@Nullable String str) {
            this.c = str;
            return this;
        }

        public a d(@Nullable String str) {
            this.e = str;
            return this;
        }

        public a e(@Nullable String str) {
            this.f = str;
            return this;
        }
    }

    private e(@NonNull String str, @NonNull String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        d.a(!w.a(str), "ApplicationId must be set.");
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public static e a(Context context) {
        j jVar = new j(context);
        Object a = jVar.a("google_app_id");
        return TextUtils.isEmpty(a) ? null : new e(a, jVar.a("google_api_key"), jVar.a("firebase_database_url"), jVar.a("ga_trackingId"), jVar.a("gcm_defaultSenderId"), jVar.a("google_storage_bucket"));
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public String d() {
        return this.e;
    }

    public String e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return c.a(this.b, eVar.b) && c.a(this.a, eVar.a) && c.a(this.c, eVar.c) && c.a(this.d, eVar.d) && c.a(this.e, eVar.e) && c.a(this.f, eVar.f);
    }

    public int hashCode() {
        return c.a(new Object[]{this.b, this.a, this.c, this.d, this.e, this.f});
    }

    public String toString() {
        return c.a(this).a("applicationId", this.b).a(OAuth.API_KEY, this.a).a("databaseUrl", this.c).a("gcmSenderId", this.e).a("storageBucket", this.f).toString();
    }
}
