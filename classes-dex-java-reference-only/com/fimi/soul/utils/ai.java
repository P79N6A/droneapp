package com.fimi.soul.utils;

import android.accounts.OperationCanceledException;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.fimi.kernel.c;
import com.fimi.soul.biz.m.k;
import com.fimi.soul.biz.manager.f;
import com.fimi.soul.biz.manager.x;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.User;
import com.fimi.soul.module.login.LoginActivity;
import com.xiaomi.account.openauth.XMAuthericationException;
import com.xiaomi.account.openauth.XiaomiOAuthFuture;
import com.xiaomi.account.openauth.XiaomiOAuthResults;
import com.xiaomi.account.openauth.XiaomiOAuthorize;
import com.xiaomi.mipush.sdk.MiPushClient;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

public class ai
  implements aj
{
  private static final String a = "http://dev.xiaomi.com";
  private XiaomiOAuthResults b;
  private User c = new User();
  private x d;
  private Context e;
  private aj.a f;
  private String g;
  
  private void a()
  {
    f.a(this.e).a(new k()
    {
      public void a(PlaneMsg paramAnonymousPlaneMsg, File paramAnonymousFile) {}
    });
    new AsyncTask()
    {
      Exception a;
      
      protected String a(Void... paramAnonymousVarArgs)
      {
        try
        {
          paramAnonymousVarArgs = (String)this.b.getResult();
          return paramAnonymousVarArgs;
        }
        catch (IOException paramAnonymousVarArgs)
        {
          this.a = paramAnonymousVarArgs;
          return null;
        }
        catch (OperationCanceledException paramAnonymousVarArgs)
        {
          this.a = paramAnonymousVarArgs;
          return null;
        }
        catch (XMAuthericationException paramAnonymousVarArgs)
        {
          this.a = paramAnonymousVarArgs;
        }
        return null;
      }
      
      protected void a(String paramAnonymousString)
      {
        if (paramAnonymousString == null) {}
        for (;;)
        {
          return;
          try
          {
            paramAnonymousString = new JSONObject(paramAnonymousString).getJSONObject("data");
            if ((paramAnonymousString.getString("phone") != null) && (paramAnonymousString.getString("phone").length() > 0))
            {
              ai.e(ai.this).setPhone(paramAnonymousString.getString("phone"));
              return;
            }
          }
          catch (JSONException paramAnonymousString)
          {
            paramAnonymousString.printStackTrace();
            return;
          }
          catch (NullPointerException paramAnonymousString)
          {
            paramAnonymousString.printStackTrace();
          }
        }
      }
      
      protected void onPreExecute()
      {
        com.fimi.soul.base.a.a("waiting for Future result...", LoginActivity.class);
      }
    }.execute(new Void[0]);
    new AsyncTask()
    {
      Exception a;
      
      protected String a(Void... paramAnonymousVarArgs)
      {
        try
        {
          paramAnonymousVarArgs = (String)this.b.getResult();
          return paramAnonymousVarArgs;
        }
        catch (IOException paramAnonymousVarArgs)
        {
          this.a = paramAnonymousVarArgs;
          return null;
        }
        catch (OperationCanceledException paramAnonymousVarArgs)
        {
          this.a = paramAnonymousVarArgs;
          return null;
        }
        catch (XMAuthericationException paramAnonymousVarArgs)
        {
          this.a = paramAnonymousVarArgs;
        }
        return null;
      }
      
      protected void a(String paramAnonymousString)
      {
        if (TextUtils.isEmpty(paramAnonymousString))
        {
          if (ai.c(ai.this) != null) {
            ai.c(ai.this).a(ai.d(ai.this).getResources().getString(2131362439));
          }
          return;
        }
        for (;;)
        {
          try
          {
            paramAnonymousString = new JSONObject(paramAnonymousString).getJSONObject("data");
            ai.e(ai.this).setXiaomiID(paramAnonymousString.getString("userId"));
            ai.e(ai.this).setName(paramAnonymousString.getString("miliaoNick"));
            ai.e(ai.this).setNickName(paramAnonymousString.getString("miliaoNick"));
            ai.e(ai.this).setDevice(ao.a(c.a()));
            if (paramAnonymousString.has("sex"))
            {
              if (paramAnonymousString.getString("sex").equals(ai.d(ai.this).getResources().getString(2131362447))) {
                ai.e(ai.this).setSex("1");
              }
            }
            else
            {
              if (paramAnonymousString.has("miliaoIcon_orig")) {
                ai.e(ai.this).setUserImgUrl(paramAnonymousString.getString("miliaoIcon_orig"));
              }
              ai.g(ai.this).d(ai.e(ai.this), new k()
              {
                public void a(PlaneMsg paramAnonymous2PlaneMsg, File paramAnonymous2File)
                {
                  ai.a(ai.this, paramAnonymous2PlaneMsg.getErrorMessage());
                  if (paramAnonymous2PlaneMsg.isSuccess())
                  {
                    MiPushClient.registerPush(ai.d(ai.this), "2882303761517518920", "5761751863920");
                    if (ai.c(ai.this) != null) {
                      ai.c(ai.this).a();
                    }
                  }
                  do
                  {
                    do
                    {
                      return;
                      if (ai.f(ai.this) == null) {
                        break;
                      }
                    } while (ai.c(ai.this) == null);
                    ai.c(ai.this).a(ai.f(ai.this));
                    return;
                  } while (ai.c(ai.this) == null);
                  ai.c(ai.this).a(ai.d(ai.this).getResources().getString(2131362440));
                }
              });
              return;
            }
          }
          catch (JSONException paramAnonymousString)
          {
            paramAnonymousString.printStackTrace();
            return;
          }
          if (paramAnonymousString.getString("sex").equals(ai.d(ai.this).getResources().getString(2131362916))) {
            ai.e(ai.this).setSex("0");
          }
        }
      }
      
      protected void onPreExecute()
      {
        com.fimi.soul.base.a.a("waiting for Future result...", LoginActivity.class);
      }
    }.execute(new Void[0]);
  }
  
  private <V> void a(final XiaomiOAuthFuture<V> paramXiaomiOAuthFuture)
  {
    new AsyncTask()
    {
      Exception a;
      
      protected V a(Void... paramAnonymousVarArgs)
      {
        try
        {
          paramAnonymousVarArgs = paramXiaomiOAuthFuture.getResult();
          return paramAnonymousVarArgs;
        }
        catch (IOException paramAnonymousVarArgs)
        {
          this.a = paramAnonymousVarArgs;
          return null;
        }
        catch (OperationCanceledException paramAnonymousVarArgs)
        {
          this.a = paramAnonymousVarArgs;
          return null;
        }
        catch (XMAuthericationException paramAnonymousVarArgs)
        {
          this.a = paramAnonymousVarArgs;
        }
        return null;
      }
      
      protected void onPostExecute(V paramAnonymousV)
      {
        if (paramAnonymousV != null) {
          if ((paramAnonymousV instanceof XiaomiOAuthResults))
          {
            ai.a(ai.this, (XiaomiOAuthResults)paramAnonymousV);
            if (ai.a(ai.this).getAccessToken() == null) {
              break label95;
            }
            com.fimi.soul.biz.g.a.c(c.a(), 0, ai.a(ai.this).getAccessToken());
            com.fimi.soul.biz.g.a.b(c.a(), 0, ai.a(ai.this).getMacKey());
            com.fimi.soul.biz.g.a.a(c.a(), 0, ai.a(ai.this).getMacAlgorithm());
            ai.b(ai.this);
          }
        }
        label95:
        do
        {
          do
          {
            do
            {
              return;
            } while (ai.c(ai.this) == null);
            ai.c(ai.this).a(ai.d(ai.this).getResources().getString(2131362439));
            return;
            if (this.a == null) {
              break;
            }
          } while (ai.c(ai.this) == null);
          ai.c(ai.this).b();
          return;
        } while (ai.c(ai.this) == null);
        ai.c(ai.this).a(ai.d(ai.this).getResources().getString(2131362439));
      }
      
      protected void onPreExecute()
      {
        com.fimi.soul.base.a.a("waiting for Future result...", LoginActivity.class);
      }
    }.execute(new Void[0]);
  }
  
  public void a(Context paramContext, aj.a parama)
  {
    this.e = paramContext;
    this.f = parama;
    this.d = x.a(paramContext);
    parama = new int[4];
    a(new XiaomiOAuthorize().setAppId(Long.parseLong("2882303761517518920")).setRedirectUrl("http://dev.xiaomi.com").setScope(Arrays.copyOf(parama, 0)).setKeepCookies(true).setNoMiui(false).setSkipConfirm(false).startGetAccessToken((Activity)paramContext));
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/utils/ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */