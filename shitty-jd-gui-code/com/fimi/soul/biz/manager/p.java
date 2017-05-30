package com.fimi.soul.biz.manager;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import cn.sharesdk.facebook.Facebook;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.Platform.ShareParams;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.twitter.Twitter;
import cn.sharesdk.wechat.friends.Wechat;
import cn.sharesdk.wechat.moments.WechatMoments;
import com.fimi.kernel.c;
import com.fimi.soul.entity.ShareInfo;
import com.fimi.soul.module.a.b;
import com.fimi.soul.module.a.d;
import com.fimi.soul.utils.ao;
import com.fimi.soul.utils.e;
import com.fimi.soul.utils.j;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;

public class p
{
  public static int a = 0;
  public static int b = 1;
  public static final int c = 1;
  public static final int d = 2;
  public static final int e = 3;
  public IUiListener f = new IUiListener()
  {
    public void onCancel() {}
    
    public void onComplete(Object paramAnonymousObject)
    {
      Toast.makeText(p.b(p.this), "Complete", 1).show();
    }
    
    public void onError(UiError paramAnonymousUiError)
    {
      Toast.makeText(p.b(p.this), "Error", 1).show();
    }
  };
  private Context g;
  private ShareInfo h;
  private b i;
  private final String j = "tempImage.png";
  private Handler k = new Handler()
  {
    public void handleMessage(Message paramAnonymousMessage)
    {
      switch (paramAnonymousMessage.what)
      {
      }
      for (;;)
      {
        super.handleMessage(paramAnonymousMessage);
        return;
        Toast.makeText(p.b(p.this), 2131362708, 1).show();
        continue;
        Toast.makeText(p.b(p.this), 2131362707, 1).show();
      }
    }
  };
  
  public p(Context paramContext)
  {
    this.g = paramContext;
  }
  
  private boolean a(String paramString)
  {
    return paramString.contains("http://");
  }
  
  public void a(Context paramContext, String paramString, boolean paramBoolean, ShareInfo paramShareInfo)
  {
    ShareSDK.initSDK(this.g);
    b localb = new b();
    if (!paramBoolean)
    {
      paramBoolean = true;
      localb.a(paramBoolean);
      if (paramString != null) {
        localb.n(paramString);
      }
      localb.a(d.a);
      localb.e();
      localb.d();
      localb.b(paramShareInfo.getTitle());
      if (!a(paramShareInfo.getUrl())) {
        break label137;
      }
      localb.f(paramShareInfo.getUrl());
    }
    for (;;)
    {
      localb.a(new PlatformActionListener()
      {
        public void onCancel(Platform paramAnonymousPlatform, int paramAnonymousInt)
        {
          if (paramAnonymousPlatform.getName() == Twitter.NAME) {
            e.f(j.a() + "/" + "tempImage.png");
          }
          p.a(p.this).sendEmptyMessage(2);
        }
        
        public void onComplete(Platform paramAnonymousPlatform, int paramAnonymousInt, HashMap<String, Object> paramAnonymousHashMap)
        {
          if (paramAnonymousPlatform.getName() == Twitter.NAME) {
            e.f(j.a() + "/" + "tempImage.png");
          }
          p.a(p.this).sendEmptyMessage(1);
        }
        
        public void onError(Platform paramAnonymousPlatform, int paramAnonymousInt, Throwable paramAnonymousThrowable)
        {
          if (paramAnonymousPlatform.getName() == Twitter.NAME) {
            e.f(j.a() + "/" + "tempImage.png");
          }
          p.a(p.this).sendEmptyMessage(3);
        }
      });
      localb.a(BitmapFactory.decodeResource(paramContext.getResources(), 2130838024), "Mi Drone", new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView) {}
      });
      localb.a(paramContext);
      return;
      paramBoolean = false;
      break;
      label137:
      if (Twitter.NAME == paramString) {
        try
        {
          paramString = new File(j.a(), "tempImage.png");
          e.a(e.a(paramShareInfo.getUrl(), 480, 600), paramString);
          localb.e(j.a() + "/" + "tempImage.png");
        }
        catch (FileNotFoundException paramString)
        {
          paramString.printStackTrace();
        }
      } else {
        localb.e(paramShareInfo.getUrl());
      }
    }
  }
  
  public void a(b paramb)
  {
    this.i = paramb;
  }
  
  public void a(ShareInfo paramShareInfo)
  {
    this.h = paramShareInfo;
    new a(this.g, paramShareInfo).show();
  }
  
  public void a(ShareInfo paramShareInfo, String paramString)
  {
    Platform.ShareParams localShareParams = new Platform.ShareParams();
    localShareParams.setImagePath(paramShareInfo.getUrl());
    localShareParams.setShareType(2);
    paramShareInfo = ShareSDK.getPlatform(paramString);
    paramShareInfo.setPlatformActionListener(new PlatformActionListener()
    {
      public void onCancel(Platform paramAnonymousPlatform, int paramAnonymousInt)
      {
        p.a(p.this).sendEmptyMessage(2);
      }
      
      public void onComplete(Platform paramAnonymousPlatform, int paramAnonymousInt, HashMap<String, Object> paramAnonymousHashMap)
      {
        p.a(p.this).sendEmptyMessage(1);
      }
      
      public void onError(Platform paramAnonymousPlatform, int paramAnonymousInt, Throwable paramAnonymousThrowable)
      {
        p.a(p.this).sendEmptyMessage(3);
      }
    });
    paramShareInfo.share(localShareParams);
  }
  
  class a
    extends AlertDialog
  {
    ImageView a;
    ImageView b;
    ImageView c;
    Button d;
    private Context f;
    private ShareInfo g;
    private boolean h;
    private boolean i;
    
    public a(Context paramContext, ShareInfo paramShareInfo)
    {
      super();
      this.f = paramContext;
      this.g = paramShareInfo;
    }
    
    protected void onCreate(Bundle paramBundle)
    {
      super.onCreate(paramBundle);
      setContentView(2130968667);
      findViewById(2131690023).setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          p.this.a(p.a.a(p.a.this), Facebook.NAME, true, p.a.b(p.a.this));
          p.a.this.dismiss();
        }
      });
      findViewById(2131690025).setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          p.this.a(p.a.a(p.a.this), Twitter.NAME, true, p.a.b(p.a.this));
          p.a.this.dismiss();
        }
      });
      paramBundle = (TextView)findViewById(2131690022);
      this.a = ((ImageView)findViewById(2131690027));
      this.a.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          p.this.a(p.a.a(p.a.this), Wechat.NAME, true, p.a.b(p.a.this));
          p.a.this.dismiss();
        }
      });
      this.b = ((ImageView)findViewById(2131690029));
      this.b.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          p.this.a(p.a.a(p.a.this), WechatMoments.NAME, true, p.a.b(p.a.this));
          p.a.this.dismiss();
        }
      });
      this.d = ((Button)findViewById(2131690031));
      this.d.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          p.a.this.dismiss();
        }
      });
      paramBundle = (ViewGroup)getWindow().getDecorView();
      ao.a(c.a().getResources().getAssets(), paramBundle);
    }
    
    protected void onStart()
    {
      super.onStart();
      if (ao.d(this.f, "com.tencent.mm"))
      {
        this.h = true;
        this.a.setAlpha(1.0F);
        this.b.setAlpha(1.0F);
        return;
      }
      this.h = false;
      this.a.setAlpha(0.3F);
      this.b.setAlpha(0.3F);
    }
  }
  
  public static abstract interface b
  {
    public abstract void a(int paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/manager/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */