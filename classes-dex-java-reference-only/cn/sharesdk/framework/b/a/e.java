package cn.sharesdk.framework.b.a;

import android.content.Context;
import android.text.TextUtils;
import com.mob.tools.utils.SharePrefrenceHelper;

public class e
{
  private static e c;
  private Context a;
  private SharePrefrenceHelper b;
  
  private e(Context paramContext)
  {
    this.a = paramContext.getApplicationContext();
    this.b = new SharePrefrenceHelper(this.a);
    this.b.open("share_sdk", 1);
  }
  
  public static e a(Context paramContext)
  {
    if (c == null) {
      c = new e(paramContext.getApplicationContext());
    }
    return c;
  }
  
  public long a()
  {
    return this.b.getLong("service_time");
  }
  
  public void a(long paramLong)
  {
    this.b.putLong("device_time", Long.valueOf(paramLong));
  }
  
  public void a(String paramString)
  {
    this.b.putString("trans_short_link", paramString);
  }
  
  public void a(String paramString, int paramInt)
  {
    this.b.putInt(paramString, Integer.valueOf(paramInt));
  }
  
  public void a(String paramString, Long paramLong)
  {
    this.b.putLong(paramString, paramLong);
  }
  
  public void a(String paramString, Object paramObject)
  {
    this.b.put(paramString, paramObject);
  }
  
  public void a(String paramString1, String paramString2)
  {
    this.b.putString("buffered_snsconf_" + paramString1, paramString2);
  }
  
  public void a(boolean paramBoolean)
  {
    this.b.putBoolean("connect_server", Boolean.valueOf(paramBoolean));
  }
  
  public void b(long paramLong)
  {
    this.b.putLong("connect_server_time", Long.valueOf(paramLong));
  }
  
  public void b(String paramString)
  {
    this.b.putString("upload_device_info", paramString);
  }
  
  public boolean b()
  {
    String str = this.b.getString("upload_device_info");
    if (TextUtils.isEmpty(str)) {
      return true;
    }
    return Boolean.parseBoolean(str);
  }
  
  public void c(String paramString)
  {
    this.b.putString("upload_user_info", paramString);
  }
  
  public boolean c()
  {
    String str = this.b.getString("upload_user_info");
    if (TextUtils.isEmpty(str)) {
      return true;
    }
    return Boolean.parseBoolean(str);
  }
  
  public void d(String paramString)
  {
    this.b.putString("upload_share_content", paramString);
  }
  
  public boolean d()
  {
    String str = this.b.getString("trans_short_link");
    if (TextUtils.isEmpty(str)) {
      return false;
    }
    return Boolean.parseBoolean(str);
  }
  
  public int e()
  {
    String str = this.b.getString("upload_share_content");
    if ("true".equals(str)) {
      return 1;
    }
    if ("false".equals(str)) {
      return -1;
    }
    return 0;
  }
  
  public String e(String paramString)
  {
    return this.b.getString("buffered_snsconf_" + paramString);
  }
  
  public long f(String paramString)
  {
    return this.b.getLong(paramString);
  }
  
  public Long f()
  {
    return Long.valueOf(this.b.getLong("device_time"));
  }
  
  public int g(String paramString)
  {
    return this.b.getInt(paramString);
  }
  
  public boolean g()
  {
    return this.b.getBoolean("connect_server");
  }
  
  public Long h()
  {
    return Long.valueOf(this.b.getLong("connect_server_time"));
  }
  
  public Object h(String paramString)
  {
    return this.b.get(paramString);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/cn/sharesdk/framework/b/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */