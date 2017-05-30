package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Service;
import android.content.ComponentCallbacks2;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.util.Pair;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.tagmanager.TagManagerService;
import com.google.android.gms.tagmanager.af;
import com.google.android.gms.tagmanager.aj;
import com.tencent.mm.sdk.platformtools.LocaleUtil;
import java.io.File;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class apx {
    private static final Pattern a = Pattern.compile("(gtm-[a-z0-9]{1,10})\\.json", 2);
    private static volatile apx b;
    private static c r = new c() {
        public apx a(Context context, aj ajVar, af afVar) {
            return new apx(context, ajVar, afVar, new aqa(context), apz.a(), apz.b(), apn.a(), new a(context));
        }
    };
    private final Context c;
    private final aj d;
    private final af e;
    private final aqa f;
    private final ExecutorService g;
    private final ScheduledExecutorService h;
    private final apn i;
    private final a j;
    private final Object k = new Object();
    private String l;
    private String m;
    private int n = 1;
    private final Queue<Runnable> o = new LinkedList();
    private volatile boolean p = false;
    private volatile boolean q = false;

    public interface c {
        apx a(Context context, aj ajVar, af afVar);
    }

    protected static class a {
        private final Context a;

        public a(Context context) {
            this.a = context;
        }

        public String[] a() {
            return this.a.getAssets().list("");
        }

        public String[] a(String str) {
            return this.a.getAssets().list(str);
        }
    }

    private class b extends com.google.android.gms.internal.ape.a {
        final /* synthetic */ apx a;

        private b(apx com_google_android_gms_internal_apx) {
            this.a = com_google_android_gms_internal_apx;
        }

        public void a(final boolean z, final String str) {
            this.a.g.submit(new Runnable(this) {
                final /* synthetic */ b c;

                public void run() {
                    if (this.c.a.n == 2) {
                        String str;
                        if (z) {
                            this.c.a.n = 3;
                            str = str;
                            aph.d(new StringBuilder(String.valueOf(str).length() + 18).append("Container ").append(str).append(" loaded.").toString());
                        } else {
                            this.c.a.n = 4;
                            String str2 = "Error loading container:";
                            str = String.valueOf(str);
                            aph.a(str.length() != 0 ? str2.concat(str) : new String(str2));
                        }
                        while (!this.c.a.o.isEmpty()) {
                            this.c.a.g.submit((Runnable) this.c.a.o.remove());
                        }
                        return;
                    }
                    aph.b("Container load callback completed after timeout");
                }
            });
        }
    }

    apx(Context context, aj ajVar, af afVar, aqa com_google_android_gms_internal_aqa, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService, apn com_google_android_gms_internal_apn, a aVar) {
        d.a(context);
        d.a(ajVar);
        this.c = context;
        this.d = ajVar;
        this.e = afVar;
        this.f = com_google_android_gms_internal_aqa;
        this.g = executorService;
        this.h = scheduledExecutorService;
        this.i = com_google_android_gms_internal_apn;
        this.j = aVar;
    }

    public static apx a(Context context, aj ajVar, af afVar) {
        d.a(context);
        d.a(context);
        apx com_google_android_gms_internal_apx = b;
        if (com_google_android_gms_internal_apx == null) {
            synchronized (apx.class) {
                com_google_android_gms_internal_apx = b;
                if (com_google_android_gms_internal_apx == null) {
                    com_google_android_gms_internal_apx = r.a(context, ajVar, afVar);
                    b = com_google_android_gms_internal_apx;
                }
            }
        }
        return com_google_android_gms_internal_apx;
    }

    private static boolean a(Context context, Class<? extends Service> cls) {
        try {
            ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, cls), 4);
            if (serviceInfo != null && serviceInfo.enabled) {
                return true;
            }
        } catch (NameNotFoundException e) {
        }
        return false;
    }

    private Pair<String, String> b(String[] strArr) {
        int i = 0;
        aph.d("Looking up container asset.");
        if (this.l != null && this.m != null) {
            return Pair.create(this.l, this.m);
        }
        if (strArr == null) {
            try {
                strArr = b().a("containers");
            } catch (Throwable e) {
                aph.a(String.format("Failed to enumerate assets in folder %s", new Object[]{"containers"}), e);
                return Pair.create(null, null);
            }
        }
        int i2 = 0;
        for (int i3 = 0; i3 < strArr.length; i3++) {
            String valueOf;
            Matcher matcher = a.matcher(strArr[i3]);
            if (!matcher.matches()) {
                aph.b(String.format("Ignoring container asset %s (does not match %s)", new Object[]{strArr[i3], a.pattern()}));
            } else if (i2 == 0) {
                this.l = matcher.group(1);
                String valueOf2 = String.valueOf("containers");
                r3 = String.valueOf(File.separator);
                valueOf = String.valueOf(strArr[i3]);
                this.m = new StringBuilder(((String.valueOf(valueOf2).length() + 0) + String.valueOf(r3).length()) + String.valueOf(valueOf).length()).append(valueOf2).append(r3).append(valueOf).toString();
                r3 = "Asset found for container ";
                valueOf2 = String.valueOf(this.l);
                aph.d(valueOf2.length() != 0 ? r3.concat(valueOf2) : new String(r3));
                i2 = 1;
            } else {
                valueOf = "Extra container asset found, will not be loaded: ";
                r3 = String.valueOf(strArr[i3]);
                aph.b(r3.length() != 0 ? valueOf.concat(r3) : new String(valueOf));
            }
        }
        if (i2 == 0) {
            aph.b("No container asset found in /assets/containers. Checking top level /assets directory for container assets.");
            try {
                String[] a = b().a();
                while (i < a.length) {
                    Matcher matcher2 = a.matcher(a[i]);
                    if (matcher2.matches()) {
                        String valueOf3;
                        if (i2 == 0) {
                            this.l = matcher2.group(1);
                            this.m = a[i];
                            valueOf2 = "Asset found for container ";
                            valueOf3 = String.valueOf(this.l);
                            aph.d(valueOf3.length() != 0 ? valueOf2.concat(valueOf3) : new String(valueOf2));
                            aph.b("Loading container assets from top level /assets directory. Please move the container asset to /assets/containers");
                            i2 = 1;
                        } else {
                            valueOf = "Extra container asset found, will not be loaded: ";
                            valueOf3 = String.valueOf(a[i]);
                            aph.b(valueOf3.length() != 0 ? valueOf.concat(valueOf3) : new String(valueOf));
                        }
                    }
                    i++;
                }
            } catch (Throwable e2) {
                aph.a("Failed to enumerate assets.", e2);
                return Pair.create(null, null);
            }
        }
        return Pair.create(this.l, this.m);
    }

    private a b() {
        return this.j;
    }

    @WorkerThread
    private void c() {
        try {
            this.d.a(new com.google.android.gms.tagmanager.ai.a(this) {
                final /* synthetic */ apx a;

                {
                    this.a = r1;
                }

                public void a(String str, String str2, Bundle bundle, long j) {
                    final String stringBuilder = new StringBuilder(String.valueOf(str).length() + 4).append(str).append("+").append("gtm").toString();
                    final String str3 = str2;
                    final Bundle bundle2 = bundle;
                    final long j2 = j;
                    final String str4 = str;
                    this.a.g.submit(new Runnable(this) {
                        final /* synthetic */ AnonymousClass2 f;
                        private boolean g = false;

                        public void run() {
                            if (this.f.a.n == 3) {
                                this.f.a.f.a(str3, bundle2, stringBuilder, j2, true);
                            } else if (this.f.a.n == 4) {
                                aph.d(String.format("Container failed to load: skipping  event interceptor by logging event back to Firebase directly: name = %s, origin = %s, params = %s.", new Object[]{str3, stringBuilder, bundle2}));
                                try {
                                    this.f.a.d.a(stringBuilder, str3, bundle2, j2);
                                } catch (RemoteException e) {
                                    String str = "Error logging event on measurement proxy";
                                    String valueOf = String.valueOf(e.getMessage());
                                    aph.a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                                }
                            } else if (this.f.a.n != 1 && this.f.a.n != 2) {
                                aph.b("Unexpected state:" + this.f.a.n);
                            } else if (this.g) {
                                aph.b("Invalid state - not expecting to see a deferred eventduring container loading.");
                            } else {
                                aph.d(String.format("Container not loaded yet: deferring event interceptor by enqueuing the event: name = %s, origin = %s, params = %s.", new Object[]{str3, str4, bundle2}));
                                this.g = true;
                                this.f.a.o.add(this);
                            }
                        }
                    });
                }
            });
        } catch (RemoteException e) {
            String str = "Error communicating with measurement proxy:";
            String valueOf = String.valueOf(e.getMessage());
            aph.a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
        try {
            this.d.a(new com.google.android.gms.tagmanager.ag.a(this) {
                final /* synthetic */ apx a;

                {
                    this.a = r1;
                }

                public void a(String str, String str2, Bundle bundle, long j) {
                    if (!str.endsWith("+gtm")) {
                        final String stringBuilder = new StringBuilder(String.valueOf(str).length() + 4).append(str).append("+").append("gtm").toString();
                        final String str3 = str2;
                        final Bundle bundle2 = bundle;
                        final long j2 = j;
                        final String str4 = str;
                        this.a.g.submit(new Runnable(this) {
                            final /* synthetic */ AnonymousClass3 f;
                            private boolean g = false;

                            public void run() {
                                if (this.f.a.n == 3) {
                                    this.f.a.f.a(str3, bundle2, stringBuilder, j2, false);
                                } else if (this.f.a.n == 1 || this.f.a.n == 2) {
                                    if (this.g) {
                                        aph.b("Invalid state - not expecting to see a deferred event during container loading.");
                                        return;
                                    }
                                    aph.d(String.format("Container not loaded yet: deferring event listener by enqueuing the event: name = %s, origin = %s, params = %s.", new Object[]{str3, str4, bundle2}));
                                    this.g = true;
                                    this.f.a.o.add(this);
                                } else if (this.f.a.n == 4) {
                                    aph.d(String.format("Container failed to load: skipping event listener by ignoring the event: name = %s, origin = %s, params = %s.", new Object[]{str3, str4, bundle2}));
                                } else {
                                    aph.b("Unexpected state:" + this.f.a.n);
                                }
                            }
                        });
                    }
                }
            });
        } catch (RemoteException e2) {
            str = "Error communicating with measurement proxy:";
            valueOf = String.valueOf(e2.getMessage());
            aph.a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
    }

    @TargetApi(14)
    private void d() {
        if (VERSION.SDK_INT >= 14) {
            this.c.registerComponentCallbacks(new ComponentCallbacks2(this) {
                final /* synthetic */ apx a;

                {
                    this.a = r1;
                }

                public void onConfigurationChanged(Configuration configuration) {
                }

                public void onLowMemory() {
                }

                public void onTrimMemory(int i) {
                    if (i == 20) {
                        this.a.g.submit(new Runnable(this) {
                            final /* synthetic */ AnonymousClass6 a;

                            {
                                this.a = r1;
                            }

                            public void run() {
                                aph.d("App's UI deactivated. Dispatching hits.");
                                this.a.a.f.c();
                            }
                        });
                    }
                }
            });
        }
    }

    @WorkerThread
    public void a() {
        a(null);
    }

    void a(final Uri uri) {
        this.g.submit(new Runnable(this) {
            final /* synthetic */ apx b;

            public void run() {
                String valueOf = String.valueOf(uri);
                aph.d(new StringBuilder(String.valueOf(valueOf).length() + 25).append("Preview requested to uri ").append(valueOf).toString());
                synchronized (this.b.k) {
                    if (this.b.n == 2) {
                        aph.d("Still initializing. Defer preview container loading.");
                        this.b.o.add(this);
                        return;
                    }
                    valueOf = (String) this.b.b(null).first;
                    if (valueOf == null) {
                        aph.b("Preview failed (no container found)");
                    } else if (!this.b.i.a(valueOf, uri)) {
                        valueOf = String.valueOf(uri);
                        aph.b(new StringBuilder(String.valueOf(valueOf).length() + 73).append("Cannot preview the app with the uri: ").append(valueOf).append(". Launching current version instead.").toString());
                    } else if (this.b.p) {
                        valueOf = String.valueOf(uri);
                        aph.c(new StringBuilder(String.valueOf(valueOf).length() + 36).append("Starting to load preview container: ").append(valueOf).toString());
                        if (this.b.f.b()) {
                            this.b.p = false;
                            this.b.n = 1;
                            this.b.a();
                            return;
                        }
                        aph.b("Failed to reset TagManager service for preview");
                    } else {
                        valueOf = String.valueOf(uri);
                        aph.d(new StringBuilder(String.valueOf(valueOf).length() + 84).append("Deferring container loading for preview uri: ").append(valueOf).append("(Tag Manager has not been initialized).").toString());
                    }
                }
            }
        });
    }

    @WorkerThread
    public void a(String str, @Nullable String str2) {
        a(str, str2, null);
    }

    @WorkerThread
    public void a(final String str, @Nullable final String str2, @Nullable final String str3) {
        this.g.submit(new Runnable(this) {
            final /* synthetic */ apx d;

            public void run() {
                String str = str;
                aph.d(new StringBuilder(String.valueOf(str).length() + 28).append("Starting to load container ").append(str).append(".").toString());
                if (this.d.n != 1) {
                    aph.b("Unexpected state - container loading already initiated.");
                    return;
                }
                this.d.n = 2;
                this.d.f.a(str, str2, str3, new b());
            }
        });
        this.h.schedule(new Runnable(this) {
            final /* synthetic */ apx a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.g.submit(new Runnable(this) {
                    final /* synthetic */ AnonymousClass5 a;

                    {
                        this.a = r1;
                    }

                    public void run() {
                        if (this.a.a.n == 1 || this.a.a.n == 2) {
                            this.a.a.n = 4;
                            aph.a("Container load timed out after 5000ms.");
                            while (!this.a.a.o.isEmpty()) {
                                this.a.a.g.submit((Runnable) this.a.a.o.remove());
                            }
                        }
                    }
                });
            }
        }, 5000, TimeUnit.MILLISECONDS);
    }

    @WorkerThread
    public void a(String[] strArr) {
        aph.d("Initializing Tag Manager.");
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.k) {
            if (this.p) {
                return;
            }
            try {
                if (a(this.c, TagManagerService.class)) {
                    Pair b = b(strArr);
                    String str = (String) b.first;
                    String str2 = (String) b.second;
                    if (str == null || str2 == null) {
                        aph.b("Tag Manager's event handler WILL NOT be installed (no container loaded)");
                    } else {
                        String str3 = "Loading container ";
                        String valueOf = String.valueOf(str);
                        aph.c(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
                        a(str, str2);
                        if (!this.q) {
                            aph.c("Installing Tag Manager event handler.");
                            this.q = true;
                            c();
                            d();
                            aph.c("Tag Manager event handler installed.");
                        }
                    }
                    this.p = true;
                    aph.c("Tag Manager initilization took " + (System.currentTimeMillis() - currentTimeMillis) + LocaleUtil.MALAY);
                    return;
                }
                boolean z = "Tag Manager fails to initialize (TagManagerService not enabled in the manifest)";
                aph.b(z);
                this.p = z;
            } finally {
                this.p = true;
            }
        }
    }
}
