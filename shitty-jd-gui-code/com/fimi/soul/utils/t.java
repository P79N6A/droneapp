package com.fimi.soul.utils;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;

public class t
{
  public static t a;
  public static final String b = "create table  if not exists " + a.a + "(" + a.b + " varchar(20) not null ," + a.c + " long default 0 ," + a.d + " double default 0," + a.e + " varchar(20) not null)";
  private i c;
  private SQLiteDatabase d;
  private Context e;
  
  public t(Context paramContext)
  {
    this.e = paramContext;
    this.c = i.a(paramContext);
    this.d = this.c.getWritableDatabase();
  }
  
  public static t a(Context paramContext)
  {
    if (a == null) {
      a = new t(paramContext);
    }
    return a;
  }
  
  private ContentValues b(u paramu)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put(a.c, Long.valueOf(paramu.c()));
    localContentValues.put(a.d, Double.valueOf(paramu.d()));
    localContentValues.put(a.b, paramu.b());
    localContentValues.put(a.e, paramu.a());
    return localContentValues;
  }
  
  public List<u> a(String paramString)
  {
    if ((paramString == null) || ("".equals(paramString))) {}
    Object localObject1;
    Object localObject3;
    do
    {
      return null;
      localObject1 = this.d;
      localObject2 = a.a;
      localObject3 = a.e;
      String str1 = a.b;
      String str2 = a.c;
      String str3 = a.d;
      String str4 = a.e + " = ? ";
      localObject1 = ((SQLiteDatabase)localObject1).query((String)localObject2, new String[] { localObject3, str1, str2, str3 }, str4, new String[] { paramString }, null, null, null);
    } while ((localObject1 == null) || (((Cursor)localObject1).getCount() <= 0));
    Object localObject2 = new ArrayList();
    ((Cursor)localObject1).moveToFirst();
    do
    {
      localObject3 = new u();
      ((u)localObject3).a(paramString);
      ((u)localObject3).a(((Cursor)localObject1).getLong(((Cursor)localObject1).getColumnIndex(a.c)));
      ((u)localObject3).a(((Cursor)localObject1).getDouble(((Cursor)localObject1).getColumnIndex(a.d)));
      ((List)localObject2).add(localObject3);
    } while (((Cursor)localObject1).moveToNext());
    return (List<u>)localObject2;
  }
  
  public void a(u paramu)
  {
    paramu = b(paramu);
    this.d.insert(a.a, null, paramu);
  }
  
  public boolean b(String paramString)
  {
    boolean bool = true;
    if ((paramString == null) || ("".equals(paramString))) {
      bool = false;
    }
    while (this.d.delete(a.a, a.e + " = ? ", new String[] { paramString }) > 0) {
      return bool;
    }
    return false;
  }
  
  static class a
  {
    public static String a = "flyRecords_tb";
    public static String b = "drone_id";
    public static String c = "fly_time";
    public static String d = "fly_distance";
    public static String e = "user_id";
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/utils/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */