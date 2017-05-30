package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.hj.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class cw {
    private static final Object a = null;
    private static Long b = new Long(0);
    private static Double c = new Double(0.0d);
    private static cv d = cv.a(0);
    private static String e = new String("");
    private static Boolean f = new Boolean(false);
    private static List<Object> g = new ArrayList(0);
    private static Map<Object, Object> h = new HashMap();
    private static a i = f(e);

    public static a a(String str) {
        a aVar = new a();
        aVar.a = 5;
        aVar.g = str;
        return aVar;
    }

    public static Object a() {
        return null;
    }

    public static String a(a aVar) {
        return a(f(aVar));
    }

    public static String a(Object obj) {
        return obj == null ? e : obj.toString();
    }

    public static cv b(a aVar) {
        return b(f(aVar));
    }

    public static cv b(Object obj) {
        return obj instanceof cv ? (cv) obj : i(obj) ? cv.a(j(obj)) : g(obj) ? cv.a(Double.valueOf(h(obj))) : b(a(obj));
    }

    private static cv b(String str) {
        try {
            return cv.a(str);
        } catch (NumberFormatException e) {
            aw.a(new StringBuilder(String.valueOf(str).length() + 33).append("Failed to convert '").append(str).append("' to a number.").toString());
            return d;
        }
    }

    public static Long b() {
        return b;
    }

    public static Double c() {
        return c;
    }

    public static Long c(a aVar) {
        return c(f(aVar));
    }

    public static Long c(Object obj) {
        return i(obj) ? Long.valueOf(j(obj)) : c(a(obj));
    }

    private static Long c(String str) {
        cv b = b(str);
        return b == d ? b : Long.valueOf(b.longValue());
    }

    public static Boolean d() {
        return f;
    }

    public static Double d(a aVar) {
        return d(f(aVar));
    }

    public static Double d(Object obj) {
        return g(obj) ? Double.valueOf(h(obj)) : d(a(obj));
    }

    private static Double d(String str) {
        cv b = b(str);
        return b == d ? c : Double.valueOf(b.doubleValue());
    }

    public static cv e() {
        return d;
    }

    public static Boolean e(a aVar) {
        return e(f(aVar));
    }

    public static Boolean e(Object obj) {
        return obj instanceof Boolean ? (Boolean) obj : e(a(obj));
    }

    private static Boolean e(String str) {
        return "true".equalsIgnoreCase(str) ? Boolean.TRUE : "false".equalsIgnoreCase(str) ? Boolean.FALSE : f;
    }

    public static a f(Object obj) {
        boolean z = false;
        a aVar = new a();
        if (obj instanceof a) {
            return (a) obj;
        }
        if (obj instanceof String) {
            aVar.a = 1;
            aVar.b = (String) obj;
        } else if (obj instanceof List) {
            aVar.a = 2;
            List<Object> list = (List) obj;
            r5 = new ArrayList(list.size());
            r1 = false;
            for (Object f : list) {
                a f2 = f(f);
                if (f2 == i) {
                    return i;
                }
                r0 = r1 || f2.l;
                r5.add(f2);
                r1 = r0;
            }
            aVar.c = (a[]) r5.toArray(new a[0]);
            z = r1;
        } else if (obj instanceof Map) {
            aVar.a = 3;
            Set<Entry> entrySet = ((Map) obj).entrySet();
            r5 = new ArrayList(entrySet.size());
            List arrayList = new ArrayList(entrySet.size());
            r1 = false;
            for (Entry entry : entrySet) {
                a f3 = f(entry.getKey());
                a f4 = f(entry.getValue());
                if (f3 == i || f4 == i) {
                    return i;
                }
                r0 = r1 || f3.l || f4.l;
                r5.add(f3);
                arrayList.add(f4);
                r1 = r0;
            }
            aVar.d = (a[]) r5.toArray(new a[0]);
            aVar.e = (a[]) arrayList.toArray(new a[0]);
            z = r1;
        } else if (g(obj)) {
            aVar.a = 1;
            aVar.b = obj.toString();
        } else if (i(obj)) {
            aVar.a = 6;
            aVar.h = j(obj);
        } else if (obj instanceof Boolean) {
            aVar.a = 8;
            aVar.i = ((Boolean) obj).booleanValue();
        } else {
            String str = "Converting to Value from unknown object type: ";
            String valueOf = String.valueOf(obj == null ? "null" : obj.getClass().toString());
            aw.a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            return i;
        }
        aVar.l = z;
        return aVar;
    }

    public static Object f(a aVar) {
        int i = 0;
        if (aVar == null) {
            return null;
        }
        a[] aVarArr;
        int length;
        switch (aVar.a) {
            case 1:
                return aVar.b;
            case 2:
                ArrayList arrayList = new ArrayList(aVar.c.length);
                aVarArr = aVar.c;
                length = aVarArr.length;
                while (i < length) {
                    Object f = f(aVarArr[i]);
                    if (f == null) {
                        return null;
                    }
                    arrayList.add(f);
                    i++;
                }
                return arrayList;
            case 3:
                if (aVar.d.length != aVar.e.length) {
                    String str = "Converting an invalid value to object: ";
                    String valueOf = String.valueOf(aVar.toString());
                    aw.a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                    return null;
                }
                Map hashMap = new HashMap(aVar.e.length);
                while (i < aVar.d.length) {
                    Object f2 = f(aVar.d[i]);
                    Object f3 = f(aVar.e[i]);
                    if (f2 == null || f3 == null) {
                        return null;
                    }
                    hashMap.put(f2, f3);
                    i++;
                }
                return hashMap;
            case 4:
                aw.a("Trying to convert a macro reference to object");
                return null;
            case 5:
                aw.a("Trying to convert a function id to object");
                return null;
            case 6:
                return Long.valueOf(aVar.h);
            case 7:
                StringBuffer stringBuffer = new StringBuffer();
                aVarArr = aVar.j;
                length = aVarArr.length;
                while (i < length) {
                    String a = a(aVarArr[i]);
                    if (a == e) {
                        return null;
                    }
                    stringBuffer.append(a);
                    i++;
                }
                return stringBuffer.toString();
            case 8:
                return Boolean.valueOf(aVar.i);
            default:
                aw.a("Failed to convert a value of type: " + aVar.a);
                return null;
        }
    }

    public static String f() {
        return e;
    }

    public static a g() {
        return i;
    }

    private static boolean g(Object obj) {
        return (obj instanceof Double) || (obj instanceof Float) || ((obj instanceof cv) && ((cv) obj).a());
    }

    private static double h(Object obj) {
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        aw.a("getDouble received non-Number");
        return 0.0d;
    }

    private static boolean i(Object obj) {
        return (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || ((obj instanceof cv) && ((cv) obj).b());
    }

    private static long j(Object obj) {
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        aw.a("getInt64 received non-Number");
        return 0;
    }
}
