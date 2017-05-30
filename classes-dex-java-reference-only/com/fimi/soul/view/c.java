package com.fimi.soul.view;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import com.fimi.soul.utils.ao;

public class c
  extends Dialog
{
  public c(Context paramContext)
  {
    super(paramContext);
    requestWindowFeature(1);
  }
  
  public c(Context paramContext, int paramInt)
  {
    super(paramContext, paramInt);
    requestWindowFeature(1);
  }
  
  public static class a
  {
    private Context a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private int g = -1;
    private int h = -1;
    private int i = -1;
    private DialogInterface.OnClickListener j;
    private DialogInterface.OnClickListener k;
    private boolean l = true;
    
    public a(Context paramContext)
    {
      this.a = paramContext;
    }
    
    public a a(int paramInt)
    {
      this.g = paramInt;
      return this;
    }
    
    public a a(String paramString)
    {
      this.b = paramString;
      return this;
    }
    
    public a a(String paramString, DialogInterface.OnClickListener paramOnClickListener)
    {
      this.d = paramString;
      this.j = paramOnClickListener;
      return this;
    }
    
    public a a(boolean paramBoolean)
    {
      this.l = paramBoolean;
      return this;
    }
    
    public c a()
    {
      Object localObject1 = (LayoutInflater)this.a.getSystemService("layout_inflater");
      final c localc = new c(this.a, 2131427408);
      localObject1 = ((LayoutInflater)localObject1).inflate(2130968662, null);
      Object localObject2 = (Button)((View)localObject1).findViewById(2131690015);
      Button localButton = (Button)((View)localObject1).findViewById(2131690016);
      TextView localTextView1 = (TextView)((View)localObject1).findViewById(2131689998);
      TextView localTextView2 = (TextView)((View)localObject1).findViewById(2131690013);
      ao.a(this.a.getAssets(), new View[] { localButton, localObject2, localTextView1, localTextView2 });
      localTextView1.getPaint().setFakeBoldText(true);
      localTextView1.setTextColor(-872415232);
      if (this.d != null) {
        localButton.setText(this.d);
      }
      if (this.e != null) {
        ((Button)localObject2).setText(this.e);
      }
      if (this.c != null) {
        localTextView1.setText(this.c);
      }
      if (this.g != -1) {
        localButton.setTextColor(this.g);
      }
      if (this.h != -1) {
        ((Button)localObject2).setTextColor(this.h);
      }
      if (this.f != null)
      {
        localTextView2.setVisibility(0);
        localTextView2.setText(this.f);
        if (this.i != -1) {
          localTextView1.setMaxEms(this.i);
        }
        if (this.j != null) {
          localButton.setOnClickListener(new View.OnClickListener()
          {
            public void onClick(View paramAnonymousView)
            {
              c.a.a(c.a.this).onClick(localc, -1);
              localc.dismiss();
            }
          });
        }
        if (this.k != null) {
          ((Button)localObject2).setOnClickListener(new View.OnClickListener()
          {
            public void onClick(View paramAnonymousView)
            {
              c.a.b(c.a.this).onClick(localc, -2);
              localc.dismiss();
            }
          });
        }
        if (!this.l) {
          break label359;
        }
        localc.setCanceledOnTouchOutside(true);
      }
      for (;;)
      {
        localc.setContentView((View)localObject1);
        localObject1 = localc.getWindow();
        localObject2 = ((Window)localObject1).getAttributes();
        ((WindowManager.LayoutParams)localObject2).width = ((int)this.a.getResources().getDimension(2131296414));
        ((Window)localObject1).setAttributes((WindowManager.LayoutParams)localObject2);
        localc.getWindow().getDecorView().setBackgroundColor(0);
        return localc;
        localTextView2.setVisibility(8);
        break;
        label359:
        localc.setCanceledOnTouchOutside(false);
      }
    }
    
    public a b(int paramInt)
    {
      this.h = paramInt;
      return this;
    }
    
    public a b(String paramString)
    {
      this.c = paramString;
      return this;
    }
    
    public a b(String paramString, DialogInterface.OnClickListener paramOnClickListener)
    {
      this.e = paramString;
      this.k = paramOnClickListener;
      return this;
    }
    
    public a c(int paramInt)
    {
      this.i = paramInt;
      return this;
    }
    
    public a c(String paramString)
    {
      this.f = paramString;
      return this;
    }
  }
  
  public static class b
  {
    private Context a;
    private String b;
    private String c;
    private String d;
    private String e;
    private int f = -1;
    private int g = -1;
    private boolean h;
    private DialogInterface.OnClickListener i;
    private DialogInterface.OnClickListener j;
    private boolean k = false;
    
    public b(Context paramContext)
    {
      this.a = paramContext;
    }
    
    public b a(int paramInt)
    {
      this.f = paramInt;
      return this;
    }
    
    public b a(String paramString)
    {
      this.b = paramString;
      return this;
    }
    
    public b a(String paramString, DialogInterface.OnClickListener paramOnClickListener)
    {
      this.c = paramString;
      this.i = paramOnClickListener;
      return this;
    }
    
    public b a(boolean paramBoolean)
    {
      this.h = paramBoolean;
      return this;
    }
    
    public c a()
    {
      Object localObject1 = (LayoutInflater)this.a.getSystemService("layout_inflater");
      final c localc = new c(this.a, 2131427408);
      localObject1 = ((LayoutInflater)localObject1).inflate(2130968664, null);
      Object localObject2 = (Button)((View)localObject1).findViewById(2131690015);
      Button localButton = (Button)((View)localObject1).findViewById(2131690016);
      TextView localTextView1 = (TextView)((View)localObject1).findViewById(2131690017);
      localTextView1.setText(this.e);
      CheckBox localCheckBox = (CheckBox)((View)localObject1).findViewById(2131689643);
      localCheckBox.setChecked(this.h);
      TextView localTextView2 = (TextView)((View)localObject1).findViewById(2131689998);
      if (this.b != null) {
        localTextView2.setText(this.b);
      }
      if (this.d != null) {
        ((Button)localObject2).setText(this.d);
      }
      if (this.c != null) {
        localButton.setText(this.c);
      }
      if (this.e != null) {
        localTextView1.setText(this.e);
      }
      if (this.h) {
        localCheckBox.setChecked(this.h);
      }
      for (;;)
      {
        ao.a(this.a.getAssets(), new View[] { localButton, localObject2, localTextView1, localTextView2 });
        localTextView2.setTextColor(-872415232);
        localTextView2.getPaint().setFakeBoldText(true);
        if (this.i != null)
        {
          localButton.setOnClickListener(new View.OnClickListener()
          {
            public void onClick(View paramAnonymousView)
            {
              c.b.a(c.b.this).onClick(localc, -1);
            }
          });
          ((Button)localObject2).setOnClickListener(new View.OnClickListener()
          {
            public void onClick(View paramAnonymousView)
            {
              c.b.b(c.b.this).onClick(localc, -2);
            }
          });
        }
        localc.setContentView((View)localObject1);
        localObject1 = localc.getWindow();
        localObject2 = ((Window)localObject1).getAttributes();
        ((WindowManager.LayoutParams)localObject2).width = ((int)this.a.getResources().getDimension(2131296412));
        ((Window)localObject1).setAttributes((WindowManager.LayoutParams)localObject2);
        localc.getWindow().getDecorView().setBackgroundColor(0);
        return localc;
        localCheckBox.setChecked(this.h);
      }
    }
    
    public b b(int paramInt)
    {
      this.g = paramInt;
      return this;
    }
    
    public b b(String paramString)
    {
      this.e = paramString;
      return this;
    }
    
    public b b(String paramString, DialogInterface.OnClickListener paramOnClickListener)
    {
      this.d = paramString;
      this.j = paramOnClickListener;
      return this;
    }
  }
  
  public static class c
  {
    private Context a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private int g = -1;
    private int h = -1;
    private int i = -1;
    private DialogInterface.OnClickListener j;
    private DialogInterface.OnClickListener k;
    private boolean l = true;
    
    public c(Context paramContext)
    {
      this.a = paramContext;
    }
    
    public c a(int paramInt)
    {
      this.g = paramInt;
      return this;
    }
    
    public c a(String paramString)
    {
      this.b = paramString;
      return this;
    }
    
    public c a(String paramString, DialogInterface.OnClickListener paramOnClickListener)
    {
      this.d = paramString;
      this.j = paramOnClickListener;
      return this;
    }
    
    public c a(boolean paramBoolean)
    {
      this.l = paramBoolean;
      return this;
    }
    
    public c a()
    {
      Object localObject1 = (LayoutInflater)this.a.getSystemService("layout_inflater");
      final c localc = new c(this.a, 2131427408);
      localObject1 = ((LayoutInflater)localObject1).inflate(2130968663, null);
      Object localObject2 = (Button)((View)localObject1).findViewById(2131690015);
      Button localButton = (Button)((View)localObject1).findViewById(2131690016);
      TextView localTextView1 = (TextView)((View)localObject1).findViewById(2131689998);
      TextView localTextView2 = (TextView)((View)localObject1).findViewById(2131690013);
      ao.a(this.a.getAssets(), new View[] { localButton, localObject2, localTextView1, localTextView2 });
      localTextView1.getPaint().setFakeBoldText(true);
      localTextView1.setTextColor(-872415232);
      if (this.d != null) {
        localButton.setText(this.d);
      }
      if (this.e != null) {
        ((Button)localObject2).setText(this.e);
      }
      if (this.b != null) {
        localTextView1.setText(this.b);
      }
      if (this.c != null) {
        localTextView2.setText(this.c);
      }
      if (this.g != -1) {
        localButton.setTextColor(this.g);
      }
      if (this.h != -1) {
        ((Button)localObject2).setTextColor(this.h);
      }
      if (this.i != -1) {
        localTextView1.setMaxEms(this.i);
      }
      if (this.j != null) {
        localButton.setOnClickListener(new View.OnClickListener()
        {
          public void onClick(View paramAnonymousView)
          {
            c.c.a(c.c.this).onClick(localc, -1);
            localc.dismiss();
          }
        });
      }
      if (this.k != null) {
        ((Button)localObject2).setOnClickListener(new View.OnClickListener()
        {
          public void onClick(View paramAnonymousView)
          {
            c.c.b(c.c.this).onClick(localc, -2);
            localc.dismiss();
          }
        });
      }
      if (this.l) {
        localc.setCanceledOnTouchOutside(true);
      }
      for (;;)
      {
        localc.setContentView((View)localObject1);
        localObject1 = localc.getWindow();
        localObject2 = ((Window)localObject1).getAttributes();
        ((WindowManager.LayoutParams)localObject2).width = ((int)this.a.getResources().getDimension(2131296414));
        ((Window)localObject1).setAttributes((WindowManager.LayoutParams)localObject2);
        localc.getWindow().getDecorView().setBackgroundColor(0);
        return localc;
        localc.setCanceledOnTouchOutside(false);
      }
    }
    
    public c b(int paramInt)
    {
      this.h = paramInt;
      return this;
    }
    
    public c b(String paramString)
    {
      this.c = paramString;
      return this;
    }
    
    public c b(String paramString, DialogInterface.OnClickListener paramOnClickListener)
    {
      this.e = paramString;
      this.k = paramOnClickListener;
      return this;
    }
    
    public c c(int paramInt)
    {
      this.i = paramInt;
      return this;
    }
    
    public c c(String paramString)
    {
      this.f = paramString;
      return this;
    }
  }
  
  public static class d
  {
    private Context a;
    private String b;
    private String c;
    private String d;
    private int e = -1;
    private int f = -1;
    private DialogInterface.OnClickListener g;
    private boolean h = false;
    
    public d(Context paramContext)
    {
      this.a = paramContext;
    }
    
    public d a(int paramInt)
    {
      this.f = paramInt;
      return this;
    }
    
    public d a(Context paramContext)
    {
      this.a = paramContext;
      return this;
    }
    
    public d a(String paramString)
    {
      this.b = paramString;
      return this;
    }
    
    public d a(String paramString, DialogInterface.OnClickListener paramOnClickListener)
    {
      this.d = paramString;
      this.g = paramOnClickListener;
      return this;
    }
    
    public c a()
    {
      Object localObject1 = (LayoutInflater)this.a.getSystemService("layout_inflater");
      final c localc = new c(this.a, 2131427408);
      localObject1 = ((LayoutInflater)localObject1).inflate(2130968666, null);
      Object localObject2 = (TextView)((View)localObject1).findViewById(2131690020);
      Button localButton = (Button)((View)localObject1).findViewById(2131690021);
      TextView localTextView = (TextView)((View)localObject1).findViewById(2131689998);
      if (this.b != null) {
        localTextView.setText(this.b);
      }
      if (this.d != null) {
        localButton.setText(this.d);
      }
      if (this.f != -1) {
        localTextView.setMaxEms(this.f);
      }
      if (this.c != null)
      {
        ((TextView)localObject2).setVisibility(0);
        ((TextView)localObject2).setText(this.c);
      }
      for (;;)
      {
        if (this.g != null) {
          localButton.setOnClickListener(new View.OnClickListener()
          {
            public void onClick(View paramAnonymousView)
            {
              c.d.a(c.d.this).onClick(localc, -1);
              localc.dismiss();
            }
          });
        }
        ao.a(this.a.getAssets(), new View[] { localTextView, localButton, localObject2 });
        localTextView.getPaint().setFakeBoldText(true);
        if (this.c != null) {
          ((TextView)localObject2).getPaint().setFakeBoldText(true);
        }
        localc.setContentView((View)localObject1);
        localObject1 = localc.getWindow();
        localObject2 = ((Window)localObject1).getAttributes();
        ((WindowManager.LayoutParams)localObject2).height = ((int)this.a.getResources().getDimension(2131296505));
        ((WindowManager.LayoutParams)localObject2).width = ((int)this.a.getResources().getDimension(2131296506));
        ((Window)localObject1).setAttributes((WindowManager.LayoutParams)localObject2);
        localc.getWindow().getDecorView().setBackgroundColor(0);
        return localc;
        ((TextView)localObject2).setVisibility(8);
      }
    }
    
    public d b(String paramString)
    {
      this.c = paramString;
      return this;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */