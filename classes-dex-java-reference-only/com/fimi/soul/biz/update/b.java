package com.fimi.soul.biz.update;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import com.fimi.kernel.c;
import com.fimi.kernel.utils.z;
import com.fimi.soul.biz.manager.w;
import com.fimi.soul.service.UpdateApkService;
import com.fimi.soul.utils.ao;
import com.fimi.soul.utils.j;
import com.fimi.soul.view.f;
import com.fimi.soul.view.f.a;
import com.xiaomi.market.sdk.UpdateResponse;
import com.xiaomi.market.sdk.XiaomiUpdateAgent;
import com.xiaomi.market.sdk.XiaomiUpdateListener;
import java.io.File;

public class b
{
  private Context a;
  private a b;
  private b c;
  private w d;
  private f.a e;
  
  public b(Context paramContext)
  {
    this.d = w.a(paramContext);
    this.a = paramContext;
  }
  
  private void a(final UpdateResponse paramUpdateResponse, String paramString)
  {
    if (c.d() == null) {}
    do
    {
      return;
      this.a = c.d();
      if (this.e == null) {
        this.e = new f.a(this.a);
      }
      this.e.b(this.a.getString(2131362875), new DialogInterface.OnClickListener()
      {
        public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          z.a(b.b(b.this), b.b(b.this).getString(2131362169));
          if ((new File(j.i(), "temp_update.apk").exists()) && (String.valueOf(paramUpdateResponse.versionCode).compareTo(ao.a(b.b(b.this), j.i() + "temp_update.apk")) == 0))
          {
            paramAnonymousDialogInterface = new Intent("android.intent.action.VIEW");
            paramAnonymousDialogInterface.setFlags(268435456);
            paramAnonymousDialogInterface.setDataAndType(Uri.fromFile(new File(j.i(), "temp_update.apk")), "application/vnd.android.package-archive");
            b.b(b.this).startActivity(paramAnonymousDialogInterface);
            return;
          }
          if (ao.c() != null)
          {
            paramAnonymousDialogInterface = new Intent(b.b(b.this), UpdateApkService.class);
            paramAnonymousDialogInterface.putExtra("down_url", paramUpdateResponse.path);
            paramAnonymousDialogInterface.setFlags(536870912);
            b.b(b.this).startService(paramAnonymousDialogInterface);
            return;
          }
          z.a(b.b(b.this), 2131362811, 2000);
        }
      }).a(this.a.getResources().getColor(2131624049)).a(String.format(this.a.getString(2131362250), new Object[] { paramUpdateResponse.versionName })).a(this.a.getString(2131362051), new DialogInterface.OnClickListener()
      {
        public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {}
      }).b(paramString);
    } while (this.e.b().isShowing());
    this.e.a().show();
  }
  
  public void a()
  {
    XiaomiUpdateAgent.setUpdateAutoPopup(false);
    XiaomiUpdateAgent.setUpdateListener(new XiaomiUpdateListener()
    {
      public void onUpdateReturned(int paramAnonymousInt, UpdateResponse paramAnonymousUpdateResponse)
      {
        switch (paramAnonymousInt)
        {
        default: 
          return;
        }
        b.c(b.this).a(String.valueOf(paramAnonymousUpdateResponse.versionCode));
      }
    });
    XiaomiUpdateAgent.update(this.a);
  }
  
  public void a(final int paramInt)
  {
    XiaomiUpdateAgent.setUpdateAutoPopup(false);
    XiaomiUpdateAgent.setUpdateListener(new XiaomiUpdateListener()
    {
      public void onUpdateReturned(int paramAnonymousInt, UpdateResponse paramAnonymousUpdateResponse)
      {
        switch (paramAnonymousInt)
        {
        }
        do
        {
          do
          {
            do
            {
              return;
            } while (b.a(b.this) == null);
            b.a(b.this).a(paramAnonymousUpdateResponse);
            return;
          } while (paramInt != 1);
          z.a(b.b(b.this), 2131362440, 2000);
          return;
        } while (paramInt != 1);
        z.a(b.b(b.this), 2131362901, 2000);
      }
    });
    XiaomiUpdateAgent.update(this.a);
  }
  
  public void a(a parama)
  {
    this.b = parama;
  }
  
  public void a(b paramb)
  {
    this.c = paramb;
  }
  
  public void a(UpdateResponse paramUpdateResponse)
  {
    a(paramUpdateResponse, paramUpdateResponse.updateLog);
  }
  
  public b b()
  {
    return this.c;
  }
  
  public static abstract interface a
  {
    public abstract void a(String paramString);
  }
  
  public static abstract interface b
  {
    public abstract void a(UpdateResponse paramUpdateResponse);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/update/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */