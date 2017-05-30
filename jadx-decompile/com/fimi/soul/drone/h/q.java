package com.fimi.soul.drone.h;

import com.fimi.overseas.soul.R;
import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d;
import com.fimi.soul.drone.e;
import com.fimi.soul.utils.ao;

public class q extends e {
    private int b;
    private int c;
    private int d = 0;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int[] j = new int[]{R.string.self_error_gps, R.string.self_error_nofly, R.string.self_error_compass1, R.string.self_error_compass2, R.string.self_error_accelerometer, R.string.self_error_gyroscope, R.string.self_error_barometer, R.string.self_error_battery, R.string.self_error_battery_copyright, R.string.self_error_unknown, R.string.self_error_Optic_flow, R.string.self_error_Optic_flow_not_found, R.string.self_error_optic_flow_sonar, R.string.self_error_optic_flow_camera, R.string.self_error_gc, R.string.self_error_gc_not_found};
    private int[] k = new int[]{R.string.fault_gps, R.string.fault_compass, R.string.fault_accelerometer, R.string.fault_level, R.string.fault_gyroscope, R.string.fault_gesture, R.string.fault_back_battery, R.string.fault_low_battery, R.string.fault_power_hightlemp, R.string.fault_ultrasonic_data_invalid, R.string.fault_Optic_flow_invalid, R.string.fault_Optic_flow_bad, R.string.fault_accelerometer_data_invalid, R.string.fault_barometer_data_invalid, R.string.fault_hight_data_invalid, R.string.fault_texture_quality, R.string.fault_gc, R.string.fault_super_heat, R.string.fault_self_fail, R.string.fault_sevo_stal, R.string.fault_gc_heat_error, R.string.fault_ahrs, R.string.fault_short_life_battery, R.string.fault_max_hight, R.string.fault_max_distance, R.string.fault_gc_pre_heart, R.string.fault_bat_pre_heart};

    public q(a aVar) {
        super(aVar);
    }

    private int c(int i) {
        for (int i2 = 0; i2 < 32; i2++) {
            if (ao.a(i, i2) > 0) {
                return i2;
            }
        }
        return -1;
    }

    @Deprecated
    public boolean A() {
        return ao.a(this.b, Math.abs(this.d + -21)) > 0;
    }

    public boolean B() {
        return ao.a(this.b, Math.abs(this.d + -22)) > 0;
    }

    public boolean C() {
        return ao.a(this.b, Math.abs(this.d + -23)) > 0;
    }

    public boolean D() {
        return ao.a(this.b, Math.abs(this.d + -24)) > 0;
    }

    public boolean E() {
        return ao.a(this.b, Math.abs(this.d + -25)) > 0;
    }

    public boolean F() {
        return ao.a(this.b, Math.abs(this.d + -26)) > 0;
    }

    public boolean G() {
        return ao.a(this.b, Math.abs(this.d + -27)) > 0;
    }

    public boolean H() {
        return ao.a(this.c, Math.abs(this.d + 0)) > 0;
    }

    public boolean I() {
        return ao.a(this.c, Math.abs(this.d + -1)) > 0;
    }

    public boolean J() {
        return ao.a(this.c, Math.abs(this.d + -2)) > 0;
    }

    public boolean K() {
        return ao.a(this.c, Math.abs(this.d + -3)) > 0;
    }

    public boolean L() {
        return ao.a(this.c, Math.abs(this.d + -4)) > 0;
    }

    public boolean M() {
        return ao.a(this.c, Math.abs(this.d + -5)) > 0;
    }

    public boolean N() {
        return ao.a(this.c, Math.abs(this.d + -6)) > 0;
    }

    public boolean O() {
        return ao.a(this.c, Math.abs(this.d + -7)) > 0;
    }

    public boolean P() {
        return ao.a(this.c, Math.abs(this.d + -8)) > 0;
    }

    public boolean Q() {
        return ao.a(this.c, Math.abs(this.d + -9)) > 0;
    }

    public boolean R() {
        return ao.a(this.c, Math.abs(this.d + -10)) > 0;
    }

    public boolean S() {
        return ao.a(this.c, Math.abs(this.d + -11)) > 0;
    }

    public boolean T() {
        return ao.a(this.c, Math.abs(this.d + -12)) > 0;
    }

    public boolean U() {
        return ao.a(this.c, Math.abs(this.d + -13)) > 0;
    }

    public boolean V() {
        return ao.a(this.c, Math.abs(this.d + -14)) > 0;
    }

    public boolean W() {
        return ao.a(this.c, Math.abs(this.d + -15)) > 0;
    }

    public boolean X() {
        return ao.a(this.c, Math.abs(this.d + -16)) > 0;
    }

    public boolean Y() {
        return ao.a(this.c, Math.abs(this.d + -17)) > 0;
    }

    public boolean Z() {
        return ao.a(this.c, Math.abs(this.d + -18)) > 0;
    }

    public int a() {
        return this.i;
    }

    public void a(int i) {
        this.e = i;
    }

    public void a(int i, int i2) {
        this.b = i;
        this.c = i2;
        this.g = c(i);
        this.h = c(i2);
        this.i = this.g;
        if (this.g >= 0 || this.h >= 0) {
            this.e = R.string.self_error_result;
            if (this.g >= 0 && this.g < this.j.length) {
                this.f = this.j[this.g];
            }
            if (this.g >= 0) {
                this.i = this.g;
            }
            if (this.h >= 0 && this.h < this.k.length) {
                this.f = this.k[this.h];
            }
            if (this.h >= 0) {
                this.i = this.h;
            }
        }
        if (this.a != null) {
            this.a.a(d.a.ERROR_CODE);
        }
    }

