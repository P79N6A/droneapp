package com.google.android.gms.analytics.internal;

import android.util.Log;
import com.google.android.gms.common.internal.d;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Map;
import java.util.Map.Entry;
import org.codehaus.jackson.org.objectweb.asm.signature.SignatureVisitor;

public class g extends t {
    private static String a = "3";
    private static String b = "01VDIWEA?";
    private static g c;

    public g(v vVar) {
        super(vVar);
    }

    public static g b() {
        return c;
    }

    protected String a(Object obj) {
        if (obj == null) {
            return null;
        }
        Object l = obj instanceof Integer ? new Long((long) ((Integer) obj).intValue()) : obj;
        if (!(l instanceof Long)) {
            return l instanceof Boolean ? String.valueOf(l) : l instanceof Throwable ? l.getClass().getCanonicalName() : Constants.ACCEPT_TIME_SEPARATOR_SERVER;
        } else {
            if (Math.abs(((Long) l).longValue()) < 100) {
                return String.valueOf(l);
            }
            String str = String.valueOf(l).charAt(0) == SignatureVisitor.SUPER ? Constants.ACCEPT_TIME_SEPARATOR_SERVER : "";
            String valueOf = String.valueOf(Math.abs(((Long) l).longValue()));
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1))));
            stringBuilder.append("...");
            stringBuilder.append(str);
            stringBuilder.append(Math.round(Math.pow(10.0d, (double) valueOf.length()) - 1.0d));
            return stringBuilder.toString();
        }
    }

    protected void a() {
        synchronized (g.class) {
            c = this;
        }
    }

    public void a(int i, String str, Object obj, Object obj2, Object obj3) {
        String str2 = (String) ao.c.a();
        if (Log.isLoggable(str2, i)) {
            Log.println(i, str2, s.c(str, obj, obj2, obj3));
        }
        if (i >= 5) {
            b(i, str, obj, obj2, obj3);
        }
    }

    public void a(c cVar, String str) {
        Object obj;
        if (str == null) {
            obj = "no reason provided";
        }
        Object cVar2 = cVar != null ? cVar.toString() : "no hit data";
        String str2 = "Discarding hit. ";
        String valueOf = String.valueOf(obj);
        d(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), cVar2);
    }

    public void a(Map<String, String> map, String str) {
        Object obj;
        Object stringBuilder;
        if (str == null) {
            obj = "no reason provided";
        }
        if (map != null) {
            StringBuilder stringBuilder2 = new StringBuilder();
            for (Entry entry : map.entrySet()) {
                if (stringBuilder2.length() > 0) {
                    stringBuilder2.append(',');
                }
                stringBuilder2.append((String) entry.getKey());
                stringBuilder2.append(SignatureVisitor.INSTANCEOF);
                stringBuilder2.append((String) entry.getValue());
            }
            stringBuilder = stringBuilder2.toString();
        } else {
            stringBuilder = "no hit data";
        }
        String str2 = "Discarding hit. ";
        String valueOf = String.valueOf(obj);
        d(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), stringBuilder);
    }

    public synchronized void b(int i, String str, Object obj, Object obj2, Object obj3) {
        int i2 = 0;
        synchronized (this) {
            d.a((Object) str);
            if (i >= 0) {
                i2 = i;
            }
            int length = i2 >= b.length() ? b.length() - 1 : i2;
            char c = q().b() ? q().a() ? 'P' : 'C' : q().a() ? 'p' : 'c';
            String str2 = a;
            char charAt = b.charAt(length);
            String str3 = u.a;
            String valueOf = String.valueOf(s.c(str, a(obj), a(obj2), a(obj3)));
            String stringBuilder = new StringBuilder(((String.valueOf(str2).length() + 3) + String.valueOf(str3).length()) + String.valueOf(valueOf).length()).append(str2).append(charAt).append(c).append(str3).append(":").append(valueOf).toString();
            if (stringBuilder.length() > 1024) {
                stringBuilder = stringBuilder.substring(0, 1024);
            }
            j n = k().n();
            if (n != null) {
                n.g().a(stringBuilder);
            }
        }
    }
}
