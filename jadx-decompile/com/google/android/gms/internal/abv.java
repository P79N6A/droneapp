package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager.RunningTaskInfo;
import android.app.AlertDialog.Builder;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Debug;
import android.os.Debug.MemoryInfo;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.PowerManager;
import android.os.Process;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import com.fimi.soul.media.player.FimiMediaMeta;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.ac;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.a;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.common.util.o;
import com.google.android.gms.common.util.s;
import com.google.android.gms.drive.e;
import com.hoho.android.usbserial.driver.UsbId;
import com.xiaomi.market.sdk.j;
import com.xiaomi.mipush.sdk.Constants;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@aaa
public class abv {
    public static final Handler a = new abs(Looper.getMainLooper());
    private final Object b = new Object();
    private boolean c = true;
    private String d;
    private boolean e = false;
    private wx f;

    private JSONArray a(Collection<?> collection) {
        JSONArray jSONArray = new JSONArray();
        for (Object a : collection) {
            a(jSONArray, a);
        }
        return jSONArray;
    }

    private JSONObject a(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            a(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    private void a(JSONArray jSONArray, Object obj) {
        if (obj instanceof Bundle) {
            jSONArray.put(a((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONArray.put(a((Map) obj));
        } else if (obj instanceof Collection) {
            jSONArray.put(a((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONArray.put(a((Object[]) obj));
        } else {
            jSONArray.put(obj);
        }
    }

    private void a(JSONObject jSONObject, String str, Object obj) {
        if (obj instanceof Bundle) {
            jSONObject.put(str, a((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONObject.put(str, a((Map) obj));
        } else if (obj instanceof Collection) {
            if (str == null) {
                str = "null";
            }
            jSONObject.put(str, a((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONObject.put(str, a(Arrays.asList((Object[]) obj)));
        } else {
            jSONObject.put(str, obj);
        }
    }

    private boolean a(KeyguardManager keyguardManager) {
        return keyguardManager == null ? false : keyguardManager.inKeyguardRestrictedInputMode();
    }

    private boolean a(PowerManager powerManager) {
        return powerManager == null || powerManager.isScreenOn();
    }

    public static void b(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            runnable.run();
        } else {
            abu.a(runnable);
        }
    }

    private Bitmap c(@NonNull View view) {
        try {
            int width = view.getWidth();
            int height = view.getHeight();
            if (width == 0 || height == 0) {
                b.d("Width or height of view is zero");
                return null;
            }
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Config.RGB_565);
            Canvas canvas = new Canvas(createBitmap);
            view.layout(0, 0, width, height);
            view.draw(canvas);
            return createBitmap;
        } catch (Throwable e) {
            b.b("Fail to capture the webview", e);
            return null;
        }
    }

    private Bitmap d(@NonNull View view) {
        Bitmap drawingCache;
        Throwable e;
        try {
            boolean isDrawingCacheEnabled = view.isDrawingCacheEnabled();
            view.setDrawingCacheEnabled(true);
            drawingCache = view.getDrawingCache();
            drawingCache = drawingCache != null ? Bitmap.createBitmap(drawingCache) : null;
            try {
                view.setDrawingCacheEnabled(isDrawingCacheEnabled);
            } catch (RuntimeException e2) {
                e = e2;
                b.b("Fail to capture the web view", e);
                return drawingCache;
            }
        } catch (Throwable e3) {
            Throwable th = e3;
            drawingCache = null;
            e = th;
            b.b("Fail to capture the web view", e);
            return drawingCache;
        }
        return drawingCache;
    }

    private boolean m(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        return powerManager == null ? false : powerManager.isScreenOn();
    }

    public Bitmap a(View view) {
        view.setDrawingCacheEnabled(true);
        Bitmap createBitmap = Bitmap.createBitmap(view.getDrawingCache());
        view.setDrawingCacheEnabled(false);
        return createBitmap;
    }

    public DisplayMetrics a(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public PopupWindow a(View view, int i, int i2, boolean z) {
        return new PopupWindow(view, i, i2, z);
    }

    public wx a(Context context, VersionInfoParcel versionInfoParcel) {
        wx wxVar;
        synchronized (this.b) {
            if (this.f == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.f = new wx(context, versionInfoParcel, (String) uf.b.c());
            }
            wxVar = this.f;
        }
        return wxVar;
    }

    public String a(Context context, View view, AdSizeParcel adSizeParcel) {
        String str = null;
        if (((Boolean) uf.ag.c()).booleanValue()) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(FimiMediaMeta.IJKM_KEY_WIDTH, adSizeParcel.f);
                jSONObject2.put(FimiMediaMeta.IJKM_KEY_HEIGHT, adSizeParcel.c);
                jSONObject.put("size", jSONObject2);
                jSONObject.put("activity", f(context));
                if (!adSizeParcel.e) {
                    JSONArray jSONArray = new JSONArray();
                    while (view != null) {
                        ViewParent parent = view.getParent();
                        if (parent != null) {
                            int i = -1;
                            if (parent instanceof ViewGroup) {
                                i = ((ViewGroup) parent).indexOfChild(view);
                            }
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("type", parent.getClass().getName());
                            jSONObject3.put("index_of_child", i);
                            jSONArray.put(jSONObject3);
                        }
                        View view2 = (parent == null || !(parent instanceof View)) ? null : (View) parent;
                        view = view2;
                    }
                    if (jSONArray.length() > 0) {
                        jSONObject.put("parents", jSONArray);
                    }
                }
                str = jSONObject.toString();
            } catch (Throwable e) {
                b.d("Fail to get view hierarchy json", e);
            }
        }
        return str;
    }

    public String a(Context context, ro roVar, String str, View view) {
        if (roVar != null) {
            try {
                Uri parse = Uri.parse(str);
                if (roVar.d(parse)) {
                    parse = roVar.a(parse, context, view);
                }
                str = parse.toString();
            } catch (Exception e) {
            }
        }
        return str;
    }

    public String a(Context context, String str) {
        String str2;
        synchronized (this.b) {
            if (this.d != null) {
                str2 = this.d;
            } else if (str == null) {
                str2 = b();
            } else {
                try {
                    this.d = u.g().a(context);
                } catch (Exception e) {
                }
                if (TextUtils.isEmpty(this.d)) {
                    if (ac.a().b()) {
                        try {
                            this.d = c(context);
                        } catch (Exception e2) {
                            this.d = b();
                        }
                    } else {
                        this.d = null;
                        a.post(new 2(this, context));
                        while (this.d == null) {
                            try {
                                this.b.wait();
                            } catch (InterruptedException e3) {
                                this.d = b();
                                String str3 = "Interrupted, use default user agent: ";
                                str2 = String.valueOf(this.d);
                                b.d(str2.length() != 0 ? str3.concat(str2) : new String(str3));
                            }
                        }
                    }
                }
                str2 = String.valueOf(this.d);
                this.d = new StringBuilder((String.valueOf(str2).length() + 11) + String.valueOf(str).length()).append(str2).append(" (Mobile; ").append(str).append(")").toString();
                str2 = this.d;
            }
        }
        return str2;
    }

    public String a(acy com_google_android_gms_internal_acy, String str) {
        return a(com_google_android_gms_internal_acy.getContext(), com_google_android_gms_internal_acy.n(), str, com_google_android_gms_internal_acy.b());
    }

    public String a(InputStreamReader inputStreamReader) {
        StringBuilder stringBuilder = new StringBuilder(8192);
        char[] cArr = new char[2048];
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (read == -1) {
                return stringBuilder.toString();
            }
            stringBuilder.append(cArr, 0, read);
        }
    }

    public String a(String str) {
        return Uri.parse(str).buildUpon().query(null).build().toString();
    }

    public String a(String str, Map<String, String> map) {
        for (String str2 : map.keySet()) {
            str = str.replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[]{str2}), String.format("$1%s$2", new Object[]{Uri.encode((String) map.get(str2))}));
        }
        return str.replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[]{"[^@]+"}), String.format("$1%s$2", new Object[]{""})).replaceAll("@@", "@");
    }

    public Map<String, String> a(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : u.g().a(uri)) {
            hashMap.put(str, uri.getQueryParameter(str));
        }
        return hashMap;
    }

    public Map<String, Integer> a(View view, WindowManager windowManager) {
        DisplayMetrics a = a(windowManager);
        int i = a.widthPixels;
        int i2 = a.heightPixels;
        int[] iArr = new int[2];
        Map<String, Integer> hashMap = new HashMap();
        view.getLocationInWindow(iArr);
        hashMap.put("xInPixels", Integer.valueOf(iArr[0]));
        hashMap.put("yInPixels", Integer.valueOf(iArr[1]));
        hashMap.put("windowWidthInPixels", Integer.valueOf(i));
        hashMap.put("windowHeightInPixels", Integer.valueOf(i2));
        return hashMap;
    }

    JSONArray a(Object[] objArr) {
        JSONArray jSONArray = new JSONArray();
        for (Object a : objArr) {
            a(jSONArray, a);
        }
        return jSONArray;
    }

    public JSONObject a(Map<String, ?> map) {
        String valueOf;
        try {
            JSONObject jSONObject = new JSONObject();
            for (String valueOf2 : map.keySet()) {
                a(jSONObject, valueOf2, map.get(valueOf2));
            }
            return jSONObject;
        } catch (ClassCastException e) {
            String str = "Could not convert map to JSON: ";
            valueOf2 = String.valueOf(e.getMessage());
            throw new JSONException(valueOf2.length() != 0 ? str.concat(valueOf2) : new String(str));
        }
    }

    public void a(Activity activity, OnGlobalLayoutListener onGlobalLayoutListener) {
        Window window = activity.getWindow();
        if (window != null && window.getDecorView() != null && window.getDecorView().getViewTreeObserver() != null) {
            window.getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public void a(Activity activity, OnScrollChangedListener onScrollChangedListener) {
        Window window = activity.getWindow();
        if (window != null && window.getDecorView() != null && window.getDecorView().getViewTreeObserver() != null) {
            window.getDecorView().getViewTreeObserver().addOnScrollChangedListener(onScrollChangedListener);
        }
    }

    public void a(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable th) {
            intent.addFlags(e.a_);
            context.startActivity(intent);
        }
    }

    @TargetApi(18)
    public void a(Context context, Uri uri) {
        try {
            Bundle bundle = new Bundle();
            if (((Boolean) uf.cC.c()).booleanValue() && s.g()) {
                bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            }
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(new Intent("android.intent.action.VIEW", uri).putExtras(bundle));
            String valueOf = String.valueOf(uri.toString());
            b.a(new StringBuilder(String.valueOf(valueOf).length() + 26).append("Opening ").append(valueOf).append(" in a new browser.").toString());
        } catch (Throwable e) {
            b.b("No browser is found.", e);
        }
    }

    public void a(Context context, String str, WebSettings webSettings) {
        webSettings.setUserAgentString(a(context, str));
    }

    public void a(Context context, String str, String str2) {
        List arrayList = new ArrayList();
        arrayList.add(str2);
        a(context, str, arrayList);
    }

    public void a(Context context, @Nullable String str, String str2, Bundle bundle, boolean z) {
        if (z) {
            bundle.putString("device", u.e().e());
            bundle.putString("eids", TextUtils.join(Constants.ACCEPT_TIME_SEPARATOR_SP, uf.a()));
        }
        ac.a().a(context, str, str2, bundle, z, new 3(this, context, str));
    }

    public void a(Context context, String str, List<String> list) {
        for (String com_google_android_gms_internal_acg : list) {
            Future future = (Future) new acg(context, str, com_google_android_gms_internal_acg).e();
        }
    }

    public void a(Context context, String str, boolean z, HttpURLConnection httpURLConnection) {
        a(context, str, z, httpURLConnection, false);
    }

    public void a(Context context, String str, boolean z, HttpURLConnection httpURLConnection, boolean z2) {
        httpURLConnection.setConnectTimeout(UsbId.SILAB_CP2102);
        httpURLConnection.setInstanceFollowRedirects(z);
        httpURLConnection.setReadTimeout(UsbId.SILAB_CP2102);
        httpURLConnection.setRequestProperty(org.a.a.e.Y, a(context, str));
        httpURLConnection.setUseCaches(z2);
    }

    public void a(Context context, List<String> list) {
        if (!(context instanceof Activity) || TextUtils.isEmpty(rj.a((Activity) context))) {
            return;
        }
        if (list == null) {
            abr.e("Cannot ping urls: empty list.");
        } else if (ut.a(context)) {
            ut utVar = new ut();
            utVar.a(new 1(this, list, utVar, context));
            utVar.b((Activity) context);
        } else {
            abr.e("Cannot ping url because custom tabs is not supported");
        }
    }

    public void a(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            a.post(runnable);
        }
    }

    public void a(List<String> list, String str) {
        for (String com_google_android_gms_internal_acg : list) {
            Future future = (Future) new acg(com_google_android_gms_internal_acg, str).e();
        }
    }

    public boolean a() {
        return this.c;
    }

    boolean a(int i, int i2, int i3) {
        return Math.abs(i - i2) <= i3;
    }

    @TargetApi(24)
    public boolean a(Activity activity, Configuration configuration) {
        DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
        a a = ac.a();
        int a2 = a.a((Context) activity, configuration.screenHeightDp);
        int a3 = a.a((Context) activity, configuration.screenWidthDp);
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", SystemMediaRouteProvider.PACKAGE_NAME);
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        identifier = ((Integer) uf.cJ.c()).intValue() * ((int) Math.round((((double) displayMetrics.densityDpi) / 160.0d) + 0.5d));
        return a(displayMetrics.heightPixels, dimensionPixelSize + a2, identifier) && a(displayMetrics.widthPixels, a3, identifier);
    }

    public boolean a(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context, AdActivity.a);
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
        if (resolveActivity == null || resolveActivity.activityInfo == null) {
            b.d("Could not find com.google.android.gms.ads.AdActivity, please make sure it is declared in AndroidManifest.xml.");
            return false;
        }
        boolean z;
        String str = "com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".";
        if ((resolveActivity.activityInfo.configChanges & 16) == 0) {
            b.d(String.format(str, new Object[]{"keyboard"}));
            z = false;
        } else {
            z = true;
        }
        if ((resolveActivity.activityInfo.configChanges & 32) == 0) {
            b.d(String.format(str, new Object[]{"keyboardHidden"}));
            z = false;
        }
        if ((resolveActivity.activityInfo.configChanges & 128) == 0) {
            b.d(String.format(str, new Object[]{"orientation"}));
            z = false;
        }
        if ((resolveActivity.activityInfo.configChanges & 256) == 0) {
            b.d(String.format(str, new Object[]{"screenLayout"}));
            z = false;
        }
        if ((resolveActivity.activityInfo.configChanges & 512) == 0) {
            b.d(String.format(str, new Object[]{"uiMode"}));
            z = false;
        }
        if ((resolveActivity.activityInfo.configChanges & 1024) == 0) {
            b.d(String.format(str, new Object[]{j.ah}));
            z = false;
        }
        if ((resolveActivity.activityInfo.configChanges & 2048) != 0) {
            return z;
        }
        b.d(String.format(str, new Object[]{"smallestScreenSize"}));
        return false;
    }

    public boolean a(PackageManager packageManager, String str, String str2) {
        return packageManager.checkPermission(str2, str) == 0;
    }

    public boolean a(View view, Context context) {
        KeyguardManager keyguardManager = null;
        Context applicationContext = context.getApplicationContext();
        PowerManager powerManager = applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null;
        Object systemService = context.getSystemService("keyguard");
        if (systemService != null && (systemService instanceof KeyguardManager)) {
            keyguardManager = (KeyguardManager) systemService;
        }
        return a(view, powerManager, keyguardManager);
    }

    public boolean a(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z = u.e().a() || !a(keyguardManager);
        return view.getVisibility() == 0 && view.isShown() && a(powerManager) && z && (!((Boolean) uf.aH.c()).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect()));
    }

    public boolean a(ClassLoader classLoader, Class<?> cls, String str) {
        boolean z = false;
        try {
            z = cls.isAssignableFrom(Class.forName(str, false, classLoader));
        } catch (Throwable th) {
        }
        return z;
    }

    public int[] a(Activity activity) {
        Window window = activity.getWindow();
        if (window == null || window.findViewById(16908290) == null) {
            return f();
        }
        return new int[]{window.findViewById(16908290).getWidth(), window.findViewById(16908290).getHeight()};
    }

    public int b(@Nullable View view) {
        if (view == null) {
            return -1;
        }
        ViewParent parent = view.getParent();
        while (parent != null && !(parent instanceof AdapterView)) {
            parent = parent.getParent();
        }
        return parent == null ? -1 : ((AdapterView) parent).getPositionForView(view);
    }

    public int b(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            String valueOf = String.valueOf(e);
            b.d(new StringBuilder(String.valueOf(valueOf).length() + 22).append("Could not parse value:").append(valueOf).toString());
            return 0;
        }
    }

    String b() {
        StringBuffer stringBuffer = new StringBuffer(256);
        stringBuffer.append("Mozilla/5.0 (Linux; U; Android");
        if (VERSION.RELEASE != null) {
            stringBuffer.append(" ").append(VERSION.RELEASE);
        }
        stringBuffer.append("; ").append(Locale.getDefault());
        if (Build.DEVICE != null) {
            stringBuffer.append("; ").append(Build.DEVICE);
            if (Build.DISPLAY != null) {
                stringBuffer.append(" Build/").append(Build.DISPLAY);
            }
        }
        stringBuffer.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return stringBuffer.toString();
    }

    public String b(Context context, String str) {
        try {
            return new String(o.a(context.openFileInput(str), true), "UTF-8");
        } catch (Throwable e) {
            b.b("Error reading from internal storage.", e);
            return "";
        }
    }

    public void b(Activity activity, OnScrollChangedListener onScrollChangedListener) {
        Window window = activity.getWindow();
        if (window != null && window.getDecorView() != null && window.getDecorView().getViewTreeObserver() != null) {
            window.getDecorView().getViewTreeObserver().removeOnScrollChangedListener(onScrollChangedListener);
        }
    }

    public void b(Context context, String str, String str2) {
        try {
            FileOutputStream openFileOutput = context.openFileOutput(str, 0);
            openFileOutput.write(str2.getBytes("UTF-8"));
            openFileOutput.close();
        } catch (Throwable e) {
            b.b("Error writing to file in internal storage.", e);
        }
    }

    public void b(Context context, String str, String str2, Bundle bundle, boolean z) {
        if (((Boolean) uf.aL.c()).booleanValue()) {
            a(context, str, str2, bundle, z);
        }
    }

    public boolean b(Context context) {
        if (this.e) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.getApplicationContext().registerReceiver(new a(this, null), intentFilter);
        this.e = true;
        return true;
    }

    public int[] b(Activity activity) {
        int[] a = a(activity);
        return new int[]{ac.a().b((Context) activity, a[0]), ac.a().b((Context) activity, a[1])};
    }

    public String c() {
        return UUID.randomUUID().toString();
    }

    protected String c(Context context) {
        return new WebView(context).getSettings().getUserAgentString();
    }

    public boolean c(String str) {
        return TextUtils.isEmpty(str) ? false : str.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)");
    }

    public int[] c(Activity activity) {
        Window window = activity.getWindow();
        if (window == null || window.findViewById(16908290) == null) {
            return f();
        }
        return new int[]{window.findViewById(16908290).getTop(), window.findViewById(16908290).getBottom()};
    }

    public Builder d(Context context) {
        return new Builder(context);
    }

    public String d() {
        UUID randomUUID = UUID.randomUUID();
        byte[] toByteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        byte[] toByteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String bigInteger = new BigInteger(1, toByteArray).toString();
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update(toByteArray);
                instance.update(toByteArray2);
                Object obj = new byte[8];
                System.arraycopy(instance.digest(), 0, obj, 0, 8);
                bigInteger = new BigInteger(1, obj).toString();
            } catch (NoSuchAlgorithmException e) {
            }
        }
        return bigInteger;
    }

    public int[] d(Activity activity) {
        int[] c = c(activity);
        return new int[]{ac.a().b((Context) activity, c[0]), ac.a().b((Context) activity, c[1])};
    }

    public tx e(Context context) {
        return new tx(context);
    }

    public String e() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        return str2.startsWith(str) ? str2 : new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(str2).length()).append(str).append(" ").append(str2).toString();
    }

    public String f(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null) {
                return null;
            }
            List runningTasks = activityManager.getRunningTasks(1);
            if (!(runningTasks == null || runningTasks.isEmpty())) {
                RunningTaskInfo runningTaskInfo = (RunningTaskInfo) runningTasks.get(0);
                if (!(runningTaskInfo == null || runningTaskInfo.topActivity == null)) {
                    return runningTaskInfo.topActivity.getClassName();
                }
            }
            return null;
        } catch (Exception e) {
        }
    }

    protected int[] f() {
        return new int[]{0, 0};
    }

    public float g() {
        com.google.android.gms.ads.internal.o a = u.y().a();
        return (a == null || !a.d()) ? 1.0f : a.c();
    }

    public boolean g(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null) {
                return false;
            }
            List<RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses == null) {
                return false;
            }
            for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && m(context)) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        } catch (Throwable th) {
            return false;
        }
    }

    public Bitmap h(Context context) {
        if (!(context instanceof Activity)) {
            return null;
        }
        Bitmap d;
        try {
            if (((Boolean) uf.bB.c()).booleanValue()) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    d = d(window.getDecorView().getRootView());
                }
                d = null;
            } else {
                d = c(((Activity) context).getWindow().getDecorView());
            }
        } catch (Throwable e) {
            b.b("Fail to capture screen shot", e);
        }
        return d;
    }

    public boolean h() {
        com.google.android.gms.ads.internal.o a = u.y().a();
        return a != null ? a.e() : false;
    }

    public AudioManager i(Context context) {
        return (AudioManager) context.getSystemService("audio");
    }

    public Bundle i() {
        Bundle bundle = new Bundle();
        try {
            if (((Boolean) uf.C.c()).booleanValue()) {
                Parcelable memoryInfo = new MemoryInfo();
                Debug.getMemoryInfo(memoryInfo);
                bundle.putParcelable("debug_memory_info", memoryInfo);
            }
            if (((Boolean) uf.D.c()).booleanValue()) {
                Runtime runtime = Runtime.getRuntime();
                bundle.putLong("runtime_free_memory", runtime.freeMemory());
                bundle.putLong("runtime_max_memory", runtime.maxMemory());
                bundle.putLong("runtime_total_memory", runtime.totalMemory());
            }
        } catch (Throwable e) {
            b.d("Unable to gather memory stats", e);
        }
        return bundle;
    }

    public float j(Context context) {
        AudioManager i = i(context);
        if (i == null) {
            return 0.0f;
        }
        int streamMaxVolume = i.getStreamMaxVolume(3);
        return streamMaxVolume != 0 ? ((float) i.getStreamVolume(3)) / ((float) streamMaxVolume) : 0.0f;
    }

    public int k(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo == null ? 0 : applicationInfo.targetSdkVersion;
    }

    public boolean l(Context context) {
        try {
            context.getClassLoader().loadClass(ClientApi.class.getName());
            return false;
        } catch (ClassNotFoundException e) {
            return true;
        }
    }
}
