package com.fimi.soul.utils.a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.fimi.soul.entity.BatteryUpdateSize;
import com.fimi.soul.utils.i;

public class a
{
  public static final String a = "create table  if not exists " + a.a + "(" + a.b + " INTEGER ," + a.c + " varchar(20) not null ," + a.d + " INTEGER)";
  private static a e;
  private Context b;
  private i c;
  private SQLiteDatabase d;
  
  private a(Context paramContext)
  {
    this.b = paramContext;
    this.c = i.a(paramContext);
  }
  
  public static a a(Context paramContext)
  {
    if (e == null) {
      e = new a(paramContext.getApplicationContext());
    }
    return e;
  }
  
  public long a(BatteryUpdateSize paramBatteryUpdateSize)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put(a.b, paramBatteryUpdateSize.getBatteryId());
    localContentValues.put(a.c, Integer.valueOf(paramBatteryUpdateSize.getBatteryUpdateSize()));
    localContentValues.put(a.d, Integer.valueOf(paramBatteryUpdateSize.getMessageHintSize()));
    this.d = this.c.getWritableDatabase();
    return this.d.insert(a.a, null, localContentValues);
  }
  
  public BatteryUpdateSize b(BatteryUpdateSize paramBatteryUpdateSize)
  {
    this.d = this.c.getWritableDatabase();
    Cursor localCursor = this.d.rawQuery("select * from " + a.a + " where " + a.b + "=? and " + a.c + "=?", new String[] { paramBatteryUpdateSize.getBatteryId(), String.valueOf(paramBatteryUpdateSize.getBatteryUpdateSize()) });
    paramBatteryUpdateSize = null;
    if (localCursor.moveToFirst()) {
      do
      {
        paramBatteryUpdateSize = new BatteryUpdateSize();
        paramBatteryUpdateSize.setBatteryId(localCursor.getString(localCursor.getColumnIndex(a.b)));
        paramBatteryUpdateSize.setBatteryUpdateSize(localCursor.getInt(localCursor.getColumnIndex(a.c)));
        paramBatteryUpdateSize.setMessageHintSize(localCursor.getInt(localCursor.getColumnIndex(a.d)));
      } while (localCursor.moveToNext());
    }
    return paramBatteryUpdateSize;
  }
  
  public int c(BatteryUpdateSize paramBatteryUpdateSize)
  {
    this.d = this.c.getWritableDatabase();
    ContentValues localContentValues = new ContentValues();
    localContentValues.put(a.d, Integer.valueOf(paramBatteryUpdateSize.getMessageHintSize()));
    try
    {
      int i = this.d.update(a.a, localContentValues, a.b + "=? and " + a.c + "=?", new String[] { paramBatteryUpdateSize.getBatteryId(), String.valueOf(paramBatteryUpdateSize.getBatteryUpdateSize()) });
      return i;
    }
    catch (Exception paramBatteryUpdateSize)
    {
      paramBatteryUpdateSize.printStackTrace();
    }
    return 0;
  }
  
  public int d(BatteryUpdateSize paramBatteryUpdateSize)
  {
    this.d = this.c.getWritableDatabase();
    return this.d.delete(a.a, a.b + "=?", new String[] { paramBatteryUpdateSize.getBatteryId() });
  }
  
  public static class a
  {
    public static String a = "battery_update_size";
    public static String b = "battery_id";
    public static String c = "battery_update_size";
    public static String d = "message_hint_size";
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/utils/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */