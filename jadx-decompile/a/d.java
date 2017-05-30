package a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class d {
    private static final String a = "user_agent";
    private static final String b = "version";
    private static final String c = "referer_app_link";
    private static final String d = "app_name";
    private static final String e = "package";
    private static final String f = "1.0";
    private static e g;
    private final c h;
    private final Bundle i;
    private final Bundle j;

    public enum a {
        FAILED("failed", false),
        WEB("web", true),
        APP("app", true);
        
        private String d;
        private boolean e;

        private a(String str, boolean z) {
            this.d = str;
            this.e = z;
        }

        public String a() {
            return this.d;
        }

        public boolean b() {
            return this.e;
        }
    }

    public d(c cVar, Bundle bundle, Bundle bundle2) {
        if (cVar == null) {
            throw new IllegalArgumentException("appLink must not be null.");
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        this.h = cVar;
        this.i = bundle;
        this.j = bundle2;
    }

    public static a a(Context context, c cVar) {
        return new d(cVar, null, null).a(context);
    }

    public static l<a> a(Context context, Uri uri) {
        return a(context, uri, c(context));
    }

    public static l<a> a(final Context context, Uri uri, e eVar) {
        return eVar.a(uri).c(new j<c, a>() {
            public a a(l<c> lVar) {
                return d.a(context, (c) lVar.e());
            }

            public /* synthetic */ Object then(l lVar) {
                return a(lVar);
            }
        }, l.b);
    }

    public static l<a> a(Context context, String str) {
        return a(context, str, c(context));
    }

    public static l<a> a(Context context, String str, e eVar) {
        return a(context, Uri.parse(str), eVar);
    }

    public static l<a> a(Context context, URL url) {
        return a(context, url, c(context));
    }

    public static l<a> a(Context context, URL url, e eVar) {
        return a(context, Uri.parse(url.toString()), eVar);
    }

    private Object a(Object obj) {
        int i = 0;
        if (obj instanceof Bundle) {
            return a((Bundle) obj);
        }
        if (obj instanceof CharSequence) {
            return obj.toString();
        }
        if (obj instanceof List) {
            JSONArray jSONArray = new JSONArray();
            for (Object a : (List) obj) {
                jSONArray.put(a(a));
            }
            return jSONArray;
        } else if (obj instanceof SparseArray) {
            r1 = new JSONArray();
            SparseArray sparseArray = (SparseArray) obj;
            while (i < sparseArray.size()) {
                r1.put(sparseArray.keyAt(i), a(sparseArray.valueAt(i)));
                i++;
            }
            return r1;
        } else if (obj instanceof Character) {
            return obj.toString();
        } else {
            if (obj instanceof Boolean) {
                return obj;
            }
            if (obj instanceof Number) {
                return ((obj instanceof Double) || (obj instanceof Float)) ? Double.valueOf(((Number) obj).doubleValue()) : Long.valueOf(((Number) obj).longValue());
            } else {
                int length;
                if (obj instanceof boolean[]) {
                    r1 = new JSONArray();
                    boolean[] zArr = (boolean[]) obj;
                    length = zArr.length;
                    while (i < length) {
                        r1.put(a(Boolean.valueOf(zArr[i])));
                        i++;
                    }
                    return r1;
                } else if (obj instanceof char[]) {
                    r1 = new JSONArray();
                    char[] cArr = (char[]) obj;
                    length = cArr.length;
                    while (i < length) {
                        r1.put(a(Character.valueOf(cArr[i])));
                        i++;
                    }
                    return r1;
                } else if (obj instanceof CharSequence[]) {
                    r1 = new JSONArray();
                    CharSequence[] charSequenceArr = (CharSequence[]) obj;
                    length = charSequenceArr.length;
                    while (i < length) {
                        r1.put(a(charSequenceArr[i]));
                        i++;
                    }
                    return r1;
                } else if (obj instanceof double[]) {
                    r1 = new JSONArray();
                    double[] dArr = (double[]) obj;
                    length = dArr.length;
                    while (i < length) {
                        r1.put(a(Double.valueOf(dArr[i])));
                        i++;
                    }
                    return r1;
                } else if (obj instanceof float[]) {
                    r1 = new JSONArray();
                    float[] fArr = (float[]) obj;
                    length = fArr.length;
                    while (i < length) {
                        r1.put(a(Float.valueOf(fArr[i])));
                        i++;
                    }
                    return r1;
                } else if (obj instanceof int[]) {
                    r1 = new JSONArray();
                    int[] iArr = (int[]) obj;
                    length = iArr.length;
                    while (i < length) {
                        r1.put(a(Integer.valueOf(iArr[i])));
                        i++;
                    }
                    return r1;
                } else if (obj instanceof long[]) {
                    r1 = new JSONArray();
                    long[] jArr = (long[]) obj;
                    length = jArr.length;
                    while (i < length) {
                        r1.put(a(Long.valueOf(jArr[i])));
                        i++;
                    }
                    return r1;
                } else if (obj instanceof short[]) {
                    r1 = new JSONArray();
                    short[] sArr = (short[]) obj;
                    length = sArr.length;
                    while (i < length) {
                        r1.put(a(Short.valueOf(sArr[i])));
                        i++;
                    }
                    return r1;
                } else if (!(obj instanceof String[])) {
                    return null;
                } else {
                    r1 = new JSONArray();
                    String[] strArr = (String[]) obj;
                    length = strArr.length;
                    while (i < length) {
                        r1.put(a(strArr[i]));
                        i++;
                    }
                    return r1;
                }
            }
        }
    }

    private JSONObject a(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            jSONObject.put(str, a(bundle.get(str)));
        }
        return jSONObject;
    }

    public static void a(e eVar) {
        g = eVar;
    }

    private void a(Context context, Intent intent, a aVar, JSONException jSONException) {
        Map hashMap = new HashMap();
        if (jSONException != null) {
            hashMap.put("error", jSONException.getLocalizedMessage());
        }
        hashMap.put("success", aVar.b() ? "1" : "0");
        hashMap.put("type", aVar.a());
        k.a(context, k.d, intent, hashMap);
    }

    private Bundle b(Context context) {
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        if (context != null) {
            String packageName = context.getPackageName();
            if (packageName != null) {
                bundle2.putString(e, packageName);
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (applicationInfo != null) {
                packageName = context.getString(applicationInfo.labelRes);
                if (packageName != null) {
                    bundle2.putString("app_name", packageName);
                }
            }
        }
        bundle.putAll(b());
        bundle.putString("target_url", a().a().toString());
        bundle.putString("version", "1.0");
        bundle.putString(a, "Bolts Android 1.1.4");
        bundle.putBundle(c, bundle2);
        bundle.putBundle("extras", c());
        return bundle;
    }

    private static e c(Context context) {
        return d() != null ? d() : new m(context);
    }

    public static e d() {
        return g;
    }

    public c a() {
        return this.h;
    }

    public a a(Context context) {
        Intent intent;
        Intent intent2;
        a aVar;
        PackageManager packageManager = context.getPackageManager();
        Bundle b = b(context);
        for (a.c.a aVar2 : a().b()) {
            intent = new Intent("android.intent.action.VIEW");
            if (aVar2.a() != null) {
                intent.setData(aVar2.a());
            } else {
                intent.setData(this.h.a());
            }
            intent.setPackage(aVar2.d());
            if (aVar2.c() != null) {
                intent.setClassName(aVar2.d(), aVar2.c());
            }
            intent.putExtra("al_applink_data", b);
            if (packageManager.resolveActivity(intent, 65536) != null) {
                intent2 = intent;
                break;
            }
        }
        intent2 = null;
        a aVar3 = a.FAILED;
        if (intent2 != null) {
            intent = intent2;
            aVar = a.APP;
        } else {
            Uri c = a().c();
            if (c != null) {
                try {
                    intent = new Intent("android.intent.action.VIEW", c.buildUpon().appendQueryParameter("al_applink_data", a(b).toString()).build());
                    aVar = a.WEB;
                } catch (Throwable e) {
                    a(context, intent2, a.FAILED, e);
                    throw new RuntimeException(e);
                }
            }
            aVar = aVar3;
            intent = null;
        }
        a(context, intent, aVar, null);
        if (intent != null) {
            context.startActivity(intent);
        }
        return aVar;
    }

    public Bundle b() {
        return this.j;
    }

    public Bundle c() {
        return this.i;
    }
}
