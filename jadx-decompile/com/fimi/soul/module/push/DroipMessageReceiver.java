package com.fimi.soul.module.push;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.fimi.soul.base.a;
import com.fimi.soul.biz.m.k;
import com.fimi.soul.biz.manager.m;
import com.fimi.soul.entity.HistoryPushMessage;
import com.fimi.soul.entity.MessagePush;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.module.droneui.FlightActivity;
import com.fimi.soul.module.login.LoginActivity;
import com.fimi.soul.utils.a.b;
import com.fimi.soul.utils.ao;
import com.google.android.gms.drive.e;
import com.xiaomi.mipush.sdk.MiPushClient;
import com.xiaomi.mipush.sdk.MiPushCommandMessage;
import com.xiaomi.mipush.sdk.MiPushMessage;
import com.xiaomi.mipush.sdk.PushMessageReceiver;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class DroipMessageReceiver extends PushMessageReceiver {
    private String a;
    private long b = -1;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;

    public void onCommandResult(Context context, MiPushCommandMessage miPushCommandMessage) {
        String command = miPushCommandMessage.getCommand();
        List commandArguments = miPushCommandMessage.getCommandArguments();
        String str = (commandArguments == null || commandArguments.size() <= 0) ? null : (String) commandArguments.get(0);
        String str2 = (commandArguments == null || commandArguments.size() <= 1) ? null : (String) commandArguments.get(1);
        if (MiPushClient.COMMAND_REGISTER.equals(command)) {
            if (miPushCommandMessage.getResultCode() == 0) {
                this.a = str;
                if (this.a != null) {
                    m a = m.a(context);
                    MessagePush messagePush = new MessagePush();
                    messagePush.setUserID(a.b(context).getUserID());
                    messagePush.setMiRegID(this.a);
                    messagePush.setAppType("0");
                    a.a(messagePush, new k(this) {
                        final /* synthetic */ DroipMessageReceiver a;

                        {
                            this.a = r1;
                        }

                        public void a(PlaneMsg planeMsg, File file) {
                        }
                    });
                }
            }
        } else if (MiPushClient.COMMAND_SET_ALIAS.equals(command)) {
            if (miPushCommandMessage.getResultCode() == 0) {
                this.g = str;
            }
        } else if (MiPushClient.COMMAND_UNSET_ALIAS.equals(command)) {
            if (miPushCommandMessage.getResultCode() == 0) {
                this.g = str;
            }
        } else if (MiPushClient.COMMAND_SUBSCRIBE_TOPIC.equals(command)) {
            if (miPushCommandMessage.getResultCode() == 0) {
                this.f = str;
            }
        } else if (MiPushClient.COMMAND_UNSUBSCRIBE_TOPIC.equals(command)) {
            if (miPushCommandMessage.getResultCode() == 0) {
                this.f = str;
            }
        } else if (MiPushClient.COMMAND_SET_ACCEPT_TIME.equals(command) && miPushCommandMessage.getResultCode() == 0) {
            this.i = str;
            this.j = str2;
        }
    }

    public void onNotificationMessageArrived(Context context, MiPushMessage miPushMessage) {
        this.e = miPushMessage.getContent();
        if (!TextUtils.isEmpty(miPushMessage.getTopic())) {
            this.f = miPushMessage.getTopic();
        } else if (!TextUtils.isEmpty(miPushMessage.getAlias())) {
            this.g = miPushMessage.getAlias();
        } else if (!TextUtils.isEmpty(miPushMessage.getUserAccount())) {
            this.h = miPushMessage.getUserAccount();
        }
        b a = b.a(context);
        HistoryPushMessage historyPushMessage = new HistoryPushMessage();
        historyPushMessage.setId((String) miPushMessage.getExtra().get("id"));
        if (!a.b(historyPushMessage)) {
            historyPushMessage.setTitle(miPushMessage.getTitle());
            historyPushMessage.setPayload(miPushMessage.getDescription());
            historyPushMessage.setRedirectURL((String) miPushMessage.getExtra().get("redirectURL"));
            historyPushMessage.setMsgType((String) miPushMessage.getExtra().get("msgType"));
            historyPushMessage.setTime(new SimpleDateFormat("yyyy.MM.dd").format(new Date()));
            a.a(historyPushMessage);
        }
    }

    public void onNotificationMessageClicked(Context context, MiPushMessage miPushMessage) {
        this.e = miPushMessage.getContent();
        if (!TextUtils.isEmpty(miPushMessage.getTopic())) {
            this.f = miPushMessage.getTopic();
        } else if (!TextUtils.isEmpty(miPushMessage.getAlias())) {
            this.g = miPushMessage.getAlias();
        } else if (!TextUtils.isEmpty(miPushMessage.getUserAccount())) {
            this.h = miPushMessage.getUserAccount();
        }
    }

    public void onReceiveMessage(Context context, MiPushMessage miPushMessage) {
        super.onReceiveMessage(context, miPushMessage);
        String str = (String) miPushMessage.getExtra().get("redirectURL");
        Intent intent;
        if (ao.a(context, FlightActivity.class)) {
            if (ao.r(context)) {
                new Intent(context, FlightActivity.class).setFlags(e.a_);
                new Intent(context, MessageDetailActivity.class).putExtra("redirectURL", str);
                context.startActivities(new Intent[]{intent, r2});
                return;
            }
            intent = new Intent(context, MessageDetailActivity.class);
            intent.setFlags(e.a_);
            intent.putExtra("redirectURL", str);
            context.startActivity(intent);
        } else if (!ao.a(context, LoginActivity.class)) {
            intent = context.getPackageManager().getLaunchIntentForPackage(com.fimi.overseas.soul.a.b);
            intent.setFlags(270532608);
            Bundle bundle = new Bundle();
            bundle.putString("redirectURL", str);
            bundle.putBoolean("islaunch", true);
            intent.putExtra("launchBundle", bundle);
            context.startActivity(intent);
        } else if (ao.r(context)) {
            intent = new Intent(context, LoginActivity.class);
            intent.putExtra(com.google.firebase.a.a.a.k, false);
            intent.setFlags(e.a_);
            new Intent(context, MessageDetailActivity.class).putExtra("redirectURL", str);
            context.startActivities(new Intent[]{intent, r2});
        } else {
            intent = new Intent(context, MessageDetailActivity.class);
            intent.setFlags(e.a_);
            intent.putExtra("redirectURL", str);
            context.startActivity(intent);
        }
    }

    public void onReceivePassThroughMessage(Context context, MiPushMessage miPushMessage) {
        this.e = miPushMessage.getContent();
        if (!TextUtils.isEmpty(miPushMessage.getTopic())) {
            this.f = miPushMessage.getTopic();
        } else if (!TextUtils.isEmpty(miPushMessage.getAlias())) {
            this.g = miPushMessage.getAlias();
        } else if (!TextUtils.isEmpty(miPushMessage.getUserAccount())) {
            this.h = miPushMessage.getUserAccount();
        }
    }

    public void onReceiveRegisterResult(Context context, MiPushCommandMessage miPushCommandMessage) {
        String command = miPushCommandMessage.getCommand();
        List commandArguments = miPushCommandMessage.getCommandArguments();
        String str = (commandArguments == null || commandArguments.size() <= 0) ? null : (String) commandArguments.get(0);
        if (commandArguments != null && commandArguments.size() > 1) {
            String str2 = (String) commandArguments.get(1);
        }
        if (MiPushClient.COMMAND_REGISTER.equals(command) && miPushCommandMessage.getResultCode() == 0) {
            this.a = str;
        }
    }
}
