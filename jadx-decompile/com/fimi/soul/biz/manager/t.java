package com.fimi.soul.biz.manager;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import com.fimi.soul.media.player.FimiMediaMeta;
import java.util.Timer;
import java.util.TimerTask;

public class t implements Callback {
    private static t b = null;
    private static final int h = 1;
    private a a;
    private long c = 0;
    private long d = 0;
    private Handler e = new Handler(this);
    private Context f = null;
    private Timer g;

    public interface a {
        void a(String str, String str2);
    }

    public t(Context context) {
        this.f = context;
    }

    public static t a(Context context) {
        if (b == null) {
            b = new t(context);
        }
        return b;
    }

    private String c() {
        long totalRxBytes = TrafficStats.getUidRxBytes(this.f.getApplicationInfo().uid) == -1 ? 0 : TrafficStats.getTotalRxBytes() / FimiMediaMeta.AV_CH_SIDE_RIGHT;
        long currentTimeMillis = System.currentTimeMillis();
        long j = (((totalRxBytes - this.c) * 1000) / 8) / (currentTimeMillis - this.d);
        this.d = currentTimeMillis;
        this.c = totalRxBytes;
        return String.valueOf(j) + " KB/s";
    }

    public void a() {
        if (this.g != null) {
            this.g.cancel();
        }
    }

    public void a(a aVar) {
        this.a = aVar;
        this.c = TrafficStats.getUidRxBytes(this.f.getApplicationInfo().uid) == -1 ? 0 : TrafficStats.getTotalRxBytes() / FimiMediaMeta.AV_CH_SIDE_RIGHT;
        this.d = System.currentTimeMillis();
        this.g = new Timer();
        this.g.schedule(new TimerTask(this) {
            final /* synthetic */ t a;

            {
                this.a = r1;
            }

            public void run() {
                String a = this.a.c();
                Message obtain = Message.obtain();
                obtain.what = 1;
                obtain.obj = a;
                this.a.e.sendMessage(obtain);
            }
        }, 1000, 2000);
    }

    public String b() {
        String str = "";
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            if (activeNetworkInfo.getType() == 1) {
                return "WiFi";
            }
            if (activeNetworkInfo.getType() == 0) {
                String subtypeName = activeNetworkInfo.getSubtypeName();
                switch (activeNetworkInfo.getSubtype()) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                        return "2G";
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                        return "3G";
                    case 13:
                        return "4G";
                    default:
                        return (subtypeName.equalsIgnoreCase("TD-SCDMA") || subtypeName.equalsIgnoreCase("WCDMA") || subtypeName.equalsIgnoreCase("CDMA2000")) ? "3G" : subtypeName;
                }
            }
        }
        return str;
    }

    public boolean handleMessage(Message message) {
        if (message.what == 1) {
            this.a.a((String) message.obj, b());
        }
        return false;
    }
}
