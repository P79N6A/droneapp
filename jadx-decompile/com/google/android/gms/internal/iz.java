package com.google.android.gms.internal;

import com.google.firebase.database.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class iz {
    private final List<String> a = new ArrayList();
    private int b = 0;

    private iz(ij ijVar) {
        int i = 0;
        Iterator it = ijVar.iterator();
        while (it.hasNext()) {
            this.a.add(((kv) it.next()).e());
        }
        this.b = Math.max(1, this.a.size());
        while (i < this.a.size()) {
            this.b = a((CharSequence) this.a.get(i)) + this.b;
            i++;
        }
        b();
    }

    private static int a(CharSequence charSequence) {
        int i = 0;
        int length = charSequence.length();
        int i2 = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt <= '') {
                i2++;
            } else if (charAt <= '߿') {
                i2 += 2;
            } else if (Character.isHighSurrogate(charAt)) {
                i2 += 4;
                i++;
            } else {
                i2 += 3;
            }
            i++;
        }
        return i2;
    }

    private String a() {
        CharSequence charSequence = (String) this.a.remove(this.a.size() - 1);
        this.b -= a(charSequence);
        if (this.a.size() > 0) {
            this.b--;
        }
        return charSequence;
    }

    private static String a(String str, List<String> list) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i > 0) {
                stringBuilder.append(str);
            }
            stringBuilder.append((String) list.get(i));
        }
        return stringBuilder.toString();
    }

    public static void a(ij ijVar, Object obj) {
        new iz(ijVar).a(obj);
    }

    private void a(Object obj) {
        if (obj instanceof Map) {
            Map map = (Map) obj;
            for (String str : map.keySet()) {
                if (!str.startsWith(".")) {
                    a(str);
                    a(map.get(str));
                    a();
                }
            }
        } else if (obj instanceof List) {
            List list = (List) obj;
            for (int i = 0; i < list.size(); i++) {
                a(Integer.toString(i));
                a(list.get(i));
                a();
            }
        }
    }

    private void a(String str) {
        if (this.a.size() > 0) {
            this.b++;
        }
        this.a.add(str);
        this.b += a((CharSequence) str);
        b();
    }

    private void b() {
        if (this.b > 768) {
            String valueOf = String.valueOf("Data has a key path longer than 768 bytes (");
            throw new d(new StringBuilder(String.valueOf(valueOf).length() + 13).append(valueOf).append(this.b).append(").").toString());
        } else if (this.a.size() > 32) {
            String valueOf2 = String.valueOf("Path specified exceeds the maximum depth that can be written (32) or object contains a cycle ");
            String valueOf3 = String.valueOf(c());
            throw new d(valueOf3.length() != 0 ? valueOf2.concat(valueOf3) : new String(valueOf2));
        }
    }

    private String c() {
        if (this.a.size() == 0) {
            return "";
        }
        String valueOf = String.valueOf(a("/", this.a));
        return new StringBuilder(String.valueOf(valueOf).length() + 10).append("in path '").append(valueOf).append("'").toString();
    }
}
