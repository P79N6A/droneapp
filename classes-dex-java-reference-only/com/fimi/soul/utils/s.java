package com.fimi.soul.utils;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.fimi.soul.entity.FlyModeLog;
import java.util.ArrayList;
import java.util.List;

public class s
{
  public static s a;
  private i b;
  private SQLiteDatabase c;
  private Context d;
  private final String e = "create table  if not exists " + a.a + "(" + a.b + " varchar(20) not null ," + a.c + " varchar(20) not null ," + a.d + " varchar(20) not null ," + a.e + " varchar(20) not null ," + a.f + " varchar(20) not null ," + a.g + " varchar(20) not null)";
  
  public s(Context paramContext)
  {
    this.d = paramContext;
    this.b = i.a(paramContext);
    this.c = this.b.getWritableDatabase();
    this.c.execSQL(this.e);
  }
  
  public static s a(Context paramContext)
  {
    if (a == null) {
      a = new s(paramContext);
    }
    return a;
  }
  
  private ContentValues b(FlyModeLog paramFlyModeLog)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put(a.b, paramFlyModeLog.getUserID());
    localContentValues.put(a.c, paramFlyModeLog.getFcVersion());
    localContentValues.put(a.d, paramFlyModeLog.getOpenType());
    localContentValues.put(a.e, paramFlyModeLog.getApplyTime());
    localContentValues.put(a.f, paramFlyModeLog.getX2Version());
    localContentValues.put(a.g, paramFlyModeLog.getAppType());
    return localContentValues;
  }
  
  public long a(FlyModeLog paramFlyModeLog)
  {
    paramFlyModeLog = b(paramFlyModeLog);
    return this.c.insert(a.a, null, paramFlyModeLog);
  }
  
  public List<FlyModeLog> a()
  {
    Object localObject1 = "select * from " + a.a;
    Object localObject2 = this.b.getWritableDatabase();
    ArrayList localArrayList = new ArrayList();
    localObject1 = ((SQLiteDatabase)localObject2).rawQuery((String)localObject1, null);
    while (((Cursor)localObject1).moveToNext())
    {
      localObject2 = new FlyModeLog();
      ((FlyModeLog)localObject2).setUserID(((Cursor)localObject1).getString(((Cursor)localObject1).getColumnIndex(a.b)));
      ((FlyModeLog)localObject2).setFcVersion(((Cursor)localObject1).getString(((Cursor)localObject1).getColumnIndex(a.c)));
      ((FlyModeLog)localObject2).setOpenType(((Cursor)localObject1).getString(((Cursor)localObject1).getColumnIndex(a.d)));
      ((FlyModeLog)localObject2).setApplyTime(((Cursor)localObject1).getString(((Cursor)localObject1).getColumnIndex(a.e)));
      ((FlyModeLog)localObject2).setX2Version(((Cursor)localObject1).getString(((Cursor)localObject1).getColumnIndex(a.f)));
      ((FlyModeLog)localObject2).setAppType(((Cursor)localObject1).getString(((Cursor)localObject1).getColumnIndex(a.g)));
      localArrayList.add(localObject2);
    }
    return localArrayList;
  }
  
  public boolean b()
  {
    return this.c.delete(a.a, null, null) > 0;
  }
  
  public long c()
  {
    this.c = this.b.getReadableDatabase();
    Cursor localCursor = this.c.rawQuery("select count(*)from" + a.a, null);
    localCursor.moveToFirst();
    return localCursor.getLong(0);
  }
  
  static class a
  {
    public static String a = "fly_mode_log_tb";
    public static String b = "userID";
    public static String c = "fcVersion";
    public static String d = "openType";
    public static String e = "applyTime";
    public static String f = "x2Version";
    public static String g = "appType";
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/utils/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */