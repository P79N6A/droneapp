package com.google.android.gms.internal;

import android.content.Context;
import com.fimi.soul.entity.User;
import com.google.android.gms.analytics.a.b;
import com.google.android.gms.analytics.g;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.util.f;
import com.google.android.gms.internal.app.c;
import com.google.firebase.a.a;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class dc extends aqg {
    private static final String a = eg.UNIVERSAL_ANALYTICS.toString();
    private static final List<String> b = Arrays.asList(new String[]{b.a, b.e, b.f, "click", b.c, b.d, b.h, b.i});
    private static final Pattern c = Pattern.compile("dimension(\\d+)");
    private static final Pattern d = Pattern.compile("metric(\\d+)");
    private static final Set<String> e = f.a("", "0", "false");
    private static final Map<String, String> f = f.a("transactionId", "&ti", "transactionAffiliation", "&ta", "transactionTax", "&tt", "transactionShipping", "&ts", "transactionTotal", "&tr", "transactionCurrency", "&cu");
    private static final Map<String, String> g = f.a(User.FN_NAME, "&in", "sku", "&ic", "category", "&iv", a.b.x, "&ip", a.b.y, "&iq", a.b.f, "&cu");
    private final aqb h;
    private final c i;
    private Map<String, Object> j;

    public dc(Context context, c cVar) {
        this(new aqb(context), cVar);
    }

    public dc(aqb com_google_android_gms_internal_aqb, c cVar) {
        this.i = cVar;
        this.h = com_google_android_gms_internal_aqb;
    }

    private b a(String str, Map<String, Object> map) {
        b bVar = new b(str);
        Object obj = map.get("id");
        if (obj != null) {
            bVar.a(String.valueOf(obj));
        }
        obj = map.get("affiliation");
        if (obj != null) {
            bVar.b(String.valueOf(obj));
        }
        obj = map.get(a.b.g);
        if (obj != null) {
            bVar.c(String.valueOf(obj));
        }
        obj = map.get("list");
        if (obj != null) {
            bVar.e(String.valueOf(obj));
        }
        obj = map.get("option");
        if (obj != null) {
            bVar.d(String.valueOf(obj));
        }
        obj = map.get("revenue");
        if (obj != null) {
            bVar.a(a(obj).doubleValue());
        }
        obj = map.get(a.b.D);
        if (obj != null) {
            bVar.b(a(obj).doubleValue());
        }
        obj = map.get(a.b.A);
        if (obj != null) {
            bVar.c(a(obj).doubleValue());
        }
        obj = map.get("step");
        if (obj != null) {
            bVar.a(b(obj).intValue());
        }
        return bVar;
    }

    private com.google.android.gms.analytics.a.c a(Map<String, String> map) {
        com.google.android.gms.analytics.a.c cVar = new com.google.android.gms.analytics.a.c();
        String str = (String) map.get("id");
        if (str != null) {
            cVar.a(String.valueOf(str));
        }
        str = (String) map.get(User.FN_NAME);
        if (str != null) {
            cVar.b(String.valueOf(str));
        }
        str = (String) map.get("creative");
        if (str != null) {
            cVar.c(String.valueOf(str));
        }
        str = (String) map.get("position");
        if (str != null) {
            cVar.d(String.valueOf(str));
        }
        return cVar;
    }

    private Double a(Object obj) {
        String str;
        String valueOf;
        if (obj instanceof String) {
            try {
                return Double.valueOf((String) obj);
            } catch (NumberFormatException e) {
                str = "Cannot convert the object to Double: ";
                valueOf = String.valueOf(e.getMessage());
                throw new RuntimeException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
        } else if (obj instanceof Integer) {
            return Double.valueOf(((Integer) obj).doubleValue());
        } else {
            if (obj instanceof Double) {
                return (Double) obj;
            }
            str = "Cannot convert the object to Double: ";
            valueOf = String.valueOf(obj.toString());
            throw new RuntimeException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
    }

    private List<Map<String, Object>> a(String str) {
        Object obj = this.j.get(str);
        if (obj == null) {
            return null;
        }
        if (obj instanceof List) {
            List<Map<String, Object>> list = (List) obj;
            for (Object obj2 : list) {
                if (!(obj2 instanceof Map)) {
                    throw new IllegalArgumentException("Each element of transactionProducts should be of type Map.");
                }
            }
            return list;
        }
        throw new IllegalArgumentException("transactionProducts should be of type List.");
    }

    private Map<String, String> a(ea<?> eaVar) {
        d.a(eaVar);
        d.b(eaVar instanceof eh);
        Map<String, String> linkedHashMap = new LinkedHashMap();
        Object a = ek.a(ek.b(eaVar));
        d.a(a instanceof Map);
        for (Entry entry : ((Map) a).entrySet()) {
            linkedHashMap.put(entry.getKey().toString(), entry.getValue().toString());
        }
        return linkedHashMap;
    }

    private void a(g gVar, ea<?> eaVar) {
        gVar.a(b((ea) eaVar));
    }

    private void a(g gVar, ea<?> eaVar, ea<?> eaVar2, ea<?> eaVar3) {
        String str = (String) this.j.get("transactionId");
        if (str == null) {
            aph.a("Cannot find transactionId in data layer.");
            return;
        }
        List<Map> linkedList = new LinkedList();
        try {
            Map b = b((ea) eaVar);
            b.put("&t", "transaction");
            for (Entry entry : c(eaVar2).entrySet()) {
                String str2 = (String) this.j.get(entry.getKey());
                if (str2 != null) {
                    b.put((String) entry.getValue(), str2);
                }
            }
            linkedList.add(b);
            List<Map> a = a("transactionProducts");
            if (a != null) {
                for (Map map : a) {
                    if (map.get(User.FN_NAME) == null) {
                        aph.a("Unable to send transaction item hit due to missing 'name' field.");
                        return;
                    }
                    Map b2 = b((ea) eaVar);
                    b2.put("&t", "item");
                    b2.put("&ti", str);
                    for (Entry entry2 : d(eaVar3).entrySet()) {
                        Object obj = map.get(entry2.getKey());
                        if (obj != null) {
                            b2.put((String) entry2.getValue(), obj.toString());
                        }
                    }
                    linkedList.add(b2);
                }
            }
            for (Map a2 : linkedList) {
                gVar.a(a2);
            }
        } catch (Throwable e) {
            aph.a("Unable to send transaction", e);
        }
    }

    private com.google.android.gms.analytics.a.a b(Map<String, Object> map) {
        String str;
        com.google.android.gms.analytics.a.a aVar = new com.google.android.gms.analytics.a.a();
        Object obj = map.get("id");
        if (obj != null) {
            aVar.a(String.valueOf(obj));
        }
        obj = map.get(User.FN_NAME);
        if (obj != null) {
            aVar.b(String.valueOf(obj));
        }
        obj = map.get("brand");
        if (obj != null) {
            aVar.c(String.valueOf(obj));
        }
        obj = map.get("category");
        if (obj != null) {
            aVar.d(String.valueOf(obj));
        }
        obj = map.get("variant");
        if (obj != null) {
            aVar.e(String.valueOf(obj));
        }
        obj = map.get(a.b.g);
        if (obj != null) {
            aVar.f(String.valueOf(obj));
        }
        obj = map.get("position");
        if (obj != null) {
            aVar.a(b(obj).intValue());
        }
        obj = map.get(a.b.x);
        if (obj != null) {
            aVar.a(a(obj).doubleValue());
        }
        obj = map.get(a.b.y);
        if (obj != null) {
            aVar.b(b(obj).intValue());
        }
        for (String str2 : map.keySet()) {
            String str22;
            Matcher matcher = c.matcher(str22);
            if (matcher.matches()) {
                try {
                    aVar.a(Integer.parseInt(matcher.group(1)), String.valueOf(map.get(str22)));
                } catch (NumberFormatException e) {
                    str = "illegal number in custom dimension value: ";
                    str22 = String.valueOf(str22);
                    aph.b(str22.length() != 0 ? str.concat(str22) : new String(str));
                }
            } else {
                matcher = d.matcher(str22);
                if (matcher.matches()) {
                    try {
                        aVar.a(Integer.parseInt(matcher.group(1)), b(map.get(str22)).intValue());
                    } catch (NumberFormatException e2) {
                        str = "illegal number in custom metric value: ";
                        str22 = String.valueOf(str22);
                        aph.b(str22.length() != 0 ? str.concat(str22) : new String(str));
                    }
                }
            }
        }
        return aVar;
    }

    private Integer b(Object obj) {
        String str;
        String valueOf;
        if (obj instanceof String) {
            try {
                return Integer.valueOf((String) obj);
            } catch (NumberFormatException e) {
                str = "Cannot convert the object to Integer: ";
                valueOf = String.valueOf(e.getMessage());
                throw new RuntimeException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
        } else if (obj instanceof Double) {
            return Integer.valueOf(((Double) obj).intValue());
        } else {
            if (obj instanceof Integer) {
                return (Integer) obj;
            }
            str = "Cannot convert the object to Integer: ";
            valueOf = String.valueOf(obj.toString());
            throw new RuntimeException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
    }

    private Map<String, String> b(ea<?> eaVar) {
        Map<String, String> a = a((ea) eaVar);
        String str = (String) a.get("&aip");
        if (str != null && e.contains(str.toLowerCase())) {
            a.remove("&aip");
        }
        return a;
    }

    private void b(g gVar, ea<?> eaVar, ea<?> eaVar2, ea<?> eaVar3) {
        String str;
        com.google.android.gms.analytics.d.f fVar = new com.google.android.gms.analytics.d.f();
        Map b = b((ea) eaVar);
        fVar.a(b);
        Object a = aqf.a(eaVar2) ? this.j.get("ecommerce") : ek.a(ek.b(eaVar3));
        if (a instanceof Map) {
            List<Map> list;
            Map map = (Map) a;
            String str2 = (String) b.get("&cu");
            if (str2 == null) {
                str2 = (String) map.get("currencyCode");
            }
            if (str2 != null) {
                fVar.a("&cu", str2);
            }
            Object obj = map.get("impressions");
            if (obj instanceof List) {
                for (Map b2 : (List) obj) {
                    try {
                        fVar.a(b(b2), (String) b2.get("list"));
                    } catch (RuntimeException e) {
                        String str3 = "Failed to extract a product from event data. ";
                        str2 = String.valueOf(e.getMessage());
                        aph.a(str2.length() != 0 ? str3.concat(str2) : new String(str3));
                    }
                }
            }
            List list2 = null;
            if (map.containsKey("promoClick")) {
                list2 = (List) ((Map) map.get("promoClick")).get("promotions");
            } else if (map.containsKey("promoView")) {
                list2 = (List) ((Map) map.get("promoView")).get("promotions");
            }
            if (r1 != null) {
                for (Map b22 : r1) {
                    try {
                        fVar.a(a(b22));
                    } catch (RuntimeException e2) {
                        str = "Failed to extract a promotion from event data. ";
                        str2 = String.valueOf(e2.getMessage());
                        aph.a(str2.length() != 0 ? str.concat(str2) : new String(str));
                    }
                }
                if (map.containsKey("promoClick")) {
                    fVar.a("&promoa", "click");
                    obj = null;
                    if (obj != null) {
                        for (String str22 : b) {
                            if (map.containsKey(str22)) {
                                map = (Map) map.get(str22);
                                list = (List) map.get("products");
                                if (list != null) {
                                    for (Map b3 : list) {
                                        try {
                                            fVar.a(b(b3));
                                        } catch (RuntimeException e3) {
                                            str = "Failed to extract a product from event data. ";
                                            String valueOf = String.valueOf(e3.getMessage());
                                            aph.a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                                        }
                                    }
                                }
                                try {
                                    fVar.a(map.containsKey("actionField") ? a(str22, (Map) map.get("actionField")) : new b(str22));
                                } catch (RuntimeException e4) {
                                    str22 = "Failed to extract a product action from event data. ";
                                    String valueOf2 = String.valueOf(e4.getMessage());
                                    aph.a(valueOf2.length() != 0 ? str22.concat(valueOf2) : new String(str22));
                                }
                            }
                        }
                    }
                } else {
                    fVar.a("&promoa", com.google.android.gms.analytics.a.c.b);
                }
            }
            int i = 1;
            if (obj != null) {
                for (String str222 : b) {
                    if (map.containsKey(str222)) {
                        map = (Map) map.get(str222);
                        list = (List) map.get("products");
                        if (list != null) {
                            while (r4.hasNext()) {
                                fVar.a(b(b3));
                            }
                        }
                        if (map.containsKey("actionField")) {
                        }
                        fVar.a(map.containsKey("actionField") ? a(str222, (Map) map.get("actionField")) : new b(str222));
                    }
                }
            }
        }
        gVar.a(fVar.a());
    }

    private Map<String, String> c(ea<?> eaVar) {
        return eaVar == ee.e ? f : a((ea) eaVar);
    }

    private Map<String, String> d(ea<?> eaVar) {
        return eaVar == ee.e ? g : a((ea) eaVar);
    }

    protected ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        boolean z = false;
        d.b(eaVarArr != null);
        d.b(eaVarArr.length >= 1);
        try {
            this.j = ek.a(this.i.a().e());
            ea eaVar = eaVarArr[0];
            ea ebVar = eaVarArr.length > 1 ? eaVarArr[1] : new eb(Boolean.valueOf(true));
            ea ebVar2 = eaVarArr.length > 2 ? eaVarArr[2] : new eb(Boolean.valueOf(false));
            ea eaVar2 = eaVarArr.length > 3 ? eaVarArr[3] : ee.e;
            ea eaVar3 = eaVarArr.length > 4 ? eaVarArr[4] : ee.e;
            ea ebVar3 = eaVarArr.length > 5 ? eaVarArr[5] : new eb(Boolean.valueOf(false));
            ea ebVar4 = eaVarArr.length > 6 ? eaVarArr[6] : new eb(Boolean.valueOf(false));
            ea eaVar4 = eaVarArr.length > 7 ? eaVarArr[7] : ee.e;
            ea ebVar5 = eaVarArr.length > 8 ? eaVarArr[8] : new eb(Boolean.valueOf(false));
            d.b(eaVar instanceof eh);
            boolean z2 = eaVar2 == ee.e || (eaVar2 instanceof eh);
            d.b(z2);
            z2 = eaVar3 == ee.e || (eaVar3 instanceof eh);
            d.b(z2);
            if (eaVar4 == ee.e || (eaVar4 instanceof eh)) {
                z = true;
            }
            d.b(z);
            g a = this.h.a("_GTM_DEFAULT_TRACKER_");
            a.e(aqf.a(ebVar5));
            if (aqf.a(ebVar3)) {
                b(a, eaVar, ebVar4, eaVar4);
            } else if (aqf.a(ebVar)) {
                a(a, eaVar);
            } else if (aqf.a(ebVar2)) {
                a(a, eaVar, eaVar2, eaVar3);
            } else {
                aph.b("Ignoring unknown tag.");
            }
            this.j = null;
            return ee.e;
        } catch (Throwable th) {
            this.j = null;
        }
    }
}
