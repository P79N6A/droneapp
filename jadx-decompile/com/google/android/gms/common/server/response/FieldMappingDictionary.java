package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FieldMappingDictionary extends AbstractSafeParcelable {
    public static final c CREATOR = new c();
    private final int a;
    private final HashMap<String, Map<String, Field<?, ?>>> b;
    private final ArrayList<Entry> c = null;
    private final String d;

    public static class Entry extends AbstractSafeParcelable {
        public static final d CREATOR = new d();
        final int a;
        final String b;
        final ArrayList<FieldMapPair> c;

        Entry(int i, String str, ArrayList<FieldMapPair> arrayList) {
            this.a = i;
            this.b = str;
            this.c = arrayList;
        }

        Entry(String str, Map<String, Field<?, ?>> map) {
            this.a = 1;
            this.b = str;
            this.c = a(map);
        }

        private static ArrayList<FieldMapPair> a(Map<String, Field<?, ?>> map) {
            if (map == null) {
                return null;
            }
            ArrayList<FieldMapPair> arrayList = new ArrayList();
            for (String str : map.keySet()) {
                arrayList.add(new FieldMapPair(str, (Field) map.get(str)));
            }
            return arrayList;
        }

        HashMap<String, Field<?, ?>> a() {
            HashMap<String, Field<?, ?>> hashMap = new HashMap();
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                FieldMapPair fieldMapPair = (FieldMapPair) this.c.get(i);
                hashMap.put(fieldMapPair.b, fieldMapPair.c);
            }
            return hashMap;
        }

        public void writeToParcel(Parcel parcel, int i) {
            d dVar = CREATOR;
            d.a(this, parcel, i);
        }
    }

    public static class FieldMapPair extends AbstractSafeParcelable {
        public static final b CREATOR = new b();
        final int a;
        final String b;
        final Field<?, ?> c;

        FieldMapPair(int i, String str, Field<?, ?> field) {
            this.a = i;
            this.b = str;
            this.c = field;
        }

        FieldMapPair(String str, Field<?, ?> field) {
            this.a = 1;
            this.b = str;
            this.c = field;
        }

        public void writeToParcel(Parcel parcel, int i) {
            b bVar = CREATOR;
            b.a(this, parcel, i);
        }
    }

    FieldMappingDictionary(int i, ArrayList<Entry> arrayList, String str) {
        this.a = i;
        this.b = a((ArrayList) arrayList);
        this.d = (String) d.a(str);
        a();
    }

    private static HashMap<String, Map<String, Field<?, ?>>> a(ArrayList<Entry> arrayList) {
        HashMap<String, Map<String, Field<?, ?>>> hashMap = new HashMap();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Entry entry = (Entry) arrayList.get(i);
            hashMap.put(entry.b, entry.a());
        }
        return hashMap;
    }

    public Map<String, Field<?, ?>> a(String str) {
        return (Map) this.b.get(str);
    }

    public void a() {
        for (String str : this.b.keySet()) {
            Map map = (Map) this.b.get(str);
            for (String str2 : map.keySet()) {
                ((Field) map.get(str2)).a(this);
            }
        }
    }

    int b() {
        return this.a;
    }

    ArrayList<Entry> c() {
        ArrayList<Entry> arrayList = new ArrayList();
        for (String str : this.b.keySet()) {
            arrayList.add(new Entry(str, (Map) this.b.get(str)));
        }
        return arrayList;
    }

    public String d() {
        return this.d;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : this.b.keySet()) {
            stringBuilder.append(str).append(":\n");
            Map map = (Map) this.b.get(str);
            for (String str2 : map.keySet()) {
                stringBuilder.append("  ").append(str2).append(": ");
                stringBuilder.append(map.get(str2));
            }
        }
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        c cVar = CREATOR;
        c.a(this, parcel, i);
    }
}
