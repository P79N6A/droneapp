package com.fimi.soul.biz.b;

import android.content.Context;
import com.fimi.kernel.b.e;
import com.fimi.kernel.b.e.b;
import com.fimi.kernel.c;
import com.fimi.soul.entity.UpdateDroneInforBean;
import com.fimi.soul.utils.NetUtil;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

public class a
{
  private b a = null;
  private UpdateDroneInforBean b;
  private Context c;
  
  public a(Context paramContext)
  {
    this.c = paramContext;
    this.a = ((b)c.a(com.fimi.kernel.b.d.b));
    this.b = ((UpdateDroneInforBean)c.c().a("flyinfo", UpdateDroneInforBean.class));
  }
  
  public void a()
  {
    Object localObject;
    if ((this.b != null) && (!"".equals(this.b.getPlaneID())))
    {
      localObject = new ArrayList();
      ((List)localObject).add(new BasicNameValuePair("commandCode", "commitDeviceVersion"));
      ((List)localObject).add(new BasicNameValuePair("userID", this.b.getUserID() + ""));
      ((List)localObject).add(new BasicNameValuePair("planeID", this.b.getPlaneID()));
      if (!com.fimi.soul.biz.e.d.a().k()) {
        break label234;
      }
      ((List)localObject).add(new BasicNameValuePair("fcType", "F11B-C"));
    }
    for (;;)
    {
      Gson localGson = new Gson();
      localGson.toJson(this.b.getmDroneInfoBean());
      ((List)localObject).add(new BasicNameValuePair("jsonStr", localGson.toJson(this.b.getmDroneInfoBean())));
      NetUtil.a((List)localObject, c.a());
      localObject = String.format("%s?%s", new Object[] { "https://fimiservice-us.mi-ae.com/android/fimi.service", URLEncodedUtils.format((List)localObject, "UTF-8") });
      this.a.a((String)localObject, new e()
      {
        public void a(String paramAnonymousString)
        {
          if ((paramAnonymousString != null) && (paramAnonymousString.length() > 0)) {}
        }
        
        public void b(String paramAnonymousString) {}
      });
      return;
      label234:
      ((List)localObject).add(new BasicNameValuePair("fcType", "F11B-A"));
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */