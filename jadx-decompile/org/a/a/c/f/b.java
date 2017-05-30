package org.a.a.c.f;

import java.lang.ref.SoftReference;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

@org.a.a.a.b
public final class b {
    public static final String a = "EEE, dd MMM yyyy HH:mm:ss zzz";
    public static final String b = "EEE, dd-MMM-yy HH:mm:ss zzz";
    public static final String c = "EEE MMM d HH:mm:ss yyyy";
    public static final TimeZone d = TimeZone.getTimeZone("GMT");
    private static final String[] e = new String[]{a, b, c};
    private static final Date f;

    static final class a {
        private static final ThreadLocal<SoftReference<Map<String, SimpleDateFormat>>> a = new ThreadLocal<SoftReference<Map<String, SimpleDateFormat>>>() {
            protected SoftReference<Map<String, SimpleDateFormat>> a() {
                return new SoftReference(new HashMap());
            }

            protected /* synthetic */ Object initialValue() {
                return a();
            }
        };

        a() {
        }

        public static SimpleDateFormat a(String str) {
            Map map;
            Map map2 = (Map) ((SoftReference) a.get()).get();
            if (map2 == null) {
                HashMap hashMap = new HashMap();
                a.set(new SoftReference(hashMap));
                map = hashMap;
            } else {
                map = map2;
            }
            SimpleDateFormat simpleDateFormat = (SimpleDateFormat) map.get(str);
            if (simpleDateFormat != null) {
                return simpleDateFormat;
            }
            simpleDateFormat = new SimpleDateFormat(str, Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            map.put(str, simpleDateFormat);
            return simpleDateFormat;
        }

        public static void a() {
            a.remove();
        }
    }

    static {
        Calendar instance = Calendar.getInstance();
        instance.setTimeZone(d);
        instance.set(2000, 0, 1, 0, 0, 0);
        instance.set(14, 0);
        f = instance.getTime();
    }

    private b() {
    }

    public static String a(Date date) {
        return a(date, a);
    }

    public static String a(Date date, String str) {
        org.a.a.o.a.a((Object) date, "Date");
        org.a.a.o.a.a((Object) str, "Pattern");
        return a.a(str).format(date);
    }

    public static Date a(String str) {
        return a(str, null, null);
    }

    public static Date a(String str, String[] strArr) {
        return a(str, strArr, null);
    }

    public static Date a(String str, String[] strArr, Date date) {
        org.a.a.o.a.a((Object) str, "Date value");
        if (strArr == null) {
            strArr = e;
        }
        if (date == null) {
            date = f;
        }
        if (str.length() > 1 && str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1);
        }
        for (String a : r6) {
            SimpleDateFormat a2 = a.a(a);
            a2.set2DigitYearStart(date);
            ParsePosition parsePosition = new ParsePosition(0);
            Date parse = a2.parse(str, parsePosition);
            if (parsePosition.getIndex() != 0) {
                return parse;
            }
        }
        return null;
    }

    public static void a() {
        a.a();
    }
}
