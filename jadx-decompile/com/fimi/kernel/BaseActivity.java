package com.fimi.kernel;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.FragmentActivity;
import com.fimi.kernel.b.b;
import com.fimi.kernel.b.d;
import com.fimi.kernel.utils.x;
import java.util.HashMap;
import java.util.Map;

public abstract class BaseActivity extends FragmentActivity {
    private Handler activityInnerHandler;
    private Map<d, b> networkManagerMap;

    class a extends Handler {
        final /* synthetic */ BaseActivity a;

        a(BaseActivity baseActivity) {
            this.a = baseActivity;
        }

        public void handleMessage(Message message) {
            this.a.onHandleMessage(message);
            super.handleMessage(message);
        }
    }

    protected Handler getHandler() {
        return this.activityInnerHandler;
    }

    protected com.fimi.kernel.c.a getKeyValueStoreManager() {
        return c.c();
    }

    public b getNetworkManager(d dVar) {
        if (this.networkManagerMap == null) {
            this.networkManagerMap = new HashMap();
        }
        if (this.networkManagerMap.containsKey(dVar)) {
            return (b) this.networkManagerMap.get(dVar);
        }
        b bVar = (b) c.a(dVar);
        this.networkManagerMap.put(dVar, bVar);
        return bVar;
    }

    protected com.fimi.kernel.view.b getViewManager() {
        return c.b();
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c.a((Activity) this);
        this.activityInnerHandler = new a(this);
    }

    protected void onDestroy() {
        c.b(this);
        super.onDestroy();
    }

    public void onHandleMessage(Message message) {
    }

    protected void onResume() {
        c.a((Activity) this);
        super.onResume();
    }

    protected void onStart() {
        c.a((Activity) this);
        super.onStart();
    }

    public void runInBackground(Runnable runnable) {
        x.a(runnable);
    }
}
