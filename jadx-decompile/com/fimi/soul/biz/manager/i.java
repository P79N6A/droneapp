package com.fimi.soul.biz.manager;

import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import com.fimi.kernel.utils.x;
import com.fimi.soul.biz.l.j;
import com.fimi.soul.biz.m.g;
import com.fimi.soul.biz.m.k;
import com.fimi.soul.entity.HomePage;
import com.fimi.soul.entity.PlaneMsg;
import java.util.HashMap;

public class i implements Callback {
    private static i a = null;
    private static final int b = 10;
    private static final int c = 11;
    private static final int d = 12;
    private Context e = null;
    private HashMap<Integer, k> f;
    private Handler g;
    private g h;

    class a implements Runnable {
        final /* synthetic */ i a;
        private int b;
        private HomePage c;

        public a(i iVar, int i, HomePage homePage) {
            this.a = iVar;
            this.b = i;
            this.c = homePage;
        }

        public void run() {
            Message obtainMessage = this.a.g.obtainMessage();
            Object obj = null;
            if (this.b == 11) {
                obj = this.a.h.a(this.c, this.a.e);
            } else if (this.b == 12) {
                obj = this.a.h.b(this.c, this.a.e);
            } else if (this.b == 10) {
                obj = this.a.h.b(this.a.e);
            }
            obtainMessage.what = this.b;
            obtainMessage.obj = obj;
            this.a.g.sendMessage(obtainMessage);
        }
    }

    public i(Context context) {
        this.e = context;
        this.f = new HashMap();
        this.g = new Handler(this);
        this.h = new j();
    }

    public static i a(Context context) {
        if (a == null) {
            a = new i(context);
        }
        return a;
    }

    public void a(k kVar) {
        this.f.put(Integer.valueOf(10), kVar);
        x.b(new a(this, 10, null));
    }

    public void a(HomePage homePage, k kVar) {
        this.f.put(Integer.valueOf(12), kVar);
        x.b(new a(this, 12, homePage));
    }

    public void b(HomePage homePage, k kVar) {
        this.f.put(Integer.valueOf(11), kVar);
        x.b(new a(this, 11, homePage));
    }

    public boolean handleMessage(Message message) {
        if (message.obj != null) {
            ((k) this.f.get(Integer.valueOf(message.what))).a((PlaneMsg) message.obj, null);
        }
        return false;
    }
}
