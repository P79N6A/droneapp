package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.util.SparseArray;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.common.util.b;
import com.google.android.gms.common.util.c;
import com.google.android.gms.common.util.p;
import com.google.android.gms.common.util.q;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SafeParcelResponse extends FastSafeParcelableJsonResponse {
    public static final e CREATOR = new e();
    private final int a;
    private final Parcel b;
    private final int c = 2;
    private final FieldMappingDictionary d;
    private final String e;
    private int f;
    private int g;

    SafeParcelResponse(int i, Parcel parcel, FieldMappingDictionary fieldMappingDictionary) {
        this.a = i;
        this.b = (Parcel) d.a(parcel);
        this.d = fieldMappingDictionary;
        if (this.d == null) {
            this.e = null;
        } else {
            this.e = this.d.d();
        }
        this.f = 2;
    }

    private static SparseArray<Entry<String, Field<?, ?>>> a(Map<String, Field<?, ?>> map) {
        SparseArray<Entry<String, Field<?, ?>>> sparseArray = new SparseArray();
        for (Entry entry : map.entrySet()) {
            sparseArray.put(((Field) entry.getValue()).g(), entry);
        }
        return sparseArray;
    }

    public static HashMap<String, String> a(Bundle bundle) {
        HashMap<String, String> hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            hashMap.put(str, bundle.getString(str));
        }
        return hashMap;
    }

    private void a(StringBuilder stringBuilder, int i, Object obj) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                stringBuilder.append(obj);
                return;
            case 7:
                stringBuilder.append("\"").append(p.a(obj.toString())).append("\"");
                return;
            case 8:
                stringBuilder.append("\"").append(c.a((byte[]) obj)).append("\"");
                return;
            case 9:
                stringBuilder.append("\"").append(c.b((byte[]) obj));
                stringBuilder.append("\"");
                return;
            case 10:
                q.a(stringBuilder, (HashMap) obj);
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException("Unknown type = " + i);
        }
    }

    private void a(StringBuilder stringBuilder, Field<?, ?> field, Parcel parcel, int i) {
        switch (field.d()) {
            case 0:
                a(stringBuilder, (Field) field, a(field, Integer.valueOf(a.g(parcel, i))));
                return;
            case 1:
                a(stringBuilder, (Field) field, a(field, a.k(parcel, i)));
                return;
            case 2:
                a(stringBuilder, (Field) field, a(field, Long.valueOf(a.i(parcel, i))));
                return;
            case 3:
                a(stringBuilder, (Field) field, a(field, Float.valueOf(a.l(parcel, i))));
                return;
            case 4:
                a(stringBuilder, (Field) field, a(field, Double.valueOf(a.n(parcel, i))));
                return;
            case 5:
                a(stringBuilder, (Field) field, a(field, a.p(parcel, i)));
                return;
            case 6:
                a(stringBuilder, (Field) field, a(field, Boolean.valueOf(a.c(parcel, i))));
                return;
            case 7:
                a(stringBuilder, (Field) field, a(field, a.q(parcel, i)));
                return;
            case 8:
            case 9:
                a(stringBuilder, (Field) field, a(field, a.t(parcel, i)));
                return;
            case 10:
                a(stringBuilder, (Field) field, a(field, a(a.s(parcel, i))));
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException("Unknown field out type = " + field.d());
        }
    }

    private void a(StringBuilder stringBuilder, Field<?, ?> field, Object obj) {
        if (field.c()) {
            a(stringBuilder, (Field) field, (ArrayList) obj);
        } else {
            a(stringBuilder, field.b(), obj);
        }
    }

    private void a(StringBuilder stringBuilder, Field<?, ?> field, ArrayList<?> arrayList) {
        stringBuilder.append("[");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                stringBuilder.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            a(stringBuilder, field.b(), arrayList.get(i));
        }
        stringBuilder.append("]");
    }

    private void a(StringBuilder stringBuilder, String str, Field<?, ?> field, Parcel parcel, int i) {
        stringBuilder.append("\"").append(str).append("\":");
        if (field.j()) {
            a(stringBuilder, field, parcel, i);
        } else {
            b(stringBuilder, field, parcel, i);
        }
    }

    private void a(StringBuilder stringBuilder, Map<String, Field<?, ?>> map, Parcel parcel) {
        SparseArray a = a((Map) map);
        stringBuilder.append('{');
        int b = a.b(parcel);
        Object obj = null;
        while (parcel.dataPosition() < b) {
            int a2 = a.a(parcel);
            Entry entry = (Entry) a.get(a.a(a2));
            if (entry != null) {
                if (obj != null) {
                    stringBuilder.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
                a(stringBuilder, (String) entry.getKey(), (Field) entry.getValue(), parcel, a2);
                obj = 1;
            }
        }
        if (parcel.dataPosition() != b) {
            throw new a.a("Overread allowed size end=" + b, parcel);
        }
        stringBuilder.append('}');
    }

    private void b(StringBuilder stringBuilder, Field<?, ?> field, Parcel parcel, int i) {
        if (field.e()) {
            stringBuilder.append("[");
            switch (field.d()) {
                case 0:
                    b.a(stringBuilder, a.w(parcel, i));
                    break;
                case 1:
                    b.a(stringBuilder, a.y(parcel, i));
                    break;
                case 2:
                    b.a(stringBuilder, a.x(parcel, i));
                    break;
                case 3:
                    b.a(stringBuilder, a.z(parcel, i));
                    break;
                case 4:
                    b.a(stringBuilder, a.A(parcel, i));
                    break;
                case 5:
                    b.a(stringBuilder, a.B(parcel, i));
                    break;
                case 6:
                    b.a(stringBuilder, a.v(parcel, i));
                    break;
                case 7:
                    b.a(stringBuilder, a.C(parcel, i));
                    break;
                case 8:
                case 9:
                case 10:
                    throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                case 11:
                    Parcel[] G = a.G(parcel, i);
                    int length = G.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        if (i2 > 0) {
                            stringBuilder.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                        }
                        G[i2].setDataPosition(0);
                        a(stringBuilder, field.l(), G[i2]);
                    }
                    break;
                default:
                    throw new IllegalStateException("Unknown field type out.");
            }
            stringBuilder.append("]");
            return;
        }
        switch (field.d()) {
            case 0:
                stringBuilder.append(a.g(parcel, i));
                return;
            case 1:
                stringBuilder.append(a.k(parcel, i));
                return;
            case 2:
                stringBuilder.append(a.i(parcel, i));
                return;
            case 3:
                stringBuilder.append(a.l(parcel, i));
                return;
            case 4:
                stringBuilder.append(a.n(parcel, i));
                return;
            case 5:
                stringBuilder.append(a.p(parcel, i));
                return;
            case 6:
                stringBuilder.append(a.c(parcel, i));
                return;
            case 7:
                stringBuilder.append("\"").append(p.a(a.q(parcel, i))).append("\"");
                return;
            case 8:
                stringBuilder.append("\"").append(c.a(a.t(parcel, i))).append("\"");
                return;
            case 9:
                stringBuilder.append("\"").append(c.b(a.t(parcel, i)));
                stringBuilder.append("\"");
                return;
            case 10:
                Bundle s = a.s(parcel, i);
                Set<String> keySet = s.keySet();
                keySet.size();
                stringBuilder.append("{");
                int i3 = 1;
                for (String str : keySet) {
                    if (i3 == 0) {
                        stringBuilder.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    }
                    stringBuilder.append("\"").append(str).append("\"");
                    stringBuilder.append(":");
                    stringBuilder.append("\"").append(p.a(s.getString(str))).append("\"");
                    i3 = 0;
                }
                stringBuilder.append("}");
                return;
            case 11:
                Parcel F = a.F(parcel, i);
                F.setDataPosition(0);
                a(stringBuilder, field.l(), F);
                return;
            default:
                throw new IllegalStateException("Unknown field type out");
        }
    }

    public int a() {
        return this.a;
    }

    public Object a(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public Parcel b() {
        switch (this.f) {
            case 0:
                this.g = com.google.android.gms.common.internal.safeparcel.b.a(this.b);
                com.google.android.gms.common.internal.safeparcel.b.a(this.b, this.g);
                this.f = 2;
                break;
            case 1:
                com.google.android.gms.common.internal.safeparcel.b.a(this.b, this.g);
                this.f = 2;
                break;
        }
        return this.b;
    }

    public boolean b(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public Map<String, Field<?, ?>> c() {
        return this.d == null ? null : this.d.a(this.e);
    }

    FieldMappingDictionary f() {
        switch (this.c) {
            case 0:
                return null;
            case 1:
                return this.d;
            case 2:
                return this.d;
            default:
                throw new IllegalStateException("Invalid creation type: " + this.c);
        }
    }

    public String toString() {
        d.a(this.d, "Cannot convert to JSON on client side.");
        Parcel b = b();
        b.setDataPosition(0);
        StringBuilder stringBuilder = new StringBuilder(100);
        a(stringBuilder, this.d.a(this.e), b);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        e eVar = CREATOR;
        e.a(this, parcel, i);
    }
}
