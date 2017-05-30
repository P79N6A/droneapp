package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public final class StringToIntConverter extends AbstractSafeParcelable implements a<String, Integer> {
    public static final b CREATOR = new b();
    private final int a;
    private final HashMap<String, Integer> b;
    private final SparseArray<String> c;
    private final ArrayList<Entry> d;

    public static final class Entry extends AbstractSafeParcelable {
        public static final c CREATOR = new c();
        final int a;
        final String b;
        final int c;

        Entry(int i, String str, int i2) {
            this.a = i;
            this.b = str;
            this.c = i2;
        }

        Entry(String str, int i) {
            this.a = 1;
            this.b = str;
            this.c = i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            c cVar = CREATOR;
            c.a(this, parcel, i);
        }
    }

    public StringToIntConverter() {
        this.a = 1;
        this.b = new HashMap();
        this.c = new SparseArray();
        this.d = null;
    }

    StringToIntConverter(int i, ArrayList<Entry> arrayList) {
        this.a = i;
        this.b = new HashMap();
        this.c = new SparseArray();
        this.d = null;
        a((ArrayList) arrayList);
    }

    private void a(ArrayList<Entry> arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            a(entry.b, entry.c);
        }
    }

    int a() {
        return this.a;
    }

    public StringToIntConverter a(String str, int i) {
        this.b.put(str, Integer.valueOf(i));
        this.c.put(i, str);
        return this;
    }

    public /* synthetic */ Object a(Object obj) {
        return a((Integer) obj);
    }

    public String a(Integer num) {
        String str = (String) this.c.get(num.intValue());
        return (str == null && this.b.containsKey("gms_unknown")) ? "gms_unknown" : str;
    }

    ArrayList<Entry> b() {
        ArrayList<Entry> arrayList = new ArrayList();
        for (String str : this.b.keySet()) {
            arrayList.add(new Entry(str, ((Integer) this.b.get(str)).intValue()));
        }
        return arrayList;
    }

    public int c() {
        return 7;
    }

    public int d() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        b bVar = CREATOR;
        b.a(this, parcel, i);
    }
}
