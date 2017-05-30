package com.fimi.soul.biz.manager;

import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import com.fimi.kernel.utils.x;
import com.fimi.soul.biz.m.k;
import com.fimi.soul.biz.m.q;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.UpgradeResultInfo;
import java.util.HashMap;

public class w implements Callback {
    private static w a = null;
    private static final int b = 0;
    private static final int c = 1;
    private static final int d = 2;
    private static final int e = 3;
    private q f = new com.fimi.soul.biz.l.q();
    private Handler g;
    private HashMap<Integer, k> h;
    private Context i = null;

    class a implements Runnable {
        final /* synthetic */ w a;
        private int b;
        private String c;
        private UpgradeResultInfo d;

        public a(w wVar, int i) {
            this.a = wVar;
            this.b = i;
        }

        public a(w wVar, int i, UpgradeResultInfo upgradeResultInfo) {
            this.a = wVar;
            this.b = i;
            this.d = upgradeResultInfo;
        }

        public a(w wVar, int i, String str) {
            this.a = wVar;
            this.b = i;
            this.c = str;
        }

        public void run() {
            Message obtainMessage = this.a.g.obtainMessage();
            Object obj = null;
            if (this.b == 0) {
                obj = this.a.f.a(this.a.i);
            } else if (this.b == 1) {
                obj = this.a.f.a(this.a.i, this.c);
            } else if (this.b == 2) {
                obj = this.a.f.b(this.a.i);
            } else if (this.b == 3) {
                obj = this.a.f.a(this.a.i, this.d);
            }
            obtainMessage.what = this.b;
            obtainMessage.obj = obj;
            this.a.g.sendMessage(obtainMessage);
        }
    }

    public w(Context context) {
        this.g = new Handler(context.getMainLooper(), this);
        this.i = context;
        this.h = new HashMap();
    }

    public static w a(Context context) {
        if (a == null) {
            a = new w(context);
        }
        return a;
    }

    public void a(k kVar) {
        this.h.put(Integer.valueOf(0), kVar);
        x.b(new a(this, 0));
    }

    public void a(k kVar, UpgradeResultInfo upgradeResultInfo) {
        this.h.put(Integer.valueOf(3), kVar);
        x.b(new a(this, 3, upgradeResultInfo));
    }

    public void a(k kVar, String str) {
        this.h.put(Integer.valueOf(1), kVar);
        x.b(new a(this, 1, str));
    }

    public void b(k kVar) {
        this.h.put(Integer.valueOf(2), kVar);
        x.b(new a(this, 2));
    }

    public boolean handleMessage(Message message) {
        if (message.obj != null) {
            ((k) this.h.get(Integer.valueOf(message.what))).a((PlaneMsg) message.obj, null);
        }
        return false;
    }
}
