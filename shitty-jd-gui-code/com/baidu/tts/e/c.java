package com.baidu.tts.e;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.List;

public class c
{
  private static c e;
  private a a;
  private SQLiteDatabase b;
  private volatile boolean c = false;
  private Context d;
  
  private c(Context paramContext)
  {
    this.d = paramContext;
  }
  
  public static c a(Context paramContext)
  {
    if (e == null) {}
    try
    {
      if (e == null) {
        e = new c(paramContext);
      }
      return e;
    }
    finally {}
  }
  
  public static void e()
  {
    if (e != null) {
      try
      {
        if (e != null) {
          e = null;
        }
        return;
      }
      finally {}
    }
  }
  
  /* Error */
  public void a()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 35	com/baidu/tts/e/c:a	Lcom/baidu/tts/e/c$a;
    //   6: ifnonnull +30 -> 36
    //   9: aload_0
    //   10: new 6	com/baidu/tts/e/c$a
    //   13: dup
    //   14: aload_0
    //   15: aload_0
    //   16: getfield 25	com/baidu/tts/e/c:d	Landroid/content/Context;
    //   19: invokespecial 38	com/baidu/tts/e/c$a:<init>	(Lcom/baidu/tts/e/c;Landroid/content/Context;)V
    //   22: putfield 35	com/baidu/tts/e/c:a	Lcom/baidu/tts/e/c$a;
    //   25: aload_0
    //   26: aload_0
    //   27: getfield 35	com/baidu/tts/e/c:a	Lcom/baidu/tts/e/c$a;
    //   30: invokevirtual 42	com/baidu/tts/e/c$a:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   33: putfield 44	com/baidu/tts/e/c:b	Landroid/database/sqlite/SQLiteDatabase;
    //   36: aload_0
    //   37: monitorexit
    //   38: return
    //   39: astore_1
    //   40: aload_0
    //   41: iconst_1
    //   42: putfield 23	com/baidu/tts/e/c:c	Z
    //   45: goto -9 -> 36
    //   48: astore_1
    //   49: aload_0
    //   50: monitorexit
    //   51: aload_1
    //   52: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	53	0	this	c
    //   39	1	1	localThrowable	Throwable
    //   48	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   25	36	39	java/lang/Throwable
    //   2	25	48	finally
    //   25	36	48	finally
    //   40	45	48	finally
  }
  
  public void a(long paramLong, int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("time", Long.valueOf(paramLong));
    localContentValues.put("code", Integer.valueOf(paramInt1));
    localContentValues.put("cmd_type", Integer.valueOf(paramInt2));
    localContentValues.put("cmd_id", Integer.valueOf(paramInt3));
    localContentValues.put("result", paramString);
    this.b.insert("result", null, localContentValues);
  }
  
  public void a(List<Integer> paramList)
  {
    if ((paramList == null) || (paramList.size() == 0)) {}
    String str;
    do
    {
      return;
      str = "";
      int i = 0;
      while (i < paramList.size())
      {
        str = str + paramList.get(i) + ",";
        i += 1;
      }
    } while (str.length() <= 0);
    paramList = str.substring(0, str.length() - 1);
    this.b.delete("result", "_id in (" + paramList + ")", null);
  }
  
  public Cursor b()
  {
    Cursor localCursor = null;
    if (this.b != null) {
      localCursor = this.b.query("result", new String[] { "_id", "time", "code", "cmd_type", "cmd_id", "result" }, null, null, null, null, null);
    }
    return localCursor;
  }
  
  public void c()
  {
    try
    {
      if (this.d != null)
      {
        this.a.close();
        this.a = null;
        this.d = null;
        this.c = true;
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public boolean d()
  {
    return this.c;
  }
  
  class a
    extends SQLiteOpenHelper
  {
    public a(Context paramContext)
    {
      super("ttsdata", null, 1);
    }
    
    public void onCreate(SQLiteDatabase paramSQLiteDatabase)
    {
      paramSQLiteDatabase.execSQL("create table result (_id integer primary key autoincrement, time text, code integer, cmd_type integer, cmd_id integer, result text);");
    }
    
    public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
    {
      paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS result");
      onCreate(paramSQLiteDatabase);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/baidu/tts/e/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */