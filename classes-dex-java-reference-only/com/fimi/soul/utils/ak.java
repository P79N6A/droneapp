package com.fimi.soul.utils;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextPaint;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

public class ak
  extends Dialog
{
  Dialog a;
  Runnable b = new Runnable()
  {
    public void run()
    {
      ak.a(ak.this);
      if (ak.b(ak.this) < 0)
      {
        if (ak.c(ak.this) != null) {
          ak.c(ak.this).a();
        }
        return;
      }
      ak.d(ak.this).postDelayed(this, 1000L);
    }
  };
  private a c;
  private Context d;
  private int e;
  private TextView f;
  private TextView g;
  private ImageView h;
  private Handler i = new Handler();
  
  public ak(Context paramContext, a parama, int paramInt)
  {
    super(paramContext, 2131427406);
    this.d = paramContext;
    this.c = parama;
    this.e = paramInt;
    this.i.post(this.b);
  }
  
  public void a(int paramInt)
  {
    if (this.h != null) {
      this.h.setImageResource(paramInt);
    }
  }
  
  public void a(String paramString)
  {
    if (this.f != null) {
      this.f.setText(paramString);
    }
  }
  
  public void b(String paramString)
  {
    if (this.f != null) {
      this.g.setText(paramString);
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    getWindow().getDecorView().setPadding(0, 0, 0, 0);
    paramBundle = getWindow().getAttributes();
    paramBundle.width = -1;
    paramBundle.height = -2;
    getWindow().setAttributes(paramBundle);
    setContentView(2130968731);
    this.h = ((ImageView)findViewById(2131690401));
    this.f = ((TextView)findViewById(2131689628));
    this.g = ((TextView)findViewById(2131690402));
    this.f.getPaint().setFakeBoldText(true);
    ao.a(this.d.getAssets(), new View[] { this.f, this.g });
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((4 == paramInt) && (this.c != null)) {
      this.c.a();
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public static abstract interface a
  {
    public abstract void a();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/utils/ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */