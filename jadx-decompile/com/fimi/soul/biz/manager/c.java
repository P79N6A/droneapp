package com.fimi.soul.biz.manager;

import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import com.fimi.kernel.utils.x;
import com.fimi.soul.biz.l.b;
import com.fimi.soul.biz.m.k;
import com.fimi.soul.entity.BroadcastComment;
import com.fimi.soul.entity.PlaneMsg;
import java.util.HashMap;

public class c implements Callback {
    private static c a = null;
    private static final int b = 1;
    private static final int c = 2;
    private static final int d = 4;
    private static final int e = 3;
    private com.fimi.soul.biz.m.c f = new b();
    private Handler g = new Handler(this);
    private Context h = null;
    private HashMap<Integer, k> i;

    class a implements Runnable {
        final /* synthetic */ c a;
        private int b;
        private BroadcastComment c;
        private String d;
        private int e;

        public a(c cVar, int i, String str, int i2, BroadcastComment broadcastComment) {
            this.a = cVar;
            this.b = i;
            this.c = broadcastComment;
            this.d = str;
            this.e = i2;
        }

        public void run() {
            Message obtainMessage = this.a.g.obtainMessage();
            Object obj = null;
            if (this.b == 1) {
                obj = this.a.f.a(this.a.h, this.c);
            } else if (this.b == 3) {
                obj = this.a.f.b(this.a.h, this.d, this.e);
            } else if (this.b == 2) {
                obj = this.a.f.a(this.a.h, this.d, this.c.getUserID());
            } else if (this.b == 4) {
                obj = this.a.f.b(this.a.h, this.d, this.c.getUserID());
            }
            obtainMessage.what = this.b;
            obtainMessage.obj = obj;
            this.a.g.sendMessage(obtainMessage);
        }
    }

    public c(Context context) {
        this.h = context;
        this.i = new HashMap();
    }

    public static c a(Context context) {
        if (a == null) {
            a = new c(context);
        }
        return a;
    }

    public void a(BroadcastComment broadcastComment, k kVar) {
        this.i.put(Integer.valueOf(1), kVar);
        x.b(new a(this, 1, null, 1, broadcastComment));
    }

    public void a(String str, int i, k kVar) {
        this.i.put(Integer.valueOf(3), kVar);
        x.b(new a(this, 3, str, i, null));
    }

    public void a(String str, String str2, k kVar) {
        BroadcastComment broadcastComment = new BroadcastComment();
        broadcastComment.setUserID(str2);
        this.i.put(Integer.valueOf(2), kVar);
        x.b(new a(this, 2, str, 1, broadcastComment));
    }

    public void b(String str, String str2, k kVar) {
        BroadcastComment broadcastComment = new BroadcastComment();
        broadcastComment.setUserID(str2);
        this.i.put(Integer.valueOf(4), kVar);
        x.b(new a(this, 4, str, 1, broadcastComment));
    }

    public boolean handleMessage(Message message) {
        if (message.obj != null) {
            ((k) this.i.get(Integer.valueOf(message.what))).a((PlaneMsg) message.obj, null);
        }
        return false;
    }
}
