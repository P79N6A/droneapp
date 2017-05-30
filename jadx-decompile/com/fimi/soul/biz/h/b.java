package com.fimi.soul.biz.h;

import android.os.Handler;
import android.os.Message;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.service.CameraSocketService;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import java.util.LinkedList;

public class b {
    private final int a;
    private final int b;
    private b c;
    private final d d;
    private boolean e;
    private Handler f;
    private int g;
    private LinkedList<c> h;
    private volatile boolean i;

    public static class a {
        public static final b a = new b();
    }

    public enum b {
        Nornal,
        WriteCom,
        WritingSky,
        WritingFool
    }

    private b() {
        this.a = 100;
        this.b = 10000;
        this.c = b.Nornal;
        this.d = d.a();
        this.f = new Handler(this) {
            final /* synthetic */ b a;

            {
                this.a = r1;
            }

            public void handleMessage(Message message) {
                super.handleMessage(message);
                if (message.what == 100) {
                    if (this.a.h != null && this.a.h.size() > 0) {
                        LinkedList linkedList = (LinkedList) this.a.h.clone();
                        while (linkedList.size() > 0) {
                            this.a.d.a((c) linkedList.pollFirst());
                        }
                    }
                    this.a.d.k();
                }
            }
        };
        this.g = CameraSocketService.b;
        this.h = new LinkedList();
    }

    public static b a() {
        return a.a;
    }

    private void i() {
        if (this.h != null && this.h.size() > 0) {
            while (this.h.size() > 0) {
                this.d.a((c) this.h.pollFirst());
            }
        }
    }

    public void a(b bVar) {
        this.c = bVar;
    }

    public void a(c cVar) {
        if (this.e) {
            if (!this.d.j()) {
                this.d.b();
                i();
                this.d.e();
                this.d.f();
            }
            this.d.a(cVar);
            return;
        }
        if (!this.d.d()) {
            this.d.c();
        }
        this.d.b(cVar);
        if (this.h.size() < this.g) {
            this.h.add(cVar);
        } else {
            this.h.removeFirst();
            this.h.addLast(cVar);
        }
        if (this.d.j()) {
            g();
        }
    }

    public void a(boolean z) {
        this.i = z;
    }

    public void b(boolean z) {
        this.e = z;
    }

    public boolean b() {
        return this.d.j();
    }

    public LinkedList c() {
        return this.h;
    }

    public void d() {
        this.h.clear();
    }

    public boolean e() {
        return this.i;
    }

    public b f() {
        return this.c;
    }

    public void g() {
        if (!this.f.hasMessages(100)) {
            this.f.sendEmptyMessageDelayed(100, NotificationOptions.a);
        }
    }

    public boolean h() {
        return this.e;
    }
}
