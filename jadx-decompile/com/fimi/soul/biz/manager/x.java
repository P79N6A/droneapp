package com.fimi.soul.biz.manager;

import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import com.fimi.soul.biz.l.s;
import com.fimi.soul.biz.m.k;
import com.fimi.soul.biz.m.o;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.Relation;
import com.fimi.soul.entity.User;
import com.xiaomi.account.openauth.XMAuthericationException;
import java.io.File;
import java.util.HashMap;

public class x implements Callback {
    private static x a = null;
    private static final int b = 0;
    private static final int c = 1;
    private static final int d = 2;
    private static final int e = 3;
    private static final int f = 4;
    private static final int g = 5;
    private static final int h = 6;
    private static final int i = 7;
    private static final int j = 8;
    private static final int k = 10;
    private static final int l = 11;
    private static final int m = 12;
    private static final int n = 13;
    private static final int o = 14;
    private static final int p = 15;
    private static final int q = 16;
    private static final int r = 17;
    private static final int s = 18;
    private static final int t = 19;
    private o u;
    private f v;
    private Handler w;
    private HashMap<Integer, k> x;
    private Context y = null;

    class a implements Runnable {
        final /* synthetic */ x a;
        private int b;
        private User c;
        private int d;
        private String e;
        private String f;
        private long g;
        private long h;
        private String i;
        private String j;

        public a(x xVar, int i, int i2, User user) {
            this.a = xVar;
            this.b = i;
            this.c = user;
            this.d = i2;
        }

        public a(x xVar, int i, int i2, User user, String str) {
            this.a = xVar;
            this.b = i;
            this.c = user;
            this.d = i2;
            this.e = str;
        }

        public a(x xVar, int i, String str) {
            this.a = xVar;
            this.b = i;
            this.j = str;
        }

        public a(x xVar, int i, String str, int i2) {
            this.a = xVar;
            this.b = i;
            this.j = str;
            this.i = String.valueOf(i2);
        }

        public a(x xVar, int i, String str, long j, long j2, String str2) {
            this.a = xVar;
            this.b = i;
            this.f = str;
            this.g = j;
            this.i = str2;
            this.h = j2;
        }

        public a(x xVar, int i, String str, String str2) {
            this.a = xVar;
            this.b = i;
            this.f = str;
            this.i = str2;
        }

        public void run() {
            Message obtainMessage = this.a.w.obtainMessage();
            Object obj = null;
            if (this.b == 0) {
                obj = this.a.u.a(this.a.y);
            } else if (this.b == 1) {
                obj = this.a.u.a(this.c, this.a.y);
            } else if (this.b == 3) {
                try {
                    obj = this.a.u.b(this.a.y);
                } catch (XMAuthericationException e) {
                    e.printStackTrace();
                }
            } else if (this.b == 4) {
                obj = this.a.u.b(this.c, this.a.y);
            } else if (this.b == 5) {
                obj = this.a.u.c(this.c, this.a.y);
            } else if (this.b == 6) {
                obj = this.a.u.b(this.c.getUserID(), this.d, this.a.y);
            } else if (this.b == 16) {
                obj = this.a.u.c(this.c.getUserID(), this.d, this.a.y);
            } else if (this.b == 8) {
                obj = this.a.u.a(this.c.getNickName(), this.d, this.a.y);
            } else if (this.b == 7) {
                Relation relation = new Relation();
                relation.setUserID(this.c.getUserID());
                relation.setRelationID(this.c.getCountry());
                obj = this.a.u.a(relation, this.a.y);
            } else if (this.b == 10) {
                obj = this.a.u.d(this.c, this.a.y);
            } else if (this.b == 11) {
                obj = this.a.u.e(this.c, this.a.y);
            } else if (this.b == 12) {
                obj = this.a.u.a(this.c, this.d, this.e, this.a.y);
            } else if (this.b == 13) {
                obj = this.a.u.f(this.c, this.a.y);
            } else if (this.b == 14) {
                obj = this.a.u.b(this.c.getUserID(), this.c.getDevice(), this.a.y);
            } else if (this.b == 15) {
                obj = this.a.u.g(this.c, this.a.y);
            } else if (this.b == 17) {
                obj = this.a.u.c(this.f, this.i, this.a.y);
            } else if (this.b == 18) {
                obj = this.a.u.c(this.j, this.a.y);
            } else if (this.b == 19) {
                obj = this.a.u.c(this.a.y);
            }
            obtainMessage.what = this.b;
            obtainMessage.obj = obj;
            this.a.w.sendMessage(obtainMessage);
        }
    }

    public x(Context context) {
        this.u = new s(context);
        this.v = f.a(context);
        this.w = new Handler(context.getMainLooper(), this);
        this.y = context;
        this.x = new HashMap();
    }

