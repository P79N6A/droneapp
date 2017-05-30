package com.fimi.soul.biz.f;

import android.content.Context;
import com.fimi.kernel.utils.x;
import com.fimi.soul.biz.m.k;
import com.fimi.soul.biz.manager.r;
import com.fimi.soul.entity.BatteryOverDischange;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.utils.ao;
import com.fimi.soul.utils.d;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class a
{
  private d a;
  private Context b;
  private r c;
  
  public a(Context paramContext)
  {
    this.b = paramContext;
    this.a = d.a(this.b);
    this.c = r.a(this.b);
  }
  
  public void a()
  {
    x.b(new Runnable()
    {
      public void run()
      {
        if (!ao.b(a.a(a.this))) {}
        Object localObject;
        do
        {
          return;
          localObject = a.b(a.this).a();
        } while (((List)localObject).size() <= 0);
        JSONArray localJSONArray = new JSONArray();
        try
        {
          localObject = ((List)localObject).iterator();
          while (((Iterator)localObject).hasNext())
          {
            BatteryOverDischange localBatteryOverDischange = (BatteryOverDischange)((Iterator)localObject).next();
            JSONObject localJSONObject = new JSONObject();
            localJSONObject.put("userID", localBatteryOverDischange.getUserId());
            localJSONObject.put("batteryId", localBatteryOverDischange.getBatteryId());
            localJSONObject.put("battery_level", localBatteryOverDischange.getBatteryLevel());
            localJSONObject.put("voltage", localBatteryOverDischange.getVoltage());
            localJSONObject.put("battery_current", localBatteryOverDischange.getBatteryCurrent());
            localJSONObject.put("temperature", localBatteryOverDischange.getTemperature());
            localJSONObject.put("battery_full", localBatteryOverDischange.getBatteryFull());
            localJSONObject.put("battery_one", localBatteryOverDischange.getBatteryOne());
            localJSONObject.put("battery_two", localBatteryOverDischange.getBatteryTwo());
            localJSONObject.put("battery_three", localBatteryOverDischange.getBatteryThree());
            localJSONObject.put("battery_four", localBatteryOverDischange.getBatteryFour());
            localJSONObject.put("battery_recyle", localBatteryOverDischange.getBatteryRecyle());
            localJSONObject.put("version", localBatteryOverDischange.getVersion());
            localJSONObject.put("appType", localBatteryOverDischange.getAppType());
            localJSONObject.put("accidentType", localBatteryOverDischange.getAccidentType());
            localJSONObject.put("updateTimes", localBatteryOverDischange.getUpdateTimes());
            localJSONObject.put("curElectric ", localBatteryOverDischange.getCurElectric());
            localJSONObject.put("fcVersion", localBatteryOverDischange.getFcVersion());
            localJSONArray.put(localJSONObject);
          }
          return;
        }
        catch (JSONException localJSONException)
        {
          localJSONException.printStackTrace();
          a.c(a.this).b(localJSONArray.toString(), new k()
          {
            public void a(PlaneMsg paramAnonymous2PlaneMsg, File paramAnonymous2File)
            {
              if (paramAnonymous2PlaneMsg.isSuccess()) {
                a.b(a.this).b();
              }
            }
          });
        }
      }
    });
  }
  
  public void a(final BatteryOverDischange paramBatteryOverDischange)
  {
    JSONArray localJSONArray = new JSONArray();
    try
    {
      JSONObject localJSONObject = new JSONObject();
      localJSONObject.put("userID", paramBatteryOverDischange.getUserId());
      localJSONObject.put("batteryId", paramBatteryOverDischange.getBatteryId());
      localJSONObject.put("battery_level", paramBatteryOverDischange.getBatteryLevel());
      localJSONObject.put("voltage", paramBatteryOverDischange.getVoltage());
      localJSONObject.put("battery_current", paramBatteryOverDischange.getBatteryCurrent());
      localJSONObject.put("temperature", paramBatteryOverDischange.getTemperature());
      localJSONObject.put("battery_full", paramBatteryOverDischange.getBatteryFull());
      localJSONObject.put("battery_one", paramBatteryOverDischange.getBatteryOne());
      localJSONObject.put("battery_two", paramBatteryOverDischange.getBatteryTwo());
      localJSONObject.put("battery_three", paramBatteryOverDischange.getBatteryThree());
      localJSONObject.put("battery_four", paramBatteryOverDischange.getBatteryFour());
      localJSONObject.put("battery_recyle", paramBatteryOverDischange.getBatteryRecyle());
      localJSONObject.put("version", paramBatteryOverDischange.getVersion());
      localJSONObject.put("appType", paramBatteryOverDischange.getAppType());
      localJSONObject.put("accidentType", paramBatteryOverDischange.getAccidentType());
      localJSONObject.put("updateTimes", paramBatteryOverDischange.getUpdateTimes());
      localJSONObject.put("curElectric ", paramBatteryOverDischange.getCurElectric());
      localJSONObject.put("fcVersion", paramBatteryOverDischange.getFcVersion());
      localJSONArray.put(localJSONObject);
      if (ao.b(this.b))
      {
        this.c.b(localJSONArray.toString(), new k()
        {
          public void a(PlaneMsg paramAnonymousPlaneMsg, File paramAnonymousFile)
          {
            if (paramAnonymousPlaneMsg.isSuccess()) {
              return;
            }
            a.b(a.this).a(paramBatteryOverDischange);
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
      this.a.a(paramBatteryOverDischange);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/f/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */