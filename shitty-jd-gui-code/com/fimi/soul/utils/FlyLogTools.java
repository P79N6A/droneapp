package com.fimi.soul.utils;

import android.content.Context;
import android.text.TextUtils;
import com.fimi.kernel.c;
import com.fimi.soul.biz.m.k;
import com.fimi.soul.biz.manager.x;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.User;
import com.fimi.soul.module.update.a.e;
import com.fimi.soul.receiver.NetworkStateReceiver;
import com.fimi.soul.receiver.NetworkStateReceiver.a;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class FlyLogTools
  extends NetworkStateReceiver
{
  public static FlyLogTools c;
  static long d;
  t b;
  private Context e;
  
  public FlyLogTools() {}
  
  public FlyLogTools(Context paramContext)
  {
    this.b = t.a(paramContext);
  }
  
  public static FlyLogTools a(Context paramContext)
  {
    if (c == null) {
      c = new FlyLogTools(paramContext);
    }
    return c;
  }
  
  public void a()
  {
    try
    {
      new Thread(new Runnable()
      {
        public void run()
        {
          Object localObject1 = c.a();
          if (localObject1 == null) {}
          x localx;
          String str2;
          Object localObject2;
          String str1;
          do
          {
            do
            {
              return;
              localx = x.a((Context)localObject1);
              str2 = com.fimi.soul.module.update.a.a.a().a(0).i();
              localObject2 = com.fimi.soul.base.a.b((Context)localObject1);
            } while ((localObject2 == null) && (TextUtils.isEmpty(((User)localObject2).getUserID())));
            str1 = ((User)localObject2).getUserID();
            FlyLogTools.this.b = t.a((Context)localObject1);
            localObject2 = FlyLogTools.this.b.a(((User)localObject2).getUserID());
          } while ((localObject2 == null) || (((List)localObject2).size() <= 0));
          localObject1 = new JSONArray();
          try
          {
            localObject2 = ((List)localObject2).iterator();
            while (((Iterator)localObject2).hasNext())
            {
              u localu = (u)((Iterator)localObject2).next();
              JSONObject localJSONObject = new JSONObject();
              localJSONObject.put("planeID", str2);
              localJSONObject.put("flyTime", localu.c());
              localJSONObject.put("flyJourney", localu.d());
              localJSONObject.put("userID", str1);
              ((JSONArray)localObject1).put(localJSONObject);
            }
            return;
          }
          catch (Exception localException)
          {
            localException.printStackTrace();
            localx.b(((JSONArray)localObject1).toString(), new FlyLogTools.a(FlyLogTools.this, str1));
          }
        }
      }).start();
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public void a(final k paramk)
  {
    try
    {
      new Thread(new Runnable()
      {
        public void run()
        {
          Object localObject = c.a();
          if (localObject == null) {}
          x localx;
          String str;
          do
          {
            return;
            localx = x.a((Context)localObject);
            str = com.fimi.soul.module.update.a.a.a().a(0).i();
            localObject = com.fimi.soul.base.a.b((Context)localObject);
          } while ((localObject == null) && (TextUtils.isEmpty(((User)localObject).getUserID())));
          c.c();
          localx.d(str, ((User)localObject).getUserID(), paramk);
        }
      }).start();
      return;
    }
    catch (Exception paramk)
    {
      paramk.printStackTrace();
    }
  }
  
  public void a(NetworkStateReceiver.a parama, Context paramContext)
  {
    long l;
    if ((parama == NetworkStateReceiver.a.a) || (parama == NetworkStateReceiver.a.b))
    {
      this.e = paramContext;
      l = System.currentTimeMillis();
      if (l - d >= 1000L) {}
    }
    else
    {
      return;
    }
    d = l;
    a();
  }
  
  private class a
    implements k
  {
    private String b;
    
    public a(String paramString)
    {
      this.b = paramString;
    }
    
    public void a(PlaneMsg paramPlaneMsg, File paramFile)
    {
      if ((!paramPlaneMsg.isSuccess()) || (FlyLogTools.this.b == null) || ("".equals(this.b))) {
        return;
      }
      FlyLogTools.this.b.b(this.b);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/utils/FlyLogTools.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */