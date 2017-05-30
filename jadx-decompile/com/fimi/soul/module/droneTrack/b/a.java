package com.fimi.soul.module.droneTrack.b;

import com.fimi.overseas.soul.R;
import com.fimi.soul.biz.j.f;
import com.fimi.soul.drone.h.q;
import com.fimi.soul.entity.ErrorMode;
import java.util.Hashtable;
import java.util.Map;

public class a {
    private static a a;
    private static Map<Integer, f> b = new Hashtable();

    public static a a() {
        if (a == null) {
            a = new a();
        }
        return a;
    }

    public static Map<Integer, f> b() {
        return b;
    }

    public ErrorMode a(com.fimi.soul.module.droneTrack.a.a aVar) {
        q b = aVar.b();
        if (b == null) {
            return null;
        }
        boolean j = aVar.j();
        boolean m = aVar.m();
        boolean n = aVar.n();
        ErrorMode errorMode = new ErrorMode();
        errorMode.setIsMiddleFault(n);
        if (m) {
            if (j) {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.sky_rc_low_battery));
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_rc_low_battery));
            }
            a(j, false, R.string.land_rc_low_battery);
        } else {
            a(R.string.land_rc_low_battery);
        }
        if (n) {
            if (j) {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.sky_rc_middle_fault));
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_rc_middle_fault));
            }
        }
        if ((aVar.a().c() == (byte) 4 || aVar.a().a() == (byte) 12) && !j) {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_RPT_OVERFLOW));
        }
        if ((b.ak() || aVar.a().c() == (byte) 5 || aVar.a().a() == (byte) 8) && !j) {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_RPT_LOGIC));
        }
        if (aVar.a().c() == (byte) 6 && !j) {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_RPT_MOTOR_LOCK));
        }
        if (aVar.a().c() == (byte) 9 && !j) {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_RPT_NO_WAY_POINT));
        }
        if ((aVar.a().c() == (byte) 17 || aVar.a().a() == (byte) 4) && !j) {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_RPT_HOME_NOT_SET));
        }
        if ((b.aj() || aVar.a().c() == (byte) 21 || aVar.a().a() == (byte) 14) && !j) {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_RPT_NO_CALI));
        }
        if (aVar.a().c() == (byte) 11 && !j) {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_RPT_INVALID_CMD));
        }
        errorMode.setIsCompassFault(b.I());
        if (!b.f() || aVar.a().g().isLightStream()) {
            int[] iArr = new int[1];
            iArr[0] = j ? R.string.sky_GPS_ERROR : R.string.land_GPS_ERROR;
            a(iArr);
        } else if (j) {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.sky_GPS_ERROR));
            a(true, false, R.string.sky_GPS_ERROR);
        } else {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_GPS_ERROR));
            a(false, false, R.string.land_GPS_ERROR);
        }
        if (!b.g() && (aVar.c() == null || aVar.c().f() != (byte) 3)) {
            a(R.string.sky_no_fly_error, R.string.land_no_fly_error);
        } else if (j) {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.sky_no_fly_error));
            a(true, false, R.string.sky_no_fly_error);
        } else {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_no_fly_error));
            a(false, false, R.string.land_no_fly_error);
        }
        if (aVar.c() != null && aVar.c().f() == (byte) 1) {
            if (j) {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.sky_no_fly_buffer_error));
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_no_fly_buffer_error));
            }
        }
        if (b.h() || b.i()) {
            if (j) {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.sky_camp_err));
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_CAMP1_ERROR));
            }
        }
        if (b.j()) {
            if (j) {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.sky_imuaccel_error));
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_IMUACCEL_ERROR));
            }
        }
        if (b.k()) {
            if (j) {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.sky_imugro_error));
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_IMUGYRO_ERROR));
            }
        }
        if (b.l()) {
            if (j) {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.sky_BRO_ERROR));
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_BRO_ERROR));
            }
        }
        if (!b.m()) {
            a(R.string.sky_BATTERY_ERROR, R.string.land_BATTERY_ERROR);
        } else if (j) {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.sky_BATTERY_ERROR));
            a(true, false, R.string.sky_BATTERY_ERROR);
        } else {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_BATTERY_ERROR));
            a(false, false, R.string.land_BATTERY_ERROR);
        }
        if (b.n() && !j) {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_BATTERY_UNATHORIZED));
        }
        if ((b.o() || aVar.a().c() == (byte) 22 || aVar.a().a() == (byte) 15) && !j) {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_log_error));
        }
        if (!b.p() || !aVar.a().g().isLightStream()) {
            a(R.string.sky_VPS_ERROR);
        } else if (j) {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.sky_VPS_ERROR));
            a(true, false, R.string.sky_VPS_ERROR);
        } else {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_VPS_ERROR));
        }
        if (!b.q() || !aVar.a().g().isLightStream()) {
            a(R.string.sky_VPS_LOWACCURATE);
        } else if (j) {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.sky_VPS_LOWACCURATE));
            a(false, false, R.string.sky_VPS_LOWACCURATE);
        } else {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_VPS_LOWACCURATE));
        }
        if ((b.r() || aVar.a().c() == (byte) 12 || aVar.a().a() == (byte) 6) && !j) {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_RC_RETURN));
        }
        if (b.x() && !j) {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_BATTERY_UPDATED_FAIL));
        }
        if (aVar.a().c() == (byte) 13 || aVar.a().a() == (byte) 1) {
            if (j) {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.sky_RPT_NON_AUTO_MODE));
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_RPT_NON_AUTO_MODE));
            }
        } else if (b.H() && !aVar.a().g().isLightStream()) {
            if (j) {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.sky_GPS_NOSIG));
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_GPS_NOSIG));
            }
        }
        if (b.I()) {
            if (j) {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.sky_CAMP_NCAL));
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_CAMP_NCAL));
            }
        }
        if (b.J() && !j) {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_IMUACCEL_NCAL));
        }
        if (b.K() && !j) {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_ORTH_NCAL));
        }
        if (b.L() && !j) {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_IMUGYRO_NCAL));
        }
        if ((b.M() || aVar.a().c() == (byte) 2 || aVar.a().a() == (byte) 7) && !j) {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_G_ATT_INV));
        }
        if (aVar.a().c() == (byte) 19 || aVar.a().a() == (byte) 10) {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.str_ap_rpt_app_unconnected));
        }
        if (b.P() || aVar.a().c() == (byte) 3 || aVar.a().a() == (byte) 5) {
            if (j) {
                if (aVar.a().e() == (byte) 9) {
                    errorMode.getLightErrorList().add(Integer.valueOf(R.string.sky_landing_BAT_LOWPOWER));
                } else {
                    errorMode.getLightErrorList().add(Integer.valueOf(R.string.sky_LOWPOWER));
                }
                a(true, false, R.string.sky_LOWPOWER);
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_LOWPOWER));
                a(false, false, R.string.land_LOWPOWER);
            }
            a(R.string.sky_BAT_light_LOWPOWER, R.string.land_BAT_LOWPOWER, R.string.sky_LP_RETURN);
        } else if (b.N()) {
            a(R.string.sky_LOWPOWER, R.string.land_LOWPOWER, R.string.sky_LP_RETURN);
            if (j) {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.sky_BAT_light_LOWPOWER));
                a(true, false, R.string.sky_BAT_light_LOWPOWER);
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_BAT_LOWPOWER));
                a(false, false, R.string.land_BAT_LOWPOWER);
            }
        } else if (b.O()) {
            a(R.string.sky_LOWPOWER, R.string.land_LOWPOWER, R.string.sky_BAT_light_LOWPOWER, R.string.land_BAT_LOWPOWER);
            if (j) {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.sky_LP_RETURN));
                a(true, false, R.string.sky_LP_RETURN);
            }
        } else {
            a(R.string.sky_BAT_light_LOWPOWER, R.string.sky_LP_RETURN, R.string.land_BAT_LOWPOWER, R.string.sky_landing_BAT_LOWPOWER, R.string.sky_LOWPOWER);
        }
        if (b.Q()) {
            if (j) {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.sky_POWER_HIGHTEMP));
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_POWER_HIGHTEMP));
            }
            a(false, false, j ? R.string.sky_POWER_HIGHTEMP : R.string.land_POWER_HIGHTEMP);
        } else {
            iArr = new int[1];
            iArr[0] = j ? R.string.sky_POWER_HIGHTEMP : R.string.land_POWER_HIGHTEMP;
            a(iArr);
        }
        if (!b.ae()) {
            a(R.string.sky_BATTERY_SHORTLIFE_InSky, R.string.sky_BATTERY_SHORTLIFE);
        } else if (j) {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.sky_BATTERY_SHORTLIFE_InSky));
            a(true, false, R.string.sky_BATTERY_SHORTLIFE_InSky);
        } else {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.sky_BATTERY_SHORTLIFE));
            a(false, false, R.string.sky_BATTERY_SHORTLIFE);
        }
        if (!b.af()) {
            a(R.string.sky_MAXIMUM_ALTITUDE);
        } else if (j) {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.sky_MAXIMUM_ALTITUDE));
            a(false, false, R.string.sky_MAXIMUM_ALTITUDE);
        }
        if (!b.ag()) {
            a(R.string.sky_MAXIMUM_DISTANCE);
        } else if (j) {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.sky_MAXIMUM_DISTANCE));
            a(false, false, R.string.sky_MAXIMUM_DISTANCE);
        }
        if (b.ah() && j) {
        }
        if (b.ai() && !j) {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_BAT_PREHEAT));
        }
        if (b.v()) {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_NfzDataInvalid));
            a(false, false, R.string.land_NfzDataInvalid);
        } else {
            a(R.string.land_NfzDataInvalid);
        }
        if (!b.R()) {
            a(R.string.land_single_cell_battery);
        } else if (!j) {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_single_cell_battery));
            a(false, false, R.string.land_single_cell_battery);
        }
        if (b.z()) {
            if (j) {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.sky_imag_interface));
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_imag_interface));
            }
        }
        if (b.w()) {
            if (j) {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.sky_imu_overtemperature));
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_imu_overtemperature));
            }
        }
        if (j) {
            if (b.T()) {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.stick_move_warning_result));
                a(false, false, R.string.stick_move_warning_des);
            } else {
                a(R.string.stick_move_warning_des);
            }
        }
        if (!aVar.a().g().isGps()) {
            if (b.U()) {
                if (j) {
                    errorMode.getLightErrorList().add(Integer.valueOf(R.string.sonar_error_sky));
                } else {
                    errorMode.getLightErrorList().add(Integer.valueOf(R.string.sonar_error));
                }
            }
            if (b.V()) {
                if (j) {
                    errorMode.getLightErrorList().add(Integer.valueOf(R.string.camera_disconnect_sky));
                } else {
                    errorMode.getLightErrorList().add(Integer.valueOf(R.string.camera_disconnect));
                }
            }
            if (b.W()) {
                if (j) {
                    errorMode.getLightErrorList().add(Integer.valueOf(R.string.imagequality_error_sky));
                } else {
                    errorMode.getLightErrorList().add(Integer.valueOf(R.string.imagequality_error));
                }
            }
            if (b.al() && !j) {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.speedconvergen_error));
            }
            if (b.X()) {
                if (j) {
                    errorMode.getLightErrorList().add(Integer.valueOf(R.string.estimatexy_error_sky));
                } else {
                    errorMode.getLightErrorList().add(Integer.valueOf(R.string.estimatexy_error));
                }
            }
        }
        if (!j && b.y()) {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.str_at_rpt_bat_err));
        }
        if (b.am()) {
            if (j) {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.is_min_hight));
                a(false, false, R.string.is_min_hight);
            } else {
                a(R.string.is_min_hight);
            }
        }
        return errorMode;
    }

    public void a(boolean z, boolean z2, int i) {
        if (!b.containsKey(Integer.valueOf(i))) {
            b.put(Integer.valueOf(i), new f(z, z2, i));
        }
    }

    public void a(int... iArr) {
        for (int i : iArr) {
            if (b.containsKey(Integer.valueOf(i))) {
                b.remove(Integer.valueOf(i));
            }
        }
    }

    public void c() {
        a(R.string.sky_landing_BAT_LOWPOWER, R.string.sky_LP_RETURN);
    }
}
