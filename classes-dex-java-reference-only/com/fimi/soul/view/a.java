package com.fimi.soul.view;

import android.annotation.TargetApi;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.kernel.utils.p;
import com.fimi.soul.utils.ao;

public class a
  extends Dialog
{
  public a(Context paramContext)
  {
    super(paramContext);
  }
  
  public a(Context paramContext, int paramInt)
  {
    super(paramContext, paramInt);
  }
  
  public a(Context paramContext, boolean paramBoolean, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    super(paramContext, paramBoolean, paramOnCancelListener);
  }
  
  public static class a
  {
    private a a;
    private Context b;
    private String c;
    private String d;
    private DialogInterface.OnClickListener e;
    
    public a(Context paramContext)
    {
      this.b = paramContext;
      this.a = new a(this.b, 2131427408);
    }
    
    public a a(DialogInterface.OnClickListener paramOnClickListener)
    {
      this.e = paramOnClickListener;
      return this;
    }
    
    public a a(String paramString)
    {
      this.c = paramString;
      return this;
    }
    
    public a a(String paramString, DialogInterface.OnClickListener paramOnClickListener)
    {
      this.e = paramOnClickListener;
      this.d = paramString;
      return this;
    }
    
    public a a()
    {
      Object localObject1 = ((LayoutInflater)this.b.getSystemService("layout_inflater")).inflate(2130968705, null);
      Object localObject2 = (TextView)((View)localObject1).findViewById(2131689998);
      Button localButton = (Button)((View)localObject1).findViewById(2131690000);
      if (this.d != null) {
        localButton.setText(this.d);
      }
      if (this.c != null) {
        ((TextView)localObject2).setText(this.c);
      }
      if (this.e != null) {
        localButton.setOnClickListener(new View.OnClickListener()
        {
          public void onClick(View paramAnonymousView)
          {
            a.this.dismiss();
            a.a.b(a.a.this).onClick(a.this, -2);
          }
        });
      }
      ao.a(this.b.getAssets(), new View[] { localObject2, localButton });
      this.a.setContentView((View)localObject1);
      localObject1 = this.a.getWindow();
      localObject2 = ((Window)localObject1).getAttributes();
      if (p.b(this.b) > p.a(this.b)) {}
      for (float f = p.b(this.b);; f = p.a(this.b))
      {
        ((WindowManager.LayoutParams)localObject2).width = ((int)(f * 1032.0F / 1920.0F));
        ((Window)localObject1).setAttributes((WindowManager.LayoutParams)localObject2);
        this.a.getWindow().getDecorView().setBackgroundColor(0);
        return this.a;
      }
    }
    
    public a b(String paramString)
    {
      this.d = paramString;
      return this;
    }
    
    public a b()
    {
      return this.a;
    }
  }
  
  public static class b
  {
    private Context a;
    private String b;
    private String c;
    private int d = 0;
    private DialogInterface.OnClickListener e;
    private Button f;
    private Button g;
    private TextView h;
    private ImageView i;
    private com.fimi.soul.biz.a.a j = com.fimi.soul.biz.a.a.a();
    
    public b(Context paramContext)
    {
      this.a = paramContext;
    }
    
    public b a(int paramInt)
    {
      this.d = paramInt;
      return this;
    }
    
    public b a(String paramString)
    {
      this.b = paramString;
      return this;
    }
    
    public b a(String paramString, DialogInterface.OnClickListener paramOnClickListener)
    {
      this.e = paramOnClickListener;
      this.c = paramString;
      return this;
    }
    
    @TargetApi(16)
    public a a()
    {
      Object localObject1 = (LayoutInflater)this.a.getSystemService("layout_inflater");
      final a locala = new a(this.a, 2131427408);
      localObject1 = ((LayoutInflater)localObject1).inflate(2130968658, null);
      this.h = ((TextView)((View)localObject1).findViewById(2131689998));
      this.i = ((ImageView)((View)localObject1).findViewById(2131689999));
      Object localObject2 = (Button)((View)localObject1).findViewById(2131690000);
      this.f = ((Button)((View)localObject1).findViewById(2131689996));
      this.f.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          a.b.this.a(a.b.a(a.b.this), 102, 2131623965);
          a.b.this.a(a.b.a(a.b.this), 2130837854);
          a.b.this.a(a.b.b(a.b.this), 255, 2131624060);
          a.b.this.a(a.b.b(a.b.this), 2130837853);
          a.b.c(a.b.this).setText(2131362895);
          a.b.d(a.b.this).setImageResource(2130837605);
          a.b.e(a.b.this).a(1);
        }
      });
      this.g = ((Button)((View)localObject1).findViewById(2131689997));
      this.g.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          a.b.this.a(a.b.b(a.b.this), 102, 2131623965);
          a.b.this.a(a.b.b(a.b.this), 2130837852);
          a.b.this.a(a.b.a(a.b.this), 255, 2131624060);
          a.b.this.a(a.b.a(a.b.this), 2130837855);
          a.b.c(a.b.this).setText(2131362896);
          a.b.d(a.b.this).setImageResource(2130837607);
          a.b.e(a.b.this).a(2);
        }
      });
      if (this.j.b() == 1)
      {
        a(this.f, 255, 2131624060);
        a(this.f, 2130837853);
        a(this.g, 102, 2131623965);
        a(this.g, 2130837854);
        this.h.setText(2131362895);
        this.i.setImageResource(2130837605);
        if (this.d != 0) {
          this.i.setBackground(this.a.getResources().getDrawable(this.d));
        }
        if (this.b != null)
        {
          SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(this.b);
          localSpannableStringBuilder.setSpan(new ForegroundColorSpan(this.a.getResources().getColor(2131624230)), 5, 8, 33);
          this.h.setText(localSpannableStringBuilder);
        }
        if (this.c != null) {
          ((Button)localObject2).setText(this.c);
        }
        if (this.e != null) {
          ((Button)localObject2).setOnClickListener(new View.OnClickListener()
          {
            public void onClick(View paramAnonymousView)
            {
              locala.dismiss();
              a.b.f(a.b.this).onClick(locala, -2);
            }
          });
        }
        ao.a(this.a.getAssets(), new View[] { this.h, localObject2, this.f, this.g });
        locala.setContentView((View)localObject1);
        localObject1 = locala.getWindow();
        localObject2 = ((Window)localObject1).getAttributes();
        if (p.b(this.a) <= p.a(this.a)) {
          break label506;
        }
      }
      label506:
      for (float f1 = p.b(this.a);; f1 = p.a(this.a))
      {
        ((WindowManager.LayoutParams)localObject2).width = ((int)(f1 * 1032.0F / 1920.0F));
        ((Window)localObject1).setAttributes((WindowManager.LayoutParams)localObject2);
        locala.getWindow().getDecorView().setBackgroundColor(0);
        return locala;
        a(this.g, 255, 2131624060);
        a(this.g, 2130837855);
        a(this.f, 102, 2131623965);
        a(this.f, 2130837852);
        this.h.setText(2131362896);
        this.i.setImageResource(2130837607);
        break;
      }
    }
    
    public void a(Button paramButton, int paramInt)
    {
      if (paramButton != null) {
        paramButton.setBackgroundResource(paramInt);
      }
    }
    
    public void a(Button paramButton, int paramInt1, int paramInt2)
    {
      paramButton.setTextColor(this.a.getResources().getColor(paramInt2));
      paramButton.setTextColor(paramButton.getTextColors().withAlpha(paramInt1));
    }
    
    public b b(String paramString)
    {
      this.c = paramString;
      return this;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */