package com.fimi.soul.utils.a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.fimi.soul.entity.BatteryUpdateSize;
import com.fimi.soul.utils.i;

public class a {
    public static final String a = ("create table  if not exists " + a.a + "(" + a.b + " INTEGER ," + a.c + " varchar(20) not null ," + a.d + " INTEGER)");
    private static a e;
    private Context b;
    private i c;
    private SQLiteDatabase d;

    public static class a {
        public static String a = "battery_update_size";
        public static String b = "battery_id";
        public static String c = "battery_update_size";
        public static String d = "message_hint_size";
    }

    private a(Context context) {
        this.b = context;
        this.c = i.a(context);
    }

    public static a a(Context context) {
        if (e == null) {
            e = new a(context.getApplicationContext());
        }
        return e;
    }

    public long a(BatteryUpdateSize batteryUpdateSize) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(a.b, batteryUpdateSize.getBatteryId());
        contentValues.put(a.c, Integer.valueOf(batteryUpdateSize.getBatteryUpdateSize()));
        contentValues.put(a.d, Integer.valueOf(batteryUpdateSize.getMessageHintSize()));
        this.d = this.c.getWritableDatabase();
        return this.d.insert(a.a, null, contentValues);
    }

    public BatteryUpdateSize b(BatteryUpdateSize batteryUpdateSize) {
        this.d = this.c.getWritableDatabase();
        Cursor rawQuery = this.d.rawQuery("select * from " + a.a + " where " + a.b + "=? and " + a.c + "=?", new String[]{batteryUpdateSize.getBatteryId(), String.valueOf(batteryUpdateSize.getBatteryUpdateSize())});
        BatteryUpdateSize batteryUpdateSize2 = null;
        if (rawQuery.moveToFirst()) {
            do {
                batteryUpdateSize2 = new BatteryUpdateSize();
                batteryUpdateSize2.setBatteryId(rawQuery.getString(rawQuery.getColumnIndex(a.b)));
                batteryUpdateSize2.setBatteryUpdateSize(rawQuery.getInt(rawQuery.getColumnIndex(a.c)));
                batteryUpdateSize2.setMessageHintSize(rawQuery.getInt(rawQuery.getColumnIndex(a.d)));
            } while (rawQuery.moveToNext());
        }
        return batteryUpdateSize2;
    }

    public int c(BatteryUpdateSize batteryUpdateSize) {
        int i = 0;
        this.d = this.c.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(a.d, Integer.valueOf(batteryUpdateSize.getMessageHintSize()));
        try {
            i = this.d.update(a.a, contentValues, a.b + "=? and " + a.c + "=?", new String[]{batteryUpdateSize.getBatteryId(), String.valueOf(batteryUpdateSize.getBatteryUpdateSize())});
        } catch (Exception e) {
            e.printStackTrace();
        }
        return i;
    }

    public int d(BatteryUpdateSize batteryUpdateSize) {
        this.d = this.c.getWritableDatabase();
        return this.d.delete(a.a, a.b + "=?", new String[]{batteryUpdateSize.getBatteryId()});
    }
}
