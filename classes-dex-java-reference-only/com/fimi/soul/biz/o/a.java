package com.fimi.soul.biz.o;

import android.content.Context;
import com.fimi.kernel.utils.x;
import com.fimi.soul.biz.m.k;
import com.fimi.soul.biz.manager.r;
import com.fimi.soul.entity.FlyModeLog;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.utils.ao;
import com.fimi.soul.utils.s;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class a
{
  private static a c = null;
  private r a;
  private Context b;
  private s d;
  
  private a(Context paramContext)
  {
    this.a = r.a(paramContext);
    this.b = paramContext;
    this.d = s.a(this.b);
  }
  
  public static a a(Context paramContext)
  {
    if (c == null) {
      c = new a(paramContext.getApplicationContext());
    }
    return c;
  }
  
  public void a()
  {
    x.b(new Runnable()
    {
      public void run()
      {
        if (!ao.b(a.b(a.this))) {}
        Object localObject;
        do
        {
          return;
          localObject = a.a(a.this).a();
        } while (((List)localObject).size() <= 0);
        JSONArray localJSONArray = new JSONArray();
        try
        {
          localObject = ((List)localObject).iterator();
          while (((Iterator)localObject).hasNext())
          {
            FlyModeLog localFlyModeLog = (FlyModeLog)((Iterator)localObject).next();
            JSONObject localJSONObject = new JSONObject();
            localJSONObject.put("userID", localFlyModeLog.getUserID());
            localJSONObject.put("fcVersion", localFlyModeLog.getFcVersion());
            localJSONObject.put("openType", localFlyModeLog.getOpenType());
            localJSONObject.put("applyTime", localFlyModeLog.getInsertTime());
            localJSONObject.put("x2Version", localFlyModeLog.getX2Version());
            localJSONObject.put("appType", localFlyModeLog.getAppType());
            localJSONArray.put(localJSONObject);
          }
          return;
        }
        catch (JSONException localJSONException)
        {
          localJSONException.printStackTrace();
          a.c(a.this).a(localJSONArray.toString(), new k()
          {
            public void a(PlaneMsg paramAnonymous2PlaneMsg, File paramAnonymous2File)
            {
              if (paramAnonymous2PlaneMsg.isSuccess()) {
                a.a(a.this).b();
              }
            }
          });
        }
      }
    });
  }
  
  public void a(final FlyModeLog paramFlyModeLog)
  {
    JSONArray localJSONArray = new JSONArray();
    try
    {
      JSONObject localJSONObject = new JSONObject();
      localJSONObject.put("userID", paramFlyModeLog.getUserID());
      localJSONObject.put("fcVersion", paramFlyModeLog.getFcVersion());
      localJSONObject.put("openType", paramFlyModeLog.getOpenType());
      localJSONObject.put("applyTime", paramFlyModeLog.getApplyTime());
      localJSONObject.put("x2Version", paramFlyModeLog.getX2Version());
      localJSONObject.put("appType", paramFlyModeLog.getAppType());
      localJSONArray.put(localJSONObject);
      if (ao.b(this.b))
      {
        this.a.a(localJSONArray.toString(), new k()
        {
          public void a(PlaneMsg paramAnonymousPlaneMsg, File paramAnonymousFile)
          {
            if (!paramAnonymousPlaneMsg.isSuccess()) {
              a.a(a.this).a(paramFlyModeLog);
            }
          }
        });
        return;
      }
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        localJSONException.printStackTrace();
      }
      this.d.a(paramFlyModeLog);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/o/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */