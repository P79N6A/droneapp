package com.fimi.soul.biz.manager;

import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import com.fimi.kernel.utils.x;
import com.fimi.soul.biz.m.h;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.User;
import java.util.HashMap;

public class k implements Callback {
    public static String a = "1";
    public static String b = "2";
    private static k d = null;
    private static final int e = 1;
    private HashMap<Integer, com.fimi.soul.biz.m.k> c = new HashMap();
    private Context f = null;
    private h g;
    private Handler h;

    class a implements Runnable {
        final /* synthetic */ k a;
        private User b;
        private int c;
        private String d;

        public a(k kVar, int i, String str, User user) {
            this.a = kVar;
            this.c = i;
            this.b = user;
            this.d = str;
        }

        public void run() {
            Message obtainMessage = this.a.h.obtainMessage();
            Object obj = null;
            switch (this.c) {
                case 1:
                    obj = this.a.g.a(this.b, this.d, this.a.f);
                    break;
            }
            obtainMessage.what = this.c;
            obtainMessage.obj = obj;
            this.a.h.sendMessage(obtainMessage);
        }
    }

    public k(Context context) {
        this.f = context;
        this.g = new com.fimi.soul.biz.l.k();
        this.h = new Handler(this);
    }

    public static k a(Context context) {
        if (d == null) {
            d = new k(context);
        }
        return d;
    }

    public void a(User user, String str, com.fimi.soul.biz.m.k kVar) {
        this.c.put(Integer.valueOf(1), kVar);
        x.b(new a(this, 1, str, user));
    }

    public boolean handleMessage(Message message) {
        if (message.obj != null) {
            ((com.fimi.soul.biz.m.k) this.c.get(Integer.valueOf(message.what))).a((PlaneMsg) message.obj, null);
        }
        return false;
    }
}
