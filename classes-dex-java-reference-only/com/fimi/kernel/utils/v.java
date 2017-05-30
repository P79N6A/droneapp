package com.fimi.kernel.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class v
{
  private static v b;
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
  
  public v(Context paramContext)
  {
    if (this.a == null) {
      this.a = paramContext.getSharedPreferences("miserver_preferen_", 0);
    }
    this.o = PreferenceSecretKey.getSecretKey();
  }
  
  public static v a(Context paramContext)
  {
    if (b == null) {
      b = new v(paramContext);
    }
    return b;
  }
  
  public SharedPreferences a()
  {
    return this.a;
  }
  
  public void a(int paramInt)
  {
    this.a.edit().putInt("cameraplaystate", paramInt).commit();
  }
  
  public void a(long paramLong)
  {
    this.a.edit().putLong("play_index", paramLong).commit();
  }
  
  public void a(String paramString)
  {
    this.a.edit().putString("flight_distance", paramString).commit();
  }
  
  public void a(String paramString, int paramInt)
  {
    SharedPreferences.Editor localEditor = this.a.edit();
    localEditor.putInt(paramString, paramInt);
    localEditor.commit();
  }
  
  public void a(String paramString1, String paramString2)
  {
    try
    {
      paramString2 = h(paramString2);
      this.a.edit().putString(paramString1, paramString2).commit();
      return;
    }
    catch (Exception paramString1) {}
  }
  
  public void a(boolean paramBoolean)
  {
    this.a.edit().putBoolean("bottomstateshow", paramBoolean).commit();
  }
  
  public Boolean b()
  {
    return Boolean.valueOf(false);
  }
  
  public void b(int paramInt)
  {
    this.a.edit().putInt("force_attitude_dialog_show_count", paramInt).commit();
  }
  
  public void b(String paramString)
  {
    this.a.edit().putString("flight_return_height", paramString).commit();
  }
  
  public void b(boolean paramBoolean)
  {
    this.a.edit().putBoolean("optical_flow_apply", paramBoolean).commit();
  }
  
  public int c()
  {
    return this.a.getInt("cameraplaystate", 0);
  }
  
  public void c(int paramInt)
  {
    this.a.edit().putInt("emergency_stop_pulp", paramInt).commit();
  }
  
  public void c(String paramString)
  {
    this.a.edit().putString("flight_h_v_speed", paramString).commit();
  }
  
  public void c(boolean paramBoolean)
  {
    this.a.edit().putBoolean("pip_format_dialog", paramBoolean).commit();
  }
  
  public void d(String paramString)
  {
    this.a.edit().putString("flight_h_v_height", paramString).commit();
  }
  
  public void d(boolean paramBoolean)
  {
    this.a.edit().putBoolean("pip_tf_card_fault_dialog", paramBoolean).commit();
  }
  
  public boolean d()
  {
    return this.a.getBoolean("bottomstateshow", true);
  }
  
  public int e(String paramString)
  {
    return this.a.getInt(paramString, 0);
  }
  
  public String e()
  {
    return this.a.getString("flight_distance", "500");
  }
  
  public void e(boolean paramBoolean)
  {
    this.a.edit().putBoolean("foot_open", paramBoolean).commit();
  }
  
  public String f()
  {
    return this.a.getString("flight_return_height", "30");
  }
  
  public String f(String paramString)
  {
    try
    {
      paramString = g(this.a.getString(paramString, ""));
      return paramString;
    }
    catch (Exception paramString) {}
    return "";
  }
  
  public String g()
  {
    return this.a.getString("flight_h_v_speed", "10");
  }
  
  public String g(String paramString)
  {
    try
    {
      paramString = r.a(paramString, this.o);
      return paramString;
    }
    catch (Exception paramString) {}
    return "";
  }
  
  public String h()
  {
    return this.a.getString("flight_h_v_height", "120");
  }
  
  public String h(String paramString)
  {
    try
    {
      paramString = r.b(paramString, this.o);
      return paramString;
    }
    catch (Exception paramString) {}
    return "";
  }
  
  public boolean i()
  {
    return this.a.getBoolean("optical_flow_apply", false);
  }
  
  public boolean j()
  {
    return this.a.getBoolean("pip_format_dialog", true);
  }
  
  public boolean k()
  {
    return this.a.getBoolean("pip_tf_card_fault_dialog", true);
  }
  
  public int l()
  {
    return this.a.getInt("force_attitude_dialog_show_count", 0);
  }
  
  public boolean m()
  {
    return this.a.getBoolean("foot_open", false);
  }
  
  public long n()
  {
    return this.a.getLong("play_index", 0L);
  }
  
  public int o()
  {
    return this.a.getInt("emergency_stop_pulp", 0);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/kernel/utils/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */