package com.fimi.soul.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.fimi.kernel.utils.n;
import com.fimi.kernel.utils.u;
import com.fimi.soul.biz.update.d;
import com.fimi.soul.biz.update.f;
import com.fimi.soul.biz.update.f.c;
import com.fimi.soul.biz.update.i;
import com.fimi.soul.biz.update.k;
import com.fimi.soul.entity.UpdateVersonBean;
import com.fimi.soul.receiver.SpeekSignReceiver;
import com.fimi.soul.utils.FlyLogTools;
import com.fimi.soul.utils.ao;
import com.fimi.soul.utils.j;
import java.io.File;
import java.util.List;

public class InitAppService extends Service {
    public static final String a = "sp_down_firmware";
    private volatile int b = 0;
    private com.fimi.soul.biz.update.a c = new com.fimi.soul.biz.update.a();
    private d d = new d();
    private f e = new f();
    private i f;
    private k<UpdateVersonBean> g;
    private i h;
    private SpeekSignReceiver i;
    private com.fimi.soul.biz.o.a j;
    private i k;

    public class a extends Binder {
        final /* synthetic */ InitAppService a;

        public a(InitAppService initAppService) {
            this.a = initAppService;
        }

        public InitAppService a() {
            return this.a;
        }
    }

    private void a(f fVar, UpdateVersonBean updateVersonBean) {
        e();
        updateVersonBean.getSysname();
        File file = new File(j.p());
        if (!file.exists()) {
            file.mkdir();
        }
        String fileEncode = updateVersonBean.getFileEncode();
        String e = fVar.e(updateVersonBean);
        File file2 = new File(e);
        Object obj = null;
        if (file2.exists()) {
            String a = u.a(file2);
            if (!n.b(fileEncode) && fileEncode.equals(a)) {
                obj = 1;
            }
        }
        if (obj == null) {
            fVar.b(updateVersonBean, e, new i(this) {
                final /* synthetic */ InitAppService a;

                {
                    this.a = r1;
                }

                public void a(boolean z, long j, long j2, int i) {
                    if (z) {
                        this.a.f();
                    }
                }
            });
        }
    }

    private synchronized void e() {
        this.b++;
    }

    private synchronized void f() {
        this.b--;
    }

    private void g() {
        if (ao.c(getBaseContext())) {
            if (!b()) {
                c();
            }
        } else if (ao.b(getBaseContext())) {
            d();
        } else {
            Log.d("Good", "没有网络");
        }
    }

    private void h() {
        final f fVar = new f();
        fVar.a(new c(this) {
            final /* synthetic */ InitAppService b;

            public void a(List<UpdateVersonBean> list) {
                this.b.a((List) list);
                if (list != null && list.size() >= 1) {
                    com.fimi.soul.biz.update.c.c = false;
                    com.fimi.soul.biz.update.c.b = false;
                    List<UpdateVersonBean> e = com.fimi.soul.module.update.a.a.a().e();
                    if (e != null && e.size() > 0) {
                        for (UpdateVersonBean a : e) {
                            this.b.a(fVar, a);
                        }
                    }
                }
            }
        });
    }

    public void a() {
        this.f = null;
        this.g = null;
        this.h = null;
    }

    public void a(i iVar) {
        this.k = iVar;
    }

    public void a(k<UpdateVersonBean> kVar) {
        this.g = kVar;
    }

    public void a(List<UpdateVersonBean> list) {
        if (list == null || list.size() < 1) {
            com.fimi.kernel.c.c().a(a, (Object) "");
        } else {
            com.fimi.kernel.c.c().a(a, (List) list);
        }
    }

    public void b(i iVar) {
        this.h = iVar;
    }

    public synchronized boolean b() {
        return this.b > 0;
    }

    public synchronized void c() {
        if (!b() && ao.c(getBaseContext())) {
            h();
        }
    }

    public void c(i iVar) {
        this.f = iVar;
    }

    public void d() {
        this.e.a(new c(this) {
            final /* synthetic */ InitAppService a;

            {
                this.a = r1;
            }

            public void a(List<UpdateVersonBean> list) {
                this.a.a((List) list);
            }
        });
    }

    public IBinder onBind(Intent intent) {
        return new a(this);
    }

    public void onCreate() {
        super.onCreate();
        this.i = new SpeekSignReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        registerReceiver(this.i, intentFilter);
        this.j = com.fimi.soul.biz.o.a.a(getBaseContext());
        this.j.a();
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.i != null) {
            unregisterReceiver(this.i);
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        f.n();
        g();
        FlyLogTools.a((Context) this).a();
        return super.onStartCommand(intent, i, i2);
    }
}
