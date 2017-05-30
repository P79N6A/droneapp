package com.google.android.gms.internal;

import android.app.Activity;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class na {
    private static final na a = new na();
    private final Map<Object, a> b = new HashMap();
    private final Object c = new Object();

    private static class a {
        @NonNull
        private final Activity a;
        @NonNull
        private final Runnable b;
        @NonNull
        private final Object c;

        public a(@NonNull Activity activity, @NonNull Runnable runnable, @NonNull Object obj) {
            this.a = activity;
            this.b = runnable;
            this.c = obj;
        }

        @NonNull
        public Activity a() {
            return this.a;
        }

        @NonNull
        public Runnable b() {
            return this.b;
        }

        @NonNull
        public Object c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.c.equals(this.c) && aVar.b == this.b && aVar.a == this.a;
        }

        public int hashCode() {
            return this.c.hashCode();
        }
    }

    private static class b extends aij {
        private final List<a> a = new ArrayList();

        private b(aik com_google_android_gms_internal_aik) {
            super(com_google_android_gms_internal_aik);
            this.d.a("StorageOnStopCallback", (aij) this);
        }

        public static b a(Activity activity) {
            aik b = aij.b(new aih(activity));
            b bVar = (b) b.a("StorageOnStopCallback", b.class);
            return bVar == null ? new b(b) : bVar;
        }

        @MainThread
        public void a() {
            ArrayList arrayList;
            synchronized (this.a) {
                arrayList = new ArrayList(this.a);
                this.a.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                if (aVar != null) {
                    Log.d("StorageOnStopCallback", "removing subscription from activity.");
                    aVar.b().run();
                    na.a().a(aVar.c());
                }
            }
        }

        public void a(a aVar) {
            synchronized (this.a) {
                this.a.add(aVar);
            }
        }

        public void b(a aVar) {
            synchronized (this.a) {
                this.a.remove(aVar);
            }
        }
    }

    private na() {
    }

    @NonNull
    public static na a() {
        return a;
    }

    public void a(@NonNull Activity activity, @NonNull Object obj, @NonNull Runnable runnable) {
        synchronized (this.c) {
            a aVar = new a(activity, runnable, obj);
            b.a(activity).a(aVar);
            this.b.put(obj, aVar);
        }
    }

    public void a(@NonNull Object obj) {
        synchronized (this.c) {
            a aVar = (a) this.b.get(obj);
            if (aVar != null) {
                b.a(aVar.a()).b(aVar);
            }
        }
    }
}
