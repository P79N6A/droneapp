package com.google.android.gms.measurement.internal;

import android.support.annotation.WorkerThread;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.amu.a;
import com.google.android.gms.internal.amu.b;
import com.google.android.gms.internal.amu.c;
import com.google.android.gms.internal.amu.e;
import com.google.android.gms.internal.amw;
import com.google.android.gms.internal.amw.f;
import com.google.android.gms.internal.amw.g;
import com.google.android.gms.measurement.AppMeasurement$a;
import com.google.android.gms.measurement.AppMeasurement$d;
import com.google.android.gms.measurement.AppMeasurement$e;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class o extends b {
    o(aj ajVar) {
        super(ajVar);
    }

    private Boolean a(b bVar, amw.b bVar2, long j) {
        Boolean a;
        if (bVar.e != null) {
            a = new ae(bVar.e).a(j);
            if (a == null) {
                return null;
            }
            if (!a.booleanValue()) {
                return Boolean.valueOf(false);
            }
        }
        Set hashSet = new HashSet();
        for (c cVar : bVar.c) {
            if (TextUtils.isEmpty(cVar.d)) {
                w().z().a("null or empty param name in filter. event", bVar2.b);
                return null;
            }
            hashSet.add(cVar.d);
        }
        Map arrayMap = new ArrayMap();
        for (amw.c cVar2 : bVar2.a) {
            if (hashSet.contains(cVar2.a)) {
                if (cVar2.c != null) {
                    arrayMap.put(cVar2.a, cVar2.c);
                } else if (cVar2.e != null) {
                    arrayMap.put(cVar2.a, cVar2.e);
                } else if (cVar2.b != null) {
                    arrayMap.put(cVar2.a, cVar2.b);
                } else {
                    w().z().a("Unknown value for param. event, param", bVar2.b, cVar2.a);
                    return null;
                }
            }
        }
        for (c cVar3 : bVar.c) {
            boolean equals = Boolean.TRUE.equals(cVar3.c);
            CharSequence charSequence = cVar3.d;
            if (TextUtils.isEmpty(charSequence)) {
                w().z().a("Event has empty param name. event", bVar2.b);
                return null;
            }
            Object obj = arrayMap.get(charSequence);
            if (obj instanceof Long) {
                if (cVar3.b == null) {
                    w().z().a("No number filter for long param. event, param", bVar2.b, charSequence);
                    return null;
                }
                a = new ae(cVar3.b).a(((Long) obj).longValue());
                if (a == null) {
                    return null;
                }
                if (((!a.booleanValue() ? 1 : 0) ^ equals) != 0) {
                    return Boolean.valueOf(false);
                }
            } else if (obj instanceof Double) {
                if (cVar3.b == null) {
                    w().z().a("No number filter for double param. event, param", bVar2.b, charSequence);
                    return null;
                }
                a = new ae(cVar3.b).a(((Double) obj).doubleValue());
                if (a == null) {
                    return null;
                }
                if (((!a.booleanValue() ? 1 : 0) ^ equals) != 0) {
                    return Boolean.valueOf(false);
                }
            } else if (obj instanceof String) {
                if (cVar3.a == null) {
                    w().z().a("No string filter for String param. event, param", bVar2.b, charSequence);
                    return null;
                }
                a = new h(cVar3.a).a((String) obj);
                if (a == null) {
                    return null;
                }
                if (((!a.booleanValue() ? 1 : 0) ^ equals) != 0) {
                    return Boolean.valueOf(false);
                }
            } else if (obj == null) {
                w().E().a("Missing param for filter. event, param", bVar2.b, charSequence);
                return Boolean.valueOf(false);
            } else {
                w().z().a("Unknown param type. event, param", bVar2.b, charSequence);
                return null;
            }
        }
        return Boolean.valueOf(true);
    }

    private Boolean a(e eVar, g gVar) {
        c cVar = eVar.c;
        if (cVar == null) {
            w().z().a("Missing property filter. property", gVar.b);
            return null;
        }
        boolean equals = Boolean.TRUE.equals(cVar.c);
        if (gVar.d != null) {
            if (cVar.b != null) {
                return a(new ae(cVar.b).a(gVar.d.longValue()), equals);
            }
            w().z().a("No number filter for long property. property", gVar.b);
            return null;
        } else if (gVar.f != null) {
            if (cVar.b != null) {
                return a(new ae(cVar.b).a(gVar.f.doubleValue()), equals);
            }
            w().z().a("No number filter for double property. property", gVar.b);
            return null;
        } else if (gVar.c == null) {
            w().z().a("User property has no value, property", gVar.b);
            return null;
        } else if (cVar.a != null) {
            return a(new h(cVar.a).a(gVar.c), equals);
        } else {
            if (cVar.b == null) {
                w().z().a("No string or number filter defined. property", gVar.b);
                return null;
            }
            ae aeVar = new ae(cVar.b);
            if (m.n(gVar.c)) {
                return a(aeVar.a(gVar.c), equals);
            }
            w().z().a("Invalid user property value for Numeric number filter. property, value", gVar.b, gVar.c);
            return null;
        }
    }

    static Boolean a(Boolean bool, boolean z) {
        return bool == null ? null : Boolean.valueOf(bool.booleanValue() ^ z);
    }

    @WorkerThread
    void a(String str, a[] aVarArr) {
        d.a(aVarArr);
        for (a aVar : aVarArr) {
            for (b bVar : aVar.c) {
                String str2 = (String) AppMeasurement$a.a.get(bVar.b);
                if (str2 != null) {
                    bVar.b = str2;
                }
                for (c cVar : bVar.c) {
                    str2 = (String) AppMeasurement$d.a.get(cVar.d);
                    if (str2 != null) {
                        cVar.d = str2;
                    }
                }
            }
            for (e eVar : aVar.b) {
                str2 = (String) AppMeasurement$e.a.get(eVar.b);
                if (str2 != null) {
                    eVar.b = str2;
                }
            }
        }
        r().a(str, aVarArr);
    }

    @WorkerThread
    amw.a[] a(String str, amw.b[] bVarArr, g[] gVarArr) {
        int intValue;
        BitSet bitSet;
        BitSet bitSet2;
        Map map;
        Map map2;
        Boolean a;
        Object obj;
        d.a(str);
        Set hashSet = new HashSet();
        ArrayMap arrayMap = new ArrayMap();
        Map arrayMap2 = new ArrayMap();
        ArrayMap arrayMap3 = new ArrayMap();
        Map f = r().f(str);
        if (f != null) {
            for (Integer intValue2 : f.keySet()) {
                intValue = intValue2.intValue();
                f fVar = (f) f.get(Integer.valueOf(intValue));
                bitSet = (BitSet) arrayMap2.get(Integer.valueOf(intValue));
                bitSet2 = (BitSet) arrayMap3.get(Integer.valueOf(intValue));
                if (bitSet == null) {
                    bitSet = new BitSet();
                    arrayMap2.put(Integer.valueOf(intValue), bitSet);
                    bitSet2 = new BitSet();
                    arrayMap3.put(Integer.valueOf(intValue), bitSet2);
                }
                for (int i = 0; i < fVar.a.length * 64; i++) {
                    if (m.a(fVar.a, i)) {
                        w().E().a("Filter already evaluated. audience ID, filter ID", Integer.valueOf(intValue), Integer.valueOf(i));
                        bitSet2.set(i);
                        if (m.a(fVar.b, i)) {
                            bitSet.set(i);
                        }
                    }
                }
                amw.a aVar = new amw.a();
                arrayMap.put(Integer.valueOf(intValue), aVar);
                aVar.d = Boolean.valueOf(false);
                aVar.c = fVar;
                aVar.b = new f();
                aVar.b.b = m.a(bitSet);
                aVar.b.a = m.a(bitSet2);
            }
        }
        if (bVarArr != null) {
            ArrayMap arrayMap4 = new ArrayMap();
            for (amw.b bVar : bVarArr) {
                u uVar;
                u a2 = r().a(str, bVar.b);
                if (a2 == null) {
                    w().z().a("Event aggregate wasn't created during raw event logging. event", bVar.b);
                    uVar = new u(str, bVar.b, 1, 1, bVar.c.longValue());
                } else {
                    uVar = a2.a();
                }
                r().a(uVar);
                long j = uVar.c;
                map = (Map) arrayMap4.get(bVar.b);
                if (map == null) {
                    map = r().d(str, bVar.b);
                    if (map == null) {
                        map = new ArrayMap();
                    }
                    arrayMap4.put(bVar.b, map);
                    map2 = map;
                } else {
                    map2 = map;
                }
                for (Integer intValue22 : r7.keySet()) {
                    int intValue3 = intValue22.intValue();
                    if (hashSet.contains(Integer.valueOf(intValue3))) {
                        w().E().a("Skipping failed audience ID", Integer.valueOf(intValue3));
                    } else {
                        bitSet = (BitSet) arrayMap2.get(Integer.valueOf(intValue3));
                        bitSet2 = (BitSet) arrayMap3.get(Integer.valueOf(intValue3));
                        if (((amw.a) arrayMap.get(Integer.valueOf(intValue3))) == null) {
                            amw.a aVar2 = new amw.a();
                            arrayMap.put(Integer.valueOf(intValue3), aVar2);
                            aVar2.d = Boolean.valueOf(true);
                            bitSet = new BitSet();
                            arrayMap2.put(Integer.valueOf(intValue3), bitSet);
                            bitSet2 = new BitSet();
                            arrayMap3.put(Integer.valueOf(intValue3), bitSet2);
                        }
                        for (b bVar2 : (List) r7.get(Integer.valueOf(intValue3))) {
                            if (w().a(2)) {
                                w().E().a("Evaluating filter. audience, filter, event", Integer.valueOf(intValue3), bVar2.a, bVar2.b);
                                w().E().a("Filter definition", m.a(bVar2));
                            }
                            if (bVar2.a == null || bVar2.a.intValue() > 256) {
                                w().z().a("Invalid event filter ID. id", String.valueOf(bVar2.a));
                            } else if (bitSet.get(bVar2.a.intValue())) {
                                w().E().a("Event filter already evaluated true. audience ID, filter ID", Integer.valueOf(intValue3), bVar2.a);
                            } else {
                                a = a(bVar2, bVar, j);
                                ab.a E = w().E();
                                String str2 = "Event filter result";
                                if (a == null) {
                                    obj = "null";
                                } else {
                                    Boolean bool = a;
                                }
                                E.a(str2, obj);
                                if (a == null) {
                                    hashSet.add(Integer.valueOf(intValue3));
                                } else {
                                    bitSet2.set(bVar2.a.intValue());
                                    if (a.booleanValue()) {
                                        bitSet.set(bVar2.a.intValue());
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (gVarArr != null) {
            Map arrayMap5 = new ArrayMap();
            for (g gVar : gVarArr) {
                map = (Map) arrayMap5.get(gVar.b);
                if (map == null) {
                    map = r().e(str, gVar.b);
                    if (map == null) {
                        map = new ArrayMap();
                    }
                    arrayMap5.put(gVar.b, map);
                    map2 = map;
                } else {
                    map2 = map;
                }
                for (Integer intValue222 : r7.keySet()) {
                    int intValue4 = intValue222.intValue();
                    if (hashSet.contains(Integer.valueOf(intValue4))) {
                        w().E().a("Skipping failed audience ID", Integer.valueOf(intValue4));
                    } else {
                        bitSet = (BitSet) arrayMap2.get(Integer.valueOf(intValue4));
                        bitSet2 = (BitSet) arrayMap3.get(Integer.valueOf(intValue4));
                        if (((amw.a) arrayMap.get(Integer.valueOf(intValue4))) == null) {
                            aVar2 = new amw.a();
                            arrayMap.put(Integer.valueOf(intValue4), aVar2);
                            aVar2.d = Boolean.valueOf(true);
                            bitSet = new BitSet();
                            arrayMap2.put(Integer.valueOf(intValue4), bitSet);
                            bitSet2 = new BitSet();
                            arrayMap3.put(Integer.valueOf(intValue4), bitSet2);
                        }
                        for (e eVar : (List) r7.get(Integer.valueOf(intValue4))) {
                            if (w().a(2)) {
                                w().E().a("Evaluating filter. audience, filter, property", Integer.valueOf(intValue4), eVar.a, eVar.b);
                                w().E().a("Filter definition", m.a(eVar));
                            }
                            if (eVar.a == null || eVar.a.intValue() > 256) {
                                w().z().a("Invalid property filter ID. id", String.valueOf(eVar.a));
                                hashSet.add(Integer.valueOf(intValue4));
                                break;
                            } else if (bitSet.get(eVar.a.intValue())) {
                                w().E().a("Property filter already evaluated true. audience ID, filter ID", Integer.valueOf(intValue4), eVar.a);
                            } else {
                                a = a(eVar, gVar);
                                ab.a E2 = w().E();
                                String str3 = "Property filter result";
                                if (a == null) {
                                    obj = "null";
                                } else {
                                    bool = a;
                                }
                                E2.a(str3, obj);
                                if (a == null) {
                                    hashSet.add(Integer.valueOf(intValue4));
                                } else {
                                    bitSet2.set(eVar.a.intValue());
                                    if (a.booleanValue()) {
                                        bitSet.set(eVar.a.intValue());
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        amw.a[] aVarArr = new amw.a[arrayMap2.size()];
        int i2 = 0;
        for (Integer intValue2222 : arrayMap2.keySet()) {
            intValue = intValue2222.intValue();
            if (!hashSet.contains(Integer.valueOf(intValue))) {
                aVar2 = (amw.a) arrayMap.get(Integer.valueOf(intValue));
                aVar = aVar2 == null ? new amw.a() : aVar2;
                int i3 = i2 + 1;
                aVarArr[i2] = aVar;
                aVar.a = Integer.valueOf(intValue);
                aVar.b = new f();
                aVar.b.b = m.a((BitSet) arrayMap2.get(Integer.valueOf(intValue)));
                aVar.b.a = m.a((BitSet) arrayMap3.get(Integer.valueOf(intValue)));
                r().a(str, intValue, aVar.b);
                i2 = i3;
            }
        }
        return (amw.a[]) Arrays.copyOf(aVarArr, i2);
    }

    protected void e() {
    }
}
