package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import org.json.JSONObject;

@aaa
public class yv
  extends Handler
{
  private final yu a;
  
  public yv(Context paramContext)
  {
    this(new yw(localContext));
  }
  
  public yv(yu paramyu)
  {
    this.a = paramyu;
  }
  
  private void a(JSONObject paramJSONObject)
  {
    try
    {
      this.a.a(paramJSONObject.getString("request_id"), paramJSONObject.getString("base_url"), paramJSONObject.getString("html"));
      return;
    }
    catch (Exception paramJSONObject) {}
  }
  
  public void handleMessage(Message paramMessage)
  {
    try
    {
      paramMessage = paramMessage.getData();
      if (paramMessage == null) {
        return;
      }
      paramMessage = new JSONObject(paramMessage.getString("data"));
      if ("fetch_html".equals(paramMessage.getString("message_name")))
      {
        a(paramMessage);
        return;
      }
    }
    catch (Exception paramMessage) {}
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/yv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */