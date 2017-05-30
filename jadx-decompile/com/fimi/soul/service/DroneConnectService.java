package com.fimi.soul.service;

import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import android.os.AsyncTask;
import android.os.IBinder;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.camera.b;
import com.fimi.soul.biz.camera.d;
import com.fimi.soul.drone.a;
import com.fimi.soul.drone.g.c;
import com.fimi.soul.utils.ao;
import com.hoho.android.usbserial.driver.UsbId;
import com.hoho.android.usbserial.driver.UsbSerialProber;

public class DroneConnectService extends Service {
    public static final String c = "android.hardware.usb.action.USB_DEVICE_DETACHED";
    public static final String d = "android.hardware.usb.action.USB_DEVICE_ATTACHED";
    public static final String e = "USBHAVECONNECT";
    public static final String f = "TCPSONNECTSUCESS";
    public static final String g = "android.hardware.usb.action.USB_STATE";
    public static final String h = "android.net.conn.TETHER_STATE_CHANGED";
    private static final String l = "com.android.example.USB_PERMISSION";
    public a a;
    public DroidPlannerApp b;
    BroadcastReceiver i = new BroadcastReceiver(this) {
        final /* synthetic */ DroneConnectService a;

        {
            this.a = r1;
        }

        public void onReceive(Context context, Intent intent) {
            if (DroneConnectService.l.equals(intent.getAction())) {
                synchronized (this) {
                    UsbDevice usbDevice = (UsbDevice) intent.getParcelableExtra("device");
                    if (intent.getBooleanExtra("permission", false) && usbDevice != null) {
                        this.a.a(usbDevice);
                    }
                }
            }
            if (DroneConnectService.d.equals(intent.getAction()) && !this.a.a.T().a()) {
                com.fimi.soul.drone.droneconnection.connection.a.a.a(c.c);
                this.a.a.T().b();
            } else if (DroneConnectService.c.equals(intent.getAction()) && this.a.a.T().a()) {
                this.a.a.T().d();
            } else if (!DroneConnectService.h.equals(intent.getAction()) || !c.c.equals(this.a.a.T().e())) {
                new AsyncTask<Void, Void, Boolean>(this) {
                    final /* synthetic */ AnonymousClass2 a;

                    {
                        this.a = r1;
                    }

                    protected Boolean a(Void... voidArr) {
                        return Boolean.valueOf(ao.d(c.b()));
                    }

                    protected void a(Boolean bool) {
                        super.onPostExecute(bool);
                        d dVar = (d) b.a().d();
                        if (!this.a.a.a.T().a() && bool.booleanValue()) {
                            com.fimi.soul.drone.droneconnection.connection.a.a.a(c.d);
                            this.a.a.a.T().b();
                            dVar.t().b();
                        } else if (this.a.a.a.T().a() && !bool.booleanValue() && this.a.a.a.T().e().equals(c.d)) {
                            this.a.a.a.T().d();
                            dVar.a(-1);
                            dVar.m();
                        }
                    }

                    protected /* synthetic */ Object doInBackground(Object[] objArr) {
                        return a((Void[]) objArr);
                    }

                    protected /* synthetic */ void onPostExecute(Object obj) {
                        a((Boolean) obj);
                    }
                }.execute(new Void[0]);
            }
        }
    };
    private UsbManager j;
    private PendingIntent k;

    public void a() {
        if (UsbSerialProber.findFirstDevice(this.j) != null) {
            com.fimi.soul.drone.droneconnection.connection.a.a.a(c.c);
            if (!this.a.T().a()) {
                this.a.T().b();
            }
        } else if (this.j != null) {
            for (UsbDevice a : this.j.getDeviceList().values()) {
                a(a);
            }
            if (!this.a.T().a()) {
                new AsyncTask<Void, Void, Boolean>(this) {
                    final /* synthetic */ DroneConnectService a;

                    {
                        this.a = r1;
                    }

                    protected Boolean a(Void... voidArr) {
                        return Boolean.valueOf(ao.d(c.b()));
                    }

                    protected void a(Boolean bool) {
                        super.onPostExecute(bool);
                        if (bool.booleanValue()) {
                            com.fimi.soul.drone.droneconnection.connection.a.a.a(c.d);
                            this.a.a.T().b();
                        }
                    }

                    protected /* synthetic */ Object doInBackground(Object[] objArr) {
                        return a((Void[]) objArr);
                    }

                    protected /* synthetic */ void onPostExecute(Object obj) {
                        a((Boolean) obj);
                    }
                }.execute(new Void[0]);
            }
        }
    }

    public void a(UsbDevice usbDevice) {
        if (usbDevice.getVendorId() == UsbId.VAN_OOIJEN_TECH_TEENSYDUINO_SERIAL && usbDevice.getProductId() == 22336) {
            if (!this.j.hasPermission(usbDevice)) {
                this.k = PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent(l), 0);
                this.j.requestPermission(usbDevice, this.k);
            }
            com.fimi.soul.drone.droneconnection.connection.a.a.a(c.c);
            if (!this.a.T().a()) {
                this.a.T().b();
            }
        }
    }

    public void b() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(d);
        intentFilter.addAction(c);
        intentFilter.addAction(e);
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        intentFilter.addAction("android.net.wifi.STATE_CHANGE");
        intentFilter.addAction("android.hardware.usb.action.USB_STATE");
        intentFilter.addAction(f);
        intentFilter.addAction(h);
        intentFilter.addAction(l);
        registerReceiver(this.i, intentFilter);
    }

    public void c() {
        unregisterReceiver(this.i);
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        this.b = (DroidPlannerApp) getApplication();
        this.a = this.b.a;
        this.j = (UsbManager) getSystemService("usb");
        b();
    }

    public void onDestroy() {
        super.onDestroy();
        c();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        a();
        return super.onStartCommand(intent, i, i2);
    }
}
