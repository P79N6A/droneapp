package com.google.android.gms.internal;

import com.google.android.gms.internal.kc.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class kk {
    static final /* synthetic */ boolean a = (!kk.class.desiredAssertionStatus());
    private final Map<kv, ka> b = new HashMap();

    public List<ka> a() {
        return new ArrayList(this.b.values());
    }

    public void a(ka kaVar) {
        a b = kaVar.b();
        kv a = kaVar.a();
        if (!a && b != a.CHILD_ADDED && b != a.CHILD_CHANGED && b != a.CHILD_REMOVED) {
            throw new AssertionError("Only child changes supported for tracking");
        } else if (!a && kaVar.a().f()) {
            throw new AssertionError();
        } else if (this.b.containsKey(a)) {
            ka kaVar2 = (ka) this.b.get(a);
            a b2 = kaVar2.b();
            if (b == a.CHILD_ADDED && b2 == a.CHILD_REMOVED) {
                this.b.put(kaVar.a(), ka.a(a, kaVar.c(), kaVar2.c()));
            } else if (b == a.CHILD_REMOVED && b2 == a.CHILD_ADDED) {
                this.b.remove(a);
            } else if (b == a.CHILD_REMOVED && b2 == a.CHILD_CHANGED) {
                this.b.put(a, ka.b(a, kaVar2.e()));
            } else if (b == a.CHILD_CHANGED && b2 == a.CHILD_ADDED) {
                this.b.put(a, ka.a(a, kaVar.c()));
            } else if (b == a.CHILD_CHANGED && b2 == a.CHILD_CHANGED) {
                this.b.put(a, ka.a(a, kaVar.c(), kaVar2.e()));
            } else {
                String valueOf = String.valueOf(kaVar);
                String valueOf2 = String.valueOf(kaVar2);
                throw new IllegalStateException(new StringBuilder((String.valueOf(valueOf).length() + 48) + String.valueOf(valueOf2).length()).append("Illegal combination of changes: ").append(valueOf).append(" occurred after ").append(valueOf2).toString());
            }
        } else {
            this.b.put(kaVar.a(), kaVar);
        }
    }
}
