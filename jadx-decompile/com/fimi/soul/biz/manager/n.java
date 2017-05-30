package com.fimi.soul.biz.manager;

import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import com.fimi.kernel.utils.x;
import com.fimi.soul.biz.m.k;
import com.fimi.soul.entity.PlaneMsg;
import java.util.HashMap;

public class n implements Callback {
    private static n a = null;
    private static final int b = 0;
    private static final int c = 1;
    private static final int d = 2;
    private static final int e = 3;
    private HashMap<Integer, k> f = new HashMap();
    private com.fimi.soul.biz.l.n g;
    private Handler h = new Handler(this);

    class a implements Runnable {
        String a;
        String b;
        final /* synthetic */ n c;
        private int d;

        public a(n nVar, int i, String str, String str2) {
            this.c = nVar;
            this.d = i;
            this.b = str2;
            this.a = str;
        }

        public void run() {
            Message obtainMessage = this.c.h.obtainMessage();
            Object obj = null;
            if (this.d == 0) {
                obj = this.c.g.c();
                if (obj.isSuccess()) {
                    obj = this.c.g.b();
                }
            } else if (this.d == 1) {
                obj = this.c.g.a(this.a, this.b);
            } else if (this.d == 2) {
                obj = this.c.g.c();
            } else if (this.d == 3) {
                obj = this.c.g.d();
            }
            obtainMessage.what = this.d;
            obtainMessage.obj = obj;
            this.c.h.sendMessage(obtainMessage);
        }
    }

    public n(Context context) {
        this.g = new com.fimi.soul.biz.l.n(context);
    }

    public static n a(Context context) {
        if (a == null) {
            a = new n(context);
        }
        return a;
    }

    public String a() {
        return this.g.a();
    }

    public void a(k kVar) {
        this.f.put(Integer.valueOf(0), kVar);
        x.b(new a(this, 0, null, null));
    }

    public void a(String str) {
        this.g.a(str);
    }

    public void a(String str, String str2, k kVar) {
        this.f.put(Integer.valueOf(1), kVar);
        x.b(new a(this, 1, str, str2));
    }

    public void b(k kVar) {
        this.f.put(Integer.valueOf(2), kVar);
        x.b(new a(this, 2, null, null));
    }

    public void c(k kVar) {
        this.f.put(Integer.valueOf(3), kVar);
        x.b(new a(this, 3, null, null));
    }

    public boolean handleMessage(Message message) {
        if (message.obj != null) {
            ((k) this.f.get(Integer.valueOf(message.what))).a((PlaneMsg) message.obj, null);
        }
        return true;
    }
}
