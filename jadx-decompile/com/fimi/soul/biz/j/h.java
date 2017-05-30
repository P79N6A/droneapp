package com.fimi.soul.biz.j;

import android.app.Activity;
import android.os.Handler;
import android.os.Message;
import com.fimi.soul.module.setting.FlyLogsActivity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class h extends Handler {
    private WeakReference<Activity> a;

    public h(Activity activity) {
        this.a = new WeakReference(activity);
    }

    public void handleMessage(Message message) {
        super.handleMessage(message);
        Activity activity = (Activity) this.a.get();
        if (activity != null && (activity instanceof FlyLogsActivity)) {
            FlyLogsActivity flyLogsActivity = (FlyLogsActivity) activity;
            if (message.what == 10) {
                ArrayList b = flyLogsActivity.b();
                if (b != null) {
                    List c = flyLogsActivity.c();
                    c.addAll((ArrayList) b.clone());
                    flyLogsActivity.a().a(c);
                    b.clear();
                }
            }
        }
    }
}
