package com.google.android.gms.cast.framework.media;

import android.net.Uri;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.common.images.WebImage;
import java.util.List;

public class b
{
  public static String a(MediaInfo paramMediaInfo, int paramInt)
  {
    paramMediaInfo = b(paramMediaInfo, paramInt);
    if (paramMediaInfo == null) {
      return null;
    }
    return paramMediaInfo.toString();
  }
  
  public static Uri b(MediaInfo paramMediaInfo, int paramInt)
  {
    if (paramMediaInfo == null) {}
    do
    {
      return null;
      paramMediaInfo = paramMediaInfo.e();
    } while ((paramMediaInfo == null) || (paramMediaInfo.f() == null) || (paramMediaInfo.f().size() <= paramInt));
    return ((WebImage)paramMediaInfo.f().get(paramInt)).b();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/framework/media/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */