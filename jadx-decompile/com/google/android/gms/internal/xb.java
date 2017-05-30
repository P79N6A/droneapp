package com.google.android.gms.internal;

import java.util.AbstractMap.SimpleEntry;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

@aaa
public class xb implements xa {
    private final wy a;
    private final HashSet<SimpleEntry<String, vt>> b = new HashSet();

    public xb(wy wyVar) {
        this.a = wyVar;
    }

    public void a() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            SimpleEntry simpleEntry = (SimpleEntry) it.next();
            String str = "Unregistering eventhandler: ";
            String valueOf = String.valueOf(((vt) simpleEntry.getValue()).toString());
            abr.e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            this.a.b((String) simpleEntry.getKey(), (vt) simpleEntry.getValue());
        }
        this.b.clear();
    }

    public void a(String str, vt vtVar) {
        this.a.a(str, vtVar);
        this.b.add(new SimpleEntry(str, vtVar));
    }

    public void a(String str, String str2) {
        this.a.a(str, str2);
    }

    public void a(String str, JSONObject jSONObject) {
        this.a.a(str, jSONObject);
    }

    public void b(String str, vt vtVar) {
        this.a.b(str, vtVar);
        this.b.remove(new SimpleEntry(str, vtVar));
    }

    public void b(String str, JSONObject jSONObject) {
        this.a.b(str, jSONObject);
    }
}
