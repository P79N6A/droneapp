package com.fimi.soul.module.push;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.fimi.soul.base.a;
import com.fimi.soul.biz.m.k;
import com.fimi.soul.biz.manager.m;
import com.fimi.soul.entity.HistoryPushMessage;
import com.fimi.soul.entity.MessagePush;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.User;
import com.fimi.soul.module.droneui.FlightActivity;
import com.fimi.soul.module.login.LoginActivity;
import com.fimi.soul.utils.a.b;
import com.fimi.soul.utils.ao;
import com.xiaomi.mipush.sdk.MiPushCommandMessage;
import com.xiaomi.mipush.sdk.MiPushMessage;
import com.xiaomi.mipush.sdk.PushMessageReceiver;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class DroipMessageReceiver
  extends PushMessageReceiver
{
  private String a;
  private long b = -1L;
  private String c;
  private String d;
  private String e;
  private String f;
  private String g;
  private String h;
  private String i;
  private String j;
  
  public void onCommandResult(Context paramContext, MiPushCommandMessage paramMiPushCommandMessage)
  {
    String str = paramMiPushCommandMessage.getCommand();
    Object localObject2 = paramMiPushCommandMessage.getCommandArguments();
    Object localObject1;
    if ((localObject2 != null) && (((List)localObject2).size() > 0))
    {
      localObject1 = (String)((List)localObject2).get(0);
      if ((localObject2 == null) || (((List)localObject2).size() <= 1)) {
        break label105;
      }
      localObject2 = (String)((List)localObject2).get(1);
      label68:
      if (!"register".equals(str)) {
        break label163;
      }
      if (paramMiPushCommandMessage.getResultCode() == 0L)
      {
        this.a = ((String)localObject1);
        if (this.a != null) {
          break label111;
        }
      }
    }
    label105:
    label111:
    label163:
    label188:
    label213:
    label238:
    label263:
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              return;
              localObject1 = null;
              break;
              localObject2 = null;
              break label68;
              paramMiPushCommandMessage = m.a(paramContext);
              localObject1 = new MessagePush();
              ((MessagePush)localObject1).setUserID(a.b(paramContext).getUserID());
              ((MessagePush)localObject1).setMiRegID(this.a);
              ((MessagePush)localObject1).setAppType("0");
              paramMiPushCommandMessage.a((MessagePush)localObject1, new k()
              {
                public void a(PlaneMsg paramAnonymousPlaneMsg, File paramAnonymousFile) {}
              });
              return;
              if (!"set-alias".equals(str)) {
                break label188;
              }
            } while (paramMiPushCommandMessage.getResultCode() != 0L);
            this.g = ((String)localObject1);
            return;
            if (!"unset-alias".equals(str)) {
              break label213;
            }
          } while (paramMiPushCommandMessage.getResultCode() != 0L);
          this.g = ((String)localObject1);
          return;
          if (!"subscribe-topic".equals(str)) {
            break label238;
          }
        } while (paramMiPushCommandMessage.getResultCode() != 0L);
        this.f = ((String)localObject1);
        return;
        if (!"unsubscibe-topic".equals(str)) {
          break label263;
        }
      } while (paramMiPushCommandMessage.getResultCode() != 0L);
      this.f = ((String)localObject1);
      return;
    } while ((!"accept-time".equals(str)) || (paramMiPushCommandMessage.getResultCode() != 0L));
    this.i = ((String)localObject1);
    this.j = ((String)localObject2);
  }
  
  public void onNotificationMessageArrived(Context paramContext, MiPushMessage paramMiPushMessage)
  {
    this.e = paramMiPushMessage.getContent();
    if (!TextUtils.isEmpty(paramMiPushMessage.getTopic())) {
      this.f = paramMiPushMessage.getTopic();
    }
    HistoryPushMessage localHistoryPushMessage;
    for (;;)
    {
      paramContext = b.a(paramContext);
      localHistoryPushMessage = new HistoryPushMessage();
      localHistoryPushMessage.setId((String)paramMiPushMessage.getExtra().get("id"));
      if (!paramContext.b(localHistoryPushMessage)) {
        break;
      }
      return;
      if (!TextUtils.isEmpty(paramMiPushMessage.getAlias())) {
        this.g = paramMiPushMessage.getAlias();
      } else if (!TextUtils.isEmpty(paramMiPushMessage.getUserAccount())) {
        this.h = paramMiPushMessage.getUserAccount();
      }
    }
    localHistoryPushMessage.setTitle(paramMiPushMessage.getTitle());
    localHistoryPushMessage.setPayload(paramMiPushMessage.getDescription());
    localHistoryPushMessage.setRedirectURL((String)paramMiPushMessage.getExtra().get("redirectURL"));
    localHistoryPushMessage.setMsgType((String)paramMiPushMessage.getExtra().get("msgType"));
    localHistoryPushMessage.setTime(new SimpleDateFormat("yyyy.MM.dd").format(new Date()));
    paramContext.a(localHistoryPushMessage);
  }
  
  public void onNotificationMessageClicked(Context paramContext, MiPushMessage paramMiPushMessage)
  {
    this.e = paramMiPushMessage.getContent();
    if (!TextUtils.isEmpty(paramMiPushMessage.getTopic())) {
      this.f = paramMiPushMessage.getTopic();
    }
    do
    {
      return;
      if (!TextUtils.isEmpty(paramMiPushMessage.getAlias()))
      {
        this.g = paramMiPushMessage.getAlias();
        return;
      }
    } while (TextUtils.isEmpty(paramMiPushMessage.getUserAccount()));
    this.h = paramMiPushMessage.getUserAccount();
  }
  
  public void onReceiveMessage(Context paramContext, MiPushMessage paramMiPushMessage)
  {
    super.onReceiveMessage(paramContext, paramMiPushMessage);
    paramMiPushMessage = (String)paramMiPushMessage.getExtra().get("redirectURL");
    if (ao.a(paramContext, FlightActivity.class))
    {
      if (ao.r(paramContext))
      {
        localIntent = new Intent(paramContext, FlightActivity.class);
        localIntent.setFlags(268435456);
        localObject = new Intent(paramContext, MessageDetailActivity.class);
        ((Intent)localObject).putExtra("redirectURL", paramMiPushMessage);
        paramContext.startActivities(new Intent[] { localIntent, localObject });
        return;
      }
      localIntent = new Intent(paramContext, MessageDetailActivity.class);
      localIntent.setFlags(268435456);
      localIntent.putExtra("redirectURL", paramMiPushMessage);
      paramContext.startActivity(localIntent);
      return;
    }
    if (ao.a(paramContext, LoginActivity.class))
    {
      if (ao.r(paramContext))
      {
        localIntent = new Intent(paramContext, LoginActivity.class);
        localIntent.putExtra("login", false);
        localIntent.setFlags(268435456);
        localObject = new Intent(paramContext, MessageDetailActivity.class);
        ((Intent)localObject).putExtra("redirectURL", paramMiPushMessage);
        paramContext.startActivities(new Intent[] { localIntent, localObject });
        return;
      }
      localIntent = new Intent(paramContext, MessageDetailActivity.class);
      localIntent.setFlags(268435456);
      localIntent.putExtra("redirectURL", paramMiPushMessage);
      paramContext.startActivity(localIntent);
      return;
    }
    Intent localIntent = paramContext.getPackageManager().getLaunchIntentForPackage("com.fimi.overseas.soul");
    localIntent.setFlags(270532608);
    Object localObject = new Bundle();
    ((Bundle)localObject).putString("redirectURL", paramMiPushMessage);
    ((Bundle)localObject).putBoolean("islaunch", true);
    localIntent.putExtra("launchBundle", (Bundle)localObject);
    paramContext.startActivity(localIntent);
  }
  
  public void onReceivePassThroughMessage(Context paramContext, MiPushMessage paramMiPushMessage)
  {
    this.e = paramMiPushMessage.getContent();
    if (!TextUtils.isEmpty(paramMiPushMessage.getTopic())) {
      this.f = paramMiPushMessage.getTopic();
    }
    do
    {
      return;
      if (!TextUtils.isEmpty(paramMiPushMessage.getAlias()))
      {
        this.g = paramMiPushMessage.getAlias();
        return;
      }
    } while (TextUtils.isEmpty(paramMiPushMessage.getUserAccount()));
    this.h = paramMiPushMessage.getUserAccount();
  }
  
  public void onReceiveRegisterResult(Context paramContext, MiPushCommandMessage paramMiPushCommandMessage)
  {
    String str = paramMiPushCommandMessage.getCommand();
    Object localObject = paramMiPushCommandMessage.getCommandArguments();
    if ((localObject != null) && (((List)localObject).size() > 0)) {}
    for (paramContext = (String)((List)localObject).get(0);; paramContext = null)
    {
      if ((localObject != null) && (((List)localObject).size() > 1)) {
        localObject = (String)((List)localObject).get(1);
      }
      if (("register".equals(str)) && (paramMiPushCommandMessage.getResultCode() == 0L)) {
        this.a = paramContext;
      }
      return;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/push/DroipMessageReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */