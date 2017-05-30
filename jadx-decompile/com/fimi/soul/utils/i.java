package com.fimi.soul.utils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import com.fimi.soul.utils.a.a;
import com.fimi.soul.utils.a.b;

public class i extends SQLiteOpenHelper {
    public static i a = null;
    private static final String b = "miplaner";
    private static final int c = 8;
    private Context d;

    private i(Context context, String str, CursorFactory cursorFactory, int i) {
        super(context, b, cursorFactory, 8);
        this.d = context;
    }

    public static i a(Context context) {
        if (a == null) {
            a = new i(context, null, null, 0);
        }
        return a;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        as.a(sQLiteDatabase);
        sQLiteDatabase.execSQL(t.b);
        sQLiteDatabase.execSQL(d.b);
        sQLiteDatabase.execSQL(b.a);
        sQLiteDatabase.execSQL(a.a);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r3, int r4, int r5) {
        /*
        r2 = this;
        switch(r4) {
            case 1: goto L_0x0004;
            case 2: goto L_0x0013;
            case 3: goto L_0x0027;
            case 4: goto L_0x0031;
            case 5: goto L_0x0058;
            case 6: goto L_0x0062;
            case 7: goto L_0x006c;
            default: goto L_0x0003;
        };
    L_0x0003:
        return;
    L_0x0004:
        r0 = "drop table if exists flyRecord_tb";
        r3.execSQL(r0);
        r0 = com.fimi.soul.utils.t.b;
        r3.execSQL(r0);
        r0 = com.fimi.soul.utils.d.b;
        r3.execSQL(r0);
    L_0x0013:
        r0 = "drop table if exists battery_over_dischange_tb";
        r3.execSQL(r0);
        r0 = com.fimi.soul.utils.d.b;
        r3.execSQL(r0);
        r0 = "drop table if exists flyRecord_tb";
        r3.execSQL(r0);
        r0 = com.fimi.soul.utils.t.b;
        r3.execSQL(r0);
    L_0x0027:
        r0 = "drop table if exists flyRecord_tb";
        r3.execSQL(r0);
        r0 = com.fimi.soul.utils.t.b;
        r3.execSQL(r0);
    L_0x0031:
        r0 = "drop table if exists history_push_message";
        r3.execSQL(r0);
        r0 = "create table  if not exists history_push_message(orderId int auto_increment primary key ,url varchar(600) ,title varchar(20) ,payload varchar(20) ,id varchar(20) ,msgType varchar(20) ,passThrough varchar(20) ,statue varchar(20) ,time varchar(20))";
        r3.execSQL(r0);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "drop table if exists ";
        r0 = r0.append(r1);
        r1 = com.fimi.soul.utils.a.a.a.a;
        r0 = r0.append(r1);
        r0 = r0.toString();
        r3.execSQL(r0);
        r0 = com.fimi.soul.utils.a.a.a;
        r3.execSQL(r0);
    L_0x0058:
        r0 = "drop table if exists history_push_message";
        r3.execSQL(r0);
        r0 = "create table  if not exists history_push_message(orderId int auto_increment primary key ,url varchar(600) ,title varchar(20) ,payload varchar(20) ,id varchar(20) ,msgType varchar(20) ,passThrough varchar(20) ,statue varchar(20) ,time varchar(20))";
        r3.execSQL(r0);
    L_0x0062:
        r0 = "drop table if exists history_push_message";
        r3.execSQL(r0);
        r0 = "create table  if not exists history_push_message(orderId int auto_increment primary key ,url varchar(600) ,title varchar(20) ,payload varchar(20) ,id varchar(20) ,msgType varchar(20) ,passThrough varchar(20) ,statue varchar(20) ,time varchar(20))";
        r3.execSQL(r0);
    L_0x006c:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "alter table ";
        r0 = r0.append(r1);
        r1 = com.fimi.soul.utils.d.a.a;
        r0 = r0.append(r1);
        r1 = " add ";
        r0 = r0.append(r1);
        r1 = com.fimi.soul.utils.d.a.q;
        r0 = r0.append(r1);
        r1 = " varchar(20)";
        r0 = r0.append(r1);
        r0 = r0.toString();
        r3.execSQL(r0);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "alter table ";
        r0 = r0.append(r1);
        r1 = com.fimi.soul.utils.d.a.a;
        r0 = r0.append(r1);
        r1 = " add ";
        r0 = r0.append(r1);
        r1 = com.fimi.soul.utils.d.a.s;
        r0 = r0.append(r1);
        r1 = " varchar(20)";
        r0 = r0.append(r1);
        r0 = r0.toString();
        r3.execSQL(r0);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "alter table ";
        r0 = r0.append(r1);
        r1 = com.fimi.soul.utils.d.a.a;
        r0 = r0.append(r1);
        r1 = " add ";
        r0 = r0.append(r1);
        r1 = com.fimi.soul.utils.d.a.r;
        r0 = r0.append(r1);
        r1 = " varchar(20)";
        r0 = r0.append(r1);
        r0 = r0.toString();
        r3.execSQL(r0);
        goto L_0x0003;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fimi.soul.utils.i.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }
}
