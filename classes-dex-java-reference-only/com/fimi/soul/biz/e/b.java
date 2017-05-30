package com.fimi.soul.biz.e;

import android.os.Message;
import android.util.Log;
import com.fimi.kernel.b.d;
import com.fimi.kernel.b.e;
import com.fimi.kernel.c;
import com.fimi.soul.entity.APConfig;
import com.fimi.soul.entity.APStatus;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class b
  extends com.fimi.kernel.b
{
  public static final String a = "PSK_KEY";
  public static final String b = "AP_SSID";
  public static final String c = "AP_PRIMARY_CH";
  public static final String d = "DEF_ATH_countrycode";
  public static final String e = "VERSION";
  public static final String f = "AP_IPADDR";
  public static final String g = "ATH_txpower";
  public static final String h = "ERROR_INFO";
  public static final String i = "SIGNAL_INFO";
  public static String j = "UNCONNECT_CAMERA";
  public static final String k = "SP_KEY_CACHE_APCONFIG";
  private static String l = "http://192.168.42.100/cgi-bin";
  private static String m = "\".*\"";
  private com.fimi.kernel.b.e.b n = null;
  private Map<String, String> o = new HashMap();
  private Pattern p = Pattern.compile(m);
  private com.fimi.kernel.b.a q = (com.fimi.kernel.b.a)c.a(d.d);
  
  private boolean a(String[] paramArrayOfString, String paramString)
  {
    boolean bool2 = false;
    int i2 = paramArrayOfString.length;
    int i1 = 0;
    for (;;)
    {
      boolean bool1 = bool2;
      if (i1 < i2)
      {
        if (paramArrayOfString[i1].equals(paramString)) {
          bool1 = true;
        }
      }
      else {
        return bool1;
      }
      i1 += 1;
    }
  }
  
  private void b(String paramString1, String paramString2, final e<Boolean> parame)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put(paramString1, paramString2);
    this.n.a(c("VAPcfg"), localHashMap, new e()
    {
      public void a(String paramAnonymousString)
      {
        if (paramAnonymousString != null)
        {
          parame.a(Boolean.valueOf(true));
          return;
        }
        parame.a(Boolean.valueOf(false));
      }
      
      public void b(String paramAnonymousString)
      {
        if (paramAnonymousString == null)
        {
          parame.a(Boolean.valueOf(true));
          return;
        }
        parame.a(Boolean.valueOf(false));
      }
    });
  }
  
  private String c(String paramString)
  {
    return String.format("%s/%s", new Object[] { l, paramString });
  }
  
  private APConfig d()
  {
    APConfig localAPConfig = new APConfig();
    if ((this.o != null) && (this.o.size() > 0))
    {
      localAPConfig.setApPwd((String)this.o.get("PSK_KEY"));
      localAPConfig.setSsid((String)this.o.get("AP_SSID"));
      localAPConfig.setPrimaryChannel((String)this.o.get("AP_PRIMARY_CH"));
      localAPConfig.setCountryCode((String)this.o.get("DEF_ATH_countrycode"));
      localAPConfig.setVersion((String)this.o.get("VERSION"));
      localAPConfig.setIpAddr((String)this.o.get("AP_IPADDR"));
      localAPConfig.setPower((String)this.o.get("ATH_txpower"));
      localAPConfig.setConCameraStatus((String)this.o.get("ERROR_INFO"));
      if (this.o.get("SIGNAL_INFO") != null) {
        localAPConfig.setSignalInfo(Integer.parseInt((String)this.o.get("SIGNAL_INFO")));
      }
    }
    return localAPConfig;
  }
  
  protected void a(Message paramMessage) {}
  
  public void a(final e<APStatus> parame)
  {
    this.n.b(c("status.cgi"), new e()
    {
      public void a(String paramAnonymousString)
      {
        Log.d("Good", paramAnonymousString + "SUCCESS");
        APStatus localAPStatus = new APStatus();
        paramAnonymousString = b.a(b.this).matcher(paramAnonymousString);
        if (paramAnonymousString.find()) {
          localAPStatus.setSsid(paramAnonymousString.group().replace("\"", ""));
        }
        parame.a(localAPStatus);
      }
      
      public void b(String paramAnonymousString)
      {
        parame.b(null);
      }
    });
  }
  
  public void a(APConfig paramAPConfig, final e<Boolean> parame)
  {
    if (paramAPConfig != null)
    {
      a locala = new a(String.format("%s/setting.cgi", new Object[] { l }));
      locala.a("PSK_KEY", paramAPConfig.getApPwd());
      locala.a("DEF_ATH_countrycode", paramAPConfig.getCountryCode());
      locala.a("ATH_txpower", paramAPConfig.getPower());
      locala.a("AP_SSID", paramAPConfig.getSsid());
      locala.a("VERSION", paramAPConfig.getVersion());
      paramAPConfig = locala.a();
      Log.d("Good", paramAPConfig);
      this.q.a(paramAPConfig, new e()
      {
        public void a(String paramAnonymousString)
        {
          b.this.c(new e()
          {
            public void a(Boolean paramAnonymous2Boolean)
            {
              b.3.this.a.a(paramAnonymous2Boolean);
            }
            
            public void b(Boolean paramAnonymous2Boolean)
            {
              b.3.this.a.b(paramAnonymous2Boolean);
            }
          });
        }
        
        public void b(String paramAnonymousString)
        {
          parame.a(Boolean.valueOf(false));
        }
      });
    }
  }
  
  public void a(String paramString1, String paramString2, final e<Boolean> parame)
  {
    a locala = new a(String.format("%s/setting.cgi", new Object[] { l }));
    locala.a(paramString1, paramString2);
    paramString1 = locala.a();
    this.q.a(paramString1, new e()
    {
      public void a(String paramAnonymousString)
      {
        Log.d("Good", paramAnonymousString);
        parame.a(Boolean.valueOf(true));
      }
      
      public void b(String paramAnonymousString)
      {
        parame.a(Boolean.valueOf(false));
      }
    });
  }
  
  public boolean a(String paramString)
  {
    return a(c(), paramString);
  }
  
  public boolean a(String paramString1, String paramString2)
  {
    return a(b(paramString1), paramString2);
  }
  
  public APConfig b()
  {
    APConfig localAPConfig2 = (APConfig)c.c().a("SP_KEY_CACHE_APCONFIG", APConfig.class);
    APConfig localAPConfig1 = localAPConfig2;
    if (localAPConfig2 == null) {
      localAPConfig1 = new APConfig();
    }
    return localAPConfig1;
  }
  
  public void b(final e<APConfig> parame)
  {
    this.o.clear();
    this.n.b(c("config.cgi"), new e()
    {
      public void a(String paramAnonymousString)
      {
        if ((paramAnonymousString != null) && (paramAnonymousString.length() > 3))
        {
          paramAnonymousString = new Scanner(paramAnonymousString.substring(4));
          while (paramAnonymousString.hasNextLine())
          {
            String[] arrayOfString = paramAnonymousString.nextLine().split("=");
            if ((arrayOfString != null) && (arrayOfString.length == 2)) {
              b.b(b.this).put(arrayOfString[0], arrayOfString[1]);
            }
          }
        }
        paramAnonymousString = b.c(b.this);
        c.c().a("SP_KEY_CACHE_APCONFIG", paramAnonymousString);
        parame.a(paramAnonymousString);
      }
      
      public void b(String paramAnonymousString)
      {
        parame.b(new APConfig());
      }
    });
  }
  
  public String[] b(String paramString)
  {
    String[] arrayOfString = null;
    if (a(a.a, paramString)) {
      arrayOfString = a.d;
    }
    do
    {
      return arrayOfString;
      if (a(a.c, paramString)) {
        return a.f;
      }
    } while (!a(a.b, paramString));
    return a.b;
  }
  
  public void c(final e<Boolean> parame)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("INDEX", "1");
    localHashMap.put("COMMIT", "Save");
    this.n.a(c("VAPcfg"), localHashMap, new e()
    {
      public void a(String paramAnonymousString)
      {
        parame.a(Boolean.valueOf(true));
      }
      
      public void b(String paramAnonymousString)
      {
        parame.b(Boolean.valueOf(false));
      }
    });
  }
  
  public String[] c()
  {
    return b(b().getCountryCode());
  }
  
  public void d(e<Boolean> parame)
  {
    b("RebootButton", "Reboot", parame);
  }
  
  public void e(e<Boolean> parame)
  {
    b("", "FactoryReset", parame);
  }
  
  private class a
  {
    private StringBuilder b = new StringBuilder();
    
    public a(String paramString)
    {
      this.b.append(paramString);
      this.b.append("?");
    }
    
    public String a()
    {
      return this.b.toString();
    }
    
    public void a(String paramString1, String paramString2)
    {
      if ((paramString1 != null) && (paramString2 != null) && (paramString2.trim().length() > 0)) {
        this.b.append(String.format("%s=%s&", new Object[] { paramString1, paramString2 }));
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/e/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */