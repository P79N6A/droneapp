package com.google.android.gms.internal;

import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public final class fe {

    public static class a {
        public final ff a;
        public final List<Asset> b;

        public a(ff ffVar, List<Asset> list) {
            this.a = ffVar;
            this.b = list;
        }
    }

    private static int a(String str, com.google.android.gms.internal.ff.a.a[] aVarArr) {
        int i = 14;
        for (com.google.android.gms.internal.ff.a.a aVar : aVarArr) {
            if (i == 14) {
                if (aVar.a == 9 || aVar.a == 2 || aVar.a == 6) {
                    i = aVar.a;
                } else if (aVar.a != 14) {
                    throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 48).append("Unexpected TypedValue type: ").append(aVar.a).append(" for key ").append(str).toString());
                }
            } else if (aVar.a != i) {
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 126).append("The ArrayList elements should all be the same type, but ArrayList with key ").append(str).append(" contains items of type ").append(i).append(" and ").append(aVar.a).toString());
            }
        }
        return i;
    }

    static int a(List<Asset> list, Asset asset) {
        list.add(asset);
        return list.size() - 1;
    }

    public static a a(k kVar) {
        ff ffVar = new ff();
        List arrayList = new ArrayList();
        ffVar.a = a(kVar, arrayList);
        return new a(ffVar, arrayList);
    }

    private static com.google.android.gms.internal.ff.a.a a(List<Asset> list, Object obj) {
        com.google.android.gms.internal.ff.a.a aVar = new com.google.android.gms.internal.ff.a.a();
        if (obj == null) {
            aVar.a = 14;
            return aVar;
        }
        aVar.b = new com.google.android.gms.internal.ff.a.a.a();
        if (obj instanceof String) {
            aVar.a = 2;
            aVar.b.b = (String) obj;
        } else if (obj instanceof Integer) {
            aVar.a = 6;
            aVar.b.f = ((Integer) obj).intValue();
        } else if (obj instanceof Long) {
            aVar.a = 5;
            aVar.b.e = ((Long) obj).longValue();
        } else if (obj instanceof Double) {
            aVar.a = 3;
            aVar.b.c = ((Double) obj).doubleValue();
        } else if (obj instanceof Float) {
            aVar.a = 4;
            aVar.b.d = ((Float) obj).floatValue();
        } else if (obj instanceof Boolean) {
            aVar.a = 8;
            aVar.b.h = ((Boolean) obj).booleanValue();
        } else if (obj instanceof Byte) {
            aVar.a = 7;
            aVar.b.g = ((Byte) obj).byteValue();
        } else if (obj instanceof byte[]) {
            aVar.a = 1;
            aVar.b.a = (byte[]) obj;
        } else if (obj instanceof String[]) {
            aVar.a = 11;
            aVar.b.k = (String[]) obj;
        } else if (obj instanceof long[]) {
            aVar.a = 12;
            aVar.b.l = (long[]) obj;
        } else if (obj instanceof float[]) {
            aVar.a = 15;
            aVar.b.m = (float[]) obj;
        } else if (obj instanceof Asset) {
            aVar.a = 13;
            aVar.b.n = (long) a((List) list, (Asset) obj);
        } else if (obj instanceof k) {
            aVar.a = 9;
            k kVar = (k) obj;
            TreeSet treeSet = new TreeSet(kVar.f());
            com.google.android.gms.internal.ff.a[] aVarArr = new com.google.android.gms.internal.ff.a[treeSet.size()];
            Iterator it = treeSet.iterator();
            r1 = 0;
            while (it.hasNext()) {
                r0 = (String) it.next();
                aVarArr[r1] = new com.google.android.gms.internal.ff.a();
                aVarArr[r1].a = r0;
                aVarArr[r1].b = a((List) list, kVar.b(r0));
                r1++;
            }
            aVar.b.i = aVarArr;
        } else if (obj instanceof ArrayList) {
            aVar.a = 10;
            ArrayList arrayList = (ArrayList) obj;
            com.google.android.gms.internal.ff.a.a[] aVarArr2 = new com.google.android.gms.internal.ff.a.a[arrayList.size()];
            Object obj2 = null;
            int size = arrayList.size();
            int i = 0;
            int i2 = 14;
            while (i < size) {
                Object obj3 = arrayList.get(i);
                com.google.android.gms.internal.ff.a.a a = a((List) list, obj3);
                if (a.a == 14 || a.a == 2 || a.a == 6 || a.a == 9) {
                    if (i2 == 14 && a.a != 14) {
                        r1 = a.a;
                    } else if (a.a != i2) {
                        String valueOf = String.valueOf(obj2.getClass());
                        r0 = String.valueOf(obj3.getClass());
                        throw new IllegalArgumentException(new StringBuilder((String.valueOf(valueOf).length() + 80) + String.valueOf(r0).length()).append("ArrayList elements must all be of the sameclass, but this one contains a ").append(valueOf).append(" and a ").append(r0).toString());
                    } else {
                        obj3 = obj2;
                        r1 = i2;
                    }
                    aVarArr2[i] = a;
                    i++;
                    i2 = r1;
                    obj2 = obj3;
                } else {
                    r0 = String.valueOf(obj3.getClass());
                    throw new IllegalArgumentException(new StringBuilder(String.valueOf(r0).length() + 130).append("The only ArrayList element types supported by DataBundleUtil are String, Integer, Bundle, and null, but this ArrayList contains a ").append(r0).toString());
                }
            }
            aVar.b.j = aVarArr2;
        } else {
            String str = "newFieldValueFromValue: unexpected value ";
            r0 = String.valueOf(obj.getClass().getSimpleName());
            throw new RuntimeException(r0.length() != 0 ? str.concat(r0) : new String(str));
        }
        return aVar;
    }

    public static k a(a aVar) {
        k kVar = new k();
        for (com.google.android.gms.internal.ff.a aVar2 : aVar.a.a) {
            a(aVar.b, kVar, aVar2.a, aVar2.b);
        }
        return kVar;
    }

    private static ArrayList a(List<Asset> list, com.google.android.gms.internal.ff.a.a.a aVar, int i) {
        ArrayList arrayList = new ArrayList(aVar.j.length);
        for (com.google.android.gms.internal.ff.a.a aVar2 : aVar.j) {
            if (aVar2.a == 14) {
                arrayList.add(null);
            } else if (i == 9) {
                k kVar = new k();
                for (com.google.android.gms.internal.ff.a aVar3 : aVar2.b.i) {
                    a(list, kVar, aVar3.a, aVar3.b);
                }
                arrayList.add(kVar);
            } else if (i == 2) {
                arrayList.add(aVar2.b.b);
            } else if (i == 6) {
                arrayList.add(Integer.valueOf(aVar2.b.f));
            } else {
                throw new IllegalArgumentException("Unexpected typeOfArrayList: " + i);
            }
        }
        return arrayList;
    }

    private static void a(List<Asset> list, k kVar, String str, com.google.android.gms.internal.ff.a.a aVar) {
        int i = aVar.a;
        if (i == 14) {
            kVar.a(str, null);
            return;
        }
        com.google.android.gms.internal.ff.a.a.a aVar2 = aVar.b;
        if (i == 1) {
            kVar.a(str, aVar2.a);
        } else if (i == 11) {
            kVar.a(str, aVar2.k);
        } else if (i == 12) {
            kVar.a(str, aVar2.l);
        } else if (i == 15) {
            kVar.a(str, aVar2.m);
        } else if (i == 2) {
            kVar.a(str, aVar2.b);
        } else if (i == 3) {
            kVar.a(str, aVar2.c);
        } else if (i == 4) {
            kVar.a(str, aVar2.d);
        } else if (i == 5) {
            kVar.a(str, aVar2.e);
        } else if (i == 6) {
            kVar.a(str, aVar2.f);
        } else if (i == 7) {
            kVar.a(str, (byte) aVar2.g);
        } else if (i == 8) {
            kVar.a(str, aVar2.h);
        } else if (i == 13) {
            if (list == null) {
                String str2 = "populateBundle: unexpected type for: ";
                String valueOf = String.valueOf(str);
                throw new RuntimeException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            }
            kVar.a(str, (Asset) list.get((int) aVar2.n));
        } else if (i == 9) {
            k kVar2 = new k();
            for (com.google.android.gms.internal.ff.a aVar3 : aVar2.i) {
                a(list, kVar2, aVar3.a, aVar3.b);
            }
            kVar.a(str, kVar2);
        } else if (i == 10) {
            i = a(str, aVar2.j);
            ArrayList a = a(list, aVar2, i);
            if (i == 14) {
                kVar.c(str, a);
            } else if (i == 9) {
                kVar.a(str, a);
            } else if (i == 2) {
                kVar.c(str, a);
            } else if (i == 6) {
                kVar.b(str, a);
            } else {
                throw new IllegalStateException("Unexpected typeOfArrayList: " + i);
            }
        } else {
            throw new RuntimeException("populateBundle: unexpected type " + i);
        }
    }

    private static com.google.android.gms.internal.ff.a[] a(k kVar, List<Asset> list) {
        TreeSet treeSet = new TreeSet(kVar.f());
        com.google.android.gms.internal.ff.a[] aVarArr = new com.google.android.gms.internal.ff.a[treeSet.size()];
        Iterator it = treeSet.iterator();
        int i = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            Object b = kVar.b(str);
            aVarArr[i] = new com.google.android.gms.internal.ff.a();
            aVarArr[i].a = str;
            aVarArr[i].b = a((List) list, b);
            i++;
        }
        return aVarArr;
    }
}
