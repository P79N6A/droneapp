package com.fimi.soul.utils.a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.fimi.soul.entity.HistoryPushMessage;
import com.fimi.soul.utils.i;
import java.util.ArrayList;
import java.util.List;

public class b {
    public static final String a = "create table  if not exists history_push_message(orderId int auto_increment primary key ,url varchar(600) ,title varchar(20) ,payload varchar(20) ,id varchar(20) ,msgType varchar(20) ,passThrough varchar(20) ,statue varchar(20) ,time varchar(20))";
    private static b e;
    private i b;
    private SQLiteDatabase c = this.b.getWritableDatabase();
    private Context d;

    public static class a {
        public static final String a = "history_push_message";
        public static final String b = "url";
        public static final String c = "title";
        public static final String d = "payload";
        public static final String e = "statue";
        public static final String f = "passThrough";
        public static final String g = "id";
        public static final String h = "msgType";
        public static final String i = "time";
        public static final String j = "orderId";
    }

    private b(Context context) {
        this.d = context;
        this.b = i.a(context);
    }

    public static b a(Context context) {
        if (e == null) {
            e = new b(context.getApplicationContext());
        }
        return e;
    }

    public long a(HistoryPushMessage historyPushMessage) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("url", historyPushMessage.getRedirectURL());
        contentValues.put("title", historyPushMessage.getTitle());
        contentValues.put(a.d, historyPushMessage.getPayload());
        contentValues.put(a.i, historyPushMessage.getTime());
        contentValues.put(a.e, historyPushMessage.getStatus());
        contentValues.put(a.f, historyPushMessage.getPassThough());
        contentValues.put("id", historyPushMessage.getId());
        contentValues.put("msgType", historyPushMessage.getMsgType());
        return this.c.insert(a.a, null, contentValues);
    }

    public List<HistoryPushMessage> a() {
        this.c = this.b.getWritableDatabase();
        List<HistoryPushMessage> arrayList = new ArrayList();
        Cursor rawQuery = this.c.rawQuery("select * from history_push_message order by orderId desc", null);
        while (rawQuery.moveToNext()) {
            HistoryPushMessage historyPushMessage = new HistoryPushMessage();
            historyPushMessage.setRedirectURL(rawQuery.getString(rawQuery.getColumnIndex("url")));
            historyPushMessage.setTitle(rawQuery.getString(rawQuery.getColumnIndex("title")));
            historyPushMessage.setPayload(rawQuery.getString(rawQuery.getColumnIndex(a.d)));
            historyPushMessage.setTime(rawQuery.getString(rawQuery.getColumnIndex(a.i)));
            historyPushMessage.setId(rawQuery.getString(rawQuery.getColumnIndex("id")));
            historyPushMessage.setMsgType(rawQuery.getString(rawQuery.getColumnIndex("msgType")));
            historyPushMessage.setPassThough(rawQuery.getString(rawQuery.getColumnIndex(a.f)));
            historyPushMessage.setStatus(rawQuery.getString(rawQuery.getColumnIndex(a.e)));
            arrayList.add(historyPushMessage);
        }
        return arrayList;
    }

    public boolean b(HistoryPushMessage historyPushMessage) {
        this.c = this.b.getWritableDatabase();
        try {
            if (this.c.rawQuery("select * from history_push_message where id=?", new String[]{historyPushMessage.getId()}).getCount() > 0) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
