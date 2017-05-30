package com.fimi.soul.biz.manager;

import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import com.fimi.kernel.utils.x;
import com.fimi.soul.biz.l.i;
import com.fimi.soul.biz.m.f;
import com.fimi.soul.biz.m.k;
import com.fimi.soul.entity.PlaneMsg;
import java.util.HashMap;

public class h implements Callback {
    private static final int a = 0;
    private static h f;
    private Context b;
    private Handler c = new Handler(this);
    private HashMap<Integer, k> d = new HashMap();
    private f e;

    class a implements Runnable {
        int a;
        final /* synthetic */ h b;

        public a(h hVar, int i) {
            this.b = hVar;
            this.a = i;
        }

        public void run() {
            Message obtainMessage = this.b.c.obtainMessage();
            Object obj = null;
            if (this.a == 0) {
                obj = this.b.e.a(this.b.b);
            }
            obtainMessage.what = this.a;
            obtainMessage.obj = obj;
            this.b.c.sendMessage(obtainMessage);
        }
    }

    private h(Context context) {
        this.b = context;
        this.b = context;
        this.e = new i();
    }

    public static h a(Context context) {
        if (f == null) {
            f = new h(context.getApplicationContext());
        }
        return f;
    }

    public void a(k kVar) {
        this.d.put(Integer.valueOf(0), kVar);
        x.b(new a(this, 0));
    }

    public boolean handleMessage(Message message) {
        if (message.obj != null) {
            ((k) this.d.get(Integer.valueOf(message.what))).a((PlaneMsg) message.obj, null);
        }
        return false;
    }
}
