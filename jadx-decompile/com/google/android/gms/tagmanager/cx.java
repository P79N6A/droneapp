package com.google.android.gms.tagmanager;

import android.content.Context;
import com.fimi.soul.entity.User;
import com.google.android.gms.analytics.a.b;
import com.google.android.gms.analytics.a.c;
import com.google.android.gms.analytics.d.f;
import com.google.android.gms.analytics.g;
import com.google.android.gms.internal.eg;
import com.google.android.gms.internal.fh;
import com.google.android.gms.internal.hj;
import com.google.firebase.a.a;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class cx extends cu {
    private static final String a = eg.UNIVERSAL_ANALYTICS.toString();
    private static final String b = fh.ACCOUNT.toString();
    private static final String c = fh.ANALYTICS_PASS_THROUGH.toString();
    private static final String d = fh.ENABLE_ECOMMERCE.toString();
    private static final String e = fh.ECOMMERCE_USE_DATA_LAYER.toString();
    private static final String f = fh.ECOMMERCE_MACRO_DATA.toString();
    private static final String g = fh.ANALYTICS_FIELDS.toString();
    private static final String h = fh.TRACK_TRANSACTION.toString();
    private static final String i = fh.TRANSACTION_DATALAYER_MAP.toString();
    private static final String j = fh.TRANSACTION_ITEM_DATALAYER_MAP.toString();
    private static final List<String> k = Arrays.asList(new String[]{b.a, b.e, b.f, "click", b.c, b.d, b.h, b.i});
    private static final Pattern l = Pattern.compile("dimension(\\d+)");
    private static final Pattern m = Pattern.compile("metric(\\d+)");
    private static Map<String, String> n;
    private static Map<String, String> o;
    private final Set<String> p;
    private final ct q;
    private final e r;

    public cx(Context context, e eVar) {
        this(context, eVar, new ct(context));
    }

    cx(Context context, e eVar, ct ctVar) {
        super(a, new String[0]);
        this.r = eVar;
        this.q = ctVar;
        this.p = new HashSet();
        this.p.add("");
        this.p.add("0");
        this.p.add("false");
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

    private String a(String str) {
        Object c = this.r.c(str);
        return c == null ? null : c.toString();
    }

    private Map<String, String> a(hj.a aVar) {
        Object f = cw.f(aVar);
        if (!(f instanceof Map)) {
            return null;
        }
        Map map = (Map) f;
        Map<String, String> linkedHashMap = new LinkedHashMap();
        for (Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey().toString(), entry.getValue().toString());
        }
        return linkedHashMap;
    }

    private void a(g gVar, Map<String, hj.a> map) {
        String a = a("transactionId");
        if (a == null) {
            aw.a("Cannot find transactionId in data layer.");
            return;
        }
        List<Map> linkedList = new LinkedList();
        try {
            Map b = b((hj.a) map.get(g));
            b.put("&t", "transaction");
            for (Entry entry : e(map).entrySet()) {
                a(b, (String) entry.getValue(), a((String) entry.getKey()));
            }
            linkedList.add(b);
            List<Map> b2 = b("transactionProducts");
            if (b2 != null) {
                for (Map map2 : b2) {
                    if (map2.get(User.FN_NAME) == null) {
                        aw.a("Unable to send transaction item hit due to missing 'name' field.");
                        return;
                    }
                    Map b3 = b((hj.a) map.get(g));
                    b3.put("&t", "item");
                    b3.put("&ti", a);
                    for (Entry entry2 : f(map).entrySet()) {
                        a(b3, (String) entry2.getValue(), (String) map2.get(entry2.getKey()));
                    }
                    linkedList.add(b3);
                }
            }
            for (Map map22 : linkedList) {
                gVar.a(map22);
            }
        } catch (Throwable e) {
            aw.a("Unable to send transaction", e);
        }
    }

    private void a(Map<String, String> map, String str, String str2) {
        if (str2 != null) {
            map.put(str, str2);
        }
    }

    private boolean a(Map<String, hj.a> map, String str) {
        hj.a aVar = (hj.a) map.get(str);
        return aVar == null ? false : cw.e(aVar).booleanValue();
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

    private List<Map<String, String>> b(String str) {
        Object c = this.r.c(str);
        if (c == null) {
            return null;
        }
        if (c instanceof List) {
            for (Object obj : (List) c) {
                if (!(obj instanceof Map)) {
                    throw new IllegalArgumentException("Each element of transactionProducts should be of type Map.");
                }
            }
            return (List) c;
        }
        throw new IllegalArgumentException("transactionProducts should be of type List.");
    }

    private Map<String, String> b(hj.a aVar) {
        if (aVar == null) {
            return new HashMap();
        }
        Map<String, String> a = a(aVar);
        if (a == null) {
            return new HashMap();
        }
        String str = (String) a.get("&aip");
        if (str != null && this.p.contains(str.toLowerCase())) {
            a.remove("&aip");
        }
        return a;
    }

    private void b(g gVar, Map<String, hj.a> map) {
        Object c;
        Map map2;
        String str;
        f fVar = new f();
        Map b = b((hj.a) map.get(g));
        fVar.a(b);
        if (a((Map) map, e)) {
            c = this.r.c("ecommerce");
            map2 = c instanceof Map ? (Map) c : null;
        } else {
            c = cw.f((hj.a) map.get(f));
            map2 = c instanceof Map ? (Map) c : null;
        }
        if (map2 != null) {
            Map map3;
            List<Map> list;
            String str2 = (String) b.get("&cu");
            if (str2 == null) {
                str2 = (String) map2.get("currencyCode");
            }
            if (str2 != null) {
                fVar.a("&cu", str2);
            }
            c = map2.get("impressions");
            if (c instanceof List) {
                for (Map map4 : (List) c) {
                    try {
                        fVar.a(d(map4), (String) map4.get("list"));
                    } catch (RuntimeException e) {
                        str = "Failed to extract a product from DataLayer. ";
                        str2 = String.valueOf(e.getMessage());
                        aw.a(str2.length() != 0 ? str.concat(str2) : new String(str));
                    }
                }
            }
            List list2 = map2.containsKey("promoClick") ? (List) ((Map) map2.get("promoClick")).get("promotions") : map2.containsKey("promoView") ? (List) ((Map) map2.get("promoView")).get("promotions") : null;
            if (r0 != null) {
                for (Map map42 : r0) {
                    try {
                        fVar.a(c(map42));
                    } catch (RuntimeException e2) {
                        str = "Failed to extract a promotion from DataLayer. ";
                        str2 = String.valueOf(e2.getMessage());
                        aw.a(str2.length() != 0 ? str.concat(str2) : new String(str));
                    }
                }
                if (map2.containsKey("promoClick")) {
                    fVar.a("&promoa", "click");
                    c = null;
                    if (c != null) {
                        for (String str22 : k) {
                            if (map2.containsKey(str22)) {
                                map3 = (Map) map2.get(str22);
                                list = (List) map3.get("products");
                                if (list != null) {
                                    for (Map map22 : list) {
                                        try {
                                            fVar.a(d(map22));
                                        } catch (RuntimeException e3) {
                                            str = "Failed to extract a product from DataLayer. ";
                                            String valueOf = String.valueOf(e3.getMessage());
                                            aw.a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                                        }
                                    }
                                }
                                try {
                                    fVar.a(map3.containsKey("actionField") ? a(str22, (Map) map3.get("actionField")) : new b(str22));
                                } catch (RuntimeException e22) {
                                    String str3 = "Failed to extract a product action from DataLayer. ";
                                    str22 = String.valueOf(e22.getMessage());
                                    aw.a(str22.length() != 0 ? str3.concat(str22) : new String(str3));
                                }
                            }
                        }
                    }
                } else {
                    fVar.a("&promoa", c.b);
                }
            }
            int i = 1;
            if (c != null) {
                for (String str222 : k) {
                    if (map22.containsKey(str222)) {
                        map3 = (Map) map22.get(str222);
                        list = (List) map3.get("products");
                        if (list != null) {
                            while (r4.hasNext()) {
                                fVar.a(d(map22));
                            }
                        }
                        if (map3.containsKey("actionField")) {
                        }
                        fVar.a(map3.containsKey("actionField") ? a(str222, (Map) map3.get("actionField")) : new b(str222));
                    }
                }
            }
        }
        gVar.a(fVar.a());
    }

    private c c(Map<String, String> map) {
        c cVar = new c();
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

    private com.google.android.gms.analytics.a.a d(Map<String, Object> map) {
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
            Matcher matcher = l.matcher(str22);
            if (matcher.matches()) {
                try {
                    aVar.a(Integer.parseInt(matcher.group(1)), String.valueOf(map.get(str22)));
                } catch (NumberFormatException e) {
                    str = "illegal number in custom dimension value: ";
                    str22 = String.valueOf(str22);
                    aw.b(str22.length() != 0 ? str.concat(str22) : new String(str));
                }
            } else {
                matcher = m.matcher(str22);
                if (matcher.matches()) {
                    try {
                        aVar.a(Integer.parseInt(matcher.group(1)), b(map.get(str22)).intValue());
                    } catch (NumberFormatException e2) {
                        str = "illegal number in custom metric value: ";
                        str22 = String.valueOf(str22);
                        aw.b(str22.length() != 0 ? str.concat(str22) : new String(str));
                    }
                }
            }
        }
        return aVar;
    }

    private Map<String, String> e(Map<String, hj.a> map) {
        hj.a aVar = (hj.a) map.get(i);
        if (aVar != null) {
            return a(aVar);
        }
        if (n == null) {
            Map hashMap = new HashMap();
            hashMap.put("transactionId", "&ti");
            hashMap.put("transactionAffiliation", "&ta");
            hashMap.put("transactionTax", "&tt");
            hashMap.put("transactionShipping", "&ts");
            hashMap.put("transactionTotal", "&tr");
            hashMap.put("transactionCurrency", "&cu");
            n = hashMap;
        }
        return n;
    }

    private Map<String, String> f(Map<String, hj.a> map) {
        hj.a aVar = (hj.a) map.get(j);
        if (aVar != null) {
            return a(aVar);
        }
        if (o == null) {
            Map hashMap = new HashMap();
            hashMap.put(User.FN_NAME, "&in");
            hashMap.put("sku", "&ic");
            hashMap.put("category", "&iv");
            hashMap.put(a.b.x, "&ip");
            hashMap.put(a.b.y, "&iq");
            hashMap.put(a.b.f, "&cu");
            o = hashMap;
        }
        return o;
    }

    public /* bridge */ /* synthetic */ boolean a() {
        return super.a();
    }

    public /* bridge */ /* synthetic */ String b() {
        return super.b();
    }

    public void b(Map<String, hj.a> map) {
        g a = this.q.a("_GTM_DEFAULT_TRACKER_");
        a.e(a((Map) map, "collect_adid"));
        if (a((Map) map, d)) {
            b(a, map);
        } else if (a((Map) map, c)) {
            a.a(b((hj.a) map.get(g)));
        } else if (a((Map) map, h)) {
            a(a, (Map) map);
        } else {
            aw.b("Ignoring unknown tag.");
        }
    }

    public /* bridge */ /* synthetic */ Set c() {
        return super.c();
    }
}
