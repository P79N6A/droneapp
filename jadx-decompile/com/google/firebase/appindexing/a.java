package com.google.firebase.appindexing;

import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.d;
import com.google.firebase.appindexing.internal.ActionImpl;
import com.google.firebase.appindexing.internal.ActionImpl.MetadataImpl;
import com.google.firebase.appindexing.internal.k;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface a {

    public static class a {
        public static final String a = "ActivateAction";
        public static final String b = "AddAction";
        public static final String c = "BookmarkAction";
        public static final String d = "CommentAction";
        public static final String e = "LikeAction";
        public static final String f = "ListenAction";
        public static final String g = "SendAction";
        public static final String h = "ShareAction";
        public static final String i = "ViewAction";
        public static final String j = "WatchAction";
        public static final String k = "http://schema.org/ActiveActionStatus";
        public static final String l = "http://schema.org/CompletedActionStatus";
        public static final String m = "http://schema.org/FailedActionStatus";
        private final String n;
        private String o;
        private String p;
        private String q;
        private MetadataImpl r = b.a;
        private String s;

        @Retention(RetentionPolicy.CLASS)
        public @interface a {
        }

        public a(String str) {
            this.n = str;
        }

        public a a(@NonNull a aVar) {
            d.a((Object) aVar);
            this.r = aVar.a();
            return this;
        }

        public a a(@a String str) {
            d.a((Object) str);
            this.s = str;
            return this;
        }

        public a a(@NonNull String str, @NonNull String str2) {
            d.a((Object) str);
            k.a(str2);
            this.o = str;
            this.p = str2;
            return this;
        }

        public a a(@NonNull String str, @NonNull String str2, @NonNull String str3) {
            d.a((Object) str);
            k.a(str2);
            k.b(str3);
            this.o = str;
            this.p = str2;
            this.q = str3;
            return this;
        }

        public a a() {
            d.a(this.o, (Object) "setObject is required before calling build().");
            d.a(this.p, (Object) "setObject is required before calling build().");
            return new ActionImpl(this.n, this.o, this.p, this.q, this.r, this.s);
        }
    }

    public interface b {
        public static final MetadataImpl a = new a().a();

        public static class a {
            private boolean a = true;
            private boolean b = false;

            public a a(boolean z) {
                this.a = z;
                return this;
            }

            public MetadataImpl a() {
                return new MetadataImpl(this.a, null, null, null, false);
            }
        }
    }
}
