package com.fimi.soul.service;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import android.os.IBinder;
import android.support.annotation.Nullable;
import com.fimi.kernel.utils.x;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.a.a;
import com.fimi.soul.biz.e.d;
import com.fimi.soul.utils.ao;

public class UsbStatus extends Service {
    public static final String a = "android.hardware.usb.action.USB_STATE";
    public static final String b = "android.net.conn.CONNECTIVITY_CHANGE";
    BroadcastReceiver c = new BroadcastReceiver(this) {
        final /* synthetic */ UsbStatus a;

        {
            this.a = r1;
        }

        private void a() {
            this.a.e.T().d();
            d.a().a(false);
            this.a.e.V();
        }

        public void onReceive(Context context, Intent intent) {
            if ("android.hardware.usb.action.USB_STATE".equals(intent.getAction())) {
                if (!intent.getExtras().getBoolean("connected")) {
                    if ((this.a.e.U() || this.a.e.T().a()) && a.a().b() == 1) {
                        a();
                    }
                }
            } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                this.a.f = 0;
                if (a.a().b() == 2) {
                    WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
                    if (wifiManager.getWifiState() == 3) {
                        x.b(new Runnable(this) {
                            final /* synthetic */ AnonymousClass1 a;

                            {
                                this.a = r1;
                            }

                            public void run() {
                                boolean z = false;
                                while (this.a.a.f < 2) {
                                    z = ao.d("192.168.100.1");
                                    this.a.a.f = this.a.a.f + 1;
                                }
                                if (!z) {
                                    this.a.a();
                                }
                            }
                        });
                    } else if (wifiManager.getWifiState() == 1 || wifiManager.getWifiState() == 0) {
                        a();
                    }
                }
            }
        }
    };
    private DroidPlannerApp d;
    private com.fimi.soul.drone.a e;
    private int f = 0;

    public void a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.hardware.usb.action.USB_STATE");
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        registerReceiver(this.c, intentFilter);
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        this.d = (DroidPlannerApp) getApplication();
        this.e = this.d.a;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        a();
        return super.onStartCommand(intent, i, i2);
    }
}
