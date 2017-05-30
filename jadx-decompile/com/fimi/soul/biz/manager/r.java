package com.fimi.soul.biz.manager;

import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import com.fimi.kernel.utils.x;
import com.fimi.soul.biz.l.p;
import com.fimi.soul.biz.m.k;
import com.fimi.soul.biz.m.m;
import com.fimi.soul.entity.PlaneMsg;
import java.util.HashMap;

public class r implements Callback {
    private static final int e = 0;
    private static final int f = 1;
    private static r g = null;
    private Handler a = new Handler(this.c.getMainLooper(), this);
    private HashMap<Integer, k> b = new HashMap();
    private Context c;
    private m d = new p();

    class a implements Runnable {
        int a;
        String b;
        final /* synthetic */ r c;

        public a(r rVar, int i, String str) {
            this.c = rVar;
            this.a = i;
            this.b = str;
        }

        public void run() {
            Message obtainMessage = this.c.a.obtainMessage();
            Object obj = null;
            if (this.a == 0) {
                obj = this.c.d.c(this.b, this.c.c);
            } else if (this.a == 1) {
                obj = this.c.d.d(this.b, this.c.c);
            }
            obtainMessage.what = this.a;
            obtainMessage.obj = obj;
            this.c.a.sendMessage(obtainMessage);
        }
    }

    private r(Context context) {
        this.c = context;
    }

    public static r a(Context context) {
        if (g == null) {
            g = new r(context.getApplicationContext());
        }
        return g;
    }

    public void a(String str, k kVar) {
        this.b.put(Integer.valueOf(0), kVar);
        x.b(new a(this, 0, str));
    }

    public void b(String str, k kVar) {
        this.b.put(Integer.valueOf(1), kVar);
        x.b(new a(this, 1, str));
    }

    public boolean handleMessage(Message message) {
        if (message.obj != null) {
            ((k) this.b.get(Integer.valueOf(message.what))).a((PlaneMsg) message.obj, null);
        }
        return false;
    }
}
