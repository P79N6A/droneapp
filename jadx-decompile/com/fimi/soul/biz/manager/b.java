package com.fimi.soul.biz.manager;

import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import com.fimi.kernel.utils.x;
import com.fimi.soul.biz.m.c;
import com.fimi.soul.biz.m.k;
import com.fimi.soul.entity.BroadcastMode;
import com.fimi.soul.entity.PlaneMsg;
import java.util.HashMap;

public class b implements Callback {
    private static b a = null;
    private static final int b = 0;
    private static final int c = 3;
    private static final int d = 5;
    private static final int e = 6;
    private static final int f = 7;
    private static final int g = 9;
    private static final int h = 10;
    private static final int i = 8;
    private static final int j = 1;
    private static final int k = 4;
    private static final int l = 2;
    private c m = new com.fimi.soul.biz.l.b();
    private Handler n = new Handler(this);
    private Context o = null;
    private HashMap<Integer, k> p;

    class a implements Runnable {
        final /* synthetic */ b a;
        private int b;
        private BroadcastMode c;
        private String d;
        private int e;

        public a(b bVar, int i, String str, int i2, BroadcastMode broadcastMode) {
            this.a = bVar;
            this.b = i;
            this.c = broadcastMode;
            this.d = str;
            this.e = i2;
        }

        public void run() {
            Message obtainMessage = this.a.n.obtainMessage();
            Object obj = null;
            if (this.b == 0) {
                obj = this.a.m.a(this.a.o);
            } else if (this.b == 1) {
                obj = this.a.m.a(this.c, this.a.o);
            } else if (this.b == 3) {
                obj = this.a.m.a(this.a.o, this.d, this.e);
            } else if (this.b == 6) {
                obj = this.a.m.a(this.a.o, this.e);
            } else if (this.b == 5) {
                obj = this.a.m.b(this.a.o, this.e);
            } else if (this.b == 7) {
                obj = this.a.m.c(this.a.o, this.d, this.e);
            } else if (this.b == 8) {
                obj = this.a.m.b(this.c, this.a.o);
            } else if (this.b == 9) {
                obj = this.a.m.c(this.c, this.a.o);
            } else if (this.b == 10) {
                obj = this.a.m.c(this.c.getBroadcastID(), this.a.o);
            }
            obtainMessage.what = this.b;
            obtainMessage.obj = obj;
            this.a.n.sendMessage(obtainMessage);
        }
    }

    public enum b {
        BYUSERID,
        RECENT,
        HOT,
        FOLLOW
    }

    public b(Context context) {
        this.o = context;
        this.p = new HashMap();
    }

    public static b a(Context context) {
        if (a == null) {
            a = new b(context);
        }
        return a;
    }

    public void a(k kVar) {
        this.p.put(Integer.valueOf(0), kVar);
        x.b(new a(this, 0, null, 1, null));
    }

    public void a(BroadcastMode broadcastMode, k kVar) {
        this.p.put(Integer.valueOf(1), kVar);
        x.b(new a(this, 1, null, 1, broadcastMode));
    }

    public void a(String str, int i, b bVar, k kVar) {
        if (bVar == b.BYUSERID) {
            this.p.put(Integer.valueOf(3), kVar);
            x.b(new a(this, 3, str, i, null));
        } else if (bVar == b.FOLLOW) {
            this.p.put(Integer.valueOf(7), kVar);
            x.b(new a(this, 7, str, i, null));
        } else if (bVar == b.HOT) {
            this.p.put(Integer.valueOf(5), kVar);
            x.b(new a(this, 5, str, i, null));
        } else if (bVar == b.RECENT) {
            this.p.put(Integer.valueOf(6), kVar);
            x.b(new a(this, 6, str, i, null));
        }
    }

    public void a(String str, k kVar) {
        BroadcastMode broadcastMode = new BroadcastMode();
        broadcastMode.setBroadcastID(str);
        this.p.put(Integer.valueOf(10), kVar);
        x.b(new a(this, 10, null, 1, broadcastMode));
    }

    public void b(BroadcastMode broadcastMode, k kVar) {
        this.p.put(Integer.valueOf(8), kVar);
        x.b(new a(this, 8, null, 1, broadcastMode));
    }

    public void c(BroadcastMode broadcastMode, k kVar) {
        this.p.put(Integer.valueOf(9), kVar);
        x.b(new a(this, 9, null, 1, broadcastMode));
    }

    public boolean handleMessage(Message message) {
        if (message.obj != null) {
            ((k) this.p.get(Integer.valueOf(message.what))).a((PlaneMsg) message.obj, null);
        }
        return false;
    }
}
