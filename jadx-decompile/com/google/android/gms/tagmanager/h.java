package com.google.android.gms.tagmanager;

import android.content.Context;

public class h implements aa {
    private static h a;
    private static final Object b = new Object();
    private bu c;
    private ab d;

    private h(Context context) {
        this(ac.a(context), new ck());
    }

    h(ab abVar, bu buVar) {
        this.d = abVar;
        this.c = buVar;
    }

    public static aa a(Context context) {
        aa aaVar;
        synchronized (b) {
            if (a == null) {
                a = new h(context);
            }
            aaVar = a;
        }
        return aaVar;
    }

    public boolean a(String str) {
        if (this.c.a()) {
            this.d.a(str);
            return true;
        }
        aw.b("Too many urls sent too quickly with the TagManagerSender, rate limiting invoked.");
        return false;
    }
}
