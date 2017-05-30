package com.fimi.soul.biz.manager;

import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import com.fimi.kernel.utils.x;
import com.fimi.soul.biz.m.i;
import com.fimi.soul.biz.m.k;
import com.fimi.soul.entity.Plane;
import com.fimi.soul.entity.PlaneMsg;
import java.util.HashMap;

public class l implements Callback {
    private static l a = null;
    private static final int b = 0;
    private static final int c = 1;
    private static final int d = 2;
    private i e = new com.fimi.soul.biz.l.l();
    private Handler f = new Handler(this);
    private Context g = null;
    private HashMap<Integer, k> h;

    class a implements Runnable {
        final /* synthetic */ l a;
        private int b;
        private Plane c;

        public a(l lVar, int i, Plane plane) {
            this.a = lVar;
            this.b = i;
            this.c = plane;
        }

        public void run() {
            Message obtainMessage = this.a.f.obtainMessage();
            Object obj = null;
            if (this.b == 0) {
                obj = this.a.e.a(this.a.g);
            } else if (this.b == 1) {
                obj = this.a.e.a(this.c, this.a.g);
            } else if (this.b == 2) {
            }
            obtainMessage.what = this.b;
            obtainMessage.obj = obj;
            this.a.f.sendMessage(obtainMessage);
        }
    }

    public l(Context context) {
        this.g = context;
    }

    public static l a(Context context) {
        if (a == null) {
            a = new l(context);
        }
        return a;
    }

    public void a(k kVar) {
        this.h.put(Integer.valueOf(0), kVar);
        x.b(new a(this, 0, null));
    }

    public void a(Plane plane, k kVar) {
        this.h.put(Integer.valueOf(1), kVar);
        x.b(new a(this, 1, plane));
    }

    public boolean handleMessage(Message message) {
        if (message.obj != null) {
            ((k) this.h.get(Integer.valueOf(message.what))).a((PlaneMsg) message.obj, null);
        }
        return false;
    }
}
