package com.fimi.soul.module.droneui;

import android.app.Dialog;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.soul.utils.ao;

public class a
  extends Dialog
  implements View.OnClickListener
{
  Runnable a = new Runnable()
  {
    public void run()
    {
      a.a(a.this);
      if ((a.b(a.this) < 0) && (a.c(a.this) != null))
      {
        a.c(a.this).d();
        return;
      }
      a.this.b.postDelayed(a.this.a, 1000L);
    }
  };
  final Handler b = new Handler()
  {
    public void handleMessage(Message paramAnonymousMessage) {}
  };
  private String c = null;
  private String d = null;
  private int e = 0;
  private boolean f = false;
  private Context g;
  private a h;
  private int i = 0;
  
  public a(Context paramContext, String paramString1, String paramString2, int paramInt1, int paramInt2, boolean paramBoolean, a parama)
  {
    super(paramContext, 2131427406);
    this.g = paramContext;
    this.c = paramString1;
    this.d = paramString2;
    this.e = paramInt1;
    this.f = paramBoolean;
    this.h = parama;
    this.i = paramInt2;
    this.b.postDelayed(this.a, 1000L);
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    }
    do
    {
      do
      {
        return;
      } while (this.h == null);
      this.h.b();
      return;
    } while (this.h == null);
    this.h.c();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    int k = 0;
    super.onCreate(paramBundle);
    setContentView(2130968610);
    paramBundle = (TextView)findViewById(2131689731);
    TextView localTextView = (TextView)findViewById(2131689732);
    ImageView localImageView = (ImageView)findViewById(2131689730);
    ao.a(this.g.getAssets(), new View[] { paramBundle });
    ao.a(this.g.getAssets(), new View[] { localTextView });
    paramBundle.setText(this.c);
    localTextView.setText(this.d);
    if (this.e != 0) {
      localImageView.setImageBitmap(BitmapFactory.decodeResource(this.g.getResources(), this.e));
    }
    paramBundle = findViewById(2131689733);
    if (this.f)
    {
      j = 0;
      paramBundle.setVisibility(j);
      paramBundle = findViewById(2131689734);
      if (!this.f) {
        break label174;
      }
    }
    label174:
    for (int j = k;; j = 8)
    {
      paramBundle.setVisibility(j);
      return;
      j = 8;
      break;
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (this.h != null)) {
      this.h.a();
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public static abstract interface a
  {
    public abstract void a();
    
    public abstract void b();
    
    public abstract void c();
    
    public abstract void d();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/droneui/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */