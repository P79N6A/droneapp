package com.baidu.tts.e;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import com.xiaomi.market.sdk.k;
import com.xiaomi.mipush.sdk.Constants;
import java.util.List;

public class c {
    private static c e;
    private a a;
    private SQLiteDatabase b;
    private volatile boolean c = false;
    private Context d;

    class a extends SQLiteOpenHelper {
        final /* synthetic */ c a;

        public a(c cVar, Context context) {
            this.a = cVar;
            super(context, "ttsdata", null, 1);
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("create table result (_id integer primary key autoincrement, time text, code integer, cmd_type integer, cmd_id integer, result text);");
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS result");
            onCreate(sQLiteDatabase);
        }
    }

    private c(Context context) {
        this.d = context;
    }

    public static c a(Context context) {
        if (e == null) {
            synchronized (c.class) {
                if (e == null) {
                    e = new c(context);
                }
            }
        }
        return e;
    }

    public static void e() {
        if (e != null) {
            synchronized (c.class) {
                if (e != null) {
                    e = null;
                }
            }
        }
    }

    public synchronized void a() {
        if (this.a == null) {
            this.a = new a(this, this.d);
            try {
                this.b = this.a.getWritableDatabase();
            } catch (Throwable th) {
                this.c = true;
            }
        }
    }

    public void a(long j, int i, int i2, int i3, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(com.fimi.soul.utils.a.b.a.i, Long.valueOf(j));
        contentValues.put(XiaomiOAuthConstants.EXTRA_CODE_2, Integer.valueOf(i));
        contentValues.put("cmd_type", Integer.valueOf(i2));
        contentValues.put("cmd_id", Integer.valueOf(i3));
        contentValues.put("result", str);
        this.b.insert("result", null, contentValues);
    }

    public void a(List<Integer> list) {
        if (list != null && list.size() != 0) {
            String str = "";
            for (int i = 0; i < list.size(); i++) {
                str = str + list.get(i) + Constants.ACCEPT_TIME_SEPARATOR_SP;
            }
            if (str.length() > 0) {
                this.b.delete("result", "_id in (" + str.substring(0, str.length() - 1) + ")", null);
            }
        }
    }

    public Cursor b() {
        if (this.b == null) {
            return null;
        }
        return this.b.query("result", new String[]{k._ID, com.fimi.soul.utils.a.b.a.i, XiaomiOAuthConstants.EXTRA_CODE_2, "cmd_type", "cmd_id", "result"}, null, null, null, null, null);
    }

    public synchronized void c() {
        if (this.d != null) {
            this.a.close();
            this.a = null;
            this.d = null;
            this.c = true;
        }
    }

    public boolean d() {
        return this.c;
    }
}
