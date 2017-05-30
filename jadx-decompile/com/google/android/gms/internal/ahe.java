package com.google.android.gms.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public class ahe implements com.google.android.gms.clearcut.b.b {
    static Boolean a = null;
    private static final Charset c = Charset.forName("UTF-8");
    final a b;

    static class a {
        final ContentResolver a;

        a(Context context) {
            if (context == null || !a(context)) {
                this.a = null;
                return;
            }
            this.a = context.getContentResolver();
            fg.b(this.a, "gms:playlog:service:sampling_");
        }

        private static boolean a(Context context) {
            if (ahe.a == null) {
                ahe.a = Boolean.valueOf(context.checkCallingOrSelfPermission("com.google.android.providers.gsf.permission.READ_GSERVICES") == 0);
            }
            return ahe.a.booleanValue();
        }

        long a() {
            return this.a == null ? 0 : fg.a(this.a, "android_id", 0);
        }

        String a(String str) {
            if (this.a == null) {
                return null;
            }
            ContentResolver contentResolver = this.a;
            String valueOf = String.valueOf("gms:playlog:service:sampling_");
            String valueOf2 = String.valueOf(str);
            return fg.a(contentResolver, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), null);
        }
    }

    static class b {
        public final String a;
        public final long b;
        public final long c;

        public b(String str, long j, long j2) {
            this.a = str;
            this.b = j;
            this.c = j2;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return c.a(this.a, bVar.a) && c.a(Long.valueOf(this.b), Long.valueOf(bVar.b)) && c.a(Long.valueOf(this.c), Long.valueOf(bVar.c));
        }

        public int hashCode() {
            return c.a(new Object[]{this.a, Long.valueOf(this.b), Long.valueOf(this.c)});
        }
    }

    public ahe() {
        this(new a(null));
    }

    public ahe(Context context) {
        this(new a(context));
    }

    ahe(a aVar) {
        this.b = (a) d.a(aVar);
    }

    static long a(long j) {
        return ahb.a(ByteBuffer.allocate(8).putLong(j).array());
    }

    static long a(String str, long j) {
        if (str == null || str.isEmpty()) {
            return a(j);
        }
        byte[] bytes = str.getBytes(c);
        ByteBuffer allocate = ByteBuffer.allocate(bytes.length + 8);
        allocate.put(bytes);
        allocate.putLong(j);
        return ahb.a(allocate.array());
    }

    static b a(String str) {
        int i = 0;
        if (str == null) {
            return null;
        }
        String str2 = "";
        int indexOf = str.indexOf(44);
        if (indexOf >= 0) {
            str2 = str.substring(0, indexOf);
            i = indexOf + 1;
        }
        int indexOf2 = str.indexOf(47, i);
        if (indexOf2 <= 0) {
            str2 = "LogSamplerImpl";
            String str3 = "Failed to parse the rule: ";
            String valueOf = String.valueOf(str);
            Log.e(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            return null;
        }
        try {
            long parseLong = Long.parseLong(str.substring(i, indexOf2));
            long parseLong2 = Long.parseLong(str.substring(indexOf2 + 1));
            if (parseLong >= 0 && parseLong2 >= 0) {
                return new b(str2, parseLong, parseLong2);
            }
            Log.e("LogSamplerImpl", "negative values not supported: " + parseLong + "/" + parseLong2);
            return null;
        } catch (Throwable e) {
            Throwable th = e;
            str3 = "LogSamplerImpl";
            String str4 = "parseLong() failed while parsing: ";
            valueOf = String.valueOf(str);
            Log.e(str3, valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4), th);
            return null;
        }
    }

    static boolean a(long j, long j2, long j3) {
        if (j2 >= 0 && j3 >= 0) {
            return j3 > 0 && ahf.a(j, j3) < j2;
        } else {
            throw new IllegalArgumentException("negative values not supported: " + j2 + "/" + j3);
        }
    }

    public boolean a(String str, int i) {
        if (str == null || str.isEmpty()) {
            str = i >= 0 ? String.valueOf(i) : null;
        }
        if (str == null) {
            return true;
        }
        long a = this.b.a();
        b a2 = a(this.b.a(str));
        return a2 != null ? a(a(a2.a, a), a2.b, a2.c) : true;
    }
}
