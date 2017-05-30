package com.fimi.kernel;

import android.os.Handler;
import android.os.Message;
import com.fimi.kernel.utils.x;

public abstract class b {
    private a a = new a(this);

    class a extends Handler {
        final /* synthetic */ b a;

        a(b bVar) {
            this.a = bVar;
        }

        public void handleMessage(Message message) {
            this.a.a(message);
        }
    }

    protected Handler a() {
        return this.a;
    }

    protected abstract void a(Message message);

    protected void a(Runnable runnable) {
        x.a(runnable);
    }
}
