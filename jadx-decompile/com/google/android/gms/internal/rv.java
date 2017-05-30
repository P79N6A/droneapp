package com.google.android.gms.internal;

import java.util.HashMap;

public class rv extends ik<Integer, Long> {
    public Long a;
    public Long b;

    public rv(String str) {
        a(str);
    }

    protected HashMap<Integer, Long> a() {
        HashMap<Integer, Long> hashMap = new HashMap();
        hashMap.put(Integer.valueOf(0), this.a);
        hashMap.put(Integer.valueOf(1), this.b);
        return hashMap;
    }

    protected void a(String str) {
        HashMap b = ik.b(str);
        if (b != null) {
            this.a = (Long) b.get(Integer.valueOf(0));
            this.b = (Long) b.get(Integer.valueOf(1));
        }
    }
}
