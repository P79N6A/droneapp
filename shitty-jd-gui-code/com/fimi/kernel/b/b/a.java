package com.fimi.kernel.b.b;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

class a
  extends SQLiteOpenHelper
{
  public a(Context paramContext)
  {
    super(paramContext, "download.db", null, 4);
  }
  
  public void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("create table download_info(_id integer PRIMARY KEY AUTOINCREMENT, thread_id integer, start_pos long, end_pos long, compelete_size long,url char)");
    paramSQLiteDatabase.execSQL("create table download_task(_id integer PRIMARY KEY AUTOINCREMENT, url char,local_uri char,file_size int,dur char)");
  }
  
  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return;
    }
    try
    {
      paramSQLiteDatabase.execSQL("drop table if exists download_info");
      paramSQLiteDatabase.execSQL("drop table if exists download_task");
      onCreate(paramSQLiteDatabase);
    }
    catch (SQLException localSQLException1)
    {
      try
      {
        for (;;)
        {
          paramSQLiteDatabase.execSQL("drop table if exists download_info");
          paramSQLiteDatabase.execSQL("drop table if exists download_task");
          onCreate(paramSQLiteDatabase);
          try
          {
            paramSQLiteDatabase.execSQL("alter table download_task colum dur char");
            return;
          }
          catch (SQLException paramSQLiteDatabase)
          {
            paramSQLiteDatabase.printStackTrace();
            return;
          }
          localSQLException1 = localSQLException1;
          localSQLException1.printStackTrace();
        }
      }
      catch (SQLException localSQLException2)
      {
        for (;;)
        {
          localSQLException2.printStackTrace();
        }
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/kernel/b/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */