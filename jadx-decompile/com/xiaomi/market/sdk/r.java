package com.xiaomi.market.sdk;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import android.util.Log;

public class r extends SQLiteOpenHelper {
    private static final String TAG = "MarketSDKDatabaseHelper";
    private static r aY = null;
    static final String aZ = "xiaomi_market_sdk_update.db";
    static final int ba = 1;

    private r(Context context) {
        super(context, aZ, null, 1);
    }

    private void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(l.aH);
    }

    public static r j(Context context) {
        if (aY == null) {
            aY = new r(context);
        }
        return aY;
    }

    public long a(ContentValues contentValues) {
        SQLiteStatement compileStatement = getWritableDatabase().compileStatement("INSERT OR REPLACE INTO update_download(package_name,download_id,version_code,apk_url,apk_hash,diff_url,diff_hash,apk_path) VALUES(?,?,?,?,?,?,?,?)");
        compileStatement.bindString(1, contentValues.getAsString(l.PACKAGE_NAME));
        compileStatement.bindLong(2, contentValues.getAsLong(l.aF).longValue());
        compileStatement.bindLong(3, (long) contentValues.getAsInteger(l.aw).intValue());
        compileStatement.bindString(4, contentValues.getAsString(l.ay));
        compileStatement.bindString(5, contentValues.getAsString(l.az));
        compileStatement.bindString(6, contentValues.getAsString(l.aB));
        compileStatement.bindString(7, contentValues.getAsString(l.aC));
        compileStatement.bindString(8, contentValues.getAsString(l.aG));
        compileStatement.execute();
        return 1;
    }

    public synchronized long a(String str, ContentValues contentValues) {
        return getWritableDatabase().insert(str, null, contentValues);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        Log.d(TAG, "create database");
        a(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public Cursor query(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        return getReadableDatabase().query(str, strArr, str2, strArr2, str3, str4, str5);
    }
}
