package com.fimi.soul.biz.manager;

import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import com.fimi.kernel.utils.x;
import com.fimi.soul.biz.m.k;
import com.fimi.soul.entity.AddPlane;
import com.fimi.soul.entity.PlaneMsg;
import java.util.HashMap;

public class a implements Callback {
    private static a a = null;
    private static final int e = 1;
    private Handler b = new Handler(this);
    private com.fimi.soul.biz.m.a c = new com.fimi.soul.biz.l.a();
    private HashMap<Integer, k> d;
    private Context f = null;

    class a implements Runnable {
        final /* synthetic */ a a;
        private int b;
        private AddPlane c;

        public a(a aVar, int i, AddPlane addPlane) {
            this.a = aVar;
            this.b = i;
            this.c = addPlane;
        }

        public void run() {
            Message obtainMessage = this.a.b.obtainMessage();
            Object obj = null;
            if (this.b == 1) {
                obj = this.a.c.a(this.c, this.a.f);
            }
            obtainMessage.what = this.b;
            obtainMessage.obj = obj;
            this.a.b.sendMessage(obtainMessage);
        }
    }

    public a(Context context) {
        this.f = context;
        this.d = new HashMap();
    }

    public static a a(Context context) {
        if (a == null) {
            a = new a(context);
        }
        return a;
    }

    public void a(AddPlane addPlane, k kVar) {
        this.d.put(Integer.valueOf(1), kVar);
        x.b(new a(this, 1, addPlane));
    }

    public boolean handleMessage(Message message) {
        if (message.obj != null) {
            ((k) this.d.get(Integer.valueOf(message.what))).a((PlaneMsg) message.obj, null);
        }
        return false;
    }
}
