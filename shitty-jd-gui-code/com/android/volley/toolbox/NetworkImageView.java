package com.android.volley.toolbox;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.android.volley.u;

public class NetworkImageView
  extends ImageView
{
  private String a;
  private int b;
  private int c;
  private k d;
  private k.c e;
  
  public NetworkImageView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public NetworkImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public NetworkImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  private void a()
  {
    if (this.b != 0)
    {
      setImageResource(this.b);
      return;
    }
    setImageBitmap(null);
  }
  
  public void a(String paramString, k paramk)
  {
    this.a = paramString;
    this.d = paramk;
    a(false);
  }
  
  void a(final boolean paramBoolean)
  {
    int i1 = 1;
    int n = getWidth();
    int m = getHeight();
    ImageView.ScaleType localScaleType = getScaleType();
    int i;
    int j;
    label56:
    int k;
    if (getLayoutParams() != null) {
      if (getLayoutParams().width == -2)
      {
        i = 1;
        if (getLayoutParams().height != -2) {
          break label97;
        }
        j = 1;
        k = j;
        j = i;
        i = k;
      }
    }
    for (;;)
    {
      if ((j != 0) && (i != 0))
      {
        k = i1;
        label76:
        if ((n != 0) || (m != 0) || (k != 0)) {
          break label108;
        }
      }
      label97:
      label108:
      do
      {
        return;
        i = 0;
        break;
        j = 0;
        break label56;
        k = 0;
        break label76;
        if (TextUtils.isEmpty(this.a))
        {
          if (this.e != null)
          {
            this.e.a();
            this.e = null;
          }
          a();
          return;
        }
        if ((this.e == null) || (this.e.c() == null)) {
          break label187;
        }
      } while (this.e.c().equals(this.a));
      this.e.a();
      a();
      label187:
      if (j != 0) {}
      for (j = 0;; j = n)
      {
        k = m;
        if (i != 0) {
          k = 0;
        }
        this.e = this.d.a(this.a, new k.d()
        {
          public void a(final k.c paramAnonymousc, boolean paramAnonymousBoolean)
          {
            if ((paramAnonymousBoolean) && (paramBoolean)) {
              NetworkImageView.this.post(new Runnable()
              {
                public void run()
                {
                  NetworkImageView.1.this.a(paramAnonymousc, false);
                }
              });
            }
            do
            {
              return;
              if (paramAnonymousc.b() != null)
              {
                NetworkImageView.this.setImageBitmap(paramAnonymousc.b());
                return;
              }
            } while (NetworkImageView.b(NetworkImageView.this) == 0);
            NetworkImageView.this.setImageResource(NetworkImageView.b(NetworkImageView.this));
          }
          
          public void a(u paramAnonymousu)
          {
            if (NetworkImageView.a(NetworkImageView.this) != 0) {
              NetworkImageView.this.setImageResource(NetworkImageView.a(NetworkImageView.this));
            }
          }
        }, j, k, localScaleType);
        return;
      }
      i = 0;
      j = 0;
    }
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    invalidate();
  }
  
  public String getImageURL()
  {
    return this.a;
  }
  
  protected void onDetachedFromWindow()
  {
    if (this.e != null)
    {
      this.e.a();
      setImageBitmap(null);
      this.e = null;
    }
    super.onDetachedFromWindow();
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    a(true);
  }
  
  public void setDefaultImageResId(int paramInt)
  {
    this.b = paramInt;
  }
  
  public void setErrorImageResId(int paramInt)
  {
    this.c = paramInt;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/android/volley/toolbox/NetworkImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */