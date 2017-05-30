package com.fimi.soul.utils;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.fimi.soul.entity.FlyModeLog;
import java.util.ArrayList;
import java.util.List;

public class s {
    public static s a;
    private i b;
    private SQLiteDatabase c;
    private Context d;
    private final String e = ("create table  if not exists " + a.a + "(" + a.b + " varchar(20) not null ," + a.c + " varchar(20) not null ," + a.d + " varchar(20) not null ," + a.e + " varchar(20) not null ," + a.f + " varchar(20) not null ," + a.g + " varchar(20) not null)");

    static class a {
        public static String a = "fly_mode_log_tb";
        public static String b = "userID";
        public static String c = "fcVersion";
        public static String d = "openType";
        public static String e = "applyTime";
        public static String f = "x2Version";
        public static String g = "appType";

        a() {
        }
    }

    public s(Context context) {
        this.d = context;
        this.b = i.a(context);
        this.c = this.b.getWritableDatabase();
        this.c.execSQL(this.e);
    }

    public static s a(Context context) {
        if (a == null) {
            a = new s(context);
        }
        return a;
    }

    private ContentValues b(FlyModeLog flyModeLog) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(a.b, flyModeLog.getUserID());
        contentValues.put(a.c, flyModeLog.getFcVersion());
        contentValues.put(a.d, flyModeLog.getOpenType());
        contentValues.put(a.e, flyModeLog.getApplyTime());
        contentValues.put(a.f, flyModeLog.getX2Version());
        contentValues.put(a.g, flyModeLog.getAppType());
        return contentValues;
    }

    public long a(FlyModeLog flyModeLog) {
        return this.c.insert(a.a, null, b(flyModeLog));
    }

    public List<FlyModeLog> a() {
        String str = "select * from " + a.a;
        SQLiteDatabase writableDatabase = this.b.getWritableDatabase();
        List<FlyModeLog> arrayList = new ArrayList();
        Cursor rawQuery = writableDatabase.rawQuery(str, null);
        while (rawQuery.moveToNext()) {
            FlyModeLog flyModeLog = new FlyModeLog();
            flyModeLog.setUserID(rawQuery.getString(rawQuery.getColumnIndex(a.b)));
            flyModeLog.setFcVersion(rawQuery.getString(rawQuery.getColumnIndex(a.c)));
            flyModeLog.setOpenType(rawQuery.getString(rawQuery.getColumnIndex(a.d)));
            flyModeLog.setApplyTime(rawQuery.getString(rawQuery.getColumnIndex(a.e)));
            flyModeLog.setX2Version(rawQuery.getString(rawQuery.getColumnIndex(a.f)));
            flyModeLog.setAppType(rawQuery.getString(rawQuery.getColumnIndex(a.g)));
            arrayList.add(flyModeLog);
        }
        return arrayList;
    }

    public boolean b() {
        return this.c.delete(a.a, null, null) > 0;
    }

    public long c() {
        this.c = this.b.getReadableDatabase();
        Cursor rawQuery = this.c.rawQuery("select count(*)from" + a.a, null);
        rawQuery.moveToFirst();
        return rawQuery.getLong(0);
    }
}
