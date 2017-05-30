package com.fimi.soul.utils;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.fimi.soul.entity.BatteryOverDischange;
import java.util.ArrayList;
import java.util.List;

public class d
{
  public static d a;
  public static final String b = "create table  if not exists " + a.a + "(" + a.b + " varchar(20) not null ," + a.c + " varchar(20) not null ," + a.d + " varchar(20) not null ," + a.e + " varchar(20) not null ," + a.f + " varchar(20) not null ," + a.g + " varchar(20) not null ," + a.h + " varchar(20) not null ," + a.i + " varchar(20) not null ," + a.j + " varchar(20) not null ," + a.k + " varchar(20) not null ," + a.l + " varchar(20) not null ," + a.m + " varchar(20) not null ," + a.n + " varchar(20) not null ," + a.o + " varchar(20) not null ," + a.q + " varchar(20) ," + a.r + " varchar(20) ," + a.s + " varchar(20) ," + a.p + " INTEGER)";
  private i c;
  private SQLiteDatabase d;
  private Context e;
  
  public d(Context paramContext)
  {
    this.e = paramContext;
    this.c = i.a(paramContext);
    this.d = this.c.getWritableDatabase();
  }
  
  public static d a(Context paramContext)
  {
    if (a == null) {
      a = new d(paramContext);
    }
    return a;
  }
  
  private ContentValues b(BatteryOverDischange paramBatteryOverDischange)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put(a.b, paramBatteryOverDischange.getUserId());
    localContentValues.put(a.c, paramBatteryOverDischange.getBatteryId());
    localContentValues.put(a.d, paramBatteryOverDischange.getBatteryLevel());
    localContentValues.put(a.e, paramBatteryOverDischange.getVoltage());
    localContentValues.put(a.f, paramBatteryOverDischange.getBatteryCurrent());
    localContentValues.put(a.g, paramBatteryOverDischange.getTemperature());
    localContentValues.put(a.h, paramBatteryOverDischange.getBatteryFull());
    localContentValues.put(a.i, paramBatteryOverDischange.getBatteryOne());
    localContentValues.put(a.j, paramBatteryOverDischange.getBatteryTwo());
    localContentValues.put(a.k, paramBatteryOverDischange.getBatteryThree());
    localContentValues.put(a.l, paramBatteryOverDischange.getBatteryFour());
    localContentValues.put(a.m, paramBatteryOverDischange.getBatteryRecyle());
    localContentValues.put(a.n, paramBatteryOverDischange.getVersion());
    localContentValues.put(a.o, paramBatteryOverDischange.getAppType());
    localContentValues.put(a.p, paramBatteryOverDischange.getAppType());
    localContentValues.put(a.s, paramBatteryOverDischange.getCurElectric());
    localContentValues.put(a.q, paramBatteryOverDischange.getFcVersion());
    localContentValues.put(a.r, paramBatteryOverDischange.getUpdateTimes());
    return localContentValues;
  }
  
  public long a(BatteryOverDischange paramBatteryOverDischange)
  {
    paramBatteryOverDischange = b(paramBatteryOverDischange);
    return this.d.insert(a.a, null, paramBatteryOverDischange);
  }
  
  public List<BatteryOverDischange> a()
  {
    Object localObject1 = "select * from " + a.a;
    Object localObject2 = this.c.getWritableDatabase();
    ArrayList localArrayList = new ArrayList();
    localObject1 = ((SQLiteDatabase)localObject2).rawQuery((String)localObject1, null);
    while (((Cursor)localObject1).moveToNext())
    {
      localObject2 = new BatteryOverDischange();
      ((BatteryOverDischange)localObject2).setUserId(((Cursor)localObject1).getString(((Cursor)localObject1).getColumnIndex(a.b)));
      ((BatteryOverDischange)localObject2).setBatteryId(((Cursor)localObject1).getString(((Cursor)localObject1).getColumnIndex(a.c)));
      ((BatteryOverDischange)localObject2).setBatteryLevel(((Cursor)localObject1).getString(((Cursor)localObject1).getColumnIndex(a.d)));
      ((BatteryOverDischange)localObject2).setVoltage(((Cursor)localObject1).getString(((Cursor)localObject1).getColumnIndex(a.e)));
      ((BatteryOverDischange)localObject2).setBatteryCurrent(((Cursor)localObject1).getString(((Cursor)localObject1).getColumnIndex(a.f)));
      ((BatteryOverDischange)localObject2).setTemperature(((Cursor)localObject1).getString(((Cursor)localObject1).getColumnIndex(a.g)));
      ((BatteryOverDischange)localObject2).setBatteryFull(((Cursor)localObject1).getString(((Cursor)localObject1).getColumnIndex(a.h)));
      ((BatteryOverDischange)localObject2).setBatteryOne(((Cursor)localObject1).getString(((Cursor)localObject1).getColumnIndex(a.i)));
      ((BatteryOverDischange)localObject2).setBatteryTwo(((Cursor)localObject1).getString(((Cursor)localObject1).getColumnIndex(a.j)));
      ((BatteryOverDischange)localObject2).setBatteryThree(((Cursor)localObject1).getString(((Cursor)localObject1).getColumnIndex(a.k)));
      ((BatteryOverDischange)localObject2).setBatteryFour(((Cursor)localObject1).getString(((Cursor)localObject1).getColumnIndex(a.l)));
      ((BatteryOverDischange)localObject2).setBatteryRecyle(((Cursor)localObject1).getString(((Cursor)localObject1).getColumnIndex(a.m)));
      ((BatteryOverDischange)localObject2).setVersion(((Cursor)localObject1).getString(((Cursor)localObject1).getColumnIndex(a.n)));
      ((BatteryOverDischange)localObject2).setAppType(((Cursor)localObject1).getString(((Cursor)localObject1).getColumnIndex(a.o)));
      ((BatteryOverDischange)localObject2).setAccidentType(((Cursor)localObject1).getInt(((Cursor)localObject1).getColumnIndex(a.p)));
      ((BatteryOverDischange)localObject2).setCurElectric(((Cursor)localObject1).getString(((Cursor)localObject1).getColumnIndex(a.s)));
      ((BatteryOverDischange)localObject2).setFcVersion(((Cursor)localObject1).getString(((Cursor)localObject1).getColumnIndex(a.q)));
      ((BatteryOverDischange)localObject2).setUpdateTimes(((Cursor)localObject1).getString(((Cursor)localObject1).getColumnIndex(a.r)));
      localArrayList.add(localObject2);
    }
    return localArrayList;
  }
  
  public boolean b()
  {
    return this.d.delete(a.a, null, null) > 0;
  }
  
  public long c()
  {
    this.d = this.c.getReadableDatabase();
    Cursor localCursor = this.d.rawQuery("select count(*)from" + a.a, null);
    localCursor.moveToFirst();
    return localCursor.getLong(0);
  }
  
  static class a
  {
    public static String a = "battery_over_dischange_tb";
    public static String b = "user_id";
    public static String c = "battery_id";
    public static String d = "battery_level";
    public static String e = "voltage";
    public static String f = "battery_current";
    public static String g = "temperature";
    public static String h = "battery_full";
    public static String i = "battery_one";
    public static String j = "battery_two";
    public static String k = "battery_three";
    public static String l = "battery_four";
    public static String m = "battery_recyle";
    public static String n = "version";
    public static String o = "appType";
    public static String p = "accidentType";
    public static String q = "fc_version";
    public static String r = "update_size";
    public static String s = "current";
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/utils/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */