package com.fimi.soul.service;

import android.app.IntentService;
import android.content.Intent;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.module.update.a.a;
import com.fimi.soul.module.update.a.g;

public class RequestVersionService extends IntentService {
    public static final String a = "RequestVersionService";

    public RequestVersionService() {
        super(a);
    }

    public RequestVersionService(String str) {
        super(str);
    }

    protected void onHandleIntent(Intent intent) {
        g gVar = new g(this, ((DroidPlannerApp) getApplication()).a);
        int i = 0;
        while (i < 5) {
            gVar.a();
            if (a.a().a(0).b() <= 0) {
                i++;
            } else {
                return;
            }
        }
    }
}
