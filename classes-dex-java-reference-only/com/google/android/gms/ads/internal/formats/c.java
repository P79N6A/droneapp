package com.google.android.gms.ads.internal.formats;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.c.e;
import com.google.android.gms.c.f;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.uu.a;

@aaa
public class c
  extends uu.a
{
  private final Drawable a;
  private final Uri b;
  private final double c;
  
  public c(Drawable paramDrawable, Uri paramUri, double paramDouble)
  {
    this.a = paramDrawable;
    this.b = paramUri;
    this.c = paramDouble;
  }
  
  public e a()
  {
    return f.a(this.a);
  }
  
  public Uri b()
  {
    return this.b;
  }
  
  public double c()
  {
    return this.c;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/formats/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */