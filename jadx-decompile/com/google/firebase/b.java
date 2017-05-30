package com.google.firebase;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.UiThread;
import android.support.v4.util.ArrayMap;
import android.util.Log;
import com.fimi.soul.entity.User;
import com.google.android.gms.common.internal.ak;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.util.a;
import com.google.android.gms.common.util.c;
import com.google.android.gms.common.util.s;
import com.google.android.gms.common.util.t;
import com.google.android.gms.g.f;
import com.google.android.gms.g.i;
import com.google.android.gms.internal.mn;
import com.google.android.gms.internal.mp;
import com.google.android.gms.internal.mq;
import com.google.android.gms.internal.mr;
import com.google.firebase.auth.o;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.codehaus.jackson.org.objectweb.asm.Opcodes;

public class b {
    public static final String a = "[DEFAULT]";
    static final Map<String, b> b = new ArrayMap();
    private static final List<String> c = Arrays.asList(new String[]{"com.google.firebase.auth.FirebaseAuth", "com.google.firebase.iid.FirebaseInstanceId"});
    private static final List<String> d = Collections.singletonList("com.google.firebase.crash.FirebaseCrash");
    private static final List<String> e = Arrays.asList(new String[]{"com.google.android.gms.measurement.AppMeasurement"});
    private static final List<String> f = Arrays.asList(new String[0]);
    private static final Set<String> g = Collections.emptySet();
    private static final Object h = new Object();
    private final Context i;
    private final String j;
    private final e k;
    private final AtomicBoolean l = new AtomicBoolean(false);
    private final AtomicBoolean m = new AtomicBoolean();
    private final List<a> n = new CopyOnWriteArrayList();
    private final List<b> o = new CopyOnWriteArrayList();
    private final List<Object> p = new CopyOnWriteArrayList();
    private mq q;

    protected b(Context context, String str, e eVar) {
        this.i = (Context) d.a((Object) context);
        this.j = d.a(str);
        this.k = (e) d.a((Object) eVar);
    }

    public static b a(Context context, e eVar) {
        return a(context, eVar, a);
    }

    public static b a(Context context, e eVar, String str) {
        Object bVar;
        mp a = mp.a(context);
        c(context);
        String b = b(str);
        if (!(context instanceof Application)) {
            Object applicationContext = context.getApplicationContext();
        }
        synchronized (h) {
            d.a(!b.containsKey(b), new StringBuilder(String.valueOf(b).length() + 33).append("FirebaseApp name ").append(b).append(" already exists!").toString());
            d.a(applicationContext, (Object) "Application context cannot be null.");
            bVar = new b(applicationContext, b, eVar);
            b.put(b, bVar);
        }
        a.a(bVar);
        bVar.a(b.class, bVar, c);
        if (bVar.e()) {
            bVar.a(b.class, bVar, d);
            bVar.a(Context.class, bVar.a(), e);
        }
        return bVar;
    }

    public static b a(@NonNull String str) {
        b bVar;
        synchronized (h) {
            bVar = (b) b.get(b(str));
            if (bVar != null) {
            } else {
                String str2;
                Iterable i = i();
                if (i.isEmpty()) {
                    str2 = "";
                } else {
                    String str3 = "Available app names: ";
                    str2 = String.valueOf(ak.a(", ").a(i));
                    str2 = str2.length() != 0 ? str3.concat(str2) : new String(str3);
                }
                throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", new Object[]{str, str2}));
            }
        }
        return bVar;
    }

    public static List<b> a(Context context) {
        List<b> arrayList;
        mp a = mp.a(context);
        synchronized (h) {
            arrayList = new ArrayList(b.values());
            Set<String> b = mp.a().b();
            b.removeAll(b.keySet());
            for (String str : b) {
                arrayList.add(a(context, a.a(str), str));
            }
        }
        return arrayList;
    }

    private <T> void a(Class<T> cls, T t, Iterable<String> iterable) {
        boolean z;
        String valueOf;
        if (s.m()) {
            boolean isDeviceProtectedStorage = this.i.isDeviceProtectedStorage();
            if (isDeviceProtectedStorage) {
                c.a(this.i);
            }
            z = isDeviceProtectedStorage;
        } else {
            z = false;
        }
        for (String valueOf2 : iterable) {
            if (z) {
                try {
                    if (!f.contains(valueOf2)) {
                    }
                } catch (ClassNotFoundException e) {
                    if (g.contains(valueOf2)) {
                        throw new IllegalStateException(String.valueOf(valueOf2).concat(" is missing, but is required. Check if it has been removed by Proguard."));
                    }
                    Log.d("FirebaseApp", String.valueOf(valueOf2).concat(" is not linked. Skipping initialization."));
                } catch (NoSuchMethodException e2) {
                    throw new IllegalStateException(String.valueOf(valueOf2).concat("#getInstance has been removed by Proguard. Add keep rule to prevent it."));
                } catch (Throwable e3) {
                    Log.wtf("FirebaseApp", "Firebase API initialization failure.", e3);
                } catch (Throwable e4) {
                    String str = "FirebaseApp";
                    String str2 = "Failed to initialize ";
                    valueOf2 = String.valueOf(valueOf2);
                    Log.wtf(str, valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2), e4);
                }
            }
            Method method = Class.forName(valueOf2).getMethod("getInstance", new Class[]{cls});
            int modifiers = method.getModifiers();
            if (Modifier.isPublic(modifiers) && Modifier.isStatic(modifiers)) {
                method.invoke(null, new Object[]{t});
            }
        }
    }

    public static void a(boolean z) {
        synchronized (h) {
            Iterator it = new ArrayList(b.values()).iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (bVar.l.get()) {
                    bVar.c(z);
                }
            }
        }
    }

    public static b b(Context context) {
        b d;
        synchronized (h) {
            if (b.containsKey(a)) {
                d = d();
            } else {
                e a = e.a(context);
                if (a == null) {
                    d = null;
                } else {
                    d = a(context, a);
                }
            }
        }
        return d;
    }

    private static String b(@NonNull String str) {
        return str.trim();
    }

    @TargetApi(14)
    private static void c(Context context) {
        if (s.d() && (context.getApplicationContext() instanceof Application)) {
            mn.a((Application) context.getApplicationContext());
        }
    }

    private void c(boolean z) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        for (b a : this.o) {
            a.a(z);
        }
    }

    @Nullable
    public static b d() {
        b bVar;
        synchronized (h) {
            bVar = (b) b.get(a);
            if (bVar == null) {
                String valueOf = String.valueOf(t.b());
                throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + Opcodes.INEG).append("Default FirebaseApp is not initialized in this process ").append(valueOf).append(". Make sure to call FirebaseApp.initializeApp(Context) first.").toString());
            }
        }
        return bVar;
    }

    private void h() {
        d.a(!this.m.get(), (Object) "FirebaseApp was deleted");
    }

    private static List<String> i() {
        Collection aVar = new a();
        synchronized (h) {
            for (b b : b.values()) {
                aVar.add(b.b());
            }
            mp a = mp.a();
            if (a != null) {
                aVar.addAll(a.b());
            }
        }
        List<String> arrayList = new ArrayList(aVar);
        Collections.sort(arrayList);
        return arrayList;
    }

    private void j() {
        a(b.class, (Object) this, c);
        if (e()) {
            a(b.class, (Object) this, d);
            a(Context.class, this.i, e);
        }
    }

    @NonNull
    public Context a() {
        h();
        return this.i;
    }

    public void a(@NonNull mq mqVar) {
        this.q = (mq) d.a((Object) mqVar);
    }

    @UiThread
    public void a(@NonNull mr mrVar) {
        Log.d("FirebaseApp", "Notifying auth state listeners.");
        int i = 0;
        for (a a : this.n) {
            a.a(mrVar);
            i++;
        }
        Log.d("FirebaseApp", String.format("Notified %d auth state listeners.", new Object[]{Integer.valueOf(i)}));
    }

    public void a(@NonNull a aVar) {
        h();
        d.a((Object) aVar);
        this.n.add(aVar);
    }

    public void a(b bVar) {
        h();
        if (this.l.get() && mn.a().b()) {
            bVar.a(true);
        }
        this.o.add(bVar);
    }

    public f<o> b(boolean z) {
        h();
        return this.q == null ? i.a(new a("firebase-auth is not linked, please fall back to unauthenticated mode.")) : this.q.a(z);
    }

    @NonNull
    public String b() {
        h();
        return this.j;
    }

    @NonNull
    public e c() {
        h();
        return this.k;
    }

    public boolean e() {
        return a.equals(b());
    }

    public boolean equals(Object obj) {
        return !(obj instanceof b) ? false : this.j.equals(((b) obj).b());
    }

    public String f() {
        String valueOf = String.valueOf(c.c(b().getBytes()));
        String valueOf2 = String.valueOf(c.c(c().b().getBytes()));
        return new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length()).append(valueOf).append("+").append(valueOf2).toString();
    }

    public int hashCode() {
        return this.j.hashCode();
    }

    public String toString() {
        return com.google.android.gms.common.internal.c.a((Object) this).a(User.FN_NAME, this.j).a("options", this.k).toString();
    }
}
