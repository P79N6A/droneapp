package com.fimi.kernel.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class v {
    private static v b = null;
    private static final String c = "miserver_preferen_";
    private static final String d = "bottomstateshow";
    private static final String e = "flight_distance";
    private static final String f = "flight_return_height";
    private static final String g = "flight_h_v_speed";
    private static final String h = "flight_h_v_height";
    private static final String i = "optical_flow_apply";
    private static final String j = "pip_format_dialog";
    private static final String k = "pip_tf_card_fault_dialog";
    private static final String l = "force_attitude_dialog_show_count";
    private static final String m = "foot_open";
    private static final String n = "emergency_stop_pulp";
    private SharedPreferences a = null;
    private String o = "";
    private a p;

    public v(Context context) {
        if (this.a == null) {
            this.a = context.getSharedPreferences("miserver_preferen_", 0);
        }
        this.o = PreferenceSecretKey.getSecretKey();
    }

    public static v a(Context context) {
        if (b == null) {
            b = new v(context);
        }
        return b;
    }

    public SharedPreferences a() {
        return this.a;
    }

    public void a(int i) {
        this.a.edit().putInt("cameraplaystate", i).commit();
    }

    public void a(long j) {
        this.a.edit().putLong("play_index", j).commit();
    }

    public void a(String str) {
        this.a.edit().putString(e, str).commit();
    }

    public void a(String str, int i) {
        Editor edit = this.a.edit();
        edit.putInt(str, i);
        edit.commit();
    }

    public void a(String str, String str2) {
        try {
            this.a.edit().putString(str, h(str2)).commit();
        } catch (Exception e) {
        }
    }

    public void a(boolean z) {
        this.a.edit().putBoolean(d, z).commit();
    }

    public Boolean b() {
        return Boolean.valueOf(false);
    }

    public void b(int i) {
        this.a.edit().putInt(l, i).commit();
    }

    public void b(String str) {
        this.a.edit().putString(f, str).commit();
    }

    public void b(boolean z) {
        this.a.edit().putBoolean(i, z).commit();
    }

    public int c() {
        return this.a.getInt("cameraplaystate", 0);
    }

    public void c(int i) {
        this.a.edit().putInt(n, i).commit();
    }

    public void c(String str) {
        this.a.edit().putString(g, str).commit();
    }

    public void c(boolean z) {
        this.a.edit().putBoolean(j, z).commit();
    }

    public void d(String str) {
        this.a.edit().putString(h, str).commit();
    }

    public void d(boolean z) {
        this.a.edit().putBoolean(k, z).commit();
    }

    public boolean d() {
        return this.a.getBoolean(d, true);
    }

    public int e(String str) {
        return this.a.getInt(str, 0);
    }

    public String e() {
        return this.a.getString(e, "500");
    }

    public void e(boolean z) {
        this.a.edit().putBoolean(m, z).commit();
    }

    public String f() {
        return this.a.getString(f, "30");
    }

    public String f(String str) {
        String str2 = "";
        try {
            str2 = g(this.a.getString(str, ""));
        } catch (Exception e) {
        }
        return str2;
    }

    public String g() {
        return this.a.getString(g, "10");
    }

    public String g(String str) {
        String str2 = "";
        try {
            str2 = r.a(str, this.o);
        } catch (Exception e) {
        }
        return str2;
    }

    public String h() {
        return this.a.getString(h, "120");
    }

    public String h(String str) {
        String str2 = "";
        try {
            str2 = r.b(str, this.o);
        } catch (Exception e) {
        }
        return str2;
    }

    public boolean i() {
        return this.a.getBoolean(i, false);
    }

    public boolean j() {
        return this.a.getBoolean(j, true);
    }

    public boolean k() {
        return this.a.getBoolean(k, true);
    }

    public int l() {
        return this.a.getInt(l, 0);
    }

    public boolean m() {
        return this.a.getBoolean(m, false);
    }

    public long n() {
        return this.a.getLong("play_index", 0);
    }

    public int o() {
        return this.a.getInt(n, 0);
    }
}