    public boolean aa() {
        return ao.a(this.c, Math.abs(this.d + -19)) > 0;
    }

    public boolean ab() {
        return ao.a(this.c, Math.abs(this.d + -20)) > 0;
    }

    public boolean ac() {
        return ao.a(this.c, Math.abs(this.d + -21)) > 0;
    }

    public boolean ad() {
        return ao.a(this.c, Math.abs(this.d + -22)) > 0;
    }

    public boolean ae() {
        return ao.a(this.c, Math.abs(this.d + -23)) > 0;
    }

    public boolean af() {
        return ao.a(this.c, Math.abs(this.d + -24)) > 0;
    }

    public boolean ag() {
        return ao.a(this.c, Math.abs(this.d + -25)) > 0;
    }

    public boolean ah() {
        return ao.a(this.c, Math.abs(this.d + -26)) > 0;
    }

    public boolean ai() {
        return ao.a(this.c, Math.abs(this.d + -27)) > 0;
    }

    public boolean aj() {
        return ao.a(this.c, Math.abs(this.d + -28)) > 0;
    }

    public boolean ak() {
        return ao.a(this.c, Math.abs(this.d + -29)) > 0;
    }

    public boolean al() {
        return ao.a(this.c, Math.abs(this.d + -30)) > 0;
    }

    public boolean am() {
        return ao.a(this.c, Math.abs(this.d + -31)) > 0;
    }

    public int b() {
        return this.g;
    }

    public void b(int i) {
        this.f = i;
    }

    public int c() {
        return this.h;
    }

    public int d() {
        return this.e;
    }

    public int e() {
        return this.f;
    }

    public boolean f() {
        return ao.a(this.b, Math.abs(this.d + 0)) > 0;
    }

    public boolean g() {
        return ao.a(this.b, Math.abs(this.d + -1)) > 0;
    }

    public boolean h() {
        return ao.a(this.b, Math.abs(this.d + -2)) > 0;
    }

    public boolean i() {
        return ao.a(this.b, Math.abs(this.d + -3)) > 0;
    }

    public boolean j() {
        return ao.a(this.b, Math.abs(this.d + -4)) > 0;
    }

    public boolean k() {
        return ao.a(this.b, Math.abs(this.d + -5)) > 0;
    }

    public boolean l() {
        return ao.a(this.b, Math.abs(this.d + -6)) > 0;
    }

    public boolean m() {
        return ao.a(this.b, Math.abs(this.d + -7)) > 0;
    }

    public boolean n() {
        return ao.a(this.b, Math.abs(this.d + -8)) > 0;
    }

    public boolean o() {
        return ao.a(this.b, Math.abs(this.d + -9)) > 0;
    }

    public boolean p() {
        return ao.a(this.b, Math.abs(this.d + -10)) > 0;
    }

    public boolean q() {
        return ao.a(this.b, Math.abs(this.d + -11)) > 0;
    }

    public boolean r() {
        return ao.a(this.b, Math.abs(this.d + -12)) > 0;
    }

    public boolean s() {
        return ao.a(this.b, Math.abs(this.d + -13)) > 0;
    }

    public boolean t() {
        return ao.a(this.b, Math.abs(this.d + -14)) > 0;
    }

    public String toString() {
        return "selftErrorIndex=" + this.g + "faultErrorIndex=" + this.h + " GPS模块损坏 =" + f() + " 处于禁飞区=" + g() + " 罗盘1损坏=" + h() + " 罗盘2损坏=" + i() + " 加速度计损坏=" + j() + " 陀螺损坏=" + k() + " 气压计损坏=" + l() + " 电池损坏=" + m() + " 电池非法=" + n() + " 未知故障=" + o() + " 光流损坏=" + p() + " 未挂光流=" + q() + " 未挂云台=" + u() + " GPS无信号=" + H() + " 罗盘待校准=" + I() + " 加速度计待校准=" + J() + " 水平校准=" + K() + " 陀螺带校准=" + L() + " 地面姿态偏移=" + M() + " 低于返航电量=" + O() + " 低电告警=" + P() + " 温度过高=" + Q() + " 单节电池电压异常=" + R() + " 危险低电告警，可能导致电池损坏或坠机=" + S() + " 纹理质量=" + X() + " 云台故障=" + Y() + " 过热=" + Z() + " 自检失败=" + aa() + " 电机堵转=" + ab() + " 重心错误=" + ac() + " AHRS不可用=" + ad() + " 电池寿命不足=" + ae() + " faultError =" + Integer.toBinaryString(this.c) + " selfError=" + Integer.toBinaryString(this.b);
    }

    public boolean u() {
        return ao.a(this.b, Math.abs(this.d + -15)) > 0;
    }

    public boolean v() {
        return ao.a(this.b, Math.abs(this.d + -16)) > 0;
    }

    public boolean w() {
        return ao.a(this.b, Math.abs(this.d + -17)) > 0;
    }

    public boolean x() {
        return ao.a(this.b, Math.abs(this.d + -18)) > 0;
    }

    public boolean y() {
        return ao.a(this.b, Math.abs(this.d + -19)) > 0;
    }

    public boolean z() {
        return ao.a(this.b, Math.abs(this.d + -20)) > 0;
    }
}
