package com.fimi.soul.module.login;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.widget.TextView;
import com.fimi.kernel.utils.v;
import com.fimi.overseas.soul.R;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.biz.m.k;
import com.fimi.soul.biz.manager.MyLocationManager;
import com.fimi.soul.biz.manager.x;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.service.InitAppService;
import com.fimi.soul.utils.ao;
import com.google.firebase.a.a.a;
import java.io.File;

public class LaunchedActivity extends BaseActivity implements Callback {
    private static final int e = 2;
    private static final int f = 3;
    boolean a = false;
    Intent b;
    v c;
    private final int d = 500;
    private Context g;
    private x h;
    private Handler i;
    private boolean j = false;
    private TextView k;
    private TextView l;

    private void a(boolean z) {
        this.j = z;
        Message message = new Message();
        message.obj = Boolean.valueOf(this.j);
        message.what = 2;
        this.i.sendMessageDelayed(message, 500);
    }

    private void b(boolean z) {
        if (!this.a) {
            ao.k(this);
            this.a = true;
            this.i.removeMessages(2);
            this.i.removeMessages(3);
            Intent intent = new Intent(this, LoginActivity.class);
            intent.putExtra(a.k, z);
            intent.putExtra("islaunchexit", true);
            Bundle bundleExtra = getIntent().getBundleExtra("launchBundle");
            if (bundleExtra != null) {
                Bundle bundle = new Bundle();
                bundle.putString("redirectURL", bundleExtra.getString("redirectURL"));
                bundle.putBoolean("islaunch", true);
                intent.putExtra("launchBundle", bundle);
            }
            startActivity(intent);
            finish();
            overridePendingTransition(17432576, 17432577);
        }
    }

    public boolean handleMessage(Message message) {
        b(((Boolean) message.obj).booleanValue());
        return false;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_launch);
        com.fimi.soul.utils.x.d();
        this.c = v.a((Context) this);
        this.c.a().edit().putBoolean(com.fimi.soul.base.a.L, false).commit();
        this.i = new Handler(this);
        this.mTintManager.a(true, (Activity) this);
        this.g = this;
        this.b = new Intent(this, InitAppService.class);
        startService(this.b);
        Message message = new Message();
        message.obj = Boolean.valueOf(!this.c.a().contains("isfirstloading"));
        message.what = 3;
        this.i.sendMessageDelayed(message, 2000);
        this.k = (TextView) findViewById(R.id.launch_center_tv);
        this.l = (TextView) findViewById(R.id.launch_bottom_tv);
        ao.a(getAssets(), this.k, this.l);
        MyLocationManager.a(this.g);
    }

    protected void onDestroy() {
        super.onDestroy();
        this.a = true;
    }

    protected void onResume() {
        super.onResume();
        this.a = false;
        com.fimi.kernel.utils.x.a(new Runnable(this) {
            final /* synthetic */ LaunchedActivity a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.h = x.a(this.a.g);
                this.a.speakTTs.a();
                if (!this.a.c.a().contains("isfirstloading")) {
                    this.a.a(true);
                } else if (ao.b(this.a)) {
                    this.a.h.a(this.a.g, new k(this) {
                        final /* synthetic */ AnonymousClass1 a;

                        {
                            this.a = r1;
                        }

                        public void a(PlaneMsg planeMsg, File file) {
                            this.a.a.a(false);
                        }
                    });
                } else {
                    com.fimi.soul.base.a.a(this.a.g);
                    this.a.a(false);
                }
            }
        });
    }
}
