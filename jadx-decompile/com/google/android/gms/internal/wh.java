package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.u;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@aaa
public class wh implements Iterable<wg> {
    private final List<wg> a = new LinkedList();

    private wg c(acy com_google_android_gms_internal_acy) {
        Iterator it = u.B().iterator();
        while (it.hasNext()) {
            wg wgVar = (wg) it.next();
            if (wgVar.a == com_google_android_gms_internal_acy) {
                return wgVar;
            }
        }
        return null;
    }

    public int a() {
        return this.a.size();
    }

    public void a(wg wgVar) {
        this.a.add(wgVar);
    }

    public boolean a(acy com_google_android_gms_internal_acy) {
        wg c = c(com_google_android_gms_internal_acy);
        if (c == null) {
            return false;
        }
        c.b.a();
        return true;
    }

    public void b(wg wgVar) {
        this.a.remove(wgVar);
    }

    public boolean b(acy com_google_android_gms_internal_acy) {
        return c(com_google_android_gms_internal_acy) != null;
    }

    public Iterator<wg> iterator() {
        return this.a.iterator();
    }
}
