package com.fimi.soul.utils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import com.fimi.soul.utils.a.a;
import com.fimi.soul.utils.a.a.a;

public class i
  extends SQLiteOpenHelper
{
  public static i a;
  private static final String b = "miplaner";
  private static final int c = 8;
  private Context d;
  
  private i(Context paramContext, String paramString, SQLiteDatabase.CursorFactory paramCursorFactory, int paramInt)
  {
    super(paramContext, "miplaner", paramCursorFactory, 8);
    this.d = paramContext;
  }
  
  public static i a(Context paramContext)
  {
    if (a == null) {
      a = new i(paramContext, null, null, 0);
    }
    return a;
  }
  
  public void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    as.a(paramSQLiteDatabase);
    paramSQLiteDatabase.execSQL(t.b);
    paramSQLiteDatabase.execSQL(d.b);
    paramSQLiteDatabase.execSQL("create table  if not exists history_push_message(orderId int auto_increment primary key ,url varchar(600) ,title varchar(20) ,payload varchar(20) ,id varchar(20) ,msgType varchar(20) ,passThrough varchar(20) ,statue varchar(20) ,time varchar(20))");
    paramSQLiteDatabase.execSQL(a.a);
  }
  
  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return;
    case 1: 
      paramSQLiteDatabase.execSQL("drop table if exists flyRecord_tb");
      paramSQLiteDatabase.execSQL(t.b);
      paramSQLiteDatabase.execSQL(d.b);
    case 2: 
      paramSQLiteDatabase.execSQL("drop table if exists battery_over_dischange_tb");
      paramSQLiteDatabase.execSQL(d.b);
      paramSQLiteDatabase.execSQL("drop table if exists flyRecord_tb");
      paramSQLiteDatabase.execSQL(t.b);
    case 3: 
      paramSQLiteDatabase.execSQL("drop table if exists flyRecord_tb");
      paramSQLiteDatabase.execSQL(t.b);
    case 4: 
      paramSQLiteDatabase.execSQL("drop table if exists history_push_message");
      paramSQLiteDatabase.execSQL("create table  if not exists history_push_message(orderId int auto_increment primary key ,url varchar(600) ,title varchar(20) ,payload varchar(20) ,id varchar(20) ,msgType varchar(20) ,passThrough varchar(20) ,statue varchar(20) ,time varchar(20))");
      paramSQLiteDatabase.execSQL("drop table if exists " + a.a.a);
      paramSQLiteDatabase.execSQL(a.a);
    case 5: 
      paramSQLiteDatabase.execSQL("drop table if exists history_push_message");
      paramSQLiteDatabase.execSQL("create table  if not exists history_push_message(orderId int auto_increment primary key ,url varchar(600) ,title varchar(20) ,payload varchar(20) ,id varchar(20) ,msgType varchar(20) ,passThrough varchar(20) ,statue varchar(20) ,time varchar(20))");
    case 6: 
      paramSQLiteDatabase.execSQL("drop table if exists history_push_message");
      paramSQLiteDatabase.execSQL("create table  if not exists history_push_message(orderId int auto_increment primary key ,url varchar(600) ,title varchar(20) ,payload varchar(20) ,id varchar(20) ,msgType varchar(20) ,passThrough varchar(20) ,statue varchar(20) ,time varchar(20))");
    }
    paramSQLiteDatabase.execSQL("alter table " + d.a.a + " add " + d.a.q + " varchar(20)");
    paramSQLiteDatabase.execSQL("alter table " + d.a.a + " add " + d.a.s + " varchar(20)");
    paramSQLiteDatabase.execSQL("alter table " + d.a.a + " add " + d.a.r + " varchar(20)");
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/utils/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */