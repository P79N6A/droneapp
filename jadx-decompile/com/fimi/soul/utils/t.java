package com.fimi.soul.utils;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;

public class t {
    public static t a;
    public static final String b = ("create table  if not exists " + a.a + "(" + a.b + " varchar(20) not null ," + a.c + " long default 0 ," + a.d + " double default 0," + a.e + " varchar(20) not null)");
    private i c;
    private SQLiteDatabase d = this.c.getWritableDatabase();
    private Context e;

    static class a {
        public static String a = "flyRecords_tb";
        public static String b = "drone_id";
        public static String c = "fly_time";
        public static String d = "fly_distance";
        public static String e = "user_id";

        a() {
        }
    }

    public t(Context context) {
        this.e = context;
        this.c = i.a(context);
    }

    public static t a(Context context) {
        if (a == null) {
            a = new t(context);
        }
        return a;
    }

    private ContentValues b(u uVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(a.c, Long.valueOf(uVar.c()));
        contentValues.put(a.d, Double.valueOf(uVar.d()));
        contentValues.put(a.b, uVar.b());
        contentValues.put(a.e, uVar.a());
        return contentValues;
    }

    public List<u> a(String str) {
        List<u> list = null;
        if (!(str == null || "".equals(str))) {
            Cursor query = this.d.query(a.a, new String[]{a.e, a.b, a.c, a.d}, a.e + " = ? ", new String[]{str}, null, null, null);
            if (query != null && query.getCount() > 0) {
                list = new ArrayList();
                query.moveToFirst();
                do {
                    u uVar = new u();
                    uVar.a(str);
                    uVar.a(query.getLong(query.getColumnIndex(a.c)));
                    uVar.a(query.getDouble(query.getColumnIndex(a.d)));
                    list.add(uVar);
                } while (query.moveToNext());
            }
        }
        return list;
    }

    public void a(u uVar) {
        this.d.insert(a.a, null, b(uVar));
    }

    public boolean b(String str) {
        if (str == null || "".equals(str)) {
            return false;
        }
        return this.d.delete(a.a, new StringBuilder().append(a.e).append(" = ? ").toString(), new String[]{str}) > 0;
    }
}
