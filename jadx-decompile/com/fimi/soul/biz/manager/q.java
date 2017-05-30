package com.fimi.soul.biz.manager;

import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import com.fimi.kernel.utils.x;
import com.fimi.soul.biz.l.o;
import com.fimi.soul.biz.m.k;
import com.fimi.soul.entity.PlaneMsg;
import java.util.HashMap;

public class q implements Callback {
    private static q a = null;
    private static final int b = 0;
    private static final int c = 1;
    private HashMap<Integer, k> d;
    private o e = new o();
    private Context f = null;
    private Handler g = new Handler(this);

    class a implements Runnable {
        final /* synthetic */ q a;
        private int b;
        private String c;
        private String d;

        public a(q qVar, int i, String str, String str2) {
            this.a = qVar;
            this.b = i;
            this.c = str;
            this.d = str2;
        }

        public void run() {
            Message obtainMessage = this.a.g.obtainMessage();
            Object obj = null;
            if (this.b == 0) {
                obj = this.a.e.a(this.c, this.d, this.a.f);
            }
            if (this.b == 1) {
                obj = this.a.e.a(this.a.f);
            }
            obtainMessage.what = this.b;
            obtainMessage.obj = obj;
            this.a.g.sendMessage(obtainMessage);
        }
    }

    public q(Context context) {
        this.f = context;
        this.d = new HashMap();
    }

    public static q a(Context context) {
        if (a == null) {
            a = new q(context);
        }
        return a;
    }

    public void a(k kVar) {
        this.d.put(Integer.valueOf(1), kVar);
        x.b(new a(this, 1, null, null));
    }

    public void a(String str, String str2, k kVar) {
        this.d.put(Integer.valueOf(0), kVar);
        x.b(new a(this, 0, str, str2));
    }

    public boolean handleMessage(Message message) {
        if (message.obj != null) {
            ((k) this.d.get(Integer.valueOf(message.what))).a((PlaneMsg) message.obj, null);
        }
        return true;
    }
}
