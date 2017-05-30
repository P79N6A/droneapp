package com.fimi.soul.utils;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.fimi.soul.entity.BatteryOverDischange;
import java.util.ArrayList;
import java.util.List;

public class d {
    public static d a;
    public static final String b = ("create table  if not exists " + a.a + "(" + a.b + " varchar(20) not null ," + a.c + " varchar(20) not null ," + a.d + " varchar(20) not null ," + a.e + " varchar(20) not null ," + a.f + " varchar(20) not null ," + a.g + " varchar(20) not null ," + a.h + " varchar(20) not null ," + a.i + " varchar(20) not null ," + a.j + " varchar(20) not null ," + a.k + " varchar(20) not null ," + a.l + " varchar(20) not null ," + a.m + " varchar(20) not null ," + a.n + " varchar(20) not null ," + a.o + " varchar(20) not null ," + a.q + " varchar(20) ," + a.r + " varchar(20) ," + a.s + " varchar(20) ," + a.p + " INTEGER)");
    private i c;
    private SQLiteDatabase d = this.c.getWritableDatabase();
    private Context e;

    static class a {
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

        a() {
        }
    }

    public d(Context context) {
        this.e = context;
        this.c = i.a(context);
    }

    public static d a(Context context) {
        if (a == null) {
            a = new d(context);
        }
        return a;
    }

    private ContentValues b(BatteryOverDischange batteryOverDischange) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(a.b, batteryOverDischange.getUserId());
        contentValues.put(a.c, batteryOverDischange.getBatteryId());
        contentValues.put(a.d, batteryOverDischange.getBatteryLevel());
        contentValues.put(a.e, batteryOverDischange.getVoltage());
        contentValues.put(a.f, batteryOverDischange.getBatteryCurrent());
        contentValues.put(a.g, batteryOverDischange.getTemperature());
        contentValues.put(a.h, batteryOverDischange.getBatteryFull());
        contentValues.put(a.i, batteryOverDischange.getBatteryOne());
        contentValues.put(a.j, batteryOverDischange.getBatteryTwo());
        contentValues.put(a.k, batteryOverDischange.getBatteryThree());
        contentValues.put(a.l, batteryOverDischange.getBatteryFour());
        contentValues.put(a.m, batteryOverDischange.getBatteryRecyle());
        contentValues.put(a.n, batteryOverDischange.getVersion());
        contentValues.put(a.o, batteryOverDischange.getAppType());
        contentValues.put(a.p, batteryOverDischange.getAppType());
        contentValues.put(a.s, batteryOverDischange.getCurElectric());
        contentValues.put(a.q, batteryOverDischange.getFcVersion());
        contentValues.put(a.r, batteryOverDischange.getUpdateTimes());
        return contentValues;
    }

    public long a(BatteryOverDischange batteryOverDischange) {
        return this.d.insert(a.a, null, b(batteryOverDischange));
    }

    public List<BatteryOverDischange> a() {
        String str = "select * from " + a.a;
        SQLiteDatabase writableDatabase = this.c.getWritableDatabase();
        List<BatteryOverDischange> arrayList = new ArrayList();
        Cursor rawQuery = writableDatabase.rawQuery(str, null);
        while (rawQuery.moveToNext()) {
            BatteryOverDischange batteryOverDischange = new BatteryOverDischange();
            batteryOverDischange.setUserId(rawQuery.getString(rawQuery.getColumnIndex(a.b)));
            batteryOverDischange.setBatteryId(rawQuery.getString(rawQuery.getColumnIndex(a.c)));
            batteryOverDischange.setBatteryLevel(rawQuery.getString(rawQuery.getColumnIndex(a.d)));
            batteryOverDischange.setVoltage(rawQuery.getString(rawQuery.getColumnIndex(a.e)));
            batteryOverDischange.setBatteryCurrent(rawQuery.getString(rawQuery.getColumnIndex(a.f)));
            batteryOverDischange.setTemperature(rawQuery.getString(rawQuery.getColumnIndex(a.g)));
            batteryOverDischange.setBatteryFull(rawQuery.getString(rawQuery.getColumnIndex(a.h)));
            batteryOverDischange.setBatteryOne(rawQuery.getString(rawQuery.getColumnIndex(a.i)));
            batteryOverDischange.setBatteryTwo(rawQuery.getString(rawQuery.getColumnIndex(a.j)));
            batteryOverDischange.setBatteryThree(rawQuery.getString(rawQuery.getColumnIndex(a.k)));
            batteryOverDischange.setBatteryFour(rawQuery.getString(rawQuery.getColumnIndex(a.l)));
            batteryOverDischange.setBatteryRecyle(rawQuery.getString(rawQuery.getColumnIndex(a.m)));
            batteryOverDischange.setVersion(rawQuery.getString(rawQuery.getColumnIndex(a.n)));
            batteryOverDischange.setAppType(rawQuery.getString(rawQuery.getColumnIndex(a.o)));
            batteryOverDischange.setAccidentType(rawQuery.getInt(rawQuery.getColumnIndex(a.p)));
            batteryOverDischange.setCurElectric(rawQuery.getString(rawQuery.getColumnIndex(a.s)));
            batteryOverDischange.setFcVersion(rawQuery.getString(rawQuery.getColumnIndex(a.q)));
            batteryOverDischange.setUpdateTimes(rawQuery.getString(rawQuery.getColumnIndex(a.r)));
            arrayList.add(batteryOverDischange);
        }
        return arrayList;
    }

    public boolean b() {
        return this.d.delete(a.a, null, null) > 0;
    }

    public long c() {
        this.d = this.c.getReadableDatabase();
        Cursor rawQuery = this.d.rawQuery("select count(*)from" + a.a, null);
        rawQuery.moveToFirst();
        return rawQuery.getLong(0);
    }
}
