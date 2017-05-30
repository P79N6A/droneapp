package com.fimi.soul.view;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import com.fimi.kernel.utils.p;
import com.fimi.kernel.utils.v;
import com.fimi.soul.biz.c.h;
import com.fimi.soul.utils.JustifyTextView;
import com.fimi.soul.utils.ao;
import java.util.concurrent.atomic.AtomicInteger;

public class e
  extends Dialog
{
  public e(Context paramContext)
  {
    super(paramContext);
  }
  
  public e(Context paramContext, int paramInt)
  {
    super(paramContext, paramInt);
  }
  
  public e(Context paramContext, boolean paramBoolean, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    super(paramContext, paramBoolean, paramOnCancelListener);
  }
  
  public static void a(RadioButton paramRadioButton, int paramInt)
  {
    paramRadioButton.setTextColor(paramRadioButton.getTextColors().withAlpha(paramInt));
  }
  
  public static class a
  {
    v a;
    private Context b;
    private String c;
    private String d;
    private DialogInterface.OnClickListener e;
    private h f;
    private String g = "REMEBERACTIONTIP";
    private String h = "REMEBERACTIONTIPFlYTO";
    private String i = "REMEBERACTIONTIPPOI";
    private String j = "REMEBERACTIONTAKEPHOTO";
    private boolean k;
    private boolean l;
    
    public a(Context paramContext)
    {
      this.b = paramContext;
      this.f = h.a(paramContext);
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
    
    public a a(boolean paramBoolean)
    {
      this.k = paramBoolean;
      return this;
    }
    
    public e a()
    {
      this.a = v.a(this.b);
      this.g = "REMEBERACTIONTIP";
      this.i = "REMEBERACTIONTIPPOI";
      this.h = "REMEBERACTIONTIPFlYTO";
      this.j = "REMEBERACTIONTAKEPHOTO";
      Object localObject1 = (LayoutInflater)this.b.getSystemService("layout_inflater");
      final e locale = new e(this.b, 2131427408);
      localObject1 = ((LayoutInflater)localObject1).inflate(2130968683, null);
      Object localObject2 = (JustifyTextView)((View)localObject1).findViewById(2131690199);
      TextView localTextView = (TextView)((View)localObject1).findViewById(2131689628);
      Button localButton = (Button)((View)localObject1).findViewById(2131690000);
      final RadioButton localRadioButton = (RadioButton)((View)localObject1).findViewById(2131690200);
      if (!this.k)
      {
        localRadioButton.setVisibility(8);
        e.a(localRadioButton, 127);
        localRadioButton.setOnClickListener(new View.OnClickListener()
        {
          public void onClick(View paramAnonymousView)
          {
            if (!e.a.a(e.a.this))
            {
              localRadioButton.setChecked(true);
              e.a.a(e.a.this, true);
              if (e.a.b(e.a.this).a().get() == 1) {
                e.a.this.a.a().edit().putBoolean(e.a.c(e.a.this), true).commit();
              }
            }
            do
            {
              do
              {
                return;
                if (e.a.b(e.a.this).a().get() == 2)
                {
                  e.a.this.a.a().edit().putBoolean(e.a.d(e.a.this), true).commit();
                  return;
                }
                if (e.a.b(e.a.this).a().get() == 3)
                {
                  e.a.this.a.a().edit().putBoolean(e.a.e(e.a.this), true).commit();
                  return;
                }
              } while (e.a.b(e.a.this).a().get() != 4);
              e.a.this.a.a().edit().putBoolean(e.a.f(e.a.this), true).commit();
              return;
              localRadioButton.setChecked(false);
              e.a.a(e.a.this, false);
              if (e.a.b(e.a.this).a().get() == 1)
              {
                e.a.this.a.a().edit().putBoolean(e.a.c(e.a.this), false).commit();
                return;
              }
              if (e.a.b(e.a.this).a().get() == 2)
              {
                e.a.this.a.a().edit().putBoolean(e.a.d(e.a.this), false).commit();
                return;
              }
              if (e.a.b(e.a.this).a().get() == 3)
              {
                e.a.this.a.a().edit().putBoolean(e.a.e(e.a.this), false).commit();
                return;
              }
            } while (e.a.b(e.a.this).a().get() != 4);
            e.a.this.a.a().edit().putBoolean(e.a.f(e.a.this), false).commit();
          }
        });
        if (this.d != null) {
          localButton.setText(this.d);
        }
        if (this.c != null) {
          ((JustifyTextView)localObject2).setText(this.c);
        }
        if (this.e != null) {
          localButton.setOnClickListener(new View.OnClickListener()
          {
            public void onClick(View paramAnonymousView)
            {
              locale.dismiss();
              e.a.g(e.a.this).onClick(locale, -2);
            }
          });
        }
        ao.a(this.b.getAssets(), new View[] { localObject2, localButton, localRadioButton, localTextView });
        locale.setContentView((View)localObject1);
        localObject1 = locale.getWindow();
        localObject2 = ((Window)localObject1).getAttributes();
        if (p.b(this.b) <= p.a(this.b)) {
          break label321;
        }
      }
      label321:
      for (float f1 = p.b(this.b);; f1 = p.a(this.b))
      {
        ((WindowManager.LayoutParams)localObject2).width = ((int)(f1 * 1032.0F / 1920.0F));
        ((Window)localObject1).setAttributes((WindowManager.LayoutParams)localObject2);
        locale.getWindow().getDecorView().setBackgroundColor(0);
        return locale;
        localRadioButton.setVisibility(0);
        break;
      }
    }
    
    public a b(String paramString)
    {
      this.d = paramString;
      return this;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */