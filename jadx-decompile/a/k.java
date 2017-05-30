package a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.tencent.open.GameAppOperation;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class k {
    public static final String a = "com.parse.bolts.measurement_event";
    public static final String b = "event_name";
    public static final String c = "event_args";
    public static final String d = "al_nav_out";
    public static final String e = "al_nav_in";
    private Context f;
    private String g;
    private Bundle h;

    private k(Context context, String str, Bundle bundle) {
        this.f = context.getApplicationContext();
        this.g = str;
        this.h = bundle;
    }

    private static Bundle a(Context context, String str, Bundle bundle, Intent intent) {
        Bundle bundle2 = new Bundle();
        ComponentName resolveActivity = intent.resolveActivity(context.getPackageManager());
        if (resolveActivity != null) {
            bundle2.putString("class", resolveActivity.getShortClassName());
        }
        if (d.equals(str)) {
            if (resolveActivity != null) {
                bundle2.putString("package", resolveActivity.getPackageName());
            }
            if (intent.getData() != null) {
                bundle2.putString("outputURL", intent.getData().toString());
            }
            if (intent.getScheme() != null) {
                bundle2.putString("outputURLScheme", intent.getScheme());
            }
        } else if (e.equals(str)) {
            if (intent.getData() != null) {
                bundle2.putString("inputURL", intent.getData().toString());
            }
            if (intent.getScheme() != null) {
                bundle2.putString("inputURLScheme", intent.getScheme());
            }
        }
        for (String str2 : bundle.keySet()) {
            Object obj = bundle.get(str2);
            String a;
            if (obj instanceof Bundle) {
                for (String a2 : ((Bundle) obj).keySet()) {
                    String a3 = a(((Bundle) obj).get(a2));
                    if (str2.equals("referer_app_link")) {
                        if (a2.equalsIgnoreCase("url")) {
                            bundle2.putString("refererURL", a3);
                        } else if (a2.equalsIgnoreCase(GameAppOperation.QQFAV_DATALINE_APPNAME)) {
                            bundle2.putString("refererAppName", a3);
                        } else if (a2.equalsIgnoreCase("package")) {
                            bundle2.putString("sourceApplication", a3);
                        }
                    }
                    bundle2.putString(str2 + "/" + a2, a3);
                }
            } else {
                a2 = a(obj);
                if (str2.equals("target_url")) {
                    Uri parse = Uri.parse(a2);
                    bundle2.putString("targetURL", parse.toString());
                    bundle2.putString("targetURLHost", parse.getHost());
                } else {
                    bundle2.putString(str2, a2);
                }
            }
        }
        return bundle2;
    }

    private static String a(Object obj) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject)) {
            return obj.toString();
        }
        try {
            return obj instanceof Collection ? new JSONArray((Collection) obj).toString() : obj instanceof Map ? new JSONObject((Map) obj).toString() : obj.toString();
        } catch (Exception e) {
            return null;
        }
    }

    private void a() {
        if (this.g == null) {
            Log.d(getClass().getName(), "Event name is required");
        }
        try {
            Class cls = Class.forName("android.support.v4.content.LocalBroadcastManager");
            Method method = cls.getMethod("getInstance", new Class[]{Context.class});
            Method method2 = cls.getMethod("sendBroadcast", new Class[]{Intent.class});
            Object invoke = method.invoke(null, new Object[]{this.f});
            Intent intent = new Intent(a);
            intent.putExtra(b, this.g);
            intent.putExtra(c, this.h);
            method2.invoke(invoke, new Object[]{intent});
        } catch (Exception e) {
            Log.d(getClass().getName(), "LocalBroadcastManager in android support library is required to raise bolts event.");
        }
    }

    static void a(Context context, String str, Intent intent, Map<String, String> map) {
        Bundle a;
        Bundle bundle = new Bundle();
        if (intent != null) {
            Bundle a2 = f.a(intent);
            if (a2 != null) {
                a = a(context, str, a2, intent);
                if (map != null) {
                    for (String str2 : map.keySet()) {
                        a.putString(str2, (String) map.get(str2));
                    }
                }
                new k(context, str, a).a();
            }
            Uri data = intent.getData();
            if (data != null) {
                bundle.putString("intentData", data.toString());
            }
            a = intent.getExtras();
            if (a != null) {
                for (String str22 : a.keySet()) {
                    bundle.putString(str22, a(a.get(str22)));
                }
            }
        }
        a = bundle;
        if (map != null) {
            for (String str222 : map.keySet()) {
                a.putString(str222, (String) map.get(str222));
            }
        }
        new k(context, str, a).a();
    }
}
