package com.fimi.soul.view;

import android.annotation.TargetApi;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.fimi.kernel.c;
import com.fimi.kernel.utils.p;
import com.fimi.kernel.utils.t;
import com.fimi.kernel.utils.v;
import com.fimi.soul.utils.JustifyTextView;
import com.fimi.soul.utils.ao;

public class f
  extends Dialog
{
  public f(Context paramContext)
  {
    super(paramContext);
  }
  
  public f(Context paramContext, int paramInt)
  {
    super(paramContext, paramInt);
  }
  
  public f(Context paramContext, boolean paramBoolean, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    super(paramContext, paramBoolean, paramOnCancelListener);
  }
  
  public static class a
  {
    private Context a;
    private String b;
    private String c;
    private String d;
    private String e;
    private int f;
    private int g;
    private int h = -1;
    private int i = -1;
    private DialogInterface.OnClickListener j;
    private DialogInterface.OnClickListener k;
    private f l;
    private boolean m = false;
    
    public a(Context paramContext)
    {
      this.a = paramContext;
      this.l = new f(this.a, 2131427408);
    }
    
    private void a(TextView paramTextView)
    {
      paramTextView.getPaint().setFakeBoldText(true);
    }
    
    public a a(int paramInt)
    {
      this.f = paramInt;
      return this;
    }
    
    public a a(String paramString)
    {
      this.b = paramString;
      return this;
    }
    
    public a a(String paramString, DialogInterface.OnClickListener paramOnClickListener)
    {
      this.k = paramOnClickListener;
      this.d = paramString;
      return this;
    }
    
    public a a(boolean paramBoolean)
    {
      this.m = paramBoolean;
      return this;
    }
    
    public f a()
    {
      Object localObject1 = (LayoutInflater)this.a.getSystemService("layout_inflater");
      Object localObject2;
      if (this.e != null)
      {
        localObject1 = ((LayoutInflater)localObject1).inflate(2130968799, null);
        localObject2 = (JustifyTextView)((View)localObject1).findViewById(2131689998);
        Button localButton1 = (Button)((View)localObject1).findViewById(2131690016);
        Button localButton2 = (Button)((View)localObject1).findViewById(2131690015);
        if (this.e != null)
        {
          JustifyTextView localJustifyTextView = (JustifyTextView)((View)localObject1).findViewById(2131690013);
          localJustifyTextView.setText(this.e);
          ao.a(this.a.getAssets(), new View[] { localJustifyTextView });
          if (this.i != -1) {
            localJustifyTextView.setGravity(this.i);
          }
        }
        if (this.f != 0) {
          localButton1.setTextColor(this.f);
        }
        if (this.g > 0) {
          localButton2.setTextColor(this.g);
        }
        if (this.c != null) {
          localButton1.setText(this.c);
        }
        if (this.j != null) {
          localButton1.setOnClickListener(new View.OnClickListener()
          {
            public void onClick(View paramAnonymousView)
            {
              f.this.dismiss();
              f.a.b(f.a.this).onClick(f.this, -2);
            }
          });
        }
        if (this.d != null) {
          localButton2.setText(this.d);
        }
        if (this.k != null) {
          localButton2.setOnClickListener(new View.OnClickListener()
          {
            public void onClick(View paramAnonymousView)
            {
              f.this.dismiss();
              f.a.c(f.a.this).onClick(f.this, -2);
            }
          });
        }
        if (this.b != null) {
          ((JustifyTextView)localObject2).setText(this.b);
        }
        if (this.h != -1) {
          ((JustifyTextView)localObject2).setGravity(this.h);
        }
        ao.a(this.a.getAssets(), new View[] { localObject2, localButton1, localButton2 });
        if (this.e != null) {
          ((JustifyTextView)localObject2).getPaint().setFakeBoldText(true);
        }
        this.l.setCanceledOnTouchOutside(this.m);
        this.l.setContentView((View)localObject1);
        localObject1 = this.l.getWindow();
        localObject2 = ((Window)localObject1).getAttributes();
        if (p.b(this.a) <= p.a(this.a)) {
          break label407;
        }
      }
      label407:
      for (float f1 = p.b(this.a);; f1 = p.a(this.a))
      {
        ((WindowManager.LayoutParams)localObject2).width = ((int)(f1 * 1048.0F / 1920.0F));
        ((Window)localObject1).setAttributes((WindowManager.LayoutParams)localObject2);
        this.l.getWindow().getDecorView().setBackgroundColor(0);
        return this.l;
        localObject1 = ((LayoutInflater)localObject1).inflate(2130968800, null);
        break;
      }
    }
    
    public a b(int paramInt)
    {
      this.g = paramInt;
      return this;
    }
    
    public a b(String paramString)
    {
      this.e = paramString;
      return this;
    }
    
    public a b(String paramString, DialogInterface.OnClickListener paramOnClickListener)
    {
      this.j = paramOnClickListener;
      this.c = paramString;
      return this;
    }
    
    public f b()
    {
      return this.l;
    }
    
    public a c(int paramInt)
    {
      this.h = paramInt;
      return this;
    }
    
    public a c(String paramString)
    {
      this.c = paramString;
      return this;
    }
    
    public a d(int paramInt)
    {
      this.i = paramInt;
      return this;
    }
    
    public a d(String paramString)
    {
      this.d = paramString;
      return this;
    }
  }
  
  public static class b
  {
    private static final int p = 0;
    private static final int q = 115;
    boolean a = false;
    private Context b;
    private String c;
    private String d;
    private int e;
    private String f;
    private int g = 500;
    private int h = 0;
    private int i = 0;
    private String j;
    private String k;
    private boolean l = false;
    private DialogInterface.OnClickListener m;
    private DialogInterface.OnClickListener n;
    private SeekBar.OnSeekBarChangeListener o;
    private boolean r = false;
    
    public b(Context paramContext)
    {
      this.b = paramContext;
      this.a = c.e().m();
    }
    
    private void a(TextView paramTextView)
    {
      paramTextView.getPaint().setFakeBoldText(true);
    }
    
    public b a(int paramInt)
    {
      this.i = paramInt;
      return this;
    }
    
    public b a(SeekBar.OnSeekBarChangeListener paramOnSeekBarChangeListener)
    {
      this.o = paramOnSeekBarChangeListener;
      return this;
    }
    
    public b a(String paramString)
    {
      this.j = paramString;
      return this;
    }
    
    public b a(String paramString, DialogInterface.OnClickListener paramOnClickListener)
    {
      this.n = paramOnClickListener;
      this.d = paramString;
      return this;
    }
    
    public b a(boolean paramBoolean)
    {
      this.l = paramBoolean;
      return this;
    }
    
    public f a()
    {
      Object localObject1 = (LayoutInflater)this.b.getSystemService("layout_inflater");
      final f localf = new f(this.b, 2131427408);
      localObject1 = ((LayoutInflater)localObject1).inflate(2130968801, null);
      Object localObject2 = (TextView)((View)localObject1).findViewById(2131689998);
      Button localButton1 = (Button)((View)localObject1).findViewById(2131690016);
      Button localButton2 = (Button)((View)localObject1).findViewById(2131690015);
      final SeekBar localSeekBar = (SeekBar)((View)localObject1).findViewById(2131690610);
      TextView localTextView1 = (TextView)((View)localObject1).findViewById(2131690611);
      TextView localTextView2 = (TextView)((View)localObject1).findViewById(2131690612);
      final TextView localTextView3 = (TextView)((View)localObject1).findViewById(2131690609);
      TextView localTextView4 = (TextView)((View)localObject1).findViewById(2131690608);
      if (this.k != null) {
        localTextView4.setText(this.k);
      }
      ((RelativeLayout)((View)localObject1).findViewById(2131690607)).setOnTouchListener(new View.OnTouchListener()
      {
        public boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
        {
          float f1 = 0.0F;
          paramAnonymousView = new Rect();
          localSeekBar.getHitRect(paramAnonymousView);
          float f3;
          float f2;
          if ((paramAnonymousMotionEvent.getY() >= paramAnonymousView.top - 50) && (paramAnonymousMotionEvent.getY() <= paramAnonymousView.bottom + 50))
          {
            f3 = paramAnonymousView.top + paramAnonymousView.height() / 2;
            f2 = paramAnonymousMotionEvent.getX() - paramAnonymousView.left;
            if (f2 >= 0.0F) {}
          }
          for (;;)
          {
            paramAnonymousView = MotionEvent.obtain(paramAnonymousMotionEvent.getDownTime(), paramAnonymousMotionEvent.getEventTime(), paramAnonymousMotionEvent.getAction(), f1, f3, paramAnonymousMotionEvent.getMetaState());
            return localSeekBar.onTouchEvent(paramAnonymousView);
            if (f2 > paramAnonymousView.width())
            {
              f1 = paramAnonymousView.width();
              continue;
              return false;
            }
            else
            {
              f1 = f2;
            }
          }
        }
      });
      localSeekBar.setMax(this.h - this.i);
      localTextView1.setText(this.i + this.j);
      localTextView2.setText(this.h + this.j);
      localSeekBar.setProgress(this.g - this.i);
      if (this.l) {
        if (this.a) {
          if (this.g <= t.b(6.0D))
          {
            localTextView3.setText(this.g + this.b.getString(2131362774) + this.b.getString(2131362701));
            localSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
            {
              public void onProgressChanged(SeekBar paramAnonymousSeekBar, int paramAnonymousInt, boolean paramAnonymousBoolean)
              {
                boolean bool = c.e().m();
                int i;
                if (f.b.a(f.b.this))
                {
                  i = f.b.b(f.b.this) + paramAnonymousInt;
                  if (bool) {
                    if (i <= t.b(6.0D)) {
                      localTextView3.setText(i + f.b.c(f.b.this).getString(2131362774) + f.b.c(f.b.this).getString(2131362701));
                    }
                  }
                }
                for (;;)
                {
                  f.b.e(f.b.this).onProgressChanged(paramAnonymousSeekBar, paramAnonymousInt, paramAnonymousBoolean);
                  return;
                  if ((i > t.b(6.0D)) && (i <= t.b(10.0D)))
                  {
                    localTextView3.setText(i + f.b.c(f.b.this).getString(2131362774) + f.b.c(f.b.this).getString(2131362702));
                  }
                  else
                  {
                    localTextView3.setText(i + f.b.c(f.b.this).getString(2131362774) + f.b.c(f.b.this).getString(2131362700));
                    continue;
                    if (i <= 6)
                    {
                      localTextView3.setText(i + f.b.c(f.b.this).getString(2131362773) + f.b.c(f.b.this).getString(2131362701));
                    }
                    else if ((i > 6) && (i <= 10))
                    {
                      localTextView3.setText(i + f.b.c(f.b.this).getString(2131362773) + f.b.c(f.b.this).getString(2131362702));
                    }
                    else
                    {
                      localTextView3.setText(i + f.b.c(f.b.this).getString(2131362773) + f.b.c(f.b.this).getString(2131362700));
                      continue;
                      if (bool) {
                        localTextView3.setText(f.b.b(f.b.this) + paramAnonymousInt + f.b.c(f.b.this).getString(2131362150));
                      } else {
                        localTextView3.setText(f.b.b(f.b.this) + paramAnonymousInt + f.b.d(f.b.this));
                      }
                    }
                  }
                }
              }
              
              public void onStartTrackingTouch(SeekBar paramAnonymousSeekBar)
              {
                f.b.e(f.b.this).onStartTrackingTouch(paramAnonymousSeekBar);
              }
              
              public void onStopTrackingTouch(SeekBar paramAnonymousSeekBar)
              {
                f.b.e(f.b.this).onStopTrackingTouch(paramAnonymousSeekBar);
              }
            });
            if (this.d != null) {
              localButton1.setText(this.d);
            }
            if (this.m != null) {
              localButton1.setOnClickListener(new View.OnClickListener()
              {
                public void onClick(View paramAnonymousView)
                {
                  localf.dismiss();
                  f.b.f(f.b.this).onClick(localf, -2);
                }
              });
            }
            if (this.e != -1) {
              localButton1.setTextColor(this.e);
            }
            if (this.f != null) {
              localButton2.setText(this.d);
            }
            if (this.n != null) {
              localButton2.setOnClickListener(new View.OnClickListener()
              {
                public void onClick(View paramAnonymousView)
                {
                  localf.dismiss();
                  f.b.g(f.b.this).onClick(localf, -2);
                }
              });
            }
            if (this.c != null) {
              ((TextView)localObject2).setText(this.c);
            }
            ao.a(this.b.getAssets(), new View[] { localObject2, localButton1, localButton2, localTextView4 });
            ao.b(this.b.getAssets(), new View[] { localTextView1, localTextView2, localTextView3 });
            a((TextView)localObject2);
            a(localTextView4);
            a(localTextView3);
            a(localTextView1);
            a(localTextView2);
            localf.setCanceledOnTouchOutside(this.r);
            localf.setContentView((View)localObject1);
            localObject1 = localf.getWindow();
            localObject2 = ((Window)localObject1).getAttributes();
            if (p.b(this.b) <= p.a(this.b)) {
              break label963;
            }
          }
        }
      }
      label963:
      for (float f1 = p.b(this.b);; f1 = p.a(this.b))
      {
        ((WindowManager.LayoutParams)localObject2).width = ((int)(f1 * 1048.0F / 1920.0F));
        ((Window)localObject1).setAttributes((WindowManager.LayoutParams)localObject2);
        localf.getWindow().getDecorView().setBackgroundColor(0);
        return localf;
        if ((this.g > t.b(6.0D)) && (this.g <= t.b(10.0D)))
        {
          localTextView3.setText(this.g + this.b.getString(2131362774) + this.b.getString(2131362702));
          break;
        }
        localTextView3.setText(this.g + this.b.getString(2131362774) + this.b.getString(2131362700));
        break;
        if (this.g <= 6)
        {
          localTextView3.setText(this.g + this.b.getString(2131362773) + this.b.getString(2131362701));
          break;
        }
        if ((this.g > 6) && (this.g <= 10))
        {
          localTextView3.setText(this.g + this.b.getString(2131362773) + this.b.getString(2131362702));
          break;
        }
        localTextView3.setText(this.g + this.b.getString(2131362773) + this.b.getString(2131362700));
        break;
        localTextView3.setText(this.g + this.j);
        break;
      }
    }
    
    public b b(int paramInt)
    {
      this.h = paramInt;
      return this;
    }
    
    public b b(String paramString)
    {
      this.k = paramString;
      return this;
    }
    
    public b b(String paramString, DialogInterface.OnClickListener paramOnClickListener)
    {
      this.m = paramOnClickListener;
      this.d = paramString;
      return this;
    }
    
    public b b(boolean paramBoolean)
    {
      this.r = paramBoolean;
      return this;
    }
    
    public b c(int paramInt)
    {
      this.g = paramInt;
      return this;
    }
    
    public b c(String paramString)
    {
      this.c = paramString;
      return this;
    }
    
    public b d(int paramInt)
    {
      this.e = paramInt;
      return this;
    }
    
    public b d(String paramString)
    {
      this.d = paramString;
      return this;
    }
    
    public b e(String paramString)
    {
      this.f = paramString;
      return this;
    }
  }
  
  public static class c
  {
    private f a;
    private Context b;
    private String c;
    private String d;
    private DialogInterface.OnClickListener e;
    private boolean f = false;
    
    public c(Context paramContext)
    {
      this.b = paramContext;
      this.a = new f(this.b, 2131427408);
    }
    
    public c a(DialogInterface.OnClickListener paramOnClickListener)
    {
      this.e = paramOnClickListener;
      return this;
    }
    
    public c a(String paramString)
    {
      this.c = paramString;
      return this;
    }
    
    public c a(String paramString, DialogInterface.OnClickListener paramOnClickListener)
    {
      this.e = paramOnClickListener;
      this.d = paramString;
      return this;
    }
    
    public c a(boolean paramBoolean)
    {
      this.f = paramBoolean;
      return this;
    }
    
    public f a()
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
            f.this.dismiss();
            f.c.b(f.c.this).onClick(f.this, -2);
          }
        });
      }
      ao.a(this.b.getAssets(), new View[] { localObject2, localButton });
      this.a.setCanceledOnTouchOutside(this.f);
      this.a.setContentView((View)localObject1);
      localObject1 = this.a.getWindow();
      localObject2 = ((Window)localObject1).getAttributes();
      if (p.b(this.b) > p.a(this.b)) {}
      for (float f1 = p.b(this.b);; f1 = p.a(this.b))
      {
        ((WindowManager.LayoutParams)localObject2).width = ((int)(f1 * 1032.0F / 1920.0F));
        ((Window)localObject1).setAttributes((WindowManager.LayoutParams)localObject2);
        this.a.getWindow().getDecorView().setBackgroundColor(0);
        return this.a;
      }
    }
    
    public c b(String paramString)
    {
      this.d = paramString;
      return this;
    }
    
    public f b()
    {
      return this.a;
    }
  }
  
  public static class d
  {
    private Context a;
    private String b;
    private String c;
    private int d = 0;
    private String e;
    private int f;
    private CharSequence g;
    private CharSequence h;
    private DialogInterface.OnClickListener i;
    private boolean j = false;
    private boolean k = false;
    private boolean l = true;
    
    public d(Context paramContext)
    {
      this.a = paramContext;
    }
    
    private void a(TextView paramTextView)
    {
      paramTextView.getPaint().setFakeBoldText(true);
    }
    
    public d a(int paramInt)
    {
      this.d = paramInt;
      return this;
    }
    
    public d a(CharSequence paramCharSequence)
    {
      this.g = paramCharSequence;
      return this;
    }
    
    public d a(String paramString)
    {
      this.b = paramString;
      return this;
    }
    
    public d a(String paramString, DialogInterface.OnClickListener paramOnClickListener)
    {
      this.i = paramOnClickListener;
      this.c = paramString;
      return this;
    }
    
    public d a(boolean paramBoolean)
    {
      this.l = paramBoolean;
      return this;
    }
    
    @TargetApi(16)
    public f a()
    {
      Object localObject1 = (LayoutInflater)this.a.getSystemService("layout_inflater");
      final f localf = new f(this.a, 2131427408);
      Object localObject2;
      if ((this.e != null) || (this.h != null))
      {
        localObject1 = ((LayoutInflater)localObject1).inflate(2130968661, null);
        localObject2 = (TextView)((View)localObject1).findViewById(2131689998);
        Object localObject3 = (ImageView)((View)localObject1).findViewById(2131689999);
        Button localButton = (Button)((View)localObject1).findViewById(2131690000);
        if (this.d != 0) {
          ((ImageView)localObject3).setBackground(this.a.getResources().getDrawable(this.d));
        }
        if ((this.b == null) || (!this.l)) {
          break label447;
        }
        localObject3 = new SpannableStringBuilder(this.b);
        ((SpannableStringBuilder)localObject3).setSpan(new ForegroundColorSpan(this.a.getResources().getColor(2131624230)), 4, 18, 33);
        ((TextView)localObject2).setText((CharSequence)localObject3);
        label171:
        if (this.c != null) {
          localButton.setText(this.c);
        }
        if (this.i != null) {
          localButton.setOnClickListener(new View.OnClickListener()
          {
            public void onClick(View paramAnonymousView)
            {
              localf.dismiss();
              f.d.a(f.d.this).onClick(localf, -2);
            }
          });
        }
        if (this.e != null)
        {
          localObject3 = (TextView)((View)localObject1).findViewById(2131690013);
          ((TextView)localObject3).setText(this.e);
          ao.a(this.a.getAssets(), new View[] { localObject3 });
        }
        if (this.h != null)
        {
          localObject3 = (TextView)((View)localObject1).findViewById(2131690013);
          ((TextView)localObject3).setText(this.h);
          ao.a(this.a.getAssets(), new View[] { localObject3 });
        }
        if (this.j) {
          a((TextView)localObject2);
        }
        if (this.f != 0) {
          ((TextView)localObject2).setTextColor(this.f);
        }
        ao.a(this.a.getAssets(), new View[] { localObject2, localButton });
        localf.setCanceledOnTouchOutside(this.k);
        localf.setContentView((View)localObject1);
        localObject1 = localf.getWindow();
        localObject2 = ((Window)localObject1).getAttributes();
        if (p.b(this.a) <= p.a(this.a)) {
          break label466;
        }
      }
      label447:
      label466:
      for (float f1 = p.b(this.a);; f1 = p.a(this.a))
      {
        ((WindowManager.LayoutParams)localObject2).width = ((int)(f1 * 1032.0F / 1920.0F));
        ((Window)localObject1).setAttributes((WindowManager.LayoutParams)localObject2);
        localf.getWindow().getDecorView().setBackgroundColor(0);
        return localf;
        localObject1 = ((LayoutInflater)localObject1).inflate(2130968798, null);
        break;
        if (this.b == null) {
          break label171;
        }
        ((TextView)localObject2).setText(this.b);
        break label171;
      }
    }
    
    public d b(int paramInt)
    {
      this.f = paramInt;
      return this;
    }
    
    public d b(CharSequence paramCharSequence)
    {
      this.h = paramCharSequence;
      return this;
    }
    
    public d b(String paramString)
    {
      this.c = paramString;
      return this;
    }
    
    public d b(boolean paramBoolean)
    {
      this.j = paramBoolean;
      return this;
    }
    
    public d c(String paramString)
    {
      this.e = paramString;
      return this;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */