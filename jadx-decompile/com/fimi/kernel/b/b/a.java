package com.fimi.kernel.b.b;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

class a extends SQLiteOpenHelper {
    public a(Context context) {
        super(context, "download.db", null, 4);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("create table download_info(_id integer PRIMARY KEY AUTOINCREMENT, thread_id integer, start_pos long, end_pos long, compelete_size long,url char)");
        sQLiteDatabase.execSQL("create table download_task(_id integer PRIMARY KEY AUTOINCREMENT, url char,local_uri char,file_size int,dur char)");
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        switch (i) {
            case 1:
                try {
                    sQLiteDatabase.execSQL("drop table if exists download_info");
                    sQLiteDatabase.execSQL("drop table if exists download_task");
                    onCreate(sQLiteDatabase);
                    break;
                } catch (SQLException e) {
                    e.printStackTrace();
                    break;
                }
            case 2:
                break;
            case 3:
                break;
            default:
                return;
        }
        try {
            sQLiteDatabase.execSQL("drop table if exists download_info");
            sQLiteDatabase.execSQL("drop table if exists download_task");
            onCreate(sQLiteDatabase);
        } catch (SQLException e2) {
            e2.printStackTrace();
        }
        try {
            sQLiteDatabase.execSQL("alter table download_task colum dur char");
        } catch (SQLException e22) {
            e22.printStackTrace();
        }
    }
}
