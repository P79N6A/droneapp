package com.google.android.gms.internal;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ajg {
    public static String a = "Volley";
    public static boolean b = Log.isLoggable(a, 2);

    static class a {
        public static final boolean a = ajg.b;
        private final List<a> b = new ArrayList();
        private boolean c = false;

        private static class a {
            public final String a;
            public final long b;
            public final long c;

            public a(String str, long j, long j2) {
                this.a = str;
                this.b = j;
                this.c = j2;
            }
        }

        a() {
        }

        private long a() {
            if (this.b.size() == 0) {
                return 0;
            }
            return ((a) this.b.get(this.b.size() - 1)).c - ((a) this.b.get(0)).c;
        }

        public synchronized void a(String str) {
            this.c = true;
            if (a() > 0) {
                long j = ((a) this.b.get(0)).c;
                ajg.b("(%-4d ms) %s", Long.valueOf(r2), str);
                long j2 = j;
                for (a aVar : this.b) {
                    ajg.b("(+%-4d) [%2d] %s", Long.valueOf(aVar.c - j2), Long.valueOf(aVar.b), aVar.a);
                    j2 = aVar.c;
                }
            }
        }

        public synchronized void a(String str, long j) {
            if (this.c) {
                throw new IllegalStateException("Marker added to finished log");
            }
            this.b.add(new a(str, j, SystemClock.elapsedRealtime()));
        }

        protected void finalize() {
            if (!this.c) {
                a("Request on the loose");
                ajg.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
            }
        }
    }

    public static void a(String str, Object... objArr) {
        if (b) {
            Log.v(a, d(str, objArr));
        }
    }

    public static void a(Throwable th, String str, Object... objArr) {
        Log.e(a, d(str, objArr), th);
    }

    public static void b(String str, Object... objArr) {
        Log.d(a, d(str, objArr));
    }

    public static void c(String str, Object... objArr) {
        Log.e(a, d(str, objArr));
    }

    private static String d(String str, Object... objArr) {
        String valueOf;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        String str2 = "<unknown>";
        for (int i = 2; i < stackTrace.length; i++) {
            if (!stackTrace[i].getClass().equals(ajg.class)) {
                str2 = stackTrace[i].getClassName();
                str2 = str2.substring(str2.lastIndexOf(46) + 1);
                str2 = str2.substring(str2.lastIndexOf(36) + 1);
                valueOf = String.valueOf(stackTrace[i].getMethodName());
                valueOf = new StringBuilder((String.valueOf(str2).length() + 1) + String.valueOf(valueOf).length()).append(str2).append(".").append(valueOf).toString();
                break;
            }
        }
        valueOf = str2;
        return String.format(Locale.US, "[%d] %s: %s", new Object[]{Long.valueOf(Thread.currentThread().getId()), valueOf, str});
    }
}
