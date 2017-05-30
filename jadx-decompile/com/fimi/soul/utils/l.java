package com.fimi.soul.utils;

import android.app.ProgressDialog;
import android.os.Handler;
import android.os.Message;
import com.fimi.soul.base.a;

public class l implements Runnable {
    private Handler a;
    private ProgressDialog b;
    private String c;

    public l(String str, Handler handler) {
        this.c = str;
        this.a = handler;
    }

    public void run() {
        System.out.println("下载线程开启");
        new Message().what = ab.a(this.c, a.D, j.i(), this.a);
    }
}