    public static x a(Context context) {
        if (a == null) {
            a = new x(context);
        }
        return a;
    }

    public void a(Context context, k kVar) {
        this.v.a(new k(this) {
            final /* synthetic */ x a;

            {
                this.a = r1;
            }

            public void a(PlaneMsg planeMsg, File file) {
                com.fimi.soul.base.a.a("Create fds server" + planeMsg.isSuccess(), x.class);
            }
        });
        this.x.put(Integer.valueOf(3), kVar);
        com.fimi.kernel.utils.x.b(new a(this, 3, 0, null));
    }

    public void a(k kVar) {
        this.x.put(Integer.valueOf(0), kVar);
        com.fimi.kernel.utils.x.b(new a(this, 0, 0, null));
    }

    public void a(User user, int i, k kVar) {
        this.x.put(Integer.valueOf(11), kVar);
        com.fimi.kernel.utils.x.b(new a(this, 11, 0, user));
    }

    public void a(User user, int i, String str, k kVar) {
        this.x.put(Integer.valueOf(12), kVar);
        com.fimi.kernel.utils.x.b(new a(this, 12, i, user, str));
    }

    public void a(User user, k kVar) {
        this.x.put(Integer.valueOf(15), kVar);
        com.fimi.kernel.utils.x.b(new a(this, 15, 0, user));
    }

    public void a(String str, int i, k kVar) {
        this.x.put(Integer.valueOf(6), kVar);
        User user = new User();
        user.setUserID(str);
        com.fimi.kernel.utils.x.b(new a(this, 6, i, user));
    }

    public void a(String str, k kVar) {
        this.x.put(Integer.valueOf(14), kVar);
        User user = new User();
        user.setUserID(com.fimi.soul.base.a.b(this.y).getUserID());
        user.setDevice(str);
        com.fimi.kernel.utils.x.b(new a(this, 14, 0, user));
    }

    public void a(String str, String str2, k kVar) {
        this.x.put(Integer.valueOf(10), kVar);
        User user = new User();
        user.setUserID(str);
        user.setCountry(str2);
        com.fimi.kernel.utils.x.b(new a(this, 10, 0, user));
    }

    public void b(k kVar) {
        this.x.put(Integer.valueOf(19), kVar);
        com.fimi.kernel.utils.x.b(new a(this, 19, null));
    }

    public void b(User user, k kVar) {
        this.x.put(Integer.valueOf(13), kVar);
        com.fimi.kernel.utils.x.b(new a(this, 13, 0, user));
    }

    public void b(String str, int i, k kVar) {
        this.x.put(Integer.valueOf(16), kVar);
        User user = new User();
        user.setUserID(str);
        com.fimi.kernel.utils.x.b(new a(this, 16, i, user));
    }

    public void b(String str, k kVar) {
        this.x.put(Integer.valueOf(18), kVar);
        com.fimi.kernel.utils.x.b(new a(this, 18, str));
    }

    public void b(String str, String str2, k kVar) {
        this.x.put(Integer.valueOf(7), kVar);
        User user = new User();
        user.setUserID(str);
        user.setCountry(str2);
        com.fimi.kernel.utils.x.b(new a(this, 7, 0, user));
    }

    public void c(User user, k kVar) {
        this.x.put(Integer.valueOf(4), kVar);
        com.fimi.kernel.utils.x.b(new a(this, 4, 0, user));
    }

    public void c(String str, int i, k kVar) {
        this.x.put(Integer.valueOf(8), kVar);
        User user = new User();
        user.setNickName(str);
        com.fimi.kernel.utils.x.b(new a(this, 8, i, user));
    }

    public void c(String str, String str2, k kVar) {
        this.x.put(Integer.valueOf(2), kVar);
        com.fimi.kernel.utils.x.b(new a(this, 2, 0, new User()));
    }

    public void d(User user, k kVar) {
        this.x.put(Integer.valueOf(1), kVar);
        com.fimi.kernel.utils.x.b(new a(this, 1, 0, user));
    }

    public void d(String str, String str2, k kVar) {
        this.x.put(Integer.valueOf(17), kVar);
        com.fimi.kernel.utils.x.b(new a(this, 17, str, str2));
    }

    public void e(User user, k kVar) {
        this.x.put(Integer.valueOf(5), kVar);
        com.fimi.kernel.utils.x.b(new a(this, 5, 0, user));
    }

    public boolean handleMessage(Message message) {
        if (message.obj != null) {
            ((k) this.x.get(Integer.valueOf(message.what))).a((PlaneMsg) message.obj, null);
        }
        return false;
    }
}
