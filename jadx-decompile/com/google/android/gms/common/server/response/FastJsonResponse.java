package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.converter.ConverterWrapper;
import com.google.android.gms.common.util.p;
import com.google.android.gms.common.util.q;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class FastJsonResponse {

    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final a CREATOR = new a();
        protected final int a;
        protected final boolean b;
        protected final int c;
        protected final boolean d;
        protected final String e;
        protected final int f;
        protected final Class<? extends FastJsonResponse> g;
        protected final String h;
        private final int i;
        private FieldMappingDictionary j;
        private a<I, O> k;

        Field(int i, int i2, boolean z, int i3, boolean z2, String str, int i4, String str2, ConverterWrapper converterWrapper) {
            this.i = i;
            this.a = i2;
            this.b = z;
            this.c = i3;
            this.d = z2;
            this.e = str;
            this.f = i4;
            if (str2 == null) {
                this.g = null;
                this.h = null;
            } else {
                this.g = SafeParcelResponse.class;
                this.h = str2;
            }
            if (converterWrapper == null) {
                this.k = null;
            } else {
                this.k = converterWrapper.c();
            }
        }

        protected Field(int i, boolean z, int i2, boolean z2, String str, int i3, Class<? extends FastJsonResponse> cls, a<I, O> aVar) {
            this.i = 1;
            this.a = i;
            this.b = z;
            this.c = i2;
            this.d = z2;
            this.e = str;
            this.f = i3;
            this.g = cls;
            if (cls == null) {
                this.h = null;
            } else {
                this.h = cls.getCanonicalName();
            }
            this.k = aVar;
        }

        public static Field<Integer, Integer> a(String str, int i) {
            return new Field(0, false, 0, false, str, i, null, null);
        }

        public static Field a(String str, int i, a<?, ?> aVar, boolean z) {
            return new Field(aVar.c(), z, aVar.d(), false, str, i, null, aVar);
        }

        public static <T extends FastJsonResponse> Field<T, T> a(String str, int i, Class<T> cls) {
            return new Field(11, false, 11, false, str, i, cls, null);
        }

        public static Field<Boolean, Boolean> b(String str, int i) {
            return new Field(6, false, 6, false, str, i, null, null);
        }

        public static <T extends FastJsonResponse> Field<ArrayList<T>, ArrayList<T>> b(String str, int i, Class<T> cls) {
            return new Field(11, true, 11, true, str, i, cls, null);
        }

        public static Field<String, String> c(String str, int i) {
            return new Field(7, false, 7, false, str, i, null, null);
        }

        public int a() {
            return this.i;
        }

        public I a(O o) {
            return this.k.a(o);
        }

        public void a(FieldMappingDictionary fieldMappingDictionary) {
            this.j = fieldMappingDictionary;
        }

        public int b() {
            return this.a;
        }

        public boolean c() {
            return this.b;
        }

        public int d() {
            return this.c;
        }

        public boolean e() {
            return this.d;
        }

        public String f() {
            return this.e;
        }

        public int g() {
            return this.f;
        }

        public Class<? extends FastJsonResponse> h() {
            return this.g;
        }

        String i() {
            return this.h == null ? null : this.h;
        }

        public boolean j() {
            return this.k != null;
        }

        ConverterWrapper k() {
            return this.k == null ? null : ConverterWrapper.a(this.k);
        }

        public Map<String, Field<?, ?>> l() {
            d.a(this.h);
            d.a(this.j);
            return this.j.a(this.h);
        }

        public String toString() {
            com.google.android.gms.common.internal.c.a a = c.a(this).a("versionCode", Integer.valueOf(this.i)).a("typeIn", Integer.valueOf(this.a)).a("typeInArray", Boolean.valueOf(this.b)).a("typeOut", Integer.valueOf(this.c)).a("typeOutArray", Boolean.valueOf(this.d)).a("outputFieldName", this.e).a("safeParcelFieldId", Integer.valueOf(this.f)).a("concreteTypeName", i());
            Class h = h();
            if (h != null) {
                a.a("concreteType.class", h.getCanonicalName());
            }
            if (this.k != null) {
                a.a("converterName", this.k.getClass().getCanonicalName());
            }
            return a.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            a aVar = CREATOR;
            a.a(this, parcel, i);
        }
    }

    public interface a<I, O> {
        I a(O o);

        int c();

        int d();
    }

    private void a(StringBuilder stringBuilder, Field field, Object obj) {
        if (field.b() == 11) {
            stringBuilder.append(((FastJsonResponse) field.h().cast(obj)).toString());
        } else if (field.b() == 7) {
            stringBuilder.append("\"");
            stringBuilder.append(p.a((String) obj));
            stringBuilder.append("\"");
        } else {
            stringBuilder.append(obj);
        }
    }

    private void a(StringBuilder stringBuilder, Field field, ArrayList<Object> arrayList) {
        stringBuilder.append("[");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                stringBuilder.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            Object obj = arrayList.get(i);
            if (obj != null) {
                a(stringBuilder, field, obj);
            }
        }
        stringBuilder.append("]");
    }

    protected <O, I> I a(Field<I, O> field, Object obj) {
        return field.k != null ? field.a(obj) : obj;
    }

    protected abstract Object a(String str);

    protected boolean a(Field field) {
        return field.d() == 11 ? field.e() ? d(field.f()) : c(field.f()) : b(field.f());
    }

    protected Object b(Field field) {
        String f = field.f();
        if (field.h() == null) {
            return a(field.f());
        }
        d.a(a(field.f()) == null, "Concrete field shouldn't be value object: %s", new Object[]{field.f()});
        Map e = field.e() ? e() : d();
        if (e != null) {
            return e.get(f);
        }
        try {
            char toUpperCase = Character.toUpperCase(f.charAt(0));
            String valueOf = String.valueOf(f.substring(1));
            return getClass().getMethod(new StringBuilder(String.valueOf(valueOf).length() + 4).append("get").append(toUpperCase).append(valueOf).toString(), new Class[0]).invoke(this, new Object[0]);
        } catch (Throwable e2) {
            throw new RuntimeException(e2);
        }
    }

    protected abstract boolean b(String str);

    public abstract Map<String, Field<?, ?>> c();

    protected boolean c(String str) {
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    public HashMap<String, Object> d() {
        return null;
    }

    protected boolean d(String str) {
        throw new UnsupportedOperationException("Concrete type arrays not supported");
    }

    public HashMap<String, Object> e() {
        return null;
    }

    public String toString() {
        Map c = c();
        StringBuilder stringBuilder = new StringBuilder(100);
        for (String str : c.keySet()) {
            Field field = (Field) c.get(str);
            if (a(field)) {
                Object a = a(field, b(field));
                if (stringBuilder.length() == 0) {
                    stringBuilder.append("{");
                } else {
                    stringBuilder.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
                stringBuilder.append("\"").append(str).append("\":");
                if (a != null) {
                    switch (field.d()) {
                        case 8:
                            stringBuilder.append("\"").append(com.google.android.gms.common.util.c.a((byte[]) a)).append("\"");
                            break;
                        case 9:
                            stringBuilder.append("\"").append(com.google.android.gms.common.util.c.b((byte[]) a)).append("\"");
                            break;
                        case 10:
                            q.a(stringBuilder, (HashMap) a);
                            break;
                        default:
                            if (!field.c()) {
                                a(stringBuilder, field, a);
                                break;
                            }
                            a(stringBuilder, field, (ArrayList) a);
                            break;
                    }
                }
                stringBuilder.append("null");
            }
        }
        if (stringBuilder.length() > 0) {
            stringBuilder.append("}");
        } else {
            stringBuilder.append("{}");
        }
        return stringBuilder.toString();
    }
}
