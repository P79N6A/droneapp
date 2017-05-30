package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.fimi.soul.utils.m;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.tagmanager.af;
import com.google.android.gms.tagmanager.aj;
import com.google.android.gms.tagmanager.e;
import com.tencent.connect.common.Constants;
import com.xiaomi.market.sdk.j;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class app {
    private final Context a;
    private final String b;
    private final dv c;
    private final aj d;
    private final af e;
    private final apr f = new apr();
    private final eh g = new eh(new HashMap(50));
    private final eh h = new eh(new HashMap(10));
    private final Set<String> i = new HashSet();
    private int j;
    private br k;
    private aow l;
    private final c m = new c(this) {
        final /* synthetic */ app a;

        {
            this.a = r1;
        }

        public aow a() {
            return this.a.l;
        }
    };

    public interface c {
        aow a();
    }

    private class a implements com.google.android.gms.internal.bc.a {
        final /* synthetic */ app a;

        private a(app com_google_android_gms_internal_app) {
            this.a = com_google_android_gms_internal_app;
        }

        public Object a(String str, Map<String, Object> map) {
            try {
                this.a.e.a(str, map);
            } catch (RemoteException e) {
                String str2 = "Error calling customEvaluator proxy:";
                String valueOf = String.valueOf(e.getMessage());
                aph.a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            }
            return null;
        }
    }

    private class b implements com.google.android.gms.internal.bc.a {
        final /* synthetic */ app a;

        private b(app com_google_android_gms_internal_app) {
            this.a = com_google_android_gms_internal_app;
        }

        public Object a(String str, Map<String, Object> map) {
            try {
                return this.a.e.b(str, map);
            } catch (RemoteException e) {
                String str2 = "Error calling customEvaluator proxy:";
                String valueOf = String.valueOf(e.getMessage());
                aph.a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                return null;
            }
        }
    }

    public app(Context context, String str, dv dvVar, dy dyVar, aj ajVar, af afVar) {
        d.a(dvVar, "Internal Error: Container resource cannot be null");
        d.a(dyVar, "Internal Error: Runtime resource cannot be null");
        d.a(str, "Internal Error: ContainerId cannot be empty");
        d.a(ajVar);
        d.a(afVar);
        this.a = context;
        this.b = str;
        this.c = dvVar;
        this.d = ajVar;
        this.e = afVar;
        c();
        d();
        e();
        f();
        g();
        a(dyVar);
        h();
    }

    private ea<?> a(dz dzVar) {
        switch (dzVar.a()) {
            case 1:
                try {
                    return new ec(Double.valueOf(Double.parseDouble((String) dzVar.b())));
                } catch (NumberFormatException e) {
                    return new ej((String) dzVar.b());
                }
            case 2:
                List<dz> list = (List) dzVar.b();
                List arrayList = new ArrayList(list.size());
                for (dz a : list) {
                    arrayList.add(a(a));
                }
                return new ef(arrayList);
            case 3:
                Map map = (Map) dzVar.b();
                Map hashMap = new HashMap(map.size());
                for (Entry entry : map.entrySet()) {
                    hashMap.put(aqf.d(a((dz) entry.getKey())), a((dz) entry.getValue()));
                }
                return new eh(hashMap);
            case 4:
                ea<?> b = b((String) dzVar.b());
                return (!(b instanceof ej) || dzVar.c().isEmpty()) ? b : new ej(a((String) ((ej) b).b(), dzVar.c()));
            case 5:
                return new ej((String) dzVar.b());
            case 6:
                return new ec(Double.valueOf(((Integer) dzVar.b()).doubleValue()));
            case 7:
                StringBuilder stringBuilder = new StringBuilder();
                for (dz a2 : (List) dzVar.b()) {
                    stringBuilder.append(aqf.d(a(a2)));
                }
                return new ej(stringBuilder.toString());
            case 8:
                return new eb((Boolean) dzVar.b());
            default:
                throw new IllegalStateException("Attempting to expand unknown Value type " + dzVar.a() + ".");
        }
    }

    private ei a(String str, Map<String, ea<?>> map) {
        try {
            return aqc.a(str, map, b());
        } catch (RuntimeException e) {
            String valueOf = String.valueOf(e.getMessage());
            aph.a(new StringBuilder((String.valueOf(str).length() + 30) + String.valueOf(valueOf).length()).append("Incorrect keys for function ").append(str).append(". ").append(valueOf).toString());
            return null;
        }
    }

    private String a(String str, int i) {
        switch (i) {
            case 12:
                return d(str);
            default:
                aph.a("Unsupported Value Escaping: " + i);
                return str;
        }
    }

    private String a(String str, List<Integer> list) {
        for (Integer intValue : list) {
            str = a(str, intValue.intValue());
        }
        return str;
    }

    private Map<String, ea<?>> a(Map<String, dz> map) {
        Map<String, ea<?>> hashMap = new HashMap();
        for (Entry entry : map.entrySet()) {
            hashMap.put((String) entry.getKey(), a((dz) entry.getValue()));
        }
        return hashMap;
    }

    private void a(dy dyVar) {
        for (aqd com_google_android_gms_internal_aqd : dyVar.a()) {
            com_google_android_gms_internal_aqd.a(this.f);
            this.f.a(com_google_android_gms_internal_aqd.a(), new ed(com_google_android_gms_internal_aqd));
        }
    }

    private void a(eg egVar, aqe com_google_android_gms_internal_aqe) {
        this.g.a(aqc.a(egVar), new ed(com_google_android_gms_internal_aqe));
    }

    private ea<?> b(String str) {
        this.j++;
        String valueOf = String.valueOf(i());
        aph.d(new StringBuilder((String.valueOf(valueOf).length() + 31) + String.valueOf(str).length()).append(valueOf).append("Beginning to evaluate variable ").append(str).toString());
        if (this.i.contains(str)) {
            this.j--;
            String valueOf2 = String.valueOf(this.i.toString());
            throw new IllegalStateException(new StringBuilder((String.valueOf(str).length() + 77) + String.valueOf(valueOf2).length()).append("Macro cycle detected.  Current macro reference: ").append(str).append(". Previous macro references: ").append(valueOf2).toString());
        }
        this.i.add(str);
        dw a = this.c.a(str);
        if (a == null) {
            this.j--;
            this.i.remove(str);
            valueOf2 = String.valueOf(i());
            throw new IllegalStateException(new StringBuilder((String.valueOf(valueOf2).length() + 36) + String.valueOf(str).length()).append(valueOf2).append("Attempting to resolve unknown macro ").append(str).toString());
        }
        ea<?> b = b(a(a.a()));
        valueOf2 = String.valueOf(i());
        aph.d(new StringBuilder((String.valueOf(valueOf2).length() + 25) + String.valueOf(str).length()).append(valueOf2).append("Done evaluating variable ").append(str).toString());
        this.j--;
        this.i.remove(str);
        return b;
    }

    private ea b(Map<String, ea<?>> map) {
        if (map == null) {
            aph.a("Cannot access the function parameters.");
            return ee.e;
        }
        ea eaVar = (ea) map.get(fh.FUNCTION.toString());
        if (eaVar instanceof ej) {
            ei eiVar;
            String str = (String) ((ej) eaVar).b();
            if (this.f.a(str)) {
                Map hashMap = new HashMap();
                for (Entry entry : map.entrySet()) {
                    if (((String) entry.getKey()).startsWith("vtp_")) {
                        hashMap.put(((String) entry.getKey()).substring(4), (ea) entry.getValue());
                    }
                }
                List arrayList = new ArrayList();
                arrayList.add(new eh(hashMap));
                eiVar = new ei(str, arrayList);
            } else if (c(str)) {
                eiVar = a(str, (Map) map);
            } else {
                aph.a(new StringBuilder(String.valueOf(str).length() + 30).append("functionId '").append(str).append("' is not supported").toString());
                return ee.e;
            }
            if (eiVar == null) {
                aph.a("Internal error: failed to convert function to a valid statement");
                return ee.e;
            }
            String str2 = "Executing: ";
            str = String.valueOf(eiVar.e());
            aph.d(str.length() != 0 ? str2.concat(str) : new String(str2));
            ea a = ek.a(this.f, eiVar);
            return ((a instanceof ee) && ((ee) a).e()) ? (ea) ((ee) a).b() : a;
        } else {
            aph.a("No function id in properties");
            return ee.e;
        }
    }

    private boolean b(dw dwVar) {
        dz dzVar = (dz) dwVar.a().get(fh.DISPATCH_ON_FIRE.toString());
        return dzVar != null && dzVar.a() == 8 && ((Boolean) dzVar.b()).booleanValue();
    }

    private void c() {
        this.f.a("1", new ed(new arb()));
        this.f.a("12", new ed(new arc()));
        this.f.a("18", new ed(new ard()));
        this.f.a(Constants.VIA_ACT_TYPE_NINETEEN, new ed(new are()));
        this.f.a("20", new ed(new arf()));
        this.f.a(Constants.VIA_REPORT_TYPE_QQFAVORITES, new ed(new arg()));
        this.f.a(Constants.VIA_REPORT_TYPE_SHARE_TO_TROOPBAR, new ed(new arh()));
        this.f.a("24", new ed(new ari()));
        this.f.a("27", new ed(new arj()));
        this.f.a(Constants.VIA_ACT_TYPE_TWENTY_EIGHT, new ed(new ark()));
        this.f.a("29", new ed(new arl()));
        this.f.a("30", new ed(new arm()));
        this.f.a(m.s, new ed(new arn()));
        this.f.a(m.t, new ed(new arn()));
        this.f.a(m.u, new ed(new c()));
        this.f.a("35", new ed(new c()));
        this.f.a("39", new ed(new d()));
        this.f.a("40", new ed(new e()));
    }

    private boolean c(String str) {
        String a = aqc.a(str);
        return a != null && this.g.a(a);
    }

    private String d(String str) {
        try {
            str = URLEncoder.encode(str, "UTF-8").replaceAll("\\+", "%20");
        } catch (Throwable e) {
            aph.a("Escape URI: unsupported encoding", e);
        }
        return str;
    }

    private void d() {
        this.f.a("0", new ed(new ab()));
        this.f.a("10", new ed(new ad()));
        this.f.a("25", new ed(new ae()));
        this.f.a("26", new ed(new af()));
        this.f.a("37", new ed(new ag()));
    }

    private void e() {
        this.f.a("2", new ed(new f()));
        this.f.a("3", new ed(new g()));
        this.f.a("4", new ed(new h()));
        this.f.a("5", new ed(new i()));
        this.f.a("6", new ed(new j()));
        this.f.a(m.l, new ed(new k()));
        this.f.a(m.m, new ed(new l()));
        this.f.a(m.n, new ed(new i()));
        this.f.a("13", new ed(new m()));
        this.f.a("47", new ed(new n()));
        this.f.a(Constants.VIA_REPORT_TYPE_WPA_STATE, new ed(new o()));
        this.f.a("48", new ed(new p(this)));
        aqe qVar = new q();
        this.f.a(Constants.VIA_REPORT_TYPE_START_WAP, new ed(qVar));
        this.f.a("17", new ed(qVar));
        this.f.a(Constants.VIA_REPORT_TYPE_DATALINE, new ed(new s()));
        this.f.a("45", new ed(new t()));
        this.f.a("46", new ed(new u()));
        this.f.a("36", new ed(new v()));
        this.f.a("43", new ed(new w()));
        this.f.a("38", new ed(new x()));
        this.f.a("44", new ed(new y()));
        this.f.a("41", new ed(new z()));
        this.f.a("42", new ed(new aa()));
    }

    private void f() {
        a(eg.CONTAINS, new cp());
        a(eg.ENDS_WITH, new cq());
        a(eg.EQUALS, new cr());
        a(eg.GREATER_EQUALS, new cs());
        a(eg.GREATER_THAN, new ct());
        a(eg.LESS_EQUALS, new cu());
        a(eg.LESS_THAN, new cv());
        a(eg.REGEX, new cx());
        a(eg.STARTS_WITH, new cy());
        this.g.a("advertiserId", new ed(new bh(this.a)));
        this.g.a("advertiserTrackingEnabled", new ed(new bi(this.a)));
        this.g.a("adwordsClickReferrer", new ed(new bj(this.a, this.m)));
        this.g.a("applicationId", new ed(new bk(this.a)));
        this.g.a("applicationName", new ed(new bl(this.a)));
        this.g.a("applicationVersion", new ed(new bm(this.a)));
        this.g.a("applicationVersionName", new ed(new bn(this.a)));
        this.g.a("arbitraryPixieMacro", new ed(new be(1, this.f)));
        this.g.a("carrier", new ed(new bo(this.a)));
        this.g.a("constant", new ed(new v()));
        this.g.a("containerId", new ed(new bp(new ej(this.b))));
        this.g.a("containerVersion", new ed(new bp(new ej(this.c.b()))));
        this.g.a("customMacro", new ed(new bc(new b())));
        this.g.a("deviceBrand", new ed(new bs()));
        this.g.a(j.as, new ed(new bt(this.a)));
        this.g.a("deviceModel", new ed(new bu()));
        this.g.a("deviceName", new ed(new bv()));
        this.g.a("encode", new ed(new bw()));
        this.g.a("encrypt", new ed(new bx()));
        this.g.a(e.b, new ed(new bq()));
        this.g.a("eventParameters", new ed(new by(this.m)));
        this.g.a("version", new ed(new bz()));
        this.g.a("hashcode", new ed(new ca()));
        this.g.a("installReferrer", new ed(new cb(this.a)));
        this.g.a("join", new ed(new cc()));
        this.g.a("language", new ed(new cd()));
        this.g.a("locale", new ed(new cf()));
        this.g.a("adWordsUniqueId", new ed(new ch(this.a)));
        this.g.a("osVersion", new ed(new ci()));
        this.g.a(Constants.PARAM_PLATFORM, new ed(new cj()));
        this.g.a("random", new ed(new ck()));
        this.g.a("regexGroup", new ed(new cl()));
        this.g.a(j.ai, new ed(new cn(this.a)));
        this.g.a("runtimeVersion", new ed(new cm()));
        this.g.a("sdkVersion", new ed(new co()));
        this.k = new br();
        this.g.a("currentTime", new ed(this.k));
        this.g.a("userProperty", new ed(new cg(this.a, this.m)));
        this.g.a("arbitraryPixel", new ed(new db(aou.a(this.a))));
        this.g.a("customTag", new ed(new bc(new a())));
        this.g.a("universalAnalytics", new ed(new dc(this.a, this.m)));
        this.g.a("queueRequest", new ed(new cz(aou.a(this.a))));
        this.g.a("sendMeasurement", new ed(new da(this.d, this.m)));
        this.g.a("arbitraryPixieTag", new ed(new be(0, this.f)));
        this.g.a("suppressPassthrough", new ed(new bg(this.a, this.m)));
    }

    private void g() {
        this.h.a("decodeURI", new ed(new ax()));
        this.h.a("decodeURIComponent", new ed(new ay()));
        this.h.a("encodeURI", new ed(new az()));
        this.h.a("encodeURIComponent", new ed(new ba()));
        this.h.a("log", new ed(new bf()));
        this.h.a("isArray", new ed(new bb()));
    }

    private void h() {
        ea ehVar = new eh(new HashMap(1));
        ehVar.a("mobile", this.g);
        ehVar.a("common", this.h);
        this.f.a("gtmUtils", ehVar);
        ea ehVar2 = new eh(new HashMap((Map) this.g.b()));
        ehVar2.e();
        ea ehVar3 = new eh(new HashMap((Map) this.h.b()));
        ehVar3.e();
        if (this.f.a("main") && (this.f.b("main") instanceof ed)) {
            List arrayList = new ArrayList();
            arrayList.add(ehVar);
            ek.a(this.f, new ei("main", arrayList));
        }
        this.g.a("base", ehVar2);
        this.h.a("base", ehVar3);
        ehVar.e();
        this.g.e();
        this.h.e();
    }

    private String i() {
        if (this.j <= 1) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Integer.toString(this.j));
        for (int i = 2; i < this.j; i++) {
            stringBuilder.append(l.c);
        }
        stringBuilder.append(": ");
        return stringBuilder.toString();
    }

    ea<?> a(dw dwVar) {
        this.i.clear();
        try {
            ea<?> b = b(a(dwVar.a()));
            if (b instanceof eb) {
                return b;
            }
            aph.a("Predicate must return a boolean value");
            return new eb(Boolean.valueOf(false));
        } catch (IllegalStateException e) {
            aph.a("Error evaluating predicate.");
            return ee.d;
        }
    }

    ea<?> a(dx dxVar, Map<dw, ea<?>> map) {
        String valueOf = String.valueOf(dxVar);
        aph.d(new StringBuilder(String.valueOf(valueOf).length() + 19).append("Evaluating trigger ").append(valueOf).toString());
        for (dw dwVar : dxVar.b()) {
            ea eaVar = (ea) map.get(dwVar);
            if (eaVar == null) {
                eaVar = a(dwVar);
                map.put(dwVar, eaVar);
            }
            ea eaVar2 = eaVar;
            if (eaVar2 == ee.d) {
                return ee.d;
            }
            if (((Boolean) ((eb) eaVar2).b()).booleanValue()) {
                return new eb(Boolean.valueOf(false));
            }
        }
        for (dw dwVar2 : dxVar.a()) {
            eaVar = (ea) map.get(dwVar2);
            if (eaVar == null) {
                eaVar = a(dwVar2);
                map.put(dwVar2, eaVar);
            }
            eaVar2 = eaVar;
            if (eaVar2 == ee.d) {
                return ee.d;
            }
            if (!((Boolean) ((eb) eaVar2).b()).booleanValue()) {
                return new eb(Boolean.valueOf(false));
            }
        }
        return new eb(Boolean.valueOf(true));
    }

    public ea<?> a(String str) {
        if (this.i.contains(str)) {
            String valueOf = String.valueOf(this.i.toString());
            throw new IllegalStateException(new StringBuilder((String.valueOf(str).length() + 77) + String.valueOf(valueOf).length()).append("Macro cycle detected.  Current macro reference: ").append(str).append(". Previous macro references: ").append(valueOf).toString());
        }
        this.j = 0;
        return b(str);
    }

    public void a() {
        aou.a(this.a).a();
    }

    public void a(aow com_google_android_gms_internal_aow) {
        this.f.a("gtm.globals.eventName", new ej(com_google_android_gms_internal_aow.d()));
        this.k.a(com_google_android_gms_internal_aow);
        this.l = com_google_android_gms_internal_aow;
        Set<dw> hashSet = new HashSet();
        Collection hashSet2 = new HashSet();
        Map hashMap = new HashMap();
        for (dx dxVar : this.c.a()) {
            String valueOf;
            if (dxVar.c().isEmpty() && dxVar.d().isEmpty()) {
                String valueOf2 = String.valueOf(dxVar);
                aph.d(new StringBuilder(String.valueOf(valueOf2).length() + 64).append("Trigger is not being evaluated since it has no associated tags: ").append(valueOf2).toString());
            } else {
                ea a = a(dxVar, hashMap);
                if (a == ee.d) {
                    valueOf = String.valueOf(dxVar);
                    aph.b(new StringBuilder(String.valueOf(valueOf).length() + 41).append("Error encounted while evaluating trigger ").append(valueOf).toString());
                    if (!dxVar.d().isEmpty()) {
                        valueOf = String.valueOf(dxVar.d());
                        aph.d(new StringBuilder(String.valueOf(valueOf).length() + 15).append("Blocking tags: ").append(valueOf).toString());
                        hashSet2.addAll(dxVar.d());
                    }
                } else if (((Boolean) ((eb) a).b()).booleanValue()) {
                    valueOf = String.valueOf(dxVar);
                    aph.d(new StringBuilder(String.valueOf(valueOf).length() + 19).append("Trigger is firing: ").append(valueOf).toString());
                    if (!dxVar.c().isEmpty()) {
                        valueOf = String.valueOf(dxVar.c());
                        aph.d(new StringBuilder(String.valueOf(valueOf).length() + 34).append("Adding tags to firing candidates: ").append(valueOf).toString());
                        hashSet.addAll(dxVar.c());
                    }
                    if (!dxVar.d().isEmpty()) {
                        valueOf = String.valueOf(dxVar.d());
                        aph.d(new StringBuilder(String.valueOf(valueOf).length() + 24).append("Blocking disabled tags: ").append(valueOf).toString());
                        hashSet2.addAll(dxVar.d());
                    }
                }
            }
        }
        hashSet.removeAll(hashSet2);
        Object obj = null;
        for (dw dwVar : hashSet) {
            Object obj2;
            this.i.clear();
            String valueOf3 = String.valueOf(dwVar);
            aph.d(new StringBuilder(String.valueOf(valueOf3).length() + 21).append("Executing firing tag ").append(valueOf3).toString());
            try {
                b(a(dwVar.a()));
                if (b(dwVar)) {
                    obj = 1;
                    valueOf2 = String.valueOf(dwVar);
                    aph.d(new StringBuilder(String.valueOf(valueOf2).length() + 36).append("Tag configured to dispatch on fire: ").append(valueOf2).toString());
                }
                obj2 = obj;
            } catch (IllegalStateException e) {
                valueOf3 = "Error firing tag: ";
                valueOf2 = String.valueOf(e.getMessage());
                aph.a(valueOf2.length() != 0 ? valueOf3.concat(valueOf2) : new String(valueOf3));
                obj2 = obj;
            }
            obj = obj2;
        }
        this.f.c("gtm.globals.eventName");
        if (com_google_android_gms_internal_aow.h()) {
            valueOf2 = String.valueOf(com_google_android_gms_internal_aow.d());
            aph.d(new StringBuilder(String.valueOf(valueOf2).length() + 35).append("Log passthrough event ").append(valueOf2).append(" to Firebase.").toString());
            try {
                this.d.a(com_google_android_gms_internal_aow.f(), com_google_android_gms_internal_aow.d(), com_google_android_gms_internal_aow.e(), com_google_android_gms_internal_aow.a());
            } catch (RemoteException e2) {
                valueOf = "Error calling measurement proxy:";
                valueOf2 = String.valueOf(e2.getMessage());
                aph.a(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
            }
        } else {
            valueOf2 = String.valueOf(com_google_android_gms_internal_aow.d());
            aph.d(new StringBuilder(String.valueOf(valueOf2).length() + 63).append("Non-passthrough event ").append(valueOf2).append(" doesn't get logged to Firebase directly.").toString());
        }
        if (obj != null) {
            aph.d("Dispatch called for dispatchOnFire tags.");
            a();
        }
    }

    apr b() {
        return this.f;
    }
}
