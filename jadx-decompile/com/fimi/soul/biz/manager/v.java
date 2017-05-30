package com.fimi.soul.biz.manager;

import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import com.fimi.kernel.utils.x;
import com.fimi.soul.biz.l.r;
import com.fimi.soul.biz.m.k;
import com.fimi.soul.biz.m.n;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.UpdateDroneItem;
import java.util.HashMap;

public class v implements Callback {
    private static v a = null;
    private static final int b = 0;
    private static final int c = 1;
    private static final int d = 2;
    private static final int e = 3;
    private static final int f = 4;
    private static final int g = 5;
    private n h = new r();
    private Handler i = new Handler(this);
    private HashMap<Integer, k> j;
    private Context k = null;

    class a implements Runnable {
        final /* synthetic */ v a;
        private int b;
        private UpdateDroneItem c;
        private String d;
        private int e;
        private String f;

        public a(v vVar, int i, UpdateDroneItem updateDroneItem) {
            this.a = vVar;
            this.b = i;
            this.c = updateDroneItem;
        }

        public a(v vVar, int i, String str) {
            this.a = vVar;
            this.d = str;
            this.b = i;
        }

        public a(v vVar, int i, String str, int i2) {
            this.a = vVar;
            this.b = i;
            this.d = str;
            this.e = i2;
        }

        public a(v vVar, int i, String str, int i2, String str2) {
            this.a = vVar;
            this.b = i;
            this.d = str;
            this.e = i2;
            this.f = str2;
        }

        public void run() {
            Message obtainMessage = this.a.i.obtainMessage();
            Object obj = null;
            if (this.b == 0) {
                obj = this.a.h.a(this.c, this.a.k);
            } else if (this.b == 1) {
                obj = this.a.h.b(this.c, this.a.k);
            } else if (this.b == 2) {
                obj = this.a.h.c(this.d, this.a.k);
            } else if (this.b == 3) {
                obj = this.a.h.d(this.d, this.a.k);
            } else if (this.b == 4) {
                obj = this.a.h.e(this.d, this.a.k);
            } else if (this.b == 5) {
                obj = this.a.h.a(this.d, this.f, this.e, this.a.k);
            }
            obtainMessage.what = this.b;
            obtainMessage.obj = obj;
            this.a.i.sendMessage(obtainMessage);
        }
    }

    public v(Context context) {
        this.k = context;
        this.j = new HashMap();
    }

    public static v a(Context context) {
        if (a == null) {
            a = new v(context);
        }
        return a;
    }

    public void a(UpdateDroneItem updateDroneItem, k kVar) {
        this.j.put(Integer.valueOf(0), kVar);
        x.b(new a(this, 0, updateDroneItem));
    }

    public void a(String str, k kVar) {
        this.j.put(Integer.valueOf(2), kVar);
        x.b(new a(this, 2, str));
    }

    public void a(String str, String str2, int i, k kVar) {
        this.j.put(Integer.valueOf(5), kVar);
        x.b(new a(this, 5, str, i, str2));
    }

    public void b(UpdateDroneItem updateDroneItem, k kVar) {
        this.j.put(Integer.valueOf(1), kVar);
        x.b(new a(this, 1, updateDroneItem));
    }

    public void b(String str, k kVar) {
        this.j.put(Integer.valueOf(3), kVar);
        x.b(new a(this, 3, str));
    }

    public void c(String str, k kVar) {
        this.j.put(Integer.valueOf(4), kVar);
        x.b(new a(this, 4, str));
    }

    public boolean handleMessage(Message message) {
        if (message.obj != null) {
            ((k) this.j.get(Integer.valueOf(message.what))).a((PlaneMsg) message.obj, null);
        }
        return false;
    }
}
