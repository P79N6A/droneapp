package com.fimi.soul.biz.j;

import com.fimi.kernel.c;
import com.fimi.kernel.d.b;
import com.fimi.overseas.soul.R;
import com.fimi.soul.biz.e.d;
import com.fimi.soul.drone.a;
import com.fimi.soul.drone.h.q;
import com.fimi.soul.entity.ErrorMode;
import com.fimi.soul.utils.ap;
import java.util.Hashtable;
import java.util.Map;

public class g {
    private static g a;
    private static Map<Integer, f> b = new Hashtable();

    public static g a() {
        if (a == null) {
            a = new g();
        }
        return a;
    }

    public static Map<Integer, f> b() {
        return b;
    }

    public ErrorMode a(a aVar) {
        boolean m;
        boolean n;
        q ad = aVar.ad();
        boolean ac = aVar.ac();
        if (d.a().k()) {
            m = aVar.g().m();
            n = aVar.g().n();
        } else {
            m = aVar.K().g();
            n = aVar.K().h();
        }
        ErrorMode errorMode = new ErrorMode();
        if (!aVar.T().a()) {
            return errorMode;
        }
        errorMode.setIsMiddleFault(n);
        if (m) {
            if (ac) {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.sky_rc_low_battery));
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_rc_low_battery));
            }
            a(ac, false, R.string.land_rc_low_battery);
        } else {
            a(R.string.land_rc_low_battery);
        }
        if (n) {
            if (ac) {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.sky_rc_middle_fault));
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_rc_middle_fault));
            }
        }
        if (!aVar.U()) {
            return errorMode;
        }
        if ((aVar.aj().c() == (byte) 4 || aVar.aj().a() == (byte) 12) && !ac) {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_RPT_OVERFLOW));
        }
        if ((ad.ak() || aVar.aj().c() == (byte) 5 || aVar.aj().a() == (byte) 8) && !ac) {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_RPT_LOGIC));
        }
        if (aVar.aj().c() == (byte) 6 && !ac) {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_RPT_MOTOR_LOCK));
        }
        if (aVar.aj().c() == (byte) 9 && !ac) {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_RPT_NO_WAY_POINT));
        }
        if ((aVar.aj().c() == (byte) 17 || aVar.aj().a() == (byte) 4) && !ac) {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_RPT_HOME_NOT_SET));
        }
        if ((ad.aj() || aVar.aj().c() == (byte) 21 || aVar.aj().a() == (byte) 14) && !ac) {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_RPT_NO_CALI));
        }
        if (aVar.aj().c() == (byte) 11 && !ac) {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_RPT_INVALID_CMD));
        }
        errorMode.setIsCompassFault(ad.I());
        if (!ad.f() || aVar.aj().g().isLightStream()) {
            int[] iArr = new int[1];
            iArr[0] = ac ? R.string.sky_GPS_ERROR : R.string.land_GPS_ERROR;
            a(iArr);
        } else if (ac) {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.sky_GPS_ERROR));
            a(true, false, R.string.sky_GPS_ERROR);
        } else {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_GPS_ERROR));
            a(false, false, R.string.land_GPS_ERROR);
        }
        if (!ad.g() && (aVar.h() == null || aVar.h().f() != (byte) 3)) {
            a(R.string.sky_no_fly_error, R.string.land_no_fly_error);
        } else if (ac) {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.sky_no_fly_error));
            a(true, false, R.string.sky_no_fly_error);
        } else {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_no_fly_error));
            a(false, false, R.string.land_no_fly_error);
        }
        if (aVar.h() != null && aVar.h().f() == (byte) 1) {
            if (ac) {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.sky_no_fly_buffer_error));
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_no_fly_buffer_error));
            }
        }
        if (ad.h() || ad.i()) {
            if (ac) {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.sky_camp_err));
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_CAMP1_ERROR));
            }
        }
        if (ad.j()) {
            if (ac) {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.sky_imuaccel_error));
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_IMUACCEL_ERROR));
            }
        }
        if (ad.k()) {
            if (ac) {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.sky_imugro_error));
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_IMUGYRO_ERROR));
            }
        }
        if (ad.l()) {
            if (ac) {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.sky_BRO_ERROR));
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_BRO_ERROR));
            }
        }
        if (!ad.m()) {
            a(R.string.sky_BATTERY_ERROR, R.string.land_BATTERY_ERROR);
        } else if (ac) {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.sky_BATTERY_ERROR));
            a(true, false, R.string.sky_BATTERY_ERROR);
        } else {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_BATTERY_ERROR));
            a(false, false, R.string.land_BATTERY_ERROR);
        }
        if (ad.n() && !ac) {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_BATTERY_UNATHORIZED));
        }
        if ((ad.o() || aVar.aj().c() == (byte) 22 || aVar.aj().a() == (byte) 15) && !ac) {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_log_error));
        }
        if (!ad.p() || !aVar.aj().g().isLightStream()) {
            a(R.string.sky_VPS_ERROR);
        } else if (ac) {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.sky_VPS_ERROR));
            a(true, false, R.string.sky_VPS_ERROR);
        } else {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_VPS_ERROR));
        }
        if (!ad.q() || !aVar.aj().g().isLightStream()) {
            a(R.string.sky_VPS_LOWACCURATE);
        } else if (ac) {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.sky_VPS_LOWACCURATE));
            a(false, false, R.string.sky_VPS_LOWACCURATE);
        } else {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_VPS_LOWACCURATE));
        }
        if ((ad.r() || aVar.aj().c() == (byte) 12 || aVar.aj().a() == (byte) 6) && !ac) {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_RC_RETURN));
        }
        if (ad.s() && !ac) {
            if (aVar.an() == 4) {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_tf_card_format_ERROR));
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_NEUTRAL_POINT_ERROR));
            }
        }
        if (ad.x() && !ac) {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_BATTERY_UPDATED_FAIL));
        }
        if (aVar.aj().c() == (byte) 13 || aVar.aj().a() == (byte) 1) {
            if (ac) {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.sky_RPT_NON_AUTO_MODE));
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_RPT_NON_AUTO_MODE));
            }
        } else if (ad.H() && !aVar.aj().g().isLightStream()) {
            if (ac) {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.sky_GPS_NOSIG));
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_GPS_NOSIG));
            }
        }
        if (ad.I()) {
            if (ac) {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.sky_CAMP_NCAL));
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_CAMP_NCAL));
            }
        }
        if (ad.J() && !ac) {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_IMUACCEL_NCAL));
        }
        if (ad.K() && !ac) {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_ORTH_NCAL));
        }
        if (ad.L() && !ac) {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_IMUGYRO_NCAL));
        }
        if ((ad.M() || aVar.aj().c() == (byte) 2 || aVar.aj().a() == (byte) 7) && !ac) {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_G_ATT_INV));
        }
        if (aVar.aj().c() == (byte) 19 || aVar.aj().a() == (byte) 10) {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.str_ap_rpt_app_unconnected));
        }
        if (ad.P() || aVar.aj().c() == (byte) 3 || aVar.aj().a() == (byte) 5) {
            if (!ac) {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_LOWPOWER));
                a(false, false, R.string.land_LOWPOWER);
            } else if (aVar.aj().e() == (byte) 7 || aVar.aj().e() == (byte) 8) {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.sky_lowpower_return));
                a(true, false, R.string.sky_lowpower_return);
            } else if (aVar.aj().e() == (byte) 9) {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.sky_landing_BAT_LOWPOWER));
                a(true, false, R.string.sky_landing_BAT_LOWPOWER);
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.sky_LOWPOWER));
                a(true, false, R.string.sky_LOWPOWER);
            }
            a(R.string.sky_BAT_light_LOWPOWER, R.string.land_BAT_LOWPOWER, R.string.sky_LP_RETURN);
        } else if (ad.N()) {
            a(R.string.sky_LOWPOWER, R.string.land_LOWPOWER, R.string.sky_LP_RETURN, R.string.sky_lowpower_return);
            if (ac) {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.sky_BAT_light_LOWPOWER));
                a(true, false, R.string.sky_BAT_light_LOWPOWER);
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_BAT_LOWPOWER));
                a(false, false, R.string.land_BAT_LOWPOWER);
            }
        } else if (ad.O()) {
            a(R.string.sky_LOWPOWER, R.string.land_LOWPOWER, R.string.sky_BAT_light_LOWPOWER, R.string.land_BAT_LOWPOWER, R.string.sky_lowpower_return);
            if (ac) {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.sky_LP_RETURN));
                a(true, false, R.string.sky_LP_RETURN);
            }
        } else {
            a(R.string.sky_BAT_light_LOWPOWER, R.string.sky_LP_RETURN, R.string.land_BAT_LOWPOWER, R.string.sky_landing_BAT_LOWPOWER, R.string.sky_LOWPOWER, R.string.sky_lowpower_return);
        }
        if (ad.Q()) {
            if (ac) {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.sky_POWER_HIGHTEMP));
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_POWER_HIGHTEMP));
            }
            a(false, false, ac ? R.string.sky_POWER_HIGHTEMP : R.string.land_POWER_HIGHTEMP);
        } else {
            iArr = new int[1];
            iArr[0] = ac ? R.string.sky_POWER_HIGHTEMP : R.string.land_POWER_HIGHTEMP;
            a(iArr);
        }
        if (!ad.ae()) {
            a(R.string.sky_BATTERY_SHORTLIFE_InSky, R.string.sky_BATTERY_SHORTLIFE);
        } else if (ac) {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.sky_BATTERY_SHORTLIFE_InSky));
            a(true, false, R.string.sky_BATTERY_SHORTLIFE_InSky);
        } else {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.sky_BATTERY_SHORTLIFE));
            a(false, false, R.string.sky_BATTERY_SHORTLIFE);
        }
        if (!ad.af()) {
            a(R.string.sky_MAXIMUM_ALTITUDE);
        } else if (ac) {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.sky_MAXIMUM_ALTITUDE));
            a(false, false, R.string.sky_MAXIMUM_ALTITUDE);
        }
        if (!ad.ag()) {
            a(R.string.sky_MAXIMUM_DISTANCE);
        } else if (ac) {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.sky_MAXIMUM_DISTANCE));
            a(false, false, R.string.sky_MAXIMUM_DISTANCE);
        }
        if (ad.ah() && ac) {
        }
        if (ad.ai() && !ac) {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_BAT_PREHEAT));
        }
        if (ad.v()) {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_NfzDataInvalid));
            a(false, false, R.string.land_NfzDataInvalid);
        } else {
            a(R.string.land_NfzDataInvalid);
        }
        if (!ad.R()) {
            a(R.string.land_single_cell_battery);
        } else if (!ac) {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_single_cell_battery));
            a(false, false, R.string.land_single_cell_battery);
        }
        if (ad.z()) {
            if (ac) {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.sky_imag_interface));
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_imag_interface));
            }
        }
        if (ad.w()) {
            if (ac) {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.sky_imu_overtemperature));
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_imu_overtemperature));
            }
        }
        if (ad.D() && !ac) {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.sensor_low_tempe));
        }
        if (!ad.E()) {
            a(R.string.sky_bat_dischage_warning);
        } else if (ac) {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.sky_bat_dischage_warning));
            a(true, false, R.string.sky_bat_dischage_warning);
        } else {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_bat_dischage_warning));
        }
        if (!ad.F()) {
            a(R.string.sky_bat_damage);
        } else if (ac) {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.sky_bat_damage));
            a(true, false, R.string.sky_bat_damage);
        } else {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_bat_damage));
        }
        if (ad.G() && !ac) {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.land_Bat_Low_Temp_And_Rp));
        }
        if (ac) {
            if (ad.T()) {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.stick_move_warning_result));
                a(false, false, R.string.stick_move_warning_des);
            } else {
                a(R.string.stick_move_warning_des);
            }
        }
        if ((aVar.aj().g().isEnforcementAtti() || aVar.aj().g().isLightStream()) && aVar.al().a()) {
            if (ad.U()) {
                if (ac) {
                    errorMode.getLightErrorList().add(Integer.valueOf(R.string.sonar_error_sky));
                } else {
                    errorMode.getLightErrorList().add(Integer.valueOf(R.string.sonar_error));
                }
            }
            if (ad.V()) {
                if (ac) {
                    errorMode.getLightErrorList().add(Integer.valueOf(R.string.camera_disconnect_sky));
                } else {
                    errorMode.getLightErrorList().add(Integer.valueOf(R.string.camera_disconnect));
                }
            }
            if (ad.W()) {
                if (ac) {
                    errorMode.getLightErrorList().add(Integer.valueOf(R.string.imagequality_error_sky));
                } else {
                    errorMode.getLightErrorList().add(Integer.valueOf(R.string.imagequality_error));
                }
            }
            if (ad.al() && !ac) {
                errorMode.getLightErrorList().add(Integer.valueOf(R.string.speedconvergen_error));
            }
            if (ad.X()) {
                if (ac) {
                    errorMode.getLightErrorList().add(Integer.valueOf(R.string.estimatexy_error_sky));
                } else {
                    errorMode.getLightErrorList().add(Integer.valueOf(R.string.estimatexy_error));
                }
            }
        }
        if (!ac && ad.y()) {
            errorMode.getLightErrorList().add(Integer.valueOf(R.string.str_at_rpt_bat_err));
        }
        if (ad.am()) {
            if (ac) {
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

    public void d() {
        if (b().size() > 0) {
            for (Integer num : b().keySet()) {
                f fVar = (f) b().get(num);
                if (!(fVar == null || fVar.c())) {
                    b.b(c.d()).a(c.d().getString(fVar.a()));
                    ((f) b().get(num)).b(true);
                    if (((f) b().get(num)).b()) {
                        ap.a(c.d(), 2000);
                    }
                }
            }
        }
    }
}
