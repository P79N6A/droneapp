package a;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

public class c {
    private Uri a;
    private List<a> b;
    private Uri c;

    public static class a {
        private final Uri a;
        private final String b;
        private final String c;
        private final String d;

        public a(String str, String str2, Uri uri, String str3) {
            this.b = str;
            this.c = str2;
            this.a = uri;
            this.d = str3;
        }

        public Uri a() {
            return this.a;
        }

        public String b() {
            return this.d;
        }

        public String c() {
            return this.c;
        }

        public String d() {
            return this.b;
        }
    }

    public c(Uri uri, List<a> list, Uri uri2) {
        List emptyList;
        this.a = uri;
        if (list == null) {
            emptyList = Collections.emptyList();
        }
        this.b = emptyList;
        this.c = uri2;
    }

    public Uri a() {
        return this.a;
    }

    public List<a> b() {
        return Collections.unmodifiableList(this.b);
    }

    public Uri c() {
        return this.c;
    }
}
