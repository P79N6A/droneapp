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
import com.tencent.mm.sdk.conversation.RConversation;
import java.util.ArrayList;
import java.util.List;

public class as {
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

    public as(Context context) {
        this.c = i.a(context);
        this.e = context;
    }

    private ContentValues a(ba baVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(m, Integer.valueOf(baVar.g()));
        contentValues.put("height", Integer.valueOf(baVar.c()));
        contentValues.put(g, Double.valueOf(baVar.b().a));
        contentValues.put(h, Double.valueOf(baVar.b().b));
        contentValues.put(k, Integer.valueOf(baVar.e()));
        contentValues.put(j, Integer.valueOf(baVar.d()));
        contentValues.put("type", Integer.valueOf(baVar.f()));
        return contentValues;
    }

    private ba a(Cursor cursor) {
        ba baVar = new ba();
        baVar.e(cursor.getInt(cursor.getColumnIndex(m)));
        baVar.a(cursor.getInt(cursor.getColumnIndex("height")));
        baVar.a(new LatLng(cursor.getDouble(cursor.getColumnIndex(g)), cursor.getDouble(cursor.getColumnIndex(h))));
        baVar.b(cursor.getInt(cursor.getColumnIndex(j)));
        baVar.d(cursor.getInt(cursor.getColumnIndex("type")));
        baVar.c(cursor.getInt(cursor.getColumnIndex(k)));
        return baVar;
    }

    public static void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(q);
        sQLiteDatabase.execSQL(n);
        sQLiteDatabase.execSQL(o);
        sQLiteDatabase.execSQL(p);
    }

    public int a(ContentValues contentValues, String str) {
        this.d = this.c.getWritableDatabase();
        Long valueOf = Long.valueOf(this.d.insert(str, null, contentValues));
        this.d.close();
        return valueOf.intValue();
    }

    public int a(String str, int i) {
        this.d = this.c.getWritableDatabase();
        int delete = this.d.delete(str, "id=?", new String[]{Integer.toString(i)});
        this.d.close();
        return delete;
    }

    public int a(String str, ContentValues contentValues, String str2, String str3) {
        this.d = this.c.getWritableDatabase();
        int update = this.d.update(str, contentValues, "record_time=? and user_id=?", new String[]{str2, str3});
        this.d.close();
        return update;
    }

    public int a(String str, UpdateDroneItem updateDroneItem, String str2) {
        this.d = this.c.getWritableDatabase();
        int delete = this.d.delete(str, "record_time=? and user_id=?", new String[]{updateDroneItem.getRecord_time(), str2});
        this.d.close();
        return delete;
    }

    public int a(String str, List<UpdateDroneItem> list, String str2) {
        this.d = this.c.getWritableDatabase();
        int i = 0;
        for (UpdateDroneItem updateDroneItem : list) {
            i = this.d.delete(str, "record_time=? and user_id=?", new String[]{updateDroneItem.getRecord_time(), str2}) == 1 ? i + 1 : i;
        }
        this.d.close();
        return i;
    }

    public List<b> a(String str) {
        List<b> list = null;
        this.d = this.c.getWritableDatabase();
        Cursor rawQuery = this.d.rawQuery(str, null);
        if (rawQuery.getCount() > 0) {
            list = new ArrayList();
            while (rawQuery.moveToNext()) {
                b bVar = new b();
                bVar.a(rawQuery.getDouble(rawQuery.getColumnIndex(g)));
                bVar.b(rawQuery.getDouble(rawQuery.getColumnIndex(h)));
                bVar.c(rawQuery.getDouble(rawQuery.getColumnIndex("altitude")));
                bVar.a(rawQuery.getString(rawQuery.getColumnIndex("record_time")));
                bVar.d(rawQuery.getDouble(rawQuery.getColumnIndex("distance")));
                bVar.e(rawQuery.getDouble(rawQuery.getColumnIndex("speed")));
                bVar.b(rawQuery.getString(rawQuery.getColumnIndex("model")));
                bVar.f(rawQuery.getDouble(rawQuery.getColumnIndex("sporttime")));
                bVar.a(rawQuery.getInt(rawQuery.getColumnIndex("satellitenum")));
                bVar.c(rawQuery.getString(rawQuery.getColumnIndex("endddata")));
                list.add(bVar);
            }
            rawQuery.close();
            this.d.close();
        }
        return list;
    }

    public List<UpdateDroneItem> a(String str, String str2) {
        List<UpdateDroneItem> list = null;
        if (str2 != null) {
            this.d = this.c.getWritableDatabase();
            String str3 = str;
            Cursor query = this.d.query(str3, null, "user_id=?", new String[]{str2}, null, null, "month");
            if (query.getCount() > 0) {
                list = new ArrayList();
            }
            while (query.moveToNext()) {
                UpdateDroneItem updateDroneItem = new UpdateDroneItem();
                updateDroneItem.setDistance(query.getDouble(query.getColumnIndex("distance")));
                updateDroneItem.setEndddata(query.getString(query.getColumnIndex("endddata")));
                updateDroneItem.setMaxhight(query.getDouble(query.getColumnIndex("maxhight")));
                updateDroneItem.setMonth(query.getInt(query.getColumnIndex("month")));
                updateDroneItem.setRecord_time(query.getString(query.getColumnIndex("record_time")));
                updateDroneItem.setSportTime(query.getDouble(query.getColumnIndex("sportTime")));
                updateDroneItem.setUploadurl(query.getString(query.getColumnIndex("uploadurl")));
                updateDroneItem.setUser_id(query.getLong(query.getColumnIndex("user_id")));
                updateDroneItem.setUser_id(query.getLong(query.getColumnIndex("planeID")));
                updateDroneItem.setYear(query.getInt(query.getColumnIndex("year")));
                updateDroneItem.setFlag(query.getInt(query.getColumnIndex(RConversation.COL_FLAG)));
                updateDroneItem.setPlaneID(query.getLong(query.getColumnIndex("planeID")) + "");
                list.add(updateDroneItem);
            }
            query.close();
            this.d.close();
        }
        return list;
    }

    public void a() {
        this.d = this.c.getWritableDatabase();
        this.d.execSQL("delete from waypoint");
        this.d.close();
    }

    public void a(List<ba> list) {
        a();
        this.d = this.c.getWritableDatabase();
        for (ba a : list) {
            this.d.insert(f, null, a(a));
        }
        this.d.close();
    }

    public void a(List<ContentValues> list, String str) {
        Log.e("查数据", "fdfdfdfdfdfd");
        this.d = this.c.getWritableDatabase();
        for (ContentValues insert : list) {
            this.d.insert(str, null, insert);
        }
        this.d.close();
    }

    public int b(String str, String str2) {
        int i = 0;
        this.d = this.c.getWritableDatabase();
        Cursor rawQuery = this.d.rawQuery(str, null);
        while (rawQuery.moveToNext()) {
            i = rawQuery.getInt(rawQuery.getColumnIndex(str2));
        }
        rawQuery.close();
        this.d.close();
        return i;
    }

    public List<ba> b() {
        this.d = this.c.getReadableDatabase();
        List<ba> arrayList = new ArrayList();
        Cursor rawQuery = this.d.rawQuery("select latitude,longitude,height,sequence,link,type,flyOver from waypoint", null);
        if (rawQuery.getCount() > 0) {
            rawQuery.moveToFirst();
            while (!rawQuery.isAfterLast()) {
                arrayList.add(a(rawQuery));
                rawQuery.moveToNext();
            }
        } else {
            arrayList = null;
        }
        rawQuery.close();
        this.c.close();
        this.d.close();
        return arrayList;
    }
}
