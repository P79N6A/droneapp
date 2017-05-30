package com.google.android.gms.ads.internal.util.client;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri.Builder;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings.Secure;
import android.support.annotation.Nullable;
import android.support.v4.internal.view.SupportMenu;
import android.support.v4.view.ViewCompat;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.facebook.common.util.UriUtil;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.b;
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.google.android.gms.ads.doubleclick.e;
import com.google.android.gms.ads.f;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.search.SearchAdView;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.util.s;
import com.google.android.gms.internal.aaa;
import com.hoho.android.usbserial.driver.UsbId;
import com.xiaomi.market.sdk.j;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.StringTokenizer;

@aaa
public class a {
    public static final Handler a = new Handler(Looper.getMainLooper());
    private static final String b = AdView.class.getName();
    private static final String c = f.class.getName();
    private static final String d = PublisherAdView.class.getName();
    private static final String e = e.class.getName();
    private static final String f = SearchAdView.class.getName();
    private static final String g = b.class.getName();

    public interface a {
        void a(String str);
    }

    private void a(ViewGroup viewGroup, AdSizeParcel adSizeParcel, String str, int i, int i2) {
        if (viewGroup.getChildCount() == 0) {
            Context context = viewGroup.getContext();
            View textView = new TextView(context);
            textView.setGravity(17);
            textView.setText(str);
            textView.setTextColor(i);
            textView.setBackgroundColor(i2);
            View frameLayout = new FrameLayout(context);
            frameLayout.setBackgroundColor(i);
            int a = a(context, 3);
            frameLayout.addView(textView, new LayoutParams(adSizeParcel.g - a, adSizeParcel.d - a, 17));
            viewGroup.addView(frameLayout, adSizeParcel.g, adSizeParcel.d);
        }
    }

    public int a(Context context, int i) {
        return a(context.getResources().getDisplayMetrics(), i);
    }

    public int a(DisplayMetrics displayMetrics, int i) {
        return (int) TypedValue.applyDimension(1, (float) i, displayMetrics);
    }

    public String a(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        String string = contentResolver == null ? null : Secure.getString(contentResolver, "android_id");
        if (string == null || a()) {
            string = "emulator";
        }
        return a(string);
    }

    public String a(String str) {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest.getInstance("MD5").update(str.getBytes());
                return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, r1.digest())});
            } catch (NoSuchAlgorithmException e) {
                i++;
            }
        }
        return null;
    }

    String a(String str, String str2, int i) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, str2);
        StringBuilder stringBuilder = new StringBuilder();
        int i2 = i - 1;
        if (i <= 0 || !stringTokenizer.hasMoreElements()) {
            return str;
        }
        stringBuilder.append(stringTokenizer.nextToken());
        while (true) {
            int i3 = i2 - 1;
            if (i2 > 0 && stringTokenizer.hasMoreElements()) {
                stringBuilder.append(".").append(stringTokenizer.nextToken());
                i2 = i3;
            }
        }
        return stringBuilder.toString();
    }

    @Nullable
    public String a(StackTraceElement[] stackTraceElementArr, String str) {
        String className;
        for (int i = 0; i + 1 < stackTraceElementArr.length; i++) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i];
            String className2 = stackTraceElement.getClassName();
            if ("loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) && (b.equalsIgnoreCase(className2) || c.equalsIgnoreCase(className2) || d.equalsIgnoreCase(className2) || e.equalsIgnoreCase(className2) || f.equalsIgnoreCase(className2) || g.equalsIgnoreCase(className2))) {
                className = stackTraceElementArr[i + 1].getClassName();
                break;
            }
        }
        className = null;
        if (str != null) {
            CharSequence a = a(str, ".", 3);
            if (!(className == null || className.contains(a))) {
                return className;
            }
        }
        return null;
    }

    public void a(Context context, @Nullable String str, String str2, Bundle bundle, boolean z) {
        a(context, str, str2, bundle, z, new a(this) {
            final /* synthetic */ a a;

            {
                this.a = r1;
            }

            public void a(final String str) {
                new Thread(this) {
                    final /* synthetic */ AnonymousClass1 b;

                    public void run() {
                        new c().a(str);
                    }
                }.start();
            }
        });
    }

    public void a(Context context, @Nullable String str, String str2, Bundle bundle, boolean z, a aVar) {
        if (z) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context;
            }
            bundle.putString(j.ac, VERSION.RELEASE);
            bundle.putString("api", String.valueOf(VERSION.SDK_INT));
            bundle.putString("appid", applicationContext.getPackageName());
            if (str == null) {
                str = com.google.android.gms.common.j.b().c(context) + "." + q.a;
            }
            bundle.putString("js", str);
        }
        Builder appendQueryParameter = new Builder().scheme(UriUtil.HTTPS_SCHEME).path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", str2);
        for (String str3 : bundle.keySet()) {
            appendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        aVar.a(appendQueryParameter.toString());
    }

    public void a(ViewGroup viewGroup, AdSizeParcel adSizeParcel, String str) {
        a(viewGroup, adSizeParcel, str, (int) ViewCompat.MEASURED_STATE_MASK, -1);
    }

    public void a(ViewGroup viewGroup, AdSizeParcel adSizeParcel, String str, String str2) {
        b.d(str2);
        a(viewGroup, adSizeParcel, str, (int) SupportMenu.CATEGORY_MASK, (int) ViewCompat.MEASURED_STATE_MASK);
    }

    public void a(boolean z, HttpURLConnection httpURLConnection, @Nullable String str) {
        httpURLConnection.setConnectTimeout(UsbId.SILAB_CP2102);
        httpURLConnection.setInstanceFollowRedirects(z);
        httpURLConnection.setReadTimeout(UsbId.SILAB_CP2102);
        if (str != null) {
            httpURLConnection.setRequestProperty(org.a.a.e.Y, str);
        }
        httpURLConnection.setUseCaches(false);
    }

    public boolean a() {
        return Build.DEVICE.startsWith("generic");
    }

    public int b(Context context, int i) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return b(displayMetrics, i);
    }

    public int b(DisplayMetrics displayMetrics, int i) {
        return Math.round(((float) i) / displayMetrics.density);
    }

    public boolean b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public boolean b(Context context) {
        return com.google.android.gms.common.j.b().a(context) == 0;
    }

    public boolean c(Context context) {
        if (context.getResources().getConfiguration().orientation != 2) {
            return false;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return ((int) (((float) displayMetrics.heightPixels) / displayMetrics.density)) < 600;
    }

    @TargetApi(17)
    public boolean d(Context context) {
        int i;
        int i2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        if (s.f()) {
            defaultDisplay.getRealMetrics(displayMetrics);
            i = displayMetrics.heightPixels;
            i2 = displayMetrics.widthPixels;
        } else {
            try {
                i = ((Integer) Display.class.getMethod("getRawHeight", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                i2 = ((Integer) Display.class.getMethod("getRawWidth", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
            } catch (Exception e) {
                return false;
            }
        }
        defaultDisplay.getMetrics(displayMetrics);
        boolean z = displayMetrics.heightPixels == i && displayMetrics.widthPixels == i2;
        return z;
    }

    public int e(Context context) {
        int identifier = context.getResources().getIdentifier("navigation_bar_width", "dimen", SystemMediaRouteProvider.PACKAGE_NAME);
        return identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0;
    }
}
