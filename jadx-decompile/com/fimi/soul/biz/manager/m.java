package com.fimi.soul.biz.manager;

import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import com.fimi.kernel.utils.x;
import com.fimi.soul.biz.m.j;
import com.fimi.soul.biz.m.k;
import com.fimi.soul.entity.MessagePush;
import com.fimi.soul.entity.PlaneMsg;
import java.util.HashMap;

public class m implements Callback {
    private static m d = null;
    private static final int f = 0;
    private Handler a;
    private HashMap<Integer, k> b = new HashMap();
    private Context c;
    private j e;

    class a implements Runnable {
        int a;
        MessagePush b;
        final /* synthetic */ m c;

        public a(m mVar, int i) {
            this.c = mVar;
            this.a = i;
        }

        public a(m mVar, int i, MessagePush messagePush) {
            this.c = mVar;
            this.a = i;
            this.b = messagePush;
        }

        public void run() {
            Message obtainMessage = this.c.a.obtainMessage();
            Object obj = null;
            if (this.a == 0) {
                obj = this.c.e.a(this.b, this.c.c);
            }
            obtainMessage.what = this.a;
            obtainMessage.obj = obj;
            this.c.a.sendMessage(obtainMessage);
        }
    }

    private m(Context context) {
        this.c = context;
        this.c = context;
        this.e = new com.fimi.soul.biz.l.m();
        this.a = new Handler(this);
    }

    public static m a(Context context) {
        if (d == null) {
            d = new m(context.getApplicationContext());
        }
        return d;
    }

    public void a(MessagePush messagePush, k kVar) {
        this.b.put(Integer.valueOf(0), kVar);
        x.b(new a(this, 0, messagePush));
    }

    public boolean handleMessage(Message message) {
        if (message.obj != null) {
            ((k) this.b.get(Integer.valueOf(message.what))).a((PlaneMsg) message.obj, null);
        }
        return false;
    }
}
