package com.google.android.gms.wearable;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.fe;
import com.google.android.gms.internal.fe.a;
import com.google.android.gms.internal.ff;
import com.google.android.gms.internal.rd;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class k {
    public static final String a = "DataMap";
    private final HashMap<String, Object> b = new HashMap();

    public static k a(Bundle bundle) {
        bundle.setClassLoader(Asset.class.getClassLoader());
        k kVar = new k();
        for (String str : bundle.keySet()) {
            a(kVar, str, bundle.get(str));
        }
        return kVar;
    }

    public static k a(byte[] bArr) {
        try {
            return fe.a(new a(ff.a(bArr), new ArrayList()));
        } catch (Throwable e) {
            throw new IllegalArgumentException("Unable to convert data", e);
        }
    }

    public static ArrayList<k> a(ArrayList<Bundle> arrayList) {
        ArrayList<k> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(a((Bundle) it.next()));
        }
        return arrayList2;
    }

    private static void a(Bundle bundle, String str, Object obj) {
        if (obj instanceof String) {
            bundle.putString(str, (String) obj);
        } else if (obj instanceof Integer) {
            bundle.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Float) {
            bundle.putFloat(str, ((Float) obj).floatValue());
        } else if (obj instanceof Boolean) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Byte) {
            bundle.putByte(str, ((Byte) obj).byteValue());
        } else if (obj instanceof byte[]) {
            bundle.putByteArray(str, (byte[]) obj);
        } else if (obj instanceof String[]) {
            bundle.putStringArray(str, (String[]) obj);
        } else if (obj instanceof long[]) {
            bundle.putLongArray(str, (long[]) obj);
        } else if (obj instanceof float[]) {
            bundle.putFloatArray(str, (float[]) obj);
        } else if (obj instanceof Asset) {
            bundle.putParcelable(str, (Asset) obj);
        } else if (obj instanceof k) {
            bundle.putParcelable(str, ((k) obj).a());
        } else if (obj instanceof ArrayList) {
            switch (b((ArrayList) obj)) {
                case 0:
                    bundle.putStringArrayList(str, (ArrayList) obj);
                    return;
                case 1:
                    bundle.putStringArrayList(str, (ArrayList) obj);
                    return;
                case 2:
                    bundle.putIntegerArrayList(str, (ArrayList) obj);
                    return;
                case 3:
                    bundle.putStringArrayList(str, (ArrayList) obj);
                    return;
                case 4:
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ((ArrayList) obj).iterator();
                    while (it.hasNext()) {
                        arrayList.add(((k) it.next()).a());
                    }
                    bundle.putParcelableArrayList(str, arrayList);
                    return;
                default:
                    return;
            }
        }
    }

    private static void a(k kVar, String str, Object obj) {
        if (obj instanceof String) {
            kVar.a(str, (String) obj);
        } else if (obj instanceof Integer) {
            kVar.a(str, ((Integer) obj).intValue());
        } else if (obj instanceof Long) {
            kVar.a(str, ((Long) obj).longValue());
        } else if (obj instanceof Double) {
            kVar.a(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Float) {
            kVar.a(str, ((Float) obj).floatValue());
        } else if (obj instanceof Boolean) {
            kVar.a(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Byte) {
            kVar.a(str, ((Byte) obj).byteValue());
        } else if (obj instanceof byte[]) {
            kVar.a(str, (byte[]) obj);
        } else if (obj instanceof String[]) {
            kVar.a(str, (String[]) obj);
        } else if (obj instanceof long[]) {
            kVar.a(str, (long[]) obj);
        } else if (obj instanceof float[]) {
            kVar.a(str, (float[]) obj);
        } else if (obj instanceof Asset) {
            kVar.a(str, (Asset) obj);
        } else if (obj instanceof Bundle) {
            kVar.a(str, a((Bundle) obj));
        } else if (obj instanceof ArrayList) {
            switch (b((ArrayList) obj)) {
                case 0:
                    kVar.c(str, (ArrayList) obj);
                    return;
                case 1:
                    kVar.c(str, (ArrayList) obj);
                    return;
                case 2:
                    kVar.b(str, (ArrayList) obj);
                    return;
                case 3:
                    kVar.c(str, (ArrayList) obj);
                    return;
                case 5:
                    kVar.a(str, a((ArrayList) obj));
                    return;
                default:
                    return;
            }
        }
    }

    private void a(String str, Object obj, String str2, ClassCastException classCastException) {
        a(str, obj, str2, "<null>", classCastException);
    }

    private void a(String str, Object obj, String str2, Object obj2, ClassCastException classCastException) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Key ");
        stringBuilder.append(str);
        stringBuilder.append(" expected ");
        stringBuilder.append(str2);
        stringBuilder.append(" but value was a ");
        stringBuilder.append(obj.getClass().getName());
        stringBuilder.append(".  The default value ");
        stringBuilder.append(obj2);
        stringBuilder.append(" was returned.");
        Log.w(a, stringBuilder.toString());
        Log.w(a, "Attempt to cast generated internal exception:", classCastException);
    }

    private static boolean a(Asset asset, Asset asset2) {
        return (asset == null || asset2 == null) ? asset == asset2 : !TextUtils.isEmpty(asset.b()) ? asset.b().equals(asset2.b()) : Arrays.equals(asset.a(), asset2.a());
    }

    private static boolean a(k kVar, k kVar2) {
        if (kVar.c() != kVar2.c()) {
            return false;
        }
        for (String str : kVar.f()) {
            Object b = kVar.b(str);
            Object b2 = kVar2.b(str);
            if (b instanceof Asset) {
                if (!(b2 instanceof Asset)) {
                    return false;
                }
                if (!a((Asset) b, (Asset) b2)) {
                    return false;
                }
            } else if (b instanceof String[]) {
                if (!(b2 instanceof String[])) {
                    return false;
                }
                if (!Arrays.equals((String[]) b, (String[]) b2)) {
                    return false;
                }
            } else if (b instanceof long[]) {
                if (!(b2 instanceof long[])) {
                    return false;
                }
                if (!Arrays.equals((long[]) b, (long[]) b2)) {
                    return false;
                }
            } else if (b instanceof float[]) {
                if (!(b2 instanceof float[])) {
                    return false;
                }
                if (!Arrays.equals((float[]) b, (float[]) b2)) {
                    return false;
                }
            } else if (b instanceof byte[]) {
                if (!(b2 instanceof byte[])) {
                    return false;
                }
                if (!Arrays.equals((byte[]) b, (byte[]) b2)) {
                    return false;
                }
            } else if (b == null || b2 == null) {
                return b == b2;
            } else if (!b.equals(b2)) {
                return false;
            }
        }
        return true;
    }

    private static int b(ArrayList<?> arrayList) {
        if (arrayList.isEmpty()) {
            return 0;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next != null) {
                if (next instanceof Integer) {
                    return 2;
                }
                if (next instanceof String) {
                    return 3;
                }
                if (next instanceof k) {
                    return 4;
                }
                if (next instanceof Bundle) {
                    return 5;
                }
            }
        }
        return 1;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        for (String str : this.b.keySet()) {
            a(bundle, str, this.b.get(str));
        }
        return bundle;
    }

    public void a(k kVar) {
        for (String str : kVar.f()) {
            this.b.put(str, kVar.b(str));
        }
    }

    public void a(String str, byte b) {
        this.b.put(str, Byte.valueOf(b));
    }

    public void a(String str, double d) {
        this.b.put(str, Double.valueOf(d));
    }

    public void a(String str, float f) {
        this.b.put(str, Float.valueOf(f));
    }

    public void a(String str, int i) {
        this.b.put(str, Integer.valueOf(i));
    }

    public void a(String str, long j) {
        this.b.put(str, Long.valueOf(j));
    }

    public void a(String str, Asset asset) {
        this.b.put(str, asset);
    }

    public void a(String str, k kVar) {
        this.b.put(str, kVar);
    }

    public void a(String str, String str2) {
        this.b.put(str, str2);
    }

    public void a(String str, ArrayList<k> arrayList) {
        this.b.put(str, arrayList);
    }

    public void a(String str, boolean z) {
        this.b.put(str, Boolean.valueOf(z));
    }

    public void a(String str, byte[] bArr) {
        this.b.put(str, bArr);
    }

    public void a(String str, float[] fArr) {
        this.b.put(str, fArr);
    }

    public void a(String str, long[] jArr) {
        this.b.put(str, jArr);
    }

    public void a(String str, String[] strArr) {
        this.b.put(str, strArr);
    }

    public boolean a(String str) {
        return this.b.containsKey(str);
    }

    public byte b(String str, byte b) {
        Object obj = this.b.get(str);
        if (obj != null) {
            try {
                b = ((Byte) obj).byteValue();
            } catch (ClassCastException e) {
                a(str, obj, "Byte", Byte.valueOf(b), e);
            }
        }
        return b;
    }

    public double b(String str, double d) {
        Object obj = this.b.get(str);
        if (obj != null) {
            try {
                d = ((Double) obj).doubleValue();
            } catch (ClassCastException e) {
                a(str, obj, "Double", Double.valueOf(d), e);
            }
        }
        return d;
    }

    public float b(String str, float f) {
        Object obj = this.b.get(str);
        if (obj != null) {
            try {
                f = ((Float) obj).floatValue();
            } catch (ClassCastException e) {
                a(str, obj, "Float", Float.valueOf(f), e);
            }
        }
        return f;
    }

    public int b(String str, int i) {
        Object obj = this.b.get(str);
        if (obj != null) {
            try {
                i = ((Integer) obj).intValue();
            } catch (ClassCastException e) {
                a(str, obj, "Integer", e);
            }
        }
        return i;
    }

    public long b(String str, long j) {
        Object obj = this.b.get(str);
        if (obj != null) {
            try {
                j = ((Long) obj).longValue();
            } catch (ClassCastException e) {
                a(str, obj, "long", e);
            }
        }
        return j;
    }

    public <T> T b(String str) {
        return this.b.get(str);
    }

    public String b(String str, String str2) {
        String j = j(str);
        return j == null ? str2 : j;
    }

    public void b(String str, ArrayList<Integer> arrayList) {
        this.b.put(str, arrayList);
    }

    public boolean b(String str, boolean z) {
        Object obj = this.b.get(str);
        if (obj != null) {
            try {
                z = ((Boolean) obj).booleanValue();
            } catch (ClassCastException e) {
                a(str, obj, "Boolean", Boolean.valueOf(z), e);
            }
        }
        return z;
    }

    public byte[] b() {
        return rd.a(fe.a(this).a);
    }

    public int c() {
        return this.b.size();
    }

    public Object c(String str) {
        return this.b.remove(str);
    }

    public void c(String str, ArrayList<String> arrayList) {
        this.b.put(str, arrayList);
    }

    public boolean d() {
        return this.b.isEmpty();
    }

    public boolean d(String str) {
        return b(str, false);
    }

    public byte e(String str) {
        return b(str, (byte) 0);
    }

    public void e() {
        this.b.clear();
    }

    public boolean equals(Object obj) {
        return !(obj instanceof k) ? false : a(this, (k) obj);
    }

    public int f(String str) {
        return b(str, 0);
    }

    public Set<String> f() {
        return this.b.keySet();
    }

    public long g(String str) {
        return b(str, 0);
    }

    public float h(String str) {
        return b(str, 0.0f);
    }

    public int hashCode() {
        return this.b.hashCode() * 29;
    }

    public double i(String str) {
        return b(str, 0.0d);
    }

    public String j(String str) {
        Object obj = this.b.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (String) obj;
        } catch (ClassCastException e) {
            a(str, obj, "String", e);
            return null;
        }
    }

    public Asset k(String str) {
        Object obj = this.b.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (Asset) obj;
        } catch (ClassCastException e) {
            a(str, obj, "Asset", e);
            return null;
        }
    }

    public k l(String str) {
        Object obj = this.b.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (k) obj;
        } catch (ClassCastException e) {
            a(str, obj, a, e);
            return null;
        }
    }

    public ArrayList<Integer> m(String str) {
        Object obj = this.b.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (ArrayList) obj;
        } catch (ClassCastException e) {
            a(str, obj, "ArrayList<Integer>", e);
            return null;
        }
    }

    public ArrayList<String> n(String str) {
        Object obj = this.b.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (ArrayList) obj;
        } catch (ClassCastException e) {
            a(str, obj, "ArrayList<String>", e);
            return null;
        }
    }

    public ArrayList<k> o(String str) {
        Object obj = this.b.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (ArrayList) obj;
        } catch (ClassCastException e) {
            a(str, obj, "ArrayList<DataMap>", e);
            return null;
        }
    }

    public byte[] p(String str) {
        Object obj = this.b.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (byte[]) obj;
        } catch (ClassCastException e) {
            a(str, obj, "byte[]", e);
            return null;
        }
    }

    public long[] q(String str) {
        Object obj = this.b.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (long[]) obj;
        } catch (ClassCastException e) {
            a(str, obj, "long[]", e);
            return null;
        }
    }

    public float[] r(String str) {
        Object obj = this.b.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (float[]) obj;
        } catch (ClassCastException e) {
            a(str, obj, "float[]", e);
            return null;
        }
    }

    public String[] s(String str) {
        Object obj = this.b.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (String[]) obj;
        } catch (ClassCastException e) {
            a(str, obj, "String[]", e);
            return null;
        }
    }

    public String toString() {
        return this.b.toString();
    }
}
