package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.os.Process;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.common.util.s;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@TargetApi(14)
@aaa
public class tq extends Thread {
    private boolean a = false;
    private boolean b = false;
    private boolean c = false;
    private final Object d;
    private final to e;
    private final zz f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;

    @aaa
    class a {
        final int a;
        final int b;
        final /* synthetic */ tq c;

        a(tq tqVar, int i, int i2) {
            this.c = tqVar;
            this.a = i;
            this.b = i2;
        }
    }

    public tq(to toVar, zz zzVar) {
        this.e = toVar;
        this.f = zzVar;
        this.d = new Object();
        this.h = ((Integer) uf.R.c()).intValue();
        this.i = ((Integer) uf.S.c()).intValue();
        this.j = ((Integer) uf.T.c()).intValue();
        this.k = ((Integer) uf.U.c()).intValue();
        this.g = ((Integer) uf.V.c()).intValue();
        setName("ContentFetchTask");
    }

    a a(@Nullable View view, tn tnVar) {
        int i = 0;
        if (view == null) {
            return new a(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new a(this, 0, 0);
            }
            tnVar.b(text.toString(), globalVisibleRect);
            return new a(this, 1, 0);
        } else if ((view instanceof WebView) && !(view instanceof acy)) {
            tnVar.f();
            return a((WebView) view, tnVar, globalVisibleRect) ? new a(this, 0, 1) : new a(this, 0, 0);
        } else if (!(view instanceof ViewGroup)) {
            return new a(this, 0, 0);
        } else {
            ViewGroup viewGroup = (ViewGroup) view;
            int i2 = 0;
            int i3 = 0;
            while (i < viewGroup.getChildCount()) {
                a a = a(viewGroup.getChildAt(i), tnVar);
                i3 += a.a;
                i2 += a.b;
                i++;
            }
            return new a(this, i3, i2);
        }
    }

    public void a() {
        synchronized (this.d) {
            if (this.a) {
                b.a("Content hash thread already started, quiting...");
                return;
            }
            this.a = true;
            start();
        }
    }

    void a(@Nullable Activity activity) {
        if (activity != null) {
            View view = null;
            try {
                if (!(activity.getWindow() == null || activity.getWindow().getDecorView() == null)) {
                    view = activity.getWindow().getDecorView().findViewById(16908290);
                }
            } catch (Throwable th) {
                b.a("Failed getting root view of activity. Content not extracted.");
            }
            if (view != null) {
                a(view);
            }
        }
    }

    void a(tn tnVar, WebView webView, String str, boolean z) {
        tnVar.e();
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (TextUtils.isEmpty(webView.getTitle())) {
                    tnVar.a(optString, z);
                } else {
                    String valueOf = String.valueOf(webView.getTitle());
                    tnVar.a(new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(optString).length()).append(valueOf).append("\n").append(optString).toString(), z);
                }
            }
            if (tnVar.a()) {
                this.e.b(tnVar);
            }
        } catch (JSONException e) {
            b.a("Json string may be malformed.");
        } catch (Throwable th) {
            b.a("Failed to get webview content.", th);
            this.f.a(th, "ContentFetchTask.processWebViewContent");
        }
    }

    boolean a(RunningAppProcessInfo runningAppProcessInfo) {
        return runningAppProcessInfo.importance == 100;
    }

    boolean a(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        return powerManager == null ? false : powerManager.isScreenOn();
    }

    boolean a(@Nullable View view) {
        if (view == null) {
            return false;
        }
        view.post(new 1(this, view));
        return true;
    }

    @TargetApi(19)
    boolean a(WebView webView, tn tnVar, boolean z) {
        if (!s.h()) {
            return false;
        }
        tnVar.f();
        webView.post(new 2(this, tnVar, webView, z));
        return true;
    }

    void b(View view) {
        try {
            tn tnVar = new tn(this.h, this.i, this.j, this.k);
            a a = a(view, tnVar);
            tnVar.g();
            if (a.a != 0 || a.b != 0) {
                if (a.b != 0 || tnVar.i() != 0) {
                    if (a.b != 0 || !this.e.a(tnVar)) {
                        this.e.c(tnVar);
                    }
                }
            }
        } catch (Throwable e) {
            b.b("Exception in fetchContentOnUIThread", e);
            this.f.a(e, "ContentFetchTask.fetchContent");
        }
    }

    boolean b() {
        try {
            Context b = u.h().b();
            if (b == null) {
                return false;
            }
            ActivityManager activityManager = (ActivityManager) b.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) b.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null) {
                return false;
            }
            List<RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses == null) {
                return false;
            }
            for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (a(runningAppProcessInfo) && !keyguardManager.inKeyguardRestrictedInputMode() && a(b)) {
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

    public tn c() {
        return this.e.a();
    }

    public void d() {
        synchronized (this.d) {
            this.b = false;
            this.d.notifyAll();
            b.a("ContentFetchThread: wakeup");
        }
    }

    public void e() {
        synchronized (this.d) {
            this.b = true;
            b.a("ContentFetchThread: paused, mPause = " + this.b);
        }
    }

    public boolean f() {
        return this.b;
    }

    public void run() {
        while (true) {
            try {
                if (b()) {
                    Activity a = u.h().a();
                    if (a == null) {
                        b.a("ContentFetchThread: no activity. Sleeping.");
                        e();
                    } else {
                        a(a);
                    }
                } else {
                    b.a("ContentFetchTask: sleeping");
                    e();
                }
                Thread.sleep((long) (this.g * 1000));
            } catch (Throwable th) {
                b.b("Error in ContentFetchTask", th);
                this.f.a(th, "ContentFetchTask.run");
            }
            synchronized (this.d) {
                while (this.b) {
                    try {
                        b.a("ContentFetchTask: waiting");
                        this.d.wait();
                    } catch (InterruptedException e) {
                    }
                }
            }
        }
    }
}
