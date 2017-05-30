package com.google.android.gms.internal;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.regex.Pattern;

public class fg {
    public static final Uri a = Uri.parse("content://com.google.android.gsf.gservices");
    public static final Uri b = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final Pattern c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern d = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    static HashMap<String, String> e;
    static HashSet<String> f = new HashSet();
    private static Object g;

    class AnonymousClass1 extends Thread {
        final /* synthetic */ ContentResolver a;

        AnonymousClass1(String str, ContentResolver contentResolver) {
            this.a = contentResolver;
            super(str);
        }

        public void run() {
            Looper.prepare();
            this.a.registerContentObserver(fg.a, true, new ContentObserver(this, new Handler(Looper.myLooper())) {
                final /* synthetic */ AnonymousClass1 a;

                public void onChange(boolean z) {
                    synchronized (fg.class) {
                        fg.e.clear();
                        fg.g = new Object();
                        if (!fg.f.isEmpty()) {
                            fg.b(this.a.a, (String[]) fg.f.toArray(new String[fg.f.size()]));
                        }
                    }
                }
            });
            Looper.loop();
        }
    }

    public static long a(ContentResolver contentResolver, String str, long j) {
        String a = a(contentResolver, str);
        if (a != null) {
            try {
                j = Long.parseLong(a);
            } catch (NumberFormatException e) {
            }
        }
        return j;
    }

    public static String a(ContentResolver contentResolver, String str) {
        return a(contentResolver, str, null);
    }

    public static String a(ContentResolver contentResolver, String str, String str2) {
        synchronized (fg.class) {
            a(contentResolver);
            Object obj = g;
            String str3;
            if (e.containsKey(str)) {
                str3 = (String) e.get(str);
                if (str3 != null) {
                    str2 = str3;
                }
            } else {
                Iterator it = f.iterator();
                while (it.hasNext()) {
                    if (str.startsWith((String) it.next())) {
                        break;
                    }
                }
                Cursor query = contentResolver.query(a, null, null, new String[]{str}, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            str3 = query.getString(1);
                            synchronized (fg.class) {
                                if (obj == g) {
                                    e.put(str, str3);
                                }
                            }
                            if (str3 != null) {
                                str2 = str3;
                            }
                            if (query != null) {
                                query.close();
                            }
                        }
                    } catch (Throwable th) {
                        if (query != null) {
                            query.close();
                        }
                    }
                }
                e.put(str, null);
                if (query != null) {
                    query.close();
                }
            }
        }
        return str2;
    }

    public static Map<String, String> a(ContentResolver contentResolver, String... strArr) {
        Cursor query = contentResolver.query(b, null, null, strArr, null);
        Map<String, String> treeMap = new TreeMap();
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    treeMap.put(query.getString(0), query.getString(1));
                } finally {
                    query.close();
                }
            }
        }
        return treeMap;
    }

    private static void a(ContentResolver contentResolver) {
        if (e == null) {
            e = new HashMap();
            g = new Object();
            new AnonymousClass1("Gservices", contentResolver).start();
        }
    }

    public static void b(ContentResolver contentResolver, String... strArr) {
        Map a = a(contentResolver, strArr);
        synchronized (fg.class) {
            a(contentResolver);
            f.addAll(Arrays.asList(strArr));
            for (Entry entry : a.entrySet()) {
                e.put((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }
}
