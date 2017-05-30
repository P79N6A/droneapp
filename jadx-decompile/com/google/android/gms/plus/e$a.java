package com.google.android.gms.plus;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.text.TextUtils;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.plus.a.a.a;
import java.util.ArrayList;
import java.util.List;

public class e$a {
    private final Context a;
    private final Intent b = new Intent().setAction("android.intent.action.SEND");
    private boolean c;
    private ArrayList<Uri> d;

    public e$a(Activity activity) {
        this.a = activity;
        this.b.addFlags(AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END);
        if (activity != null && activity.getComponentName() != null) {
            this.c = true;
        }
    }

    public e$a(Context context) {
        this.a = context;
    }

    public Intent a() {
        boolean z = true;
        boolean z2 = this.d != null && this.d.size() > 1;
        boolean equals = "android.intent.action.SEND_MULTIPLE".equals(this.b.getAction());
        boolean booleanExtra = this.b.getBooleanExtra(e.g, false);
        boolean z3 = (z2 && booleanExtra) ? false : true;
        d.a(z3, "Call-to-action buttons are only available for URLs.");
        z3 = !booleanExtra || this.b.hasExtra(e.a);
        d.a(z3, "The content URL is required for interactive posts.");
        if (!(!booleanExtra || this.b.hasExtra(e.a) || this.b.hasExtra(e.b))) {
            z = false;
        }
        d.a(z, "Must set content URL or content deep-link ID to use a call-to-action button.");
        if (this.b.hasExtra(e.b)) {
            d.a(e.a(this.b.getStringExtra(e.b)), "The specified deep-link ID was malformed.");
        }
        if (!z2 && equals) {
            this.b.setAction("android.intent.action.SEND");
            if (this.d == null || this.d.isEmpty()) {
                this.b.removeExtra("android.intent.extra.STREAM");
            } else {
                this.b.putExtra("android.intent.extra.STREAM", (Parcelable) this.d.get(0));
            }
            this.d = null;
        }
        if (z2 && !equals) {
            this.b.setAction("android.intent.action.SEND_MULTIPLE");
            if (this.d == null || this.d.isEmpty()) {
                this.b.removeExtra("android.intent.extra.STREAM");
            } else {
                this.b.putParcelableArrayListExtra("android.intent.extra.STREAM", this.d);
            }
        }
        if ("com.google.android.gms.plus.action.SHARE_INTERNAL_GOOGLE".equals(this.b.getAction())) {
            this.b.setPackage("com.google.android.gms");
            return this.b;
        } else if (this.b.hasExtra("android.intent.extra.STREAM")) {
            this.b.setPackage("com.google.android.apps.plus");
            return this.b;
        } else {
            this.b.setAction("com.google.android.gms.plus.action.SHARE_GOOGLE");
            this.b.setPackage("com.google.android.gms");
            return this.b;
        }
    }

    public e$a a(Uri uri) {
        this.d = null;
        this.b.putExtra("android.intent.extra.STREAM", uri);
        return this;
    }

    public e$a a(a aVar, List<a> list) {
        this.b.putExtra(e.l, aVar != null ? aVar.y() : "0");
        int size = list != null ? list.size() : 0;
        if (size == 0) {
            this.b.removeExtra("com.google.android.apps.plus.RECIPIENT_IDS");
            this.b.removeExtra("com.google.android.apps.plus.RECIPIENT_DISPLAY_NAMES");
        } else {
            ArrayList arrayList = new ArrayList(size);
            ArrayList arrayList2 = new ArrayList(size);
            for (a aVar2 : list) {
                arrayList.add(aVar2.y());
                arrayList2.add(aVar2.u());
            }
            this.b.putStringArrayListExtra("com.google.android.apps.plus.RECIPIENT_IDS", arrayList);
            this.b.putStringArrayListExtra("com.google.android.apps.plus.RECIPIENT_DISPLAY_NAMES", arrayList2);
        }
        return this;
    }

    public e$a a(CharSequence charSequence) {
        this.b.putExtra("android.intent.extra.TEXT", charSequence);
        return this;
    }

    public e$a a(String str) {
        this.b.setType(str);
        return this;
    }

    public e$a a(String str, Uri uri, String str2) {
        d.a(this.c, "Must include the launching activity with PlusShare.Builder constructor before setting call-to-action");
        boolean z = (uri == null || TextUtils.isEmpty(uri.toString())) ? false : true;
        d.b(z, "Must provide a call to action URL");
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(str)) {
            bundle.putString(e.i, str);
        }
        bundle.putString("url", uri.toString());
        if (!TextUtils.isEmpty(str2)) {
            d.a(e.a(str2), "The specified deep-link ID was malformed.");
            bundle.putString(e.k, str2);
        }
        this.b.putExtra(e.h, bundle);
        this.b.putExtra(e.g, true);
        this.b.setType("text/plain");
        return this;
    }

    public e$a a(String str, String str2, String str3, Uri uri) {
        d.b(this.c, "Must include the launching activity with PlusShare.Builder constructor before setting deep links");
        d.b(!TextUtils.isEmpty(str), "The deepLinkId parameter is required.");
        Bundle a = e.a(str2, str3, uri);
        this.b.putExtra(e.b, str);
        this.b.putExtra(e.c, a);
        this.b.setType("text/plain");
        return this;
    }

    public e$a b(Uri uri) {
        Uri uri2 = (Uri) this.b.getParcelableExtra("android.intent.extra.STREAM");
        if (uri2 == null) {
            return a(uri);
        }
        if (this.d == null) {
            this.d = new ArrayList();
        }
        this.d.add(uri2);
        this.d.add(uri);
        return this;
    }

    public e$a b(String str) {
        return a(str, null, null, null);
    }

    public e$a c(Uri uri) {
        Object obj = null;
        if (uri != null) {
            obj = uri.toString();
        }
        if (TextUtils.isEmpty(obj)) {
            this.b.removeExtra(e.a);
        } else {
            this.b.putExtra(e.a, obj);
        }
        return this;
    }
}
