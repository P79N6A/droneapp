package com.google.android.gms.internal;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.common.util.UriUtil;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.drive.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class wb$a {
    private final acy a;

    public wb$a(acy com_google_android_gms_internal_acy) {
        this.a = com_google_android_gms_internal_acy;
    }

    public Intent a(Context context, Map<String, String> map) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        String str = (String) map.get("u");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.a != null) {
            str = u.e().a(this.a, str);
        }
        Uri parse = Uri.parse(str);
        boolean parseBoolean = Boolean.parseBoolean((String) map.get("use_first_package"));
        boolean parseBoolean2 = Boolean.parseBoolean((String) map.get("use_running_process"));
        Uri build = UriUtil.HTTP_SCHEME.equalsIgnoreCase(parse.getScheme()) ? parse.buildUpon().scheme(UriUtil.HTTPS_SCHEME).build() : UriUtil.HTTPS_SCHEME.equalsIgnoreCase(parse.getScheme()) ? parse.buildUpon().scheme(UriUtil.HTTP_SCHEME).build() : null;
        ArrayList arrayList = new ArrayList();
        Intent a = a(parse);
        Intent a2 = a(build);
        ResolveInfo a3 = a(context, a, arrayList);
        if (a3 != null) {
            return a(a, a3);
        }
        if (a2 != null) {
            ResolveInfo a4 = a(context, a2);
            if (a4 != null) {
                Intent a5 = a(a, a4);
                if (a(context, a5) != null) {
                    return a5;
                }
            }
        }
        if (arrayList.size() == 0) {
            return a;
        }
        if (parseBoolean2 && activityManager != null) {
            List<RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ResolveInfo resolveInfo = (ResolveInfo) it.next();
                    for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                        if (runningAppProcessInfo.processName.equals(resolveInfo.activityInfo.packageName)) {
                            return a(a, resolveInfo);
                        }
                    }
                }
            }
        }
        return parseBoolean ? a(a, (ResolveInfo) arrayList.get(0)) : a;
    }

    public Intent a(Intent intent, ResolveInfo resolveInfo) {
        Intent intent2 = new Intent(intent);
        intent2.setClassName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
        return intent2;
    }

    public Intent a(Uri uri) {
        if (uri == null) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(e.a_);
        intent.setData(uri);
        intent.setAction("android.intent.action.VIEW");
        return intent;
    }

    public ResolveInfo a(Context context, Intent intent) {
        return a(context, intent, new ArrayList());
    }

    public ResolveInfo a(Context context, Intent intent, ArrayList<ResolveInfo> arrayList) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return null;
        }
        ResolveInfo resolveInfo;
        Collection queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 65536);
        if (!(queryIntentActivities == null || resolveActivity == null)) {
            for (int i = 0; i < queryIntentActivities.size(); i++) {
                resolveInfo = (ResolveInfo) queryIntentActivities.get(i);
                if (resolveActivity != null && resolveActivity.activityInfo.name.equals(resolveInfo.activityInfo.name)) {
                    resolveInfo = resolveActivity;
                    break;
                }
            }
        }
        resolveInfo = null;
        arrayList.addAll(queryIntentActivities);
        return resolveInfo;
    }
}
