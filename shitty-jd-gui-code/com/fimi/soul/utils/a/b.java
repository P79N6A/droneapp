package com.fimi.soul.utils.a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.fimi.soul.entity.HistoryPushMessage;
import com.fimi.soul.utils.i;
import java.util.ArrayList;
import java.util.List;

public class b
{
  public static final String a = "create table  if not exists history_push_message(orderId int auto_increment primary key ,url varchar(600) ,title varchar(20) ,payload varchar(20) ,id varchar(20) ,msgType varchar(20) ,passThrough varchar(20) ,statue varchar(20) ,time varchar(20))";
  private static b e;
  private i b;
  private SQLiteDatabase c;
  private Context d;
  
  private b(Context paramContext)
  {
    this.d = paramContext;
    this.b = i.a(paramContext);
    this.c = this.b.getWritableDatabase();
  }
  
  public static b a(Context paramContext)
  {
    if (e == null) {
      e = new b(paramContext.getApplicationContext());
    }
    return e;
  }
  
  public long a(HistoryPushMessage paramHistoryPushMessage)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("url", paramHistoryPushMessage.getRedirectURL());
    localContentValues.put("title", paramHistoryPushMessage.getTitle());
    localContentValues.put("payload", paramHistoryPushMessage.getPayload());
    localContentValues.put("time", paramHistoryPushMessage.getTime());
    localContentValues.put("statue", paramHistoryPushMessage.getStatus());
    localContentValues.put("passThrough", paramHistoryPushMessage.getPassThough());
    localContentValues.put("id", paramHistoryPushMessage.getId());
    localContentValues.put("msgType", paramHistoryPushMessage.getMsgType());
    return this.c.insert("history_push_message", null, localContentValues);
  }
  
  public List<HistoryPushMessage> a()
  {
    this.c = this.b.getWritableDatabase();
    ArrayList localArrayList = new ArrayList();
    Cursor localCursor = this.c.rawQuery("select * from history_push_message order by orderId desc", null);
    while (localCursor.moveToNext())
    {
      HistoryPushMessage localHistoryPushMessage = new HistoryPushMessage();
      localHistoryPushMessage.setRedirectURL(localCursor.getString(localCursor.getColumnIndex("url")));
      localHistoryPushMessage.setTitle(localCursor.getString(localCursor.getColumnIndex("title")));
      localHistoryPushMessage.setPayload(localCursor.getString(localCursor.getColumnIndex("payload")));
      localHistoryPushMessage.setTime(localCursor.getString(localCursor.getColumnIndex("time")));
      localHistoryPushMessage.setId(localCursor.getString(localCursor.getColumnIndex("id")));
      localHistoryPushMessage.setMsgType(localCursor.getString(localCursor.getColumnIndex("msgType")));
      localHistoryPushMessage.setPassThough(localCursor.getString(localCursor.getColumnIndex("passThrough")));
      localHistoryPushMessage.setStatus(localCursor.getString(localCursor.getColumnIndex("statue")));
      localArrayList.add(localHistoryPushMessage);
    }
    return localArrayList;
  }
  
  public boolean b(HistoryPushMessage paramHistoryPushMessage)
  {
    this.c = this.b.getWritableDatabase();
    try
    {
      int i = this.c.rawQuery("select * from history_push_message where id=?", new String[] { paramHistoryPushMessage.getId() }).getCount();
      if (i > 0) {
        return true;
      }
    }
    catch (Exception paramHistoryPushMessage)
    {
      paramHistoryPushMessage.printStackTrace();
    }
    return false;
  }
  
  public static class a
  {
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
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/utils/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */