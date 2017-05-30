package cn.sharesdk.framework.b;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import cn.sharesdk.framework.b.a.e;
import com.mob.tools.log.NLog;
import com.mob.tools.network.KVPair;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.network.NetworkHelper.NetworkTimeOut;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.DeviceHelper;
import com.mob.tools.utils.Hashon;
import com.mob.tools.utils.R;
import java.util.ArrayList;
import java.util.HashMap;

public class c
{
  private String a;
  private Context b;
  private e c;
  private DeviceHelper d;
  private NetworkHelper e;
  private Hashon f;
  private String g;
  private String h;
  private boolean i;
  private HashMap<String, String> j;
  
  public c(Context paramContext, String paramString)
  {
    this.a = paramString;
    this.b = paramContext.getApplicationContext();
    this.c = e.a(this.b);
    this.d = DeviceHelper.getInstance(this.b);
    this.e = new NetworkHelper();
    this.f = new Hashon();
    try
    {
      this.j = ((HashMap)this.c.h("buffered_server_paths"));
      g();
      return;
    }
    catch (Throwable paramContext)
    {
      for (;;)
      {
        this.j = new HashMap();
      }
    }
  }
  
  private String d(String paramString)
  {
    boolean bool1 = this.c.b();
    boolean bool2 = this.c.c();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(Data.urlEncode(this.d.getPackageName(), "utf-8")).append("|");
    localStringBuilder.append(Data.urlEncode(this.d.getAppVersionName(), "utf-8")).append("|");
    localStringBuilder.append(Data.urlEncode(String.valueOf(60068), "utf-8")).append("|");
    localStringBuilder.append(Data.urlEncode(String.valueOf(this.d.getPlatformCode()), "utf-8")).append("|");
    localStringBuilder.append(Data.urlEncode(this.d.getDetailNetworkTypeForStatic(), "utf-8")).append("|");
    if (bool1)
    {
      localStringBuilder.append(Data.urlEncode(String.valueOf(this.d.getOSVersionInt()), "utf-8")).append("|");
      localStringBuilder.append(Data.urlEncode(this.d.getScreenSize(), "utf-8")).append("|");
      localStringBuilder.append(Data.urlEncode(this.d.getManufacturer(), "utf-8")).append("|");
      localStringBuilder.append(Data.urlEncode(this.d.getModel(), "utf-8")).append("|");
      localStringBuilder.append(Data.urlEncode(this.d.getCarrier(), "utf-8")).append("|");
      if (!bool2) {
        break label346;
      }
      localStringBuilder.append(paramString);
    }
    for (;;)
    {
      paramString = localStringBuilder.toString();
      cn.sharesdk.framework.utils.d.a().i("shorLinkMsg ===>>>>", new Object[] { paramString });
      return Base64.encodeToString(Data.AES128Encode(Data.rawMD5(String.format("%s:%s", new Object[] { this.d.getDeviceKey(), this.a })), paramString), 2);
      localStringBuilder.append("|||||");
      break;
      label346:
      localStringBuilder.append(paramString.split("\\|")[0]);
      localStringBuilder.append("|||||");
    }
  }
  
  private void g()
  {
    String str1 = this.d.getPackageName() + "/" + this.d.getAppVersionName();
    String str2 = "Android/" + this.d.getOSVersionInt();
    this.g = (str1 + " " + "ShareSDK/2.7.10" + " " + str2);
    this.h = "http://api.share.mob.com:80";
    this.i = true;
  }
  
  private String h()
  {
    return this.h + "/conn";
  }
  
  private String i()
  {
    if ((this.j != null) && (this.j.containsKey("/date"))) {
      return (String)this.j.get("/date") + "/date";
    }
    return this.h + "/date";
  }
  
  private String j()
  {
    return this.h + "/conf5";
  }
  
  private String k()
  {
    return "http://up.sharesdk.cn/upload/image";
  }
  
  private String l()
  {
    if ((this.j != null) && (this.j.containsKey("/log4"))) {
      return (String)this.j.get("/log4") + "/log4";
    }
    return this.h + "/log4";
  }
  
  private String m()
  {
    return "http://l.mob.com/url/ShareSdkMapping.do";
  }
  
  private String n()
  {
    if ((this.j != null) && (this.j.containsKey("/snsconf"))) {
      return (String)this.j.get("/snsconf") + "/snsconf";
    }
    return this.h + "/snsconf";
  }
  
  public HashMap<String, Object> a()
  {
    Object localObject = new ArrayList();
    ((ArrayList)localObject).add(new KVPair("appkey", this.a));
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new KVPair("User-Agent", this.g));
    NetworkHelper.NetworkTimeOut localNetworkTimeOut = new NetworkHelper.NetworkTimeOut();
    localNetworkTimeOut.readTimout = 30000;
    localNetworkTimeOut.connectionTimeout = 30000;
    localObject = this.e.httpPost(h(), (ArrayList)localObject, null, localArrayList, localNetworkTimeOut);
    cn.sharesdk.framework.utils.d.a().i(" isConnectToServer response == %s", new Object[] { localObject });
    return this.f.fromJson((String)localObject);
  }
  
  public HashMap<String, Object> a(String paramString1, ArrayList<String> paramArrayList, int paramInt, String paramString2)
  {
    if (!this.i) {}
    do
    {
      do
      {
        return null;
        paramString1 = new ArrayList();
        paramString1.add(new KVPair("key", this.a));
        int k = 0;
        while (k < paramArrayList.size())
        {
          paramString1.add(new KVPair("urls", ((String)paramArrayList.get(k)).toString()));
          k += 1;
        }
        paramString1.add(new KVPair("deviceid", this.d.getDeviceKey()));
        paramString1.add(new KVPair("snsplat", String.valueOf(paramInt)));
        paramArrayList = d(paramString2);
      } while (TextUtils.isEmpty(paramArrayList));
      paramString1.add(new KVPair("m", paramArrayList));
      paramArrayList = new ArrayList();
      paramArrayList.add(new KVPair("User-Agent", this.g));
      paramString2 = new NetworkHelper.NetworkTimeOut();
      paramString2.readTimout = 5000;
      paramString2.connectionTimeout = 5000;
      paramString1 = this.e.httpPost(m(), paramString1, null, paramArrayList, paramString2);
      cn.sharesdk.framework.utils.d.a().i("> SERVER_SHORT_LINK_URL  resp: %s", new Object[] { paramString1 });
      if (TextUtils.isEmpty(paramString1))
      {
        this.i = false;
        return null;
      }
      paramString1 = this.f.fromJson(paramString1);
    } while (((Integer)paramString1.get("status")).intValue() != 200);
    return paramString1;
  }
  
  public void a(cn.sharesdk.framework.b.b.c paramc)
  {
    cn.sharesdk.framework.b.a.d.a(this.b, paramc.toString(), paramc.e);
  }
  
  public void a(String paramString)
  {
    this.h = paramString;
  }
  
  public void a(ArrayList<String> paramArrayList)
  {
    cn.sharesdk.framework.b.a.d.a(this.b, paramArrayList);
  }
  
  public void a(HashMap<String, String> paramHashMap)
  {
    this.j = paramHashMap;
    this.c.a("buffered_server_paths", this.j);
  }
  
  public boolean a(String paramString, boolean paramBoolean)
  {
    try
    {
      if ("none".equals(this.d.getDetailNetworkTypeForStatic())) {
        throw new IllegalStateException("network is disconnected!");
      }
    }
    catch (Throwable paramString)
    {
      cn.sharesdk.framework.utils.d.a().d(paramString);
      return false;
    }
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new KVPair("m", paramString));
    if (paramBoolean) {}
    for (paramString = "1";; paramString = "0")
    {
      localArrayList.add(new KVPair("t", paramString));
      paramString = new ArrayList();
      paramString.add(new KVPair("User-Agent", this.g));
      NetworkHelper.NetworkTimeOut localNetworkTimeOut = new NetworkHelper.NetworkTimeOut();
      localNetworkTimeOut.readTimout = 30000;
      localNetworkTimeOut.connectionTimeout = 30000;
      paramString = this.e.httpPost(l(), localArrayList, null, paramString, localNetworkTimeOut);
      cn.sharesdk.framework.utils.d.a().i("> Upload All Log  resp: %s", new Object[] { paramString });
      if ((TextUtils.isEmpty(paramString)) || (((Integer)this.f.fromJson(paramString).get("status")).intValue() == 200)) {
        break;
      }
      return false;
    }
    return true;
  }
  
  public long b()
  {
    if (!this.c.g()) {
      return 0L;
    }
    Object localObject = "{}";
    try
    {
      String str = this.e.httpGet(i(), null, null, null);
      localObject = str;
    }
    catch (Throwable localThrowable2)
    {
      for (;;)
      {
        cn.sharesdk.framework.utils.d.a().d(localThrowable2);
      }
    }
    localObject = this.f.fromJson((String)localObject);
    if (((HashMap)localObject).containsKey("timestamp")) {
      try
      {
        long l = R.parseLong(String.valueOf(((HashMap)localObject).get("timestamp")));
        l = System.currentTimeMillis() - l;
        this.c.a("service_time", Long.valueOf(l));
        return l;
      }
      catch (Throwable localThrowable1)
      {
        cn.sharesdk.framework.utils.d.a().d(localThrowable1);
        return this.c.a();
      }
    }
    return this.c.a();
  }
  
  public HashMap<String, Object> b(String paramString)
  {
    paramString = new KVPair("file", paramString);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new KVPair("User-Agent", this.g));
    paramString = this.e.httpPost(k(), null, paramString, localArrayList, null);
    cn.sharesdk.framework.utils.d.a().i("upload file response == %s", new Object[] { paramString });
    return this.f.fromJson(paramString);
  }
  
  public void b(HashMap<String, Object> paramHashMap)
  {
    paramHashMap = this.f.fromHashMap(paramHashMap);
    this.c.a(this.a, paramHashMap);
  }
  
  public HashMap<String, Object> c()
  {
    Object localObject = new ArrayList();
    ((ArrayList)localObject).add(new KVPair("appkey", this.a));
    ((ArrayList)localObject).add(new KVPair("device", this.d.getDeviceKey()));
    ((ArrayList)localObject).add(new KVPair("plat", String.valueOf(this.d.getPlatformCode())));
    ((ArrayList)localObject).add(new KVPair("apppkg", this.d.getPackageName()));
    ((ArrayList)localObject).add(new KVPair("appver", String.valueOf(this.d.getAppVersion())));
    ((ArrayList)localObject).add(new KVPair("sdkver", String.valueOf(60068)));
    ((ArrayList)localObject).add(new KVPair("networktype", this.d.getDetailNetworkTypeForStatic()));
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new KVPair("User-Agent", this.g));
    NetworkHelper.NetworkTimeOut localNetworkTimeOut = new NetworkHelper.NetworkTimeOut();
    localNetworkTimeOut.readTimout = 10000;
    localNetworkTimeOut.connectionTimeout = 10000;
    localObject = this.e.httpPost(j(), (ArrayList)localObject, null, localArrayList, localNetworkTimeOut);
    cn.sharesdk.framework.utils.d.a().i(" get server config response == %s", new Object[] { localObject });
    return this.f.fromJson((String)localObject);
  }
  
  public HashMap<String, Object> c(String paramString)
  {
    paramString = Base64.decode(paramString, 2);
    String str = this.d.getDeviceKey();
    paramString = new String(Data.AES128Decode(Data.rawMD5(this.a + ":" + str), paramString), "UTF-8").trim();
    return this.f.fromJson(paramString);
  }
  
  public HashMap<String, Object> d()
  {
    Object localObject = new ArrayList();
    ((ArrayList)localObject).add(new KVPair("appkey", this.a));
    ((ArrayList)localObject).add(new KVPair("device", this.d.getDeviceKey()));
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new KVPair("User-Agent", this.g));
    NetworkHelper.NetworkTimeOut localNetworkTimeOut = new NetworkHelper.NetworkTimeOut();
    localNetworkTimeOut.readTimout = 10000;
    localNetworkTimeOut.connectionTimeout = 10000;
    localObject = this.e.httpPost(n(), (ArrayList)localObject, null, localArrayList, localNetworkTimeOut);
    return this.f.fromJson((String)localObject);
  }
  
  public ArrayList<cn.sharesdk.framework.b.a.c> e()
  {
    ArrayList localArrayList2 = cn.sharesdk.framework.b.a.d.a(this.b);
    ArrayList localArrayList1 = localArrayList2;
    if (localArrayList2 == null) {
      localArrayList1 = new ArrayList();
    }
    return localArrayList1;
  }
  
  public HashMap<String, Object> f()
  {
    String str = this.c.e(this.a);
    return this.f.fromJson(str);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/cn/sharesdk/framework/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */