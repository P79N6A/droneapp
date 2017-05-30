package com.google.android.gms.analytics;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import android.util.LogPrinter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class k implements r {
    private static final Uri a;
    private final LogPrinter b = new LogPrinter(4, "GA/LogCatTransport");

    static {
        Builder builder = new Builder();
        builder.scheme("uri");
        builder.authority("local");
        a = builder.build();
    }

    public Uri a() {
        return a;
    }

    public void a(l lVar) {
        List<n> arrayList = new ArrayList(lVar.b());
        Collections.sort(arrayList, new Comparator<n>(this) {
            final /* synthetic */ k a;

            {
                this.a = r1;
            }

            public int a(n nVar, n nVar2) {
                return nVar.getClass().getCanonicalName().compareTo(nVar2.getClass().getCanonicalName());
            }

            public /* synthetic */ int compare(Object obj, Object obj2) {
                return a((n) obj, (n) obj2);
            }
        });
        StringBuilder stringBuilder = new StringBuilder();
        for (n obj : arrayList) {
            Object obj2 = obj.toString();
            if (!TextUtils.isEmpty(obj2)) {
                if (stringBuilder.length() != 0) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append(obj2);
            }
        }
        this.b.println(stringBuilder.toString());
    }
}
