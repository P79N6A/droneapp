package com.google.android.gms.b;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import java.util.List;

public interface d {

    @Deprecated
    public interface a {
        i<Status> a();

        i<Status> a(g gVar);
    }

    @Deprecated
    public static final class b {
        public final Uri a;
        public final Uri b;
        public final int c;

        public b(Uri uri, Uri uri2, View view) {
            this.a = uri;
            this.b = uri2;
            this.c = view.getId();
        }

        public b(Uri uri, View view) {
            this(uri, null, view);
        }
    }

    @Deprecated
    a a(g gVar, a aVar);

    @Deprecated
    i<Status> a(g gVar, Activity activity, Intent intent);

    @Deprecated
    i<Status> a(g gVar, Activity activity, Intent intent, String str, Uri uri, List<b> list);

    @Deprecated
    i<Status> a(g gVar, Activity activity, Uri uri);

    @Deprecated
    i<Status> a(g gVar, Activity activity, Uri uri, String str, Uri uri2, List<b> list);

    i<Status> b(g gVar, a aVar);

    i<Status> c(g gVar, a aVar);
}
