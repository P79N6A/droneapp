package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.e;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abk;
import com.google.android.gms.internal.abl;
import com.google.android.gms.internal.abr;
import com.google.android.gms.internal.abv;
import com.google.android.gms.internal.acr.b;
import com.google.android.gms.internal.acr.c;
import com.google.android.gms.internal.acy;
import com.google.android.gms.internal.ub;
import com.google.android.gms.internal.uf;
import com.google.android.gms.internal.vt;
import com.google.android.gms.internal.wx;
import com.google.android.gms.internal.wx.c;
import com.google.android.gms.internal.wy;
import java.util.Map;
import org.json.JSONObject;

@aaa
public class g
{
  public final vt a = new vt()
  {
    public void a(acy paramAnonymousacy, Map<String, String> paramAnonymousMap)
    {
      paramAnonymousacy.b("/appSettingsFetched", this);
      paramAnonymousacy = g.a(g.this);
      if (paramAnonymousMap != null) {}
      try
      {
        if ("true".equalsIgnoreCase((String)paramAnonymousMap.get("isSuccessful")))
        {
          paramAnonymousMap = (String)paramAnonymousMap.get("appSettingsJson");
          u.i().a(g.b(g.this), paramAnonymousMap);
        }
        return;
      }
      finally {}
    }
  };
  private final Object b = new Object();
  private Context c;
  
  private static boolean a(@Nullable abk paramabk)
  {
    if (paramabk == null) {
      return true;
    }
    long l = paramabk.a();
    int i;
    if (u.k().a() - l > ((Long)uf.cf.c()).longValue())
    {
      i = 1;
      if ((i == 0) && (paramabk.b())) {
        break label61;
      }
    }
    label61:
    for (boolean bool = true;; bool = false)
    {
      return bool;
      i = 0;
      break;
    }
  }
  
  public void a(final Context paramContext, final VersionInfoParcel paramVersionInfoParcel, final boolean paramBoolean, @Nullable abk paramabk, final String paramString1, @Nullable final String paramString2)
  {
    if (!a(paramabk)) {
      return;
    }
    if (paramContext == null)
    {
      abr.d("Context not provided to fetch application settings");
      return;
    }
    if ((TextUtils.isEmpty(paramString1)) && (TextUtils.isEmpty(paramString2)))
    {
      abr.d("App settings could not be fetched. Required parameters missing");
      return;
    }
    this.c = paramContext;
    paramVersionInfoParcel = u.e().a(paramContext, paramVersionInfoParcel);
    abv.a.post(new Runnable()
    {
      public void run()
      {
        paramVersionInfoParcel.a().a(new acr.c()new acr.b
        {
          public void a(wy paramAnonymous2wy)
          {
            paramAnonymous2wy.a("/appSettingsFetched", g.this.a);
            try
            {
              JSONObject localJSONObject = new JSONObject();
              if (!TextUtils.isEmpty(g.2.this.b)) {
                localJSONObject.put("app_id", g.2.this.b);
              }
              for (;;)
              {
                localJSONObject.put("is_init", g.2.this.d);
                localJSONObject.put("pn", g.2.this.e.getPackageName());
                paramAnonymous2wy.a("AFMA_fetchAppSettings", localJSONObject);
                return;
                if (!TextUtils.isEmpty(g.2.this.c)) {
                  localJSONObject.put("ad_unit_id", g.2.this.c);
                }
              }
              return;
            }
            catch (Exception localException)
            {
              paramAnonymous2wy.b("/appSettingsFetched", g.this.a);
              abr.b("Error requesting application settings", localException);
            }
          }
        }, new acr.b());
      }
    });
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */