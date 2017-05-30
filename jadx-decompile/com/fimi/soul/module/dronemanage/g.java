package com.fimi.soul.module.dronemanage;

import android.os.Handler;
import android.os.Message;
import com.fimi.kernel.utils.x;
import com.google.android.gms.maps.model.PolylineOptions;

abstract class g {
    public PolylineOptions a = new PolylineOptions();
    private a b = new a(this);

    class a extends Handler {
        final /* synthetic */ g a;

        a(g gVar) {
            this.a = gVar;
        }

        public void handleMessage(Message message) {
            this.a.a(message);
        }
    }

    public g() {
        this.a.a(-256).a(5.0f);
    }

    public void a() {
        if (this.a != null) {
            this.a = null;
            this.a = new PolylineOptions();
            this.a.a(-256).a(5.0f);
        }
    }

    protected abstract void a(Message message);

    protected void a(Runnable runnable) {
        x.a(runnable);
    }

    protected Handler b() {
        return this.b;
    }
}
