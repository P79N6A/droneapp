package com.google.android.gms.internal;

import android.os.Bundle;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ek {
    public static Bundle a(Map<String, ea<?>> map) {
        if (map == null) {
            return null;
        }
        Bundle bundle = new Bundle(map.size());
        for (Entry entry : map.entrySet()) {
            if (entry.getValue() instanceof ej) {
                bundle.putString((String) entry.getKey(), (String) ((ej) entry.getValue()).b());
            } else if (entry.getValue() instanceof eb) {
                bundle.putBoolean((String) entry.getKey(), ((Boolean) ((eb) entry.getValue()).b()).booleanValue());
            } else if (entry.getValue() instanceof ec) {
                bundle.putDouble((String) entry.getKey(), ((Double) ((ec) entry.getValue()).b()).doubleValue());
            } else if (entry.getValue() instanceof eh) {
                bundle.putBundle((String) entry.getKey(), a((Map) ((eh) entry.getValue()).b()));
            } else {
                throw new IllegalArgumentException(String.format("Invalid param type for key '%s'. Only boolean, double and string types and maps of thereof are supported.", new Object[]{entry.getKey()}));
            }
        }
        return bundle;
    }

    public static ea a(apr com_google_android_gms_internal_apr, ea eaVar) {
        d.a(eaVar);
        if (!(c(eaVar) || (eaVar instanceof ed) || (eaVar instanceof ef) || (eaVar instanceof eh))) {
            if (eaVar instanceof ei) {
                eaVar = a(com_google_android_gms_internal_apr, (ei) eaVar);
            } else {
                throw new UnsupportedOperationException("Attempting to evaluate unknown type");
            }
        }
        if (eaVar == null) {
            throw new IllegalArgumentException("AbstractType evaluated to Java null");
        } else if (!(eaVar instanceof ei)) {
            return eaVar;
        } else {
            throw new IllegalArgumentException("AbstractType evaluated to illegal type Statement.");
        }
    }

    public static ea a(apr com_google_android_gms_internal_apr, ei eiVar) {
        String e = eiVar.e();
        List f = eiVar.f();
        ea b = com_google_android_gms_internal_apr.b(e);
        if (b == null) {
            throw new UnsupportedOperationException(new StringBuilder(String.valueOf(e).length() + 28).append("Function '").append(e).append("' is not supported").toString());
        } else if (b instanceof ed) {
            return ((aqe) ((ed) b).b()).a_(com_google_android_gms_internal_apr, (ea[]) f.toArray(new ea[f.size()]));
        } else {
            throw new UnsupportedOperationException(new StringBuilder(String.valueOf(e).length() + 29).append("Function '").append(e).append("' is not a function").toString());
        }
    }

    public static ea<?> a(@Nullable Object obj) {
        if (obj == null) {
            return ee.d;
        }
        if (obj instanceof ea) {
            return (ea) obj;
        }
        if (obj instanceof Boolean) {
            return new eb((Boolean) obj);
        }
        if (obj instanceof Short) {
            return new ec(Double.valueOf(((Short) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new ec(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Long) {
            return new ec(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Float) {
            return new ec(Double.valueOf(((Float) obj).doubleValue()));
        }
        if (obj instanceof Double) {
            return new ec((Double) obj);
        }
        if (obj instanceof Byte) {
            return new ej(obj.toString());
        }
        if (obj instanceof Character) {
            return new ej(obj.toString());
        }
        if (obj instanceof String) {
            return new ej((String) obj);
        }
        if (obj instanceof List) {
            List arrayList = new ArrayList();
            for (Object a : (List) obj) {
                arrayList.add(a(a));
            }
            return new ef(arrayList);
        } else if (obj instanceof Map) {
            r2 = new HashMap();
            for (Entry entry : ((Map) obj).entrySet()) {
                d.b(entry.getKey() instanceof String);
                r2.put((String) entry.getKey(), a(entry.getValue()));
            }
            return new eh(r2);
        } else if (obj instanceof Bundle) {
            r2 = new HashMap();
            for (String str : ((Bundle) obj).keySet()) {
                r2.put(str, a(((Bundle) obj).get(str)));
            }
            return new eh(r2);
        } else {
            String valueOf = String.valueOf(obj.getClass());
            throw new UnsupportedOperationException(new StringBuilder(String.valueOf(valueOf).length() + 20).append("Type not supported: ").append(valueOf).toString());
        }
    }

    public static ee a(apr com_google_android_gms_internal_apr, List<ea<?>> list) {
        for (ea eaVar : list) {
            d.b(eaVar instanceof ei);
            ea eaVar2 = a(com_google_android_gms_internal_apr, eaVar2);
            if (d(eaVar2)) {
                return (ee) eaVar2;
            }
        }
        return ee.e;
    }

    public static Object a(ea<?> eaVar) {
        if (eaVar == null) {
            return null;
        }
        if (eaVar == ee.d) {
            return null;
        }
        if (eaVar instanceof eb) {
            return (Boolean) ((eb) eaVar).b();
        }
        if (eaVar instanceof ec) {
            double doubleValue = ((Double) ((ec) eaVar).b()).doubleValue();
            return (Double.isInfinite(doubleValue) || doubleValue - Math.floor(doubleValue) >= 1.0E-5d) ? ((Double) ((ec) eaVar).b()).toString() : Integer.valueOf((int) doubleValue);
        } else if (eaVar instanceof ej) {
            return (String) ((ej) eaVar).b();
        } else {
            if (eaVar instanceof ef) {
                List arrayList = new ArrayList();
                for (ea a : (List) ((ef) eaVar).b()) {
                    Object a2 = a(a);
                    if (a2 == null) {
                        aph.a(String.format("Failure to convert a list element to object: %s (%s)", new Object[]{a, a.getClass().getCanonicalName()}));
                        return null;
                    }
                    arrayList.add(a2);
                }
                return arrayList;
            } else if (eaVar instanceof eh) {
                Map hashMap = new HashMap();
                for (Entry entry : ((Map) ((eh) eaVar).b()).entrySet()) {
                    Object a3 = a((ea) entry.getValue());
                    if (a3 == null) {
                        aph.a(String.format("Failure to convert a map's value to object: %s (%s)", new Object[]{entry.getValue(), ((ea) entry.getValue()).getClass().getCanonicalName()}));
                        return null;
                    }
                    hashMap.put((String) entry.getKey(), a3);
                }
                return hashMap;
            } else {
                String valueOf = String.valueOf(eaVar.getClass());
                aph.a(new StringBuilder(String.valueOf(valueOf).length() + 49).append("Converting to Object from unknown abstract type: ").append(valueOf).toString());
                return null;
            }
        }
    }

    private static List<Object> a(List<Object> list) {
        List<Object> arrayList = new ArrayList();
        for (Object next : list) {
            if (next instanceof Bundle) {
                arrayList.add(a((Bundle) next));
            } else if (next instanceof List) {
                arrayList.add(a((List) next));
            } else {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static Map<String, Object> a(Bundle bundle) {
        Map<String, Object> hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                hashMap.put(str, a((Bundle) obj));
            } else if (obj instanceof List) {
                hashMap.put(str, a((List) obj));
            } else {
                hashMap.put(str, obj);
            }
        }
        return hashMap;
    }

    public static ea b(ea<?> eaVar) {
        if (eaVar instanceof eh) {
            Set<String> hashSet = new HashSet();
            Map map = (Map) ((eh) eaVar).b();
            for (Entry entry : map.entrySet()) {
                if (entry.getValue() == ee.e) {
                    hashSet.add((String) entry.getKey());
                }
            }
            for (String remove : hashSet) {
                map.remove(remove);
            }
        }
        return eaVar;
    }

    public static boolean c(ea eaVar) {
        return (eaVar instanceof eb) || (eaVar instanceof ec) || (eaVar instanceof ej) || eaVar == ee.d || eaVar == ee.e;
    }

    public static boolean d(ea eaVar) {
        return eaVar == ee.c || eaVar == ee.b || ((eaVar instanceof ee) && ((ee) eaVar).e());
    }
}
