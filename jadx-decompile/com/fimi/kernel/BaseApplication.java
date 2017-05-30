package com.fimi.kernel;

import android.content.Context;
import android.support.multidex.MultiDex;
import android.support.multidex.MultiDexApplication;
import com.fimi.kernel.utils.x;

public class BaseApplication extends MultiDexApplication {
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        MultiDex.install(context);
    }

    public void onCreate() {
        super.onCreate();
        c.a(getApplicationContext());
    }

    public void onTerminate() {
        x.b();
        super.onTerminate();
    }
}
