package com.fimi.soul.media.player;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.Log;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class FermiPlayerUtils
{
  private static SimpleDateFormat sdf = new SimpleDateFormat();
  
  public static boolean createRemoteVideoThumbnail(String paramString1, String paramString2)
  {
    return FimiMediaPlayer.getIntance().videoToJpg(paramString1, paramString2);
  }
  
  public static Bitmap createVideoThumbnail(String paramString)
  {
    return ThumbnailUtils.createVideoThumbnail(paramString.replace("file://", ""), 1);
  }
  
  public static Bitmap createVideoThumbnail(String paramString, int paramInt)
  {
    paramString = paramString.replace("file://", "");
    if (Build.VERSION.SDK_INT >= 14)
    {
      MediaMetadataRetriever localMediaMetadataRetriever = new MediaMetadataRetriever();
      localMediaMetadataRetriever.setDataSource(paramString);
      return localMediaMetadataRetriever.getFrameAtTime(paramInt * 1000, 2);
    }
    return createVideoThumbnail(paramString);
  }
  
  public static Bitmap createVideoThumbnail(String paramString, int paramInt1, int paramInt2)
  {
    Bitmap localBitmap = createVideoThumbnail(paramString);
    paramString = localBitmap;
    if (localBitmap != null) {
      paramString = ThumbnailUtils.extractThumbnail(localBitmap, paramInt1, paramInt2);
    }
    return paramString;
  }
  
  public static Bitmap createVideoThumbnail(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    Bitmap localBitmap = createVideoThumbnail(paramString, paramInt3);
    paramString = localBitmap;
    if (localBitmap != null) {
      paramString = ThumbnailUtils.extractThumbnail(localBitmap, paramInt1, paramInt2);
    }
    return paramString;
  }
  
  public static String getTimelineString(long paramLong)
  {
    return getTimelineString(paramLong, "HH:mm:ss");
  }
  
  public static String getTimelineString(long paramLong, String paramString)
  {
    sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
    sdf.applyPattern(paramString);
    return sdf.format(new Date(paramLong));
  }
  
  public static long getVideoDuration(Context paramContext, String paramString)
  {
    paramString = new File(paramString);
    if ((paramString.isFile()) && (paramString.exists())) {
      try
      {
        long l = MediaPlayer.create(paramContext, Uri.fromFile(paramString)).getDuration();
        Log.d("Good", "time:" + l);
        return l;
      }
      catch (Exception paramContext) {}
    }
    return 0L;
  }
  
  public static String getVideoDurationString(Context paramContext, String paramString)
  {
    return getTimelineString(getVideoDuration(paramContext, paramString));
  }
  
  public static String getVideoDurationString(Context paramContext, String paramString1, String paramString2)
  {
    return getTimelineString(getVideoDuration(paramContext, paramString1), paramString2);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/media/player/FermiPlayerUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */