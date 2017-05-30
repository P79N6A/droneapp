package com.fimi.soul.biz.manager;

import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import com.fimi.kernel.utils.x;
import com.fimi.soul.biz.l.c;
import com.fimi.soul.biz.m.d;
import com.fimi.soul.biz.m.k;
import com.fimi.soul.entity.PlaneMsg;
import java.util.HashMap;

public class e implements Callback {
    private static e a = null;
    private static final int b = 0;
    private static final int c = 1;
    private static final int d = 2;
    private static final int e = 3;
    private d f = new c();
    private Handler g = new Handler(this);
    private HashMap<Integer, k> h;
    private Context i = null;

    class a implements Runnable {
        final /* synthetic */ e a;
        private int b;

        public a(e eVar, int i) {
            this.a = eVar;
            this.b = i;
        }

        public void run() {
            Message obtainMessage = this.a.g.obtainMessage();
            Object obj = null;
            if (this.b == 0) {
                obj = this.a.f.b(this.a.i);
            } else if (this.b == 1) {
                obj = this.a.f.c(this.a.i);
            } else if (this.b == 2) {
                obj = this.a.f.d(this.a.i);
            } else if (this.b == 3) {
                obj = this.a.f.e(this.a.i);
            }
            obtainMessage.what = this.b;
            obtainMessage.obj = obj;
            this.a.g.sendMessage(obtainMessage);
        }
    }

    public e(Context context) {
        this.i = context;
        this.h = new HashMap();
    }

    public static e a(Context context) {
        if (a == null) {
            a = new e(context);
        }
        return a;
    }

    public void a(k kVar) {
        this.h.put(Integer.valueOf(0), kVar);
        x.b(new a(this, 0));
    }

    public void b(k kVar) {
        this.h.put(Integer.valueOf(1), kVar);
        x.b(new a(this, 1));
    }

    public void c(k kVar) {
        this.h.put(Integer.valueOf(2), kVar);
        x.b(new a(this, 2));
    }

    public void d(k kVar) {
        this.h.put(Integer.valueOf(3), kVar);
        x.b(new a(this, 3));
    }

    public boolean handleMessage(Message message) {
        if (message.obj != null) {
            ((k) this.h.get(Integer.valueOf(message.what))).a((PlaneMsg) message.obj, null);
        }
        return false;
    }
}
