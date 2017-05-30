package com.fimi.soul.module.dronemanage;

import android.content.Context;
import com.fimi.kernel.utils.z;
import com.fimi.overseas.soul.R;

public class b {
    private static b F;
    private final int A = 26;
    private final int B = 27;
    private final int C = 28;
    private final int D = 29;
    private Context E;
    private final int a = 0;
    private final int b = 1;
    private final int c = 2;
    private final int d = 3;
    private final int e = 4;
    private final int f = 5;
    private final int g = 6;
    private final int h = 7;
    private final int i = 8;
    private final int j = 9;
    private final int k = 10;
    private final int l = 11;
    private final int m = 12;
    private final int n = 13;
    private final int o = 14;
    private final int p = 15;
    private final int q = 16;
    private final int r = 17;
    private final int s = 18;
    private final int t = 19;
    private final int u = 20;
    private final int v = 21;
    private final int w = 22;
    private final int x = 23;
    private final int y = 24;
    private final int z = 25;

    public static b a() {
        if (F == null) {
            F = new b();
        }
        return F;
    }

    private void a(int i) {
        z.a(this.E, i, 3000);
    }

    public void a(int i, Context context) {
        this.E = context;
        switch (i) {
            case 1:
                a(R.string.Not_IN_AIR);
                return;
            case 2:
                a(R.string.AP_RPT_ATTITUDE);
                return;
            case 3:
                a(R.string.LOW_POWER);
                return;
            case 4:
                a(R.string.AP_RPT_LOG_START_FAILED);
                return;
            case 5:
                a(R.string.AT_RPT_LOGIC);
                return;
            case 6:
                a(R.string.AP_RPT_MOTOR_LOCK);
                return;
            case 7:
                a(R.string.AP_RPT_HAS_TAKEN_OFF);
                return;
            case 8:
                a(R.string.AP_RPT_ATT_OVERFLOW);
                return;
            case 9:
                a(R.string.AP_RPT_NO_WAY_POINT);
                return;
            case 10:
                a(R.string.AP_RPT_RTH_ING);
                return;
            case 11:
                a(R.string.AP_RPT_INVALID_CMD);
                return;
            case 12:
                a(R.string.AP_RPT_RTH_KEY_SET);
                return;
            case 13:
                a(R.string.AP_RPT_NON_AUTO_MODE);
                return;
            case 14:
                a(R.string.AP_RPT_RC_LOST);
                return;
            case 15:
                a(R.string.AP_RPT_Vpu);
                return;
            case 16:
                a(R.string.AP_RPT_DATA_INVALID);
                return;
            case 17:
                a(R.string.AP_RPT_Home_Not_Set);
                return;
            case 18:
                a(R.string.AP_RPT_Is_LANDING);
                return;
            case 19:
                a(R.string.AP_RPT_APP_UNCONNECT);
                return;
            case 20:
                a(R.string.AP_RPT_Compass_Err);
                return;
            case 21:
                a(R.string.AP_RPT_ON_Calibration);
                return;
            case 22:
                a(R.string.AP_RPT_LOG_START_FAILED);
                return;
            case 23:
                a(R.string.AP_RPT_CYRO_ERROR);
                return;
            case 24:
                a(R.string.AP_RPT_ACCEL_ERR);
                return;
            case 25:
                a(R.string.AP_RPT_BARO_ERR);
                return;
            case 26:
                a(R.string.AP_RPT_GPS_ERR);
                return;
            case 27:
                a(R.string.AP_RPT_NO_FLY_ZONE);
                return;
            case 28:
                a(R.string.AT_RPT_STICK_NEUTAL);
                return;
            default:
                return;
        }
    }
}
