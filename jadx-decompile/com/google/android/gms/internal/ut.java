package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.customtabs.CustomTabsClient;
import android.support.customtabs.CustomTabsServiceConnection;
import android.support.customtabs.CustomTabsSession;
import java.util.List;

@aaa
public class ut implements rl {
    @Nullable
    private CustomTabsSession a;
    @Nullable
    private CustomTabsClient b;
    @Nullable
    private CustomTabsServiceConnection c;
    @Nullable
    private a d;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        List queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        if (queryIntentActivities == null || resolveActivity == null) {
            return false;
        }
        for (int i = 0; i < queryIntentActivities.size(); i++) {
            if (resolveActivity.activityInfo.name.equals(((ResolveInfo) queryIntentActivities.get(i)).activityInfo.name)) {
                return resolveActivity.activityInfo.packageName.equals(rj.a(context));
            }
        }
        return false;
    }

    public void a() {
        this.b = null;
        this.a = null;
        if (this.d != null) {
            this.d.b();
        }
    }

    public void a(Activity activity) {
        if (this.c != null) {
            activity.unbindService(this.c);
            this.b = null;
            this.a = null;
            this.c = null;
        }
    }

    public void a(CustomTabsClient customTabsClient) {
        this.b = customTabsClient;
        this.b.warmup(0);
        if (this.d != null) {
            this.d.a();
        }
    }

    public void a(a aVar) {
        this.d = aVar;
    }

    public boolean a(Uri uri, Bundle bundle, List<Bundle> list) {
        if (this.b == null) {
            return false;
        }
        CustomTabsSession b = b();
        return b != null ? b.mayLaunchUrl(uri, bundle, list) : false;
    }

    @Nullable
    public CustomTabsSession b() {
        if (this.b == null) {
            this.a = null;
        } else if (this.a == null) {
            this.a = this.b.newSession(null);
        }
        return this.a;
    }

    public void b(Activity activity) {
        if (this.b == null) {
            String a = rj.a(activity);
            if (a != null) {
                this.c = new rk(this);
                CustomTabsClient.bindCustomTabsService(activity, a, this.c);
            }
        }
    }
}
