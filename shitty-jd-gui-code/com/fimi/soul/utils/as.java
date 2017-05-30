package com.fimi.soul.utils;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.fimi.soul.drone.e.b;
import com.fimi.soul.drone.h.ba;
import com.fimi.soul.entity.UpdateDroneItem;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class as
{
  public static final String a = "route";
  public static final String b = "flydata";
  private static final String f = "waypoint";
  private static final String g = "latitude";
  private static final String h = "longitude";
  private static final String i = "height";
  private static final String j = "sequence";
  private static final String k = "link";
  private static final String l = "type";
  private static final String m = "flyOver";
  private static final String n = "create table if not exists route (id integer primary key autoincrement,planeID varchar(30),record_time varchar(30),user_id long,year integer,month integer,distance double,sportTime double,maxhight double,endddata varchar(30),uploadurl text,flag integer);";
  private static final String o = "create table if not exists flydata(id integer primary key autoincrement,user_id long,latitude double,longitude double,record_time varchar(30),altitude double,distance double,speed double,model text,sporttime doule,satellitenum integer,endddata varchar(30));";
  private static final String p = "create table if not exists flyid(id integer primary key autoincrement,user_id long,cloud_deck_ID text,receiver_control_ID text,fly_control_ID text,remote_control_ID text);";
  private static final String q = "create table if not exists waypoint (latitude double ,longitude double ,height integer ,sequence integer ,link bit ,type integer ,flyOver bit );";
  private static final String r = "latitude,longitude,height,sequence,link,type,flyOver";
  private i c;
  private SQLiteDatabase d;
  private Context e;
  
  public as(Context paramContext)
  {
    this.c = i.a(paramContext);
    this.e = paramContext;
  }
  
  private ContentValues a(ba paramba)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("flyOver", Integer.valueOf(paramba.g()));
    localContentValues.put("height", Integer.valueOf(paramba.c()));
    localContentValues.put("latitude", Double.valueOf(paramba.b().a));
    localContentValues.put("longitude", Double.valueOf(paramba.b().b));
    localContentValues.put("link", Integer.valueOf(paramba.e()));
    localContentValues.put("sequence", Integer.valueOf(paramba.d()));
    localContentValues.put("type", Integer.valueOf(paramba.f()));
    return localContentValues;
  }
  
  private ba a(Cursor paramCursor)
  {
    ba localba = new ba();
    localba.e(paramCursor.getInt(paramCursor.getColumnIndex("flyOver")));
    localba.a(paramCursor.getInt(paramCursor.getColumnIndex("height")));
    double d1 = paramCursor.getDouble(paramCursor.getColumnIndex("longitude"));
    localba.a(new LatLng(paramCursor.getDouble(paramCursor.getColumnIndex("latitude")), d1));
    localba.b(paramCursor.getInt(paramCursor.getColumnIndex("sequence")));
    localba.d(paramCursor.getInt(paramCursor.getColumnIndex("type")));
    localba.c(paramCursor.getInt(paramCursor.getColumnIndex("link")));
    return localba;
  }
  
  public static void a(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("create table if not exists waypoint (latitude double ,longitude double ,height integer ,sequence integer ,link bit ,type integer ,flyOver bit );");
    paramSQLiteDatabase.execSQL("create table if not exists route (id integer primary key autoincrement,planeID varchar(30),record_time varchar(30),user_id long,year integer,month integer,distance double,sportTime double,maxhight double,endddata varchar(30),uploadurl text,flag integer);");
    paramSQLiteDatabase.execSQL("create table if not exists flydata(id integer primary key autoincrement,user_id long,latitude double,longitude double,record_time varchar(30),altitude double,distance double,speed double,model text,sporttime doule,satellitenum integer,endddata varchar(30));");
    paramSQLiteDatabase.execSQL("create table if not exists flyid(id integer primary key autoincrement,user_id long,cloud_deck_ID text,receiver_control_ID text,fly_control_ID text,remote_control_ID text);");
  }
  
  public int a(ContentValues paramContentValues, String paramString)
  {
    this.d = this.c.getWritableDatabase();
    long l1 = this.d.insert(paramString, null, paramContentValues);
    this.d.close();
    return Long.valueOf(l1).intValue();
  }
  
  public int a(String paramString, int paramInt)
  {
    this.d = this.c.getWritableDatabase();
    paramInt = this.d.delete(paramString, "id=?", new String[] { Integer.toString(paramInt) });
    this.d.close();
    return paramInt;
  }
  
  public int a(String paramString1, ContentValues paramContentValues, String paramString2, String paramString3)
  {
    this.d = this.c.getWritableDatabase();
    int i1 = this.d.update(paramString1, paramContentValues, "record_time=? and user_id=?", new String[] { paramString2, paramString3 });
    this.d.close();
    return i1;
  }
  
  public int a(String paramString1, UpdateDroneItem paramUpdateDroneItem, String paramString2)
  {
    this.d = this.c.getWritableDatabase();
    int i1 = this.d.delete(paramString1, "record_time=? and user_id=?", new String[] { paramUpdateDroneItem.getRecord_time(), paramString2 });
    this.d.close();
    return i1;
  }
  
  public int a(String paramString1, List<UpdateDroneItem> paramList, String paramString2)
  {
    this.d = this.c.getWritableDatabase();
    paramList = paramList.iterator();
    int i1 = 0;
    if (paramList.hasNext())
    {
      UpdateDroneItem localUpdateDroneItem = (UpdateDroneItem)paramList.next();
      if (this.d.delete(paramString1, "record_time=? and user_id=?", new String[] { localUpdateDroneItem.getRecord_time(), paramString2 }) != 1) {
        break label90;
      }
      i1 += 1;
    }
    label90:
    for (;;)
    {
      break;
      this.d.close();
      return i1;
    }
  }
  
  public List<b> a(String paramString)
  {
    b localb = null;
    this.d = this.c.getWritableDatabase();
    Cursor localCursor = this.d.rawQuery(paramString, null);
    paramString = localb;
    if (localCursor.getCount() > 0)
    {
      paramString = new ArrayList();
      while (localCursor.moveToNext())
      {
        localb = new b();
        localb.a(localCursor.getDouble(localCursor.getColumnIndex("latitude")));
        localb.b(localCursor.getDouble(localCursor.getColumnIndex("longitude")));
        localb.c(localCursor.getDouble(localCursor.getColumnIndex("altitude")));
        localb.a(localCursor.getString(localCursor.getColumnIndex("record_time")));
        localb.d(localCursor.getDouble(localCursor.getColumnIndex("distance")));
        localb.e(localCursor.getDouble(localCursor.getColumnIndex("speed")));
        localb.b(localCursor.getString(localCursor.getColumnIndex("model")));
        localb.f(localCursor.getDouble(localCursor.getColumnIndex("sporttime")));
        localb.a(localCursor.getInt(localCursor.getColumnIndex("satellitenum")));
        localb.c(localCursor.getString(localCursor.getColumnIndex("endddata")));
        paramString.add(localb);
      }
      localCursor.close();
      this.d.close();
    }
    return paramString;
  }
  
  public List<UpdateDroneItem> a(String paramString1, String paramString2)
  {
    UpdateDroneItem localUpdateDroneItem = null;
    if (paramString2 == null) {
      return null;
    }
    this.d = this.c.getWritableDatabase();
    paramString2 = this.d.query(paramString1, null, "user_id=?", new String[] { paramString2 }, null, null, "month");
    paramString1 = localUpdateDroneItem;
    if (paramString2.getCount() > 0) {
      paramString1 = new ArrayList();
    }
    while (paramString2.moveToNext())
    {
      localUpdateDroneItem = new UpdateDroneItem();
      localUpdateDroneItem.setDistance(paramString2.getDouble(paramString2.getColumnIndex("distance")));
      localUpdateDroneItem.setEndddata(paramString2.getString(paramString2.getColumnIndex("endddata")));
      localUpdateDroneItem.setMaxhight(paramString2.getDouble(paramString2.getColumnIndex("maxhight")));
      localUpdateDroneItem.setMonth(paramString2.getInt(paramString2.getColumnIndex("month")));
      localUpdateDroneItem.setRecord_time(paramString2.getString(paramString2.getColumnIndex("record_time")));
      localUpdateDroneItem.setSportTime(paramString2.getDouble(paramString2.getColumnIndex("sportTime")));
      localUpdateDroneItem.setUploadurl(paramString2.getString(paramString2.getColumnIndex("uploadurl")));
      localUpdateDroneItem.setUser_id(paramString2.getLong(paramString2.getColumnIndex("user_id")));
      localUpdateDroneItem.setUser_id(paramString2.getLong(paramString2.getColumnIndex("planeID")));
      localUpdateDroneItem.setYear(paramString2.getInt(paramString2.getColumnIndex("year")));
      localUpdateDroneItem.setFlag(paramString2.getInt(paramString2.getColumnIndex("flag")));
      localUpdateDroneItem.setPlaneID(paramString2.getLong(paramString2.getColumnIndex("planeID")) + "");
      paramString1.add(localUpdateDroneItem);
    }
    paramString2.close();
    this.d.close();
    return paramString1;
  }
  
  public void a()
  {
    this.d = this.c.getWritableDatabase();
    this.d.execSQL("delete from waypoint");
    this.d.close();
  }
  
  public void a(List<ba> paramList)
  {
    a();
    this.d = this.c.getWritableDatabase();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      ba localba = (ba)paramList.next();
      this.d.insert("waypoint", null, a(localba));
    }
    this.d.close();
  }
  
  public void a(List<ContentValues> paramList, String paramString)
  {
    Log.e("查数据", "fdfdfdfdfdfd");
    this.d = this.c.getWritableDatabase();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      ContentValues localContentValues = (ContentValues)paramList.next();
      this.d.insert(paramString, null, localContentValues);
    }
    this.d.close();
  }
  
  public int b(String paramString1, String paramString2)
  {
    int i1 = 0;
    this.d = this.c.getWritableDatabase();
    paramString1 = this.d.rawQuery(paramString1, null);
    while (paramString1.moveToNext()) {
      i1 = paramString1.getInt(paramString1.getColumnIndex(paramString2));
    }
    paramString1.close();
    this.d.close();
    return i1;
  }
  
  public List<ba> b()
  {
    this.d = this.c.getReadableDatabase();
    ArrayList localArrayList2 = new ArrayList();
    Cursor localCursor = this.d.rawQuery("select latitude,longitude,height,sequence,link,type,flyOver from waypoint", null);
    if (localCursor.getCount() > 0)
    {
      localCursor.moveToFirst();
      for (;;)
      {
        localArrayList1 = localArrayList2;
        if (localCursor.isAfterLast()) {
          break;
        }
        localArrayList2.add(a(localCursor));
        localCursor.moveToNext();
      }
    }
    ArrayList localArrayList1 = null;
    localCursor.close();
    this.c.close();
    this.d.close();
    return localArrayList1;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/utils/as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */