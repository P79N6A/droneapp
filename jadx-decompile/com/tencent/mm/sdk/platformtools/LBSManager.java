package com.tencent.mm.sdk.platformtools;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import com.google.firebase.a.a.b;
import com.tencent.mm.sdk.platformtools.MTimerHandler.CallBack;
import com.tencent.mm.sdk.platformtools.PhoneUtil.MacInfo;
import com.xiaomi.mipush.sdk.Constants;
import java.util.LinkedList;
import java.util.List;

public class LBSManager extends BroadcastReceiver {
    public static final String FILTER_GPS = "filter_gps";
    public static final int INVALID_ACC = -1000;
    public static final float INVALID_LAT = -1000.0f;
    public static final float INVALID_LNG = -1000.0f;
    public static final int MM_SOURCE_HARDWARE = 0;
    public static final int MM_SOURCE_NET = 1;
    public static final int MM_SOURCE_REPORT_HARWARE = 3;
    public static final int MM_SOURCE_REPORT_NETWORK = 4;
    private static LocationCache ab;
    private Context R;
    private OnLocationGotListener ac;
    private LocationManager ad;
    private PendingIntent ae;
    private boolean af = false;
    boolean ag;
    boolean ah = false;
    boolean ai = false;
    int aj;
    private MTimerHandler ak = new MTimerHandler(new CallBack(this) {
        final /* synthetic */ LBSManager al;

        {
            this.al = r1;
        }

        public boolean onTimerExpired() {
            Log.v("MicroMsg.LBSManager", "get location by GPS failed.");
            this.al.ag = true;
            this.al.start();
            this.al.af = false;
            return false;
        }
    }, false);

    static class LocationCache {
        int I = 1;
        float am = -1000.0f;
        float an = -1000.0f;
        int ao = -1000;
        long time;

        LocationCache() {
        }
    }

    public interface OnLocationGotListener {
        void onLocationGot(float f, float f2, int i, int i2, String str, String str2, boolean z);
    }

    public LBSManager(Context context, OnLocationGotListener onLocationGotListener) {
        this.ac = onLocationGotListener;
        this.ag = false;
        this.aj = 0;
        this.R = context;
        PhoneUtil.getSignalStrength(context);
        this.ad = (LocationManager) context.getSystemService(b.p);
        b();
        this.ae = PendingIntent.getBroadcast(context, 0, new Intent(FILTER_GPS), 134217728);
    }

    private boolean b() {
        if (this.ad == null) {
            return false;
        }
        try {
            this.ad.sendExtraCommand("gps", "force_xtra_injection", null);
            this.ad.sendExtraCommand("gps", "force_time_injection", null);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private void c() {
        this.ak.stopTimer();
        this.ag = true;
    }

    public static void setLocationCache(float f, float f2, int i, int i2) {
        if (i != 0) {
            Log.v("MicroMsg.LBSManager", "setLocationCache [" + f + Constants.ACCEPT_TIME_SEPARATOR_SP + f2 + "] acc:" + i + " source:" + i2);
            if (ab == null) {
                ab = new LocationCache();
            }
            ab.am = f;
            ab.an = f2;
            ab.ao = i;
            ab.time = System.currentTimeMillis();
            ab.I = i2;
        }
    }

    public String getTelLocation() {
        return PhoneUtil.getCellXml(PhoneUtil.getCellInfoList(this.R));
    }

    public String getWIFILocation() {
        WifiManager wifiManager = (WifiManager) this.R.getSystemService("wifi");
        if (wifiManager == null) {
            Log.e("MicroMsg.LBSManager", "no wifi service");
            return "";
        } else if (wifiManager.getConnectionInfo() == null) {
            Log.e("MicroMsg.LBSManager", "WIFILocation wifi info null");
            return "";
        } else {
            List linkedList = new LinkedList();
            List scanResults = wifiManager.getScanResults();
            if (scanResults != null) {
                for (int i = 0; i < scanResults.size(); i++) {
                    linkedList.add(new MacInfo(((ScanResult) scanResults.get(i)).BSSID, ((ScanResult) scanResults.get(i)).level));
                }
            }
            return PhoneUtil.getMacXml(linkedList);
        }
    }

    public boolean isGpsEnable() {
        try {
            return this.ad.isProviderEnabled("gps");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isNetworkPrividerEnable() {
        try {
            return this.ad.isProviderEnabled("network");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void onReceive(Context context, Intent intent) {
        Location location = (Location) intent.getExtras().get(b.p);
        this.aj++;
        if (location != null) {
            boolean equals = "gps".equals(location.getProvider());
            if (((equals && location.getAccuracy() <= 200.0f) || (!equals && location.getAccuracy() <= 1000.0f)) && location.getAccuracy() > 0.0f) {
                int i = equals ? 0 : 1;
                setLocationCache((float) location.getLatitude(), (float) location.getLongitude(), (int) location.getAccuracy(), i);
                if (this.ac == null) {
                    return;
                }
                if (!this.ag || !this.ah || !this.ai) {
                    String nullAsNil = Util.nullAsNil(getWIFILocation());
                    String nullAsNil2 = Util.nullAsNil(getTelLocation());
                    if (!this.ag) {
                        c();
                        this.ag = true;
                        Log.v("MicroMsg.LBSManager", "location by provider ok:[" + location.getLatitude() + " , " + location.getLongitude() + "]  accuracy:" + location.getAccuracy() + "  retry count:" + this.aj + " isGpsProvider:" + equals);
                        this.ac.onLocationGot((float) location.getLatitude(), (float) location.getLongitude(), (int) location.getAccuracy(), i, nullAsNil, nullAsNil2, true);
                    } else if (!this.ah && i == 0) {
                        this.ah = true;
                        Log.v("MicroMsg.LBSManager", "report location by GPS ok:[" + location.getLatitude() + " , " + location.getLongitude() + "]  accuracy:" + location.getAccuracy() + "  retry count:" + this.aj + " isGpsProvider:" + equals);
                        this.ac.onLocationGot((float) location.getLatitude(), (float) location.getLongitude(), (int) location.getAccuracy(), 3, nullAsNil, nullAsNil2, true);
                    } else if (!this.ai && i == 1) {
                        this.ai = true;
                        Log.v("MicroMsg.LBSManager", "report location by Network ok:[" + location.getLatitude() + " , " + location.getLongitude() + "]  accuracy:" + location.getAccuracy() + "  retry count:" + this.aj + " isGpsProvider:" + equals);
                        this.ac.onLocationGot((float) location.getLatitude(), (float) location.getLongitude(), (int) location.getAccuracy(), 4, nullAsNil, nullAsNil2, true);
                    }
                }
            }
        }
    }

    public void removeGpsUpdate() {
        Log.v("MicroMsg.LBSManager", "removed gps update");
        if (this.ad != null) {
            this.ad.removeUpdates(this.ae);
        }
        try {
            this.R.unregisterReceiver(this);
        } catch (Exception e) {
            Log.v("MicroMsg.LBSManager", "location receiver has already unregistered");
        }
    }

    public void removeListener() {
        Log.v("MicroMsg.LBSManager", "removed gps update on destroy");
        removeGpsUpdate();
        if (this.ak != null) {
            c();
        }
        this.ac = null;
        this.R = null;
        this.ak = null;
        this.ad = null;
    }

    public void requestGpsUpdate() {
        if (isGpsEnable() || isNetworkPrividerEnable()) {
            Log.v("MicroMsg.LBSManager", "requested gps update");
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(FILTER_GPS);
            this.R.registerReceiver(this, intentFilter);
            if (isGpsEnable()) {
                this.ad.requestLocationUpdates("gps", 500, 0.0f, this.ae);
            }
            if (isNetworkPrividerEnable()) {
                this.ad.requestLocationUpdates("network", 500, 0.0f, this.ae);
            }
        }
    }

    public void start() {
        String nullAsNil = Util.nullAsNil(getWIFILocation());
        String nullAsNil2 = Util.nullAsNil(getTelLocation());
        int i = (isGpsEnable() || isNetworkPrividerEnable()) ? true : 0;
        if (i == 0 || this.af) {
            if (ab == null) {
                i = 0;
            } else if (System.currentTimeMillis() - ab.time > 180000 || ab.ao <= 0) {
                i = 0;
            } else {
                boolean z = true;
            }
            if (i == 0) {
                this.ag = true;
                if (nullAsNil.equals("") && nullAsNil2.equals("")) {
                    Log.v("MicroMsg.LBSManager", "get location by network failed");
                    if (this.ac != null) {
                        this.ac.onLocationGot(-1000.0f, -1000.0f, -1000, 0, "", "", false);
                        return;
                    }
                    return;
                }
                Log.v("MicroMsg.LBSManager", "get location by network ok, macs : " + nullAsNil + " cell ids :" + nullAsNil2);
                if (this.ac != null) {
                    this.ac.onLocationGot(-1000.0f, -1000.0f, -1000, 0, nullAsNil, nullAsNil2, true);
                    return;
                }
                return;
            } else if (this.ac != null) {
                this.ag = true;
                Log.v("MicroMsg.LBSManager", "location by GPS cache ok:[" + ab.am + " , " + ab.an + "]  accuracy:" + ab.ao + " source:" + ab.I);
                this.ac.onLocationGot(ab.am, ab.an, ab.ao, ab.I, nullAsNil, nullAsNil2, true);
                return;
            } else {
                return;
            }
        }
        this.af = true;
        this.aj = 0;
        requestGpsUpdate();
        this.ak.startTimer(3000);
    }
}
