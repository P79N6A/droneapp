package com.fimi.soul.biz.manager;

import android.content.Context;
import android.os.Build.VERSION;
import com.fimi.kernel.b.e;
import com.fimi.kernel.b.e.b;
import com.fimi.kernel.c;
import com.fimi.kernel.utils.z;
import com.fimi.soul.utils.NetUtil;
import com.fimi.soul.utils.ao;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

public class d
{
  private static d a = null;
  private Context b;
  private b c = null;
  
  public d(Context paramContext)
  {
    this.b = paramContext;
    this.c = ((b)c.a(com.fimi.kernel.b.d.b));
  }
  
  public static d a(Context paramContext)
  {
    if (a == null) {
      a = new d(paramContext);
    }
    return a;
  }
  
  public void a(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new BasicNameValuePair("commandCode", "commitCrashMsg"));
    localArrayList.add(new BasicNameValuePair("versionCode", ao.e(this.b)));
    localArrayList.add(new BasicNameValuePair("versionName", ao.d(this.b)));
    localArrayList.add(new BasicNameValuePair("packageName", this.b.getPackageName()));
    localArrayList.add(new BasicNameValuePair("crashTime", ao.b(System.currentTimeMillis())));
    localArrayList.add(new BasicNameValuePair("deviceName", ao.a()));
    localArrayList.add(new BasicNameValuePair("systemVersion", ao.b()));
    localArrayList.add(new BasicNameValuePair("sdkVersion", Build.VERSION.SDK_INT + ""));
    localArrayList.add(new BasicNameValuePair("channel", "Android"));
    localArrayList.add(new BasicNameValuePair("crashMsg", paramString));
    NetUtil.a(localArrayList, this.b);
    paramString = String.format("%s?%s", new Object[] { "https://fimiservice-us.mi-ae.com/android/fimi.service", URLEncodedUtils.format(localArrayList, "UTF-8") });
    this.c.a(paramString, new e()
    {
      public void a(String paramAnonymousString)
      {
        if ((paramAnonymousString != null) && (paramAnonymousString.length() > 0)) {
          z.a(d.a(d.this), 2131362080);
        }
      }
      
      public void b(String paramAnonymousString) {}
    });
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/manager/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */