package com.fimi.soul.media.player;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

public class FimiMediaMeta
{
  public static final long AV_CH_BACK_CENTER = 256L;
  public static final long AV_CH_BACK_LEFT = 16L;
  public static final long AV_CH_BACK_RIGHT = 32L;
  public static final long AV_CH_FRONT_CENTER = 4L;
  public static final long AV_CH_FRONT_LEFT = 1L;
  public static final long AV_CH_FRONT_LEFT_OF_CENTER = 64L;
  public static final long AV_CH_FRONT_RIGHT = 2L;
  public static final long AV_CH_FRONT_RIGHT_OF_CENTER = 128L;
  public static final long AV_CH_LAYOUT_2POINT1 = 11L;
  public static final long AV_CH_LAYOUT_2_1 = 259L;
  public static final long AV_CH_LAYOUT_2_2 = 1539L;
  public static final long AV_CH_LAYOUT_3POINT1 = 15L;
  public static final long AV_CH_LAYOUT_4POINT0 = 263L;
  public static final long AV_CH_LAYOUT_4POINT1 = 271L;
  public static final long AV_CH_LAYOUT_5POINT0 = 1543L;
  public static final long AV_CH_LAYOUT_5POINT0_BACK = 55L;
  public static final long AV_CH_LAYOUT_5POINT1 = 1551L;
  public static final long AV_CH_LAYOUT_5POINT1_BACK = 63L;
  public static final long AV_CH_LAYOUT_6POINT0 = 1799L;
  public static final long AV_CH_LAYOUT_6POINT0_FRONT = 1731L;
  public static final long AV_CH_LAYOUT_6POINT1 = 1807L;
  public static final long AV_CH_LAYOUT_6POINT1_BACK = 319L;
  public static final long AV_CH_LAYOUT_6POINT1_FRONT = 1739L;
  public static final long AV_CH_LAYOUT_7POINT0 = 1591L;
  public static final long AV_CH_LAYOUT_7POINT0_FRONT = 1735L;
  public static final long AV_CH_LAYOUT_7POINT1 = 1599L;
  public static final long AV_CH_LAYOUT_7POINT1_WIDE = 1743L;
  public static final long AV_CH_LAYOUT_7POINT1_WIDE_BACK = 255L;
  public static final long AV_CH_LAYOUT_HEXAGONAL = 311L;
  public static final long AV_CH_LAYOUT_MONO = 4L;
  public static final long AV_CH_LAYOUT_OCTAGONAL = 1847L;
  public static final long AV_CH_LAYOUT_QUAD = 51L;
  public static final long AV_CH_LAYOUT_STEREO = 3L;
  public static final long AV_CH_LAYOUT_STEREO_DOWNMIX = 1610612736L;
  public static final long AV_CH_LAYOUT_SURROUND = 7L;
  public static final long AV_CH_LOW_FREQUENCY = 8L;
  public static final long AV_CH_LOW_FREQUENCY_2 = 34359738368L;
  public static final long AV_CH_SIDE_LEFT = 512L;
  public static final long AV_CH_SIDE_RIGHT = 1024L;
  public static final long AV_CH_STEREO_LEFT = 536870912L;
  public static final long AV_CH_STEREO_RIGHT = 1073741824L;
  public static final long AV_CH_SURROUND_DIRECT_LEFT = 8589934592L;
  public static final long AV_CH_SURROUND_DIRECT_RIGHT = 17179869184L;
  public static final long AV_CH_TOP_BACK_CENTER = 65536L;
  public static final long AV_CH_TOP_BACK_LEFT = 32768L;
  public static final long AV_CH_TOP_BACK_RIGHT = 131072L;
  public static final long AV_CH_TOP_CENTER = 2048L;
  public static final long AV_CH_TOP_FRONT_CENTER = 8192L;
  public static final long AV_CH_TOP_FRONT_LEFT = 4096L;
  public static final long AV_CH_TOP_FRONT_RIGHT = 16384L;
  public static final long AV_CH_WIDE_LEFT = 2147483648L;
  public static final long AV_CH_WIDE_RIGHT = 4294967296L;
  public static final String IJKM_KEY_AUDIO_STREAM = "audio";
  public static final String IJKM_KEY_BITRATE = "bitrate";
  public static final String IJKM_KEY_CHANNEL_LAYOUT = "channel_layout";
  public static final String IJKM_KEY_CODEC_LONG_NAME = "codec_long_name";
  public static final String IJKM_KEY_CODEC_NAME = "codec_name";
  public static final String IJKM_KEY_CODEC_PROFILE = "codec_profile";
  public static final String IJKM_KEY_DURATION_US = "duration_us";
  public static final String IJKM_KEY_FORMAT = "format";
  public static final String IJKM_KEY_FPS_DEN = "fps_den";
  public static final String IJKM_KEY_FPS_NUM = "fps_num";
  public static final String IJKM_KEY_HEIGHT = "height";
  public static final String IJKM_KEY_SAMPLE_RATE = "sample_rate";
  public static final String IJKM_KEY_SAR_DEN = "sar_den";
  public static final String IJKM_KEY_SAR_NUM = "sar_num";
  public static final String IJKM_KEY_START_US = "start_us";
  public static final String IJKM_KEY_STREAMS = "streams";
  public static final String IJKM_KEY_TBR_DEN = "tbr_den";
  public static final String IJKM_KEY_TBR_NUM = "tbr_num";
  public static final String IJKM_KEY_TYPE = "type";
  public static final String IJKM_KEY_VIDEO_STREAM = "video";
  public static final String IJKM_KEY_WIDTH = "width";
  public static final String IJKM_VAL_TYPE__AUDIO = "audio";
  public static final String IJKM_VAL_TYPE__UNKNOWN = "unknown";
  public static final String IJKM_VAL_TYPE__VIDEO = "video";
  public IjkStreamMeta mAudioStream;
  public long mBitrate;
  public long mDurationUS;
  public String mFormat;
  public Bundle mMediaMeta;
  public long mStartUS;
  public ArrayList<IjkStreamMeta> mStreams;
  public IjkStreamMeta mVideoStream;
  
  public static FimiMediaMeta parse(Bundle paramBundle)
  {
    if (paramBundle == null) {
      return null;
    }
    FimiMediaMeta localFimiMediaMeta = new FimiMediaMeta();
    localFimiMediaMeta.mMediaMeta = paramBundle;
    localFimiMediaMeta.mFormat = localFimiMediaMeta.getString("format");
    localFimiMediaMeta.mDurationUS = localFimiMediaMeta.getLong("duration_us");
    localFimiMediaMeta.mStartUS = localFimiMediaMeta.getLong("start_us");
    localFimiMediaMeta.mBitrate = localFimiMediaMeta.getLong("bitrate");
    int k = localFimiMediaMeta.getInt("video", -1);
    int m = localFimiMediaMeta.getInt("audio", -1);
    paramBundle = localFimiMediaMeta.getParcelableArrayList("streams");
    if (paramBundle == null) {
      return localFimiMediaMeta;
    }
    paramBundle = paramBundle.iterator();
    int i = -1;
    while (paramBundle.hasNext())
    {
      Bundle localBundle = (Bundle)paramBundle.next();
      int j = i + 1;
      i = j;
      if (localBundle != null)
      {
        IjkStreamMeta localIjkStreamMeta = new IjkStreamMeta(j);
        localIjkStreamMeta.mMeta = localBundle;
        localIjkStreamMeta.mType = localIjkStreamMeta.getString("type");
        i = j;
        if (!TextUtils.isEmpty(localIjkStreamMeta.mType))
        {
          localIjkStreamMeta.mCodecName = localIjkStreamMeta.getString("codec_name");
          localIjkStreamMeta.mCodecProfile = localIjkStreamMeta.getString("codec_profile");
          localIjkStreamMeta.mCodecLongName = localIjkStreamMeta.getString("codec_long_name");
          localIjkStreamMeta.mBitrate = localIjkStreamMeta.getInt("bitrate");
          if (localIjkStreamMeta.mType.equalsIgnoreCase("video"))
          {
            localIjkStreamMeta.mWidth = localIjkStreamMeta.getInt("width");
            localIjkStreamMeta.mHeight = localIjkStreamMeta.getInt("height");
            localIjkStreamMeta.mFpsNum = localIjkStreamMeta.getInt("fps_num");
            localIjkStreamMeta.mFpsDen = localIjkStreamMeta.getInt("fps_den");
            localIjkStreamMeta.mTbrNum = localIjkStreamMeta.getInt("tbr_num");
            localIjkStreamMeta.mTbrDen = localIjkStreamMeta.getInt("tbr_den");
            localIjkStreamMeta.mSarNum = localIjkStreamMeta.getInt("sar_num");
            localIjkStreamMeta.mSarDen = localIjkStreamMeta.getInt("sar_den");
            i = j;
            if (k == j)
            {
              localFimiMediaMeta.mVideoStream = localIjkStreamMeta;
              i = j;
            }
          }
          else
          {
            i = j;
            if (localIjkStreamMeta.mType.equalsIgnoreCase("audio"))
            {
              localIjkStreamMeta.mSampleRate = localIjkStreamMeta.getInt("sample_rate");
              localIjkStreamMeta.mChannelLayout = localIjkStreamMeta.getLong("channel_layout");
              i = j;
              if (m == j)
              {
                localFimiMediaMeta.mAudioStream = localIjkStreamMeta;
                i = j;
              }
            }
          }
        }
      }
    }
    return localFimiMediaMeta;
  }
  
  public String getDurationInline()
  {
    long l1 = (this.mDurationUS + 5000L) / 1000000L;
    long l2 = l1 / 60L;
    long l3 = l2 / 60L;
    return String.format(Locale.US, "%02d:%02d:%02d", new Object[] { Long.valueOf(l3), Long.valueOf(l2 % 60L), Long.valueOf(l1 % 60L) });
  }
  
  public int getInt(String paramString)
  {
    return getInt(paramString, 0);
  }
  
  public int getInt(String paramString, int paramInt)
  {
    paramString = getString(paramString);
    if (TextUtils.isEmpty(paramString)) {
      return paramInt;
    }
    try
    {
      int i = Integer.parseInt(paramString);
      return i;
    }
    catch (NumberFormatException paramString) {}
    return paramInt;
  }
  
  public long getLong(String paramString)
  {
    return getLong(paramString, 0L);
  }
  
  public long getLong(String paramString, long paramLong)
  {
    paramString = getString(paramString);
    if (TextUtils.isEmpty(paramString)) {
      return paramLong;
    }
    try
    {
      long l = Long.parseLong(paramString);
      return l;
    }
    catch (NumberFormatException paramString) {}
    return paramLong;
  }
  
  public ArrayList<Bundle> getParcelableArrayList(String paramString)
  {
    return this.mMediaMeta.getParcelableArrayList(paramString);
  }
  
  public String getString(String paramString)
  {
    return this.mMediaMeta.getString(paramString);
  }
  
  public static class IjkStreamMeta
  {
    public long mBitrate;
    public long mChannelLayout;
    public String mCodecLongName;
    public String mCodecName;
    public String mCodecProfile;
    public int mFpsDen;
    public int mFpsNum;
    public int mHeight;
    public int mIndex;
    public Bundle mMeta;
    public int mSampleRate;
    public int mSarDen;
    public int mSarNum;
    public int mTbrDen;
    public int mTbrNum;
    public String mType;
    public int mWidth;
    
    public IjkStreamMeta(int paramInt)
    {
      this.mIndex = paramInt;
    }
    
    public String getBitrateInline()
    {
      if (this.mBitrate <= 0L) {
        return "N/A";
      }
      if (this.mBitrate < 1000L) {
        return String.format(Locale.US, "%d bit/s", new Object[] { Long.valueOf(this.mBitrate) });
      }
      return String.format(Locale.US, "%d kb/s", new Object[] { Long.valueOf(this.mBitrate / 1000L) });
    }
    
    public String getChannelLayoutInline()
    {
      if (this.mChannelLayout <= 0L) {
        return "N/A";
      }
      if (this.mChannelLayout == 4L) {
        return "mono";
      }
      if (this.mChannelLayout == 3L) {
        return "stereo";
      }
      return String.format(Locale.US, "%x", new Object[] { Long.valueOf(this.mChannelLayout) });
    }
    
    public String getCodecLongNameInline()
    {
      if (!TextUtils.isEmpty(this.mCodecLongName)) {
        return this.mCodecLongName;
      }
      if (!TextUtils.isEmpty(this.mCodecName)) {
        return this.mCodecName;
      }
      return "N/A";
    }
    
    public String getFpsInline()
    {
      if ((this.mFpsNum <= 0) || (this.mFpsDen <= 0)) {
        return "N/A";
      }
      return String.valueOf(this.mFpsNum / this.mFpsDen);
    }
    
    public int getInt(String paramString)
    {
      return getInt(paramString, 0);
    }
    
    public int getInt(String paramString, int paramInt)
    {
      paramString = getString(paramString);
      if (TextUtils.isEmpty(paramString)) {
        return paramInt;
      }
      try
      {
        int i = Integer.parseInt(paramString);
        return i;
      }
      catch (NumberFormatException paramString) {}
      return paramInt;
    }
    
    public long getLong(String paramString)
    {
      return getLong(paramString, 0L);
    }
    
    public long getLong(String paramString, long paramLong)
    {
      paramString = getString(paramString);
      if (TextUtils.isEmpty(paramString)) {
        return paramLong;
      }
      try
      {
        long l = Long.parseLong(paramString);
        return l;
      }
      catch (NumberFormatException paramString) {}
      return paramLong;
    }
    
    public String getResolutionInline()
    {
      if ((this.mWidth <= 0) || (this.mHeight <= 0)) {
        return "N/A";
      }
      if ((this.mSarNum <= 0) || (this.mSarDen <= 0)) {
        return String.format(Locale.US, "%d x %d", new Object[] { Integer.valueOf(this.mWidth), Integer.valueOf(this.mHeight) });
      }
      return String.format(Locale.US, "%d x %d [SAR %d:%d]", new Object[] { Integer.valueOf(this.mWidth), Integer.valueOf(this.mHeight), Integer.valueOf(this.mSarNum), Integer.valueOf(this.mSarDen) });
    }
    
    public String getSampleRateInline()
    {
      if (this.mSampleRate <= 0) {
        return "N/A";
      }
      return String.format(Locale.US, "%d Hz", new Object[] { Integer.valueOf(this.mSampleRate) });
    }
    
    public String getString(String paramString)
    {
      return this.mMeta.getString(paramString);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/media/player/FimiMediaMeta.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */