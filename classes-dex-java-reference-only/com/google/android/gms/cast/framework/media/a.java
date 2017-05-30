package com.google.android.gms.cast.framework.media;

import com.google.android.gms.c.f;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.common.images.WebImage;
import java.util.List;

public class a
{
  public static final int a = 0;
  public static final int b = 1;
  public static final int c = 2;
  private final e d = new a(null);
  
  public e a()
  {
    return this.d;
  }
  
  public WebImage a(MediaMetadata paramMediaMetadata, int paramInt)
  {
    if ((paramMediaMetadata == null) || (!paramMediaMetadata.g())) {
      return null;
    }
    return (WebImage)paramMediaMetadata.f().get(0);
  }
  
  private class a
    extends e.a
  {
    private a() {}
    
    public int a()
    {
      return 9683208;
    }
    
    public WebImage a(MediaMetadata paramMediaMetadata, int paramInt)
    {
      return a.this.a(paramMediaMetadata, paramInt);
    }
    
    public com.google.android.gms.c.e b()
    {
      return f.a(a.this);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/framework/media/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */